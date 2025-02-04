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
            final var predicate = "texture." + i;

            // Expect bind unit to be contiguous
            if (!contains( predicate+ ".asset", properties)) { break; }

            final var path = find(predicate + ".asset", properties);
            if (path == null) {
                Logger.error("Missing property [texture.<id>.asset].");
                instance.terminate();
                return null;
            }

            final var txMips = find(predicate+ ".mips", properties);
            final var txFormat = find(predicate + ".format", properties);
            if (txFormat == null) {
                Logger.error("Missing property [texture.<id>.format]: %s.", path);
                instance.terminate();
                return null;
            }

            final var txStorageFormat = find(predicate + ".storageFormat", properties);
            if (txStorageFormat == null) {
                Logger.error("Missing property [texture.<id>.storageFormat]: %s.", path);
                instance.terminate();
                return null;
            }

            final var txDataType = find(predicate + ".dataType", properties);
            if (txDataType == null) {
                Logger.error("Missing property [texture.<id>.dataType]: %s.", path);
                instance.terminate();
                return null;
            }

            final var texture = Resources.texture2d(new TextureSpec(
                    filesystem.assets.resolve(path),
                    txMips != null ? Integer.parseInt(txMips) : 1,
                    PixelFormat.valueOf(txFormat),
                    PixelFormat.valueOf(txStorageFormat),
                    DataType.valueOf(txDataType)
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
        switch (primitive) {
            case "quadrilateral": { instance.geometry = Primitives.quadrilateral(); } break;
            default: {
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

                instance.geometry.elements(Strings.ints(find("geometry.elements", properties)));
                instance.geometry.vertices(Strings.floats(find("geometry.vertices", properties)));
            }
        }

        if (instance.geometry == null) {
            Logger.error("Failed to configure geometry");
            instance.terminate();
            return null;
        }

        Logger.trace("Attaching geometry: %s", instance.geometry);
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
