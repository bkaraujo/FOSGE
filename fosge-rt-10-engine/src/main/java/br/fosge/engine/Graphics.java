package br.fosge.engine;

import br.fosge.commons.annotation.Facade;
import br.fosge.engine.graphics.Geometry;
import br.fosge.engine.graphics.Shader;
import br.fosge.engine.graphics.Texture;

import static br.fosge.engine.runtime.Platform.graphics;

public abstract class Graphics implements Facade {
    private Graphics() { /* Private constructor */ }

    public static void draw(Shader shader, Geometry geometry, Texture texture) {
        draw(shader, geometry, texture, 0);
    }

    public static void draw(Shader shader, Geometry geometry, Texture texture, int textureUnit) {
        shader.bind();
        geometry.bind();

        if (texture != null) {
            texture.bind(textureUnit);
        }

        graphics.draw(shader, geometry);
    }

}
