package br.fosge;

import br.fosge.commons.Logger;
import br.fosge.commons.RT;
import br.fosge.commons.diagnostics.ReportThread;
import br.fosge.commons.logger.LogLevel;

public abstract class Configuration {
    private Configuration() { /* Private constructor */ }

    public static boolean CHECKS;

    static {
        CHECKS = RT.getBooleanOrFalse("fosge.debug.checks");

        final var level = RT.get("fosge.logging.level", LogLevel.class);
        Logger.level(level == null ? LogLevel.TRACE : level);

        if (CHECKS) { new ReportThread().start(); }
    }

}
