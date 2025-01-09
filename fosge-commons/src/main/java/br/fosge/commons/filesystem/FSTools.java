package br.fosge.commons.filesystem;

import br.fosge.commons.Logger;

import javax.swing.filechooser.FileSystemView;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public abstract class FSTools {
    private FSTools() {}

    public static Path homeDirectory() {
        return Paths.get(System.getProperty("user.home"));
    }

    public static Path defaultDirectory() {
        return FileSystemView.getFileSystemView().getDefaultDirectory().toPath();
    }

    public static boolean contains(Path rootfs, String filename) {
        final boolean[] result = {false};

        try {
            Files.walkFileTree(rootfs, new SimpleFileVisitor<>() {
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
            Files.walkFileTree(rootfs, new SimpleFileVisitor<>() {
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
