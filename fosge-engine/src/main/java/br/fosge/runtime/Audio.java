package br.fosge.runtime;

import br.fosge.annotation.Facade;
import br.fosge.audio.AudioBuffer;
import br.fosge.audio.AudioSource;
import br.fosge.runtime.platform.Platform;

public abstract class Audio implements Facade {
    private Audio() { /* Private constructor */ }

    private static final AudioSource source = Platform.audio.sourceCreate();

    public static void play(AudioBuffer buffer, float gain) {
        source.buffer(buffer);
        source.gain(gain);
        source.play();
    }

}
