package br.fosge.runtime.platform.binding.glfw.impl;

import br.fosge.runtime.platform.binding.glfw.api.GLFW10;
import org.lwjgl.glfw.*;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.IntBuffer;

public class GLFW1x implements GLFW10 {

    public final boolean glfwInit() {
        return GLFW.glfwInit();
    }

    public final GLFWVidMode.Buffer glfwGetVideoModes(long monitor) {
        return GLFW.glfwGetVideoModes(monitor);
    }

    public final void glfwDestroyWindow(long window) {
        GLFW.glfwDestroyWindow(window);
    }

    public final void glfwSetWindowTitle(long window, ByteBuffer title) {
        GLFW.glfwSetWindowTitle(window, title);
    }

    public final void glfwPollEvents() {
        GLFW.glfwPollEvents();
    }

    public final int glfwGetKey(long window, int key) {
        return GLFW.glfwGetKey(window, key);
    }

    public final int glfwGetMouseButton(long window, int button) {
        return GLFW.glfwGetMouseButton(window, button);
    }

    public final double glfwGetTime() {
        return GLFW.glfwGetTime();
    }

    public final void glfwSwapBuffers(long window) {
        GLFW.glfwSwapBuffers(window);
    }

    public final void glfwSwapInterval(int interval) {
        GLFW.glfwSwapInterval(interval);
    }

    public final boolean glfwExtensionSupported(ByteBuffer extension) {
        return GLFW.glfwExtensionSupported(extension);
    }

    public final boolean glfwExtensionSupported(CharSequence extension) {
        return GLFW.glfwExtensionSupported(extension);
    }

    public final long glfwGetProcAddress(ByteBuffer procname) {
        return GLFW.glfwGetProcAddress(procname);
    }

    public final long glfwGetProcAddress(CharSequence procname) {
        return GLFW.glfwGetProcAddress(procname);
    }

    public final GLFWMouseButtonCallback glfwSetMouseButtonCallback(long window, GLFWMouseButtonCallbackI cbfun) {
        return GLFW.glfwSetMouseButtonCallback(window, cbfun);
    }

    public final GLFWCursorPosCallback glfwSetCursorPosCallback(long window, GLFWCursorPosCallbackI cbfun) {
        return GLFW.glfwSetCursorPosCallback(window, cbfun);
    }

    public final void glfwGetCursorPos(long window, DoubleBuffer xpos, DoubleBuffer ypos) {
        GLFW.glfwGetCursorPos(window, xpos, ypos);
    }

    public final GLFWKeyCallback glfwSetKeyCallback(long window, GLFWKeyCallbackI cbfun) {
        return GLFW.glfwSetKeyCallback(window, cbfun);
    }

    public final void glfwSetCursorPos(long window, double xpos, double ypos) {
        GLFW.glfwSetCursorPos(window, xpos, ypos);
    }

    public final GLFWWindowPosCallback glfwSetWindowPosCallback(long window, GLFWWindowPosCallbackI cbfun) {
        return GLFW.glfwSetWindowPosCallback(window, cbfun);
    }

    public final GLFWWindowSizeCallback glfwSetWindowSizeCallback(long window, GLFWWindowSizeCallbackI cbfun) {
        return GLFW.glfwSetWindowSizeCallback(window, cbfun);
    }

    public final void glfwSetWindowSize(long window, int width, int height) {
        GLFW.glfwSetWindowSize(window, width, height);
    }

    public final void glfwSetWindowPos(long window, int xpos, int ypos) {
        GLFW.glfwSetWindowPos(window, xpos, ypos);
    }

    public final void glfwGetWindowSize(long window, IntBuffer width, IntBuffer height) {
        GLFW.glfwGetWindowSize(window, width, height);
    }

    public final void glfwSetWindowTitle(long window, CharSequence title) {
        GLFW.glfwSetWindowTitle(window, title);
    }

    public final long glfwCreateWindow(int width, int height, CharSequence title, long monitor, long share) {
        return GLFW.glfwCreateWindow(width, height, title, monitor, share);
    }

    public final long glfwCreateWindow(int width, int height, ByteBuffer title, long monitor, long share) {
        return GLFW.glfwCreateWindow(width, height, title, monitor, share);
    }

    public final void glfwGetVersion(IntBuffer major, IntBuffer minor, IntBuffer rev) {
        GLFW.glfwGetVersion(major, minor, rev);
    }

    public final void glfwTerminate() {
        GLFW.glfwTerminate();
    }

}
