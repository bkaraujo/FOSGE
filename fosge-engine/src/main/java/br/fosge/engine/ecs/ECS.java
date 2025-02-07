package br.fosge.engine.ecs;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.commons.Meta;
import br.fosge.commons.Tuple;
import br.fosge.commons.annotation.Facade;
import br.fosge.engine.renderer.TransformComponent;
import com.github.f4b6a3.ulid.Ulid;
import com.github.f4b6a3.ulid.UlidCreator;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import static br.fosge.RT.Application.*;

public abstract class ECS implements Facade {
    private ECS(){}

    public static Ulid entity() {
        final var ulid = UlidCreator.getMonotonicUlid();
        prepare(ulid);

        return ulid;
    }

    public static void prepare(@Nonnull Ulid identity) {
        if (identity.equals(Ulid.MAX)) return;
        entities.add(identity);

        attach(identity, NameComponent.class, RT.Factory.component.name(new Tuple("name", "Actor")));
        attach(identity, TransformComponent.class, RT.Factory.component.transform());
    }

    public static void destroy(@Nonnull Ulid identity) {
        if (RT.debug && !entities.contains(identity)) {
            Logger.fatal("Unknown entity %s", identity);
        }

        Logger.debug("%s :: %s :: Destroying", identity, get(identity, NameComponent.class).name);
        entities.remove(identity);
        for (final Component component : ofEntities.get(identity)) {
            if (!component.terminate()) {
                Logger.warn("%s :: Failed to terminate %s", identity, Meta.fqn(component));
            }

            ofEntities.get(identity).remove(component);
            for (final ComponentType type : ComponentType.values()) {
                if (Meta.assignable(component, type.klass)) {
                    ofComponents.get(type.klass).remove(component);
                }
            }

            break;
        }
    }

    @Nullable
    public static <T extends Component> T attach(@Nonnull Ulid identity, @Nonnull Class<T> type, @Nullable Tuple... properties) {
        if (RT.debug) {
            if (!entities.contains(identity)) {
                Logger.fatal("Unknown entity %s", identity);
            }

            for (final Component component : ofEntities.get(identity)) {
                if (Meta.assignable(component, type)) {
                    Logger.warn("%s :: Component already attached: %s", identity, type);
                    return Meta.cast(component, type);
                }
            }
        }

        Logger.debug("%s :: attaching %s", identity, type);
        final var instance = switch (type.getSimpleName()) {
            case "TransformComponent" -> RT.Factory.component.transform(properties);
            case "MeshComponent" -> RT.Factory.component.mesh(properties);
            case "AudioSourceComponent" -> RT.Factory.component.audioSource(properties);
            case "BehaviourComponent" -> RT.Factory.component.behaviour(properties);
            case "RigidBodyComponent" -> RT.Factory.component.rigidBody(properties);
            case "SoftBodyComponent" -> RT.Factory.component.softBody(properties);
            case "NameComponent" -> RT.Factory.component.name(properties);
            case "CameraComponent" -> RT.Factory.component.camera(properties);
            default -> null;
        };

        if (instance == null) { return null; }
        return attach(identity, type, instance);
    }

    @Nonnull
    private static <T extends Component> T attach(@Nonnull Ulid identity, @Nonnull Class<T> type, @Nonnull Component component) {
        Meta.set(component, "owner", Actor.from(identity));
        Meta.set(component, "type", ComponentType.valueOf(type));
        ofComponents.computeIfAbsent(type, ignored -> new ConcurrentLinkedQueue<>()).add(component);
        ofEntities.computeIfAbsent(identity, ignored -> new ConcurrentLinkedQueue<>()).add(component);

        return Meta.cast(component, type);
    }

    public static boolean contains(@Nonnull Ulid identity, @Nonnull ComponentType type) {
        if (RT.debug && !entities.contains(identity)) {
            Logger.fatal("Unknown entity %s", identity);
        }

        for (final var component : ofEntities.get(identity)) {
            if (Meta.assignable(component, type.klass)) {
                return true;
            }
        }

        return false;
    }

    @Nullable
    public static Component get(@Nonnull Ulid identity, @Nonnull ComponentType type) {
        if (RT.debug && !entities.contains(identity)) {
            Logger.fatal("Unknown entity %s", identity);
        }

        for (final var component : ofEntities.get(identity)) {
            if (Meta.assignable(component, type.klass)) {
                return component;
            }
        }

        return null;
    }

    @Nullable
    public static <T> T get(@Nonnull Ulid identity, @Nonnull Class<T> type) {
        if (RT.debug && !entities.contains(identity)) {
            Logger.fatal("Unknown entity %s", identity);
        }

        for (final var component : ofEntities.get(identity)) {
            if (Meta.assignable(component, type)) {
                return Meta.cast(component, type);
            }
        }

        return null;
    }

    @Nonnull
    public static List<Component> list(@Nonnull Ulid identity) {
        if (RT.debug && !entities.contains(identity)) {
            Logger.fatal("Unknown entity %s", identity);
        }

        return ofEntities.get(identity).stream().toList();
    }

    public static void detach(@Nonnull Ulid identity, @Nonnull ComponentType type) {
        detach(identity, type.klass);
    }

    public static <T extends Component> void detach(@Nonnull Ulid identity, @Nonnull Class<T> type) {
        if (RT.debug && !entities.contains(identity)) {
            Logger.fatal("Unknown entity %s", identity);
        }

        Logger.debug("%s :: detaching %s", identity, type);
        for (final var component : ofEntities.get(identity)) {
            if (Meta.assignable(component, type)) {
                ofEntities.get(identity).remove(component);
                if (!component.terminate()) {
                    Logger.warn("Failed to terminate %s", Meta.fqn(component));
                }

                break;
            }
        }

        for (final var component : ofComponents.get(type)) {
            if (component.owner.equals(identity)) {
                ofComponents.get(type).remove(component);
                break;
            }
        }
    }

    @Nonnull
    public static <T extends Component> Queue<T> list(@Nonnull Class<T> type) {
        return (Queue<T>) ofComponents.getOrDefault(type, new ConcurrentLinkedQueue<>());
    }

    public static void attach(@Nonnull System system) {
        systems.add(system);
    }

    public static void detach(@Nonnull System system) {
        systems.remove(system);
    }
}
