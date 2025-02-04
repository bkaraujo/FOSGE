package br.fosge.engine.runtime.ecs.component;

import br.fosge.commons.Logger;
import br.fosge.commons.Strings;
import br.fosge.commons.Tuple;
import br.fosge.engine.Resources;
import br.fosge.engine.ecs.Component;
import br.fosge.engine.graphics.*;
import br.fosge.engine.graphics.geometry.BufferLayout;
import br.fosge.engine.graphics.geometry.BufferType;
import br.fosge.engine.graphics.geometry.GeometrySpec;
import br.fosge.engine.graphics.texture.PixelFormat;
import br.fosge.engine.graphics.texture.TextureSpec;

import java.util.ArrayList;
import java.util.List;

import static br.fosge.RT.Graphics.textureUnitLimit;
import static br.fosge.engine.runtime.Platform.filesystem;

public final class MeshComponent extends Component {

    public Shader shader;
    public Geometry geometry;
    public final List<Texture> textures = new ArrayList<>(textureUnitLimit);

    private MeshComponent() {}

    public static MeshComponent create(Tuple... properties) {
        final var instance = new MeshComponent();
        // ###################################################################
        //
        // SHADER
        //
        // ###################################################################
        instance.shader = Resources.shader(find("shader", properties));
        if (instance.shader == null) {
            Logger.error("Failed to configure shader");
            instance.terminate();
            return null;
        }

        Logger.trace("Attaching shader: %s", instance.shader);
        // ###################################################################
        //
        // TEXTURE
        //
        // ###################################################################
        for (int i = 0; i < textureUnitLimit; i++) {
            // Expect bind unit to be contiguous
            if (!contains("texture." + i + ".asset", properties)) { break; }

            final var texturePath = find("texture." + i + ".asset", properties);
            if (texturePath == null) {
                Logger.error("Missing property [texture.<id>.asset].");
                instance.terminate();
                return null;
            }

            final var textureMips = find("texture." + i + ".mips", properties);
            final var textureFormat = find("texture." + i + ".format", properties);
            if (textureFormat == null) {
                Logger.error("Missing property [texture.<id>.format]: %s.", texturePath);
                instance.terminate();
                return null;
            }

            final var textureStorageFormat = find("texture." + i + ".storageFormat", properties);
            if (textureStorageFormat == null) {
                Logger.error("Missing property [texture.<id>.storageFormat]: %s.", texturePath);
                instance.terminate();
                return null;
            }

            final var texture = Resources.texture2d(new TextureSpec(
                    filesystem.assets.resolve(texturePath),
                    textureMips != null ? Integer.parseInt(textureMips) : 1,
                    PixelFormat.valueOf(textureFormat),
                    PixelFormat.valueOf(textureStorageFormat)
            ));

            if (texture == null) {
                Logger.error("Failed to configure texture");
                instance.terminate();
                return null;
            }

            Logger.trace("Attaching texture: %s", texture);
            instance.textures.add(texture);
        }
        // ###################################################################
        //
        // GEOMETRY
        //
        // ###################################################################
        final var primitive = find("geometry.primitive", properties);
        if (instance.geometry == null && primitive == null) {
            final var layouts = new ArrayList<BufferLayout>();
            for (final var tuple : properties) {
                if (tuple.name().startsWith("geometry.layout")) {
                    layouts.add(new BufferLayout(
                            tuple.name().substring(tuple.name().lastIndexOf('.') + 1),
                            BufferType.valueOf(tuple.value())
                    ));
                }
            }

            instance.geometry = Resources.geometry(new GeometrySpec(
                    DrawMode.valueOf(find("geometry.mode", properties)),
                    DataType.valueOf(find("geometry.type", properties)),
                    layouts.toArray(new BufferLayout[0])
            ));

            if (instance.geometry == null) {
                Logger.error("Failed to configure texture");
                instance.terminate();
                return null;
            }

            Logger.trace("Attaching geometry: %s", instance.geometry);
            instance.geometry.elements(Strings.ints(find("geometry.elements", properties)));
            instance.geometry.vertices(Strings.floats(find("geometry.vertices", properties)));
        }

        if (instance.geometry == null && "quadrilateral".equals(primitive)) {
            instance.geometry = Primitives.quadrilateral();
        }

        return instance;
    }

    @Override
    public boolean terminate() {
        if (shader != null) { shader.terminate(); shader = null; }
        if (geometry != null) { geometry.terminate(); geometry = null; }
        for (final var texture : textures) { texture.terminate(); }
        textures.clear();

        return true;
    }
}
