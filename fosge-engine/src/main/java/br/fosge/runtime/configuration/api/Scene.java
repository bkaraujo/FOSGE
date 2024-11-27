package br.fosge.runtime.configuration.api;

public record Scene(
        String name,
        Color clearColor,
        Layer ... layers
) {
}
