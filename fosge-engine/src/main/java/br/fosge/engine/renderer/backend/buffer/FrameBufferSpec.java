package br.fosge.engine.renderer.backend.buffer;

import br.fosge.commons.annotation.Specification;
import org.joml.Vector2ic;

public record FrameBufferSpec (
        Vector2ic size,
        boolean hdr    // GL_RGBA8 / GL_RGBA32F
) implements Specification {
}
