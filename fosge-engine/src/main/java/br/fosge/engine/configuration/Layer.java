package br.fosge.engine.configuration;

public record Layer(
        String name,
        Actor ... actors
) {
}
