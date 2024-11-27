package br.fosge.runtime.scene.component;

import br.fosge.Logger;
import br.fosge.audio.AudioSource;
import br.fosge.runtime.Resources;
import br.fosge.runtime.configuration.api.Tuple;
import br.fosge.runtime.platform.Platform;
import br.fosge.runtime.scene.Actor;
import br.fosge.runtime.scene.Component;

public final class AudioSourceComponent extends Component {
    public AudioSourceComponent(Actor actor) { super(actor); }

    public final AudioSource source = Platform.audio.sourceCreate();

    public static AudioSourceComponent create(final Actor actor, Tuple... properties) {
        final var component = new AudioSourceComponent(actor);

        final var buffer = Resources.audio(find("path", properties));
        if (buffer != null) {
            component.source.buffer(buffer);
            return component;
        }

        Logger.error("Failed to load: %s", find("path", properties));
        return null;
    }
}
