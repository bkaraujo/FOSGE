package br.fosge.runtime.platform.binding.glfw.api;

import org.lwjgl.glfw.GLFWScrollCallback;
import org.lwjgl.glfw.GLFWScrollCallbackI;

public interface GLFW21 extends GLFW20 {

    /**
     * Iconifies (minimizes) the specified window if it was previously restored. If the window is already iconified, this function does nothing.
     *
     * <p>If the specified window is a full screen window, GLFW restores the original video mode of the monitor. The window's desired video mode is set again
     * when the window is restored.</p>
     *
     * <p>Notes:</p>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: Once a window is iconified, {@link #glfwRestoreWindow RestoreWindow} won’t be able to restore it. This is a design decision of the {@code xdg-shell}.</li>
     * </ul>
     *
     * @param window the window to iconify
     *
     * @since version 2.1
     */
    void glfwIconifyWindow(long window);

    /**
     * Restores the specified window if it was previously iconified (minimized) or maximized. If the window is already restored, this function does nothing.
     *
     * <p>If the specified window is an iconified full screen window, its desired video mode is set again for its monitor when the window is restored.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window to restore
     *
     * @since version 2.1
     */
    void glfwRestoreWindow(long window);

    /**
     * Sets the scroll callback of the specified window, which is called when a scrolling device is used.
     *
     * <p>The scroll callback receives all scrolling input, like that from a mouse wheel or a touchpad scrolling area.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set
     *
     * @since version 2.1
     */
    GLFWScrollCallback glfwSetScrollCallback(long window, GLFWScrollCallbackI cbfun);
    
}
