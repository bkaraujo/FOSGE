package br.fosge.engine.runtime.platform.binding.glfw.impl;

import br.fosge.engine.runtime.platform.binding.glfw.api.*;
import org.lwjgl.glfw.*;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

public class GLFW2x extends GLFW1x implements GLFW21, GLFW22, GLFW23, GLFW24, GLFW25 {

    public final void glfwIconifyWindow(long window) {
        GLFW.glfwIconifyWindow(window);
    }

    public final void glfwRestoreWindow(long window) {
        GLFW.glfwRestoreWindow(window);
    }

    public final GLFWScrollCallback glfwSetScrollCallback(long window, GLFWScrollCallbackI cbfun) {
        return GLFW.glfwSetScrollCallback(window, cbfun);
    }

    public final void glfwWindowHint(int hint, int value) {
        GLFW.glfwWindowHint(hint, value);
    }

    public final FloatBuffer glfwGetJoystickAxes(int jid) {
        return GLFW.glfwGetJoystickAxes(jid);
    }

    public final ByteBuffer glfwGetJoystickButtons(int jid) {
        return GLFW.glfwGetJoystickButtons(jid);
    }

    public final void glfwSetTime(double time) {
        GLFW.glfwSetTime(time);
    }

    public final GLFWCharCallback glfwSetCharCallback(long window, GLFWCharCallbackI cbfun) {
        return GLFW.glfwSetCharCallback(window, cbfun);
    }

    public final GLFWWindowCloseCallback glfwSetWindowCloseCallback(long window, GLFWWindowCloseCallbackI cbfun) {
        return GLFW.glfwSetWindowCloseCallback(window, cbfun);
    }

    public final GLFWWindowRefreshCallback glfwSetWindowRefreshCallback(long window, GLFWWindowRefreshCallbackI cbfun) {
        return GLFW.glfwSetWindowRefreshCallback(window, cbfun);
    }

    public final void glfwWaitEvents() {
        GLFW.glfwWaitEvents();
    }
}
