package br.fosge.runtime.renderer.backend.opengl;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.engine.renderer.backend.Texture2D;
import br.fosge.engine.renderer.backend.texture.TextureSpec;
import br.fosge.runtime.platform.binding.opengl.api.GL11;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;

import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;

import static br.fosge.runtime.platform.Bindings.opengl;

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

    public boolean load(TextureSpec spec) {
        if (handle == GL11.GL_NONE) {
            Logger.warn("Texture not initialized");
            return false;
        }

        if (!Files.exists(spec.path())) {
            Logger.error("File not found: %s", spec.path());
            return false;
        }

        ByteBuffer pixels = null;
        try (final var stack = MemoryStack.stackPush()) {
            final var pWidth = stack.mallocInt(1);
            final var pHeight = stack.mallocInt(1);
            final var pChannel = stack.mallocInt(1);

            STBImage.stbi_set_flip_vertically_on_load(spec.verticalFlip());
            pixels = STBImage.stbi_load(spec.path().toString(), pWidth, pHeight, pChannel, 0);
            if (pixels == null) {
                Logger.error("Failed to load image %s", spec.path());
                return false;
            }

            final var width = pWidth.get();
            final var height = pHeight.get();
            final var channels = pChannel.get();

            opengl.glTextureStorage2D(
                    handle,
                    spec.mip(),
                    GLParser.parse(spec.storageFormat()),
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
                    GLParser.parse(spec.format()),
                    GLParser.parse(spec.dataType()),
                    pixels
            );

            if (spec.mip() > 1) {
                opengl.glGenerateTextureMipmap(handle);
            }

            path = spec.path();
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
