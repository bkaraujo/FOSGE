package br.fosge.engine.ecs;

import br.fosge.commons.Logger;
import br.fosge.commons.serializer.Yaml;
import br.fosge.engine.runtime.ecs.ComponentType;
import com.github.f4b6a3.ulid.Ulid;
import com.github.f4b6a3.ulid.UlidCreator;

import java.util.ArrayList;
import java.util.List;

public record Actor (
        Ulid identity,
        Yaml yaml,
        List<Component> components
) {

    public static Actor from(Yaml yaml) {
        if (yaml.contains("identity")) {
            return new Actor(
                    Ulid.from(yaml.asString("identity")),
                    yaml
            );
        }

        return new Actor(UlidCreator.getMonotonicUlid(), yaml);
    }

    private Actor(Ulid identity, Yaml yaml) {
        this(identity, yaml, new ArrayList<>());

        if (!yaml.contains("identity")) {
            yaml.append("identity", identity.toString());
        }

        ECS.prepare(identity);
        for (final var component : yaml.list("components")) {

            ComponentType type;
            try { type = ComponentType.valueOf(component.asString("type")); }
            catch (IllegalArgumentException ignored) {
                Logger.error("Invalid component type: " + component.asString("type"));
                continue;
            }

            final var instance = ECS.attach(identity, type, component.asTuples("properties"));
            if (instance == null) { Logger.error("%s - Failed to attach %s ", identity, type); }
        }
    }
}
