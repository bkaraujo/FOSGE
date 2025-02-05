package br.fosge.runtime.platform;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.commons.MessageBus;
import br.fosge.commons.annotation.Lifecycle;
import br.fosge.commons.message.MessageListener;
import br.fosge.commons.message.MessagePipeline;
import br.fosge.engine.graphics.Geometry;
import br.fosge.engine.graphics.Shader;
import br.fosge.engine.graphics.Texture;
import br.fosge.engine.graphics.Texture2D;
import br.fosge.engine.graphics.texture.TextureSpec;
import br.fosge.engine.platform.window.WindowResizedEvent;
import br.fosge.runtime.platform.graphics.GLGeometry;
import br.fosge.runtime.platform.graphics.GLParser;
import br.fosge.runtime.platform.graphics.GLShader;
import br.fosge.runtime.platform.graphics.GLTexture2D;
import org.joml.Vector4fc;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.GLDebugMessageCallback;

import static br.fosge.runtime.platform.Bindings.glfw;
import static br.fosge.runtime.platform.Bindings.opengl;
import static br.fosge.runtime.platform.binding.OpenGL.*;
import static org.lwjgl.system.MemoryUtil.NULL;

public final class PlatformGraphics implements Lifecycle {

    private GLCapabilities capabilities;
    private GLDebugMessageCallback debugCallback;

    @Override
    public boolean initialize() {
        glfw.glfwMakeContextCurrent(RT.Window.handle);
        capabilities = GL.createCapabilities();

        Logger.debug("OpenGL: %s", opengl.glGetString(GL_VERSION));

        if (RT.debug) {
            opengl.glEnable(GL_DEBUG_OUTPUT);
            opengl.glEnable(GL_DEBUG_OUTPUT_SYNCHRONOUS);

            debugCallback = GLDebugMessageCallback.create((source, type, id, severity, length, message, ignored) -> {
                // ignore non-significant error/warning codes
                if(id == 131169 || id == 131185 || id == 131218 || id == 131204) return;

                Logger.debug(
                        "\nID      : 0x%s\nSource  : %s\nType    : %s\nSeverity: %s\nMessage : %s",
                        Integer.toHexString(id).toUpperCase(),
                        switch (source) {
                            default -> "???";
                            case GL_DEBUG_SOURCE_API -> "API";
                            case GL_DEBUG_SOURCE_OTHER -> "OTHER";
                            case GL_DEBUG_SOURCE_THIRD_PARTY -> "THIRD PARTY";
                            case GL_DEBUG_SOURCE_APPLICATION -> "APPLICATION";
                            case GL_DEBUG_SOURCE_SHADER_COMPILER -> "SHADER COMPILER";
                            case GL_DEBUG_SOURCE_WINDOW_SYSTEM -> "WINDOW SYSTEM";
                        },
                        switch (type) {
                            default -> "???";
                            case GL_DEBUG_TYPE_ERROR -> "ERROR";
                            case GL_DEBUG_TYPE_OTHER -> "OTHER";
                            case GL_DEBUG_TYPE_MARKER -> "MARKER";
                            case GL_DEBUG_TYPE_PORTABILITY -> "PORTABILITY";
                            case GL_DEBUG_TYPE_PERFORMANCE -> "PERFORMANCE";
                            case GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR -> "UNDEFINED BEHAVIOR";
                            case GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR -> "DEPRECATED BEHAVIOR";
                        },
                        switch (severity) {
                            default -> "???";
                            case GL_DEBUG_SEVERITY_LOW -> "LOW";
                            case GL_DEBUG_SEVERITY_HIGH -> "HIGH";
                            case GL_DEBUG_SEVERITY_MEDIUM -> "MEDIUM";
                            case GL_DEBUG_SEVERITY_NOTIFICATION -> "NOTIFICATION";
                        },
                        GLDebugMessageCallback.getMessage(length, message)
                );
            });

            opengl.glDebugMessageCallback(debugCallback, NULL);
        }

        MessageBus.subscribe(this);

        if (RT.yaml.contains("fosge.engine.graphics")) {
            final var yaml = RT.yaml.subtree("fosge.engine.graphics");

            RT.Graphics.vsync = yaml.contains("vsync") ? yaml.asBoolean("vsync") : false;
            Logger.debug("VSYNC: %s", RT.Graphics.vsync);

            RT.Graphics.wireframe = yaml.contains("wireframe") ? yaml.asBoolean("wireframe") : false;
            Logger.debug("WIREFRAME: %s", RT.Graphics.wireframe);
        }

        glfw.glfwSwapInterval(RT.Graphics.vsync ? 1 : 0);
        opengl.glPolygonMode(GL_FRONT_AND_BACK, RT.Graphics.wireframe ? GL_LINE : GL_FILL);

        return true;
    }

    @MessageListener
    public MessagePipeline handle(WindowResizedEvent event) {
        opengl.glViewport(0, 0, event.width, event.height);
        return MessagePipeline.CONSUMED;
    }

    public Shader shader() {
        return new GLShader();
    }

    public Geometry geometry() {
        return new GLGeometry();
    }

    public void textureDestroy(Texture texture) {
        if (!texture.terminate()) {
            Logger.error("Failed to terminate texture");
        }
    }

    public Texture2D texture2d(TextureSpec spec) {
        final var texture = new GLTexture2D();
        if (!texture.initialize()) {
            Logger.error("Failed to initialize texture");
            return null;
        }

        if (!texture.load(spec)) {
            Logger.error("Failed to load texture");
            texture.terminate();
            return null;
        }

        return texture;
    }

    public void clear() {
        opengl.glClear(GL_DEPTH_BUFFER_BIT | GL_COLOR_BUFFER_BIT | GL_STENCIL_BUFFER_BIT);
    }

    public void clearColor(Vector4fc color) {
        opengl.glClearColor(color.x(), color.y(), color.z(), color.w());
    }

    public void draw(Geometry geometry) {
        opengl.glDrawElements(
                GLParser.parse(geometry.mode()),
                geometry.elements(),
                GLParser.parse(geometry.indexType()),
                0
        );
    }

    public void update() {
        glfw.glfwSwapBuffers(RT.Window.handle);
    }

    @Override
    public boolean terminate() {
        if (debugCallback != null) {
            debugCallback.free();
        }

        if (capabilities != null) {
            GL.destroy();
        }

        return true;
    }
}
