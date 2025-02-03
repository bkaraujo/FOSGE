package br.fosge.engine.runtime.platform.graphics;

import br.fosge.engine.graphics.DataType;
import br.fosge.engine.graphics.DrawMode;
import br.fosge.engine.graphics.texture.TextureFiltering;
import br.fosge.engine.graphics.texture.TextureWrapping;
import br.fosge.engine.runtime.platform.binding.opengl.api.GL11;
import br.fosge.engine.runtime.platform.binding.opengl.api.GL13;
import br.fosge.engine.runtime.platform.binding.opengl.api.GL14;

import static br.fosge.engine.runtime.platform.binding.OpenGL.GL_CLAMP_TO_EDGE;

public abstract class GLParser {
    private GLParser() { /* Private constructor */ }

    public static int parse(DataType type) {
        return switch (type) {
            case UBYTE -> GL11.GL_UNSIGNED_BYTE;
            case USHORT -> GL11.GL_UNSIGNED_SHORT;
            case UINT -> GL11.GL_UNSIGNED_INT;
            case BYTE -> GL11.GL_BYTE;
            case SHORT -> GL11.GL_SHORT;
            case INT -> GL11.GL_INT;
            case FLOAT -> GL11.GL_FLOAT;
            case DOUBLE -> GL11.GL_DOUBLE;
        };
    }

    public static int parse(DrawMode mode) {
        return switch (mode) {
            case TRIANGLE -> GL11.GL_TRIANGLES;
            case QUAD -> GL11.GL_QUADS;
        };
    }

    public static int parse(TextureWrapping wrapping) {
        return switch (wrapping) {
            case REPEAT -> GL11.GL_REPEAT;
            case MIRRORED_REPEAT -> GL14.GL_MIRRORED_REPEAT;
            case CLAMP_TO_BORDER -> GL13.GL_CLAMP_TO_BORDER;
            case CLAMP_TO_EDGE -> GL_CLAMP_TO_EDGE;
        };
    }

    public static int parse(TextureFiltering filtering) {
        return switch (filtering) {
            case LINEAR -> GL11.GL_LINEAR;
            case LINEAR_MIPMAP_LINEAR -> GL11.GL_LINEAR_MIPMAP_LINEAR;
            case LINEAR_MIPMAP_NEAREST -> GL11.GL_LINEAR_MIPMAP_NEAREST;

            case NEAREST -> GL11.GL_NEAREST;
            case NEAREST_MIPMAP_LINEAR -> GL11.GL_NEAREST_MIPMAP_LINEAR;
            case NEAREST_MIPMAP_NEAREST -> GL11.GL_NEAREST_MIPMAP_NEAREST;
        };
    }

}
