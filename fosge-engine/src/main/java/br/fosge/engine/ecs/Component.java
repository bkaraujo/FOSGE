package br.fosge.engine.ecs;

import br.fosge.commons.Tuple;
import br.fosge.commons.annotation.Lifecycle;
import com.github.f4b6a3.ulid.Ulid;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** A Record of properties */
public abstract class Component implements Lifecycle {
    public final ComponentType type = ComponentType.TRANSFORM_COMPONENT;
    public final Ulid owner = Ulid.MAX;


}
