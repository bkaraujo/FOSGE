package br.fosge.commons.filesystem;

import br.fosge.commons.Logger;

import javax.swing.filechooser.FileSystemView;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public abstract class FSTools {
    private FSTools() {}

    public static Path homeDirectory() {
        return Paths.get(System.getProperty("user.home"));
    }

    public static Path defaultDirectory() {
        return FileSystemView.getFileSystemView().getDefaultDirectory().toPath();
    }

    public static Path search(Path rootfs, String name) {
        try (Stream<Path> stream = Files.walk(rootfs)) {
            return stream
                    .filter(p -> p.toFile().getName().contentEquals(name))
                    .findFirst()
                    .orElse(null);
        } catch (Throwable throwable) {
            Logger.error("%s", throwable);
            return null;
        }
    }

    public static boolean contains(Path directory, String filename) {
        try (final var files = Files.list(directory)) {
            for (final var file : files.map(Path::toFile).toList()) {
                if (file.getName().equals(filename)) {
                    return true;
                }
            }
        } catch (Throwable throwable) {
            Logger.warn("Failed to list files in directory %s: %s", directory, throwable);
            return false;
        }

        return false;
    }
}
