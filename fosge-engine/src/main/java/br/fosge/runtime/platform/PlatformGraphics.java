package br.fosge.runtime.platform;

import br.fosge.commons.annotation.Lifecycle;
import br.fosge.commons.message.MessageListener;
import br.fosge.commons.message.MessagePipeline;
import br.fosge.engine.platform.window.WindowResizedEvent;
import br.fosge.runtime.renderer.RenderThread;
import org.joml.Vector4fc;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.GLDebugMessageCallback;

import java.util.concurrent.Callable;

import static br.fosge.runtime.platform.Bindings.opengl;
import static br.fosge.runtime.platform.binding.OpenGL.*;

public final class PlatformGraphics implements Lifecycle {

    private GLCapabilities capabilities;
    private GLDebugMessageCallback debugCallback;



    @MessageListener
    public MessagePipeline handle(WindowResizedEvent event) {
        return RenderThread.submit(() -> {
            opengl.glViewport(0, 0, event.width, event.height);
            return MessagePipeline.CONSUMED;
        });
    }
    public void clear() {
        RenderThread.submit((Callable<Void>) () -> {
            opengl.glClear(GL_DEPTH_BUFFER_BIT | GL_COLOR_BUFFER_BIT | GL_STENCIL_BUFFER_BIT);
            return null;
        });
    }

    public void clearColor(Vector4fc color) {
        RenderThread.submit((Callable<Void>) () -> {
            opengl.glClearColor(color.x(), color.y(), color.z(), color.w());
            return null;
        });
    }

}
