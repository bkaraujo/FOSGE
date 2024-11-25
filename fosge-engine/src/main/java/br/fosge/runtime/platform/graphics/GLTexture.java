package br.fosge.runtime.platform.graphics;

import br.fosge.Logger;
import br.fosge.graphics.Texture;
import br.fosge.graphics.texture.TextureFiltering;
import br.fosge.graphics.texture.TextureWrapping;
import br.fosge.runtime.platform.PlatformState;

import static br.fosge.runtime.platform.Bindings.opengl;
import static br.fosge.runtime.platform.binding.OpenGL.*;


abstract class GLTexture implements Texture {
    protected int handle = GL_NONE;

    @Override
    public final int handle() {
        return handle;
    }

    @Override
    public final void wrapping(TextureWrapping s, TextureWrapping t) {
        if (handle == GL_NONE) {
            Logger.warn("Texture not initialized");
            return;
        }

        opengl.glTextureParameteri(handle, GL_TEXTURE_WRAP_S, GLParser.parse(s));
        opengl.glTextureParameteri(handle, GL_TEXTURE_WRAP_T, GLParser.parse(t));
    }

    @Override
    public final void filtering(TextureFiltering min, TextureFiltering mag) {
        if (handle == GL_NONE) {
            Logger.warn("Texture not initialized");
            return;
        }

        opengl.glTextureParameteri(handle, GL_TEXTURE_MIN_FILTER, GLParser.parse(min));
        opengl.glTextureParameteri(handle, GL_TEXTURE_MAG_FILTER, GLParser.parse(mag));
    }

    @Override
    public final void bind() {
        if (handle == GL_NONE) {
            Logger.warn("Texture not initialized");
            return;
        }

        bind(0);
    }

    @Override
    public final void bind(int unit) {
        if (handle == GL_NONE) {
            Logger.warn("Texture not initialized");
            return;
        }

        if (PlatformState.graphicsTexture == handle) {
            if (PlatformState.graphicsTextureUnit == unit) {
                return;
            }
        }

        opengl.glBindTextureUnit(unit, handle);
        PlatformState.graphicsTexture = handle;
        PlatformState.graphicsTextureUnit = unit;
    }

    @Override
    public final void unbind() {
        if (handle == GL_NONE) {
            Logger.warn("Texture not initialized");
            return;
        }

        Logger.warn("Unnecessary texture unbind");
    }
}
