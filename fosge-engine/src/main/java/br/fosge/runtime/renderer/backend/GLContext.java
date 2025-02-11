package br.fosge.runtime.renderer.backend;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.commons.MessageBus;
import br.fosge.engine.renderer.backend.*;
import br.fosge.runtime.renderer.backend.opengl.GLFrameBuffer;
import br.fosge.runtime.renderer.backend.opengl.GLGeometry;
import br.fosge.runtime.renderer.backend.opengl.GLShader;
import br.fosge.runtime.renderer.backend.opengl.GLTexture2D;
import org.lwjgl.opengl.GLDebugMessageCallback;

import static br.fosge.runtime.platform.Bindings.glfw;
import static br.fosge.runtime.platform.Bindings.opengl;
import static br.fosge.runtime.platform.binding.opengl.api.GL11.*;
import static br.fosge.runtime.platform.binding.opengl.api.GL43.*;
import static org.lwjgl.system.MemoryUtil.NULL;

public final class GLContext implements RenderContext {

    private GLDebugMessageCallback debugCallback;

    @Override
    public boolean initialize() {

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

    @Override
    public FrameBuffer frameBuffer() {
        final var framebuffer = new GLFrameBuffer();
        if (!framebuffer.initialize()) {
            Logger.fatal("Failed to initialize FrameBuffer");
            return null;
        }
        return framebuffer;
    }

    @Override
    public Shader shader() {
        final var shader = new GLShader();
        if (!shader.initialize()) {
            Logger.fatal("Failed to initialize Shader");
            return null;
        }

        return shader;
    }

    @Override
    public Geometry geometry() {
        final var geometry = new GLGeometry();
        if (!geometry.initialize()) {
            Logger.fatal("Failed to initialize Geometry");
            return null;
        }

        return geometry;
    }

    @Override
    public Texture2D texture2d() {
        final var texture = new GLTexture2D();
        if (!texture.initialize()) {
            Logger.fatal("Failed to initialize Texture2D");
            return null;
        }

        return texture;
    }

    @Override
    public boolean terminate() {
        if (debugCallback != null) {
            debugCallback.free();
        }

        return true;
    }
}
