package br.fosge.engine.graphics;

import br.fosge.engine.graphics.texture.TextureFiltering;
import br.fosge.engine.graphics.texture.TextureWrapping;

import java.nio.file.Path;

public interface Texture extends GraphicsObject {

    Path path();
    void bind(int unit);
    void wrapping(TextureWrapping s, TextureWrapping t);
    void filtering(TextureFiltering min, TextureFiltering mag);

}
