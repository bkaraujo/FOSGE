package br.fosge.engine.runtime.configuration.api;

public record Layer(
        String name,
        Actor ... actors
) {
}
