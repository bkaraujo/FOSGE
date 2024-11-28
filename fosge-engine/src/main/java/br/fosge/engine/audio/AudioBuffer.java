package br.fosge.engine.audio;

import java.nio.file.Path;

public interface AudioBuffer {

    int handle();

    Path path();
    void path(Path path);

}
