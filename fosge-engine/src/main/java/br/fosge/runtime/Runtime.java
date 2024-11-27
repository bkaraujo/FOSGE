package br.fosge.runtime;

import br.fosge.Logger;
import br.fosge.runtime.configuration.ConfigurationFile;

import java.nio.file.Path;

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
    }

}
