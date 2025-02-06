package br.fosge.engine.ecs;

import br.fosge.commons.Logger;
import br.fosge.commons.Tuple;
import br.fosge.commons.annotation.Lifecycle;
import br.fosge.commons.annotation.Proxy;
import br.fosge.engine.renderer.TransformComponent;
import com.github.f4b6a3.ulid.Ulid;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** Proxy for ECS access for a particular entity */
public record Actor (
        Ulid identity
) implements Lifecycle, Proxy {

    /** Create a new entity in the ECS database */
    @Nonnull
    public static Actor create(String name) {
        final var actor = create();
        actor.name().name = name;
        return actor;
    }

    /** Create a new entity in the ECS database */
    @Nonnull
    public static Actor create() {
        return new Actor(ECS.entity());
    }

    /** Create proxy to the ECS database */
    @Nonnull
    public static Actor from(@Nonnull final Ulid identity) {
        return new Actor(identity);
    }

    @Override
    public boolean initialize() {
        for (final var component : ECS.list(identity)) {
            if (!component.initialize()) {
                Logger.warn("%s :: Failed to initialize %s", identity, component.type);
                return false;
            }
        }

        return true;
    }

    @Nonnull
    public NameComponent name() {
        return ECS.get(identity, NameComponent.class);
    }

    @Nonnull
    public TransformComponent transform() {
        return ECS.get(identity, TransformComponent.class);
    }

    @Nullable
    public <T extends Component> T get(@Nonnull final Class<T> type) {
        return ECS.get(identity, type);
    }

    @Nullable
    public Component attach(@Nonnull final ComponentType type, @Nullable Tuple ... properties) {
        return attach(type.klass, properties);
    }

    @Nullable
    public <T extends Component> T attach(@Nonnull final Class<T> type, @Nullable Tuple ... properties) {
        return ECS.attach(identity, type, properties);
    }

    public <T extends Component> void detach(@Nonnull final Class<T> type) {
        ECS.detach(identity, type);
    }

    @Override
    public boolean terminate() {
        ECS.destroy(identity);
        return true;
    }

    @Override
    public String toString() {
        return  identity.toString();
    }

}
