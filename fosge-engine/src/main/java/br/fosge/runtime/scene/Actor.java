package br.fosge.runtime.scene;

import br.fosge.Logger;
import br.fosge.Meta;
import br.fosge.annotation.Lifecycle;
import br.fosge.runtime.OnFrame;
import br.fosge.runtime.scene.component.AudioSourceComponent;
import br.fosge.runtime.scene.component.MeshComponent;
import br.fosge.runtime.scene.component.TransformComponent;

import java.util.ArrayList;
import java.util.List;

public final class Actor implements Lifecycle, OnFrame {

    public final Layer layer;
    public final String name;
    public final List<Component> components = new ArrayList<>();

    private Actor(Layer layer, String name) {
        this.layer = layer;
        this.name = name;
    }

    public static Actor create(Layer layer, br.fosge.runtime.configuration.api.Actor desired) {
        final var actor = new Actor(layer, desired.name());
        actor.components.add(new TransformComponent(actor));

        for (final var component : desired.components()) {
            switch (component.type()) {
                default: { Logger.fatal("Unknown component type: %s", component.type()); } break;

                case "MeshComponent": {
                    final var instance = MeshComponent.create(actor, component.properties());
                    if (instance != null) {
                        actor.components.add(instance);
                    }
                } break;

                case "AudioSourceComponent": {
                    final var instance = AudioSourceComponent.create(actor, component.properties());
                    if (instance != null) {
                        actor.components.add(instance);
                    }
                } break;
            }
        }

        return actor;
    }

    public <T extends Component> T get(Class<T> type) {
        for (final Component component : components) {
            if (Meta.assignable(component, type)) {
                return Meta.cast(component, type);
            }
        }

        return null;
    }

    @Override
    public boolean initialize() {
        Logger.debug("Initializing actor: %s", name);
        for(final var component : components) {
            if (!component.initialize()) {
                Logger.error("Failed to initialize component %s", Meta.fqn(component));
                return false;
            }
        }

        return true;
    }

    @Override
    public void onAwake() {
        for(final var component : components) {
            component.onAwake();
        }
    }

    @Override
    public void onSimulate(double step) {
        for(final var component : components) {
            component.onSimulate(step);
        }
    }

    @Override
    public void onUpdate(double delta) {
        for(final var component : components) {
            component.onUpdate(delta);
        }
    }

    @Override
    public void onGui() {
        for(final var component : components) {
            component.onGui();
        }
    }

    @Override
    public void onRest() {
        for(final var component : components) {
            component.onRest();
        }
    }

    @Override
    public boolean terminate() {
        Logger.debug("Terminating actor: %s", name);
        for(final var component : components) {
            if (!component.initialize()) {
                Logger.error("Failed to terminate component %s", Meta.fqn(component));
                return false;
            }
        }

        return true;
    }
}
