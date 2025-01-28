package br.fosge.engine;

import br.fosge.RT;
import br.fosge.commons.Launcher;
import br.fosge.commons.Logger;
import br.fosge.commons.filesystem.Directories;
import br.fosge.commons.logger.LogLevel;
import br.fosge.commons.serializer.Yaml;
import br.fosge.engine.runtime.Application;
import br.fosge.engine.runtime.Platform;

public final class EngineLauncher extends Launcher {
    private final Application application = new Application();

    public EngineLauncher() {
        RT.yaml = Yaml.from(Directories.resolve("application.yml"));
    }

    @Override
    public boolean initialize() {
        if (RT.yaml.isEmpty()) {
            Logger.error("File is empty: %s", RT.yaml);
            return false;
        }

        final var settings = RT.yaml.subtree("application.engine");
        if (settings != null) {
            if (settings.contains("debug")) {
                RT.debug = settings.asBoolean("debug");
                if (RT.debug) { Logger.level(LogLevel.DEBUG); }
            }

            if (settings.contains("trace")) {
                RT.trace = settings.asBoolean("trace");
                if (RT.trace) { Logger.level(LogLevel.TRACE); }
            }
        }

        if (!Platform.initialize()) {
            Logger.error("Platform failed to initialize");
            return false;
        }

        return application.initialize();
    }

    @Override
    public boolean run() {
        try {
            Platform.window.show();
            return application.run();
        } finally {
            Platform.window.hide();
        }
    }

    @Override
    public boolean terminate() {
        RT.yaml.save();

        if (!application.terminate()) {
            Logger.error("Application failed to terminate");
            return false;
        }

        if (!Platform.terminate()) {
            Logger.error("Platform failed to terminate");
            return false;
        }

        return true;
    }
}
