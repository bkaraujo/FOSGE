package br.fosge.engine.runtime.platform.binding.glfw.impl;

import br.fosge.engine.runtime.platform.binding.glfw.api.*;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.*;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class GLFW3x extends GLFW2x implements GLFW30, GLFW31, GLFW32, GLFW33, GLFW34 {

    public final void glfwGetMonitorPhysicalSize(long monitor, IntBuffer widthMM, IntBuffer heightMM) {
        GLFW.glfwGetMonitorPhysicalSize(monitor, widthMM, heightMM);
    }

    public final PointerBuffer glfwGetMonitors() {
        return GLFW.glfwGetMonitors();
    }

    public final long glfwGetPrimaryMonitor() {
        return GLFW.glfwGetPrimaryMonitor();
    }

    public final void glfwGetMonitorPos(long monitor, IntBuffer xpos, IntBuffer ypos) {
        GLFW.glfwGetMonitorPos(monitor, xpos, ypos);
    }

    public final GLFWErrorCallback glfwSetErrorCallback(GLFWErrorCallbackI cbfun) {
        return GLFW.glfwSetErrorCallback(cbfun);
    }

    public final String glfwGetVersionString() {
        return GLFW.glfwGetVersionString();
    }

    public final String glfwGetMonitorName(long monitor) {
        return GLFW.glfwGetMonitorName(monitor);
    }

    public final GLFWMonitorCallback glfwSetMonitorCallback(GLFWMonitorCallbackI cbfun) {
        return GLFW.glfwSetMonitorCallback(cbfun);
    }

    public final GLFWVidMode glfwGetVideoMode(long monitor) {
        return GLFW.glfwGetVideoMode(monitor);
    }

    public final void glfwSetGamma(long monitor, float gamma) {
        GLFW.glfwSetGamma(monitor, gamma);
    }

    public final GLFWGammaRamp glfwGetGammaRamp(long monitor) {
        return GLFW.glfwGetGammaRamp(monitor);
    }

    public final void glfwSetGammaRamp(long monitor, GLFWGammaRamp ramp) {
        GLFW.glfwSetGammaRamp(monitor, ramp);
    }

    public final void glfwDefaultWindowHints() {
        GLFW.glfwDefaultWindowHints();
    }

    public final boolean glfwWindowShouldClose(long window) {
        return GLFW.glfwWindowShouldClose(window);
    }

    public final void glfwSetWindowShouldClose(long window, boolean value) {
        GLFW.glfwSetWindowShouldClose(window, value);
    }

    public final void glfwGetWindowPos(long window, IntBuffer xpos, IntBuffer ypos) {
        GLFW.glfwGetWindowPos(window, xpos, ypos);
    }

    public final void glfwGetFramebufferSize(long window, IntBuffer width, IntBuffer height) {
        GLFW.glfwGetFramebufferSize(window, width, height);
    }

    public final void glfwShowWindow(long window) {
        GLFW.glfwShowWindow(window);
    }

    public final void glfwHideWindow(long window) {
        GLFW.glfwHideWindow(window);
    }

    public final long glfwGetWindowMonitor(long window) {
        return GLFW.glfwGetWindowMonitor(window);
    }

    public final int glfwGetWindowAttrib(long window, int attrib) {
        return GLFW.glfwGetWindowAttrib(window, attrib);
    }

    public final void glfwSetWindowUserPointer(long window, long pointer) {
        GLFW.glfwSetWindowUserPointer(window, pointer);
    }

    public final long glfwGetWindowUserPointer(long window) {
        return GLFW.glfwGetWindowUserPointer(window);
    }

    public final GLFWWindowFocusCallback glfwSetWindowFocusCallback(long window, GLFWWindowFocusCallbackI cbfun) {
        return GLFW.glfwSetWindowFocusCallback(window, cbfun);
    }

    public final GLFWWindowIconifyCallback glfwSetWindowIconifyCallback(long window, GLFWWindowIconifyCallbackI cbfun) {
        return GLFW.glfwSetWindowIconifyCallback(window, cbfun);
    }

    public final GLFWFramebufferSizeCallback glfwSetFramebufferSizeCallback(long window, GLFWFramebufferSizeCallbackI cbfun) {
        return GLFW.glfwSetFramebufferSizeCallback(window, cbfun);
    }

    public final int glfwGetInputMode(long window, int mode) {
        return GLFW.glfwGetInputMode(window, mode);
    }

    public final void glfwSetInputMode(long window, int mode, int value) {
        GLFW.glfwSetInputMode(window, mode, value);
    }

    public final GLFWCursorEnterCallback glfwSetCursorEnterCallback(long window, GLFWCursorEnterCallbackI cbfun) {
        return GLFW.glfwSetCursorEnterCallback(window, cbfun);
    }

    public final boolean glfwJoystickPresent(int jid) {
        return GLFW.glfwJoystickPresent(jid);
    }

    public final String glfwGetJoystickName(int jid) {
        return GLFW.glfwGetJoystickName(jid);
    }

    public final void glfwSetClipboardString(long window, ByteBuffer string) {
        GLFW.glfwSetClipboardString(window, string);
    }

    public final void glfwSetClipboardString(long window, CharSequence string) {
        GLFW.glfwSetClipboardString(window, string);
    }

    public final String glfwGetClipboardString(long window) {
        return GLFW.glfwGetClipboardString(window);
    }

    public final void glfwMakeContextCurrent(long window) {
        GLFW.glfwMakeContextCurrent(window);
    }

    public final long glfwGetCurrentContext() {
        return GLFW.glfwGetCurrentContext();
    }

    public final void glfwGetWindowFrameSize(long window, IntBuffer left, IntBuffer top, IntBuffer right, IntBuffer bottom) {
        GLFW.glfwGetWindowFrameSize(window, left, top, right, bottom);
    }

    public final void glfwPostEmptyEvent() {
        GLFW.glfwPostEmptyEvent();
    }

    public final long glfwCreateCursor(GLFWImage image, int xhot, int yhot) {
        return GLFW.glfwCreateCursor(image, xhot, yhot);
    }

    public final long glfwCreateStandardCursor(int shape) {
        return GLFW.glfwCreateStandardCursor(shape);
    }

    public final void glfwDestroyCursor(long cursor) {
        GLFW.glfwDestroyCursor(cursor);
    }

    public final void glfwSetCursor(long window, long cursor) {
        GLFW.glfwSetCursor(window, cursor);
    }

    public final GLFWCharModsCallback glfwSetCharModsCallback(long window, GLFWCharModsCallbackI cbfun) {
        return GLFW.glfwSetCharModsCallback(window, cbfun);
    }

    public final GLFWDropCallback glfwSetDropCallback(long window, GLFWDropCallbackI cbfun) {
        return GLFW.glfwSetDropCallback(window, cbfun);
    }

    public final void glfwSetWindowIcon(long window, GLFWImage.Buffer images) {
        GLFW.glfwSetWindowIcon(window, images);
    }

    public final void glfwSetWindowSizeLimits(long window, int minwidth, int minheight, int maxwidth, int maxheight) {
        GLFW.glfwSetWindowSizeLimits(window, minwidth, minheight, maxwidth, maxheight);
    }

    public final void glfwSetWindowAspectRatio(long window, int numer, int denom) {
        GLFW.glfwSetWindowAspectRatio(window, numer, denom);
    }

    public final void glfwMaximizeWindow(long window) {
        GLFW.glfwMaximizeWindow(window);
    }

    public final void glfwFocusWindow(long window) {
        GLFW.glfwFocusWindow(window);
    }

    public final void glfwSetWindowMonitor(long window, long monitor, int xpos, int ypos, int width, int height, int refreshRate) {
        GLFW.glfwSetWindowMonitor(window, monitor, xpos, ypos, width, height, refreshRate);
    }

    public final void glfwWaitEventsTimeout(double timeout) {
        GLFW.glfwWaitEventsTimeout(timeout);
    }

    public final String glfwGetKeyName(int key, int scancode) {
        return GLFW.glfwGetKeyName(key, scancode);
    }

    public final GLFWJoystickCallback glfwSetJoystickCallback(GLFWJoystickCallbackI cbfun) {
        return GLFW.glfwSetJoystickCallback(cbfun);
    }

    public final long glfwGetTimerValue() {
        return GLFW.glfwGetTimerValue();
    }

    public final long glfwGetTimerFrequency() {
        return GLFW.glfwGetTimerFrequency();
    }

    public final int glfwGetError(PointerBuffer description) {
        return GLFW.glfwGetError(description);
    }

    public final void glfwInitHint(int hint, int value) {
        GLFW.glfwInitHint(hint, value);
    }

    public final void glfwGetMonitorWorkarea(long monitor, IntBuffer xpos, IntBuffer ypos, IntBuffer width, IntBuffer height) {
        GLFW.glfwGetMonitorWorkarea(monitor, xpos, ypos, width, height);
    }

    public final void glfwGetWindowContentScale(long window, FloatBuffer xscale, FloatBuffer yscale) {
        GLFW.glfwGetWindowContentScale(window, xscale, yscale);
    }

    public final float glfwGetWindowOpacity(long window) {
        return GLFW.glfwGetWindowOpacity(window);
    }

    public final void glfwSetWindowOpacity(long window, float opacity) {
        GLFW.glfwSetWindowOpacity(window, opacity);
    }

    public final void glfwRequestWindowAttention(long window) {
        GLFW.glfwRequestWindowAttention(window);
    }

    public final void glfwSetWindowAttrib(long window, int attrib, int value) {
        GLFW.glfwSetWindowAttrib(window, attrib, value);
    }

    public final GLFWWindowMaximizeCallback glfwSetWindowMaximizeCallback(long window, GLFWWindowMaximizeCallbackI cbfun) {
        return GLFW.glfwSetWindowMaximizeCallback(window, cbfun);
    }

    public final GLFWWindowContentScaleCallback glfwSetWindowContentScaleCallback(long window, GLFWWindowContentScaleCallbackI cbfun) {
        return GLFW.glfwSetWindowContentScaleCallback(window, cbfun);
    }

    public final boolean glfwRawMouseMotionSupported() {
        return GLFW.glfwRawMouseMotionSupported();
    }

    public final int glfwGetKeyScancode(int key) {
        return GLFW.glfwGetKeyScancode(key);
    }

    public final ByteBuffer glfwGetJoystickHats(int jid) {
        return GLFW.glfwGetJoystickHats(jid);
    }

    public final String glfwGetJoystickGUID(int jid) {
        return GLFW.glfwGetJoystickGUID(jid);
    }

    public final void glfwSetJoystickUserPointer(int jid, long pointer) {
        GLFW.glfwSetJoystickUserPointer(jid, pointer);
    }

    public final long glfwGetJoystickUserPointer(int jid) {
        return GLFW.glfwGetJoystickUserPointer(jid);
    }

    public final boolean glfwJoystickIsGamepad(int jid) {
        return GLFW.glfwJoystickIsGamepad(jid);
    }

    public final boolean glfwUpdateGamepadMappings(ByteBuffer string) {
        return GLFW.glfwUpdateGamepadMappings(string);
    }

    public final String glfwGetGamepadName(int jid) {
        return GLFW.glfwGetGamepadName(jid);
    }

    public final boolean glfwGetGamepadState(int jid, GLFWGamepadState state) {
        return GLFW.glfwGetGamepadState(jid, state);
    }

    public final void glfwGetMonitorContentScale(long monitor, FloatBuffer xscale, FloatBuffer yscale) {
        GLFW.glfwGetMonitorContentScale(monitor, xscale, yscale);
    }

    public final void glfwSetMonitorUserPointer(long monitor, long pointer) {
        GLFW.glfwSetMonitorUserPointer(monitor, pointer);
    }

    public final long glfwGetMonitorUserPointer(long monitor) {
        return GLFW.glfwGetMonitorUserPointer(monitor);
    }

    public final void glfwWindowHintString(int hint, ByteBuffer value) {
        GLFW.glfwWindowHintString(hint, value);
    }

    public final void glfwWindowHintString(int hint, CharSequence value) {
        GLFW.glfwWindowHintString(hint, value);
    }

    public final void glfwInitAllocator(GLFWAllocator allocator) {
        GLFW.glfwInitAllocator(allocator);
    }

    public final int glfwGetPlatform() {
        return GLFW.glfwGetPlatform();
    }

    public final boolean glfwPlatformSupported(int platform) {
        return GLFW.glfwPlatformSupported(platform);
    }

    public final String glfwGetWindowTitle(long window) {
        return GLFW.glfwGetWindowTitle(window);
    }

//    public final void glfwGetPreeditCursorRectangle(long window, IntBuffer x, IntBuffer y, IntBuffer w, IntBuffer h) {
//        if (!Runtime.CHECKS) {
//            org.lwjgl.glfw.GLFW.glfwGetPreeditCursorRectangle(window, x, y, w, h);
//            return;
//        }
//
//        final var start = System.nanoTime();
//        try {
//            Logger.trace("glfwGetPreeditCursorRectangle(%d, IntBuffer, IntBuffer, IntBuffer, IntBuffer) [BEGIN]", window);
//            org.lwjgl.glfw.GLFW.glfwGetPreeditCursorRectangle(window, x, y, w, h);
//        } finally {
//            Logger.trace("glfwGetPreeditCursorRectangle(%d, IntBuffer, IntBuffer, IntBuffer, IntBuffer) [END  ] ## %.2f millis", window, (System.nanoTime() - start) * 1e-6);
//        }
//    }
//
//    public final void glfwSetPreeditCursorRectangle(long window, int x, int y, int w, int h) {
//        if (!Runtime.CHECKS) {
//            org.lwjgl.glfw.GLFW.glfwSetPreeditCursorRectangle(window, x, y, w, h);
//            return;
//        }
//
//        final var start = System.nanoTime();
//        try {
//            Logger.trace("glfwSetPreeditCursorRectangle(%d, %d, %d, %d, %d) [BEGIN]", window, x, y, w, h);
//            org.lwjgl.glfw.GLFW.glfwSetPreeditCursorRectangle(window, x, y, w, h);
//        } finally {
//            Logger.trace("glfwSetPreeditCursorRectangle(%d, %d, %d, %d, %d) [END  ] ## %.2f millis", window, x, y, w, h, (System.nanoTime() - start) * 1e-6);
//        }
//    }
//
//    public final void glfwResetPreeditText(long window) {
//        if (!Runtime.CHECKS) {
//            org.lwjgl.glfw.GLFW.glfwResetPreeditText(window);
//            return;
//        }
//
//        final var start = System.nanoTime();
//        try {
//            Logger.trace("glfwResetPreeditText(%d) [BEGIN]", window);
//            org.lwjgl.glfw.GLFW.glfwResetPreeditText(window);
//        } finally {
//            Logger.trace("glfwResetPreeditText(%d) [END  ] ## %.2f millis", window, (System.nanoTime() - start) * 1e-6);
//        }
//    }
//
//    public final IntBuffer glfwGetPreeditCandidate(long window, int index) {
//        if (!Runtime.CHECKS) {
//            return org.lwjgl.glfw.GLFW.glfwGetPreeditCandidate(window, index);
//        }
//
//        final var start = System.nanoTime();
//        try {
//            Logger.trace("glfwGetPreeditCandidate(%d, %d) [BEGIN]", window, index);
//            return org.lwjgl.glfw.GLFW.glfwGetPreeditCandidate(window, index);
//        } finally {
//            Logger.trace("glfwGetPreeditCandidate(%d, %d) [END  ] ## %.2f millis", window, index, (System.nanoTime() - start) * 1e-6);
//        }
//    }
//
//    public final GLFWPreeditCallback glfwSetPreeditCallback(long window, GLFWPreeditCallbackI cbfun) {
//        if (!Runtime.CHECKS) {
//            return org.lwjgl.glfw.GLFW.glfwSetPreeditCallback(window, cbfun);
//        }
//
//        final var start = System.nanoTime();
//        try {
//            Logger.trace("glfwSetPreeditCallback(%d, %d) [BEGIN]", window, Meta.fqn(cbfun));
//            return org.lwjgl.glfw.GLFW.glfwSetPreeditCallback(window, cbfun);
//        } finally {
//            Logger.trace("glfwSetPreeditCallback(%d, %d) [END  ] ## %.2f millis", window, Meta.fqn(cbfun), (System.nanoTime() - start) * 1e-6);
//        }
//    }
//
//    public final GLFWIMEStatusCallback glfwSetIMEStatusCallback(long window, GLFWIMEStatusCallbackI cbfun) {
//        if (!Runtime.CHECKS) {
//            return org.lwjgl.glfw.GLFW.glfwSetIMEStatusCallback(window, cbfun);
//        }
//
//        final var start = System.nanoTime();
//        try {
//            Logger.trace("glfwSetIMEStatusCallback(%d, %d) [BEGIN]", window, Meta.fqn(cbfun));
//            return org.lwjgl.glfw.GLFW.glfwSetIMEStatusCallback(window, cbfun);
//        } finally {
//            Logger.trace("glfwSetIMEStatusCallback(%d, %d) [END  ] ## %.2f millis", window, Meta.fqn(cbfun), (System.nanoTime() - start) * 1e-6);
//        }
//    }
//
//    public final GLFWPreeditCandidateCallback glfwSetPreeditCandidateCallback(long window, GLFWPreeditCandidateCallbackI cbfun) {
//        if (!Runtime.CHECKS) {
//            return org.lwjgl.glfw.GLFW.glfwSetPreeditCandidateCallback(window, cbfun);
//        }
//
//        final var start = System.nanoTime();
//        try {
//            Logger.trace("glfwSetPreeditCandidateCallback(%d, %d) [BEGIN]", window, Meta.fqn(cbfun));
//            return org.lwjgl.glfw.GLFW.glfwSetPreeditCandidateCallback(window, cbfun);
//        } finally {
//            Logger.trace("glfwSetPreeditCandidateCallback(%d, %d) [END  ] ## %.2f millis", window, Meta.fqn(cbfun), (System.nanoTime() - start) * 1e-6);
//        }
//    }

}
