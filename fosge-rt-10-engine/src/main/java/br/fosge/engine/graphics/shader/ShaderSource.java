package br.fosge.engine.graphics.shader;

public record ShaderSource(
        ShaderStage stage,
        String name,
        String script
) {
}
