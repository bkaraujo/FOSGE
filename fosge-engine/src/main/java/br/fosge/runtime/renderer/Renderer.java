package br.fosge.runtime.renderer;

import br.fosge.commons.annotation.Facade;
import br.fosge.engine.renderer.TransformComponent;
import br.fosge.engine.renderer.frontend.CameraComponent;
import br.fosge.engine.renderer.frontend.MeshComponent;
import br.fosge.runtime.renderer.frontend.Mesh;
import br.fosge.runtime.scene.Scene;
import org.joml.Vector3f;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;

public abstract class Renderer implements Facade {
    private Renderer(){}

    // Camera buffer
    private static final Vector3f cameraPos = new Vector3f();
    private static final Vector3f cameraRot = new Vector3f(-1 ,-1, -1);

    // Render data
    private static final Semaphore semaphore = new Semaphore(1);

    public static void beginFrame(Scene scene) {
        final var camera = scene.camera();
        if (!camera.transform().position.equals(cameraPos) || !camera.transform().rotation.equals(cameraRot)) {
            cameraPos.set(camera.transform().position);
            cameraRot.set(camera.transform().rotation);

            final var component = camera.get(CameraComponent.class);
            RendererShared.viewProjectionMatrix
                    .set(component.projection)
                    .mul(component.view
                            .translate(cameraPos)
                            .rotateZ(cameraRot.z)
                            .invert()
                    );
        }

        RendererShared.frameGraph = new RenderGraph(RendererShared.viewProjectionMatrix);
    }

    public static <T> T submit(Callable<T> callable) {
        while (!semaphore.tryAcquire()) ;

        try {
            final var task = RenderTask.of(callable);
            RendererShared.tasks.add(task);
            while (!task.done.getAcquire()) ;

            return task.result();
        } finally {
            semaphore.release();
        }
    }

    public static void submit(final TransformComponent transform, final MeshComponent mesh) {
        RendererShared.frameGraph
                .ofShader()
                .computeIfAbsent(mesh.shader, ignored -> new ArrayList<>())
                .add(new Mesh(transform.matrix(), mesh.geometry, mesh.textures));
    }

    public static void endFrame() {
        RendererShared.renderGraph = RendererShared.frameGraph;
        RendererShared.frameGraph = null;
    }

}
