package br.fosge.engine.configuration;

public record Component(
        String type,
        Tuple ... properties
) {
}
