package br.fosge.commons;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;

public abstract class Tuples {

    @Nonnull
    public static Tuple[] list(@Nonnull String name, @Nonnull Tuple ... tuples) {
        final var list = new ArrayList<Tuple>(tuples.length);
        for (Tuple tuple : tuples) {
            if (tuple.name().startsWith(name)){
                list.add(tuple);
            }
        }

        return list.toArray(Tuple[]::new);
    }

    public static boolean contains(@Nonnull String name, @Nullable Tuple... tuples) {
        if (tuples == null) return false;

        for (final Tuple tuple : tuples) {
            if (name.equals(tuple.name())) {
                return true;
            }
        }

        return false;
    }

    @Nullable
    public static String find(@Nonnull String name, @Nullable Tuple... tuples) {
        if (tuples == null) return null;

        for (final Tuple tuple : tuples) {
            if (name.equals(tuple.name())) {
                return tuple.value();
            }
        }

        return null;
    }

}
