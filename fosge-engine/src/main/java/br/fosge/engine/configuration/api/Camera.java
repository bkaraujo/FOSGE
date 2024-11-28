package br.fosge.engine.configuration.api;

public record Camera(
        float left,
        float right,
        float bottom,
        float top,
        float near,
        float far
) {
}
