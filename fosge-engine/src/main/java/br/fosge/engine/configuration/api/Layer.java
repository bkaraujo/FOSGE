package br.fosge.engine.configuration.api;

public record Layer(
        String name,
        Actor ... actors
) {
}
