package br.fosge.engine.platform.graphics;

import br.fosge.annotation.Specification;

public record GraphicsSpec (
        boolean vsync
) implements Specification {
}
