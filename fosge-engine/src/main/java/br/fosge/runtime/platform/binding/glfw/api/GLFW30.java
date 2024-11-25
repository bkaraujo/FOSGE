package br.fosge.runtime.platform.binding.glfw.api;

import br.fosge.runtime.platform.binding.glfw.GLFWConstants;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.*;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public interface GLFW30 extends GLFW25 {


    /**
     * Returns the size, in millimetres, of the display area of the specified monitor.
     *
     * <p>Some platforms do not provide accurate monitor size information, either because the monitor
     * <a href="https://en.wikipedia.org/wiki/Extended_display_identification_data">EDID</a> data is incorrect or because the driver does not report it
     * accurately.</p>
     *
     * <p>Any or all of the size arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} size arguments will be set to zero.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Windows</b>: On Windows 8 and earlier the physical size is calculated from the current resolution and system DPI instead of querying the monitor
     * EDID data.</li>
     * </ul></div>
     *
     * @param monitor  the monitor to query
     * @param widthMM  where to store the width, in millimetres, of the monitor's display area, or {@code NULL}
     * @param heightMM where to store the height, in millimetres, of the monitor's display area, or {@code NULL}
     *
     * @since version 3.0
     */
    void glfwGetMonitorPhysicalSize(long monitor, IntBuffer widthMM, IntBuffer heightMM);

    /**
     * Returns an array of handles for all currently connected monitors. The primary monitor is always first in the returned array. If no monitors were found,
     * this function returns {@code NULL}.
     *
     * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is guaranteed to be valid only until the monitor configuration
     * changes or the library is terminated.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @return an array of monitor handlers, or {@code NULL} if no monitors were found or if an error occurred
     *
     * @since version 3.0
     */
    PointerBuffer glfwGetMonitors();

    /**
     * Returns the primary monitor. This is usually the monitor where elements like the task bar or global menu bar are located.
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * <p>The primary monitor is always first in the array returned by {@link #glfwGetMonitors GetMonitors}.</p>
     *
     * @return the primary monitor, or {@code NULL} if no monitors were found or if an error occurred
     *
     * @since version 3.0
     */
    long glfwGetPrimaryMonitor();

    /**
     * Returns the position, in screen coordinates, of the upper-left corner of the specified monitor.
     *
     * <p>Any or all of the position arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} position arguments will be set to zero.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param monitor the monitor to query
     * @param xpos    where to store the monitor x-coordinate, or {@code NULL}
     * @param ypos    where to store the monitor y-coordinate, or {@code NULL}
     *
     * @since version 3.0
     */
    void glfwGetMonitorPos(long monitor, IntBuffer xpos, IntBuffer ypos);

    /**
     * Sets the error callback, which is called with an error code and a human-readable description each time a GLFW error occurs.
     *
     * <p>The error code is set before the callback is called. Calling {@link GLFW#glfwGetError GetError} from the error callback will return the same value as the error code argument.</p>
     *
     * <p>The error callback is called on the thread where the error occurred. If you are using GLFW from multiple threads, your error callback needs to be
     * written accordingly.</p>
     *
     * <p>Because the description string may have been generated specifically for that error, it is not guaranteed to be valid after the callback has returned. If
     * you wish to use it after the callback returns, you need to make a copy.</p>
     *
     * <p>Once set, the error callback remains set even after the library has been terminated.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>This function may be called before {@link #glfwInit Init}.</li>
     * <li>This function must only be called from the main thread.</li>
     * </ul></div>
     *
     * @param cbfun the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set
     *
     * @since version 3.0
     */
    GLFWErrorCallback glfwSetErrorCallback(GLFWErrorCallbackI cbfun);

    /**
     * Returns the compile-time generated version string of the GLFW library binary. It describes the version, platforms, compiler and any platform or
     * operating system specific compile-time options. It should not be confused with the OpenGL or OpenGL ES version string, queried with
     * {@code glGetString}.
     *
     * <p><b>Do not use the version string</b> to parse the GLFW library version. The {@link #glfwGetVersion GetVersion} function already provides the version of the library binary
     * in numerical format.</p>
     *
     * <p><b>Do not use the version string</b> to parse what platforms are supported. The {@link GLFW#glfwPlatformSupported PlatformSupported} function lets you query platform support.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>This function always succeeds.</li>
     * <li>This function may be called before {@link #glfwInit Init}.</li>
     * <li>This function may be called from any thread.</li>
     * <li>The returned string is static and compile-time generated.</li>
     * </ul></div>
     *
     * @return the ASCII encoded GLFW version string
     *
     * @since version 3.0
     */
    String glfwGetVersionString();

    /**
     * Returns a human-readable name, encoded as UTF-8, of the specified monitor. The name typically reflects the make and model of the monitor and is not
     * guaranteed to be unique among the connected monitors.
     *
     * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified monitor is disconnected or the
     * library is terminated.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param monitor the monitor to query
     *
     * @return the UTF-8 encoded name of the monitor, or {@code NULL} if an error occurred
     *
     * @since version 3.0
     */
    String glfwGetMonitorName(long monitor);

    /**
     * Sets the monitor configuration callback, or removes the currently set callback. This is called when a monitor is connected to or disconnected from the
     * system.
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param cbfun the new callback, or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been initialized
     *
     * @since version 3.0
     */
    GLFWMonitorCallback glfwSetMonitorCallback(GLFWMonitorCallbackI cbfun);

    /**
     * Returns the current video mode of the specified monitor. If you have created a full screen window for that monitor, the return value will depend on
     * whether that window is iconified.
     *
     * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified monitor is disconnected or the
     * library is terminated.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param monitor the monitor to query
     *
     * @return the current mode of the monitor, or {@code NULL} if an error occurred
     *
     * @since version 3.0
     */
    GLFWVidMode glfwGetVideoMode(long monitor);

    /**
     * Generates a gamma ramp and sets it for the specified monitor.
     *
     * <p>This function generates an appropriately sized gamma ramp from the specified exponent and then calls {@link #glfwSetGammaRamp SetGammaRamp} with it. The value must be a
     * finite number greater than zero.</p>
     *
     * <p>The software controlled gamma ramp is applied <em>in addition</em> to the hardware gamma correction, which today is usually an approximation of sRGB
     * gamma. This means that setting a perfectly linear ramp, or gamma 1.0, will produce the default (usually sRGB-like) behavior.</p>
     *
     * <p>For gamma correct rendering with OpenGL or OpenGL ES, see the {@link GLFWConstants#GLFW_SRGB_CAPABLE SRGB_CAPABLE} hint.</p>
     *
     * <p>Notes:</p>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: Gamma handling is a privileged protocol, this function will thus never be implemented and emits {@link GLFWConstants#GLFW_PLATFORM_ERROR PLATFORM_ERROR}.</li>
     * </ul>
     *
     * @param monitor the monitor whose gamma ramp to set
     * @param gamma   the desired exponent
     *
     * @since version 3.0
     */
    void glfwSetGamma(long monitor, float gamma);

    /**
     * Returns the current gamma ramp of the specified monitor.
     *
     * <p>The returned structure and its arrays are allocated and freed by GLFW. You should not free them yourself. They are valid until the specified monitor is
     * disconnected, this function is called again for that monitor or the library is terminated.</p>
     *
     * <p>Notes:</p>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: Gamma handling is a privileged protocol, this function will thus never be implemented and emits {@link GLFWConstants#GLFW_PLATFORM_ERROR PLATFORM_ERROR} while returning
     * {@code NULL}.</li>
     * </ul>
     *
     * @param monitor the monitor to query
     *
     * @return the current gamma ramp, or {@code NULL} if an error occurred
     *
     * @since version 3.0
     */
    GLFWGammaRamp glfwGetGammaRamp(long monitor);

    /**
     * Sets the current gamma ramp for the specified monitor.
     *
     * <p>This function sets the current gamma ramp for the specified monitor. The original gamma ramp for that monitor is saved by GLFW the first time this
     * function is called and is restored by {@link #glfwTerminate Terminate}.</p>
     *
     * <p>The software controlled gamma ramp is applied <em>in addition</em> to the hardware gamma correction, which today is usually an approximation of sRGB
     * gamma. This means that setting a perfectly linear ramp, or gamma 1.0, will produce the default (usually sRGB-like) behavior.</p>
     *
     * <p>For gamma correct rendering with OpenGL or OpenGL ES, see the {@link GLFWConstants#GLFW_SRGB_CAPABLE SRGB_CAPABLE} hint.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li>The size of the specified gamma ramp should match the size of the current ramp for that monitor.</li>
     * <li><b>Windows</b>: The gamma ramp size must be 256.</li>
     * <li><b>Wayland</b>: Gamma handling is a privileged protocol, this function will thus never be implemented and emits {@link GLFWConstants#GLFW_PLATFORM_ERROR PLATFORM_ERROR}.</li>
     * <li>The specified gamma ramp is copied before this function returns.</li>
     * </ul></div>
     *
     * @param monitor the monitor whose gamma ramp to set
     * @param ramp    the gamma ramp to use
     *
     * @since version 3.0
     */
    void glfwSetGammaRamp(long monitor, GLFWGammaRamp ramp);

    /**
     * Resets all window hints to their default values. See {@link #glfwWindowHint WindowHint} for details.
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @since version 3.0
     */
    void glfwDefaultWindowHints();

    /**
     * Returns the value of the close flag of the specified window.
     *
     * <p>This function may be called from any thread.</p>
     *
     * @param window the window to query
     *
     * @return the value of the close flag
     *
     * @since version 3.0
     */
    boolean glfwWindowShouldClose(long window);

    /**
     * Sets the value of the close flag of the specified window. This can be used to override the user's attempt to close the window, or to signal that it
     * should be closed.
     *
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param window the window whose flag to change
     * @param value  the new value
     *
     * @since version 3.0
     */
    void glfwSetWindowShouldClose(long window, boolean value);

    /**
     * Retrieves the position, in screen coordinates, of the upper-left corner of the content area of the specified window.
     *
     * <p>Any or all of the position arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} position arguments will be set to zero.</p>
     *
     * <p>Notes:</p>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: There is no way for an application to retrieve the global position of its windows. This function will emit {@link GLFWConstants#GLFW_FEATURE_UNAVAILABLE FEATURE_UNAVAILABLE}.</li>
     * </ul>
     *
     * @param window the window to query
     * @param xpos   where to store the x-coordinate of the upper-left corner of the content area, or {@code NULL}
     * @param ypos   where to store the y-coordinate of the upper-left corner of the content area, or {@code NULL}
     *
     * @since version 3.0
     */
    void glfwGetWindowPos(long window, IntBuffer xpos, IntBuffer ypos);

    /**
     * Retrieves the size, in pixels, of the framebuffer of the specified window. If you wish to retrieve the size of the window in screen coordinates, see
     * {@link #glfwGetWindowSize GetWindowSize}.
     *
     * <p>Any or all of the size arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} size arguments will be set to zero.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose framebuffer to query
     * @param width  where to store the width, in pixels, of the framebuffer, or {@code NULL}
     * @param height where to store the height, in pixels, of the framebuffer, or {@code NULL}
     *
     * @since version 3.0
     */
    void glfwGetFramebufferSize(long window, IntBuffer width, IntBuffer height);

    /**
     * Makes the specified window visible if it was previously hidden. If the window is already visible or is in full screen mode, this function does nothing.
     *
     * <p>By default, windowed mode windows are focused when shown. Set the {@link GLFWConstants#GLFW_FOCUS_ON_SHOW FOCUS_ON_SHOW} window hint to change this behavior for all newly created windows, or
     * change the behavior for an existing window with {@link GLFW#glfwSetWindowAttrib SetWindowAttrib}.</p>
     *
     * <p>Notes:</p>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: Because Wayland wants every frame of the desktop to be complete, this function does not immediately make the window visible.
     * Instead it will become visible the next time the window framebuffer is updated after this call.</li>
     * </ul>
     *
     * @param window the window to make visible
     *
     * @since version 3.0
     */
    void glfwShowWindow(long window);

    /**
     * Hides the specified window, if it was previously visible. If the window is already hidden or is in full screen mode, this function does nothing.
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window to hide
     *
     * @since version 3.0
     */
    void glfwHideWindow(long window);

    /**
     * Returns the handle of the monitor that the specified window is in full screen on.
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window to query
     *
     * @return the monitor, or {@code NULL} if the window is in windowed mode or an error occurred
     *
     * @since version 3.0
     */
    long glfwGetWindowMonitor(long window);

    /**
     * Returns the value of an attribute of the specified window or its OpenGL or OpenGL ES context.
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * <p>Framebuffer related hints are not window attributes.</p>
     *
     * <p>Zero is a valid value for many window and context related attributes so you cannot use a return value of zero as an indication of errors. However, this
     * function should not fail as long as it is passed valid arguments and the library has been initialized.</p>
     *
     * <p><b>Wayland</b>: The Wayland protocol provides no way to check whether a window is iconfied, so {@link GLFWConstants#GLFW_ICONIFIED ICONIFIED} always returns {@link GLFWConstants#GLFW_FALSE FALSE}.</p>
     *
     * @param window the window to query
     * @param attrib the <a href="https://www.glfw.org/docs/latest/window.html#window_attribs">window attribute</a> whose value to return. One of:<br><table><tr><td>{@link GLFWConstants#GLFW_FOCUSED FOCUSED}</td><td>{@link GLFWConstants#GLFW_ICONIFIED ICONIFIED}</td><td>{@link GLFWConstants#GLFW_RESIZABLE RESIZABLE}</td><td>{@link GLFWConstants#GLFW_VISIBLE VISIBLE}</td><td>{@link GLFWConstants#GLFW_DECORATED DECORATED}</td></tr><tr><td>{@link GLFWConstants#GLFW_FLOATING FLOATING}</td><td>{@link GLFWConstants#GLFW_MAXIMIZED MAXIMIZED}</td><td>{@link GLFWConstants#GLFW_CENTER_CURSOR CENTER_CURSOR}</td><td>{@link GLFWConstants#GLFW_TRANSPARENT_FRAMEBUFFER TRANSPARENT_FRAMEBUFFER}</td><td>{@link GLFWConstants#GLFW_HOVERED HOVERED}</td></tr><tr><td>{@link GLFWConstants#GLFW_FOCUS_ON_SHOW FOCUS_ON_SHOW}</td><td>{@link GLFWConstants#GLFW_MOUSE_PASSTHROUGH MOUSE_PASSTHROUGH}</td><td>{@link GLFWConstants#GLFW_POSITION_X POSITION_X}</td><td>{@link GLFWConstants#GLFW_POSITION_Y POSITION_Y}</td><td>{@link GLFWConstants#GLFW_SOFT_FULLSCREEN SOFT_FULLSCREEN}</td></tr><tr><td>{@link GLFWConstants#GLFW_CLIENT_API CLIENT_API}</td><td>{@link GLFWConstants#GLFW_CONTEXT_VERSION_MAJOR CONTEXT_VERSION_MAJOR}</td><td>{@link GLFWConstants#GLFW_CONTEXT_VERSION_MINOR CONTEXT_VERSION_MINOR}</td><td>{@link GLFWConstants#GLFW_CONTEXT_REVISION CONTEXT_REVISION}</td><td>{@link GLFWConstants#GLFW_CONTEXT_ROBUSTNESS CONTEXT_ROBUSTNESS}</td></tr><tr><td>{@link GLFWConstants#GLFW_OPENGL_FORWARD_COMPAT OPENGL_FORWARD_COMPAT}</td><td>{@link GLFWConstants#GLFW_CONTEXT_DEBUG CONTEXT_DEBUG}</td><td>{@link GLFWConstants#GLFW_OPENGL_DEBUG_CONTEXT OPENGL_DEBUG_CONTEXT}</td><td>{@link GLFWConstants#GLFW_OPENGL_PROFILE OPENGL_PROFILE}</td><td>{@link GLFWConstants#GLFW_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR}</td></tr><tr><td>{@link GLFWConstants#GLFW_CONTEXT_NO_ERROR CONTEXT_NO_ERROR}</td><td>{@link GLFWConstants#GLFW_CONTEXT_CREATION_API CONTEXT_CREATION_API}</td><td>{@link GLFWConstants#GLFW_SCALE_TO_MONITOR SCALE_TO_MONITOR}</td><td>{@link GLFWConstants#GLFW_SCALE_FRAMEBUFFER SCALE_FRAMEBUFFER}</td></tr></table>
     *
     * @return the value of the attribute, or zero if an error occurred
     *
     * @since version 3.0
     */
    int glfwGetWindowAttrib(long window, int attrib);

    /**
     * Sets the user-defined pointer of the specified window. The current value is retained until the window is destroyed. The initial value is {@code NULL}.
     *
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param window  the window whose pointer to set
     * @param pointer the new value
     *
     * @since version 3.0
     */
    void glfwSetWindowUserPointer(long window, long pointer);

    /**
     * Returns the current value of the user-defined pointer of the specified window. The initial value is {@code NULL}.
     *
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param window the window whose pointer to return
     *
     * @since version 3.0
     */
    long glfwGetWindowUserPointer(long window);

    /**
     * Sets the focus callback of the specified window, which is called when the window gains or loses input focus.
     *
     * <p>After the focus callback is called for a window that lost input focus, synthetic key and mouse button release events will be generated for all such
     * that had been pressed. For more information, see {@link #glfwSetKeyCallback SetKeyCallback} and {@link #glfwSetMouseButtonCallback SetMouseButtonCallback}.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
     *         <a href="https://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
     *
     * @since version 3.0
     */
    GLFWWindowFocusCallback glfwSetWindowFocusCallback(long window, GLFWWindowFocusCallbackI cbfun);

    /**
     * Sets the iconification callback of the specified window, which is called when the window is iconified or restored.
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
     *         <a href="https://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
     *
     * @since version 3.0
     */
    GLFWWindowIconifyCallback glfwSetWindowIconifyCallback(long window, GLFWWindowIconifyCallbackI cbfun);

    /**
     * Sets the framebuffer resize callback of the specified window, which is called when the framebuffer of the specified window is resized.
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
     *         <a href="https://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
     *
     * @since version 3.0
     */
    GLFWFramebufferSizeCallback glfwSetFramebufferSizeCallback(long window, GLFWFramebufferSizeCallbackI cbfun);

    /**
     * Returns the value of an input option for the specified window.
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window to query
     * @param mode   the input mode whose value to return. One of:<br><table><tr><td>{@link GLFWConstants#GLFW_CURSOR CURSOR}</td><td>{@link GLFWConstants#GLFW_STICKY_KEYS STICKY_KEYS}</td><td>{@link GLFWConstants#GLFW_STICKY_MOUSE_BUTTONS STICKY_MOUSE_BUTTONS}</td><td>{@link GLFWConstants#GLFW_LOCK_KEY_MODS LOCK_KEY_MODS}</td><td>{@link GLFWConstants#GLFW_RAW_MOUSE_MOTION RAW_MOUSE_MOTION}</td><td>{@link GLFWConstants#GLFW_UNLIMITED_MOUSE_BUTTONS UNLIMITED_MOUSE_BUTTONS}</td></tr><tr><td>{@link GLFWConstants#GLFW_IME IME}</td></tr></table>
     *
     * @return the input mode value
     *
     * @since version 3.0
     */
    int glfwGetInputMode(long window, int mode);

    /**
     * Sets an input option for the specified window.
     *
     * <p>If {@code mode} is {@link GLFWConstants#GLFW_CURSOR CURSOR}, the value must be one of the following cursor modes:</p>
     *
     * <ul>
     * <li>{@link GLFWConstants#GLFW_CURSOR_NORMAL CURSOR_NORMAL} makes the cursor visible and behaving normally.</li>
     * <li>{@link GLFWConstants#GLFW_CURSOR_HIDDEN CURSOR_HIDDEN} makes the cursor invisible when it is over the content area of the window but does not restrict the cursor from leaving.</li>
     * <li>{@link GLFWConstants#GLFW_CURSOR_DISABLED CURSOR_DISABLED} hides and grabs the cursor, providing virtual and unlimited cursor movement. This is useful for implementing for example 3D camera
     * controls.</li>
     * <li>{@link GLFWConstants#GLFW_CURSOR_CAPTURED CURSOR_CAPTURED} makes the cursor visible and confines it to the content area of the window.</li>
     * </ul>
     *
     * <p>If the {@code mode} is {@link GLFWConstants#GLFW_STICKY_KEYS STICKY_KEYS}, the value must be either {@link GLFWConstants#GLFW_TRUE TRUE} to enable sticky keys, or {@link GLFWConstants#GLFW_FALSE FALSE} to disable it. If sticky keys are enabled, a key
     * press will ensure that {@link #glfwGetKey GetKey} returns {@link GLFWConstants#GLFW_PRESS PRESS} the next time it is called even if the key had been released before the call. This is useful when you
     * are only interested in whether keys have been pressed but not when or in which order.</p>
     *
     * <p>If the {@code mode} is {@link GLFWConstants#GLFW_STICKY_MOUSE_BUTTONS STICKY_MOUSE_BUTTONS}, the value must be either {@link GLFWConstants#GLFW_TRUE TRUE} to enable sticky mouse buttons, or {@link GLFWConstants#GLFW_FALSE FALSE} to disable it. If sticky mouse
     * buttons are enabled, a mouse button press will ensure that {@link #glfwGetMouseButton GetMouseButton} returns {@link GLFWConstants#GLFW_PRESS PRESS} the next time it is called even if the mouse button had
     * been released before the call. This is useful when you are only interested in whether mouse buttons have been pressed but not when or in which order.</p>
     *
     * <p>If the {@code mode} is {@link GLFWConstants#GLFW_LOCK_KEY_MODS LOCK_KEY_MODS}, the value must be either {@link GLFWConstants#GLFW_TRUE TRUE} to enable lock key modifier bits, or {@link GLFWConstants#GLFW_FALSE FALSE} to disable them. If enabled,
     * callbacks that receive modifier bits will also have the {@link GLFWConstants#GLFW_MOD_CAPS_LOCK MOD_CAPS_LOCK} bit set when the event was generated with Caps Lock on, and the {@link GLFWConstants#GLFW_MOD_NUM_LOCK MOD_NUM_LOCK}
     * bit when Num Lock was on.</p>
     *
     * <p>If the mode is {@link GLFWConstants#GLFW_RAW_MOUSE_MOTION RAW_MOUSE_MOTION}, the value must be either {@link GLFWConstants#GLFW_TRUE TRUE} to enable raw (unscaled and unaccelerated) mouse motion when the cursor is disabled,
     * or {@link GLFWConstants#GLFW_FALSE FALSE} to disable it. If raw motion is not supported, attempting to set this will emit {@link GLFWConstants#GLFW_FEATURE_UNAVAILABLE FEATURE_UNAVAILABLE}. Call {@link GLFW#glfwRawMouseMotionSupported RawMouseMotionSupported} to
     * check for support.</p>
     *
     * <p>If the mode is {@link GLFWConstants#GLFW_UNLIMITED_MOUSE_BUTTONS UNLIMITED_MOUSE_BUTTONS}, the value must be either {@link GLFWConstants#GLFW_TRUE TRUE} to disable the mouse button limit when calling the mouse button callback, or
     * {@link GLFWConstants#GLFW_FALSE FALSE} to limit the mouse buttons sent to the callback to the mouse button token values up to {@link GLFWConstants#GLFW_MOUSE_BUTTON_LAST MOUSE_BUTTON_LAST}.</p>
     *
     * <p>If the mode is {@link GLFWConstants#GLFW_IME IME}, the value must be either {@link GLFWConstants#GLFW_TRUE TRUE} to turn on IME, or {@link GLFWConstants#GLFW_FALSE FALSE} to turn off it.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose input mode to set
     * @param mode   the input mode to set. One of:<br><table><tr><td>{@link GLFWConstants#GLFW_CURSOR CURSOR}</td><td>{@link GLFWConstants#GLFW_STICKY_KEYS STICKY_KEYS}</td><td>{@link GLFWConstants#GLFW_STICKY_MOUSE_BUTTONS STICKY_MOUSE_BUTTONS}</td><td>{@link GLFWConstants#GLFW_LOCK_KEY_MODS LOCK_KEY_MODS}</td><td>{@link GLFWConstants#GLFW_RAW_MOUSE_MOTION RAW_MOUSE_MOTION}</td><td>{@link GLFWConstants#GLFW_UNLIMITED_MOUSE_BUTTONS UNLIMITED_MOUSE_BUTTONS}</td></tr><tr><td>{@link GLFWConstants#GLFW_IME IME}</td></tr></table>
     * @param value  the new value of the specified input mode
     *
     * @since version 3.0
     */
    void glfwSetInputMode(long window, int mode, int value);

    /**
     * Sets the cursor boundary crossing callback of the specified window, which is called when the cursor enters or leaves the content area of the window.
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set
     *
     * @since version 3.0
     */
    GLFWCursorEnterCallback glfwSetCursorEnterCallback(long window, GLFWCursorEnterCallbackI cbfun);

    /**
     * Returns whether the specified joystick is present.
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param jid joystick to query
     *
     * @return {@link GLFWConstants#GLFW_TRUE TRUE} if the joystick is present, or {@link GLFWConstants#GLFW_FALSE FALSE} otherwise
     *
     * @since version 3.0
     */
    boolean glfwJoystickPresent(int jid);

    /**
     * Returns the name, encoded as UTF-8, of the specified joystick.
     *
     * <p>If the specified joystick is not present this function will return {@code NULL} but will not generate an error. This can be used instead of first calling
     * {@link #glfwJoystickPresent JoystickPresent}.</p>
     *
     * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
     * function is called again for that joystick or the library is terminated.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param jid the joystick to query
     *
     * @return the UTF-8 encoded name of the joystick, or {@code NULL} if the joystick is not present
     *
     * @since version 3.0
     */
    String glfwGetJoystickName(int jid);

    /**
     * Sets the system clipboard to the specified, UTF-8 encoded string.
     *
     * <p>The specified string is copied before this function returns.</p>
     *
     * <p><b>Win32</b>: The clipboard on Windows has a single global lock for reading and writing. GLFW tries to acquire it a few times, which is almost always
     * enough. If it cannot acquire the lock then this function emits {@link GLFWConstants#GLFW_PLATFORM_ERROR PLATFORM_ERROR} and returns. It is safe to try this multiple times.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window deprecated, any valid window or {@code NULL}.
     * @param string a UTF-8 encoded string
     *
     * @since version 3.0
     */
    void glfwSetClipboardString(long window, ByteBuffer string);

    /**
     * Sets the system clipboard to the specified, UTF-8 encoded string.
     *
     * <p>The specified string is copied before this function returns.</p>
     *
     * <p><b>Win32</b>: The clipboard on Windows has a single global lock for reading and writing. GLFW tries to acquire it a few times, which is almost always
     * enough. If it cannot acquire the lock then this function emits {@link GLFWConstants#GLFW_PLATFORM_ERROR PLATFORM_ERROR} and returns. It is safe to try this multiple times.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window deprecated, any valid window or {@code NULL}.
     * @param string a UTF-8 encoded string
     *
     * @since version 3.0
     */
    void glfwSetClipboardString(long window, CharSequence string);

    /**
     * Returns the contents of the system clipboard, if it contains or is convertible to a UTF-8 encoded string. If the clipboard is empty or if its contents
     * cannot be converted, {@code NULL} is returned and a {@link GLFWConstants#GLFW_FORMAT_UNAVAILABLE FORMAT_UNAVAILABLE} error is generated.
     *
     * <p><b>Win32</b>: The clipboard on Windows has a single global lock for reading and writing. GLFW tries to acquire it a few times, which is almost always
     * enough. If it cannot acquire the lock then this function emits {@link GLFWConstants#GLFW_PLATFORM_ERROR PLATFORM_ERROR} and returns. It is safe to try this multiple times.</p>
     *
     * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the next call to {@link #glfwGetClipboardString GetClipboardString} or
     * {@link #glfwSetClipboardString SetClipboardString}, or until the library is terminated.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li>The returned string is allocated and freed by GLFW.  You should not free it yourself.</li>
     * <li>The returned string is valid only until the next call to {@link #glfwGetClipboardString GetClipboardString} or {@link #glfwSetClipboardString SetClipboardString}.</li>
     * </ul></div>
     *
     * @param window deprecated, any valid window or {@code NULL}.
     *
     * @return the contents of the clipboard as a UTF-8 encoded string, or {@code NULL} if an error occurred
     *
     * @since version 3.0
     */
    String glfwGetClipboardString(long window);

    /**
     * Makes the OpenGL or OpenGL ES context of the specified window current on the calling thread. It can also detach the current context from the calling
     * thread without making a new one current by passing in {@code NULL}.
     *
     * <p>A context must only be made current on a single thread at a time and each thread can have only a single current context at a time. Making a context
     * current detaches any previously current context on the calling thread.</p>
     *
     * <p>When moving a context between threads, you must detach it (make it non-current) on the old thread before making it current on the new one.</p>
     *
     * <p>By default, making a context non-current implicitly forces a pipeline flush. On machines that support
     * <a href="https://www.khronos.org/registry/OpenGL/extensions/KHR/KHR_context_flush_control.txt">GL_KHR_context_flush_control</a>, you can control whether
     * a context performs this flush by setting the {@link GLFWConstants#GLFW_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR}
     * <a href="https://www.glfw.org/docs/latest/window.html#window_hints_ctx">window hint</a>.</p>
     *
     * <p>The specified window must have an OpenGL or OpenGL ES context. Specifying a window without a context will generate a {@link GLFWConstants#GLFW_NO_WINDOW_CONTEXT NO_WINDOW_CONTEXT} error.</p>
     *
     * <p>If the previously current context was created via a different context creation API than the one passed to this function, GLFW will still detach the
     * previous one from its API before making the new one current.</p>
     *
     * <p>This function may be called from any thread.</p>
     *
     * @param window the window whose context to make current, or {@code NULL} to detach the current context
     *
     * @since version 3.0
     */
    void glfwMakeContextCurrent(long window);
    
    /**
     * Returns the window whose OpenGL or OpenGL ES context is current on the calling thread.
     *
     * <p>This function may be called from any thread.</p>
     *
     * @return the window whose context is current, or {@code NULL} if no window's context is current
     *
     * @since version 3.0
     */
    long glfwGetCurrentContext();
    
}
