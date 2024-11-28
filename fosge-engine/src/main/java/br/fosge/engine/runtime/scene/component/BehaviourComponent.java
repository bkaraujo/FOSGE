package br.fosge.engine.runtime.scene.component;

import br.fosge.engine.ecs.Component;
import br.fosge.tools.Meta;

public abstract class BehaviourComponent extends Component {

    public static BehaviourComponent create(br.fosge.engine.runtime.configuration.api.Component component) {
        final var instance = Meta.instance(BehaviourComponent.class, find("target", component.properties()));
        for (final var property : component.properties()) {
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
