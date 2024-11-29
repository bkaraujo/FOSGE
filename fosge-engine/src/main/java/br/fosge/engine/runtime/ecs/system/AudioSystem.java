package br.fosge.engine.runtime.ecs.system;

import br.fosge.engine.ecs.System;
import br.fosge.engine.runtime.ecs.ECS;
import br.fosge.engine.runtime.ecs.component.AudioSourceComponent;

import java.util.ArrayList;
import java.util.List;

public final class AudioSystem implements System {
    private final List<AudioSourceComponent> components = new ArrayList<>();

    @Override
    public void onAwake() {
        components.clear();
        components.addAll(ECS.list(AudioSourceComponent.class));
    }

    @Override
    public void onUpdate(double delta) {
        for (final var component : components) {
            final var source = component.source;
            if (component.loop && !source.playing()) {
                source.play();
            }
        }
    }
}
