package br.fosge.engine;

import br.fosge.RT;
import br.fosge.commons.*;
import br.fosge.commons.annotation.Facade;
import br.fosge.commons.annotation.Lifecycle;
import br.fosge.commons.filesystem.Directories;
import br.fosge.commons.logger.LogLevel;
import br.fosge.engine.audio.AudioBuffer;
import br.fosge.engine.audio.AudioSource;
import br.fosge.engine.graphics.Geometry;
import br.fosge.engine.graphics.Shader;
import br.fosge.engine.graphics.Texture;
import br.fosge.engine.graphics.Texture2D;
import br.fosge.engine.graphics.geometry.GeometrySpec;
import br.fosge.engine.graphics.shader.ShaderSource;
import br.fosge.engine.graphics.shader.ShaderSpec;
import br.fosge.engine.graphics.shader.ShaderStage;

import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.util.ArrayList;

import static br.fosge.engine.runtime.Platform.*;
import static br.fosge.engine.runtime.platform.Bindings.openal;

/**
 * <p>Entrypoint of all content creation inside the engine.</p>
 * <p>
 *     Resources created/released by this {@link Facade} will be tracked and automatically
 *     released during engine's {@link Lifecycle#terminate()}
 * </p>
 */
public abstract class Resources implements Facade {
    private Resources() { /* Private constructor */ }

    /** Allocate an off-heap memory buffer*/
    public static ByteBuffer memory(int size) {
        final var buffer = Memory.bytes(size);
        RT.Memory.buffers.add(buffer);
        RT.Memory.offHeap += size;

        return buffer;
    }

    public static void free(ByteBuffer buffer) {
        if (RT.debug && buffer == null) { Logger.fatal("ByteBuffer is null"); return; }
        if (!RT.Memory.buffers.remove(buffer)) { Logger.warn("Unknown buffer"); return;}
        RT.Memory.offHeap += buffer.capacity();
        Memory.free(buffer);
    }

    /**
     * @see RT.Audio#monoSourceLimit
     */
    public static AudioSource audioSource() {
        if (RT.debug) {
            if (RT.Audio.monoSources.size() >= RT.Audio.monoSourceLimit * 0.8f) {
                Logger.warn("80% mono sources utilization [curr %d, limit %d]", RT.Audio.monoSources.size(), RT.Audio.monoSourceLimit);
            }

            if (RT.Audio.monoSources.size() == RT.Audio.monoSourceLimit) {
                Logger.fatal("100% mono sources utilization");
            }
        }

        final var source = audio.source();
        RT.Audio.monoSources.add(source);
        return source;
    }

    public static void free(AudioSource source) {
        if (RT.debug && source == null) { Logger.fatal("AudioSource is null"); return; }
        RT.Audio.monoSources.remove(source);
        source.terminate();

        final var buffer = source.buffer();
        source.buffer(null);

        // Release the audio buffer if not source is using it
        Tasks.concurrent(() -> free(buffer));
    }

    public static AudioBuffer audioBuffer(String path) {
        final var absolute = Directories.resolve(path);
        if (RT.debug) {
            if (absolute == null) { Logger.warn("Path is null"); return null; }
            for (final var buffer : RT.Audio.buffers) {
                if (buffer.path().equals(absolute)) {
                    Logger.warn("Already loaded: %s", absolute);
                    Logger.stackTrace(LogLevel.WARN);
                    return buffer;
                }
            }
        }

        final var buffer = audio.buffer();
        if (!buffer.initialize()) { Logger.fatal("Failed to initialize AudioBuffer"); }
        if (!buffer.path(absolute)) {
            buffer.terminate();
            return null;
        }

        RT.Audio.buffers.add(buffer);
        return buffer;
    }

    public static void free(AudioBuffer buffer) {
        if (RT.debug) {
            if(buffer == null) { Logger.fatal("AudioBuffer is null"); return; }
            for (final var source : RT.Audio.monoSources) {
                if (source.buffer().equals(buffer)) {
                    Logger.warn("Audio buffer still in use: %s", buffer);
                    Logger.stackTrace(LogLevel.WARN);
                    return;
                }
            }
        }

        buffer.terminate();
        RT.Audio.buffers.remove(buffer);
    }

    public static Geometry geometry(GeometrySpec spec) {
        final var geometry = graphics.geometry();
        if (!geometry.initialize()) {
            Logger.fatal("Failed to initialize geometry");
            return null;
        }

        if (!geometry.configure(spec)) {
            Logger.warn("Failed to configure geometry");
            Logger.stackTrace(LogLevel.WARN);
            return null;
        }

        RT.Graphics.geometries.add(geometry);
        return geometry;
    }

    public static void free(Geometry geometry) {
        if (RT.debug && geometry == null) { Logger.fatal("Geometry is null"); return; }
        if (!geometry.terminate()) { Logger.error("Failed to terminate geometry"); }
        RT.Graphics.geometries.remove(geometry);
    }

    public static Texture2D texture2d(String path) {
        return texture2d(path, 1);
    }

    public static Texture2D texture2d(String path, int mips) {
        final var absolute = Directories.resolve(path);

        if (RT.debug) {
            if (absolute == null) { Logger.fatal("Path is null"); return null; }
            for (final var texture : RT.Graphics.textures) {
                if (((Texture) texture).path().equals(absolute)) {
                    Logger.warn("Already loaded: %s", absolute);
                    Logger.stackTrace(LogLevel.WARN);
                    return Meta.cast(texture, Texture2D.class);
                }
            }
        }

        final var texture = graphics.texture2d(absolute, mips);
        RT.Graphics.textures.add(texture);
        return texture;
    }

    public static void free(Texture texture) {
        if (RT.debug && texture == null) { Logger.fatal("Texture is null"); return; }

        graphics.textureDestroy(texture);
        RT.Graphics.textures.remove(texture);
    }

    public static Shader shader(String fileName) {
        final var sources = new ArrayList<ShaderSource>();
        final var files = Directories.matching(filesystem.assets.resolve("shader"), fileName);
        for (final var file : files) {
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

                sources.add(new ShaderSource(
                        stage,
                        file.toFile().getName(),
                        Files.readString(file)
                ));
            } catch (Throwable throwable) {
                Logger.warn("Failed to read %s: %s", file, throwable);
                Logger.stackTrace(LogLevel.WARN);
            }
        }

        final var spec = new ShaderSpec(sources.toArray(ShaderSource[]::new));
        final var shader = graphics.shader();

        if (!shader.initialize()) {
            Logger.error("Failed to initialize shader");
            shader.terminate();
            return null;
        }

        if (!shader.configure(spec)) {
            Logger.error("Failed to configure shader %s", spec);
            shader.terminate();
            return null;
        }

        RT.Graphics.shaders.add(shader);
        return shader;
    }

    public static void free(Shader shader) {
        if (RT.debug && shader == null) { Logger.fatal("Shader is null"); return; }

        if (!shader.terminate()) { Logger.error("Failed to terminate shader: %s", shader); }
        RT.Graphics.shaders.remove(shader);
    }

    public static void free() {
        Logger.debug("Freeing resources");

        final var group = new QueueGroup<>(RT.Graphics.textures, RT.Graphics.shaders, RT.Graphics.geometries);
        group.forEach(element -> { Logger.warn("Removing dangling %s: %s", Meta.fqn(element), element); element.terminate(); });
        group.clear();

        for (var object : RT.Audio.monoSources) {
            Logger.warn("Removing dangling audio source: %s", object);
            openal.alDeleteSources(object.handle());
        }

        RT.Audio.monoSources.clear();

        for (var object : RT.Audio.buffers) {
            Logger.warn("Removing dangling audio buffer: %s", object);
            openal.alDeleteBuffers(object.handle());
        }

        RT.Audio.buffers.clear();

        for (final var object : RT.Memory.buffers) {
            Logger.warn("Freeing dangling buffer of %d bytes", object.capacity());
            Memory.free(object);
        }

        RT.Memory.buffers.clear();
    }
}
