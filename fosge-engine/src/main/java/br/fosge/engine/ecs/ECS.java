package br.fosge.engine.ecs;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.commons.Meta;
import br.fosge.commons.Tasks;
import br.fosge.commons.Tuple;
import br.fosge.commons.annotation.Facade;
import br.fosge.engine.physics.RigidBodyComponent;
import br.fosge.engine.physics.SoftBodyComponent;
import br.fosge.engine.runtime.ecs.ComponentType;
import br.fosge.engine.runtime.ecs.component.AudioSourceComponent;
import br.fosge.engine.runtime.ecs.component.MeshComponent;
import br.fosge.engine.runtime.ecs.component.TransformComponent;
import com.github.f4b6a3.ulid.Ulid;
import com.github.f4b6a3.ulid.UlidCreator;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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

    public static void prepare(@Nonnull Ulid ulid) {
        entities.add(ulid);
        ofEntities.put(ulid, new ConcurrentLinkedQueue<>());
    }

    public static List<Ulid> entities() {
        return entities.stream().toList();
    }

    public static void destroy(@Nonnull Ulid entity) {
        if (RT.debug && !entities.contains(entity)) {
            Logger.fatal("Unknown entity %s", entity);
        }

        Tasks.concurrent("ECS", () -> {
            Logger.debug("%s :: Destroying", entity);
            entities.remove(entity);
            for (final Component component : ofEntities.get(entity)) {
                if (!component.terminate()) {
                    Logger.warn("%s :: Failed to terminate %s", entity, Meta.fqn(component));
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

    @Nullable
    public static Component attach(@Nonnull Ulid entity, @Nonnull ComponentType type, Tuple... properties) {
        if (RT.debug) {
            if (!entities.contains(entity)) {
                Logger.fatal("Unknown entity %s", entity);
            }

            for (final Component component : ofEntities.get(entity)) {
                if (component.type == type) {
                    Logger.warn("%s :: Component already attached: %s", entity, type);
                    return component;
                }
            }
        }

        Logger.debug("%s :: attaching %s", entity, type);
        final var instance = switch (type) {
            case TRANSFORM_COMPONENT -> TransformComponent.create(properties);
            case MESH_COMPONENT -> MeshComponent.create(properties);
            case AUDIO_SOURCE_COMPONENT -> AudioSourceComponent.create(properties);
            case BEHAVIOUR_COMPONENT -> BehaviourComponent.create(properties);
            case RIGID_BODY_COMPONENT -> RigidBodyComponent.create(properties);
            case SOFT_BODY_COMPONENT -> SoftBodyComponent.create(properties);
        };

        if (instance == null) { return null; }
        Meta.set(instance, "owner", entity);
        Meta.set(instance, "type", type);

        ofEntities.get(entity).add(instance);
        ofComponents.computeIfAbsent(type, ignored -> new ConcurrentLinkedQueue<>()).add(instance);

        return instance;
    }

    public static boolean contains(@Nonnull Ulid entity, @Nonnull ComponentType type) {
        if (RT.debug && !entities.contains(entity)) {
            Logger.fatal("Unknown entity %s", entity);
        }

        for (final var component : ofEntities.get(entity)) {
            if (Meta.assignable(component, type.klass)) {
                return true;
            }
        }

        return false;
    }

    @Nullable
    public static Component get(@Nonnull Ulid entity, @Nonnull ComponentType type) {
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

    @Nullable
    public static <T> T get(@Nonnull Ulid entity, @Nonnull Class<T> type) {
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

    @Nonnull
    public static List<Component> list(@Nonnull Ulid entity) {
        if (RT.debug && !entities.contains(entity)) {
            Logger.fatal("Unknown entity %s", entity);
        }

        return ofEntities.get(entity).stream().toList();
    }

    public static void detach(@Nonnull Ulid entity, @Nonnull ComponentType type) {
        if (RT.debug && !entities.contains(entity)) {
            Logger.fatal("Unknown entity %s", entity);
        }

        Logger.debug("%s :: detaching %s", entity, type);
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

    @Nonnull
    public static <T> List<T> list(@Nonnull Class<T> type) {
        for (final var entry : ComponentType.values()) {
            if (Meta.assignable(type, entry.klass)) {
                return (List<T>) ofComponents.getOrDefault(entry, new ArrayDeque<>()).stream().toList();

            }
        }

        return new ArrayList<>();
    }

    public static void attach(@Nonnull System system) {
        systems.add(system);
    }

    public static void detach(@Nonnull System system) {
        systems.remove(system);
    }
}
