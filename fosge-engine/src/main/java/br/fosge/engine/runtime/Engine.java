package br.fosge.engine.runtime;

import br.fosge.Logger;
import br.fosge.Time;
import br.fosge.engine.MessageBus;
import br.fosge.engine.annotation.Lifecycle;
import br.fosge.engine.message.MessageListener;
import br.fosge.engine.message.Result;
import br.fosge.engine.runtime.configuration.ConfigurationFile;
import br.fosge.engine.runtime.platform.PlatformState;
import br.fosge.engine.runtime.platform.window.WindowClosedEvent;
import br.fosge.engine.runtime.platform.window.WindowMinimizedEvent;
import br.fosge.engine.runtime.platform.window.WindowRestoredEvent;
import br.fosge.engine.runtime.scene.Scene;
import org.lwjgl.glfw.GLFWErrorCallback;

import static br.fosge.engine.runtime.platform.Bindings.glfw;
import static br.fosge.engine.runtime.platform.Platform.*;

public final class Engine implements Lifecycle {
    private GLFWErrorCallback glfwErrorCallback;
    private boolean running;
    private boolean suspended;
    private Scene scene;

    @Override
    public boolean initialize() {
        glfwErrorCallback = GLFWErrorCallback.createPrint(System.err);
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
        scene = Scene.create(ConfigurationFile.get().application().scenes()[0].name());
        if (!scene.initialize()) {
            Logger.error("Failed to initialize scene %s", scene.name);
            return false;
        }

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
        final var baseTitle = ConfigurationFile.get().application().window().title();

        while (running) {
            RuntimeState.frame++;

            if (!suspended) {
                RuntimeState.framePerSecond++;
                final var delta = Time.seconds() - lastTime;

                graphics.clear();
                scene.onAwake();

                lastTime += delta;
                accumulator += delta;
                while (accumulator >= STEP) {
                    accumulator -= STEP;
                    scene.onSimulate(STEP);
                    RuntimeState.simulationPerSecond++;
                }

                scene.onUpdate(delta);
                scene.onRest();
                scene.onGui();

                graphics.update();
                network.update();
            }

            long elapsed = Time.millis() - timer;
            if (elapsed > 1_000) {
                timer += elapsed;
                window.title("%s | FPS: %d SPS: %d".formatted(baseTitle, RuntimeState.framePerSecond, RuntimeState.simulationPerSecond));
                RuntimeState.framePerSecond = RuntimeState.simulationPerSecond = 0;
            }

            System.arraycopy(CoreState.currKey, 0, CoreState.prevKey, 0, CoreState.currKey.length);
            System.arraycopy(CoreState.currMouse, 0, CoreState.prevMouse, 0, CoreState.currMouse.length);

            window.update();
        }

        glfw.glfwHideWindow(PlatformState.window);
        return true;
    }

    @MessageListener
    public Result handle(WindowClosedEvent event) {
        running = false;
        Logger.trace("Engine.running = false");
        return Result.AVAILABLE;
    }

    @MessageListener
    public Result handle(WindowMinimizedEvent event) {
        suspended = true;
        Logger.trace("Engine.suspended = true");
        return Result.AVAILABLE;
    }

    @MessageListener
    public Result handle(WindowRestoredEvent event) {
        suspended = false;
        Logger.trace("Engine.suspended = false");
        return Result.AVAILABLE;
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
