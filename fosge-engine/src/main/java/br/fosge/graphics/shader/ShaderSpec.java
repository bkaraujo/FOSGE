package br.fosge.graphics.shader;

import br.fosge.annotation.Specification;

public record ShaderSpec (
    ShaderSource ... source
) implements Specification {
}
