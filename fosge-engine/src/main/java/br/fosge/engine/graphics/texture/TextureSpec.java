package br.fosge.engine.graphics.texture;

import br.fosge.commons.annotation.Specification;
import br.fosge.engine.graphics.DataType;

import java.nio.file.Path;

public record TextureSpec (
        Path path,
        int mip,
        PixelFormat format,
        PixelFormat storageFormat,
        DataType dataType,
        boolean verticalFlip
) implements Specification {
}
