package br.fosge.engine.ecs;

import br.fosge.commons.Tuple;
import br.fosge.commons.annotation.Lifecycle;
import br.fosge.engine.runtime.ecs.ComponentType;
import com.github.f4b6a3.ulid.Ulid;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class Component implements Lifecycle {
    public final ComponentType type = ComponentType.TRANSFORM_COMPONENT;
    public final Ulid owner = Ulid.MAX;

    protected static boolean contains(@Nonnull String name, @Nonnull Tuple... tuples) {
        for (final Tuple tuple : tuples) {
            if (name.equals(tuple.name())) {
                return true;
            }
        }

        return false;
    }

    @Nullable
    protected static String find(@Nonnull String name, @Nonnull Tuple... tuples) {
        for (final Tuple tuple : tuples) {
            if (name.equals(tuple.name())) {
                return tuple.value();
            }
        }

        return null;
    }
}
