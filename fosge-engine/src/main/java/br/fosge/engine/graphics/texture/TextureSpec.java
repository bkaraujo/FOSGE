package br.fosge.engine.graphics.texture;

import br.fosge.commons.annotation.Specification;

public record TextureSpec (
        boolean mip
) implements Specification {
}
