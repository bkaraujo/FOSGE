package br.fosge.runtime.platform.audio;

import br.fosge.commons.Logger;
import br.fosge.commons.Meta;
import br.fosge.commons.filesystem.Files;
import br.fosge.commons.logger.LogLevel;
import br.fosge.engine.Resources;
import br.fosge.engine.audio.AudioBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.libc.LibCStdlib;

import javax.sound.sampled.AudioSystem;
import java.nio.ShortBuffer;
import java.nio.file.Path;

import static br.fosge.runtime.platform.Bindings.openal;
import static br.fosge.runtime.platform.Bindings.stbv;
import static br.fosge.runtime.platform.binding.openal.api.AL10.*;
import static br.fosge.runtime.platform.binding.openal.api.AL11.AL_UNDETERMINED;

public final class ALBuffer implements AudioBuffer {
    public int handle = AL_NONE;

    private Path path;

    @Override
    public boolean initialize() {
        if (handle != AL_NONE) {
            Logger.warn("AudioBuffer already initialized");
            Logger.stackTrace(LogLevel.WARN);
            return true;
        }

        handle = openal.alGenBuffers();
        return true;
    }

    @Override
    public boolean terminate() {
        if (handle == AL_NONE) {
            Logger.warn("AudioBuffer not initialized");
            Logger.stackTrace(LogLevel.WARN);
            return true;
        }

        openal.alDeleteBuffers(handle);
        handle = AL_NONE;
        return true;
    }

    @Override
    public int handle() {
        return handle;
    }

    @Override
    public Path path() {
        return path;
    }

    @Override
    public boolean path(Path desired) {
        if (desired.toString().endsWith(".wav")) return loadAsWave(desired);
        if (desired.toString().endsWith(".ogg")) return loadAsVorbis(desired);

        return true;
    }

    private boolean loadAsWave(Path desired) {
        try {
            final var stream = AudioSystem.getAudioInputStream(desired.toFile());
            final var format = stream.getFormat();

            Logger.debug(
                    "Loading\nFile       : %s\nChannels   : %s\nSample Size: %s\nFrame Rate : %s\nEncoding   : %s\nBytes      : %s",
                    desired,
                    format.getChannels(),
                    format.getSampleSizeInBits(),
                    format.getFrameRate(),
                    format.getEncoding(),
                    stream.available()
            );

            var channels = switch (format.getChannels()) {
                default -> AL_UNDETERMINED;
                case 1 -> switch (format.getSampleSizeInBits()) {
                    default -> AL_UNDETERMINED;
                    case 8 -> AL_FORMAT_MONO8;
                    case 16 -> AL_FORMAT_STEREO16;
                };
                case 2 -> switch (format.getSampleSizeInBits()) {
                    default -> AL_UNDETERMINED;
                    case 8 -> AL_FORMAT_STEREO8;
                    case 16 -> AL_FORMAT_STEREO16;
                };
            };

            if (channels == AL_UNDETERMINED) {
                Logger.warn("Incompatible channels: %d", format.getChannels());
                return false;
            }

            final var bytes = Files.readAllBytes(stream);
            if (bytes == null) {
                Logger.warn("Failed to read %s", desired);
                return false;
            }

            final var pcm = Resources.memory(bytes.length);
            try {
                openal.alBufferData(
                        handle,
                        channels,
                        pcm.put(bytes).rewind(),
                        (int) format.getSampleRate()
                );
                path = desired;
            } finally {
                Resources.free(pcm);
            }

            return true;
        } catch (Throwable throwable) {
            Logger.warn("Failed to read %s", desired);
            return false;
        }
    }

    private boolean loadAsVorbis(Path desired) {
        ShortBuffer pcm = null;

        try {
            try (final var stack = MemoryStack.stackPush()) {
                final var pChannels = stack.mallocInt(1);
                final var pSamples = stack.mallocInt(1);

                pcm = stbv.stb_vorbis_decode_filename(desired.toString(), pChannels, pSamples);
                if (pcm == null) { Logger.warn("Failed to load %s", desired); return false; }

                openal.alBufferData(
                        handle,
                        switch (pChannels.get()) {
                            default -> AL_INVALID_ENUM;
                            case 1 -> AL_FORMAT_MONO16;
                            case 2 -> AL_FORMAT_STEREO16;
                        },
                        pcm,
                        pSamples.get()
                );
                path = desired;
            }

            return true;
        } catch (Throwable throwable) {
            Logger.error("Failed to read %s: %s", desired, throwable);
            return false;
        } finally {
            if (pcm != null) { LibCStdlib.free(pcm); }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!Meta.assignable(obj, AudioBuffer.class)) return false;

        final var other = Meta.cast(obj, AudioBuffer.class);
        if (other.path() == null) return false;

        return path.equals(other.path());
    }

    @Override
    public String toString() {
        return path.toString();
    }
}
