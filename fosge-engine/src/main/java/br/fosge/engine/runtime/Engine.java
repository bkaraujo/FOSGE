package br.fosge.engine.runtime;

import br.fosge.Logger;
import br.fosge.MessageBus;
import br.fosge.Time;
import br.fosge.annotation.Lifecycle;
import br.fosge.engine.ecs.System;
import br.fosge.engine.platform.window.WindowClosedEvent;
import br.fosge.engine.platform.window.WindowMinimizedEvent;
import br.fosge.engine.platform.window.WindowRestoredEvent;
import br.fosge.engine.runtime.application.ApplicationYaml;
import br.fosge.engine.runtime.ecs.system.AudioSystem;
import br.fosge.engine.runtime.platform.InputListener;
import br.fosge.engine.runtime.platform.PlatformState;
import br.fosge.engine.runtime.scene.Scene;
import br.fosge.message.MessageListener;
import br.fosge.message.MessagePipeline;
import org.lwjgl.glfw.GLFWErrorCallback;

import java.util.ArrayList;
import java.util.List;

import static br.fosge.engine.runtime.Platform.*;
import static br.fosge.engine.runtime.platform.Bindings.glfw;

public final class Engine implements Lifecycle {
    private GLFWErrorCallback glfwErrorCallback;
    private boolean running;
    private boolean suspended;
    private Scene scene;
    private final List<System> systems = new ArrayList<>();

    @Override
    public boolean initialize() {
        glfwErrorCallback = GLFWErrorCallback.createPrint(java.lang.System.err);
        glfwErrorCallback.set();

        if (!glfw.glfwInit()) {
            Logger.error("Failed to initialize GLFW");
            return false;
        }

        if (!window.initialize()) {
            Logger.error("Failed to initialize platform window");
            return false;
        }

        if (!graphics.initialize()) {
            Logger.error("Failed to initialize platform graphics");
            return false;
        }

        if (!audio.initialize()) {
            Logger.error("Failed to initialize platform audio");
            return false;
        }

        if (!network.initialize()) {
            Logger.error("Failed to initialize platform network");
            return false;
        }

        MessageBus.subscribe(this);
        MessageBus.subscribe(new InputListener());
        final var scenes = ApplicationYaml.get().application().scenes();
        if (scenes == null || scenes.length == 0) {
            Logger.error("No application scenes found");
            return false;
        }

        scene = Scene.create(scenes[0].name());
        if (scene == null) {
            Logger.error("Failed to create scene instance");
            return false;
        }

        if (!scene.initialize()) {
            Logger.error("Failed to initialize scene %s", scene.name);
            return false;
        }

        systems.add(new AudioSystem());

        return true;
    }

    public boolean run() {
        Logger.debug("FPS: %d", RuntimeState.framePerSecond);
        glfw.glfwShowWindow(PlatformState.window);

        running = true;

        final var STEP = 1 / 100d;

        long timer = Time.millis();
        double lastTime = Time.seconds();
        double accumulator = 0f;
        final var baseTitle = ApplicationYaml.get().application().window().title();

        while (running) {
            RuntimeState.frame++;

            if (!suspended) {
                RuntimeState.framePerSecond++;
                final var delta = Time.seconds() - lastTime;

                graphics.clear();
                systems.forEach(System::onAwake);
                scene.onAwake();

                lastTime += delta;
                accumulator += delta;
                while (accumulator >= STEP) {
                    accumulator -= STEP;
                    systems.forEach(s -> s.onSimulate(STEP));
                    RuntimeState.simulationPerSecond++;
                }

                systems.forEach(s -> s.onUpdate(delta));
                systems.forEach(System::onRest);
                systems.forEach(System::onGui);

                graphics.update();
                network.update();
            }

            long elapsed = Time.millis() - timer;
            if (elapsed > 1_000) {
                timer += elapsed;
                window.title("%s | FPS: %d SPS: %d".formatted(baseTitle, RuntimeState.framePerSecond, RuntimeState.simulationPerSecond));
                RuntimeState.framePerSecond = RuntimeState.simulationPerSecond = 0;
            }

            java.lang.System.arraycopy(RuntimeState.currKey, 0, RuntimeState.prevKey, 0, RuntimeState.currKey.length);
            java.lang.System.arraycopy(RuntimeState.currMouse, 0, RuntimeState.prevMouse, 0, RuntimeState.currMouse.length);

            window.update();
        }

        glfw.glfwHideWindow(PlatformState.window);
        return true;
    }

    @MessageListener
    public MessagePipeline handle(WindowClosedEvent event) {
        running = false;
        Logger.trace("Engine.running = false");
        return MessagePipeline.CONSUMED;
    }

    @MessageListener
    public MessagePipeline handle(WindowMinimizedEvent event) {
        suspended = true;
        Logger.trace("Engine.suspended = true");
        return MessagePipeline.CONSUMED;
    }

    @MessageListener
    public MessagePipeline handle(WindowRestoredEvent event) {
        suspended = false;
        Logger.trace("Engine.suspended = false");
        return MessagePipeline.CONSUMED;
    }

    @Override
    public boolean terminate() {
        if (!graphics.terminate()) {
            Logger.error("Failed to terminate platform graphics");
            return false;
        }

        if (!window.terminate()) {
            Logger.error("Failed to terminate platform window");
            return false;
        }

        if (!network.terminate()) {
            Logger.error("Failed to terminate platform network");
            return false;
        }

        if (!audio.terminate()) {
            Logger.error("Failed to terminate platform audio");
            return false;
        }

        glfw.glfwTerminate();

        if (glfwErrorCallback != null) {
            glfwErrorCallback.free();
        }

        Memory.free();

        return true;
    }
}
