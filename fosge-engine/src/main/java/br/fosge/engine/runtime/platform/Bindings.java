package br.fosge.engine.runtime.platform;

import br.fosge.engine.runtime.platform.binding.glfw.GLFW;
import br.fosge.engine.runtime.platform.binding.openal.OpenAL;
import br.fosge.engine.runtime.platform.binding.opengl.OpenGL;
import br.fosge.engine.runtime.platform.binding.stb.api.STBImage;
import br.fosge.engine.runtime.platform.binding.stb.api.STBVorbis;
import br.fosge.tools.Meta;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public abstract class Bindings {
    private Bindings() { /* Private constructor */ }

    public static final br.fosge.engine.runtime.platform.binding.GLFW glfw = Meta.cast(new GLFW(), br.fosge.engine.runtime.platform.binding.GLFW.class);
    public static final br.fosge.engine.runtime.platform.binding.OpenAL openal = Meta.cast(new OpenAL(), br.fosge.engine.runtime.platform.binding.OpenAL.class);
    public static final br.fosge.engine.runtime.platform.binding.OpenGL opengl = Meta.cast(new OpenGL(), br.fosge.engine.runtime.platform.binding.OpenGL.class);

    public static final STBImage stbi = Meta.cast(new br.fosge.engine.runtime.platform.binding.stb.STBImage(), STBImage.class);
    public static final STBVorbis stbv = Meta.cast(new br.fosge.engine.runtime.platform.binding.stb.STBVorbis(), STBVorbis.class);

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
