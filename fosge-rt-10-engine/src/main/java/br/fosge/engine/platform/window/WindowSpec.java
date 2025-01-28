package br.fosge.engine.platform.window;

import br.fosge.commons.annotation.Specification;
import br.fosge.commons.graphics.Resolution;

public record WindowSpec(
        String title,
        Resolution resolution
) implements Specification {
}
