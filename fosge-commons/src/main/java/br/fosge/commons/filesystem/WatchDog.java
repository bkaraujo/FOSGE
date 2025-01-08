package br.fosge.commons.filesystem;

import java.nio.file.Path;

public record WatchDog(
        Path path,
        WatchDogAction action
) {
}
