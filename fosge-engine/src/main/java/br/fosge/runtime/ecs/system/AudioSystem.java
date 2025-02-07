package br.fosge.runtime.ecs.system;

import br.fosge.commons.Logger;
import br.fosge.engine.audio.AudioSourceComponent;
import br.fosge.engine.ecs.ECS;
import br.fosge.engine.ecs.System;

import java.util.ArrayList;
import java.util.List;

public class AudioSystem implements System {
    private final List<AudioSourceComponent> components = new ArrayList<>();

    @Override
    public void onAwake() {
        components.clear();
        components.addAll(ECS.list(AudioSourceComponent.class));
    }

    @Override
    public void onRest() {
        for (final var component : components) {
            if (component.loop && !component.source.isPlaying()) {
                Logger.debug(component.source.toString());
                component.source.play();
            }
        }
    }
}
