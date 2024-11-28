package br.fosge.engine.runtime.platform.window;

import br.fosge.engine.annotation.Specification;
import br.fosge.engine.graphics.Resolution;

public record WindowSpec(
        String title,
        Resolution resolution
) implements Specification {
}
