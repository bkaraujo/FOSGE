package br.fosge.engine.configuration.api;

import br.fosge.engine.graphics.Resolution;

public record Window(
        String title,
        Resolution resolution
) {
}
