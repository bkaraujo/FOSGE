package br.fosge.runtime.platform.binding.glfw.api;

import br.fosge.runtime.platform.binding.GLFW;
import org.lwjgl.glfw.GLFWWindowCloseCallback;
import org.lwjgl.glfw.GLFWWindowCloseCallbackI;
import org.lwjgl.glfw.GLFWWindowRefreshCallback;
import org.lwjgl.glfw.GLFWWindowRefreshCallbackI;

public interface GLFW25 extends GLFW24 {
    
    /**
     * Sets the close callback of the specified window, which is called when the user attempts to close the window, for example by clicking the close widget in
     * the title bar.
     *
     * <p>The close flag is set before this callback is called, but you can modify it at any time with {@link GLFW#glfwSetWindowShouldClose SetWindowShouldClose}.</p>
     *
     * <p>The close callback is not triggered by {@link #glfwDestroyWindow DestroyWindow}.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>macOS:</b> Selecting Quit from the application menu will trigger the close callback for all windows.</li>
     * </ul></div>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
     *         <a href="https://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
     *
     * @since version 2.5
     */
    GLFWWindowCloseCallback glfwSetWindowCloseCallback(long window, GLFWWindowCloseCallbackI cbfun);

    /**
     * Sets the refresh callback of the specified window, which is called when the content area of the window needs to be redrawn, for example if the window has
     * been exposed after having been covered by another window.
     *
     * <p>On compositing window systems such as Aero, Compiz or Aqua, where the window contents are saved off-screen, this callback may be called only very
     * infrequently or never at all.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
     *         <a href="https://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
     *
     * @since version 2.5
     */
    GLFWWindowRefreshCallback glfwSetWindowRefreshCallback(long window, GLFWWindowRefreshCallbackI cbfun);

    /**
     * Waits until events are queued and processes them.
     *
     * <p>This function puts the calling thread to sleep until at least one event is available in the event queue. Once one or more events are available, it
     * behaves exactly like {@link #glfwPollEvents PollEvents}, i.e. the events in the queue are processed and the function then returns immediately. Processing events will cause
     * the window and input callbacks associated with those events to be called.</p>
     *
     * <p>Since not all events are associated with callbacks, this function may return without a callback having been called even if you are monitoring all
     * callbacks.</p>
     *
     * <p>On some platforms, a window move, resize or menu operation will cause event processing to block. This is due to how event processing is designed on
     * those platforms. You can use the <a href="https://www.glfw.org/docs/latest/window.html#window_refresh">window refresh callback</a> to redraw the
     * contents of your window when necessary during such operations.</p>
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
     * @since version 2.5
     */
    void glfwWaitEvents();

}
