package br.fosge.engine.ecs;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.commons.Meta;
import br.fosge.commons.Tasks;
import br.fosge.commons.Tuple;
import br.fosge.commons.annotation.Facade;
import br.fosge.engine.runtime.ecs.ComponentType;
import br.fosge.engine.runtime.ecs.component.AudioSourceComponent;
import br.fosge.engine.runtime.ecs.component.MeshComponent;
import br.fosge.engine.runtime.ecs.component.TransformComponent;
import com.github.f4b6a3.ulid.Ulid;
import com.github.f4b6a3.ulid.UlidCreator;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import static br.fosge.RT.Application.*;

public abstract class ECS implements Facade {
    private ECS(){}

    public static Ulid entity() {
        final var ulid = UlidCreator.getMonotonicUlid();
        prepare(ulid);
        return ulid;
    }

    public static void prepare(Ulid ulid) {
        entities.add(ulid);
        ofEntities.put(ulid, new ConcurrentLinkedQueue<>());
    }

    public static List<Ulid> entities() {
        return entities.stream().toList();
    }

    public static void destroy(Ulid entity) {
        if (RT.debug && !entities.contains(entity)) {
            Logger.fatal("Unknown entity %s", entity);
        }

        Logger.debug("Entity %s :: Destroying", entity);
        entities.remove(entity);
        Tasks.concurrent(() -> {
            Logger.debug("Background entity %s destruction", entity);
            for (final Component component : ofEntities.get(entity)) {
                if (!component.terminate()) {
                    Logger.warn("Failed to terminate %s", Meta.fqn(component));
                }

                ofEntities.get(entity).remove(component);
                for (final ComponentType type : ComponentType.values()) {
                    if (Meta.assignable(component, type.klass)) {
                        ofComponents.get(type).remove(component);
                    }
                }

                break;
            }
        });
    }

    public static Component attach(Ulid entity, ComponentType type, Tuple... properties) {
        if (RT.debug && !entities.contains(entity)) {
            Logger.fatal("Unknown entity %s", entity);
        }

        final var instance = switch (type) {
            case TRANSFORM_COMPONENT -> TransformComponent.create(properties);
            case MESH_COMPONENT -> MeshComponent.create(properties);
            case AUDIO_SOURCE_COMPONENT -> AudioSourceComponent.create(properties);
            case BEHAVIOUR_COMPONENT -> BehaviourComponent.create(properties);
        };

        if (instance == null) { return null; }
        Meta.set(instance, "owner", entity);

        Logger.debug("Entity %s :: attaching %s", instance.owner, type);
        ofEntities.get(entity).add(instance);
        ofComponents.computeIfAbsent(type, _ -> new ConcurrentLinkedQueue<>()).add(instance);

        return instance;
    }

    public static Component get(Ulid entity, ComponentType type) {
        if (RT.debug && !entities.contains(entity)) {
            Logger.fatal("Unknown entity %s", entity);
        }

        for (final var component : ofEntities.get(entity)) {
            if (Meta.assignable(component, type.klass)) {
                return component;
            }
        }

        return null;
    }

    public static <T> T get(Ulid entity, Class<T> type) {
        if (RT.debug && !entities.contains(entity)) {
            Logger.fatal("Unknown entity %s", entity);
        }

        for (final var component : ofEntities.get(entity)) {
            if (Meta.assignable(component, type)) {
                return Meta.cast(component, type);
            }
        }

        return null;
    }

    public static List<Component> list(Ulid entity) {
        if (RT.debug && !entities.contains(entity)) {
            Logger.fatal("Unknown entity %s", entity);
        }

        return ofEntities.get(entity).stream().toList();
    }

    public static void detach(Ulid entity, ComponentType type) {
        if (RT.debug && !entities.contains(entity)) {
            Logger.fatal("Unknown entity %s", entity);
        }

        Logger.debug("Entity %s :: detaching %s", entity, type);
        for (final var component : ofEntities.get(entity)) {
            if (Meta.assignable(component, type.klass)) {
                ofEntities.get(entity).remove(component);
                if (!component.terminate()) {
                    Logger.warn("Failed to terminate %s", Meta.fqn(component));
                }

                break;
            }
        }

        for (final var component : ofComponents.get(type)) {
            if (component.owner.equals(entity)) {
                ofComponents.get(type).remove(component);
                break;
            }
        }
    }

    public static <T> List<T> list(Class<T> type) {
        for (final var entry : ComponentType.values()) {
            if (Meta.assignable(type, entry.klass)) {
                return (List<T>) ofComponents.getOrDefault(entry, new ArrayDeque<>()).stream().toList();

            }
        }

        return new ArrayList<>();
    }

    public static void attach(System system) {
        systems.add(system);
    }

    public static void detach(System system) {
        systems.remove(system);
    }
}
