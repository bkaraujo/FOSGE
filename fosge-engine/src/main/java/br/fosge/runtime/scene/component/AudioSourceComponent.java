package br.fosge.runtime.scene.component;

import br.fosge.Logger;
import br.fosge.audio.AudioSource;
import br.fosge.runtime.Resources;
import br.fosge.runtime.platform.Platform;
import br.fosge.runtime.scene.Component;

public final class AudioSourceComponent extends Component {
    public final AudioSource source = Platform.audio.sourceCreate();
    private AudioSourceComponent(){}

    public static AudioSourceComponent create(br.fosge.runtime.configuration.api.Component component) {
        final var instance = new AudioSourceComponent();

        final var buffer = Resources.audio(find("path", component.properties()));
        if (buffer != null) {
            instance.source.buffer(buffer);
            return instance;
        }

        Logger.error("Failed to load: %s", find("path", component.properties()));
        return null;
    }

}
