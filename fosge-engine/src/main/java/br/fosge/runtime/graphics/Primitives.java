package br.fosge.runtime.graphics;

import br.fosge.commons.Logger;
import br.fosge.engine.graphics.DataType;
import br.fosge.engine.graphics.DrawMode;
import br.fosge.engine.graphics.Geometry;
import br.fosge.runtime.Resources;
import br.fosge.engine.graphics.geometry.BufferLayout;
import br.fosge.engine.graphics.geometry.BufferType;
import br.fosge.engine.graphics.geometry.GeometrySpec;

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
                 0.5f,  0.5f, 0.0f, 1.0f, 1.0f,
                 0.5f, -0.5f, 0.0f, 1.0f, 0.0f,
                -0.5f, -0.5f, 0.0f, 0.0f, 0.0f,
                -0.5f,  0.5f, 0.0f, 0.0f, 1.0f
        );

        return geometry;
    }

}
