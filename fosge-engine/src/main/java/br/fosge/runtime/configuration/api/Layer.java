package br.fosge.runtime.configuration.api;

public record Layer(
        String name,
        Actor ... actors
) {
}
