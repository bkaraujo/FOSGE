package br.fosge.engine.runtime.platform;

import br.fosge.Version;
import br.fosge.engine.annotation.State;
import org.joml.Vector2i;

public abstract class PlatformState implements State {
    public static Version glfwVersion;

    public static long window;
    public static final Vector2i windowSize = new Vector2i();
    public static final Vector2i windowPosition = new Vector2i();
    public static boolean windowVisible;
    public static boolean windowFocused;
    public static boolean windowMaximized;
    public static boolean windowMinimized;

    public static float windowAspectRatio;

    public static int graphicsShader;
    public static int graphicsVAO;
    public static int graphicsTexture;
    public static int graphicsTextureUnit;

}
