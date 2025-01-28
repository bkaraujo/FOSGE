package br.fosge.engine.audio;

import java.nio.file.Path;

public interface AudioBuffer extends AudioObject {

    Path path();
    boolean path(Path path);

}
