package br.fosge.engine.runtime.ecs.component;

import br.fosge.commons.Logger;
import br.fosge.engine.audio.AudioSource;
import br.fosge.engine.configuration.Tuple;
import br.fosge.engine.ecs.Component;
import br.fosge.engine.ecs.ComponentType;
import br.fosge.engine.runtime.Platform;
import br.fosge.engine.runtime.Resources;

public final class AudioSourceComponent extends Component {
    public static final ComponentType type = ComponentType.AUDIO_SOURCE_COMPONENT;

    public final AudioSource source = Platform.audio.sourceCreate();
    public boolean loop;
    public float gain;

    private AudioSourceComponent(){}

    public static AudioSourceComponent create(Tuple... properties) {
        final var instance = new AudioSourceComponent();

        instance.loop = Boolean.parseBoolean(find("loop", properties));
        instance.gain = Float.parseFloat(find("gain", properties));

        final var buffer = Resources.audio(find("path", properties));
        if (buffer != null) {
            instance.source.buffer(buffer);
            instance.source.gain(instance.gain);
            return instance;
        }

        Logger.error("Failed to load: %s", find("path", properties));
        return null;
    }

    @Override
    public boolean terminate() {
        if (source.playing()) { source.stop(); }
        Platform.audio.sourceDestroy(source);
        return true;
    }
}
