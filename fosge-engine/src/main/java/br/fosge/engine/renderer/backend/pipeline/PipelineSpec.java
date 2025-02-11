package br.fosge.engine.renderer.backend.pipeline;

public record PipelineSpec(
        RenderPassSpec ... renderPasses
) {
}
