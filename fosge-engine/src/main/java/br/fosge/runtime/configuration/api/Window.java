package br.fosge.runtime.configuration.api;

import br.fosge.graphics.Resolution;

public record Window(
        String title,
        Resolution resolution
) {
}
