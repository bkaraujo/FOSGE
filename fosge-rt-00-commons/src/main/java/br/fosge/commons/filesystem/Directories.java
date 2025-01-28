package br.fosge.commons.filesystem;

import br.fosge.commons.Logger;

import javax.swing.filechooser.FileSystemView;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Directories {
    private Directories() {}

    public static Path jvmStartup() {
        return Paths.get(System.getProperty("user.dir"));
    }

    public static Path userHome() {
        return Paths.get(System.getProperty("user.home"));
    }

    public static Path userDefault() {
        return FileSystemView.getFileSystemView().getDefaultDirectory().toPath();
    }

    public static Path rootfs() { return Paths.get(System.getProperty("br.fosge.rootfs")); }

    public static Path resolve(Path path) {
        return rootfs().resolve(path);
    }

    public static Path resolve(String token, String ... tokens) {
        return rootfs().resolve(token, tokens);
    }

    public static List<Path> matching(String fileName) {
        return matching(rootfs(), fileName);
    }

    public static List<Path> matching(String rootfs, String fileName) {
        return matching(Path.of(rootfs), fileName);
    }

    public static List<Path> matching(Path rootfs, String fileName) {
        final var result = new ArrayList<Path>();

        try {
            java.nio.file.Files.walkFileTree(rootfs, Collections.emptySet(), 1, new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) {
                    if (path.toFile().getName().startsWith(fileName)) {
                        result.add(path);
                    }

                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (Throwable throwable) {
            Logger.error("Failed to walk path: %s", throwable);
        }

        return result;
    }

    public static boolean contains(Path rootfs, String filename) {
        final boolean[] result = {false};

        try {
            java.nio.file.Files.walkFileTree(rootfs, new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) {
                    if (path.toFile().getName().contentEquals(filename)) {
                        result[0] = true;
                        return FileVisitResult.TERMINATE;
                    }

                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (Throwable throwable) {
            Logger.error("Failed to walk path: %s", throwable);
        }

        return result[0];
    }

    public static Path search(Path rootfs, String name) {
        final Path[] result = {null};

        try {
            java.nio.file.Files.walkFileTree(rootfs, new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes attrs) {
                    if (path.toFile().getName().contentEquals(name)) {
                        result[0] = path;
                        return FileVisitResult.TERMINATE;
                    }

                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) {
                    if (path.toFile().getName().contentEquals(name)) {
                        result[0] = path;
                        return FileVisitResult.TERMINATE;
                    }

                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (Throwable throwable) {
            Logger.error("Failed to walk path: %s", throwable);
        }

        return result[0];
    }
}
