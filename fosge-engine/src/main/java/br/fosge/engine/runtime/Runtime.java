package br.fosge.engine.runtime;

import br.fosge.Logger;
import br.fosge.engine.diagnostics.ReportThread;
import br.fosge.engine.runtime.configuration.ConfigurationFile;

import java.nio.file.Path;
import java.util.concurrent.Executors;

public abstract class Runtime {
    private Runtime() { /* Private constructor */ }

    public static boolean CHECKS;
    public static final Path ROOTFS;

    static {
        final var userDir = Path.of(System.getProperty("user.dir"));
        if (userDir.toString().contains("fosge-a-packager")) {
            ROOTFS = userDir.getParent();
        } else {
            ROOTFS = userDir;
        }

        CHECKS = ConfigurationFile.get().engine().debug();
        Logger.level(ConfigurationFile.get().engine().logLevel());

        Logger.info("Java Vendor    : %s", System.getProperty("java.vm.vendor"));
        Logger.info("Java Version   : %s", System.getProperty("java.vm.version"));
        Logger.info("Java Heap Min  : %.2f MB", java.lang.Runtime.getRuntime().totalMemory() / (1024.0 * 1024.0));
        Logger.info("Java Heap Max  : %.2f MB", java.lang.Runtime.getRuntime().maxMemory() / (1024.0 * 1024.0));

        Logger.info("OS Name        : %s", System.getProperty("os.name"));
        Logger.info("OS Version     : %s", System.getProperty("os.version"));
        Logger.info("OS Architecture: %s", System.getProperty("os.arch"));

        if (CHECKS) { new ReportThread().start(); }
    }

}
