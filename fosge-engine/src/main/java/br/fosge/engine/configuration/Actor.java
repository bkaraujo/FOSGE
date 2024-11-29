package br.fosge.engine.configuration;

public record Actor(
        String name,
        Component ... components
) {
}
