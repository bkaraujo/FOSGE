package br.fosge.engine.configuration;

import br.fosge.commons.graphics.Resolution;

public record Window(
        String title,
        Resolution resolution
) {
}
