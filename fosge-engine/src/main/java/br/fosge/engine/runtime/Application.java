package br.fosge.engine.runtime;

import br.fosge.Logger;
import br.fosge.Version;
import br.fosge.engine.MessageBus;
import br.fosge.engine.annotation.Lifecycle;
import br.fosge.engine.annotation.Specification;
import br.fosge.engine.runtime.platform.PlatformSpec;
import br.fosge.engine.runtime.scene.Layer;
import br.fosge.tools.Meta;

public record Application(
        String title,
        Version version,
        PlatformSpec platformSpec,
        Layer... layers
) implements Specification, Lifecycle, OnFrame {

    @Override
    public boolean initialize() {
        for (final var layer : layers) {
            Logger.debug("Initializing %s", Meta.fqn(layer));
            if (!layer.initialize()) {
                Logger.error("Failed to initialize %s", Meta.fqn(layer));
                return false;
            }

            MessageBus.subscribe(layer);
        }

        return true;
    }

    public void onAwake() { for (final var layer : layers) { layer.onAwake(); } }
    public void onSimulate(double step) { for (final var layer : layers) { layer.onSimulate(step); } }
    public void onUpdate(double delta) { for (final var layer : layers) { layer.onUpdate(delta); } }
    public void onGui() { for (final var layer : layers) { layer.onGui(); } }
    public void onRest() { for (final var layer : layers) { layer.onRest(); } }

    @Override
    public boolean terminate() {
        for (int i = layers.length - 1 ; i >= 0 ; i--) {
            Logger.debug("Terminating %s", Meta.fqn(layers[i]));

            if (!layers[i].terminate()) {
                Logger.error("Failed to terminate %s", Meta.fqn(layers[i]));
                return false;
            }
        }

        return true;
    }
}
