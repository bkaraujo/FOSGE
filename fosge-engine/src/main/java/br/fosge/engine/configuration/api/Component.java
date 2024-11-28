package br.fosge.engine.configuration.api;

public record Component(
        String type,
        Tuple ... properties
) {
}
