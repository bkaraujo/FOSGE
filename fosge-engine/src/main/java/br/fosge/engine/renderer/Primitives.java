package br.fosge.engine.renderer;

import br.fosge.commons.Logger;
import br.fosge.engine.Resources;
import br.fosge.engine.renderer.backend.DataType;
import br.fosge.engine.renderer.backend.DrawMode;
import br.fosge.engine.renderer.backend.Geometry;
import br.fosge.engine.renderer.backend.geometry.BufferLayout;
import br.fosge.engine.renderer.backend.geometry.BufferType;
import br.fosge.engine.renderer.backend.geometry.GeometrySpec;

public abstract class Primitives {
    private Primitives(){}

    public static Geometry quadrilateral() {
        final var geometry = Resources.geometry(new GeometrySpec(
                DrawMode.TRIANGLE,
                DataType.UINT,
                new BufferLayout("in_position", BufferType.FLOAT3),
                new BufferLayout("in_uv", BufferType.FLOAT2)
        ));

        if (geometry == null) {
            Logger.error("Failed to configure texture");
            return null;
        }

        geometry.elements(
                0, 1, 3,
                1, 2, 3
        );

        geometry.vertices(
                 1.0f,  1.0f, 0.0f, 1.0f, 1.0f,
                 1.0f, -1.0f, 0.0f, 1.0f, 0.0f,
                -1.0f, -1.0f, 0.0f, 0.0f, 0.0f,
                -1.0f,  1.0f, 0.0f, 0.0f, 1.0f
        );

        return geometry;
    }

}
