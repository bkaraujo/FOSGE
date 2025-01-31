package br.fosge.engine.runtime.ecs.system;

import br.fosge.engine.ecs.BehaviourComponent;
import br.fosge.engine.ecs.ECS;
import br.fosge.engine.ecs.System;

import java.util.ArrayList;
import java.util.List;

public final class BehaviourSystem implements System {
    private final List<BehaviourComponent> components = new ArrayList<>();

    @Override
    public void onAwake() {
        components.clear();
        components.addAll(ECS.list(BehaviourComponent.class));
        for (final var component : components) {
            component.onAwake();
        }
    }

    @Override
    public void onSimulate(double step) {
        for (final var component : components) {
            component.onSimulate(step);
        }
    }

    @Override
    public void onUpdate(double delta) {
        for (final var component : components) {
            component.onUpdate(delta);
        }
    }

    @Override
    public void onRest() {
        for (final var component : components) {
            component.onRest();
        }
    }

    @Override
    public void onGui() {
        for (final var component : components) {
            component.onGui();
        }
    }
}
