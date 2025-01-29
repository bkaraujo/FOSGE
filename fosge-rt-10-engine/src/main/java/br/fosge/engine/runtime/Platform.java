package br.fosge.engine.runtime;

import br.fosge.commons.Logger;
import br.fosge.commons.annotation.Facade;
import br.fosge.engine.runtime.platform.*;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.system.APIUtil;

import java.util.Map;

import static br.fosge.engine.runtime.platform.Bindings.glfw;

public abstract class Platform implements Facade {
    private Platform(){}

    private static GLFWErrorCallback glfwErrorCallback;

    public static final PlatformWindow window = new PlatformWindow();
    public static final PlatformGraphics graphics = new PlatformGraphics();
    public static final PlatformAudio audio = new PlatformAudio();
    public static final PlatformInput input = new PlatformInput();
    public static final PlatformFilesystem filesystem = new PlatformFilesystem();

    public static boolean initialize() {

        // Incorporated from the GLFW private code
        // so the log message goes to the engine pipeline
        glfwErrorCallback = GLFWErrorCallback.create(new GLFWErrorCallback() {
            private final Map<Integer, String> ERROR_CODES = APIUtil.apiClassTokens((ignored, value) -> 0x10000 < value && value < 0x20000, null, GLFW.class);

            @Override
            public void invoke(int error, long description) {
                Logger.error("[LWJGL] %s error: %s", ERROR_CODES.get(error), getDescription(description));
            }
        });

        glfwErrorCallback.set();

        if (!glfw.glfwInit()) {
            Logger.error("GLFW failed to initialize");
            return false;
        }

        if (!window.initialize()) { return false; }
        if (!graphics.initialize()) { return false; }
        if (!audio.initialize()) { return false; }
        if (!input.initialize()) { return false; }

        Logger.info("Platform initialized");
        return true;
    }

    public static boolean terminate() {
        if (!window.terminate()) { return false; }
        if (!graphics.terminate()) { return false; }
        if (!audio.terminate()) { return false; }
        if (!input.terminate()) { return false; }

        glfw.glfwTerminate();
        if (glfwErrorCallback != null) {
            glfwErrorCallback.free();
        }

        return true;
    }
}
