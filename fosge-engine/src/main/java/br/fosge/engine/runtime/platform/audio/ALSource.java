package br.fosge.engine.runtime.platform.audio;

import br.fosge.engine.audio.AudioBuffer;
import br.fosge.engine.audio.AudioSource;
import org.joml.Vector3fc;

import static br.fosge.engine.runtime.platform.Bindings.openal;
import static br.fosge.engine.runtime.platform.binding.OpenAL.*;

public final class ALSource implements AudioSource {
    private final int handle;
    private AudioBuffer buffer;
    private float gain;

    public ALSource(int handle) {
        this.handle = handle;
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
        openal.alSourcei(handle, AL_BUFFER, desired.handle());
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
    public boolean playing() {
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
    public String toString() {
        return "ALSource{" +
                "handle=" + handle +
                ", buffer=" + buffer +
                '}';
    }
}
