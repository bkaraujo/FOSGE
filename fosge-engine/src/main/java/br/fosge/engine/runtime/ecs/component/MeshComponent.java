package br.fosge.engine.runtime.ecs.component;

import br.fosge.Logger;
import br.fosge.engine.configuration.Tuple;
import br.fosge.engine.ecs.Component;
import br.fosge.engine.ecs.ComponentType;
import br.fosge.engine.graphics.*;
import br.fosge.engine.graphics.geometry.BufferLayout;
import br.fosge.engine.graphics.geometry.BufferType;
import br.fosge.engine.graphics.geometry.GeometrySpec;
import br.fosge.engine.graphics.shader.ShaderSpec;
import br.fosge.engine.runtime.Graphics;
import br.fosge.engine.runtime.Resources;

import java.util.ArrayList;

public final class MeshComponent extends Component {
    public static final ComponentType type = ComponentType.MESH_COMPONENT;

    public Shader shader;
    public Geometry geometry;
    public Texture texture;

    private MeshComponent() {}

    public static MeshComponent create(Tuple ... properties) {
        final var instance = new MeshComponent();
        instance.shader = Graphics.shader();
        if (!instance.shader.initialize() || !instance.shader.configure(
                new ShaderSpec(
                        Resources.shaderSource(find("shader.source", properties))
                )
        )) {
            Logger.error("Failed to configure shader source");
            instance.terminate();
            return null;
        }

        instance.texture = Resources.texture2d(find("texture.asset", properties));
        if (instance.texture == null) {
            Logger.error("Failed to configure texture");
            instance.terminate();
            return null;
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

        instance.geometry = Graphics.geometry();
        if (!instance.geometry.initialize() || !instance.geometry.configure(
                new GeometrySpec(
                        DrawMode.valueOf(find("geometry.mode", properties)),
                        DataType.valueOf(find("geometry.type", properties)),
                        layouts.toArray(new BufferLayout[0])
                )
        )) {
            Logger.warn("Failed to configure geometry");
            instance.terminate();
            return null;
        }

        instance.geometry.elements(toInts("geometry.elements", properties));
        instance.geometry.vertices(toFloats("geometry.vertices", properties));

        return instance;
    }

    @Override
    public boolean terminate() {
        if (shader != null) { shader.terminate(); shader = null; }
        if (texture != null) { texture.terminate(); texture = null; }
        if (geometry != null) { geometry.terminate(); geometry = null; }

        return true;
    }
}
