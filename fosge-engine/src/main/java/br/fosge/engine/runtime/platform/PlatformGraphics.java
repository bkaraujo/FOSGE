package br.fosge.engine.runtime.platform;

import br.fosge.Logger;
import br.fosge.annotation.Lifecycle;
import br.fosge.MessageBus;
import br.fosge.engine.graphics.Geometry;
import br.fosge.engine.graphics.Shader;
import br.fosge.engine.graphics.Texture;
import br.fosge.engine.graphics.Texture2D;
import br.fosge.engine.platform.window.WindowResizedEvent;
import br.fosge.engine.runtime.Configuration;
import br.fosge.engine.runtime.application.ApplicationYaml;
import br.fosge.engine.runtime.platform.binding.opengl.objects.GLGeometry;
import br.fosge.engine.runtime.platform.binding.opengl.objects.GLParser;
import br.fosge.engine.runtime.platform.binding.opengl.objects.GLShader;
import br.fosge.engine.runtime.platform.binding.opengl.objects.GLTexture2D;
import br.fosge.message.MessageListener;
import br.fosge.message.MessagePipeline;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.GLDebugMessageCallback;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static br.fosge.engine.runtime.platform.Bindings.glfw;
import static br.fosge.engine.runtime.platform.Bindings.opengl;
import static br.fosge.engine.runtime.platform.binding.OpenGL.*;
import static org.lwjgl.system.MemoryUtil.NULL;

public final class PlatformGraphics implements Lifecycle {

    private GLCapabilities capabilities;
    private GLDebugMessageCallback debugCallback;

    private final List<Texture2D> tex2Ds = new ArrayList<>();

    @Override
    public boolean initialize() {
        glfw.glfwMakeContextCurrent(PlatformState.window);
        capabilities = GL.createCapabilities();

        Logger.debug("OpenGL: %s", opengl.glGetString(GL_VERSION));

        if (Configuration.CHECKS) {
            opengl.glEnable(GL_DEBUG_OUTPUT);
            opengl.glEnable(GL_DEBUG_OUTPUT_SYNCHRONOUS);

            debugCallback = GLDebugMessageCallback.create((source, type, id, severity, length, message, _) -> {
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

        final var spec = ApplicationYaml.get().application().graphics();
        Logger.trace("VSYNC: %s", spec.vsync());
        glfw.glfwSwapInterval(spec.vsync() ? 1 : 0);

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
        tex2Ds.remove(texture);
        if (!texture.terminate()) {
            Logger.error("Failed to terminate texture");
        }
    }

    public Texture2D texture2d(Path absolute, int mips) {
        for (final var texture : tex2Ds) {
            if (texture.path().equals(absolute)) {
                return texture;
            }
        }

        final var texture = new GLTexture2D();
        if (!texture.initialize()) {
            Logger.error("Failed to initialize texture");
            return null;
        }

        if (!texture.load(absolute, mips)) {
            Logger.error("Failed to load texture");
            texture.terminate();
            return null;
        }

        tex2Ds.add(texture);
        return texture;
    }

    public void clear() {
        opengl.glClear(GL_DEPTH_BUFFER_BIT | GL_COLOR_BUFFER_BIT | GL_STENCIL_BUFFER_BIT);
    }

    public void clearColor(float red, float green, float blue, float alpha) {
        opengl.glClearColor(red, green, blue, alpha);
    }

    public void draw(Shader shader, Geometry geometry) {
        opengl.glDrawElements(
                GLParser.parse(geometry.mode()),
                geometry.elements(),
                GLParser.parse(geometry.indexType()),
                0
        );
    }

    public void update() {
        glfw.glfwSwapBuffers(PlatformState.window);
    }

    @Override
    public boolean terminate() {
        for (final var texture : tex2Ds) {
            Logger.warn("Deleting dangling texture: %s", texture.path());
            texture.terminate();
        }

        if (debugCallback != null) {
            debugCallback.free();
        }

        if (capabilities != null) {
            GL.destroy();
        }

        return true;
    }
}
