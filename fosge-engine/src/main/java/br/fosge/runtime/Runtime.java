package br.fosge.runtime;

import java.nio.file.Path;

public abstract class Runtime {
    private Runtime() { /* Private constructor */ }

    /**
     * Production optimization, avoid runtime verifications
     */
    public static boolean CHECKS = true;

    public static final Path ROOTFS = Path.of(System.getProperty("user.dir"));
    public static String projectDir = "";
}
