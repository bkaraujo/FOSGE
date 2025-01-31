package br.fosge.engine.runtime.platform.binding.glfw.api;

import br.fosge.engine.runtime.platform.binding.glfw.GLFWConstants;
import org.lwjgl.glfw.*;

import java.nio.IntBuffer;

public interface GLFW31 extends GLFW30 {

    /**
     * Retrieves the size, in screen coordinates, of each edge of the frame of the specified window. This size includes the title bar, if the window has one.
     * The size of the frame may vary depending on the <a href="https://www.glfw.org/docs/latest/window.html#window-hints_wnd">window-related hints</a> used to
     * create it.
     *
     * <p>Because this function retrieves the size of each window frame edge and not the offset along a particular coordinate axis, the retrieved values will
     * always be zero or positive.</p>
     *
     * <p>Any or all of the size arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} size arguments will be set to zero.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose frame size to query
     * @param left   where to store the size, in screen coordinates, of the left edge of the window frame, or {@code NULL}
     * @param top    where to store the size, in screen coordinates, of the top edge of the window frame, or {@code NULL}
     * @param right  where to store the size, in screen coordinates, of the right edge of the window frame, or {@code NULL}
     * @param bottom where to store the size, in screen coordinates, of the bottom edge of the window frame, or {@code NULL}
     *
     * @since version 3.1
     */
    void glfwGetWindowFrameSize(long window, IntBuffer left, IntBuffer top, IntBuffer right, IntBuffer bottom);
    
    /**
     * Posts an empty event from the current thread to the main thread event queue, causing {@link #glfwWaitEvents WaitEvents} or {@link GLFW#glfwWaitEventsTimeout WaitEventsTimeout} to return.
     *
     * <p>This function may be called from any thread.</p>
     *
     * @since version 3.1
     */
    void glfwPostEmptyEvent();
    
    /**
     * Creates a new custom cursor image that can be set for a window with {@link #glfwSetCursor SetCursor}. The cursor can be destroyed with {@link #glfwDestroyCursor DestroyCursor}. Any remaining
     * cursors are destroyed by {@link #glfwTerminate Terminate}.
     *
     * <p>The pixels are 32-bit, little-endian, non-premultiplied RGBA, i.e. eight bits per channel with the red channel first. They are arranged canonically as
     * packed sequential rows, starting from the top-left corner.</p>
     *
     * <p>The cursor hotspot is specified in pixels, relative to the upper-left corner of the cursor image. Like all other coordinate systems in GLFW, the X-axis
     * points to the right and the Y-axis points down.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li>The specified image data is copied before this function returns.</li>
     * </ul></div>
     *
     * @param image the desired cursor image
     * @param xhot  the desired x-coordinate, in pixels, of the cursor hotspot
     * @param yhot  the desired y-coordinate, in pixels, of the cursor hotspot
     *
     * @return the handle of the created cursor, or {@code NULL} if an error occurred
     *
     * @since version 3.1
     */
    long glfwCreateCursor(GLFWImage image, int xhot, int yhot);
    
    /**
     * Returns a cursor with a standard shape, that can be set for a window with {@link #glfwSetCursor SetCursor}.
     *
     * <p>The images for these cursors come from the system cursor theme and their exact appearance will vary between platforms.</p>
     *
     * <p>Most of these shapes are guaranteed to exist on every supported platform but a few may not be present. See the table below for details.</p>
     *
     * <table class=striped>
     * <tr><th>Cursor shape</th><th>Windows</th><th>macOS</th><th>X11</th><th>Wayland</th></tr>
     * <tr><td>{@link GLFWConstants#GLFW_ARROW_CURSOR ARROW_CURSOR}</td><td>Yes</td><td>Yes</td><td>Yes</td><td>Yes</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_IBEAM_CURSOR IBEAM_CURSOR}</td><td>Yes</td><td>Yes</td><td>Yes</td><td>Yes</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_CROSSHAIR_CURSOR CROSSHAIR_CURSOR}</td><td>Yes</td><td>Yes</td><td>Yes</td><td>Yes</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_POINTING_HAND_CURSOR POINTING_HAND_CURSOR}</td><td>Yes</td><td>Yes</td><td>Yes</td><td>Yes</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_RESIZE_EW_CURSOR RESIZE_EW_CURSOR}</td><td>Yes</td><td>Yes</td><td>Yes</td><td>Yes</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_RESIZE_NS_CURSOR RESIZE_NS_CURSOR}</td><td>Yes</td><td>Yes</td><td>Yes</td><td>Yes</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_RESIZE_NWSE_CURSOR RESIZE_NWSE_CURSOR}</td><td>Yes</td><td>Yes<sup>1</sup></td><td>Maybe<sup>2</sup></td><td>Maybe<sup>2</sup></td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_RESIZE_NESW_CURSOR RESIZE_NESW_CURSOR}</td><td>Yes</td><td>Yes<sup>1</sup></td><td>Maybe<sup>2</sup></td><td>Maybe<sup>2</sup></td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_RESIZE_ALL_CURSOR RESIZE_ALL_CURSOR}</td><td>Yes</td><td>Yes</td><td>Yes</td><td>Yes</td></tr>
     * <tr><td>{@link GLFWConstants#GLFW_NOT_ALLOWED_CURSOR NOT_ALLOWED_CURSOR}</td><td>Yes</td><td>Yes</td><td>Maybe<sup>2</sup></td><td>Maybe<sup>2</sup></td></tr>
     * </table>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ol>
     * <li>This uses a private system API and may fail in the future.</li>
     * <li>This uses a newer standard that not all cursor themes support.</li>
     * </ol></div>
     *
     * <p>If the requested shape is not available, this function emits a {@link GLFWConstants#GLFW_CURSOR_UNAVAILABLE CURSOR_UNAVAILABLE} error and returns {@code NULL}.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param shape one of the standard shapes. One of:<br><table><tr><td>{@link GLFWConstants#GLFW_ARROW_CURSOR ARROW_CURSOR}</td><td>{@link GLFWConstants#GLFW_IBEAM_CURSOR IBEAM_CURSOR}</td><td>{@link GLFWConstants#GLFW_CROSSHAIR_CURSOR CROSSHAIR_CURSOR}</td><td>{@link GLFWConstants#GLFW_POINTING_HAND_CURSOR POINTING_HAND_CURSOR}</td><td>{@link GLFWConstants#GLFW_RESIZE_EW_CURSOR RESIZE_EW_CURSOR}</td></tr><tr><td>{@link GLFWConstants#GLFW_RESIZE_NS_CURSOR RESIZE_NS_CURSOR}</td><td>{@link GLFWConstants#GLFW_RESIZE_NWSE_CURSOR RESIZE_NWSE_CURSOR}</td><td>{@link GLFWConstants#GLFW_RESIZE_NESW_CURSOR RESIZE_NESW_CURSOR}</td><td>{@link GLFWConstants#GLFW_RESIZE_ALL_CURSOR RESIZE_ALL_CURSOR}</td><td>{@link GLFWConstants#GLFW_NOT_ALLOWED_CURSOR NOT_ALLOWED_CURSOR}</td></tr></table>
     *
     * @return a new cursor ready to use or {@code NULL} if an error occurred. Possible errors include {@link GLFWConstants#GLFW_NOT_INITIALIZED NOT_INITIALIZED}, {@link GLFWConstants#GLFW_INVALID_ENUM INVALID_ENUM}, {@link GLFWConstants#GLFW_CURSOR_UNAVAILABLE CURSOR_UNAVAILABLE} and
     *         {@link GLFWConstants#GLFW_PLATFORM_ERROR PLATFORM_ERROR}.
     *
     * @since version 3.1
     */
    long glfwCreateStandardCursor(int shape);
    
    /**
     * Destroys a cursor previously created with {@link #glfwCreateCursor CreateCursor}. Any remaining cursors will be destroyed by {@link #glfwTerminate Terminate}.
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li>This function must not be called from a callback.</li>
     * </ul></div>
     *
     * @param cursor the cursor object to destroy
     *
     * @since version 3.1
     */
    void glfwDestroyCursor(long cursor);
    
    /**
     * Sets the cursor image to be used when the cursor is over the content area of the specified window. The set cursor will only be visible when the
     * <a href="https://www.glfw.org/docs/latest/input.html#cursor_mode">cursor mode</a> of the window is {@link GLFWConstants#GLFW_CURSOR_NORMAL CURSOR_NORMAL}.
     *
     * <p>On some platforms, the set cursor may not be visible unless the window also has input focus.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window to set the system cursor for
     * @param cursor the cursor to set, or {@code NULL} to switch back to the default arrow cursor
     *
     * @since version 3.1
     */
    void glfwSetCursor(long window, long cursor);
    
    /**
     * Sets the character with modifiers callback of the specified window, which is called when a Unicode character is input regardless of what modifier keys
     * are used.
     *
     * <p>The character with modifiers callback is intended for implementing custom Unicode character input. For regular Unicode text input, see
     * {@link #glfwSetCharCallback SetCharCallback}. Like the character callback, the character with modifiers callback deals with characters and is keyboard layout dependent.
     * Characters do not map 1:1 to physical keys, as a key may produce zero, one or more characters. If you want to know whether a specific physical key was
     * pressed or released, see {@link #glfwSetKeyCallback SetKeyCallback} instead.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * <p>Deprecated: scheduled for removal in version 4.0.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set
     *
     * @since version 3.1
     */
    GLFWCharModsCallback glfwSetCharModsCallback(long window, GLFWCharModsCallbackI cbfun);
    
    /**
     * Sets the file drop callback of the specified window, which is called when one or more dragged files are dropped on the window.
     *
     * <p>Because the path array and its strings may have been generated specifically for that event, they are not guaranteed to be valid after the callback has
     * returned. If you wish to use them after the callback returns, you need to make a deep copy.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set
     *
     * @since version 3.1
     */
    GLFWDropCallback glfwSetDropCallback(long window, GLFWDropCallbackI cbfun);
}
