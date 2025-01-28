package br.fosge.engine.ecs;

import br.fosge.commons.Meta;
import br.fosge.commons.Tuple;
import br.fosge.engine.renderer.OnFrame;
import br.fosge.engine.runtime.ecs.ComponentType;

public abstract class BehaviourComponent extends Component implements OnFrame {
    public static final ComponentType type = ComponentType.BEHAVIOUR_COMPONENT;

    public static BehaviourComponent create(Tuple... properties) {
        final var instance = Meta.instance(BehaviourComponent.class, find("target", properties));
        for (final var property : properties) {
            if (!property.name().contains(".")) continue;
            final var tokens = property.name().split("\\.");
            try {
                if (property.value().contains(".")) {
                    Meta.set(instance, tokens[1], Float.parseFloat(property.value()));
                } else {
                    Meta.set(instance, tokens[1], Integer.parseInt(property.value()));
                }
            } catch (final NumberFormatException e) {
                Meta.set(instance, tokens[1], property.value());
            }
        }

        return instance;
    }
}
