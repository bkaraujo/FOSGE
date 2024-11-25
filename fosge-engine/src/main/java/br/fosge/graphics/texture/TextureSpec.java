package br.fosge.graphics.texture;

import br.fosge.annotation.Specification;

public record TextureSpec (
        boolean mip
) implements Specification {
}
