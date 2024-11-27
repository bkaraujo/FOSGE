package br.fosge.runtime.platform;

import br.fosge.Logger;
import br.fosge.runtime.Runtime;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public final class PlatformFilesystem {
    PlatformFilesystem() {

    }

    public Path resolve(String path) {
        final var absolute = Runtime.ROOTFS.resolve(path.trim());
        if (!absolute.toFile().exists()) {
            Logger.warn("Path does not exists %s", absolute);
            return null;
        }

        return absolute;
    }

    public List<Path> list(String path, String name) {
        try {
            final var rootfs = resolve(path.trim());
            try (final var files = Files.list(rootfs)){
                return files
                        .filter(entry -> entry.toFile().getName().startsWith(name))
                        .toList();
            }
        } catch (Throwable throwable) {
            Logger.error("Failed to list files in %s: %s", path, throwable);
            return new ArrayList<>();
        }
    }

    public byte[] readAllBytes(InputStream stream) {
        try {
            final var buf = new byte[stream.available()];
            int read = 0, total = 0;
            while ((read = stream.read(buf, total, buf.length - total)) != -1 && total < buf.length) {
                total += read;
            }

            return buf;
        } catch (IOException exception) {
            Logger.error("Failed to read stream: %s", exception);
            return null;
        }
    }
}
