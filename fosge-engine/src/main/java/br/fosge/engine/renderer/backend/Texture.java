package br.fosge.engine.renderer.backend;

import br.fosge.engine.renderer.backend.texture.TextureFiltering;
import br.fosge.engine.renderer.backend.texture.TextureSpec;
import br.fosge.engine.renderer.backend.texture.TextureWrapping;

import java.nio.file.Path;

public interface Texture extends GraphicsObject {

    Path path();
    void bind(int unit);
    void wrapping(TextureWrapping s, TextureWrapping t);
    void filtering(TextureFiltering min, TextureFiltering mag);
    boolean load(TextureSpec spec);

}
