package br.fosge.engine.graphics.shader;

import br.fosge.commons.annotation.Specification;

import java.io.File;

public record ShaderSpec (
    ShaderSource ... source
) implements Specification {
    public String toString() {
        if (source == null) return "ShaderSpec: empty";
        if (source.length == 0) return "ShaderSpec: empty";

        final var result = new StringBuilder();
        for (var source : source) {
            result.append(source.stage()).append(": ").append(source.name()).append(File.separator);
        }

        return result.toString();
    }
}
