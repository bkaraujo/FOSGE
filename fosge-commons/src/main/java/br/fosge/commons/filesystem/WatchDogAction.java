package br.fosge.commons.filesystem;

import java.nio.file.Path;
import java.nio.file.WatchEvent;

public interface WatchDogAction {
    void run(WatchEvent<?> event, Path absolute);
}
