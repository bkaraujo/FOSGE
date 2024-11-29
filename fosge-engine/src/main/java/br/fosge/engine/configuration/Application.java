package br.fosge.engine.configuration;

import br.fosge.Version;

public record Application(
        String name,
        Version version,
        Window window,
        Graphics graphics,
        Scene ... scenes
) {
}
