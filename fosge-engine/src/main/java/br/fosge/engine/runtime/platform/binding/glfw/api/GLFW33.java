package br.fosge.engine.runtime.platform.binding.glfw.api;

import br.fosge.engine.runtime.platform.binding.glfw.GLFWConstants;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.*;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public interface GLFW33 extends GLFW32 {

    /**
     * Returns and clears the last error for the calling thread.
     *
     * <p>This function returns and clears the error code of the last error that occurred on the calling thread and optionally a UTF-8 encoded human-readable
     * description of it. If no error has occurred since the last call, it returns {@link GLFWConstants#GLFW_NO_ERROR NO_ERROR} (zero), and the description pointer is set to {@code NULL}.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>This function may be called before {@link #glfwInit Init}.</li>
     * <li>This function may be called from any thread.</li>
     * <li>The returned string is allocated and freed by GLFW. You should not free it yourself. It is guaranteed to be valid only until the next error occurs
     * or the library is terminated.</li>
     * </ul></div>
     *
     * @param description where to store the error description pointer, or {@code NULL}
     *
     * @return the last error code for the calling thread, or {@link GLFWConstants#GLFW_NO_ERROR NO_ERROR} (zero)
     *
     * @since version 3.3
     */
    int glfwGetError(PointerBuffer description);

    /**
     * Sets hints for the next initialization of GLFW.
     *
     * <p>The values you set hints to are never reset by GLFW, but they only take effect during initialization. Once GLFW has been initialized, any values you
     * set will be ignored until the library is terminated and initialized again.</p>
     *
     * <p>Some hints are platform specific. These may be set on any platform but they will only affect their specific platform. Other platforms will simply
     * ignore them. Setting these hints requires no platform specific headers or functions.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>This function may be called before {@link #glfwInit Init}.</li>
     * <li>This function must only be called from the main thread.</li>
     * </ul></div>
     *
     * @param hint  the init hint to set. One of:<br><table><tr><td>{@link GLFWConstants#GLFW_JOYSTICK_HAT_BUTTONS JOYSTICK_HAT_BUTTONS}</td><td>{@link GLFWConstants#GLFW_ANGLE_PLATFORM_TYPE ANGLE_PLATFORM_TYPE}</td><td>{@link GLFWConstants#GLFW_COCOA_CHDIR_RESOURCES COCOA_CHDIR_RESOURCES}</td><td>{@link GLFWConstants#GLFW_COCOA_MENUBAR COCOA_MENUBAR}</td></tr><tr><td>{@link GLFWConstants#GLFW_PLATFORM PLATFORM}</td><td>{@link GLFWConstants#GLFW_X11_XCB_VULKAN_SURFACE X11_XCB_VULKAN_SURFACE}</td></tr></table>
     * @param value the new value of the init hint
     *
     * @since version 3.3
     */
    void glfwInitHint(int hint, int value);

    /**
     * Retrieves the work area of the monitor.
     *
     * <p>This function returns the position, in screen coordinates, of the upper-left corner of the work area of the specified monitor along with the work area
     * size in screen coordinates. The work area is defined as the area of the monitor not occluded by the window system task bar where present. If no task
     * bar exists then the work area is the monitor resolution in screen coordinates.</p>
     *
     * <p>Any or all of the position and size arguments may be {@code NULL}.  If an error occurs, all non-{@code NULL} position and size arguments will be set to zero.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param monitor the monitor to query
     * @param xpos    where to store the working area x-coordinate, or {@code NULL}
     * @param ypos    where to store the working area y-coordinate, or {@code NULL}
     * @param width   where to store the working area width, or {@code NULL}
     * @param height  where to store the working area height, or {@code NULL}
     *
     * @since version 3.3
     */
    void glfwGetMonitorWorkarea(long monitor, IntBuffer xpos, IntBuffer ypos, IntBuffer width, IntBuffer height);

    /**
     * Retrieves the content scale for the specified window.
     *
     * <p>This function retrieves the content scale for the specified window. The content scale is the ratio between the current DPI and the platform's default
     * DPI. This is especially important for text and any UI elements. If the pixel dimensions of your UI scaled by this look appropriate on your machine then
     * it should appear at a reasonable size on other machines regardless of their DPI and scaling settings. This relies on the system DPI and scaling
     * settings being somewhat correct.</p>
     *
     * <p>On platforms where each monitor can have its own content scale, the window content scale will depend on which monitor the system considers the window
     * to be on.</p>
     *
     * @param window the window to query
     * @param xscale where to store the x-axis content scale, or {@code NULL}
     * @param yscale where to store the y-axis content scale, or {@code NULL}
     *
     * @since version 3.3
     */
    void glfwGetWindowContentScale(long window, FloatBuffer xscale, FloatBuffer yscale);

    /**
     * Returns the opacity of the whole window.
     *
     * <p>This function returns the opacity of the window, including any decorations.</p>
     *
     * <p>The opacity (or alpha) value is a positive finite number between zero and one, where zero is fully transparent and one is fully opaque.  If the system
     * does not support whole window transparency, this function always returns one.</p>
     *
     * <p>The initial opacity value for newly created windows is one.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window to query
     *
     * @return the opacity value of the specified window
     *
     * @since version 3.3
     */
    float glfwGetWindowOpacity(long window);

    /**
     * Sets the opacity of the whole window.
     *
     * <p>This function sets the opacity of the window, including any decorations.</p>
     *
     * <p>The opacity (or alpha) value is a positive finite number between zero and one, where zero is fully transparent and one is fully opaque.</p>
     *
     * <p>The initial opacity value for newly created windows is one.</p>
     *
     * <p>A window created with framebuffer transparency may not use whole window transparency. The results of doing this are undefined.</p>
     *
     * <p>Notes:</p>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: There is no way to set an opacity factor for a window. This function will emit {@link GLFWConstants#GLFW_FEATURE_UNAVAILABLE FEATURE_UNAVAILABLE}.</li>
     * </ul>
     *
     * @param window  the window to set the opacity for
     * @param opacity the desired opacity of the specified window
     *
     * @since version 3.3
     */
    void glfwSetWindowOpacity(long window, float opacity);

    /**
     * Requests user attention to the specified window.
     *
     * <p>This function requests user attention to the specified window. On platforms where this is not supported, attention is requested to the application as
     * a whole.</p>
     *
     * <p>Once the user has given attention, usually by focusing the window or application, the system will end the request automatically.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>macOS:</b> Attention is requested to the application as a whole, not the specific window.</li>
     * </ul></div>
     *
     * @param window the window to request attention to
     *
     * @since version 3.3
     */
    void glfwRequestWindowAttention(long window);

    /**
     * Sets an attribute of the specified window.
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window to set the attribute for
     * @param attrib the attribute to set.
     *
     *               <p>Some of these attributes are ignored for full screen windows. The new value will take effect if the window is later made windowed.</p>
     *
     *               <p>Some of these attributes are ignored for windowed mode windows. The new value will take effect if the window is later made full screen.</p>
     *
     *               <p>Calling {@link #glfwGetWindowAttrib GetWindowAttrib} will always return the latest value, even if that value is ignored by the current mode of the window.</p>
     *
     *               <p><b>Wayland</b>: The {@link GLFWConstants#GLFW_FLOATING FLOATING} window attribute is not supported. Setting this will emit {@link GLFWConstants#GLFW_FEATURE_UNAVAILABLE FEATURE_UNAVAILABLE}. One of:<br></p><table><tr><td>{@link GLFWConstants#GLFW_DECORATED DECORATED}</td><td>{@link GLFWConstants#GLFW_RESIZABLE RESIZABLE}</td><td>{@link GLFWConstants#GLFW_FLOATING FLOATING}</td><td>{@link GLFWConstants#GLFW_AUTO_ICONIFY AUTO_ICONIFY}</td><td>{@link GLFWConstants#GLFW_FOCUS_ON_SHOW FOCUS_ON_SHOW}</td><td>{@link GLFWConstants#GLFW_MOUSE_PASSTHROUGH MOUSE_PASSTHROUGH}</td></tr></table>
     * @param value  the value to set
     *
     * @since version 3.3
     */
    void glfwSetWindowAttrib(long window, int attrib, int value);

    /**
     * Sets the maximization callback of the specified window, which is called when the window is maximized or restored.
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
     *         <a href="https://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
     *
     * @since version 3.3
     */
    GLFWWindowMaximizeCallback glfwSetWindowMaximizeCallback(long window, GLFWWindowMaximizeCallbackI cbfun);

    /**
     * Sets the window content scale callback for the specified window, which is called when the content scale of the specified window changes.
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
     *         <a href="https://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
     *
     * @since version 3.3
     */
    GLFWWindowContentScaleCallback glfwSetWindowContentScaleCallback(long window, GLFWWindowContentScaleCallbackI cbfun);

    /**
     * Returns whether raw mouse motion is supported.
     *
     * <p>This function returns whether raw mouse motion is supported on the current system. This status does not change after GLFW has been initialized so you
     * only need to check this once. If you attempt to enable raw motion on a system that does not support it, {@link GLFWConstants#GLFW_PLATFORM_ERROR PLATFORM_ERROR} will be emitted.</p>
     *
     * <p>Raw mouse motion is closer to the actual motion of the mouse across a surface. It is not affected by the scaling and acceleration applied to the motion
     * of the desktop cursor. That processing is suitable for a cursor while raw motion is better for controlling for example a 3D camera. Because of this,
     * raw mouse motion is only provided when the cursor is disabled.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @return {@link GLFWConstants#GLFW_TRUE TRUE} if raw mouse motion is supported on the current machine, or {@link GLFWConstants#GLFW_FALSE FALSE} otherwise
     *
     * @since version 3.3
     */
    boolean glfwRawMouseMotionSupported();

    /**
     * Returns the platform dependent scancode of the specified key.
     *
     * <p>This function returns the platform dependent scancode of the specified key. This is intended for platform specific default keybindings.</p>
     *
     * <p>If the specified key token corresponds to a physical key not supported on the current platform then this method will return {@code -1}. Calling this
     * function with anything other than a key token will return {@code -1} and generate an {@link GLFWConstants#GLFW_INVALID_ENUM INVALID_ENUM} error.</p>
     *
     * <p>This function may be called from any thread.</p>
     *
     * @param key any key token
     *
     * @return the platform-specific scancode for the key, or {@code -1} if the key is not supported on the current platform or an error occurred
     *
     * @since version 3.3
     */
    int glfwGetKeyScancode(int key);

    /**
     * Returns the state of all hats of the specified joystick.
     *
     * <p>This function returns the state of all hats of the specified joystick. Each element in the array is one of the following values:</p>
     *
     * <pre><code>
     * Name                | Value
     * ------------------- | ------------------------------
     * GLFW_HAT_CENTERED   | 0
     * GLFW_HAT_UP         | 1
     * GLFW_HAT_RIGHT      | 2
     * GLFW_HAT_DOWN       | 4
     * GLFW_HAT_LEFT       | 8
     * GLFW_HAT_RIGHT_UP   | GLFW_HAT_RIGHT | GLFW_HAT_UP
     * GLFW_HAT_RIGHT_DOWN | GLFW_HAT_RIGHT | GLFW_HAT_DOWN
     * GLFW_HAT_LEFT_UP    | GLFW_HAT_LEFT  | GLFW_HAT_UP
     * GLFW_HAT_LEFT_DOWN  | GLFW_HAT_LEFT  | GLFW_HAT_DOWN</code></pre>
     *
     * <p>The diagonal directions are bitwise combinations of the primary (up, right, down and left) directions and you can test for these individually by ANDing
     * it with the corresponding direction.</p>
     *
     * <pre><code>
     * if (hats[2] &amp; GLFW_HAT_RIGHT)
     * {
     *     // State of hat 2 could be right-up, right or right-down
     * }</code></pre>
     *
     * <p>If the specified joystick is not present this function will return {@code NULL} but will not generate an error. This can be used instead of first calling
     * {@link #glfwJoystickPresent JoystickPresent}.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li>The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
     * function is called again for that joystick or the library is terminated.</li>
     * </ul></div>
     *
     * @param jid the joystick to query
     *
     * @return an array of hat states, or {@code NULL} if the joystick is not present or an error occurred
     *
     * @since version 3.3
     */
    ByteBuffer glfwGetJoystickHats(int jid);

    /**
     * Returns the SDL compatible GUID, as a UTF-8 encoded hexadecimal string, of the specified joystick.
     *
     * <p>The GUID is what connects a joystick to a gamepad mapping. A connected joystick will always have a GUID even if there is no gamepad mapping assigned to
     * it.</p>
     *
     * <p>The GUID uses the format introduced in SDL 2.0.5. This GUID tries to uniquely identify the make and model of a joystick but does not identify a
     * specific unit, e.g. all wired Xbox 360 controllers will have the same GUID on that platform. The GUID for a unit may vary between platforms depending
     * on what hardware information the platform specific APIs provide.</p>
     *
     * <p>If the specified joystick is not present this function will return {@code NULL} but will not generate an error. This can be used instead of first calling
     * {@link #glfwJoystickPresent JoystickPresent}.</p>
     *
     * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected or the
     * library is terminated.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param jid the joystick to query
     *
     * @return the UTF-8 encoded GUID of the joystick, or {@code NULL} if the joystick is not present or an error occurred
     *
     * @since version 3.3
     */
    String glfwGetJoystickGUID(int jid);

    /**
     * Sets the user pointer of the specified joystick.
     *
     * <p>This function sets the user-defined pointer of the specified joystick. The current value is retained until the joystick is disconnected. The initial
     * value is {@code NULL}.</p>
     *
     * <p>This function may be called from the joystick callback, even for a joystick that is being disconnected.</p>
     *
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param jid     the joystick whose pointer to set
     * @param pointer the new value
     *
     * @since version 3.3
     */
    void glfwSetJoystickUserPointer(int jid, long pointer);

    /**
     * Returns the user pointer of the specified joystick.
     *
     * <p>This function returns the current value of the user-defined pointer of the specified joystick. The initial value is {@code NULL}.</p>
     *
     * <p>This function may be called from the joystick callback, even for a joystick that is being disconnected.</p>
     *
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param jid the joystick whose pointer to set
     *
     * @since version 3.3
     */
    long glfwGetJoystickUserPointer(int jid);

    /**
     * Returns whether the specified joystick is both present and has a gamepad mapping.
     *
     * <p>If the specified joystick is present but does not have a gamepad mapping this function will return {@code false} but will not generate an error. Call
     * {@link #glfwJoystickPresent JoystickPresent} to check if a joystick is present regardless of whether it has a mapping.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param jid the joystick id to query
     *
     * @return {@code true} if a joystick is both present and has a gamepad mapping or {@code false} otherwise
     *
     * @since version 3.3
     */
    boolean glfwJoystickIsGamepad(int jid);

    /**
     * Adds the specified SDL_GameControllerDB gamepad mappings.
     *
     * <p>This function parses the specified ASCII encoded string and updates the internal list with any gamepad mappings it finds. This string may contain either
     * a single gamepad mapping or many mappings separated by newlines. The parser supports the full format of the {@code gamecontrollerdb.txt} source file
     * including empty lines and comments.</p>
     *
     * <p>See <a href="https://www.glfw.org/docs/latest/input.html#gamepad_mapping">gamepad_mapping</a> for a description of the format.</p>
     *
     * <p>If there is already a gamepad mapping for a given GUID in the internal list, it will be replaced by the one passed to this function. If the library is
     * terminated and re-initialized the internal list will revert to the built-in default.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param string the string containing the gamepad mappings
     *
     * @return {@code true}, or {@code false} if an error occurred
     *
     * @since version 3.3
     */
    boolean glfwUpdateGamepadMappings(ByteBuffer string);

    /**
     * Returns the human-readable name of the gamepad from the gamepad mapping assigned to the specified joystick.
     *
     * <p>If the specified joystick is not present or does not have a gamepad mapping this function will return {@code NULL} but will not generate an error. Call
     * {@link #glfwJoystickIsGamepad JoystickIsGamepad} to check if a joystick is present regardless of whether it has a mapping.</p>
     *
     * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, the
     * gamepad mappings are updated or the library is terminated.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param jid the joystick to query
     *
     * @return the UTF-8 encoded name of the gamepad, or {@code NULL} if the joystick is not present, does not have a mapping or an error occurred
     *
     * @since version 3.3
     */
    String glfwGetGamepadName(int jid);

    /**
     * Retrieves the state of the specified joystick remapped to an Xbox-like gamepad.
     *
     * <p>If the specified joystick is not present or does not have a gamepad mapping this function will return {@link GLFWConstants#GLFW_FALSE FALSE} but will not generate an error. Call
     * {@link #glfwJoystickPresent JoystickPresent} to check whether it is present regardless of whether it has a mapping.</p>
     *
     * <p>The Guide button may not be available for input as it is often hooked by the system or the Steam client.</p>
     *
     * <p>Not all devices have all the buttons or axes provided by {@link GLFWGamepadState}. Unavailable buttons and axes will always report {@link GLFWConstants#GLFW_RELEASE RELEASE} and 0.0
     * respectively.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param jid   the joystick to query
     * @param state the gamepad input state of the joystick
     *
     * @return {@code true} if successful, or {@code false} if no joystick is connected, it has no gamepad mapping or an error occurred
     *
     * @since version 3.3
     */
    boolean glfwGetGamepadState(int jid, GLFWGamepadState state);

    /**
     * Retrieves the content scale for the specified monitor.
     *
     * <p>This function retrieves the content scale for the specified monitor. The content scale is the ratio between the current DPI and the platform's default
     * DPI. This is especially important for text and any UI elements. If the pixel dimensions of your UI scaled by this look appropriate on your machine then
     * it should appear at a reasonable size on other machines regardless of their DPI and scaling settings. This relies on the system DPI and scaling
     * settings being somewhat correct.</p>
     *
     * <p>The content scale may depend on both the monitor resolution and pixel density and on user settings. It may be very different from the raw DPI
     * calculated from the physical size and current resolution.</p>
     *
     * <p><b>Wayland</b>: Fractional scaling information is not yet available for monitors, so this function only returns integer content scales.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param monitor the monitor to query
     * @param xscale  where to store the x-axis content scale, or {@code NULL}
     * @param yscale  where to store the y-axis content scale, or {@code NULL}
     *
     * @since version 3.3
     */
    void glfwGetMonitorContentScale(long monitor, FloatBuffer xscale, FloatBuffer yscale);

    /**
     * Sets the user pointer of the specified monitor.
     *
     * <p>This function sets the user-defined pointer of the specified monitor. The current value is retained until the monitor is disconnected. The initial
     * value is {@code NULL}.</p>
     *
     * <p>This function may be called from the monitor callback, even for a monitor that is being disconnected.</p>
     *
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param monitor the monitor whose pointer to set
     * @param pointer the new value
     *
     * @since version 3.3
     */
    void glfwSetMonitorUserPointer(long monitor, long pointer);

    /**
     * Returns the user pointer of the specified monitor.
     *
     * <p>This function returns the current value of the user-defined pointer of the specified monitor. The initial value is {@code NULL}.</p>
     *
     * <p>This function may be called from the monitor callback, even for a monitor that is being disconnected.</p>
     *
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param monitor the monitor whose pointer to return
     *
     * @since version 3.3
     */
    long glfwGetMonitorUserPointer(long monitor);

    /**
     * Sets the specified window hint to the desired value.
     *
     * <p>This function sets hints for the next call to {@link #glfwCreateWindow CreateWindow}. The hints, once set, retain their values until changed by a call to this function or
     * {@link #glfwDefaultWindowHints DefaultWindowHints}, or until the library is terminated.</p>
     *
     * <p>Only string type hints can be set with this function. Integer value hints are set with {@link #glfwWindowHint WindowHint}.</p>
     *
     * <p>This function does not check whether the specified hint values are valid. If you set hints to invalid values this will instead be reported by the next
     * call to {@link #glfwCreateWindow CreateWindow}.</p>
     *
     * <p>Some hints are platform specific. These may be set on any platform but they will only affect their specific platform. Other platforms will ignore them.
     * Setting these hints requires no platform specific headers or functions.</p>
     *
     * <h5>Supported and default values</h5>
     *
     * <table class=striped>
     * <tr><th>Name</th><th>Default value</th><th>Supported values</th></tr>
     * <tr><td>{@link GLFWConstants#GLFW_COCOA_FRAME_NAME COCOA_FRAME_NAME}</td><td>""</td><td>A UTF-8 encoded frame autosave name</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_X11_CLASS_NAME X11_CLASS_NAME}</td><td>""</td><td>An ASCII encoded {@code WM_CLASS} class name</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_X11_INSTANCE_NAME X11_INSTANCE_NAME}</td><td>""</td><td>An ASCII encoded {@code WM_CLASS} instance name</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_WAYLAND_APP_ID WAYLAND_APP_ID}</td><td>""</td><td>An ASCII encoded Wayland {@code app_id} name</td></tr>
     * </table>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param hint  the window hint to set. One of:<br><table><tr><td>{@link GLFWConstants#GLFW_COCOA_FRAME_NAME COCOA_FRAME_NAME}</td><td>{@link GLFWConstants#GLFW_X11_CLASS_NAME X11_CLASS_NAME}</td><td>{@link GLFWConstants#GLFW_X11_INSTANCE_NAME X11_INSTANCE_NAME}</td><td>{@link GLFWConstants#GLFW_WAYLAND_APP_ID WAYLAND_APP_ID}</td></tr></table>
     * @param value the new value of the window hint. The specified string is copied before this function returns.
     *
     * @since version 3.3
     */
    void glfwWindowHintString(int hint, ByteBuffer value);

    /**
     * Sets the specified window hint to the desired value.
     *
     * <p>This function sets hints for the next call to {@link #glfwCreateWindow CreateWindow}. The hints, once set, retain their values until changed by a call to this function or
     * {@link #glfwDefaultWindowHints DefaultWindowHints}, or until the library is terminated.</p>
     *
     * <p>Only string type hints can be set with this function. Integer value hints are set with {@link #glfwWindowHint WindowHint}.</p>
     *
     * <p>This function does not check whether the specified hint values are valid. If you set hints to invalid values this will instead be reported by the next
     * call to {@link #glfwCreateWindow CreateWindow}.</p>
     *
     * <p>Some hints are platform specific. These may be set on any platform but they will only affect their specific platform. Other platforms will ignore them.
     * Setting these hints requires no platform specific headers or functions.</p>
     *
     * <h5>Supported and default values</h5>
     *
     * <table class=striped>
     * <tr><th>Name</th><th>Default value</th><th>Supported values</th></tr>
     * <tr><td>{@link GLFWConstants#GLFW_COCOA_FRAME_NAME COCOA_FRAME_NAME}</td><td>""</td><td>A UTF-8 encoded frame autosave name</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_X11_CLASS_NAME X11_CLASS_NAME}</td><td>""</td><td>An ASCII encoded {@code WM_CLASS} class name</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_X11_INSTANCE_NAME X11_INSTANCE_NAME}</td><td>""</td><td>An ASCII encoded {@code WM_CLASS} instance name</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_WAYLAND_APP_ID WAYLAND_APP_ID}</td><td>""</td><td>An ASCII encoded Wayland {@code app_id} name</td></tr>
     * </table>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param hint  the window hint to set. One of:<br><table><tr><td>{@link GLFWConstants#GLFW_COCOA_FRAME_NAME COCOA_FRAME_NAME}</td><td>{@link GLFWConstants#GLFW_X11_CLASS_NAME X11_CLASS_NAME}</td><td>{@link GLFWConstants#GLFW_X11_INSTANCE_NAME X11_INSTANCE_NAME}</td><td>{@link GLFWConstants#GLFW_WAYLAND_APP_ID WAYLAND_APP_ID}</td></tr></table>
     * @param value the new value of the window hint. The specified string is copied before this function returns.
     *
     * @since version 3.3
     */
    void glfwWindowHintString(int hint, CharSequence value);
    
}
