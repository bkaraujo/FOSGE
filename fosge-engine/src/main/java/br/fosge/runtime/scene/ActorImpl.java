package br.fosge.runtime.scene;

import br.fosge.commons.Logger;
import br.fosge.commons.Meta;
import br.fosge.commons.serializer.Yaml;
import br.fosge.engine.ecs.*;
import br.fosge.engine.renderer.TransformComponent;
import com.github.f4b6a3.ulid.Ulid;

import java.util.ArrayList;
import java.util.List;

record ActorImpl(
        Ulid identity,
        Yaml yaml,
        List<Component> components
) implements Actor {

    ActorImpl(Ulid identity, Yaml yaml) {
        this(identity, yaml, new ArrayList<>());
        if (!yaml.contains("identity")) {
            yaml.append("identity", identity.toString());
        }
    }

    @Override
    public boolean initialize() {
        Logger.debug("%s :: Initializing %s", identity, name());
        ECS.prepare(identity, name());
        for (final var component : yaml.list("components")) {

            ComponentType type;
            try { type = ComponentType.valueOf(component.asString("type")); }
            catch (IllegalArgumentException ignored) {
                Logger.error("Invalid component type: " + component.asString("type"));
                continue;
            }

            final var instance = ECS.attach(identity, type, component.asTuples("properties"));
            if (instance == null) { return false; }
            if(!instance.initialize()) {
                Logger.error("Failed to initialize %s's %s component.", identity, type);
                return false;
            }
        }

        Component transform = ECS.get(identity, TransformComponent.class);
        if (transform == null) { transform = ECS.attach(identity, ComponentType.TRANSFORM_COMPONENT); }

        for (final var component : ECS.list(identity)) {
            if (Meta.assignable(component, BehaviourComponent.class)) {
                final var behaviour = Meta.cast(component, BehaviourComponent.class);
                Meta.set(behaviour, "transform", transform);
            }
        }

        return true;
    }

    public String name() {
        final var name = yaml.asString("name");
        return name != null ? name : "Actor";
    }

    @Override
    public boolean terminate() {
        ECS.destroy(identity);
        return true;
    }

    @Override
    public String toString() {
        return  identity.toString() + ": <" + name() + ">";
    }
}
