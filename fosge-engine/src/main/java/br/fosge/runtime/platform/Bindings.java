package br.fosge.runtime.platform;

import br.fosge.Meta;
import br.fosge.runtime.platform.binding.GLFW;
import br.fosge.runtime.platform.binding.OpenAL;
import br.fosge.runtime.platform.binding.OpenGL;
import br.fosge.runtime.platform.binding.stb.api.STBImage;
import br.fosge.runtime.platform.binding.stb.api.STBVorbis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public abstract class Bindings {
    private Bindings() { /* Private constructor */ }

    public static final GLFW glfw = Meta.cast(new br.fosge.runtime.platform.binding.glfw.GLFW(), GLFW.class);
    public static final OpenAL openal = Meta.cast(new br.fosge.runtime.platform.binding.openal.OpenAL(), OpenAL.class);
    public static final OpenGL opengl = Meta.cast(new br.fosge.runtime.platform.binding.opengl.OpenGL(), OpenGL.class);

    public static final STBImage stbi = Meta.cast(new br.fosge.runtime.platform.binding.stb.STBImage(), STBImage.class);
    public static final STBVorbis stbv = Meta.cast(new br.fosge.runtime.platform.binding.stb.STBVorbis(), STBVorbis.class);

    private static <T> T proxy(Class<T> klass, InvocationHandler handler) {
        return Meta.cast(
                Proxy.newProxyInstance(
                        klass.getClassLoader(),
                        new Class[]{klass},
                        handler
                ),
                klass
        );
    }
}
