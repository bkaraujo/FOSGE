package br.fosge.engine.audio;

import org.joml.Vector3fc;

public interface AudioSource extends AudioObject {
    AudioBuffer buffer();
    void buffer(AudioBuffer buffer);

    boolean isPlaying();
    void play();
    void pause();
    void stop();

    float gain();
    void gain(float gain);
    void position(Vector3fc position);
}
