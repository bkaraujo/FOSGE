package br.fosge.engine.runtime.platform.binding.openal.objects;

import br.fosge.commons.tools.Meta;
import br.fosge.engine.audio.AudioBuffer;

import java.nio.file.Path;

public final class ALBuffer implements AudioBuffer {
    public final int handle;
    private Path path;

    public ALBuffer(int handle) {
        this.handle = handle;
    }

    @Override
    public int handle() {
        return handle;
    }

    @Override
    public Path path() {
        return path;
    }

    @Override
    public void path(Path desired) {
        path = desired;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!Meta.assignable(obj, AudioBuffer.class)) return false;

        final var other = Meta.cast(obj, AudioBuffer.class);
        if (other.path() == null) return false;

        return path.equals(other.path());
    }

    @Override
    public String toString() {
        return "ALBuffer{" +
                "handle=" + handle +
                ", path=" + path +
                '}';
    }
}
