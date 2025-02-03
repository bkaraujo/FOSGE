package br.fosge.engine.runtime.platform.graphics;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.engine.graphics.Texture2D;
import br.fosge.engine.runtime.platform.binding.opengl.api.GL11;
import br.fosge.engine.runtime.platform.binding.opengl.api.GL30;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;

import java.nio.ByteBuffer;
import java.nio.file.Path;

import static br.fosge.engine.runtime.platform.Bindings.opengl;

public final class GLTexture2D extends GLTexture implements Texture2D {
    private Path path;
    @Override
    public boolean initialize() {
        if (handle != GL11.GL_NONE) {
            Logger.warn("Texture already initialized");
            return true;
        }

        handle = opengl.glCreateTextures(GL11.GL_TEXTURE_2D);
        return Texture2D.super.initialize();
    }

    @Override
    public Path path() {
        return path;
    }

    public boolean load(Path path, int mips) {
        if (handle == GL11.GL_NONE) {
            Logger.warn("Texture not initialized");
            return false;
        }

        ByteBuffer pixels = null;
        try (final var stack = MemoryStack.stackPush()) {
            final var pWidth = stack.mallocInt(1);
            final var pHeight = stack.mallocInt(1);
            final var pChannel = stack.mallocInt(1);

            pixels = STBImage.stbi_load(path.toString(), pWidth, pHeight, pChannel, 0);
            if (pixels == null) { Logger.error("Failed to load image %s", path); return false; }

            final var width = pWidth.get();
            final var height = pHeight.get();
            final var channels = pChannel.get();

            opengl.glTextureStorage2D(
                    handle,
                    mips,
                    switch (channels) {
                        default -> { Logger.fatal("Unsupported image channels: %d", channels); yield GL11.GL_NONE; }
                        case 1 -> GL11.GL_RED;
                        case 2 -> GL30.GL_RG8;
                        case 3 -> GL11.GL_RGB8;
                        case 4 -> GL11.GL_RGBA8;
                    },
                    width,
                    height
            );

            opengl.glTextureSubImage2D(
                    handle,
                    0,
                    0,
                    0,
                    width,
                    height,
                    switch (channels) {
                        default -> { Logger.fatal("Unsupported image channels: %d", channels); yield GL11.GL_NONE; }
                        case 1 -> GL11.GL_RED;
                        case 2 -> GL30.GL_RG;
                        case 3 -> GL11.GL_RGB;
                        case 4 -> GL11.GL_RGBA;
                    },
                    GL11.GL_UNSIGNED_BYTE,
                    pixels
            );

            if (mips > 1) {
                opengl.glGenerateTextureMipmap(handle);
            }

            this.path = path;
            return true;
        } finally {
            if (pixels != null) {
                STBImage.stbi_image_free(pixels);
            }
        }
    }

    @Override
    public boolean terminate() {
        if (RT.Graphics.boundTexture == handle) {
            RT.Graphics.boundTexture = GL11.GL_NONE;
            opengl.glBindTextureUnit(0, RT.Graphics.boundTexture);
        }

        if (handle != GL11.GL_NONE) {
            opengl.glDeleteTextures(handle);
            handle = GL11.GL_NONE;
        }

        return true;
    }

    @Override
    public String toString() {
        return path.toString();
    }
}
