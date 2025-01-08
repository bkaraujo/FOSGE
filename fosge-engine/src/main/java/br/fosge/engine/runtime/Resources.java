package br.fosge.engine.runtime;

import br.fosge.commons.Logger;
import br.fosge.commons.annotation.Facade;
import br.fosge.engine.audio.AudioBuffer;
import br.fosge.engine.graphics.Texture;
import br.fosge.engine.graphics.Texture2D;
import br.fosge.engine.graphics.shader.ShaderSource;
import br.fosge.engine.graphics.shader.ShaderStage;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import static br.fosge.engine.runtime.Platform.*;

public abstract class Resources implements Facade {
    private Resources() { /* Private constructor */ }

    public static final Path ROOTFS = Path.of(System.getProperty("br.fosge.rootfs"));

    public static AudioBuffer audio(String path) {
        final var absolute = filesystem.resolve(path);
        if (absolute == null) {
            return null;
        }

        return audio.bufferCreate(absolute);
    }

    public static void free(AudioBuffer buffer) {
        audio.bufferDestroy(buffer);
    }

    public static Texture2D texture2d(String path) {
        return texture2d(path, 1);
    }

    public static Texture2D texture2d(String path, int mips) {
        final var absolute = filesystem.resolve(path);
        if (absolute == null) {
            return null;
        }

        return graphics.texture2d(absolute, mips);
    }

    public static void free(Texture texture) {
        graphics.textureDestroy(texture);
    }

    public static ShaderSource[] shaderSource(String path) {
        final var sources = new ArrayList<ShaderSource>();
        final var rootfs = path.substring(0, path.lastIndexOf('/'));
        final var fileName = path.substring(path.lastIndexOf('/') + 1);
        for (final var file : filesystem.list(rootfs, fileName)) {
            final var extension = file.toString().substring(file.toString().lastIndexOf('.') + 1);
            try {
                final var stage = switch (extension) {
                    default -> null;
                    case "frag" -> ShaderStage.FRAGMENT;
                    case "vert" -> ShaderStage.VERTEX;
                };

                if (stage == null) {
                    Logger.debug("Ignoring unknown extension %s" + file);
                    continue;
                }

                sources.add(new ShaderSource(stage, Files.readString(file)));
            } catch (Throwable throwable) {
                Logger.error("Failed to read %s: %s", file, throwable);
            }
        }

        return sources.toArray(new ShaderSource[0]);
    }
}
