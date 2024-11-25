package br.fosge.renderer;

import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;

public record Transform(
        Vector3f position,
        Vector3f rotation,
        Vector3f scale
) {
    public static Transform origin() {
        return new Transform(
                new Vector3f(0, 0, 0),
                new Vector3f(0, 0, 0),
                new Vector3f(1, 1, 1)
        );
    }

    public Matrix4fc matrix() {
        return new Matrix4f()
                .rotateXYZ(rotation)
                .scale(scale)
                .translate(position);
    }

    public void identity() {
        position.set(0,0,0);
        rotation.set(0, 0, 0);
        scale.set(1, 1, 1);
    }
}
