package br.fosge.runtime.scene;

import br.fosge.annotation.Lifecycle;
import br.fosge.graphics.Geometry;
import br.fosge.graphics.geometry.GeometrySpec;
import br.fosge.renderer.Transform;
import br.fosge.runtime.Graphics;

public record Actor (
        Transform transform,
        Geometry geometry
) implements Lifecycle {
    public static Actor create() {
        return new Actor(Transform.origin(), Graphics.geometry());
    }

    @Override
    public boolean initialize() {
        return geometry.initialize();
    }

    public boolean configure(GeometrySpec spec) {
        return geometry.configure(spec);
    }



    @Override
    public boolean terminate() {
        return geometry.terminate();
    }
}
