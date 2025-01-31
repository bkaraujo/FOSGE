package br.fosge.engine.ecs;

import br.fosge.commons.Tuple;
import br.fosge.commons.annotation.Lifecycle;
import com.github.f4b6a3.ulid.Ulid;

public abstract class Component implements Lifecycle {
    public final Ulid owner = Ulid.MAX;

    protected static String find(String name, Tuple... tuples) {
        for (final Tuple tuple : tuples) {
            if (name.equals(tuple.name())) {
                return tuple.value();
            }
        }

        return null;
    }
}
