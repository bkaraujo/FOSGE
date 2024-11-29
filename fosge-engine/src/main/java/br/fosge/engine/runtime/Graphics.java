package br.fosge.engine.runtime;

import br.fosge.engine.annotation.Facade;
import br.fosge.engine.graphics.Geometry;
import br.fosge.engine.graphics.Shader;
import br.fosge.engine.graphics.Texture;

import static br.fosge.engine.runtime.Platform.graphics;

public abstract class Graphics implements Facade {
    private Graphics() { /* Private constructor */ }

    public static Shader shader() {
        return graphics.shader();
    }

    public static Geometry geometry() {
        return graphics.geometry();
    }

    public static void clearColor(float red, float green, float blue) {
        clearColor(red, green, blue, 1.0f);
    }

    public static void clearColor(float red, float green, float blue, float alpha) {
        graphics.clearColor(red, green, blue, alpha);
    }

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
