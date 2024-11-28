package br.fosge.engine.platform.window;

import br.fosge.engine.annotation.Specification;
import br.fosge.engine.graphics.Resolution;

public record WindowSpec(
        String title,
        Resolution resolution
) implements Specification {
}
