package br.fosge.engine.renderer.backend;

import br.fosge.commons.annotation.Lifecycle;

public interface RenderContext extends Lifecycle {

    FrameBuffer frameBuffer();
    Shader shader();
    Geometry geometry();
    Texture2D texture2d();

}
