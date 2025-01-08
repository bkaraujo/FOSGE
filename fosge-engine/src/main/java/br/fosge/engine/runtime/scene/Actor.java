package br.fosge.engine.runtime.scene;

import br.fosge.commons.Logger;
import br.fosge.commons.annotation.Lifecycle;
import br.fosge.commons.tools.Meta;
import br.fosge.engine.ecs.Component;
import br.fosge.engine.ecs.ComponentType;
import br.fosge.engine.runtime.application.OnFrame;
import br.fosge.engine.runtime.ecs.ECS;
import br.fosge.engine.runtime.ecs.component.TransformComponent;
import com.github.f4b6a3.ulid.Ulid;

import java.util.Arrays;

public final class Actor implements Lifecycle, OnFrame {

    public final Ulid identity;
    public final Layer layer;
    public final String name;

    private Actor(Layer layer, Ulid identity, String name) {
        this.layer = layer;
        this.identity = identity;
        this.name = name;
    }

    public static Actor create(Layer layer, br.fosge.engine.configuration.Actor desired) {
        final var actor = new Actor(layer, ECS.entity(), desired.name());
        ECS.attach(actor.identity, TransformComponent.type);

        Arrays
                .stream(desired.components())
                .forEach(component -> ECS.attach(actor.identity, component.type(), component.properties()));

        return actor;
    }

    public <T extends Component> T get(Class<T> type) {
        for (final var entry : ComponentType.values()) {
            if (entry.klass.equals(type)) {
                final var instance = ECS.get(identity, entry);
                return Meta.cast(instance, type);
            }
        }

        return null;
    }

    @Override
    public boolean initialize() {
        Logger.debug("Initializing actor: %s", name);
        for(final var component : ECS.list(identity)) {
            if (!component.initialize()) {
                Logger.error("Failed to initialize component %s", Meta.fqn(component));
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean terminate() {
        Logger.debug("Terminating actor: %s", name);
        ECS.destroy(identity);

        return true;
    }
}
