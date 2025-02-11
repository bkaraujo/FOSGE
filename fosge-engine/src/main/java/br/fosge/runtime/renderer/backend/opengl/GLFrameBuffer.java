package br.fosge.runtime.renderer.backend.opengl;

import br.fosge.commons.Meta;
import br.fosge.commons.annotation.Specification;
import br.fosge.commons.math.Vectors;
import br.fosge.engine.renderer.backend.FrameBuffer;
import br.fosge.engine.renderer.backend.buffer.FrameBufferSpec;
import br.fosge.runtime.platform.binding.opengl.api.GL11;
import br.fosge.runtime.platform.binding.opengl.api.GL30;
import org.joml.Vector2i;
import org.joml.Vector2ic;
import org.joml.Vector4fc;

import static br.fosge.runtime.platform.Bindings.opengl;

public final class GLFrameBuffer implements FrameBuffer {
    private int handle = GL11.GL_NONE;

    private int colorAttachment = GL11.GL_NONE;
    private int depthAttachment = GL11.GL_NONE;
    private final Vector2i size = new Vector2i();

    @Override
    public boolean initialize() {
        handle = opengl.glCreateFramebuffers();

        return true;
    }

    @Override
    public int handle() {
        return handle;
    }

    @Override
    public boolean configure(Specification specification) {
        final var spec = Meta.cast(specification, FrameBufferSpec.class);
        // ######################################################
        // Color Attachment
        // ######################################################
        colorAttachment = opengl.glCreateTextures(GL11.GL_TEXTURE_2D);
        final var internalFormat = spec.hdr() ? GL30.GL_RGBA32F : GL11.GL_RGBA8;
        opengl.glTextureStorage2D(colorAttachment, 1, internalFormat, spec.size().x(), spec.size().y());
        opengl.glTextureParameteri(colorAttachment, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
        opengl.glTextureParameteri(colorAttachment, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
        opengl.glNamedFramebufferTexture(handle, GL30.GL_COLOR_ATTACHMENT0, colorAttachment, 0);
        // ######################################################
        // Depth Attachment
        // ######################################################
        depthAttachment = opengl.glCreateTextures(GL11.GL_TEXTURE_2D);
        opengl.glTextureStorage2D(depthAttachment, 1, GL30.GL_DEPTH24_STENCIL8, spec.size().x(), spec.size().y());
        opengl.glNamedFramebufferTexture(handle, GL30.GL_DEPTH_STENCIL_ATTACHMENT, depthAttachment, 0);
        // ######################################################
        // Sanity Checks
        // ######################################################
        size.set(spec.size());
        return opengl.glCheckNamedFramebufferStatus(handle, GL30.GL_FRAMEBUFFER) == GL30.GL_FRAMEBUFFER_COMPLETE;
    }

    @Override
    public void bind() {
        opengl.glBindFramebuffer(GL30.GL_FRAMEBUFFER, handle);
    }

    @Override
    public void unbind() {
        opengl.glBindFramebuffer(GL30.GL_FRAMEBUFFER, 0);
    }

    @Override
    public int colorAttachment() {
        return colorAttachment;
    }

    @Override
    public int depthAttachment() {
        return depthAttachment;
    }

    @Override
    public Vector2ic size() {
        return size;
    }

    @Override
    public void clear(Vector4fc color) {
        opengl.glClearNamedFramebufferfv(handle, GL11.GL_COLOR, 0, Vectors.toArray(color));
    }

    @Override
    public boolean terminate() {
        if (colorAttachment != GL11.GL_NONE) { opengl.glDeleteTextures(colorAttachment); }
        if (depthAttachment != GL11.GL_NONE) { opengl.glDeleteTextures(depthAttachment); }
        if (handle != GL11.GL_NONE) { opengl.glDeleteFramebuffers(handle); }

        handle = GL11.GL_NONE;
        return true;
    }
}
