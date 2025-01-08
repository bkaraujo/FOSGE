package br.fosge.engine.runtime.ecs;

import br.fosge.Configuration;
import br.fosge.commons.Logger;
import br.fosge.commons.tools.Meta;
import br.fosge.engine.configuration.Tuple;
import br.fosge.engine.ecs.Component;
import br.fosge.engine.ecs.ComponentType;
import br.fosge.engine.runtime.Threads;
import br.fosge.engine.runtime.ecs.component.AudioSourceComponent;
import br.fosge.engine.runtime.ecs.component.BehaviourComponent;
import br.fosge.engine.runtime.ecs.component.MeshComponent;
import br.fosge.engine.runtime.ecs.component.TransformComponent;
import com.github.f4b6a3.ulid.Ulid;
import com.github.f4b6a3.ulid.UlidCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class ECS {

    private static final Queue<Ulid> entities = new ConcurrentLinkedQueue<>();
    private static final Map<Ulid, Queue<Component>> ofEntities = new ConcurrentHashMap<>();
    private static final Map<ComponentType, Queue<Component>> ofComponents = new ConcurrentHashMap<>();

    public static Ulid entity() {
        final var ulid = UlidCreator.getMonotonicUlid();

        entities.add(ulid);
        ofEntities.put(ulid, new ConcurrentLinkedQueue<>());

        return ulid;
    }

    public static List<Ulid> entities() {
        return entities.stream().toList();
    }

    public static void destroy(Ulid entity) {
        if (Configuration.CHECKS && !entities.contains(entity)) {
            Logger.fatal("Unknown entity %s", entity);
        }

        Logger.debug("Entity %s :: Destroying", entity);
        entities.remove(entity);
        Threads.virtual.submit(() -> {
            Logger.debug("Background entity %s destruction", entity);
            for (final var component : ofEntities.get(entity)) {
                if (!component.terminate()) {
                    Logger.warn("Failed to terminate %s", Meta.fqn(component));
                }

                ofEntities.get(entity).remove(component);
                for (final var type : ComponentType.values()) {
                    if (Meta.assignable(component, type.klass)) {
                        ofComponents.get(type).remove(component);
                    }
                }

                break;
            }
        });
    }

    public static Component attach(Ulid entity, ComponentType type, Tuple ... properties) {
        if (Configuration.CHECKS && !entities.contains(entity)) {
            Logger.fatal("Unknown entity %s", entity);
        }

        final var instance = switch (type) {
            case TRANSFORM_COMPONENT -> TransformComponent.create();
            case MESH_COMPONENT -> MeshComponent.create(properties);
            case AUDIO_SOURCE_COMPONENT -> AudioSourceComponent.create(properties);
            case BEHAVIOUR_COMPONENT -> BehaviourComponent.create(properties);
        };

        Logger.debug("Entity %s :: attaching %s", entity, type);
        ofEntities.get(entity).add(instance);
        ofComponents.computeIfAbsent(type, _ -> new ConcurrentLinkedQueue<>()).add(instance);
        Meta.set(instance, "owner", entity);

        return instance;
    }

    public static Component get(Ulid entity, ComponentType type) {
        if (Configuration.CHECKS && !entities.contains(entity)) {
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
        if (Configuration.CHECKS && !entities.contains(entity)) {
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
        if (Configuration.CHECKS && !entities.contains(entity)) {
            Logger.fatal("Unknown entity %s", entity);
        }

        return ofEntities.get(entity).stream().toList();
    }

    public static void detach(Ulid entity, ComponentType type) {
        if (Configuration.CHECKS && !entities.contains(entity)) {
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
                return (List<T>) ofComponents.get(entry).stream().toList();

            }
        }

        return new ArrayList<>();
    }

}
