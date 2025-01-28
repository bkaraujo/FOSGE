package br.fosge.engine;

import br.fosge.commons.annotation.Facade;
import br.fosge.engine.audio.AudioBuffer;
import br.fosge.engine.audio.AudioSource;
import br.fosge.engine.runtime.Platform;

public abstract class Audio implements Facade {
    private Audio() { /* Private constructor */ }

    private static final AudioSource source = Platform.audio.source();

    public static void play(AudioBuffer buffer, float gain) {
        if (source.buffer() == null || !source.buffer().equals(buffer)) {
            source.buffer(buffer);
        }

        if (source.gain() != gain) {
            source.gain(gain);
        }

        source.play();
    }

}
