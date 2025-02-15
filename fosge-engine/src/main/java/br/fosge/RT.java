package br.fosge;

import br.fosge.commons.annotation.State;
import br.fosge.commons.serializer.Yaml;
import br.fosge.engine.audio.AudioObject;
import br.fosge.engine.ecs.Component;
import br.fosge.engine.ecs.ComponentFactory;
import br.fosge.engine.ecs.System;
import br.fosge.engine.input.Keyboard;
import br.fosge.engine.input.Mouse;
import br.fosge.engine.renderer.backend.GraphicsObject;
import br.fosge.runtime.ecs.ComponentFactoryImpl;
import br.fosge.runtime.platform.*;
import br.fosge.runtime.scene.Scene;
import com.github.f4b6a3.ulid.Ulid;
import org.joml.Vector2i;

import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/** Global Shared State */
public abstract class RT implements State {

    private RT() {}

    public static int simulationPerSecond;

    public static int frame;
    public static int framePerSecond;
    public static boolean running;
    public static boolean suspended;
    public static boolean threadMain;
    public static Yaml yaml;

    public static abstract class Factory {

        public static final ComponentFactory component = new ComponentFactoryImpl();

    }

    public static abstract class Application {
        private Application(){}

        public static Scene scene;

        public static final Queue<System> systems = new ConcurrentLinkedQueue<>();
        public static final Queue<Ulid> entities = new ConcurrentLinkedQueue<>();
        public static final Map<Ulid, Queue<Component>> ofEntities = new ConcurrentHashMap<>();
        public static final Map<Class<?>, Queue<Component>> ofComponents = new ConcurrentHashMap<>();
    }

    public static abstract class Window {
        private Window() {}

        public static long handle;
        public static boolean visible;
        public static boolean focused;
        public static boolean maximized;
        public static boolean minimized;
        public static float aspectRatio;
        public static final Vector2i size = new Vector2i();
        public static final Vector2i position = new Vector2i();
    }

    public static abstract class Renderer {

        private Renderer() {}
    }

    public static abstract class Graphics {
        private Graphics() {}

        public static boolean vsync;
        public static boolean wireframe;

        public static int boundTexture;
        public static int boundTextureUnit;
        public static final int textureUnitLimit = 16;

        public static int buffers;
        public static int vertexArrays;
        public static int boundVertexArray;

        public static int shaderStages;
        public static int shaderPrograms;
        public static int boundShaderProgram;

        public static final Queue<GraphicsObject> shaders = new ConcurrentLinkedQueue<>();
        public static final Queue<GraphicsObject> textures = new ConcurrentLinkedQueue<>();
        public static final Queue<GraphicsObject> geometries = new ConcurrentLinkedQueue<>();
    }

    public static abstract class Audio {

        private Audio() {}

        public static int monoSourceLimit;

        public static final Queue<AudioObject> buffers = new ConcurrentLinkedQueue<>();
        public static final Queue<AudioObject> monoSources = new ConcurrentLinkedQueue<>();
    }

    public static abstract class Input {

        private Input() {}

        public static final boolean[] currKey = new boolean[Keyboard.values().length];
        public static final boolean[] prevKey = new boolean[Keyboard.values().length];

        public static byte currMouseScroll;
        public static final Vector2i currMousePos = new Vector2i();
        public static final boolean[] currMouse = new boolean[Mouse.values().length];
        public static final boolean[] prevMouse = new boolean[Mouse.values().length];
    }

    public static abstract class Memory {
        private Memory() {}

        public static int offHeap;

        public static final Queue<ByteBuffer> buffers = new ConcurrentLinkedQueue<>();
    }

    public static abstract class Platform {
        private Platform(){}

        public static final PlatformWindow window = new PlatformWindow();
        public static final PlatformGraphics graphics = new PlatformGraphics();
        public static final PlatformAudio audio = new PlatformAudio();
        public static final PlatformInput input = new PlatformInput();
        public static final PlatformFilesystem filesystem = new PlatformFilesystem();
    }
}
