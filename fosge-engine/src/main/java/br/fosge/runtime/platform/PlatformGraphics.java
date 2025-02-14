package br.fosge.runtime.platform;

import br.fosge.commons.message.MessageListener;
import br.fosge.commons.message.MessagePipeline;
import br.fosge.engine.platform.window.WindowResizedEvent;
import br.fosge.runtime.renderer.Renderer;
import org.joml.Vector4fc;

import java.util.concurrent.Callable;

import static br.fosge.runtime.platform.Bindings.opengl;
import static br.fosge.runtime.platform.binding.OpenGL.*;

public final class PlatformGraphics {

    @MessageListener
    public MessagePipeline handle(WindowResizedEvent event) {
        return Renderer.submit(() -> {
            opengl.glViewport(0, 0, event.width, event.height);
            return MessagePipeline.CONSUMED;
        });
    }
    public void clear() {
        Renderer.submit((Callable<Void>) () -> {
            opengl.glClear(GL_DEPTH_BUFFER_BIT | GL_COLOR_BUFFER_BIT | GL_STENCIL_BUFFER_BIT);
            return null;
        });
    }

    public void clearColor(Vector4fc color) {
        Renderer.submit((Callable<Void>) () -> {
            opengl.glClearColor(color.x(), color.y(), color.z(), color.w());
            return null;
        });
    }

}
