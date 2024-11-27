package br.fosge.runtime.configuration.api;

public record Actor(
        String name,
        Component ... components
) {
}
