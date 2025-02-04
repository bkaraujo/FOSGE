package br.fosge.commons;

import javax.annotation.Nonnull;
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

}
