package br.fosge.engine.runtime.configuration.api;

public record Component(
        String type,
        Tuple ... properties
) {
}
