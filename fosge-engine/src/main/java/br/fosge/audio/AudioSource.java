package br.fosge.audio;

import org.joml.Vector3fc;

public interface AudioSource {
    int handle();

    AudioBuffer buffer();
    void buffer(AudioBuffer buffer);


    boolean playing();
    void play();
    void pause();
    void stop();

    float gain();
    void gain(float gain);
    void position(Vector3fc position);
}
