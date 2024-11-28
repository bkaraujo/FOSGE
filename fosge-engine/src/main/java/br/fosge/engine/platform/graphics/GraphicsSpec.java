package br.fosge.engine.platform.graphics;

import br.fosge.engine.annotation.Specification;

public record GraphicsSpec (
        boolean vsync
) implements Specification {
}
