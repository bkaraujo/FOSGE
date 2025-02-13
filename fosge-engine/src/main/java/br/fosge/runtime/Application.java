package br.fosge.runtime;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.commons.MessageBus;
import br.fosge.commons.Time;
import br.fosge.commons.annotation.Lifecycle;
import br.fosge.commons.event.ApplicationResumedEvent;
import br.fosge.commons.event.ApplicationStartedEvent;
import br.fosge.commons.event.ApplicationStoppedEvent;
import br.fosge.commons.event.ApplicationSuspendedEvent;
import br.fosge.commons.message.MessageListener;
import br.fosge.commons.message.MessagePipeline;
import br.fosge.engine.ecs.ECS;
import br.fosge.engine.ecs.System;
import br.fosge.engine.platform.window.WindowClosedEvent;
import br.fosge.engine.platform.window.WindowMinimizedEvent;
import br.fosge.engine.platform.window.WindowRestoredEvent;
import br.fosge.runtime.ecs.system.AudioSystem;
import br.fosge.runtime.ecs.system.BehaviourSystem;
import br.fosge.runtime.ecs.system.RenderSystem;
import br.fosge.runtime.renderer.Renderer;
import br.fosge.runtime.scene.Scene;

import static br.fosge.RT.Application.scene;
import static br.fosge.RT.Application.systems;
import static br.fosge.RT.Platform.*;
import static br.fosge.RT.yaml;

public final class Application implements Lifecycle {
    private double STEP;

    @Override
    public boolean initialize() {
        MessageBus.subscribe(this);

        final var engine = yaml.subtree("fosge.engine");
        if (engine != null && engine.contains("simulation.step")) {
            STEP = 1 / engine.asDouble("simulation.step");
        } else {
            STEP = 1 / 100d;
        }

        final var firstScene = yaml.asString("fosge.application.firstScene");
        scene = Scene.of(firstScene);
        if (scene == null) { Logger.error("Failed to load scene: %s", firstScene); return false; }
        if (!scene.initialize()) { Logger.error("Failed to initialize scene: %s", scene); return false; }

        graphics.clearColor(scene.clearColor());

        ECS.attach(new AudioSystem());
        ECS.attach(new BehaviourSystem());
        ECS.attach(new RenderSystem());

        Logger.info("Application initialized");
        return true;
    }

    public boolean run() {
        long timer = Time.millis();
        double lastTime = Time.seconds();
        double accumulator = 0f;
        final var baseTitle = window.title();

        MessageBus.submit(new ApplicationStartedEvent());

        while (RT.running) {
            RT.frame++;

            if (!RT.suspended) {
                Renderer.beginFrame(scene);
                RT.framePerSecond++;
                final var delta = Time.seconds() - lastTime;

                graphics.clear();
                systems.forEach(System::onAwake);

                lastTime += delta;
                accumulator += delta;
                while (accumulator >= STEP) {
                    accumulator -= STEP;
                    systems.forEach(s -> s.onSimulate(STEP));
                    RT.simulationPerSecond++;
                }

                systems.forEach(s -> s.onUpdate(delta));
                systems.forEach(System::onRest);
                systems.forEach(System::onGui);

                Renderer.endFrame();
            }

            long elapsed = Time.millis() - timer;
            if (elapsed > 1_000) {
                timer += elapsed;
                window.title("%s | FPS: %d SPS: %d".formatted(baseTitle, RT.framePerSecond, RT.simulationPerSecond));
                RT.framePerSecond = RT.simulationPerSecond = 0;
            }

            input.update(); // must be b4 window.update
            window.update();
        }

        return true;
    }

    @MessageListener
    public MessagePipeline handle(WindowClosedEvent event) {
        RT.running = false;
        MessageBus.submit(new ApplicationStoppedEvent());
        return MessagePipeline.CONSUMED;
    }

    @MessageListener
    public MessagePipeline handle(WindowMinimizedEvent event) {
        RT.suspended = true;
        MessageBus.submit(new ApplicationSuspendedEvent());
        return MessagePipeline.CONSUMED;
    }

    @MessageListener
    public MessagePipeline handle(WindowRestoredEvent event) {
        RT.suspended = false;
        MessageBus.submit(new ApplicationResumedEvent());
        return MessagePipeline.CONSUMED;
    }

    @Override
    public boolean terminate() {
        if (scene != null && !scene.terminate()) {
            Logger.fatal("Failed to terminate scene %s: ", scene);
        }

        return true;
    }
}
