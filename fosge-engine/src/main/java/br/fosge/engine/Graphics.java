package br.fosge.engine;

import br.fosge.commons.annotation.Facade;
import br.fosge.engine.graphics.Geometry;
import br.fosge.engine.graphics.Shader;

import static br.fosge.engine.runtime.Platform.graphics;

public abstract class Graphics implements Facade {
    private Graphics() { /* Private constructor */ }

    public static void draw(Shader shader, Geometry geometry) {
        graphics.draw(shader, geometry);
    }

}
