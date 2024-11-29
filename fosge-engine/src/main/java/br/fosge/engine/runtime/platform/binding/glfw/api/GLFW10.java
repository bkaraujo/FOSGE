package br.fosge.engine.runtime.platform.binding.glfw.api;

import br.fosge.engine.runtime.platform.binding.GLFW;
import br.fosge.engine.runtime.platform.binding.glfw.GLFWConstants;
import org.lwjgl.glfw.*;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.IntBuffer;

public interface GLFW10 {

    /**
     * Initializes the GLFW library. Before most GLFW functions can be used, GLFW must be initialized, and before an application terminates GLFW should be
     * terminated in order to free any resources allocated during or after initialization.
     *
     * <p>If this function fails, it calls {@link #glfwTerminate Terminate} before returning. If it succeeds, you should call {@link #glfwTerminate Terminate} before the application exits.</p>
     *
     * <p>Additional calls to this function after successful initialization but before termination will return {@link GLFWConstants#GLFW_TRUE TRUE} immediately.</p>
     *
     * <p>The {@link GLFWConstants#GLFW_PLATFORM PLATFORM} init hint controls which platforms are considered during initialization. This also depends on which platforms the library was compiled to
     * support.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>macOS</b>: This function will change the current directory of the application to the `Contents/Resources` subdirectory of the application's
     * bundle, if present. This can be disabled with the {@link GLFWConstants#GLFW_COCOA_CHDIR_RESOURCES COCOA_CHDIR_RESOURCES} init hint.</li>
     * <li><b>macOS</b>: This function will create the main menu and dock icon for the application. If GLFW finds a {@code MainMenu.nib} it is loaded and
     * assumed to contain a menu bar. Otherwise a minimal menu bar is created manually with common commands like Hide, Quit and About. The About entry
     * opens a minimal about dialog with information from the application's bundle. The menu bar and dock icon can be disabled entirely with the
     * {@link GLFWConstants#GLFW_COCOA_MENUBAR COCOA_MENUBAR} init hint.</li>
     * <li><b>Wayland</b>, <b>X11</b>: If the library was compiled with support for both Wayland and X11, and the {@link GLFWConstants#GLFW_PLATFORM PLATFORM} init hint is set to {@link GLFWConstants#GLFW_ANY_PLATFORM ANY_PLATFORM},
     * the {@code XDG_SESSION_TYPE} environment variable affects which platform is picked. If the environment variable is not set, or is set to something
     * other than {@code wayland} or {@code x11}, the regular detection mechanism will be used instead.</li>
     * <li><b>x11</b>: This function will set the {@code LC_CTYPE} category of the application locale according to the current environment if that category is
     * still "C". This is because the "C" locale breaks Unicode text input.</li>
     * </ul></div>
     *
     * @return {@link GLFWConstants#GLFW_TRUE TRUE} if successful, or {@link GLFWConstants#GLFW_FALSE FALSE} if an error occurred.
     *
     *         <p>Possible errors include {@link GLFWConstants#GLFW_PLATFORM_UNAVAILABLE PLATFORM_UNAVAILABLE} and {@link GLFWConstants#GLFW_PLATFORM_ERROR PLATFORM_ERROR}.</p>
     *
     * @since version 1.0
     */
    boolean glfwInit();

    /**
     * Returns an array of all video modes supported by the specified monitor.
     *
     * <p>The returned array is sorted in ascending order, first by color bit depth (the sum of all channel depths), then by resolution area (the product of
     * width and height), then resolution width and finally by refresh rate.</p>
     *
     * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified monitor is disconnected, this
     * function is called again for that monitor or the library is terminated.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param monitor the monitor to query
     *
     * @return an array of video modes, or {@code NULL} if an error occurred
     *
     * @since version 1.0
     */
    GLFWVidMode.Buffer glfwGetVideoModes(long monitor);

    /**
     * Destroys the specified window and its context. On calling this function, no further callbacks will be called for that window.
     *
     * <p>If the context of the specified window is current on the main thread, it is detached before being destroyed.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li>This function must not be called from a callback.</li>
     * <li>The context of the specified window must not be current on any other thread when this function is called.</li>
     * </ul></div>
     *
     * @param window the window to destroy
     *
     * @since version 1.0
     */
    void glfwDestroyWindow(long window);

    /**
     * Sets the window title, encoded as UTF-8, of the specified window.
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * <p><b>macOS</b>: The window title will not be updated until the next time you process events.</p>
     *
     * @param window the window whose title to change
     * @param title  the UTF-8 encoded window title
     *
     * @since version 1.0
     */
    void glfwSetWindowTitle(long window, ByteBuffer title);

    /**
     * Processes all pending events.
     *
     * <p>This function processes only those events that are already in the event queue and then returns immediately. Processing events will cause the window and
     * input callbacks associated with those events to be called.</p>
     *
     * <p>On some platforms, a window move, resize or menu operation will cause event processing to block. This is due to how event processing is designed on
     * those platforms. You can use the <a href="https://www.glfw.org/docs/latest/window.html#window_refresh">window refresh callback</a> to redraw the
     * contents of your window when necessary during such operations.</p>
     *
     * <p>On some platforms, certain events are sent directly to the application without going through the event queue, causing callbacks to be called outside of
     * a call to one of the event processing functions.</p>
     *
     * <p>Event processing is not required for joystick input to work.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li>This function must not be called from a callback.</li>
     * </ul></div>
     *
     * @since version 1.0
     */
    void glfwPollEvents();

    /**
     * Returns the last state reported for the specified key to the specified window. The returned state is one of {@link GLFWConstants#GLFW_PRESS PRESS} or {@link GLFWConstants#GLFW_RELEASE RELEASE}. The action {@link GLFWConstants#GLFW_REPEAT REPEAT} is
     * only reported to the key callback.
     *
     * <p>If the {@link GLFWConstants#GLFW_STICKY_KEYS STICKY_KEYS} input mode is enabled, this function returns {@link GLFWConstants#GLFW_PRESS PRESS} the first time you call it for a key that was pressed, even if that
     * key has already been released.</p>
     *
     * <p>The key functions deal with physical keys, with key tokens named after their use on the standard US keyboard layout. If you want to input text, use the
     * Unicode character callback instead.</p>
     *
     * <p>The modifier key bit masks are not key tokens and cannot be used with this function.</p>
     *
     * <p><b>Do not use this function</b> to implement <a href="https://www.glfw.org/docs/latest/input.html#input_char">text input</a>.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li>{@link GLFWConstants#GLFW_KEY_UNKNOWN KEY_UNKNOWN} is not a valid key for this function.</li>
     * </ul></div>
     *
     * @param window the desired window
     * @param key    the desired keyboard key
     *
     * @return one of {@link GLFWConstants#GLFW_PRESS PRESS} or {@link GLFWConstants#GLFW_RELEASE RELEASE}
     *
     * @since version 1.0
     */
    int glfwGetKey(long window, int key);

    /**
     * Returns the last state reported for the specified mouse button to the specified window. The returned state is one of {@link GLFWConstants#GLFW_PRESS PRESS} or {@link GLFWConstants#GLFW_RELEASE RELEASE}. The
     * higher-level action {@link GLFWConstants#GLFW_REPEAT REPEAT} is only reported to the mouse button callback.
     *
     * <p>If the {@link GLFWConstants#GLFW_STICKY_MOUSE_BUTTONS STICKY_MOUSE_BUTTONS} input mode is enabled, this function returns {@link GLFWConstants#GLFW_PRESS PRESS} the first time you call it for a mouse button that was pressed, even
     * if that mouse button has already been released.</p>
     *
     * <p>The {@link GLFWConstants#GLFW_UNLIMITED_MOUSE_BUTTONS UNLIMITED_MOUSE_BUTTONS} input mode does not effect the limit on buttons which can be polled with this function.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the desired window
     * @param button the desired mouse button token
     *
     * @return one of {@link GLFWConstants#GLFW_PRESS PRESS} or {@link GLFWConstants#GLFW_RELEASE RELEASE}
     *
     * @since version 1.0
     */
    int glfwGetMouseButton(long window, int button);

    /**
     * Returns the value of the GLFW timer. Unless the timer has been set using {@link GLFW#glfwSetTime SetTime}, the timer measures time elapsed since GLFW was initialized.
     *
     * <p>The resolution of the timer is system dependent, but is usually on the order of a few micro- or nanoseconds. It uses the highest-resolution monotonic
     * time source on each operating system.</p>
     *
     * <p>This function may be called from any thread. Reading and writing of the internal timer offset is not atomic, so it needs to be externally synchronized
     * with calls to {@link GLFW#glfwSetTime SetTime}.</p>
     *
     * @return the current value, in seconds, or zero if an error occurred
     *
     * @since version 1.0
     */
    double glfwGetTime();

    /**
     * Swaps the front and back buffers of the specified window when rendering with OpenGL or OpenGL ES. If the swap interval is greater than zero, the GPU
     * driver waits the specified number of screen updates before swapping the buffers.
     *
     * <p>The specified window must have an OpenGL or OpenGL ES context. Specifying a window without a context will generate a {@link GLFWConstants#GLFW_NO_WINDOW_CONTEXT NO_WINDOW_CONTEXT} error.</p>
     *
     * <p>This function does not apply to Vulkan. If you are rendering with Vulkan, {@code vkQueuePresentKHR} instead.</p>
     *
     * <p><b>EGL</b>: The context of the specified window must be current on the calling thread.</p>
     *
     * <p>This function may be called from any thread.</p>
     *
     * @param window the window whose buffers to swap
     *
     * @since version 1.0
     */
    void glfwSwapBuffers(long window);

    /**
     * Sets the swap interval for the current OpenGL or OpenGL ES context, i.e. the number of screen updates to wait from the time {@link #glfwSwapBuffers SwapBuffers} was called
     * before swapping the buffers and returning. This is sometimes called <i>vertical synchronization</i>, <i>vertical retrace synchronization</i> or just
     * <i>vsync</i>.
     *
     * <p>A context that supports either of the
     * <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/WGL_EXT_swap_control_tear.txt">WGL_EXT_swap_control_tear</a> and
     * <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/GLX_EXT_swap_control_tear.txt">GLX_EXT_swap_control_tear</a> extensions also accepts
     * <b>negative</b> swap intervals, which allows the driver to swap immediately even if a frame arrives a little bit late. You can check for these
     * extensions with {@link #glfwExtensionSupported ExtensionSupported}. For more information about swap tearing, see the extension specifications.</p>
     *
     * <p>A context must be current on the calling thread. Calling this function without a current context will cause a {@link GLFWConstants#GLFW_NO_CURRENT_CONTEXT NO_CURRENT_CONTEXT} error.</p>
     *
     * <p>This function does not apply to Vulkan. If you are rendering with Vulkan, see the present mode of your swapchain instead.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>This function may be called from any thread.</li>
     * <li>This function is not called during window creation, leaving the swap interval set to whatever is the default for that API. This is done because
     * some swap interval extensions used by GLFW do not allow the swap interval to be reset to zero once it has been set to a non-zero value.</li>
     * <li>Some GPU drivers do not honor the requested swap interval, either because of a user setting that overrides the application's request or due to bugs
     * in the driver.</li>
     * </ul></div>
     *
     * @param interval the minimum number of screen updates to wait for until the buffers are swapped by {@link #glfwSwapBuffers SwapBuffers}
     *
     * @since version 1.0
     */
    void glfwSwapInterval(int interval);

    /**
     * Returns whether the specified <a href="https://www.glfw.org/docs/latest/context.html#context_glext">API extension</a> is supported by the current
     * OpenGL or OpenGL ES context. It searches both for client API extension and context creation API extensions.
     *
     * <p>A context must be current on the calling thread. Calling this function without a current context will cause a {@link GLFWConstants#GLFW_NO_CURRENT_CONTEXT NO_CURRENT_CONTEXT} error.</p>
     *
     * <p>As this functions retrieves and searches one or more extension strings each call, it is recommended that you cache its results if it is going to be used
     * frequently. The extension strings will not change during the lifetime of a context, so there is no danger in doing this.</p>
     *
     * <p>This function does not apply to Vulkan. If you are using Vulkan, see {@code glfwGetRequiredInstanceExtensions},
     * {@code vkEnumerateInstanceExtensionProperties} and {@code vkEnumerateDeviceExtensionProperties} instead.</p>
     *
     * <p>This function may be called from any thread.</p>
     *
     * @param extension the ASCII encoded name of the extension
     *
     * @return {@link GLFWConstants#GLFW_TRUE TRUE} if the extension is available, or {@link GLFWConstants#GLFW_FALSE FALSE} otherwise
     *
     * @since version 1.0
     */
    boolean glfwExtensionSupported(ByteBuffer extension);

    /**
     * Returns whether the specified <a href="https://www.glfw.org/docs/latest/context.html#context_glext">API extension</a> is supported by the current
     * OpenGL or OpenGL ES context. It searches both for client API extension and context creation API extensions.
     *
     * <p>A context must be current on the calling thread. Calling this function without a current context will cause a {@link GLFWConstants#GLFW_NO_CURRENT_CONTEXT NO_CURRENT_CONTEXT} error.</p>
     *
     * <p>As this functions retrieves and searches one or more extension strings each call, it is recommended that you cache its results if it is going to be used
     * frequently. The extension strings will not change during the lifetime of a context, so there is no danger in doing this.</p>
     *
     * <p>This function does not apply to Vulkan. If you are using Vulkan, see {@code glfwGetRequiredInstanceExtensions},
     * {@code vkEnumerateInstanceExtensionProperties} and {@code vkEnumerateDeviceExtensionProperties} instead.</p>
     *
     * <p>This function may be called from any thread.</p>
     *
     * @param extension the ASCII encoded name of the extension
     *
     * @return {@link GLFWConstants#GLFW_TRUE TRUE} if the extension is available, or {@link GLFWConstants#GLFW_FALSE FALSE} otherwise
     *
     * @since version 1.0
     */
    boolean glfwExtensionSupported(CharSequence extension);

    /**
     * Returns the address of the specified OpenGL or OpenGL ES <a href="https://www.glfw.org/docs/latest/context.html#context_glext">core or extension function</a>, if it is supported by the current context.
     *
     * <p>A context must be current on the calling thread.  Calling this function without a current context will cause a {@link GLFWConstants#GLFW_NO_CURRENT_CONTEXT NO_CURRENT_CONTEXT} error.</p>
     *
     * <p>This function does not apply to Vulkan. If you are rendering with Vulkan, {@code glfwGetInstanceProcAddress}, {@code vkGetInstanceProcAddr} and
     * {@code vkGetDeviceProcAddr} instead.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>The address of a given function is not guaranteed to be the same between contexts.</li>
     * <li>This function may return a non-{@code NULL} address despite the associated version or extension not being available. Always check the context version or
     * extension string first.</li>
     * <li>The returned function pointer is valid until the context is destroyed or the library is terminated.</li>
     * <li>This function may be called from any thread.</li>
     * </ul></div>
     *
     * @param procname the ASCII encoded name of the function
     *
     * @return the address of the function, or {@code NULL} if an error occurred
     *
     * @since version 1.0
     */
    long glfwGetProcAddress(ByteBuffer procname);

    /**
     * Returns the address of the specified OpenGL or OpenGL ES <a href="https://www.glfw.org/docs/latest/context.html#context_glext">core or extension function</a>, if it is supported by the current context.
     *
     * <p>A context must be current on the calling thread.  Calling this function without a current context will cause a {@link GLFWConstants#GLFW_NO_CURRENT_CONTEXT NO_CURRENT_CONTEXT} error.</p>
     *
     * <p>This function does not apply to Vulkan. If you are rendering with Vulkan, {@code glfwGetInstanceProcAddress}, {@code vkGetInstanceProcAddr} and
     * {@code vkGetDeviceProcAddr} instead.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>The address of a given function is not guaranteed to be the same between contexts.</li>
     * <li>This function may return a non-{@code NULL} address despite the associated version or extension not being available. Always check the context version or
     * extension string first.</li>
     * <li>The returned function pointer is valid until the context is destroyed or the library is terminated.</li>
     * <li>This function may be called from any thread.</li>
     * </ul></div>
     *
     * @param procname the ASCII encoded name of the function
     *
     * @return the address of the function, or {@code NULL} if an error occurred
     *
     * @since version 1.0
     */
    long glfwGetProcAddress(CharSequence procname);

    /**
     * Sets the mouse button callback of the specified window, which is called when a mouse button is pressed or released.
     *
     * <p>When a window loses input focus, it will generate synthetic mouse button release events for all pressed mouse buttons with associated button tokens.
     * You can tell these events from user-generated events by the fact that the synthetic ones are generated after the focus loss event has been processed,
     * i.e. after the window focus callback has been called.</p>
     *
     * <p>The reported {@code button} value can be higher than {@link GLFWConstants#GLFW_MOUSE_BUTTON_LAST MOUSE_BUTTON_LAST} if the button does not have an associated button token and the
     * {@link GLFWConstants#GLFW_UNLIMITED_MOUSE_BUTTONS UNLIMITED_MOUSE_BUTTONS} input mode is set.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set
     *
     * @since version 1.0
     */
    GLFWMouseButtonCallback glfwSetMouseButtonCallback(long window, GLFWMouseButtonCallbackI cbfun);

    /**
     * Sets the cursor position callback of the specified window, which is called when the cursor is moved. The callback is provided with the position, in
     * screen coordinates, relative to the upper-left corner of the content area of the window.
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set
     *
     * @since version 1.0
     */
    GLFWCursorPosCallback glfwSetCursorPosCallback(long window, GLFWCursorPosCallbackI cbfun);

    /**
     * Returns the position of the cursor, in screen coordinates, relative to the upper-left corner of the content area of the specified window.
     *
     * <p>If the cursor is disabled (with {@link GLFWConstants#GLFW_CURSOR_DISABLED CURSOR_DISABLED}) then the cursor position is unbounded and limited only by the minimum and maximum values of a
     * <b>double</b>.</p>
     *
     * <p>The coordinates can be converted to their integer equivalents with the {@link Math#floor} function. Casting directly to an integer type works for positive
     * coordinates, but fails for negative ones.</p>
     *
     * <p>Any or all of the position arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} position arguments will be set to zero.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the desired window
     * @param xpos   where to store the cursor x-coordinate, relative to the left edge of the content area, or {@code NULL}
     * @param ypos   where to store the cursor y-coordinate, relative to the to top edge of the content area, or {@code NULL}.
     *
     * @since version 1.0
     */
    void glfwGetCursorPos(long window, DoubleBuffer xpos, DoubleBuffer ypos);

    /**
     * Sets the key callback of the specified window, which is called when a key is pressed, repeated or released.
     *
     * <p>The key functions deal with physical keys, with layout independent key tokens named after their values in the standard US keyboard layout. If you want
     * to input text, use {@link GLFW#glfwSetCharCallback SetCharCallback} instead.</p>
     *
     * <p>When a window loses input focus, it will generate synthetic key release events for all pressed keys with associated key tokens. You can tell these
     * events from user-generated events by the fact that the synthetic ones are generated after the focus loss event has been processed, i.e. after the
     * window focus callback has been called.</p>
     *
     * <p>The scancode of a key is specific to that platform or sometimes even to that machine. Scancodes are intended to allow users to bind keys that don't have
     * a GLFW key token. Such keys have {@code key} set to {@link GLFWConstants#GLFW_KEY_UNKNOWN KEY_UNKNOWN}, their state is not saved and so it cannot be queried with {@link #glfwGetKey GetKey}.</p>
     *
     * <p>Sometimes GLFW needs to generate synthetic key events, in which case the scancode may be zero.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set
     *
     * @since version 1.0
     */
    GLFWKeyCallback glfwSetKeyCallback(long window, GLFWKeyCallbackI cbfun);

    /**
     * Sets the position, in screen coordinates, of the cursor relative to the upper-left corner of the content area of the specified window. The window must
     * have input focus. If the window does not have input focus when this function is called, it fails silently.
     *
     * <p><b>Do not use this function</b> to implement things like camera controls. GLFW already provides the {@link GLFWConstants#GLFW_CURSOR_DISABLED CURSOR_DISABLED} cursor mode that hides the cursor,
     * transparently re-centers it and provides unconstrained cursor motion. See {@link GLFW#glfwSetInputMode SetInputMode} for more information.</p>
     *
     * <p>If the cursor mode is {@link GLFWConstants#GLFW_CURSOR_DISABLED CURSOR_DISABLED} then the cursor position is unconstrained and limited only by the minimum and maximum values of <b>double</b>.</p>
     *
     * <p>Notes:</p>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: This function will only work when the cursor mode is {@link GLFWConstants#GLFW_CURSOR_DISABLED CURSOR_DISABLED}, otherwise it will emit {@link GLFWConstants#GLFW_FEATURE_UNAVAILABLE FEATURE_UNAVAILABLE}.</li>
     * </ul>
     *
     * @param window the desired window
     * @param xpos   the desired x-coordinate, relative to the left edge of the content area
     * @param ypos   the desired y-coordinate, relative to the top edge of the content area
     *
     * @since version 1.0
     */
    void glfwSetCursorPos(long window, double xpos, double ypos);

    /**
     * Sets the position callback of the specified window, which is called when the window is moved. The callback is provided with the position, in screen
     * coordinates, of the upper-left corner of the content area of the window.
     *
     * <p>Notes:</p>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: This callback will never be called, as there is no way for an application to know its global position.</li>
     * </ul>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
     *         <a href="https://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
     *
     * @since version 1.0
     */
    GLFWWindowPosCallback glfwSetWindowPosCallback(long window, GLFWWindowPosCallbackI cbfun);

    /**
     * Sets the size callback of the specified window, which is called when the window is resized. The callback is provided with the size, in screen
     * coordinates, of the content area of the window.
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
     *         <a href="https://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
     *
     * @since version 1.0
     */
    GLFWWindowSizeCallback glfwSetWindowSizeCallback(long window, GLFWWindowSizeCallbackI cbfun);

    /**
     * Sets the size, in pixels, of the content area of the specified window.
     *
     * <p>For full screen windows, this function updates the resolution of its desired video mode and switches to the video mode closest to it, without affecting
     * the window's context. As the context is unaffected, the bit depths of the framebuffer remain unchanged.</p>
     *
     * <p>If you wish to update the refresh rate of the desired video mode in addition to its resolution, see {@link GLFW#glfwSetWindowMonitor SetWindowMonitor}.</p>
     *
     * <p>The window manager may put limits on what sizes are allowed. GLFW cannot and should not override these limits.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window to resize
     * @param width  the desired width, in screen coordinates, of the window content area
     * @param height the desired height, in screen coordinates, of the window content area
     *
     * @since version 1.0
     */
    void glfwSetWindowSize(long window, int width, int height);

    /**
     * Sets the position, in screen coordinates, of the upper-left corner of the content area of the specified windowed mode window. If the window is a full
     * screen window, this function does nothing.
     *
     * <p><b>Do not use this function</b> to move an already visible window unless you have very good reasons for doing so, as it will confuse and annoy the
     * user.</p>
     *
     * <p>The window manager may put limits on what positions are allowed. GLFW cannot and should not override these limits.</p>
     *
     * <p>Notes:</p>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: There is no way for an application to set the global position of its windows. This function will emit {@link GLFWConstants#GLFW_FEATURE_UNAVAILABLE FEATURE_UNAVAILABLE}.</li>
     * </ul>
     *
     * @param window the window to query
     * @param xpos   the x-coordinate of the upper-left corner of the content area
     * @param ypos   the y-coordinate of the upper-left corner of the content area
     *
     * @since version 1.0
     */
    void glfwSetWindowPos(long window, int xpos, int ypos);

    /**
     * Retrieves the size, in screen coordinates, of the content area of the specified window. If you wish to retrieve the size of the framebuffer of the
     * window in pixels, see {@link GLFW#glfwGetFramebufferSize GetFramebufferSize}.
     *
     * <p>Any or all of the size arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} size arguments will be set to zero.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose size to retrieve
     * @param width  where to store the width, in screen coordinates, of the content area, or {@code NULL}
     * @param height where to store the height, in screen coordinates, of the content area, or {@code NULL}
     *
     * @since version 1.0
     */
    void glfwGetWindowSize(long window, IntBuffer width, IntBuffer height);

    /**
     * Sets the window title, encoded as UTF-8, of the specified window.
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * <p><b>macOS</b>: The window title will not be updated until the next time you process events.</p>
     *
     * @param window the window whose title to change
     * @param title  the UTF-8 encoded window title
     *
     * @since version 1.0
     */
    void glfwSetWindowTitle(long window, CharSequence title);

    /**
     * Creates a window and its associated OpenGL or OpenGL ES context. Most of the options controlling how the window and its context should be created are
     * specified with window hints.
     *
     * <p>Successful creation does not change which context is current. Before you can use the newly created context, you need to make it current. For information
     * about the {@code share} parameter, see <a href="https://www.glfw.org/docs/latest/context.html#context_sharing">context sharing</a>.</p>
     *
     * <p>The created window, framebuffer and context may differ from what you requested, as not all parameters and hints are hard constraints. This includes the
     * size of the window, especially for full screen windows. To query the actual attributes of the created window, framebuffer and context, use queries like
     * {@link GLFW#glfwGetWindowAttrib GetWindowAttrib} and {@link #glfwGetWindowSize GetWindowSize} and {@link GLFW#glfwGetFramebufferSize GetFramebufferSize}.</p>
     *
     * <p>To create a full screen window, you need to specify the monitor the window will cover. If no monitor is specified, the window will be windowed mode.
     * Unless you have a way for the user to choose a specific monitor, it is recommended that you pick the primary monitor. For more information on how to
     * query connected monitors, see <a href="https://www.glfw.org/docs/latest/monitor.html#monitor_monitors">monitors</a>.</p>
     *
     * <p>For full screen windows, the specified size becomes the resolution of the window's <i>desired video mode</i>. As long as a full screen window is not
     * iconified, the supported video mode most closely matching the desired video mode is set for the specified monitor. For more information about full
     * screen windows, including the creation of so called <i>windowed full screen</i> or <i>borderless full screen</i> windows, see
     * <a href="https://www.glfw.org/docs/latest/window.html#window_windowed_full_screen">full screen</a>.</p>
     *
     * <p>Once you have created the window, you can switch it between windowed and full screen mode with {@link GLFW#glfwSetWindowMonitor SetWindowMonitor}. If the window has an OpenGL or
     * OpenGL ES context, it will be unaffected.</p>
     *
     * <p>By default, newly created windows use the placement recommended by the window system. To create the window at a specific position, set the {@link GLFWConstants#GLFW_POSITION_X POSITION_X}
     * and {@link GLFWConstants#GLFW_POSITION_Y POSITION_Y} window hints before creation. To restore the default behavior, set either or both hints back to {@link GLFWConstants#GLFW_ANY_POSITION ANY_POSITION}.</p>
     *
     * <p>As long as at least one full screen window is not iconified, the screensaver is prohibited from starting.</p>
     *
     * <p>Window systems put limits on window sizes. Very large or very small window dimensions may be overridden by the window system on creation. Check the
     * actual <a href="https://www.glfw.org/docs/latest/window.html#window_size">size</a> after creation.</p>
     *
     * <p>The <a href="https://www.glfw.org/docs/latest/window.html#buffer_swap">swap interval</a> is not set during window creation and the initial value may vary
     * depending on driver settings and defaults.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Windows</b>: Window creation will fail if the Microsoft GDI software OpenGL implementation is the only one available.</li>
     * <li><b>Windows</b>: If the executable has an icon resource named {@code GLFW_ICON}, it will be set as the initial icon for the window. If no such icon
     * is present, the {@code IDI_APPLICATION} icon will be used instead. To set a different icon, see {@link GLFW#glfwSetWindowIcon SetWindowIcon}.</li>
     * <li><b>Windows</b>: The context to share resources with may not be current on any other thread.</li>
     * <li>The OS only supports core profile contexts for OpenGL versions 3.2 and later. Before creating an OpenGL context of version 3.2 or later you must
     * set the {@link GLFWConstants#GLFW_OPENGL_PROFILE OPENGL_PROFILE} hint accordingly. OpenGL 3.0 and 3.1 contexts are not supported at all on macOS.</li>
     * <li><b>macOS</b>: The GLFW window has no icon, as it is not a document window, but the dock icon will be the same as the application bundle's icon. For
     * more information on bundles, see the
     * <a href="https://developer.apple.com/library/content/documentation/CoreFoundation/Conceptual/CFBundles/">Bundle Programming Guide</a> in the Mac
     * Developer Library.</li>
     * <li><b>macOS</b>: The window frame will not be rendered at full resolution on Retina displays unless the {@link GLFWConstants#GLFW_COCOA_RETINA_FRAMEBUFFER COCOA_RETINA_FRAMEBUFFER} hint is {@link GLFWConstants#GLFW_TRUE TRUE} and
     * the {@code NSHighResolutionCapable} key is enabled in the application bundle's {@code Info.plist}. For more information, see <a href="https://developer.apple.com/library/content/documentation/GraphicsAnimation/Conceptual/HighResolutionOSX/Explained/Explained.html">High Resolution Guidelines for macOS</a> in the Mac Developer Library.</li>
     * <li><b>macOS</b>: When activating frame autosaving with {@link GLFWConstants#GLFW_COCOA_FRAME_NAME COCOA_FRAME_NAME}, the specified window size and position may be overridden by previously saved
     * values.</li>
     * <li><b>Wayland</b>: GLFW uses <a href="https://gitlab.freedesktop.org/libdecor/libdecor">libdecor</a> where available to create its window decorations.
     * This in turn uses server-side XDG decorations where available and provides high quality client-side decorations on compositors like GNOME. If both
     * XDG decorations and libdecor are unavailable, GLFW falls back to a very simple set of window decorations that only support moving, resizing and the
     * window manager's right-click menu.</li>
     * <li><b>X11</b>: Some window managers will not respect the placement of initially hidden windows.</li>
     * <li><b>X11</b>: Due to the asynchronous nature of X11, it may take a moment for a window to reach its requested state. This means you may not be able
     * to query the final size, position or other attributes directly after window creation.</li>
     * <li><b>X11</b>: The class part of the {@code WM_CLASS} window property will by default be set to the window title passed to this function. The instance
     * part will use the contents of the {@code RESOURCE_NAME} environment variable, if present and not empty, or fall back to the window title. Set the
     * {@link GLFWConstants#GLFW_X11_CLASS_NAME X11_CLASS_NAME} and {@link GLFWConstants#GLFW_X11_INSTANCE_NAME X11_INSTANCE_NAME} window hints to override this.</li>
     * </ul></div>
     *
     * @param width   the desired width, in screen coordinates, of the window
     * @param height  the desired height, in screen coordinates, of the window
     * @param title   initial, UTF-8 encoded window title
     * @param monitor the monitor to use for fullscreen mode, or {@code NULL} for windowed mode
     * @param share   the window whose context to share resources with, or {@code NULL} to not share resources
     *
     * @return the handle of the created window, or {@code NULL} if an error occurred
     *
     * @since version 1.0
     */
    long glfwCreateWindow(int width, int height, CharSequence title, long monitor, long share);

    /**
     * Creates a window and its associated OpenGL or OpenGL ES context. Most of the options controlling how the window and its context should be created are
     * specified with window hints.
     *
     * <p>Successful creation does not change which context is current. Before you can use the newly created context, you need to make it current. For information
     * about the {@code share} parameter, see <a href="https://www.glfw.org/docs/latest/context.html#context_sharing">context sharing</a>.</p>
     *
     * <p>The created window, framebuffer and context may differ from what you requested, as not all parameters and hints are hard constraints. This includes the
     * size of the window, especially for full screen windows. To query the actual attributes of the created window, framebuffer and context, use queries like
     * {@link GLFW#glfwGetWindowAttrib GetWindowAttrib} and {@link #glfwGetWindowSize GetWindowSize} and {@link GLFW#glfwGetFramebufferSize GetFramebufferSize}.</p>
     *
     * <p>To create a full screen window, you need to specify the monitor the window will cover. If no monitor is specified, the window will be windowed mode.
     * Unless you have a way for the user to choose a specific monitor, it is recommended that you pick the primary monitor. For more information on how to
     * query connected monitors, see <a href="https://www.glfw.org/docs/latest/monitor.html#monitor_monitors">monitors</a>.</p>
     *
     * <p>For full screen windows, the specified size becomes the resolution of the window's <i>desired video mode</i>. As long as a full screen window is not
     * iconified, the supported video mode most closely matching the desired video mode is set for the specified monitor. For more information about full
     * screen windows, including the creation of so called <i>windowed full screen</i> or <i>borderless full screen</i> windows, see
     * <a href="https://www.glfw.org/docs/latest/window.html#window_windowed_full_screen">full screen</a>.</p>
     *
     * <p>Once you have created the window, you can switch it between windowed and full screen mode with {@link GLFW#glfwSetWindowMonitor SetWindowMonitor}. If the window has an OpenGL or
     * OpenGL ES context, it will be unaffected.</p>
     *
     * <p>By default, newly created windows use the placement recommended by the window system. To create the window at a specific position, set the {@link GLFWConstants#GLFW_POSITION_X POSITION_X}
     * and {@link GLFWConstants#GLFW_POSITION_Y POSITION_Y} window hints before creation. To restore the default behavior, set either or both hints back to {@link GLFWConstants#GLFW_ANY_POSITION ANY_POSITION}.</p>
     *
     * <p>As long as at least one full screen window is not iconified, the screensaver is prohibited from starting.</p>
     *
     * <p>Window systems put limits on window sizes. Very large or very small window dimensions may be overridden by the window system on creation. Check the
     * actual <a href="https://www.glfw.org/docs/latest/window.html#window_size">size</a> after creation.</p>
     *
     * <p>The <a href="https://www.glfw.org/docs/latest/window.html#buffer_swap">swap interval</a> is not set during window creation and the initial value may vary
     * depending on driver settings and defaults.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Windows</b>: Window creation will fail if the Microsoft GDI software OpenGL implementation is the only one available.</li>
     * <li><b>Windows</b>: If the executable has an icon resource named {@code GLFW_ICON}, it will be set as the initial icon for the window. If no such icon
     * is present, the {@code IDI_APPLICATION} icon will be used instead. To set a different icon, see {@link GLFW#glfwSetWindowIcon SetWindowIcon}.</li>
     * <li><b>Windows</b>: The context to share resources with may not be current on any other thread.</li>
     * <li>The OS only supports core profile contexts for OpenGL versions 3.2 and later. Before creating an OpenGL context of version 3.2 or later you must
     * set the {@link GLFWConstants#GLFW_OPENGL_PROFILE OPENGL_PROFILE} hint accordingly. OpenGL 3.0 and 3.1 contexts are not supported at all on macOS.</li>
     * <li><b>macOS</b>: The GLFW window has no icon, as it is not a document window, but the dock icon will be the same as the application bundle's icon. For
     * more information on bundles, see the
     * <a href="https://developer.apple.com/library/content/documentation/CoreFoundation/Conceptual/CFBundles/">Bundle Programming Guide</a> in the Mac
     * Developer Library.</li>
     * <li><b>macOS</b>: The window frame will not be rendered at full resolution on Retina displays unless the {@link GLFWConstants#GLFW_COCOA_RETINA_FRAMEBUFFER COCOA_RETINA_FRAMEBUFFER} hint is {@link GLFWConstants#GLFW_TRUE TRUE} and
     * the {@code NSHighResolutionCapable} key is enabled in the application bundle's {@code Info.plist}. For more information, see <a href="https://developer.apple.com/library/content/documentation/GraphicsAnimation/Conceptual/HighResolutionOSX/Explained/Explained.html">High Resolution Guidelines for macOS</a> in the Mac Developer Library.</li>
     * <li><b>macOS</b>: When activating frame autosaving with {@link GLFWConstants#GLFW_COCOA_FRAME_NAME COCOA_FRAME_NAME}, the specified window size and position may be overridden by previously saved
     * values.</li>
     * <li><b>Wayland</b>: GLFW uses <a href="https://gitlab.freedesktop.org/libdecor/libdecor">libdecor</a> where available to create its window decorations.
     * This in turn uses server-side XDG decorations where available and provides high quality client-side decorations on compositors like GNOME. If both
     * XDG decorations and libdecor are unavailable, GLFW falls back to a very simple set of window decorations that only support moving, resizing and the
     * window manager's right-click menu.</li>
     * <li><b>X11</b>: Some window managers will not respect the placement of initially hidden windows.</li>
     * <li><b>X11</b>: Due to the asynchronous nature of X11, it may take a moment for a window to reach its requested state. This means you may not be able
     * to query the final size, position or other attributes directly after window creation.</li>
     * <li><b>X11</b>: The class part of the {@code WM_CLASS} window property will by default be set to the window title passed to this function. The instance
     * part will use the contents of the {@code RESOURCE_NAME} environment variable, if present and not empty, or fall back to the window title. Set the
     * {@link GLFWConstants#GLFW_X11_CLASS_NAME X11_CLASS_NAME} and {@link GLFWConstants#GLFW_X11_INSTANCE_NAME X11_INSTANCE_NAME} window hints to override this.</li>
     * </ul></div>
     *
     * @param width   the desired width, in screen coordinates, of the window
     * @param height  the desired height, in screen coordinates, of the window
     * @param title   initial, UTF-8 encoded window title
     * @param monitor the monitor to use for fullscreen mode, or {@code NULL} for windowed mode
     * @param share   the window whose context to share resources with, or {@code NULL} to not share resources
     *
     * @return the handle of the created window, or {@code NULL} if an error occurred
     *
     * @since version 1.0
     */
    long glfwCreateWindow(int width, int height, ByteBuffer title, long monitor, long share);

    /**
     * Retrieves the major, minor and revision numbers of the GLFW library. It is intended for when you are using GLFW as a shared library and want to ensure
     * that you are using the minimum required version.
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>Any or all of the version arguments may be {@code NULL}.</li>
     * <li>This function always succeeds.</li>
     * <li>This function may be called before {@link #glfwInit Init}.</li>
     * <li>This function may be called from any thread.</li>
     * </ul></div>
     *
     * @param major where to store the major version number, or {@code NULL}
     * @param minor where to store the minor version number, or {@code NULL}
     * @param rev   where to store the revision number, or {@code NULL}
     *
     * @since version 1.0
     */
    void glfwGetVersion(IntBuffer major, IntBuffer minor, IntBuffer rev);

    /**
     * Terminates the GLFW library.
     *
     * <p>This function destroys all remaining windows and cursors, restores any modified gamma ramps and frees any other allocated resources. Once this function
     * is called, you must again call {@link #glfwInit Init} successfully before you will be able to use most GLFW functions.</p>
     *
     * <p>If GLFW has been successfully initialized, this function should be called before the application exits. If initialization fails, there is no need to
     * call this function, as it is called by {@link #glfwInit Init} before it returns failure.</p>
     *
     * <p>This function has no effect if GLFW is not initialized.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>This function may be called before {@link #glfwInit Init}.</li>
     * <li>This function must only be called from the main thread.</li>
     * <li>This function must not be called from a callback.</li>
     * <li>No window's context may be current on another thread when this function is called.</li>
     * </ul></div>
     *
     * @since version 1.0
     */
    void glfwTerminate();

}
