package br.fosge.runtime;

import br.fosge.RT;
import br.fosge.commons.Launcher;
import br.fosge.commons.Logger;
import br.fosge.commons.Tasks;
import br.fosge.commons.filesystem.Directories;
import br.fosge.commons.logger.LogLevel;
import br.fosge.commons.serializer.Yaml;
import br.fosge.engine.Resources;

import static br.fosge.RT.yaml;

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

        if (yaml.contains("fosge.application.version")) {
            Logger.info("Initializing Application: %s.%s.%s",
                    yaml.asInt("fosge.application.version.major"),
                    yaml.asInt("fosge.application.version.minor"),
                    yaml.asInt("fosge.application.version.rev")
            );
        } else {
            Logger.info("Initializing Application");
        }

        final var trace = RT.yaml.asBoolean("fosge.engine.trace");
        if (trace != null && trace) {
            RT.debug = RT.trace = true;
            Logger.level(LogLevel.TRACE);

            final var debug = RT.yaml.asBoolean("fosge.engine.debug");
            if (debug != null && !debug) {
                Logger.warn("Because fosge.engine.trace is enabled, fosge.engine.debug is also enabled");
            }
        } else {
            final var debug = RT.yaml.asBoolean("fosge.engine.debug");
            if (debug != null && debug) {
                RT.debug = true;
                Logger.level(LogLevel.DEBUG);
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
            RT.Platform.window.show();
            return application.run();
        } finally {
            RT.Platform.window.hide();
            Logger.trace("Tasks.onVirtual : %d", Tasks.onVirtual.getAcquire());
            Logger.trace("Tasks.onPlatform: %d", Tasks.onPlatform.getAcquire());
        }
    }

    @Override
    public boolean terminate() {
        RT.yaml.save();

        if (!application.terminate()) { Logger.error("Application failed to terminate"); return false; }
        Logger.info("Application Terminated");

        if (!Platform.terminate()) { Logger.error("Platform failed to terminate"); return false; }
        Logger.info("Platform Terminated");

        return true;
    }
}
