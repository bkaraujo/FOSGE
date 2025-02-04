package br.fosge.engine.runtime.platform.graphics;

import br.fosge.engine.graphics.DataType;
import br.fosge.engine.graphics.DrawMode;
import br.fosge.engine.graphics.texture.PixelFormat;
import br.fosge.engine.graphics.texture.TextureFiltering;
import br.fosge.engine.graphics.texture.TextureWrapping;
import br.fosge.engine.runtime.platform.binding.opengl.api.GL11;
import br.fosge.engine.runtime.platform.binding.opengl.api.GL13;
import br.fosge.engine.runtime.platform.binding.opengl.api.GL14;
import br.fosge.engine.runtime.platform.binding.opengl.api.GL30;

import javax.annotation.Nonnull;

import static br.fosge.engine.runtime.platform.binding.OpenGL.GL_CLAMP_TO_EDGE;

public abstract class GLParser {
    private GLParser() { /* Private constructor */ }

    public static int parse(@Nonnull DataType type) {
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

    public static int parse(@Nonnull DrawMode mode) {
        return switch (mode) {
            case TRIANGLE -> GL11.GL_TRIANGLES;
            case QUAD -> GL11.GL_QUADS;
        };
    }

    public static int parse(@Nonnull TextureWrapping wrapping) {
        return switch (wrapping) {
            case REPEAT -> GL11.GL_REPEAT;
            case MIRRORED_REPEAT -> GL14.GL_MIRRORED_REPEAT;
            case CLAMP_TO_BORDER -> GL13.GL_CLAMP_TO_BORDER;
            case CLAMP_TO_EDGE -> GL_CLAMP_TO_EDGE;
        };
    }

    public static int parse(@Nonnull TextureFiltering filtering) {
        return switch (filtering) {
            case LINEAR -> GL11.GL_LINEAR;
            case LINEAR_MIPMAP_LINEAR -> GL11.GL_LINEAR_MIPMAP_LINEAR;
            case LINEAR_MIPMAP_NEAREST -> GL11.GL_LINEAR_MIPMAP_NEAREST;

            case NEAREST -> GL11.GL_NEAREST;
            case NEAREST_MIPMAP_LINEAR -> GL11.GL_NEAREST_MIPMAP_LINEAR;
            case NEAREST_MIPMAP_NEAREST -> GL11.GL_NEAREST_MIPMAP_NEAREST;
        };
    }

    public static int parse(@Nonnull PixelFormat format) {
        return switch (format) {
            case RED -> GL11.GL_RED;
            case GREEN -> GL11.GL_GREEN;
            case BLUE -> GL11.GL_BLUE;
            case ALPHA -> GL11.GL_ALPHA;

            case RG -> GL30.GL_RG;
            case RGB -> GL11.GL_RGB;
            case RGBA -> GL11.GL_RGBA;

            case RG8 -> GL30.GL_RG8;
            case RGB8 -> GL11.GL_RGB8;
            case RGBA8 -> GL11.GL_RGBA8;
        };
    }
}
