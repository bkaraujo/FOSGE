package br.fosge.engine.graphics.shader;

import br.fosge.commons.Logger;
import br.fosge.commons.annotation.Specification;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public record ShaderSpec (
        Path shaderFile,
    List<ShaderSource> sources
) implements Specification {
    public ShaderSpec(Path shaderFile) {
        this(shaderFile, new ArrayList<>());

        try {
            final var payload = Files.readString(shaderFile);
            final var tokens = payload.split("//");
            for (final var token : tokens) {
                final var trimmed = token.trim();
                if (trimmed.startsWith("vertex")) { sources.add(new ShaderSource(ShaderStage.VERTEX, trimmed.substring(6))); }
                if (trimmed.startsWith("fragment")) { sources.add(new ShaderSource(ShaderStage.FRAGMENT, trimmed.substring(8))); }
            }

        } catch (Throwable throwable) {
            Logger.error("Failed to read %s", shaderFile.toString());
        }
    }

    public String toString() {
        if (sources.isEmpty()) return "ShaderSpec: empty";
        return shaderFile.toString();
    }
}
