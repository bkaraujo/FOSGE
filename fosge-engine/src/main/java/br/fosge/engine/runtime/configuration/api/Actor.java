package br.fosge.engine.runtime.configuration.api;

public record Actor(
        String name,
        Component ... components
) {
}
