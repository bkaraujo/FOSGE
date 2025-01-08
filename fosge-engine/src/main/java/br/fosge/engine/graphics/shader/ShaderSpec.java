package br.fosge.engine.graphics.shader;

import br.fosge.commons.annotation.Specification;

public record ShaderSpec (
    ShaderSource ... source
) implements Specification {
}
