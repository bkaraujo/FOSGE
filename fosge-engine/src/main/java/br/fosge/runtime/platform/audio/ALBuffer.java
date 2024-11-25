package br.fosge.runtime.platform.audio;

import br.fosge.audio.AudioBuffer;

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
    public String toString() {
        return "ALBuffer{" +
                "handle=" + handle +
                ", path=" + path +
                '}';
    }
}
