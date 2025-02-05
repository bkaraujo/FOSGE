package br.fosge.engine.audio;

import br.fosge.engine.ecs.Component;

public final class AudioSourceComponent extends Component {
    public AudioSource source;
    public boolean loop;
    public float gain;

    @Override
    public boolean terminate() {
        if (source.isPlaying()) { source.stop(); }
        return source.terminate();
    }
}
