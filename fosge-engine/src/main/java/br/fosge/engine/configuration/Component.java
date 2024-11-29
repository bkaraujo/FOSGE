package br.fosge.engine.configuration;

import br.fosge.engine.ecs.ComponentType;

public record Component(
        ComponentType type,
        Tuple ... properties
) {
}
