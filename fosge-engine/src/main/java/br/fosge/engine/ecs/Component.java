package br.fosge.engine.ecs;

import br.fosge.engine.annotation.Lifecycle;
import br.fosge.engine.runtime.OnFrame;
import br.fosge.engine.runtime.configuration.api.Tuple;
import br.fosge.engine.runtime.scene.Actor;

public abstract class Component implements Lifecycle, OnFrame {
    public final Actor actor = null;

    protected static String find(String name, Tuple... tuples) {
        for (final Tuple tuple : tuples) {
            if (name.equals(tuple.name())) {
                return tuple.value();
            }
        }

        return null;
    }

    protected static int[] toInts(String name, Tuple... properties) {
        final var tokens = find(name, properties).split(",");
        final var ints = new int[tokens.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(tokens[i].trim());
        }

        return ints;
    }

    protected static float[] toFloats(String name, Tuple... properties) {
        final var tokens = find(name, properties).split(",");
        final var floats = new float[tokens.length];
        for (int i = 0; i < floats.length; i++) {
            floats[i] = Float.parseFloat(tokens[i].trim());
        }

        return floats;
    }

}
