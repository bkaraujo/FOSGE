package br.fosge;

import br.fosge.commons.Time;
import org.joml.Vector2i;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLDebugMessageCallback;
import org.lwjgl.system.MemoryStack;

import java.nio.ByteBuffer;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL46.*;
import static org.lwjgl.stb.STBImage.*;
import static org.lwjgl.system.MemoryStack.stackPush;
import static org.lwjgl.system.MemoryUtil.NULL;

public class OpenGLTests {

    private static void tryOrExit(boolean expression, String message) {
        if (expression) return;
        exit(message);
    }

    private static void exit(String message) {
        System.out.println(message);
        System.exit(99);
    }

    public static void main(String[] args) {
        long window;
        final var windowSize = new Vector2i(1280, 720);
        // ########################################################
        //
        //                      Initialize GLFW
        //
        // ########################################################
        {
            GLFWErrorCallback.createPrint(System.err).set();

            tryOrExit(glfwInit(), "Failed to initialize GLFW");

            glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
            glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);

            glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 4);
            glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 6);
            glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);
            glfwWindowHint(GLFW_CONTEXT_RELEASE_BEHAVIOR, GLFW_RELEASE_BEHAVIOR_FLUSH);

//            glfwWindowHint(GLFW_DEPTH_BITS, 0);
//            glfwWindowHint(GLFW_STENCIL_BITS, 0);
//            glfwWindowHint(GLFW_ALPHA_BITS, 0);

            window = glfwCreateWindow(windowSize.x(), windowSize.y(), "Hello World!", NULL, NULL);
            if (window == NULL) exit("Failed to create the GLFW window");

            glfwSetKeyCallback(window, (hwnd, key, scancode, action, mods) -> {
                if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE)
                    glfwSetWindowShouldClose(hwnd, true); // We will detect this in the rendering loop
            });

            try (final var stack = stackPush()) {
                final var pWidth = stack.ints(1);
                final var pHeight = stack.ints(1);

                glfwGetWindowSize(window, pWidth, pHeight);
                final var vidmode = glfwGetVideoMode(glfwGetPrimaryMonitor());
                if (vidmode != null) {
                    glfwSetWindowPos(window,
                            (vidmode.width() - pWidth.get(0)) / 2,
                            (vidmode.height() - pHeight.get(0)) / 2
                    );
                }
            }
        }
        // ########################################################
        //
        //                      Initialize OPENGL
        //
        // ########################################################
        {
            glfwMakeContextCurrent(window);
            GL.createCapabilities();

            glEnable(GL_TEXTURE_2D);

            glEnable(GL_BLEND);
            glBlendEquation(GL_FUNC_ADD);
            glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);

            glEnable(GL_DEPTH_TEST);
            glDepthFunc(GL_LEQUAL);

//            glPolygonMode(GL_FRONT_AND_BACK, false ? GL_LINE : GL_FILL);

            glEnable(GL_DEBUG_OUTPUT);
            glEnable(GL_DEBUG_OUTPUT_SYNCHRONOUS);

            final var debugCallback = GLDebugMessageCallback.create((source, type, id, severity, length, message, userParam) -> {
                // ignore non-significant error/warning codes
                if(id == 131169 || id == 131185 || id == 131218 || id == 131204) return;

                exit(
                        "\nID      : 0x%s\nSource  : %s\nType    : %s\nSeverity: %s\nMessage : %s%n".formatted(
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
                ));
            });

            glDebugMessageCallback(debugCallback, NULL);
        }
        // ########################################################
        //
        //                  Initialize SCENE
        //
        // ########################################################
        final var applicationShader = glCreateProgram();
        {
            final var vertex = glCreateShader(GL_VERTEX_SHADER);
            final var fragment = glCreateShader(GL_FRAGMENT_SHADER);
            try {
                glShaderSource(vertex, """
                    #version 330 core
                    
                    layout (location = 0) in vec3 in_position;
                    layout (location = 1) in vec2 in_uv;
                    
                    out vec2 vtx_uv;
                    
                    void main() {
                        gl_Position = vec4(in_position, 1.0);
                        vtx_uv = in_uv;
                    }""");
                glCompileShader(vertex);
                glAttachShader(applicationShader, vertex);
                tryOrExit (glGetShaderi(vertex, GL_COMPILE_STATUS) == GL_TRUE, glGetShaderInfoLog(vertex));

                glShaderSource(fragment, """
                    #version 330 core
                    out vec4 FragColor;

                    in vec2 vtx_uv;

                    uniform sampler2D   un_texture;
                
                    void main() {
                        FragColor = texture(un_texture, vtx_uv);
                    }""");
                glCompileShader(fragment);
                glAttachShader(applicationShader, fragment);
                tryOrExit (glGetShaderi(fragment, GL_COMPILE_STATUS) == GL_TRUE, glGetShaderInfoLog(fragment));

                glLinkProgram(applicationShader);
                tryOrExit (glGetProgrami(applicationShader, GL_LINK_STATUS) == GL_TRUE, glGetProgramInfoLog(applicationShader));
            } finally {
                glDeleteShader(vertex);
                glDeleteShader(fragment);
            }
        }

        final var applicationGeometry = glCreateVertexArrays();
        {
            glEnableVertexArrayAttrib(applicationGeometry, 0);

            glVertexArrayAttribFormat(applicationGeometry, 0, 3, GL_FLOAT, false, 0);
            glVertexArrayAttribBinding(applicationGeometry, 0, 0);

            glEnableVertexArrayAttrib(applicationGeometry, 1);
            glVertexArrayAttribFormat(applicationGeometry, 1, 2, GL_FLOAT, false, 3 * Float.BYTES);
            glVertexArrayAttribBinding(applicationGeometry, 1, 0);

            final var vbo = glCreateBuffers();
            glVertexArrayVertexBuffer(applicationGeometry, 0, vbo, 0, 5 * Float.BYTES);
            glNamedBufferData(vbo,
                    new float[] {
                            // in_position          in_uv
                             0.25f,  0.25f, 0.0f,     1.0f, 1.0f,
                             0.25f, -0.25f, 0.0f,     1.0f, 0.0f,
                            -0.25f, -0.25f, 0.0f,     0.0f, 0.0f,
                            -0.25f,  0.25f, 0.0f,     0.0f, 1.0f
                    },
                    GL_STATIC_DRAW
            );

            final var ebo = glCreateBuffers();
            glVertexArrayElementBuffer(applicationGeometry, ebo);
            glNamedBufferData(ebo, new int[]{0, 1, 3, 1, 2, 3}, GL_STATIC_DRAW);

        }

        final var applicationTexture = glCreateTextures(GL_TEXTURE_2D);
        {
            glTextureParameteri(applicationTexture, GL_TEXTURE_MIN_FILTER, GL_LINEAR_MIPMAP_LINEAR);
            glTextureParameteri(applicationTexture, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
            glTextureParameteri(applicationTexture, GL_TEXTURE_WRAP_S, GL_REPEAT);
            glTextureParameteri(applicationTexture, GL_TEXTURE_WRAP_T, GL_REPEAT);

            ByteBuffer pixels = null;
            try (final var stack = MemoryStack.stackPush()) {
                final var pWidth = stack.mallocInt(1);
                final var pHeight = stack.mallocInt(1);
                final var pChannel = stack.mallocInt(1);

                stbi_set_flip_vertically_on_load(false);
                final var path = "X:/java/FOSGE/fosge-engine/src/main/resources/container.jpg";
                pixels = stbi_load(path, pWidth, pHeight, pChannel, 0);
                tryOrExit(pixels != null, "Failed to load image");

                final var width = pWidth.get();
                final var height = pHeight.get();
                final var channels = pChannel.get();

                glTextureStorage2D(applicationTexture, 1, GL_RGBA8, width, height);
                glTextureSubImage2D(applicationTexture, 0, 0, 0, width, height, GL_RGB, GL_UNSIGNED_BYTE, pixels);
                glGenerateTextureMipmap(applicationTexture);
            } finally {
                if (pixels != null) {
                    stbi_image_free(pixels);
                }
            }
        }
        // ########################################################
        // Initialize TEST SCENARIO
        // ########################################################
        final var frameBuffer = glCreateFramebuffers();
        final var colorAttachment = glCreateTextures(GL_TEXTURE_2D);
        final var depthAttachment = glCreateTextures(GL_TEXTURE_2D);
        {
            {
                // ######################################################
                // Color Attachment
                // ######################################################
                glTextureParameteri(colorAttachment, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
                glTextureParameteri(colorAttachment, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
                glTextureParameteri(colorAttachment, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_EDGE);
                glTextureParameteri(colorAttachment, GL_TEXTURE_WRAP_T, GL_CLAMP_TO_EDGE);
                glTextureStorage2D(colorAttachment, 1, GL_RGB8, windowSize.x(), windowSize.y());
                glNamedFramebufferTexture(frameBuffer, GL_COLOR_ATTACHMENT0, colorAttachment, 0);
                // ######################################################
                // Depth Attachment
                // ######################################################
                glTextureStorage2D(depthAttachment, 1, GL_DEPTH24_STENCIL8, windowSize.x(), windowSize.y());
                glNamedFramebufferTexture(frameBuffer, GL_DEPTH_STENCIL_ATTACHMENT, depthAttachment, 0);
                // ######################################################
                // Sanity Checks
                // ######################################################
                tryOrExit(
                        glCheckNamedFramebufferStatus(frameBuffer, GL_FRAMEBUFFER) == GL_FRAMEBUFFER_COMPLETE,
                        "Failed to create Frame Buffer"
                );
            }
        }
        final var frameBufferShader = glCreateProgram();
        {
            final var vertex = glCreateShader(GL_VERTEX_SHADER);
            final var fragment = glCreateShader(GL_FRAGMENT_SHADER);
            try {
                glShaderSource(vertex, """
                        #version 330 core
                                            
                        layout (location = 0) in vec3 in_position;
                        layout (location = 1) in vec2 in_uv;
                                            
                        out vec2 vtx_uv;
                                            
                        void main() {
                            gl_Position = vec4(in_position, 1.0);
                            vtx_uv = in_uv;
                        }""");
                glCompileShader(vertex);
                glAttachShader(frameBufferShader, vertex);
                tryOrExit(glGetShaderi(vertex, GL_COMPILE_STATUS) == GL_TRUE, glGetShaderInfoLog(vertex));

                glShaderSource(fragment, """
                        #version 330 core
                        out vec4 FragColor;

                        in vec2 vtx_uv;

                        uniform sampler2D   un_texture;
                                        
                        void main() {
                            FragColor = texture(un_texture, vtx_uv);
                        }""");
                glCompileShader(fragment);
                glAttachShader(frameBufferShader, fragment);
                tryOrExit(glGetShaderi(fragment, GL_COMPILE_STATUS) == GL_TRUE, glGetShaderInfoLog(fragment));

                glLinkProgram(frameBufferShader);
                tryOrExit(glGetProgrami(frameBufferShader, GL_LINK_STATUS) == GL_TRUE, glGetProgramInfoLog(frameBufferShader));
            } finally {
                glDeleteShader(vertex);
                glDeleteShader(fragment);
            }
        }

        final var frameBufferGeometry = glCreateVertexArrays();
        {
            glEnableVertexArrayAttrib(frameBufferGeometry, 0);
            glVertexArrayAttribFormat(frameBufferGeometry, 0, 3, GL_FLOAT, false, 0);
            glVertexArrayAttribBinding(frameBufferGeometry, 0, 0);

            glEnableVertexArrayAttrib(frameBufferGeometry, 1);
            glVertexArrayAttribFormat(frameBufferGeometry, 1, 2, GL_FLOAT, false, 3 * Float.BYTES);
            glVertexArrayAttribBinding(frameBufferGeometry, 1, 0);

            final var vbo = glCreateBuffers();
            glVertexArrayVertexBuffer(frameBufferGeometry, 0, vbo, 0, 5 * Float.BYTES);
            glNamedBufferData(vbo,
                    new float[]{
                            // in_position          in_uv
                             0.5f, 0.5f, 0.0f, 1.0f, 1.0f,
                             0.5f, -0.5f, 0.0f, 1.0f, 0.0f,
                            -0.5f, -0.5f, 0.0f, 0.0f, 0.0f,
                            -0.5f, 0.5f, 0.0f, 0.0f, 1.0f
                    },
                    GL_STATIC_DRAW
            );

            final var ebo = glCreateBuffers();
            glVertexArrayElementBuffer(frameBufferGeometry, ebo);
            glNamedBufferData(ebo, new int[]{0, 1, 3, 1, 2, 3}, GL_STATIC_DRAW);
        }
        // ########################################################
        //
        //                  Application Loop
        //
        // ########################################################
        glfwShowWindow(window);
        glfwSwapInterval(1);


        long fps = 0;
        long timer = Time.millis();
        while ( !glfwWindowShouldClose(window) ) {
            fps++;
            // ###################################################################################
            // On Application Frame Buffer
            // ###################################################################################
            glBindFramebuffer(GL_FRAMEBUFFER, frameBuffer);
            glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT | GL_STENCIL_BUFFER_BIT);
            glEnable(GL_DEPTH_TEST);

            glUseProgram(applicationShader);
            glBindVertexArray(applicationGeometry);
            glBindTextureUnit(0, applicationTexture);
            glDrawElements(GL_TRIANGLES, 6, GL_UNSIGNED_INT, 0);
            // ###################################################################################
            // On Default Frame Buffer
            // ###################################################################################
            glBlitNamedFramebuffer(frameBuffer, 0,
                    0, 0, windowSize.x(),windowSize.y(),
                    0, 0, windowSize.x(),windowSize.y(),
                    GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT,
                    GL_NEAREST
            );
//            glBindFramebuffer(GL_FRAMEBUFFER, 0);
//            glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
//            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT | GL_STENCIL_BUFFER_BIT);
//            glDisable(GL_DEPTH_TEST);
//
//            glUseProgram(frameBufferShader);
//            glBindVertexArray(frameBufferGeometry);
//            glBindTextureUnit(0, colorAttachment);
//            glDrawElements(GL_TRIANGLES, 6, GL_UNSIGNED_INT, 0);
            // ###################################################################################
            // Present the Default Frame Buffer
            // ###################################################################################

            glfwSwapBuffers(window);

            long elapsed = Time.millis() - timer;
            if (elapsed > 1_000) {
                timer += elapsed;
                System.out.printf("FPS: %d%n".formatted(fps));
                fps = 0;
            }

            glfwPollEvents();
        }
    }
}
