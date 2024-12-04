package br.fosge.engine.configuration;

import br.fosge.graphics.Resolution;

public record Window(
        String title,
        Resolution resolution
) {
}
