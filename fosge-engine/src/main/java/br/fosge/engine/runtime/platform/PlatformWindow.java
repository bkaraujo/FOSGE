package br.fosge.engine.runtime.platform;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.commons.MessageBus;
import br.fosge.commons.Meta;
import br.fosge.commons.annotation.Lifecycle;
import br.fosge.commons.graphics.Resolution;
import br.fosge.commons.message.MessageListener;
import br.fosge.commons.message.MessagePipeline;
import br.fosge.engine.input.Keyboard;
import br.fosge.engine.input.Mouse;
import br.fosge.engine.platform.input.*;
import br.fosge.engine.platform.window.*;
import org.lwjgl.glfw.Callbacks;
import org.lwjgl.system.MemoryUtil;

import static br.fosge.engine.runtime.platform.Bindings.glfw;
import static br.fosge.engine.runtime.platform.binding.glfw.GLFWConstants.*;

public final class PlatformWindow implements Lifecycle {

    @Override
    public boolean initialize() {
        glfw.glfwDefaultWindowHints();
        glfw.glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfw.glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);

        glfw.glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 4);
        glfw.glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 6);
//        glfwWindowHint(GLFW_OPENGL_DEBUG_CONTEXT, GLFW_TRUE);
        glfw.glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);

        final var spec = RT.yaml.subtree("fosge.application.window");
        final var resolution = spec.asEnum("resolution", Resolution.class);

        // Create the window
        RT.Window.handle = glfw.glfwCreateWindow(resolution.width, resolution.height, spec.asString("title"), MemoryUtil.NULL, MemoryUtil.NULL);
        if (RT.Window.handle == MemoryUtil.NULL) {
            Logger.error("Failed to create the GLFW window");
            return false;
        }

        RT.Window.visible = false;
        RT.Window.maximized = glfw.glfwGetWindowAttrib(RT.Window.handle, GLFW_MAXIMIZED) == GLFW_TRUE;
        RT.Window.minimized = glfw.glfwGetWindowAttrib(RT.Window.handle, GLFW_ICONIFIED) == GLFW_TRUE;
        RT.Window.focused = glfw.glfwGetWindowAttrib(RT.Window.handle, GLFW_FOCUSED) == GLFW_TRUE;
        RT.Window.size.set(resolution.width, resolution.height);

        final var vmode = glfw.glfwGetVideoMode(glfw.glfwGetPrimaryMonitor());
        if (vmode != null) {
            RT.Window.position.set(
                    (vmode.width() - resolution.width) / 2,
                    (vmode.height() -  resolution.height) / 2
            );

        }

        glfw.glfwSetWindowPos(RT.Window.handle, RT.Window.position.x(), RT.Window.position.y());

        glfw.glfwSetWindowCloseCallback(RT.Window.handle, (window) -> MessageBus.submit(new WindowClosedEvent()));
        glfw.glfwSetWindowPosCallback(RT.Window.handle, (window, x, y) -> MessageBus.submit(new WindowMovedEvent(x, y)));
        glfw.glfwSetWindowSizeCallback(RT.Window.handle, (window, w, h) -> MessageBus.submit(new WindowResizedEvent(w, h)));
        glfw.glfwSetWindowFocusCallback(RT.Window.handle, (window, b) -> MessageBus.submit(b ? new WindowFocusGainedEvent() : new WindowsFocusLostEvent()));
        glfw.glfwSetWindowIconifyCallback(RT.Window.handle, (window, b) -> MessageBus.submit(b ? new WindowMinimizedEvent() : new WindowRestoredEvent()));
        glfw.glfwSetWindowMaximizeCallback(RT.Window.handle, (window, b) -> MessageBus.submit(b ? new WindowMaximizedEvent() : new WindowRestoredEvent()));

        glfw.glfwSetScrollCallback(RT.Window.handle, (window, x, y) -> MessageBus.submit(new InputMouseScrolledEvent((byte) (x > 0 ? 1 :(x < 0 ? -1 : 0)))));
        glfw.glfwSetCursorPosCallback(RT.Window.handle, (window , x, y) -> MessageBus.submit(new InputMouseMovedEvent(x, y)));
        glfw.glfwSetCursorEnterCallback(RT.Window.handle, (window, entered) -> MessageBus.submit(entered ? new InputMouseEnteredEvent() : new InputMouseLeftEvent()));
        glfw.glfwSetMouseButtonCallback(RT.Window.handle, (window, button, action, mods) -> MessageBus.submit(action != GLFW_RELEASE ? new InputMousePressedEvent(Mouse.from(button)) : new InputMouseReleasedEvent(Mouse.from(button))));

        glfw.glfwSetKeyCallback(RT.Window.handle, (window, key, scancode, action, mods) -> MessageBus.submit(action != GLFW_RELEASE ? new InputKeyboardPressedEvent(Keyboard.from(key)) : new InputKeyboardReleasedEvent(Keyboard.from(key))));

        MessageBus.subscribe(this);
        return true;
    }

    public String title() {
        return glfw.glfwGetWindowTitle(RT.Window.handle);
    }

    public void title(String title) {
        glfw.glfwSetWindowTitle(RT.Window.handle, title);
    }

    @MessageListener
    public MessagePipeline handle(WindowResizedEvent event) {
        RT.Window.size.set(event.width, event.height);
        RT.Window.aspectRatio = (float) event.width / event.height;
        return MessagePipeline.CONSUMED;
    }

    @MessageListener
    public MessagePipeline handle(WindowMovedEvent event) {
        RT.Window.position.set(event.x, event.y);
        return MessagePipeline.CONSUMED;
    }

    @MessageListener
    public MessagePipeline handle(WindowStateEvent event) {
        RT.Window.maximized = Meta.assignable(event, WindowMaximizedEvent.class);;
        RT.Window.minimized = Meta.assignable(event, WindowMinimizedEvent.class);;
        return MessagePipeline.CONSUMED;
    }

    @MessageListener
    public MessagePipeline handle(WindowFocusEvent event) {
        RT.Window.focused = Meta.assignable(event, WindowFocusGainedEvent.class);
        return MessagePipeline.CONSUMED;
    }

    public void show() {
        glfw.glfwShowWindow(RT.Window.handle);
        RT.Window.visible = true;
    }

    public void hide() {
        glfw.glfwHideWindow(RT.Window.handle);
        RT.Window.visible = false;
    }

    public void update() {
        glfw.glfwPollEvents();
    }

    @Override
    public boolean terminate() {
        glfw.glfwMakeContextCurrent(MemoryUtil.NULL);

        if (RT.Window.handle != MemoryUtil.NULL) {
            Callbacks.glfwFreeCallbacks(RT.Window.handle);
            glfw.glfwDestroyWindow(RT.Window.handle);
            RT.Window.handle = MemoryUtil.NULL;
        }

        return true;
    }

}
