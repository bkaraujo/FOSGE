package br.fosge;

import java.nio.file.Path;

public abstract class FSTest {
    private FSTest(){}

    public static Path rootfs = Path.of(System.getProperty("user.dir"), "src/test");
    public static Path resFS = rootfs.resolve("resources");

}
