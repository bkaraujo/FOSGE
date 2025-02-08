package br.fosge.runtime.renderer;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.engine.renderer.TransformComponent;
import br.fosge.engine.renderer.backend.RenderContext;
import br.fosge.engine.renderer.frontend.CameraComponent;
import br.fosge.engine.renderer.frontend.MeshComponent;
import br.fosge.runtime.renderer.backend.GLContext;
import br.fosge.runtime.renderer.backend.opengl.GLParser;
import br.fosge.runtime.renderer.frontend.Mesh;
import br.fosge.runtime.scene.Scene;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.MemoryUtil;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static br.fosge.RT.yaml;
import static br.fosge.runtime.platform.Bindings.glfw;
import static br.fosge.runtime.platform.Bindings.opengl;

public final class RenderThread implements Runnable {
    public static final RenderContext context = new GLContext();

    // Camera buffer
    private static final Vector3f cameraPos = new Vector3f();
    private static final Vector3f cameraRot = new Vector3f(-1 ,-1, -1);
    private static final Matrix4f viewProjectionMatrix = new Matrix4f();

    // Shader parameters
    private final String modelMatrixName;
    private final String viewProjectionMatrixName;

    // Render data
    private static RenderGraph graph;
    private static RenderGraph target;
    private static final Queue<DelayedTask<?>> immediate = new ConcurrentLinkedQueue<>();

    public static final Lock lock = new ReentrantLock();
    private static final Semaphore semafore = new Semaphore(1);

    public RenderThread() {
        modelMatrixName = yaml.contains("engine.renderer.modelMatrix") ?
                yaml.asString("engine.renderer.modelMatrix")
                : "un_model";

        viewProjectionMatrixName = yaml.contains("engine.renderer.viewProjectionMatrix") ?
                yaml.asString("engine.renderer.viewProjectionMatrix")
                : "un_viewProjection";
    }

    public static void beginFrame(Scene scene) {
        final var camera = scene.camera();
        if (!camera.transform().position.equals(cameraPos) || !camera.transform().rotation.equals(cameraRot)) {
            cameraPos.set(camera.transform().position);
            cameraRot.set(camera.transform().rotation);

            final var component = camera.get(CameraComponent.class);
            viewProjectionMatrix
                    .set(component.projection)
                    .mul(component.view
                            .translate(cameraPos)
                            .rotateZ(cameraRot.z)
                            .invert()
                    );
        }


        graph = new RenderGraph(viewProjectionMatrix);
    }

    public static <T> T submit(Callable<T> callable) {
        // Awaits for the lock
        while (!semafore.tryAcquire()) ;

        try {
            final var task = DelayedTask.of(callable);
            immediate.add(task);
            while (!task.done.getAcquire()) ;

            return task.result();
        } finally {
            semafore.release();
        }
    }

    public static void submit(final TransformComponent transform, final MeshComponent mesh) {
        graph
                .ofShader()
                .computeIfAbsent(mesh.shader, ignored -> new ArrayList<>())
                .add(new Mesh(transform.matrix(), mesh.geometry, mesh.textures));
    }

    public static void endFrame() {
        target = graph;
        graph = null;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("FOSGE::Renderer");
        if (glfw.glfwGetCurrentContext() == MemoryUtil.NULL) {
            glfw.glfwMakeContextCurrent(RT.Window.handle);
            GL.createCapabilities();
        }

        if (!context.initialize()) {
            Logger.error("Failed to initialize Render API");
        }

        while (true) {
            // ##############################################
            // Perform general GLTasks
            // ##############################################
            DelayedTask<?> task;
            while ((task = immediate.poll()) != null) {
                task.execute();
            }

            // ##############################################
            // Actual rendering
            // ##############################################
            if (target == null) continue;

            lock.lock();
            try {
                final var renderTarget = target;
                final var ofShaders = renderTarget.ofShader();
                for (final var entry : ofShaders.entrySet()) {
                    final var shader = entry.getKey();
                    shader.bind();
                    shader.uniform(viewProjectionMatrixName, viewProjectionMatrix);

                    for (final var mesh : entry.getValue()) {
                        shader.uniform(modelMatrixName, mesh.model());
                        for (int i = 0; i < mesh.textures().size(); ++i) {
                            mesh.textures().get(i).bind(i);
                        }

                        final var geometry = mesh.geometry();

                        geometry.bind();
                        opengl.glDrawElements(
                                GLParser.parse(geometry.mode()),
                                geometry.elements(),
                                GLParser.parse(geometry.indexType()),
                                0
                        );
                    }
                }
            } finally {
                target = null;
                glfw.glfwSwapBuffers(RT.Window.handle);
                lock.unlock();
            }
        }
    }
}
