package br.fosge.commons.filesystem;

import java.nio.file.Path;

public interface WatchAction {

    default void onCreate(Path absolute) {}
    default void onDelete(Path absolute) {}
    default void onModify(Path absolute) {}

}
