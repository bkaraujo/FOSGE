package br.fosge;

import br.fosge.commons.Logger;
import br.fosge.commons.Meta;
import br.fosge.commons.annotation.Facade;
import br.fosge.commons.filesystem.Directories;
import br.fosge.commons.logger.LogLevel;
import br.fosge.editor.EditorLauncher;
import br.fosge.engine.EngineLauncher;

public abstract class Main implements Facade {
    private Main() {}

    public static void main(String ... args) {
        Logger.level(LogLevel.INFO);

        if (args.length == 0) { Meta.exit(0, "usage: java -jar fosge.jar <application path>"); }
        System.setProperty("br.fosge.rootfs", args[0]);

        final var isEditor = Directories.contains(Directories.rootfs(), "editor.yml");
        final var launcher = isEditor ? new EditorLauncher() : new EngineLauncher();

        if (!launcher.initialize()) {
            Logger.error("Failed to initialize");
            if (!launcher.terminate()) {
                Logger.fatal("Failed to terminate!");
            }
        }

        if (!launcher.run()) { Logger.error("Failed to run!"); }
        if (!launcher.terminate()) { Logger.fatal("Failed to terminate!"); }
    }
}
