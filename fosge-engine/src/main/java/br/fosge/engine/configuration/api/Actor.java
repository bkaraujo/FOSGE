package br.fosge.engine.configuration.api;

public record Actor(
        String name,
        Component ... components
) {
}
