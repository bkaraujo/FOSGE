package br.fosge.runtime;

import br.fosge.runtime.configuration.ConfigurationFile;

import java.nio.file.Path;

public abstract class Runtime {
    private Runtime() { /* Private constructor */ }

    public static boolean CHECKS;
    public static final Path ROOTFS;

    static {
        final var userDir = System.getProperty("user.dir");
        System.out.println(userDir);
        if (userDir.contains("fosge-a-packager")) {
            ROOTFS = Path.of(userDir).getParent();
        } else {
            ROOTFS = Path.of(userDir);
        }

        CHECKS = ConfigurationFile.get().engine().debug();

    }

}
