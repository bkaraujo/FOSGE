package br.fosge.engine.runtime.object;

import com.github.f4b6a3.ulid.Ulid;
import com.github.f4b6a3.ulid.UlidCreator;

public abstract class Identity {
    private Identity() { /* Private constructor */ }

    public static Ulid generate() {
        return UlidCreator.getMonotonicUlid();
    }
}
