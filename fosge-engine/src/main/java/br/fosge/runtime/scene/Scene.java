package br.fosge.runtime.scene;

import br.fosge.Logger;
import br.fosge.annotation.Lifecycle;
import br.fosge.runtime.OnFrame;
import br.fosge.runtime.configuration.ConfigurationFile;
import br.fosge.scene.Camera;
import br.fosge.scene.Camera2DSpec;
import org.joml.Vector4f;

import java.util.ArrayList;
import java.util.List;

import static br.fosge.runtime.platform.Bindings.opengl;

public final class Scene implements Lifecycle, OnFrame {

    public final String name;
    public final Vector4f clearColor = new Vector4f();
    public final List<Layer> layers = new ArrayList<>();
    public final Camera camera = new Camera2D();

    private Scene(String name) {
        this.name = name;
    }

    public static Scene create(String name) {
        br.fosge.runtime.configuration.api.Scene desired = null;
        for (final var record : ConfigurationFile.get().application().scenes()) {
            if (record.name().contentEquals(name)) {
                desired = record;
                break;
            }
        }

        if (desired == null) {
            Logger.fatal("Scene name %s not found in configuration file", name);
            return null;
        }

        final var scene = new Scene(name);
        if (!scene.camera.configure(new Camera2DSpec(
                desired.camera().left(),
                desired.camera().right(),
                desired.camera().bottom(),
                desired.camera().top(),
                desired.camera().near(),
                desired.camera().far()
        ))) {
            Logger.fatal("Failed to configure scene %s camera", scene.name);
        }

        scene.clearColor.set(
                desired.clearColor().red(),
                desired.clearColor().green(),
                desired.clearColor().blue(),
                desired.clearColor().alpha()
        );

        for (final var layer : desired.layers()) {
            scene.layers.add(Layer.create(scene, layer));
        }

        return scene;
    }

    @Override
    public boolean initialize() {
        Logger.debug("Initializing scene: %s", name);
        opengl.glClearColor(clearColor.x, clearColor.y, clearColor.z, clearColor.w);

        for(final var layer : layers) {
            if (!layer.initialize()) {
                Logger.error("Failed to initialize layer %s", layer.name);
                return false;
            }
        }

        return true;
    }

    @Override
    public void onAwake() {
        for(final var layer : layers) {
            layer.onAwake();
        }
    }

    @Override
    public void onSimulate(double step) {
        for(final var layer : layers) {
            layer.onSimulate(step);
        }
    }

    @Override
    public void onUpdate(double delta) {
        for(final var layer : layers) {
            layer.onUpdate(delta);
        }
    }

    @Override
    public void onGui() {
        for(final var layer : layers) {
            layer.onGui();
        }
    }

    @Override
    public void onRest() {
        for(final var layer : layers) {
            layer.onRest();
        }
    }

    @Override
    public boolean terminate() {
        Logger.debug("Terminating scene: %s", name);
        for(final var layer : layers.reversed()) {
            if (!layer.initialize()) {
                Logger.error("Failed to terminate layer %s", layer.name);
                return false;
            }
        }

        return true;
    }

}