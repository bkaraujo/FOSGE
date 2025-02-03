package br.fosge.engine.runtime.platform;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.commons.annotation.Lifecycle;
import br.fosge.engine.audio.AudioBuffer;
import br.fosge.engine.audio.AudioSource;
import br.fosge.engine.runtime.platform.audio.ALBuffer;
import br.fosge.engine.runtime.platform.audio.ALSource;
import org.lwjgl.openal.ALCCapabilities;
import org.lwjgl.openal.ALCapabilities;
import org.lwjgl.system.MemoryUtil;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import static br.fosge.engine.runtime.platform.Bindings.openal;
import static br.fosge.engine.runtime.platform.binding.OpenAL.*;
import static org.lwjgl.openal.AL.createCapabilities;
import static org.lwjgl.openal.ALC.createCapabilities;

public final class PlatformAudio implements Lifecycle {

    private long device;
    private ALCCapabilities deviceCapabilities;

    private long context;
    private ALCapabilities contextCapabilities;

    // #####################################################################################################
    //
    //                                      Platform Lifecycle
    //
    // #####################################################################################################

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

        RT.Audio.monoSourceLimit = openal.alcGetInteger(device, ALC_MONO_SOURCES);
        Logger.debug("OpenAL: %s", openal.alGetString(AL_VERSION));
        Logger.debug("OpenAL ALC_STEREO_SOURCES: %s", openal.alcGetInteger(device, ALC_STEREO_SOURCES));
        Logger.debug("OpenAL ALC_MONO_SOURCES: %s", RT.Audio.monoSourceLimit);
        Logger.debug("OpenAL ALC_FREQUENCY: %d hz", openal.alcGetInteger(device, ALC_FREQUENCY));

        return true;
    }

    public AudioSource source() { return new ALSource(); }

    public AudioBuffer buffer() { return new ALBuffer(); }

    @Override
    public boolean terminate() {
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
