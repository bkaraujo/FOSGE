package br.fosge.engine.runtime.ecs.component;

import br.fosge.commons.Tuple;
import br.fosge.engine.Resources;
import br.fosge.engine.audio.AudioSource;
import br.fosge.engine.ecs.Component;
import br.fosge.engine.runtime.ecs.ComponentType;

public final class AudioSourceComponent extends Component {
    public static final ComponentType type = ComponentType.AUDIO_SOURCE_COMPONENT;

    public final AudioSource source = Resources.audioSource();
    public boolean loop;
    public float gain;

    private AudioSourceComponent(){}

    public static AudioSourceComponent create(Tuple... properties) {
        final var instance = new AudioSourceComponent();

        final var sGain = find("gain", properties);
        instance.gain = sGain != null ? Float.parseFloat(sGain) : 0.5f;
        instance.loop = Boolean.parseBoolean(find("loop", properties));

        final var buffer = Resources.audioBuffer(find("path", properties));
        if (buffer == null) { return null; }

        instance.source.initialize();
        instance.source.buffer(buffer);
        instance.source.gain(instance.gain);

        return instance;
    }

    @Override
    public boolean terminate() {
        if (source.isPlaying()) { source.stop(); }
        return source.terminate();
    }
}
