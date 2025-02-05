package br.fosge.runtime.platform.audio;

import br.fosge.commons.Logger;
import br.fosge.commons.logger.LogLevel;
import br.fosge.engine.audio.AudioBuffer;
import br.fosge.engine.audio.AudioSource;
import org.joml.Vector3fc;

import static br.fosge.runtime.platform.Bindings.openal;
import static br.fosge.runtime.platform.binding.OpenAL.*;

public final class ALSource implements AudioSource {
    private int handle = AL_NONE;
    private AudioBuffer buffer;
    private float gain;

    @Override
    public boolean initialize() {
        if (handle != AL_NONE) {
            Logger.warn("AudioSource already initialized");
            Logger.stackTrace(LogLevel.WARN);
            return true;
        }

        handle = openal.alGenSources();
        return true;
    }

    @Override
    public int handle() {
        return handle;
    }

    @Override
    public AudioBuffer buffer() {
        return buffer;
    }

    @Override
    public void buffer(AudioBuffer desired) {
        buffer = desired;
        openal.alSourcei(handle, AL_BUFFER, buffer == null ? AL_NONE : buffer.handle());
    }

    @Override
    public float gain() {
        return gain;
    }

    @Override
    public void gain(float desired) {
        gain = desired;
        openal.alSourcef(handle, AL_GAIN, desired);
    }

    @Override
    public void position(Vector3fc position) {
        openal.alSource3f(handle, AL_POSITION, position.x(), position.y(), position.z());
    }

    @Override
    public void play() {
        openal.alSourcePlay(handle);
    }

    @Override
    public boolean isPlaying() {
        return openal.alGetSourcei(handle, AL_SOURCE_STATE) == AL_PLAYING;
    }

    @Override
    public void pause() {
        openal.alSourcePause(handle);
    }

    @Override
    public void stop() {
        openal.alSourceStop(handle);
    }

    @Override
    public boolean terminate() {
        if (handle == AL_NONE) {
            Logger.warn("AudioSource not initialized");
            Logger.stackTrace(LogLevel.WARN);
            return true;
        }

        openal.alDeleteSources(handle);
        handle = AL_NONE;
        return true;
    }

    @Override
    public String toString() {
        return handle + ", " + buffer;
    }
}
