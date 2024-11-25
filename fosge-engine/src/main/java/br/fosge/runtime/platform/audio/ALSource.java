package br.fosge.runtime.platform.audio;

import br.fosge.audio.AudioBuffer;
import br.fosge.audio.AudioSource;
import org.joml.Vector3fc;

import static br.fosge.runtime.platform.Bindings.openal;
import static br.fosge.runtime.platform.binding.OpenAL.*;

public final class ALSource implements AudioSource {
    private final int handle;
    private AudioBuffer buffer;

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
    public void buffer(AudioBuffer buffer) {
        openal.alSourcei(handle, AL_BUFFER, buffer.handle());
    }

    @Override
    public void gain(float gain) {
        openal.alSourcef(handle, AL_GAIN, gain);
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
