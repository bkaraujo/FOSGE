package br.fosge.engine.runtime.platform.graphics;

import br.fosge.Logger;
import br.fosge.engine.annotation.Specification;
import br.fosge.engine.diagnostics.Diagnostics;
import br.fosge.engine.graphics.DataType;
import br.fosge.engine.graphics.DrawMode;
import br.fosge.engine.graphics.Geometry;
import br.fosge.engine.graphics.geometry.GeometrySpec;
import br.fosge.engine.runtime.Memory;
import br.fosge.engine.runtime.Runtime;
import br.fosge.engine.runtime.platform.PlatformState;
import br.fosge.tools.Meta;

import java.nio.ByteBuffer;

import static br.fosge.engine.runtime.platform.Bindings.opengl;
import static br.fosge.engine.runtime.platform.binding.OpenGL.GL_NONE;
import static br.fosge.engine.runtime.platform.binding.OpenGL.GL_STATIC_DRAW;

public final class GLGeometry implements Geometry {
    private int VAO = GL_NONE;
    private int VBO = GL_NONE;
    private int EBO = GL_NONE;

    private int vbo_length;
    private int ebo_length;

    private DataType indexType;
    private DrawMode drawMode;

    @Override
    public int handle() {
        return VAO;
    }

    @Override
    public boolean initialize() {
        if (VAO != GL_NONE) {
            Logger.warn("Geometry already initialized");
            return false;
        }

        VAO = opengl.glCreateVertexArrays();
        Diagnostics.graphicsVertexArray++;

        VBO = opengl.glCreateBuffers();
        Diagnostics.graphicsBuffer++;

        EBO = opengl.glCreateBuffers();
        Diagnostics.graphicsBuffer++;

        return true;
    }

    @Override
    public boolean configure(Specification specification) {
        if (Runtime.CHECKS && !Meta.assignable(specification, GeometrySpec.class)) {
            Logger.error("Expecting %s got %s", Meta.fqn(GeometrySpec.class), Meta.fqn(specification));
            return false;
        }

        final var spec = Meta.cast(specification, GeometrySpec.class);
        if (Runtime.CHECKS) {
            if (VAO == GL_NONE) {
                Logger.warn("Geometry not initialized");
                return false;
            }

            if (spec.layouts().length == 0) {
                Logger.error("Expecting at least a 1 buffer layout, got %d", spec.layouts().length);
                return false;
            }

            if (!spec.indexType().unsigned) {
                Logger.error("Expected a unsigned type as index type, got %s", spec.indexType());
                return false;
            }
        }

        drawMode = spec.mode();
        indexType = spec.indexType();

        int offset = 0;
        for (int i = 0; i < spec.layouts().length; i++) {
            final var layout = spec.layouts()[i];
            opengl.glEnableVertexArrayAttrib(VAO, i);
            opengl.glVertexArrayAttribFormat(VAO, i, layout.type().length, GLParser.parse(layout.type().type), false, offset);
            opengl.glVertexArrayAttribBinding(VAO, i, 0);

            offset += layout.type().size;
        }

        opengl.glVertexArrayElementBuffer(VAO, EBO);
        opengl.glVertexArrayVertexBuffer(VAO, 0, VBO, 0, offset);

        return true;
    }

    @Override
    public DrawMode mode() {
        return drawMode;
    }

    @Override
    public DataType indexType() {
        return indexType;
    }

    @Override
    public int elements() {
        return ebo_length;
    }

    private int upload(int target, int length, int maximum, ByteBuffer buffer) {
        if (VAO == GL_NONE) { Logger.fatal("Geometry not initialized"); }

        if (length > maximum) {
            Logger.trace(
                    "[Geometry %d] resizing %s from %d to %d elements",
                    VAO,
                    target == VBO ? "VBO" : "EBO",
                    maximum,
                    length
            );

            opengl.glNamedBufferData(target, buffer, GL_STATIC_DRAW);
            return length;
        }

        opengl.glNamedBufferSubData(target, 0, buffer);
        return maximum;
    }

    @Override
    public void elements(byte... values) {
        final var buffer = Memory.bytes(values.length);

        try {
            buffer.put(values).rewind();
            ebo_length = upload(EBO, values.length, ebo_length, buffer);
        } finally {
            Memory.free(buffer);
        }
    }

    @Override
    public void elements(short ... values) {
        final var buffer = Memory.bytes(values.length * Short.BYTES);

        try {
            buffer.asShortBuffer().put(values).rewind();
            ebo_length = upload(EBO, values.length, ebo_length, buffer);
        } finally {
            Memory.free(buffer);
        }

        opengl.glNamedBufferData(EBO, values, GL_STATIC_DRAW);
    }

    @Override
    public void elements(int ... values) {
        final var buffer = Memory.bytes(values.length * Integer.BYTES);

        try {
            buffer.asIntBuffer().put(values).rewind();
            ebo_length = upload(EBO, values.length, ebo_length, buffer);
        } finally {
            Memory.free(buffer);
        }
    }

    @Override
    public void vertices(float ... values) {
        final var buffer = Memory.bytes(values.length * Float.BYTES);

        try {
            buffer.asFloatBuffer().put(values).rewind();
            vbo_length = upload(VBO, values.length, vbo_length, buffer);
        } finally {
            Memory.free(buffer);
        }
    }

    @Override
    public void bind() {
        if (PlatformState.graphicsVAO == VAO) {
            return;
        }

        opengl.glBindVertexArray(VAO);
        PlatformState.graphicsVAO = VAO;
    }

    @Override
    public boolean terminate() {
        if (VAO != GL_NONE) {
            opengl.glDeleteVertexArrays(VAO);
            Diagnostics.graphicsVertexArray--;

            VAO = GL_NONE;
        }

        if (VBO != GL_NONE) {
            opengl.glDeleteBuffers(VBO);
            Diagnostics.graphicsBuffer--;
            VBO = GL_NONE;
        }

        if (EBO != GL_NONE) {
            opengl.glDeleteBuffers(EBO);
            Diagnostics.graphicsBuffer--;
            EBO = GL_NONE;
        }

        return true;
    }
}
