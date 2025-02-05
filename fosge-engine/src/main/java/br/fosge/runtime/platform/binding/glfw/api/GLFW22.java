package br.fosge.runtime.platform.binding.glfw.api;

import br.fosge.runtime.platform.binding.GLFW;
import br.fosge.runtime.platform.binding.glfw.GLFWConstants;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

public interface GLFW22 extends GLFW21 {


    /**
     * Sets hints for the next call to {@link #glfwCreateWindow CreateWindow}. The hints, once set, retain their values until changed by a call to this function or
     * {@link GLFW#glfwDefaultWindowHints DefaultWindowHints}, or until the library is terminated.
     *
     * <p>Only integer value hints can be set with this function. String value hints are set with {@link GLFW#glfwWindowHintString WindowHintString}.</p>
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
     * <tr><td>{@link GLFWConstants#GLFW_RESIZABLE RESIZABLE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE} or {@link GLFWConstants#GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_VISIBLE VISIBLE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE} or {@link GLFWConstants#GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_DECORATED DECORATED}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE} or {@link GLFWConstants#GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_FOCUSED FOCUSED}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE} or {@link GLFWConstants#GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_AUTO_ICONIFY AUTO_ICONIFY}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE} or {@link GLFWConstants#GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_FLOATING FLOATING}</td><td>{@link GLFWConstants#GLFW_FALSE FALSE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE} or {@link GLFWConstants#GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_MAXIMIZED MAXIMIZED}</td><td>{@link GLFWConstants#GLFW_FALSE FALSE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE} or {@link GLFWConstants#GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_CENTER_CURSOR CENTER_CURSOR}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE} or {@link GLFWConstants#GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_TRANSPARENT_FRAMEBUFFER TRANSPARENT_FRAMEBUFFER}</td><td>{@link GLFWConstants#GLFW_FALSE FALSE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE} or {@link GLFWConstants#GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_FOCUS_ON_SHOW FOCUS_ON_SHOW}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE} or {@link GLFWConstants#GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_SCALE_TO_MONITOR SCALE_TO_MONITOR}</td><td>{@link GLFWConstants#GLFW_FALSE FALSE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE} or {@link GLFWConstants#GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_MOUSE_PASSTHROUGH MOUSE_PASSTHROUGH}</td><td>{@link GLFWConstants#GLFW_FALSE FALSE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE} or {@link GLFWConstants#GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_RED_BITS RED_BITS}</td><td>8</td><td>0 to {@link Integer#MAX_VALUE} or {@link GLFWConstants#GLFW_DONT_CARE DONT_CARE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_GREEN_BITS GREEN_BITS}</td><td>8</td><td>0 to {@link Integer#MAX_VALUE} or {@link GLFWConstants#GLFW_DONT_CARE DONT_CARE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_BLUE_BITS BLUE_BITS}</td><td>8</td><td>0 to {@link Integer#MAX_VALUE} or {@link GLFWConstants#GLFW_DONT_CARE DONT_CARE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_ALPHA_BITS ALPHA_BITS}</td><td>8</td><td>0 to {@link Integer#MAX_VALUE} or {@link GLFWConstants#GLFW_DONT_CARE DONT_CARE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_DEPTH_BITS DEPTH_BITS}</td><td>24</td><td>0 to {@link Integer#MAX_VALUE} or {@link GLFWConstants#GLFW_DONT_CARE DONT_CARE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_STENCIL_BITS STENCIL_BITS}</td><td>8</td><td>0 to {@link Integer#MAX_VALUE} or {@link GLFWConstants#GLFW_DONT_CARE DONT_CARE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_ACCUM_RED_BITS ACCUM_RED_BITS}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE} or {@link GLFWConstants#GLFW_DONT_CARE DONT_CARE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_ACCUM_GREEN_BITS ACCUM_GREEN_BITS}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE} or {@link GLFWConstants#GLFW_DONT_CARE DONT_CARE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_ACCUM_BLUE_BITS ACCUM_BLUE_BITS}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE} or {@link GLFWConstants#GLFW_DONT_CARE DONT_CARE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_ACCUM_ALPHA_BITS ACCUM_ALPHA_BITS}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE} or {@link GLFWConstants#GLFW_DONT_CARE DONT_CARE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_AUX_BUFFERS AUX_BUFFERS}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_SAMPLES SAMPLES}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_REFRESH_RATE REFRESH_RATE}</td><td>{@link GLFWConstants#GLFW_DONT_CARE DONT_CARE}</td><td>0 to {@link Integer#MAX_VALUE} or {@link GLFWConstants#GLFW_DONT_CARE DONT_CARE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_STEREO STEREO}</td><td>{@link GLFWConstants#GLFW_FALSE FALSE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE} or {@link GLFWConstants#GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_SRGB_CAPABLE SRGB_CAPABLE}</td><td>{@link GLFWConstants#GLFW_FALSE FALSE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE} or {@link GLFWConstants#GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_DOUBLEBUFFER DOUBLEBUFFER}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE} or {@link GLFWConstants#GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_CLIENT_API CLIENT_API}</td><td>{@link GLFWConstants#GLFW_OPENGL_API OPENGL_API}</td><td>{@link GLFWConstants#GLFW_NO_API NO_API} {@link GLFWConstants#GLFW_OPENGL_API OPENGL_API} {@link GLFWConstants#GLFW_OPENGL_ES_API OPENGL_ES_API}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_CONTEXT_CREATION_API CONTEXT_CREATION_API}</td><td>{@link GLFWConstants#GLFW_NATIVE_CONTEXT_API NATIVE_CONTEXT_API}</td><td>{@link GLFWConstants#GLFW_NATIVE_CONTEXT_API NATIVE_CONTEXT_API} {@link GLFWConstants#GLFW_EGL_CONTEXT_API EGL_CONTEXT_API} {@link GLFWConstants#GLFW_OSMESA_CONTEXT_API OSMESA_CONTEXT_API}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_CONTEXT_VERSION_MAJOR CONTEXT_VERSION_MAJOR}</td><td>1</td><td>Any valid major version number of the chosen client API</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_CONTEXT_VERSION_MINOR CONTEXT_VERSION_MINOR}</td><td>0</td><td>Any valid minor version number of the chosen client API</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_CONTEXT_ROBUSTNESS CONTEXT_ROBUSTNESS}</td><td>{@link GLFWConstants#GLFW_NO_ROBUSTNESS NO_ROBUSTNESS}</td><td>{@link GLFWConstants#GLFW_NO_ROBUSTNESS NO_ROBUSTNESS} {@link GLFWConstants#GLFW_NO_RESET_NOTIFICATION NO_RESET_NOTIFICATION} {@link GLFWConstants#GLFW_LOSE_CONTEXT_ON_RESET LOSE_CONTEXT_ON_RESET}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR}</td><td>{@link GLFWConstants#GLFW_ANY_RELEASE_BEHAVIOR ANY_RELEASE_BEHAVIOR}</td><td>{@link GLFWConstants#GLFW_ANY_RELEASE_BEHAVIOR ANY_RELEASE_BEHAVIOR} {@link GLFWConstants#GLFW_RELEASE_BEHAVIOR_FLUSH RELEASE_BEHAVIOR_FLUSH} {@link GLFWConstants#GLFW_RELEASE_BEHAVIOR_NONE RELEASE_BEHAVIOR_NONE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_CONTEXT_NO_ERROR CONTEXT_NO_ERROR}</td><td>{@link GLFWConstants#GLFW_FALSE FALSE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE} or {@link GLFWConstants#GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_OPENGL_FORWARD_COMPAT OPENGL_FORWARD_COMPAT}</td><td>{@link GLFWConstants#GLFW_FALSE FALSE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE} or {@link GLFWConstants#GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_OPENGL_DEBUG_CONTEXT OPENGL_DEBUG_CONTEXT}</td><td>{@link GLFWConstants#GLFW_FALSE FALSE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE} or {@link GLFWConstants#GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_OPENGL_PROFILE OPENGL_PROFILE}</td><td>{@link GLFWConstants#GLFW_OPENGL_ANY_PROFILE OPENGL_ANY_PROFILE}</td><td>{@link GLFWConstants#GLFW_OPENGL_ANY_PROFILE OPENGL_ANY_PROFILE} {@link GLFWConstants#GLFW_OPENGL_CORE_PROFILE OPENGL_CORE_PROFILE} {@link GLFWConstants#GLFW_OPENGL_COMPAT_PROFILE OPENGL_COMPAT_PROFILE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_WIN32_KEYBOARD_MENU WIN32_KEYBOARD_MENU}</td><td>{@link GLFWConstants#GLFW_FALSE FALSE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE} or {@link GLFWConstants#GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_COCOA_RETINA_FRAMEBUFFER COCOA_RETINA_FRAMEBUFFER}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE} or {@link GLFWConstants#GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_COCOA_GRAPHICS_SWITCHING COCOA_GRAPHICS_SWITCHING}</td><td>{@link GLFWConstants#GLFW_FALSE FALSE}</td><td>{@link GLFWConstants#GLFW_TRUE TRUE} or {@link GLFWConstants#GLFW_FALSE FALSE}</td></tr>
     * </table>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param hint  the window hint to set. One of:<br><table><tr><td>{@link GLFWConstants#GLFW_FOCUSED FOCUSED}</td><td>{@link GLFWConstants#GLFW_RESIZABLE RESIZABLE}</td><td>{@link GLFWConstants#GLFW_VISIBLE VISIBLE}</td><td>{@link GLFWConstants#GLFW_DECORATED DECORATED}</td><td>{@link GLFWConstants#GLFW_AUTO_ICONIFY AUTO_ICONIFY}</td></tr><tr><td>{@link GLFWConstants#GLFW_FLOATING FLOATING}</td><td>{@link GLFWConstants#GLFW_MAXIMIZED MAXIMIZED}</td><td>{@link GLFWConstants#GLFW_CENTER_CURSOR CENTER_CURSOR}</td><td>{@link GLFWConstants#GLFW_TRANSPARENT_FRAMEBUFFER TRANSPARENT_FRAMEBUFFER}</td><td>{@link GLFWConstants#GLFW_FOCUS_ON_SHOW FOCUS_ON_SHOW}</td></tr><tr><td>{@link GLFWConstants#GLFW_MOUSE_PASSTHROUGH MOUSE_PASSTHROUGH}</td><td>{@link GLFWConstants#GLFW_POSITION_X POSITION_X}</td><td>{@link GLFWConstants#GLFW_POSITION_Y POSITION_Y}</td><td>{@link GLFWConstants#GLFW_SOFT_FULLSCREEN SOFT_FULLSCREEN}</td><td>{@link GLFWConstants#GLFW_CLIENT_API CLIENT_API}</td></tr><tr><td>{@link GLFWConstants#GLFW_CONTEXT_VERSION_MAJOR CONTEXT_VERSION_MAJOR}</td><td>{@link GLFWConstants#GLFW_CONTEXT_VERSION_MINOR CONTEXT_VERSION_MINOR}</td><td>{@link GLFWConstants#GLFW_CONTEXT_ROBUSTNESS CONTEXT_ROBUSTNESS}</td><td>{@link GLFWConstants#GLFW_OPENGL_FORWARD_COMPAT OPENGL_FORWARD_COMPAT}</td><td>{@link GLFWConstants#GLFW_CONTEXT_DEBUG CONTEXT_DEBUG}</td></tr><tr><td>{@link GLFWConstants#GLFW_OPENGL_DEBUG_CONTEXT OPENGL_DEBUG_CONTEXT}</td><td>{@link GLFWConstants#GLFW_OPENGL_PROFILE OPENGL_PROFILE}</td><td>{@link GLFWConstants#GLFW_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR}</td><td>{@link GLFWConstants#GLFW_CONTEXT_NO_ERROR CONTEXT_NO_ERROR}</td><td>{@link GLFWConstants#GLFW_CONTEXT_CREATION_API CONTEXT_CREATION_API}</td></tr><tr><td>{@link GLFWConstants#GLFW_SCALE_TO_MONITOR SCALE_TO_MONITOR}</td><td>{@link GLFWConstants#GLFW_SCALE_FRAMEBUFFER SCALE_FRAMEBUFFER}</td><td>{@link GLFWConstants#GLFW_RED_BITS RED_BITS}</td><td>{@link GLFWConstants#GLFW_GREEN_BITS GREEN_BITS}</td><td>{@link GLFWConstants#GLFW_BLUE_BITS BLUE_BITS}</td></tr><tr><td>{@link GLFWConstants#GLFW_ALPHA_BITS ALPHA_BITS}</td><td>{@link GLFWConstants#GLFW_DEPTH_BITS DEPTH_BITS}</td><td>{@link GLFWConstants#GLFW_STENCIL_BITS STENCIL_BITS}</td><td>{@link GLFWConstants#GLFW_ACCUM_RED_BITS ACCUM_RED_BITS}</td><td>{@link GLFWConstants#GLFW_ACCUM_GREEN_BITS ACCUM_GREEN_BITS}</td></tr><tr><td>{@link GLFWConstants#GLFW_ACCUM_BLUE_BITS ACCUM_BLUE_BITS}</td><td>{@link GLFWConstants#GLFW_ACCUM_ALPHA_BITS ACCUM_ALPHA_BITS}</td><td>{@link GLFWConstants#GLFW_AUX_BUFFERS AUX_BUFFERS}</td><td>{@link GLFWConstants#GLFW_STEREO STEREO}</td><td>{@link GLFWConstants#GLFW_SAMPLES SAMPLES}</td></tr><tr><td>{@link GLFWConstants#GLFW_SRGB_CAPABLE SRGB_CAPABLE}</td><td>{@link GLFWConstants#GLFW_REFRESH_RATE REFRESH_RATE}</td><td>{@link GLFWConstants#GLFW_DOUBLEBUFFER DOUBLEBUFFER}</td><td>{@link GLFWConstants#GLFW_COCOA_RETINA_FRAMEBUFFER COCOA_RETINA_FRAMEBUFFER}</td><td>{@link GLFWConstants#GLFW_COCOA_GRAPHICS_SWITCHING COCOA_GRAPHICS_SWITCHING}</td></tr></table>
     * @param value the new value of the window hint
     *
     * @since version 2.2
     */
    void glfwWindowHint(int hint, int value);

    /**
     * Returns the values of all axes of the specified joystick. Each element in the array is a value between -1.0 and 1.0.
     *
     * <p>If the specified joystick is not present this function will return {@code NULL} but will not generate an error. This can be used instead of first calling
     * {@link GLFW#glfwJoystickPresent JoystickPresent}.</p>
     *
     * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
     * function is called again for that joystick or the library is terminated.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param jid the joystick to query
     *
     * @return an array of axis values, or {@code NULL} if the joystick is not present
     *
     * @since version 2.2
     */
    FloatBuffer glfwGetJoystickAxes(int jid);

    /**
     * Returns the state of all buttons of the specified joystick. Each element in the array is either {@link GLFWConstants#GLFW_PRESS PRESS} or {@link GLFWConstants#GLFW_RELEASE RELEASE}.
     *
     * <p>For backward compatibility with earlier versions that did not have {@link GLFW#glfwGetJoystickHats GetJoystickHats}, the button array also includes all hats, each represented as four
     * buttons. The hats are in the same order as returned by {@link GLFW#glfwGetJoystickHats GetJoystickHats} and are in the order up, right, down and left. To disable these extra
     * buttons, set the {@link GLFWConstants#GLFW_JOYSTICK_HAT_BUTTONS JOYSTICK_HAT_BUTTONS} init hint before initialization.</p>
     *
     * <p>If the specified joystick is not present this function will return {@code NULL} but will not generate an error. This can be used instead of first calling
     * {@link GLFW#glfwJoystickPresent JoystickPresent}.</p>
     *
     * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
     * function is called again for that joystick or the library is terminated.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param jid the joystick to query
     *
     * @return an array of button states, or {@code NULL} if the joystick is not present
     *
     * @since version 2.2
     */
    ByteBuffer glfwGetJoystickButtons(int jid);

    /**
     * Sets the value of the GLFW timer. It then continues to count up from that value. The value must be a positive finite number less than or equal to
     * 18446744073.0, which is approximately 584.5 years.
     *
     * <p>The upper limit of the timer is calculated as <code>floor((2<sup>64</sup> - 1) / 10<sup>9</sup>)</code> and is due to implementations storing nanoseconds
     * in 64 bits. The limit may be increased in the future.</p>
     *
     * <p>This function may be called from any thread. Reading and writing of the internal timer offset is not atomic, so it needs to be externally synchronized
     * with calls to {@link #glfwGetTime GetTime}.</p>
     *
     * @param time the new value, in seconds
     *
     * @since version 2.2
     */
    void glfwSetTime(double time);

}
