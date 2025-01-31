package br.fosge.engine.runtime.platform;

import br.fosge.commons.Meta;
import br.fosge.engine.runtime.platform.binding.GLFW;
import br.fosge.engine.runtime.platform.binding.OpenAL;
import br.fosge.engine.runtime.platform.binding.OpenGL;
import br.fosge.engine.runtime.platform.binding.glfw.impl.GLFW3x;
import br.fosge.engine.runtime.platform.binding.openal.impl.AL11Impl;
import br.fosge.engine.runtime.platform.binding.opengl.impl.GL4x;
import br.fosge.engine.runtime.platform.binding.stb.api.STBImage;
import br.fosge.engine.runtime.platform.binding.stb.api.STBVorbis;
import br.fosge.engine.runtime.platform.binding.stb.impl.STBImageImpl;
import br.fosge.engine.runtime.platform.binding.stb.impl.STBVorbisImpl;

public abstract class Bindings {
    private Bindings() { /* Private constructor */ }

    public static final GLFW glfw = Meta.cast(new GLFWFacade(), GLFW.class);
    public static final OpenAL openal = Meta.cast(new OpenALFacade(), OpenAL.class);
    public static final OpenGL opengl = Meta.cast(new OpenGLFacade(), OpenGL.class);

    public static final STBImage stbi = Meta.cast(new STBImageFacade(), STBImage.class);
    public static final STBVorbis stbv = Meta.cast(new STBVorbisFacade(), STBVorbis.class);

    private static class STBImageFacade extends STBImageImpl implements STBImage {}
    private static class STBVorbisFacade extends STBVorbisImpl implements STBVorbis {}
    private static class OpenGLFacade extends GL4x implements OpenGL {}
    private static class OpenALFacade extends AL11Impl implements OpenAL {}
    private static class GLFWFacade extends GLFW3x implements GLFW {}

}
