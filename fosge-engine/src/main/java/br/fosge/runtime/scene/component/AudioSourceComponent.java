package br.fosge.runtime.scene.component;

import br.fosge.Logger;
import br.fosge.audio.AudioSource;
import br.fosge.runtime.Resources;
import br.fosge.runtime.platform.Platform;
import br.fosge.runtime.scene.Component;

public final class AudioSourceComponent extends Component {
    public final AudioSource source = Platform.audio.sourceCreate();
    public boolean loop;
    public float gain;

    private AudioSourceComponent(){}

    public static AudioSourceComponent create(br.fosge.runtime.configuration.api.Component component) {
        final var instance = new AudioSourceComponent();

        instance.loop = Boolean.parseBoolean(find("loop", component.properties()));
        instance.gain = Float.parseFloat(find("gain", component.properties()));

        final var buffer = Resources.audio(find("path", component.properties()));
        if (buffer != null) {
            instance.source.buffer(buffer);
            instance.source.gain(instance.gain);
            return instance;
        }

        Logger.error("Failed to load: %s", find("path", component.properties()));
        return null;
    }

    @Override
    public void onUpdate(double delta) {
        if (loop && !source.playing()) {
            source.play();
        }
    }
}
