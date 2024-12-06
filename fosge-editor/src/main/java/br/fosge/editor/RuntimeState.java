package br.fosge.editor;

import br.fosge.annotation.State;

import java.nio.file.Path;

public abstract class RuntimeState implements State {
    private RuntimeState() { /* Private constructor */ }

    public static final Path ROOTFS = Path.of(System.getProperty("user.dir"));
    public static final Path SETTINGSFS = ROOTFS.resolve("settings");

}
