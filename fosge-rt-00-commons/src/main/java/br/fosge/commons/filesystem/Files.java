package br.fosge.commons.filesystem;

import br.fosge.commons.Logger;

import java.io.InputStream;

public abstract class Files {
    private Files(){}

    public static byte[] readAllBytes(InputStream stream) {
        try {
            final var buf = new byte[stream.available()];
            int read = 0, total = 0;
            while ((read = stream.read(buf, total, buf.length - total)) != -1 && total < buf.length) {
                total += read;
            }

            return buf;
        } catch (Throwable throwable) {
            Logger.error("Failed to read stream: %s", throwable);
            return new byte[0];
        }
    }
}
