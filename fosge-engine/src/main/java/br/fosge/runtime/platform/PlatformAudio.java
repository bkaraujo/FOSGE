package br.fosge.runtime.platform;

import br.fosge.Logger;
import br.fosge.annotation.Lifecycle;
import br.fosge.audio.AudioBuffer;
import br.fosge.audio.AudioSource;
import br.fosge.runtime.Runtime;
import br.fosge.runtime.platform.audio.ALBuffer;
import br.fosge.runtime.platform.audio.ALSource;
import org.lwjgl.openal.ALCCapabilities;
import org.lwjgl.openal.ALCapabilities;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.libc.LibCStdlib;

import javax.sound.sampled.AudioSystem;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static br.fosge.runtime.platform.Bindings.openal;
import static br.fosge.runtime.platform.Bindings.stbv;
import static br.fosge.runtime.platform.Platform.filesystem;
import static br.fosge.runtime.platform.binding.OpenAL.*;
import static org.lwjgl.openal.AL.createCapabilities;
import static org.lwjgl.openal.ALC.createCapabilities;

public final  class PlatformAudio implements Lifecycle {
    PlatformAudio() {}

    private long device;
    private ALCCapabilities deviceCapabilities;

    private long context;
    private ALCapabilities contextCapabilities;

    private int sources_mono_limit;
    private final List<AudioBuffer> buffers = new ArrayList<>();
    private final List<AudioSource> sources = new ArrayList<>();

    @Override
    public boolean initialize() {
        device = openal.alcOpenDevice((ByteBuffer) null);
        if (device == MemoryUtil.NULL) {
            Logger.error("Failed to open the default OpenAL device");
            return false;
        }

        deviceCapabilities = createCapabilities(device);
        context = openal.alcCreateContext(device, (IntBuffer) null);
        if (context == MemoryUtil.NULL) {
            Logger.error("Failed to create OpenAL context");
            return false;
        }

        openal.alcMakeContextCurrent(context);
        contextCapabilities = createCapabilities(deviceCapabilities);

        sources_mono_limit = openal.alcGetInteger(device, ALC_MONO_SOURCES);
        Logger.debug("OpenAL: %s", openal.alGetString(AL_VERSION));
        Logger.debug("OpenAL ALC_STEREO_SOURCES: %s", openal.alcGetInteger(device, ALC_STEREO_SOURCES));
        Logger.debug("OpenAL ALC_MONO_SOURCES: %s", sources_mono_limit);
        Logger.debug("OpenAL ALC_FREQUENCY: %d hz", openal.alcGetInteger(device, ALC_FREQUENCY));

        return true;
    }

    private AudioBuffer bufferCreate() {
        final var buffer = new ALBuffer(openal.alGenBuffers());
        buffers.add(buffer);
        return buffer;
    }

    public AudioBuffer bufferCreate(Path absolute) {
        if (Runtime.CHECKS) {
            for (final var buffer : buffers) {
                if (buffer.path().equals(absolute)) {
                    Logger.warn("Buffer already contains %s", absolute);
                    return buffer;
                }
            }
        }

        if (absolute.toString().endsWith(".wav")) return bufferSourceWave(absolute);
        if (absolute.toString().endsWith(".ogg")) return bufferSourceVorbis(absolute);

        Logger.warn("Incompatible extension: %s", absolute);
        return null;
    }

    private AudioBuffer bufferSourceVorbis(Path absolute) {
        ShortBuffer pcm = null;
        final var buffer = bufferCreate();

        try {
            try (final var stack = MemoryStack.stackPush()) {
                final var pChannels = stack.mallocInt(1);
                final var pSamples = stack.mallocInt(1);

                pcm = stbv.stb_vorbis_decode_filename(absolute.toString(), pChannels, pSamples);
                if (pcm == null) {
                    Logger.warn("Failed to read %s", absolute);
                    bufferDestroy(buffer);
                    return null;
                }

                openal.alBufferData(
                        buffer.handle(),
                        switch (pChannels.get()) {
                            default -> AL_INVALID_ENUM;
                            case 1 -> AL_FORMAT_MONO16;
                            case 2 -> AL_FORMAT_STEREO16;
                        },
                        pcm,
                        pSamples.get()
                );

                buffer.path(absolute);
            }

            return buffer;
        } catch (Throwable throwable) {
            bufferDestroy(buffer);
            Logger.error("Failed to read %s: %s", absolute, throwable);
            return null;
        } finally {
            if (pcm != null) { LibCStdlib.free(pcm); }
        }
    }

    private AudioBuffer bufferSourceWave(Path absolute) {
        ByteBuffer pcm = null;
        final var buffer = bufferCreate();

        try {
            final var stream = AudioSystem.getAudioInputStream(absolute.toFile());
            final var format = stream.getFormat();

            Logger.debug(
                    "Loading\nFile       : %s\nChannels   : %s\nSample Size: %s\nFrame Rate : %s\nEncoding   : %s\nBytes      : %s",
                    absolute,
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
                bufferDestroy(buffer);
                Logger.warn("Incompatible channels: %d", format.getChannels());
                return null;
            }

            final var bytes = filesystem.readAllBytes(stream);
            if (bytes == null) {
                bufferDestroy(buffer);
                Logger.warn("Failed to read %s", absolute);
                return null;
            }

            pcm = ByteBuffer
                    .allocateDirect(bytes.length)
                    .order(ByteOrder.nativeOrder())
                    .put(ByteBuffer
                            .wrap(bytes)
                            .order(format.isBigEndian() ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN)
                    )
                    .rewind();

            openal.alBufferData(
                    buffer.handle(),
                    channels,
                    pcm,
                    (int) format.getSampleRate()
            );

            buffer.path(absolute);

            return buffer;
        } catch (Throwable throwable) {
            Logger.warn("Failed to read %s", absolute);
            bufferDestroy(buffer);
            return null;
        } finally {
            if (pcm != null) {
                LibCStdlib.free(pcm);
            }
        }
    }

    public void bufferDestroy(AudioBuffer buffer) {
        Logger.trace("Releasing audio buffer %d", buffer.handle());
        buffers.remove(buffer);
        openal.alDeleteBuffers(buffer.handle());
    }

    public AudioSource sourceCreate() {
        if (Runtime.CHECKS) {
            if (sources.size() >= sources_mono_limit * 0.8f) {
                Logger.warn("80% mono sources utilization [curr %d, limit %d]", sources.size(), sources_mono_limit);
            }

            if (sources.size() == sources_mono_limit) {
                Logger.fatal("100% mono sources utilization");
            }
        }

        final var source = new ALSource(openal.alGenSources());
        sources.add(source);

        return source;
    }

    public void sourceDestroy(AudioSource source) {
        openal.alDeleteSources(source.handle());
        sources.remove(source);
    }

    @Override
    public boolean terminate() {
        for (var source : sources) {
            Logger.warn("Removing dangling OpenAL source: %s", source);
            openal.alDeleteSources(source.handle());
        }

        for (var buffer : buffers) {
            Logger.warn("Removing dangling OpenAL buffer: %s", buffer);
            openal.alDeleteBuffers(buffer.handle());
        }

        sources.clear();
        buffers.clear();

        if (context != MemoryUtil.NULL) {
            openal.alcDestroyContext(context);
            context = MemoryUtil.NULL;
            contextCapabilities = null;
        }

        if (device != MemoryUtil.NULL) {
            openal.alcCloseDevice(device);
            device = MemoryUtil.NULL;
            deviceCapabilities = null;
        }

        return true;
    }
}