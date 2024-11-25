package br.fosge.runtime.platform.binding.glfw.api;

import org.lwjgl.glfw.GLFWCharCallback;
import org.lwjgl.glfw.GLFWCharCallbackI;

public interface GLFW24 extends GLFW23 {

    /**
     * Sets the character callback of the specified window, which is called when a Unicode character is input.
     *
     * <p>The character callback is intended for Unicode text input. As it deals with characters, it is keyboard layout dependent, whereas {@link #glfwSetKeyCallback SetKeyCallback} is
     * not. Characters do not map 1:1 to physical keys, as a key may produce zero, one or more characters. If you want to know whether a specific physical key
     * was pressed or released, see the key callback instead.</p>
     *
     * <p>The character callback behaves as system text input normally does and will not be called if modifier keys are held down that would prevent normal text
     * input on that platform, for example a Super (Command) key on macOS or Alt key on Windows.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set
     *
     * @since version 2.4
     */
    GLFWCharCallback glfwSetCharCallback(long window, GLFWCharCallbackI cbfun);

}
