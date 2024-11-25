package br.fosge.runtime.platform.binding.glfw.api;

import br.fosge.runtime.platform.binding.GLFW;
import br.fosge.runtime.platform.binding.glfw.GLFWConstants;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.glfw.GLFWJoystickCallback;
import org.lwjgl.glfw.GLFWJoystickCallbackI;

public interface GLFW32 extends GLFW31 {

    /**
     * Sets the icon for the specified window.
     *
     * <p>This function sets the icon of the specified window. If passed an array of candidate images, those of or closest to the sizes desired by the system are
     * selected. If no images are specified, the window reverts to its default icon.</p>
     *
     * <p>The pixels are 32-bit, little-endian, non-premultiplied RGBA, i.e. eight bits per channel with the red channel first. They are arranged canonically as
     * packed sequential rows, starting from the top-left corner.</p>
     *
     * <p>The desired image sizes varies depending on platform and system settings. The selected images will be rescaled as needed. Good sizes include 16x16,
     * 32x32 and 48x48.</p>
     *
     * <p>Notes:</p>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li>The specified image data is copied before this function returns.</li>
     * <li><b>macOS</b>: Regular windows do not have icons on macOS. This function will emit {@link GLFWConstants#GLFW_FEATURE_UNAVAILABLE FEATURE_UNAVAILABLE}. The dock icon will be the same as the
     * application bundle's icon. For more information on bundles, see the <a href="https://developer.apple.com/library/content/documentation/CoreFoundation/Conceptual/CFBundles/">Bundle Programming Guide</a> in the Mac Developer Library.</li>
     * <li><b>Wayland</b>: There is no existing protocol to change an icon, the window will thus inherit the one defined in the application's desktop file.
     * This function will emit {@link GLFWConstants#GLFW_FEATURE_UNAVAILABLE FEATURE_UNAVAILABLE}.</li>
     * </ul>
     *
     * @param window the window whose icon to set
     * @param images the images to create the icon from. This is ignored if count is zero.
     *
     * @since version 3.2
     */
    void glfwSetWindowIcon(long window, GLFWImage.Buffer images);

    /**
     * Sets the size limits of the content area of the specified window. If the window is full screen, the size limits only take effect if once it is made
     * windowed. If the window is not resizable, this function does nothing.
     *
     * <p>The size limits are applied immediately to a windowed mode window and may cause it to be resized.</p>
     *
     * <p>The maximum dimensions must be greater than or equal to the minimum dimensions and all must be greater than or equal to zero.</p>
     *
     * <p>Notes:</p>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: The size limits will not be applied until the window is actually resized, either by the user or by the compositor.</li>
     * </ul>
     *
     * @param window    the window to set limits for
     * @param minwidth  the minimum width, in screen coordinates, of the content area, or {@link GLFWConstants#GLFW_DONT_CARE DONT_CARE}
     * @param minheight the minimum height, in screen coordinates, of the content area, or {@link GLFWConstants#GLFW_DONT_CARE DONT_CARE}
     * @param maxwidth  the maximum width, in screen coordinates, of the content area, or {@link GLFWConstants#GLFW_DONT_CARE DONT_CARE}
     * @param maxheight the maximum height, in screen coordinates, of the content area, or {@link GLFWConstants#GLFW_DONT_CARE DONT_CARE}
     *
     * @since version 3.2
     */
    void glfwSetWindowSizeLimits(long window, int minwidth, int minheight, int maxwidth, int maxheight);

    /**
     * Sets the required aspect ratio of the content area of the specified window. If the window is full screen, the aspect ratio only takes effect once it is
     * made windowed. If the window is not resizable, this function does nothing.
     *
     * <p>The aspect ratio is specified as a numerator and a denominator and both values must be greater than zero. For example, the common 16:9 aspect ratio is
     * specified as 16 and 9, respectively.</p>
     *
     * <p>If the numerator and denominator is set to {@link GLFWConstants#GLFW_DONT_CARE DONT_CARE} then the aspect ratio limit is disabled.</p>
     *
     * <p>The aspect ratio is applied immediately to a windowed mode window and may cause it to be resized.</p>
     *
     * <p>Notes:</p>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: The aspect ratio will not be applied until the window is actually resized, either by the user or by the compositor.</li>
     * </ul>
     *
     * @param window the window to set limits for
     * @param numer  the numerator of the desired aspect ratio, or {@link GLFWConstants#GLFW_DONT_CARE DONT_CARE}
     * @param denom  the denominator of the desired aspect ratio, or {@link GLFWConstants#GLFW_DONT_CARE DONT_CARE}
     *
     * @since version 3.2
     */
    void glfwSetWindowAspectRatio(long window, int numer, int denom);

    /**
     * Maximizes the specified window if it was previously not maximized. If the window is already maximized, this function does nothing.
     *
     * <p>If the specified window is a full screen window, this function does nothing.</p>
     *
     * <p>This function may only be called from the main thread.</p>
     *
     * @param window the window to maximize
     *
     * @since version 3.2
     */
    void glfwMaximizeWindow(long window);

    /**
     * Brings the specified window to front and sets input focus. The window should already be visible and not iconified.
     *
     * <p>By default, both windowed and full screen mode windows are focused when initially created. Set the {@link GLFWConstants#GLFW_FOCUSED FOCUSED} hint to disable this behavior.</p>
     *
     * <p>Also by default, windowed mode windows are focused when shown with {@link #glfwShowWindow ShowWindow}. Set the {@link GLFWConstants#GLFW_FOCUS_ON_SHOW FOCUS_ON_SHOW} window hint to disable this behavior.</p>
     *
     * <p><b>Do not use this function</b> to steal focus from other applications unless you are certain that is what the user wants. Focus stealing can be
     * extremely disruptive.</p>
     *
     * <p>For a less disruptive way of getting the user's attention, see {@link GLFW#glfwRequestWindowAttention RequestWindowAttention}.</p>
     *
     * <p>Notes:</p>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: The compositor will likely ignore focus requests unless another window created by the same application already has input focus.</li>
     * </ul>
     *
     * @param window the window to give input focus
     *
     * @since version 3.2
     */
    void glfwFocusWindow(long window);

    /**
     * Sets the mode, monitor, video mode and placement of a window.
     *
     * <p>This function sets the monitor that the window uses for full screen mode or, if the monitor is {@code NULL}, makes it windowed mode.</p>
     *
     * <p>When setting a monitor, this function updates the width, height and refresh rate of the desired video mode and switches to the video mode closest to
     * it. The window position is ignored when setting a monitor.</p>
     *
     * <p>When the monitor is {@code NULL}, the position, width and height are used to place the window content area. The refresh rate is ignored when no monitor is
     * specified.</p>
     *
     * <p>If you only wish to update the resolution of a full screen window or the size of a windowed mode window, see {@link #glfwSetWindowSize SetWindowSize}.</p>
     *
     * <p>When a window transitions from full screen to windowed mode, this function restores any previous window settings such as whether it is decorated,
     * floating, resizable, has size or aspect ratio limits, etc.</p>
     *
     * <p>Notes:</p>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: The desired window position is ignored, as there is no way for an application to set this property.</li>
     * </ul>
     *
     * @param window      the window whose monitor, size or video mode to set
     * @param monitor     the desired monitor, or {@code NULL} to set windowed mode
     * @param xpos        the desired x-coordinate of the upper-left corner of the content area
     * @param ypos        the desired y-coordinate of the upper-left corner of the content area
     * @param width       the desired with, in screen coordinates, of the content area or video mode
     * @param height      the desired height, in screen coordinates, of the content area or video mode
     * @param refreshRate the desired refresh rate, in Hz, of the video mode, or {@link GLFWConstants#GLFW_DONT_CARE DONT_CARE}
     *
     * @since version 3.2
     */
    void glfwSetWindowMonitor(long window, long monitor, int xpos, int ypos, int width, int height, int refreshRate);

    /**
     * Waits with timeout until events are queued and processes them.
     *
     * <p>This function puts the calling thread to sleep until at least one event is available in the event queue, or until the specified timeout is reached. If
     * one or more events are available, it behaves exactly like {@link #glfwPollEvents PollEvents}, i.e. the events in the queue are processed and the function then returns
     * immediately. Processing events will cause the window and input callbacks associated with those events to be called.</p>
     *
     * <p>The timeout value must be a positive finite number.</p>
     *
     * <p>Since not all events are associated with callbacks, this function may return without a callback having been called even if you are monitoring all
     * callbacks.</p>
     *
     * <p>On some platforms, a window move, resize or menu operation will cause event processing to block. This is due to how event processing is designed on
     * those platforms. You can use the window refresh callback to redraw the contents of your window when necessary during such operations.</p>
     *
     * <p>On some platforms, certain callbacks may be called outside of a call to one of the event processing functions.</p>
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
     * @param timeout the maximum amount of time, in seconds, to wait
     *
     * @since version 3.2
     */
    void glfwWaitEventsTimeout(double timeout);

    /**
     * Returns the layout-specific name of the specified printable key.
     *
     * <p>This function returns the name of the specified printable key, encoded as UTF-8. This is typically the character that key would produce without any
     * modifier keys, intended for displaying key bindings to the user. For dead keys, it is typically the diacritic it would add to a character.</p>
     *
     * <p><b>Do not use this function</b> for text input. You will break text input for many languages even if it happens to work for yours.</p>
     *
     * <p>If the key is {@link GLFWConstants#GLFW_KEY_UNKNOWN KEY_UNKNOWN}, the scancode is used to identify the key, otherwise the scancode is ignored. If you specify a non-printable key, or
     * {@link GLFWConstants#GLFW_KEY_UNKNOWN KEY_UNKNOWN} and a scancode that maps to a non-printable key, this function returns {@code NULL} but does not emit an error.</p>
     *
     * <p>This behavior allows you to always pass in the arguments in the key callback without modification.</p>
     *
     * <p>The printable keys are:</p>
     *
     * <ul>
     * <li>{@link GLFWConstants#GLFW_KEY_APOSTROPHE KEY_APOSTROPHE}</li>
     * <li>{@link GLFWConstants#GLFW_KEY_COMMA KEY_COMMA}</li>
     * <li>{@link GLFWConstants#GLFW_KEY_MINUS KEY_MINUS}</li>
     * <li>{@link GLFWConstants#GLFW_KEY_PERIOD KEY_PERIOD}</li>
     * <li>{@link GLFWConstants#GLFW_KEY_SLASH KEY_SLASH}</li>
     * <li>{@link GLFWConstants#GLFW_KEY_SEMICOLON KEY_SEMICOLON}</li>
     * <li>{@link GLFWConstants#GLFW_KEY_EQUAL KEY_EQUAL}</li>
     * <li>{@link GLFWConstants#GLFW_KEY_LEFT_BRACKET KEY_LEFT_BRACKET}</li>
     * <li>{@link GLFWConstants#GLFW_KEY_RIGHT_BRACKET KEY_RIGHT_BRACKET}</li>
     * <li>{@link GLFWConstants#GLFW_KEY_BACKSLASH KEY_BACKSLASH}</li>
     * <li>{@link GLFWConstants#GLFW_KEY_WORLD_1 KEY_WORLD_1}</li>
     * <li>{@link GLFWConstants#GLFW_KEY_WORLD_2 KEY_WORLD_2}</li>
     * <li>{@link GLFWConstants#GLFW_KEY_0 KEY_0} to {@link GLFWConstants#GLFW_KEY_9 KEY_9}</li>
     * <li>{@link GLFWConstants#GLFW_KEY_A KEY_A} to {@link GLFWConstants#GLFW_KEY_Z KEY_Z}</li>
     * <li>{@link GLFWConstants#GLFW_KEY_KP_0 KEY_KP_0} to {@link GLFWConstants#GLFW_KEY_KP_9 KEY_KP_9}</li>
     * <li>{@link GLFWConstants#GLFW_KEY_KP_DECIMAL KEY_KP_DECIMAL}</li>
     * <li>{@link GLFWConstants#GLFW_KEY_KP_DIVIDE KEY_KP_DIVIDE}</li>
     * <li>{@link GLFWConstants#GLFW_KEY_KP_MULTIPLY KEY_KP_MULTIPLY}</li>
     * <li>{@link GLFWConstants#GLFW_KEY_KP_SUBTRACT KEY_KP_SUBTRACT}</li>
     * <li>{@link GLFWConstants#GLFW_KEY_KP_ADD KEY_KP_ADD}</li>
     * <li>{@link GLFWConstants#GLFW_KEY_KP_EQUAL KEY_KP_EQUAL}</li>
     * </ul>
     *
     * <p>Names for printable keys depend on keyboard layout, while names for non-printable keys are the same across layouts but depend on the application
     * language and should be localized along with other user interface text.</p>
     *
     * <p>The contents of the returned string may change when a keyboard layout change event is received.</p>
     *
     * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the library is terminated.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param key      the key to query, or {@link GLFWConstants#GLFW_KEY_UNKNOWN KEY_UNKNOWN}
     * @param scancode the scancode of the key to query
     *
     * @return the UTF-8 encoded, layout-specific name of the key, or {@code NULL}
     *
     * @since version 3.2
     */
    String glfwGetKeyName(int key, int scancode);

    /**
     * Sets the joystick configuration callback, or removes the currently set callback. This is called when a joystick is connected to or disconnected from
     * the system.
     *
     * <p>For joystick connection and disconnection events to be delivered on all platforms, you need to call one of the event processing functions. Joystick
     * disconnection may also be detected and the callback called by joystick functions. The function will then return whatever it returns if the joystick is
     * not present.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param cbfun the new callback, or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been initialized
     *
     * @since version 3.2
     */
    GLFWJoystickCallback glfwSetJoystickCallback(GLFWJoystickCallbackI cbfun);

    /**
     * Returns the current value of the raw timer.
     *
     * <p>This function returns the current value of the raw timer, measured in {@code 1 / frequency} seconds. To get the frequency, call {@link #glfwGetTimerFrequency GetTimerFrequency}.</p>
     *
     * <p>This function may be called from any thread.</p>
     *
     * @return the value of the timer, or zero if an error occurred
     *
     * @since version 3.2
     */
    long glfwGetTimerValue();

    /**
     * Returns the frequency, in Hz, of the raw timer.
     *
     * <p>This function may be called from any thread.</p>
     *
     * @return the frequency of the timer, in Hz, or zero if an error occurred
     *
     * @since version 3.2
     */
    long glfwGetTimerFrequency();
    
}
