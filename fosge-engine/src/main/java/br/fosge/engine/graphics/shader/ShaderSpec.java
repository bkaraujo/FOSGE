package br.fosge.engine.graphics.shader;

import br.fosge.commons.Logger;
import br.fosge.commons.annotation.Specification;

import javax.annotation.Nonnull;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public record ShaderSpec (
        Path script,
        List<ShaderSource> sources
) implements Specification {

    public ShaderSpec(@Nonnull Path desired) {
        this(desired, new ArrayList<>());
   }

    public List<ShaderSource> sources() {
        if (!sources.isEmpty()) return sources;

        final String payload;
        try {
            Logger.debug("Reading %s", script);
            payload = Files.readString(script);
            if (payload == null || payload.isEmpty()) {
                Logger.warn("Shader script is empty: %s", script);
                return sources;
            }
        } catch (Throwable throwable) {
            Logger.error("Failed to read %s", script.toString());
            return sources;
        }

        final var tokens = payload.split("#shader");
        for (final var token : tokens) {
            final var trimmed = token.trim();

            for (final var constant : ShaderStage.values()) {
                if (trimmed.startsWith(constant.name().toLowerCase())) {
                    sources.add(new ShaderSource(
                            constant,
                            trimmed.substring(constant.name().length() + 1)
                    ));
                }
            }
        }

        return sources;
    }

    public String toString() {
        return script.toString();
    }
}
