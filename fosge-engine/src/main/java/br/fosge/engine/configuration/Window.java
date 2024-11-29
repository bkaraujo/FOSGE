package br.fosge.engine.configuration;

import br.fosge.engine.graphics.Resolution;

public record Window(
        String title,
        Resolution resolution
) {
}
