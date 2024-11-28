package br.fosge.engine.graphics.shader;

import br.fosge.engine.annotation.Specification;

public record ShaderSpec (
    ShaderSource ... source
) implements Specification {
}
