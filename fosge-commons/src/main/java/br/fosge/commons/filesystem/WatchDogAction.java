package br.fosge.commons.filesystem;

import java.nio.file.Path;
import java.nio.file.WatchEvent;

public interface WatchDogAction {

    default void onCreate(Path absolute) {}
    default void onDelete(Path absolute) {}
    default void onModify(Path absolute) {}

}
