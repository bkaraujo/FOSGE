package br.fosge.runtime.platform.graphics;

import br.fosge.graphics.DataType;
import br.fosge.graphics.DrawMode;
import br.fosge.graphics.texture.TextureFiltering;
import br.fosge.graphics.texture.TextureWrapping;

import static br.fosge.runtime.platform.binding.OpenGL.*;

public abstract class GLParser {
    private GLParser() { /* Private constructor */ }

    public static int parse(DataType type) {
        return switch (type) {
            case UBYTE -> GL_UNSIGNED_BYTE;
            case USHORT -> GL_UNSIGNED_SHORT;
            case UINT -> GL_UNSIGNED_INT;
            case BYTE -> GL_BYTE;
            case SHORT -> GL_SHORT;
            case INT -> GL_INT;
            case FLOAT -> GL_FLOAT;
            case DOUBLE -> GL_DOUBLE;
        };
    }

    public static int parse(DrawMode mode) {
        return switch (mode) {
            case TRIANGLE -> GL_TRIANGLES;
            case QUAD -> GL_QUADS;
        };
    }

    public static int parse(TextureWrapping wrapping) {
        return switch (wrapping) {
            case REPEAT -> GL_REPEAT;
            case MIRRORED_REPEAT -> GL_MIRRORED_REPEAT;
            case CLAMP_TO_BORDER -> GL_CLAMP_TO_BORDER;
            case CLAMP_TO_EDGE -> GL_CLAMP_TO_EDGE;
        };
    }

    public static int parse(TextureFiltering filtering) {
        return switch (filtering) {
            case LINEAR -> GL_LINEAR;
            case LINEAR_MIPMAP_LINEAR -> GL_LINEAR_MIPMAP_LINEAR;
            case LINEAR_MIPMAP_NEAREST -> GL_LINEAR_MIPMAP_NEAREST;

            case NEAREST -> GL_NEAREST;
            case NEAREST_MIPMAP_LINEAR -> GL_NEAREST_MIPMAP_LINEAR;
            case NEAREST_MIPMAP_NEAREST -> GL_NEAREST_MIPMAP_NEAREST;
        };
    }

}