package br.fosge.engine.runtime.platform;

import br.fosge.Logger;
import br.fosge.engine.MessageBus;
import br.fosge.engine.annotation.Lifecycle;
import br.fosge.engine.configuration.ConfigurationFile;
import br.fosge.engine.input.Keyboard;
import br.fosge.engine.input.Mouse;
import br.fosge.engine.message.MessageListener;
import br.fosge.engine.message.Result;
import br.fosge.engine.platform.input.*;
import br.fosge.engine.platform.window.*;
import org.lwjgl.glfw.Callbacks;
import org.lwjgl.system.MemoryUtil;

import static br.fosge.engine.runtime.platform.Bindings.glfw;
import static br.fosge.engine.runtime.platform.glfw.GLFWConstants.*;

public final class PlatformWindow implements Lifecycle {
    PlatformWindow() { /* Private constructor */ }

    @Override
    public boolean initialize() {
        glfw.glfwDefaultWindowHints();
        glfw.glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfw.glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);

        glfw.glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 4);
        glfw.glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 6);
//        glfwWindowHint(GLFW_OPENGL_DEBUG_CONTEXT, GLFW_TRUE);
        glfw.glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);

        final var spec = ConfigurationFile.get().application().window();

        // Create the window
        PlatformState.window = glfw.glfwCreateWindow(spec.resolution().width, spec.resolution().height, spec.title(), MemoryUtil.NULL, MemoryUtil.NULL);
        if (PlatformState.window == MemoryUtil.NULL) {
            Logger.error("Failed to create the GLFW window");
            return false;
        }

        PlatformState.windowVisible = false;
        PlatformState.windowMaximized = glfw.glfwGetWindowAttrib(PlatformState.window, GLFW_MAXIMIZED) == GLFW_TRUE;
        PlatformState.windowMinimized = glfw.glfwGetWindowAttrib(PlatformState.window, GLFW_ICONIFIED) == GLFW_TRUE;
        PlatformState.windowFocused = glfw.glfwGetWindowAttrib(PlatformState.window, GLFW_FOCUSED) == GLFW_TRUE;
        PlatformState.windowSize.set(spec.resolution().width, spec.resolution().height);

        final var vmode = glfw.glfwGetVideoMode(glfw.glfwGetPrimaryMonitor());
        if (vmode != null) {
            PlatformState.windowPosition.set(
                    (vmode.width() - spec.resolution().width) / 2,
                    (vmode.height() -  spec.resolution().height) / 2
            );

        }

        glfw.glfwSetWindowPos(PlatformState.window, PlatformState.windowPosition.x(), PlatformState.windowPosition.y());

        glfw.glfwSetWindowCloseCallback(PlatformState.window, (_) -> MessageBus.submit(new WindowClosedEvent()));
        glfw.glfwSetWindowPosCallback(PlatformState.window, (_, x, y) -> MessageBus.submit(new WindowMovedEvent(x, y)));
        glfw.glfwSetWindowSizeCallback(PlatformState.window, (_, w, h) -> MessageBus.submit(new WindowResizedEvent(w, h)));
        glfw.glfwSetWindowFocusCallback(PlatformState.window, (_, b) -> MessageBus.submit(b ? new WindowFocusGainedEvent() : new WindowsFocusLostEvent()));
        glfw.glfwSetWindowIconifyCallback(PlatformState.window, (_, b) -> MessageBus.submit(b ? new WindowMinimizedEvent() : new WindowRestoredEvent()));
        glfw.glfwSetWindowMaximizeCallback(PlatformState.window, (_, b) -> MessageBus.submit(b ? new WindowMaximizedEvent() : new WindowRestoredEvent()));

        glfw.glfwSetScrollCallback(PlatformState.window, (_, x, _) -> MessageBus.submit(new InputMouseScrolledEvent((byte) (x > 0 ? 1 :(x < 0 ? -1 : 0)))));
        glfw.glfwSetCursorPosCallback(PlatformState.window, (_ , x, y) -> MessageBus.submit(new InputMouseMovedEvent(x, y)));
        glfw.glfwSetCursorEnterCallback(PlatformState.window, (_, entered) -> MessageBus.submit(entered ? new InputMouseEnteredEvent() : new InputMouseLeftEvent()));
        glfw.glfwSetMouseButtonCallback(PlatformState.window, (_, button, action, _) -> MessageBus.submit(action != GLFW_RELEASE ? new InputMousePressedEvent(Mouse.from(button)) : new InputMouseReleasedEvent(Mouse.from(button))));

        glfw.glfwSetKeyCallback(PlatformState.window, (_, key, _, action, _) -> MessageBus.submit(action != GLFW_RELEASE ? new InputKeyboardPressedEvent(Keyboard.from(key)) : new InputKeyboardReleasedEvent(Keyboard.from(key))));

        MessageBus.subscribe(this);
        return true;
    }

    public void title(String title) {
        glfw.glfwSetWindowTitle(PlatformState.window, title);
    }

    @MessageListener
    public Result handle(WindowResizedEvent event) {
        PlatformState.windowAspectRatio = (float) event.width / event.height;
        return Result.AVAILABLE;
    }

    @Override
    public boolean terminate() {
        glfw.glfwMakeContextCurrent(MemoryUtil.NULL);

        if (PlatformState.window != MemoryUtil.NULL) {
            Callbacks.glfwFreeCallbacks(PlatformState.window);
            glfw.glfwDestroyWindow(PlatformState.window);
            PlatformState.window = MemoryUtil.NULL;
        }

        return true;
    }

    public void update() {
        glfw.glfwPollEvents();
    }

}
