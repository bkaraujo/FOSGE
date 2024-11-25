package br.fosge.runtime.platform.binding.glfw.api;

import br.fosge.runtime.platform.binding.glfw.GLFWConstants;
import org.lwjgl.glfw.GLFWAllocateCallback;
import org.lwjgl.glfw.GLFWAllocator;
import org.lwjgl.glfw.GLFWDeallocateCallback;
import org.lwjgl.glfw.GLFWReallocateCallback;

public interface GLFW34 extends GLFW33 {

    /**
     * Sets the init allocator to the desired value.
     *
     * <p>To use the default allocator, call this function with a {@code NULL} argument.</p>
     *
     * <p>If you specify an allocator struct, every member must be a valid function pointer. If any member is {@code NULL}, this function will emit {@link GLFWConstants#GLFW_INVALID_VALUE INVALID_VALUE} and
     * the init allocator will be unchanged.</p>
     *
     * <p>The functions in the allocator must fulfil a number of requirements. See the documentation for {@link GLFWAllocateCallback}, {@link GLFWReallocateCallback} and
     * {@link GLFWDeallocateCallback} for details.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>Possible errors include {@link GLFWConstants#GLFW_INVALID_VALUE INVALID_VALUE}.</li>
     * <li>The specified allocator is copied before this function returns.</li>
     * <li>This function must only be called from the main thread.</li>
     * </ul></div>
     *
     * @param allocator the allocator to use at the next initialization, or {@code NULL} to use the default one
     *
     * @since version 3.4
     */
    void glfwInitAllocator(GLFWAllocator allocator);

    /**
     * Returns the currently selected platform.
     *
     * <p>This function returns the platform that was selected during initialization. The returned value will be one of {@link GLFWConstants#GLFW_PLATFORM_WIN32 PLATFORM_WIN32}, {@link GLFWConstants#GLFW_PLATFORM_COCOA PLATFORM_COCOA},
     * {@link GLFWConstants#GLFW_PLATFORM_WAYLAND PLATFORM_WAYLAND}, {@link GLFWConstants#GLFW_PLATFORM_X11 PLATFORM_X11} or {@link GLFWConstants#GLFW_PLATFORM_NULL PLATFORM_NULL}.</p>
     *
     * <p>This function may be called from any thread.</p>
     *
     * @return the currently selected platform, or zero if an error occurred.
     *
     *         <p>Possible errors include {@link GLFWConstants#GLFW_NOT_INITIALIZED NOT_INITIALIZED}.</p>
     *
     * @since version 3.4
     */
    int glfwGetPlatform();

    /**
     * Returns whether the library includes support for the specified platform.
     *
     * <p>This function returns whether the library was compiled with support for the specified platform.</p>
     *
     * <p>This function may be called before {@link #glfwInit Init}.</p>
     *
     * <p>This function may be called from any thread.</p>
     *
     * @param platform the platform to query. One of:<br><table><tr><td>{@link GLFWConstants#GLFW_PLATFORM_WIN32 PLATFORM_WIN32}</td><td>{@link GLFWConstants#GLFW_PLATFORM_COCOA PLATFORM_COCOA}</td><td>{@link GLFWConstants#GLFW_PLATFORM_WAYLAND PLATFORM_WAYLAND}</td><td>{@link GLFWConstants#GLFW_PLATFORM_X11 PLATFORM_X11}</td><td>{@link GLFWConstants#GLFW_PLATFORM_NULL PLATFORM_NULL}</td></tr></table>
     *
     * @return {@link GLFWConstants#GLFW_TRUE TRUE} if the platform is supported, or {@link GLFWConstants#GLFW_FALSE FALSE} otherwise.
     *
     *         <p>Possible errors include {@link GLFWConstants#GLFW_INVALID_ENUM INVALID_ENUM}.</p>
     *
     * @since version 3.4
     */
    boolean glfwPlatformSupported(int platform);

    /**
     * Returns the title of the specified window.
     *
     * <p>This function returns the window title, encoded as UTF-8, of the specified window. This is the title set previously by {@link #glfwCreateWindow CreateWindow} or
     * {@link #glfwSetWindowTitle SetWindowTitle}.</p>
     *
     * <p>The returned title is currently a copy of the title last set by {@link #glfwCreateWindow CreateWindow} or {@link #glfwSetWindowTitle SetWindowTitle}. It does not include any additional text which may
     * be appended by the platform or another program.</p>
     *
     * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the next call to {@code glfwGetWindowTitle} or
     * {@link #glfwSetWindowTitle SetWindowTitle}, or until the library is terminated.</p>
     *
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window to query
     *
     * @return the UTF-8 encoded window title, or {@code NULL} if an error occurred
     *
     * @since version 3.4
     */
    String glfwGetWindowTitle(long window);

}
