package br.fosge.engine.renderer.backend;

import br.fosge.commons.annotation.Configurable;
import org.joml.Vector2ic;
import org.joml.Vector4fc;

public interface FrameBuffer extends GraphicsObject, Configurable {

    Vector2ic size();
    void unbind();

    void clear(Vector4fc color);
    int colorAttachment();
    int depthAttachment();

}
