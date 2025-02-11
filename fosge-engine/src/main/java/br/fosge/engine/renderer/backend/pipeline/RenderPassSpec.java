package br.fosge.engine.renderer.backend.pipeline;

import br.fosge.engine.renderer.backend.FrameBuffer;

public record RenderPassSpec(
        FrameBuffer target
) {
}
