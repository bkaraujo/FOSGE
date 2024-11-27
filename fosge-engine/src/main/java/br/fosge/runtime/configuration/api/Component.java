package br.fosge.runtime.configuration.api;

public record Component(
        String type,
        Tuple ... properties
) {
}
