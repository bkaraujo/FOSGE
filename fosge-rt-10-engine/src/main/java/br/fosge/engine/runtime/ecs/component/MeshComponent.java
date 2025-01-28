package br.fosge.engine.runtime.ecs.component;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.commons.Tuple;
import br.fosge.engine.Resources;
import br.fosge.engine.ecs.Component;
import br.fosge.engine.graphics.*;
import br.fosge.engine.graphics.geometry.BufferLayout;
import br.fosge.engine.graphics.geometry.BufferType;
import br.fosge.engine.graphics.geometry.GeometrySpec;
import br.fosge.engine.runtime.ecs.ComponentType;

import java.util.ArrayList;
import java.util.List;

public final class MeshComponent extends Component {
    public static final ComponentType type = ComponentType.MESH_COMPONENT;

    public Shader shader;
    public Geometry geometry;
    public final List<Texture> textures = new ArrayList<>(RT.Graphics.textureUnitLimit);

    private MeshComponent() {}

    public static MeshComponent create(Tuple... properties) {
        final var instance = new MeshComponent();

        instance.shader = Resources.shader(find("shader", properties));
        if (instance.shader == null) {
            Logger.error("Failed to configure shader");
            instance.terminate();
            return null;
        }

        Logger.trace("Attaching shader: %s", instance.shader);

        for (int i = 0; i < RT.Graphics.textureUnitLimit; i++) {
            final var candidate = find("texture." + i + ".asset", properties);
            // Expect bind unit to be contiguous
            if (candidate == null) { break; }

            final var texture = Resources.texture2d(candidate);
            if (texture == null) {
                Logger.error("Failed to configure texture");
                instance.terminate();
                return null;
            }

            Logger.trace("Attaching texture: %s", texture);
            instance.textures.add(texture);
        }

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
        instance.geometry.elements(toInts("geometry.elements", properties));
        instance.geometry.vertices(toFloats("geometry.vertices", properties));

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
