package br.fosge.engine.runtime.configuration.api;

import br.fosge.engine.graphics.Resolution;

public record Window(
        String title,
        Resolution resolution
) {
}
