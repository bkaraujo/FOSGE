package br.fosge.engine.runtime.platform.binding.opengl.objects;

import br.fosge.Configuration;
import br.fosge.commons.Logger;
import br.fosge.commons.annotation.Specification;
import br.fosge.commons.tools.Meta;
import br.fosge.engine.diagnostics.Diagnostics;
import br.fosge.engine.graphics.Shader;
import br.fosge.engine.graphics.shader.ShaderSpec;
import br.fosge.engine.runtime.platform.PlatformState;
import br.fosge.engine.runtime.platform.binding.opengl.api.GL11;
import org.joml.*;
import org.lwjgl.system.MemoryStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static br.fosge.engine.runtime.platform.Bindings.opengl;
import static br.fosge.engine.runtime.platform.binding.OpenGL.*;

public final class GLShader implements Shader {
    private int program = GL11.GL_NONE;
    private final Map<String, Integer> uniforms = new HashMap<>();

    @Override
    public int handle() {
        return program;
    }

    @Override
    public boolean initialize() {
        program = opengl.glCreateProgram();
        Diagnostics.graphicsShader++;
        return Shader.super.initialize();
    }

    @Override
    public void bind() {
        if (PlatformState.graphicsShader == program) {
            return;
        }

        opengl.glUseProgram(program);
        PlatformState.graphicsShader = program;
    }

    @Override
    public boolean configure(Specification specification) {
        if (Configuration.CHECKS && program == GL11.GL_NONE) {
            Logger.warn("Shader not initialized");
            return false;
        }

        if (Configuration.CHECKS && !Meta.assignable(specification, ShaderSpec.class)) {
            Logger.error("Expecting %s got %s", Meta.fqn(ShaderSpec.class), Meta.fqn(specification));
            return false;
        }

        final var spec = Meta.cast(specification, ShaderSpec.class);
        if (Configuration.CHECKS && spec.source() == null) {
            Logger.error("Shader source not set");
            return false;
        }

        if (Configuration.CHECKS && spec.source().length < 2) {
            Logger.error("Expecting at least a 2 stages shader, got %d", spec.source().length);
            return false;
        }

        // ##################################################
        // Compile shader
        // ##################################################
        opengl.glPushDebugGroup(GL_DEBUG_SOURCE_APPLICATION, 0, "GLShader::configure()");
        final var stages = new ArrayList<Integer>();

        try {
            for (final var source : spec.source()) {
                final var stage = opengl.glCreateShader(switch (source.stage()) {
                    case VERTEX -> GL_VERTEX_SHADER;
                    case FRAGMENT -> GL_FRAGMENT_SHADER;
                });
                Diagnostics.graphicsShaderStage++;

                opengl.glShaderSource(stage, source.script());
                opengl.glCompileShader(stage);
                if (opengl.glGetShaderi(stage, GL_COMPILE_STATUS) == GL11.GL_FALSE) {
                    opengl.glDeleteShader(stage);
                    Diagnostics.graphicsShaderStage--;
                    Logger.warn("Failed to compile shader %s", source.stage());
                    return false;
                }

                stages.add(stage);
                opengl.glAttachShader(program, stage);
            }

            // ##################################################
            // Link program
            // ##################################################
            opengl.glLinkProgram(program);
            if (opengl.glGetProgrami(program, GL_LINK_STATUS) == GL11.GL_FALSE) {
                stages.forEach(stage -> {
                    opengl.glDetachShader(program, stage);
                    Diagnostics.graphicsShaderStage--;
                });
                Logger.warn("Failed to link shader program");
                return false;
            }

            // ##################################################
            // Validate program
            // ##################################################
            opengl.glValidateProgram(program);
            if (opengl.glGetProgrami(program, GL_VALIDATE_STATUS) == GL11.GL_FALSE) {
                stages.forEach(stage -> {
                    opengl.glDetachShader(program, stage);
                    Diagnostics.graphicsShaderStage--;
                });
                Logger.warn("Failed to validate shader program");
                return false;
            }

            if (opengl.glGetProgrami(program, GL_ATTACHED_SHADERS) != stages.size()) {
                Logger.fatal("Wrong number of attached shaders");
            }

            final var uniformCount = opengl.glGetProgrami(program, GL_ACTIVE_UNIFORMS);
            if (uniformCount > 0) {
                try (final var stack = MemoryStack.stackPush()) {
                    final var pLength = stack.mallocInt(1);
                    final var pType = stack.mallocInt(1);
                    for (int i = 0; i < uniformCount; i++) {
                        final var name = opengl.glGetActiveUniform(program, i, pLength, pType);
                        Logger.trace("[Shader %d] Found uniform name \"%s\"", program, name);
                        uniforms.put(name, opengl.glGetUniformLocation(program, name));
                    }
                }
            }
        } finally {
            stages.forEach(stage -> {
                opengl.glDetachShader(program, stage);
                Diagnostics.graphicsShaderStage--;
            });

            opengl.glPopDebugGroup();
        }

        return true;
    }

    @Override
    public boolean uniform(String name, int ... values) {
        if (!uniforms.containsKey(name)) {
            Logger.warn("Uniform %s not found", name);
            return false;
        }

        if (values.length == 0 || values.length > 4) {
            Logger.warn("Invalid number of values for uniform %s", name);
            return false;
        }

        switch (values.length) {
            case 1 -> opengl.glProgramUniform1iv(program, uniforms.get(name), values);
            case 2 -> opengl.glProgramUniform2iv(program, uniforms.get(name), values);
            case 3 -> opengl.glProgramUniform3iv(program, uniforms.get(name), values);
            case 4 -> opengl.glProgramUniform4iv(program, uniforms.get(name), values);
        }

        return true;
    }

    @Override
    public boolean uniform(String name, float ... values) {
        if (!uniforms.containsKey(name)) {
            Logger.warn("Uniform %s not found", name);
            return false;
        }

        if (values.length == 0 || values.length > 4) {
            Logger.warn("Invalid number of values for uniform %s", name);
            return false;
        }

        switch (values.length) {
            case 1 -> opengl.glProgramUniform1fv(program, uniforms.get(name), values);
            case 2 -> opengl.glProgramUniform2fv(program, uniforms.get(name), values);
            case 3 -> opengl.glProgramUniform3fv(program, uniforms.get(name), values);
            case 4 -> opengl.glProgramUniform4fv(program, uniforms.get(name), values);
        }

        return true;
    }

    @Override
    public boolean uniform(String name, Matrix2fc matrix) {
        return uniform(name, 2, 2, matrix.get(new float[2 * 2]));
    }

    @Override
    public boolean uniform(String name, Matrix3fc matrix) {
        return uniform(name, 3, 3, matrix.get(new float[3 * 3]));
    }

    @Override
    public boolean uniform(String name, Matrix3x2fc matrix) {
        return uniform(name, 3, 2, matrix.get(new float[3 * 2]));
    }

    @Override
    public boolean uniform(String name, Matrix4fc matrix) {
        return uniform(name, 4, 4, matrix.get(new float[4 * 4]));
    }

    @Override
    public boolean uniform(String name, Matrix4x3fc matrix) {
        return uniform(name, 4, 3, matrix.get(new float[4 * 3]));
    }

    @Override
    public boolean uniform(String name, int rows, int columns, float ... values) {
        if (!uniforms.containsKey(name)) {
            Logger.warn("Uniform %s not found", name);
            return false;
        }

        if (rows < 2 || rows > 4) {
            Logger.warn("Invalid number of rows %d", rows);
            return false;
        }

        if (columns < 2 || columns > 4) {
            Logger.warn("Invalid number of columns %d", columns);
            return false;
        }

        if (values.length != rows * columns) {
            Logger.warn("Invalid number of values for uniform %s", name);
            return false;
        }

        switch (rows) {
            case 2: switch (columns) {
                case 2: opengl.glProgramUniformMatrix2fv  (program, uniforms.get(name), false, values); break;
                case 3: opengl.glProgramUniformMatrix2x3fv(program, uniforms.get(name), false, values); break;
                case 4: opengl.glProgramUniformMatrix2x4fv(program, uniforms.get(name), false, values); break;
            } break ;
            case 3: switch (columns) {
                case 2: opengl.glProgramUniformMatrix3x2fv(program, uniforms.get(name), false, values); break;
                case 3: opengl.glProgramUniformMatrix3fv  (program, uniforms.get(name), false, values); break;
                case 4: opengl.glProgramUniformMatrix3x4fv(program, uniforms.get(name), false, values); break;
            } break ;
            case 4: switch (columns) {
                case 2: opengl.glProgramUniformMatrix4x2fv(program, uniforms.get(name), false, values); break;
                case 3: opengl.glProgramUniformMatrix4x3fv(program, uniforms.get(name), false, values); break;
                case 4: opengl.glProgramUniformMatrix4fv  (program, uniforms.get(name), false, values); break;
            } break ;
        }

        return true;
    }

    @Override
    public boolean terminate() {
        if (program != GL11.GL_NONE) {
            opengl.glDeleteProgram(program);
            Diagnostics.graphicsShader--;
            program = GL11.GL_NONE;
        }

        return true;
    }
}
