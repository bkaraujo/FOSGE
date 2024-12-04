package br.fosge.engine.platform.window;

import br.fosge.annotation.Specification;
import br.fosge.graphics.Resolution;

public record WindowSpec(
        String title,
        Resolution resolution
) implements Specification {
}
