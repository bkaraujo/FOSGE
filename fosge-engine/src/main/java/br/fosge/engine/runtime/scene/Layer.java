package br.fosge.engine.runtime.scene;

import br.fosge.Logger;
import br.fosge.engine.annotation.Lifecycle;
import br.fosge.engine.runtime.Graphics;
import br.fosge.engine.runtime.application.OnFrame;
import br.fosge.engine.runtime.ecs.ECS;
import br.fosge.engine.runtime.ecs.component.MeshComponent;
import br.fosge.engine.runtime.ecs.component.TransformComponent;
import br.fosge.engine.runtime.object.Identity;
import br.fosge.tools.Meta;
import com.github.f4b6a3.ulid.Ulid;

import java.util.ArrayList;
import java.util.List;

public final class Layer implements Lifecycle, OnFrame {

    public final Ulid identity;
    public final Scene scene;
    public final String name;
    public final List<Actor> actors = new ArrayList<>();

    public Layer(Scene scene, Ulid identity, String name) {
        this.scene = scene;
        this.identity = identity;
        this.name = name;
    }

    public static Layer create(Scene scene, br.fosge.engine.configuration.Layer desired) {
        final var layer = new Layer(scene, Identity.generate(), desired.name());
        for (final var actor : desired.actors()) {
            final var instance = Actor.create(layer, actor);
            if (instance == null) {
                Logger.error("Failed to create actor");
                continue;
            }
            layer.actors.add(instance);
        }

        return layer;
    }

    @Override
    public boolean initialize() {
        Logger.debug("Initializing layer: %s", name);
        for(final var actor : actors) {
            if (!actor.initialize()) {
                Logger.error("Failed to initialize actor %s", actor.name);
                return false;
            }
        }

        return true;
    }

    @Override
    public void onAwake() {
        for(final var actor : actors) {
            actor.onAwake();
        }
    }

    @Override
    public void onSimulate(double step) {
        for(final var actor : actors) {
            actor.onSimulate(step);
        }
    }

    @Override
    public void onUpdate(double delta) {
        for(final var actor : actors) {
            actor.onUpdate(delta);
        }

        for(final var actor : actors) {
            for (final var component : ECS.list(actor.identity)){
                if (Meta.assignable(component, MeshComponent.class)) {
                    final var mesh = Meta.cast(component, MeshComponent.class);
                    final var transform = actor.get(TransformComponent.class);

                    mesh.shader.uniform("un_model", transform.matrix());
                    mesh.shader.uniform("un_viewProjection", actor.layer.scene.camera.viewProjectionMatrix());
                    Graphics.draw(mesh.shader, mesh.geometry, mesh.texture);
                }
            }
        }
    }

    @Override
    public void onGui() {
        for(final var actor : actors) {
            actor.onGui();
        }
    }

    @Override
    public void onRest() {
        for(final var actor : actors) {
            actor.onRest();
        }
    }

    @Override
    public boolean terminate() {
        Logger.debug("Terminating layer: %s", name);
        for(final var actor : actors) {
            if (!actor.terminate()) {
                Logger.error("Failed to terminate actor %s", actor.name);
                return false;
            }
        }

        return true;
    }
}
