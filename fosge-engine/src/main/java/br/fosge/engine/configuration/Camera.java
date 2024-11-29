package br.fosge.engine.configuration;

public record Camera(
        float left,
        float right,
        float bottom,
        float top,
        float near,
        float far
) {
}
