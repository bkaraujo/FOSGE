package br.fosge.engine.graphics.texture;

import br.fosge.commons.annotation.Specification;

import java.nio.file.Path;

public record TextureSpec (
        Path path,
        int mip,
        PixelFormat format,
        PixelFormat storageFormat
) implements Specification {
}
