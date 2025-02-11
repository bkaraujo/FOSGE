package br.fosge.runtime.renderer;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.commons.MessageBus;
import br.fosge.commons.message.MessageListener;
import br.fosge.commons.message.MessagePipeline;
import br.fosge.engine.platform.window.WindowResizedEvent;
import br.fosge.engine.renderer.backend.FrameBuffer;
import br.fosge.engine.renderer.backend.RenderContext;
import br.fosge.engine.renderer.backend.buffer.FrameBufferSpec;
import br.fosge.runtime.renderer.backend.GLContext;
import br.fosge.runtime.renderer.backend.opengl.GLParser;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.MemoryUtil;

import static br.fosge.RT.yaml;
import static br.fosge.runtime.platform.Bindings.glfw;
import static br.fosge.runtime.platform.Bindings.opengl;
import static br.fosge.runtime.platform.binding.opengl.impl.GL4x.*;

public final class RenderThread implements Runnable {
    public static final RenderContext context = new GLContext();

    private final String modelMatrixName;
    private final String viewProjectionMatrixName;
    private FrameBuffer frameBuffer;

    public RenderThread() {
        modelMatrixName = yaml.contains("engine.renderer.modelMatrix") ?
                yaml.asString("engine.renderer.modelMatrix")
                : "un_model";

        viewProjectionMatrixName = yaml.contains("engine.renderer.viewProjectionMatrix") ?
                yaml.asString("engine.renderer.viewProjectionMatrix")
                : "un_viewProjection";
    }

    @MessageListener
    public MessagePipeline handle(WindowResizedEvent event) {
        // ########################################################
        // Ignore window minimization
        // ########################################################
        if (event.width == event.height) {
            if (event.width == 0) {
                return MessagePipeline.AVAILABLE;
            }
        }
        // ########################################################
        // Ignore window restore
        // ########################################################
        if (frameBuffer != null) {
            if (frameBuffer.size().x() == event.width && frameBuffer.size().y() == event.height) {
                return MessagePipeline.AVAILABLE;
            }
        }
        // ########################################################
        // Recreate framebuffer
        // ########################################################
        return Renderer.submit(() -> {
            if (frameBuffer != null) { frameBuffer.terminate(); }

            frameBuffer = context.frameBuffer();
            if (!frameBuffer.configure(new FrameBufferSpec(event.size(), false))) {
                Logger.fatal("Failed to configure frame buffer");
            }

            opengl.glViewport(0, 0, event.width, event.height);
            return MessagePipeline.AVAILABLE;
        });
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

        MessageBus.subscribe(this);

        frameBuffer = context.frameBuffer();
        final var spec = new FrameBufferSpec(RT.Window.size, false);

        if (!frameBuffer.configure(spec)) {
            Logger.fatal("Failed to configure frame buffer");
        }

        while (true) {
            performRenderTasks();
            if (RendererShared.renderGraph == null) continue;

            try {
                RendererShared.lock.lock();
                performRenderPass(frameBuffer);

                opengl.glBlitNamedFramebuffer(frameBuffer.handle(), 0,
                        0, 0, frameBuffer.size().x(), frameBuffer.size().y(),
                        0, 0, RT.Window.size.x(), RT.Window.size.y(),
                        GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT | GL_STENCIL_BUFFER_BIT,
                        GL_NEAREST
                );
            } finally {
                RendererShared.renderGraph = null;

                glfw.glfwSwapBuffers(RT.Window.handle);
                RendererShared.lock.unlock();
            }
        }
    }

    private void performRenderTasks() {
        RenderTask<?> task;
        while ((task = RendererShared.tasks.poll()) != null) {
            task.execute();
        }
    }

    private void performRenderPass(FrameBuffer frameBuffer) {
        frameBuffer.bind();

        final var renderTarget = RendererShared.renderGraph;
        final var ofShaders = renderTarget.ofShader();
        for (final var entry : ofShaders.entrySet()) {
            final var shader = entry.getKey();
            shader.bind();
            shader.uniform(viewProjectionMatrixName, RendererShared.viewProjectionMatrix);

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
    }
}
