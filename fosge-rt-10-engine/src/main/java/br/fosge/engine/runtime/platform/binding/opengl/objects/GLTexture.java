package br.fosge.engine.runtime.platform.binding.opengl.objects;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.engine.graphics.Texture;
import br.fosge.engine.graphics.texture.TextureFiltering;
import br.fosge.engine.graphics.texture.TextureWrapping;
import br.fosge.engine.runtime.platform.binding.opengl.api.GL11;

import static br.fosge.engine.runtime.platform.Bindings.opengl;

abstract class GLTexture implements Texture {
    protected int handle = GL11.GL_NONE;

    @Override
    public final int handle() {
        return handle;
    }

    @Override
    public final void wrapping(TextureWrapping s, TextureWrapping t) {
        if (handle == GL11.GL_NONE) {
            Logger.warn("Texture not initialized");
            return;
        }

        opengl.glTextureParameteri(handle, GL11.GL_TEXTURE_WRAP_S, GLParser.parse(s));
        opengl.glTextureParameteri(handle, GL11.GL_TEXTURE_WRAP_T, GLParser.parse(t));
    }

    @Override
    public final void filtering(TextureFiltering min, TextureFiltering mag) {
        if (handle == GL11.GL_NONE) {
            Logger.warn("Texture not initialized");
            return;
        }

        opengl.glTextureParameteri(handle, GL11.GL_TEXTURE_MIN_FILTER, GLParser.parse(min));
        opengl.glTextureParameteri(handle, GL11.GL_TEXTURE_MAG_FILTER, GLParser.parse(mag));
    }

    @Override
    public final void bind() {
        if (handle == GL11.GL_NONE) {
            Logger.warn("Texture not initialized");
            return;
        }

        bind(0);
    }

    @Override
    public final void bind(int unit) {
        if (handle == GL11.GL_NONE) {
            Logger.warn("Texture not initialized");
            return;
        }

        if (RT.Graphics.boundTexture == handle) {
            if (RT.Graphics.boundTextureUnit == unit) {
                return;
            }
        }

        opengl.glBindTextureUnit(unit, handle);
        RT.Graphics.boundTexture = handle;
        RT.Graphics.boundTextureUnit = unit;
    }
}
