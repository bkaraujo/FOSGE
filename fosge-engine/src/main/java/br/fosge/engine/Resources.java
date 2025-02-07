package br.fosge.engine;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.commons.Memory;
import br.fosge.commons.Meta;
import br.fosge.commons.QueueGroup;
import br.fosge.commons.annotation.Facade;
import br.fosge.commons.annotation.Lifecycle;
import br.fosge.commons.logger.LogLevel;
import br.fosge.engine.audio.AudioBuffer;
import br.fosge.engine.audio.AudioSource;
import br.fosge.engine.graphics.Geometry;
import br.fosge.engine.graphics.Shader;
import br.fosge.engine.graphics.Texture;
import br.fosge.engine.graphics.Texture2D;
import br.fosge.engine.graphics.geometry.GeometrySpec;
import br.fosge.engine.graphics.shader.ShaderSpec;
import br.fosge.engine.graphics.texture.TextureSpec;

import java.nio.ByteBuffer;

import static br.fosge.RT.Platform.*;

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
        free(buffer);
    }

    public static AudioBuffer audioBuffer(String path) {
        final var absolute = filesystem.assets.resolve(path);
        if (RT.debug) {
            for (final var buffer : RT.Audio.buffers) {
                if (((AudioBuffer) buffer).path().equals(absolute)) {
                    Logger.warn("Already loaded: %s", absolute);
                    Logger.stackTrace(LogLevel.WARN);
                    return Meta.cast(buffer, AudioBuffer.class);
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
                if (((AudioSource)source).buffer().equals(buffer)) {
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

    public static Texture2D texture2d(TextureSpec spec) {
        final var absolute = filesystem.assets.resolve(spec.path());
        if (RT.debug) {
            for (final var texture : RT.Graphics.textures) {
                if (((Texture) texture).path().equals(absolute)) {
                    Logger.warn("Utilizing loaded: %s", absolute);
                    Logger.stackTrace(LogLevel.WARN);
                    return Meta.cast(texture, Texture2D.class);
                }
            }
        }

        final var texture = graphics.texture2d(spec);
        RT.Graphics.textures.add(texture);
        return texture;
    }

    public static void free(Texture texture) {
        if (RT.debug && texture == null) { Logger.fatal("Texture is null"); return; }

        graphics.textureDestroy(texture);
        RT.Graphics.textures.remove(texture);
    }

    public static Shader shader(String fileName) {
        return shader(new ShaderSpec(filesystem.assets.resolve(fileName)));
    }

    public static Shader shader(ShaderSpec specification) {
        if (RT.debug) {
            for (final var object : RT.Graphics.shaders) {
                final var shader = (Shader) object;
                if (shader.script().equals(specification.script())) {
                    Logger.warn("Utilizing loaded: %s", specification.script());
                    return shader;
                }
            }
        }

        final var shader = graphics.shader();
        if (!shader.initialize()) {
            Logger.error("Failed to initialize shader");
            shader.terminate();
            return null;
        }

        if (!shader.configure(specification)) {
            Logger.error("Failed to configure shader %s", specification);
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

        final var graphics = new QueueGroup<>(RT.Graphics.textures, RT.Graphics.shaders, RT.Graphics.geometries);
        graphics.forEach(Lifecycle::terminate);
        graphics.clear();

        final var audio = new QueueGroup<>(RT.Audio.monoSources, RT.Audio.buffers);
        audio.forEach(Lifecycle::terminate);
        audio.clear();

        for (final var object : RT.Memory.buffers) {
            Memory.free(object);
        }

        RT.Memory.buffers.clear();
    }
}
