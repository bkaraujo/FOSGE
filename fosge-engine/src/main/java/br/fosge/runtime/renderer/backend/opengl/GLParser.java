package br.fosge.runtime.renderer.backend.opengl;

import br.fosge.engine.renderer.backend.*;
import br.fosge.engine.renderer.backend.texture.PixelFormat;
import br.fosge.engine.renderer.backend.texture.TextureFiltering;
import br.fosge.engine.renderer.backend.texture.TextureWrapping;
import br.fosge.runtime.platform.binding.opengl.api.*;

import javax.annotation.Nonnull;


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
            case CLAMP_TO_EDGE -> GL12.GL_CLAMP_TO_EDGE;
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

    public static int parse(@Nonnull BlendFunction function) {
        return switch (function) {
            case ZERO -> GL11.GL_ZERO;
            case ONE -> GL11.GL_ONE;
            case SRC_COLOR -> GL11.GL_SRC_COLOR;
            case ONE_MINUS_SRC_COLOR -> GL11.GL_ONE_MINUS_SRC_COLOR;
            case DST_COLOR -> GL11.GL_DST_COLOR;
            case ONE_MINUS_DST_COLOR -> GL11.GL_ONE_MINUS_DST_COLOR;
            case SRC_ALPHA -> GL11.GL_SRC_ALPHA;
            case ONE_MINUS_SRC_ALPHA -> GL11.GL_ONE_MINUS_SRC_ALPHA;
            case DST_ALPHA -> GL11.GL_DST_ALPHA;
            case ONE_MINUS_DST_ALPHA -> GL11.GL_ONE_MINUS_DST_ALPHA;
            case CONSTANT_COLOR -> GL14.GL_CONSTANT_COLOR;
            case ONE_MINUS_CONSTANT_COLOR -> GL14.GL_ONE_MINUS_CONSTANT_COLOR;
            case CONSTANT_ALPHA ->GL14.GL_CONSTANT_ALPHA;
            case ONE_MINUS_CONSTANT_ALPHA -> GL14.GL_ONE_MINUS_CONSTANT_ALPHA;
        };
    }

    public static int parse(@Nonnull BlendEquation equation) {
        return switch (equation) {
            case FUNC_ADD -> GL14.GL_FUNC_ADD;
            case FUNC_SUBTRACT -> GL14.GL_FUNC_SUBTRACT;
            case FUNC_REVERSE_SUBTRACT -> GL14.GL_FUNC_REVERSE_SUBTRACT;
            case FUNC_MIN -> GL14.GL_MIN;
            case FUNC_MAX -> GL14.GL_MAX;
        };
    }

    public static int parse(@Nonnull DepthFunction function) {
        return switch(function) {
            case NEVER -> GL11.GL_NEVER;
            case LESS -> GL11.GL_LESS;
            case EQUAL -> GL11.GL_EQUAL;
            case LEQUAL -> GL11.GL_LEQUAL;
            case GREATER -> GL11.GL_GREATER;
            case NOTEQUAL -> GL11.GL_NOTEQUAL;
            case GEQUAL -> GL11.GL_GEQUAL;
            case ALWAYS -> GL11.GL_ALWAYS;
        };
    }

    public static int parse(@Nonnull CullFaceMode mode) {
        return switch (mode) {
            case FRONT -> GL11.GL_FRONT;
            case BACK -> GL11.GL_BACK;
            case FRONT_AND_BACK -> GL11.GL_FRONT_AND_BACK;
        };
    }

    public static int parse(@Nonnull SmoothHints hint) {
        return switch (hint) {
            case FASTEST -> GL11.GL_FASTEST;
            case NICEST -> GL11.GL_NICEST;
            case DONT_CARE -> GL11.GL_DONT_CARE;
        };
    }
}
