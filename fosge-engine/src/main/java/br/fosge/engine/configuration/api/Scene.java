package br.fosge.engine.configuration.api;

public record Scene(
        String name,
        Color clearColor,
        Camera camera,
        Layer ... layers
) {
}
