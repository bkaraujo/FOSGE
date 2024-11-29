package br.fosge.engine.runtime.scene;

import br.fosge.Logger;
import br.fosge.engine.annotation.Lifecycle;
import br.fosge.engine.ecs.Component;
import br.fosge.engine.runtime.application.OnFrame;
import br.fosge.engine.runtime.object.Identity;
import br.fosge.engine.runtime.scene.component.AudioSourceComponent;
import br.fosge.engine.runtime.scene.component.BehaviourComponent;
import br.fosge.engine.runtime.scene.component.MeshComponent;
import br.fosge.engine.runtime.scene.component.TransformComponent;
import br.fosge.tools.Meta;
import com.github.f4b6a3.ulid.Ulid;

import java.util.ArrayList;
import java.util.List;

public final class Actor implements Lifecycle, OnFrame {

    public final Ulid identity;
    public final Layer layer;
    public final String name;
    public final List<Component> components = new ArrayList<>();

    private Actor(Layer layer, Ulid identity, String name) {
        this.layer = layer;
        this.identity = identity;
        this.name = name;
    }

    public static Actor create(Layer layer, br.fosge.engine.configuration.Actor desired) {
        final var actor = new Actor(layer, Identity.generate(), desired.name());
        actor.components.add(TransformComponent.create());

        for (final var component : desired.components()) {
            final var instance = switch (component.type()) {
                default -> { Logger.fatal("Unknown component type: %s", component.type()); yield null; }
                case "MeshComponent" -> MeshComponent.create(component.properties());
                case "AudioSourceComponent" -> AudioSourceComponent.create(component.properties());
                case "BehaviourComponent" -> BehaviourComponent.create(component.properties());
            };

            if (instance == null) {
                Logger.fatal("Unknown component type: %s", component.type());
                return null;
            }

            Meta.set(instance, "actor", actor);
            actor.components.add(instance);
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
