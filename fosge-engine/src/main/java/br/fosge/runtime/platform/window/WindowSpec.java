package br.fosge.runtime.platform.window;

import br.fosge.annotation.Specification;
import br.fosge.graphics.Resolution;

public record WindowSpec(
        String title,
        Resolution resolution
) implements Specification {
}
