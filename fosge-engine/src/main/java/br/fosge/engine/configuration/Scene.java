package br.fosge.engine.configuration;

public record Scene(
        String name,
        Color clearColor,
        Camera camera,
        Layer ... layers
) {
}
