package br.fosge.engine.runtime.platform;

import br.fosge.engine.runtime.platform.glfw.GLFWFacade;
import br.fosge.engine.runtime.platform.openal.OpenALFacade;
import br.fosge.engine.runtime.platform.opengl.OpenGLFacade;
import br.fosge.engine.runtime.platform.stb.STBImageFacade;
import br.fosge.engine.runtime.platform.stb.STBVorbisFacade;
import br.fosge.engine.runtime.platform.stb.api.STBImage;
import br.fosge.engine.runtime.platform.stb.api.STBVorbis;
import br.fosge.tools.Meta;

public abstract class Bindings {
    private Bindings() { /* Private constructor */ }

    public static final GLFW glfw = Meta.cast(new GLFWFacade(), GLFW.class);
    public static final OpenAL openal = Meta.cast(new OpenALFacade(), OpenAL.class);
    public static final OpenGL opengl = Meta.cast(new OpenGLFacade(), OpenGL.class);

    public static final STBImage stbi = Meta.cast(new STBImageFacade(), STBImage.class);
    public static final STBVorbis stbv = Meta.cast(new STBVorbisFacade(), STBVorbis.class);

}
