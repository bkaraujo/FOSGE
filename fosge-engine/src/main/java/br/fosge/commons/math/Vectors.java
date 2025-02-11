package br.fosge.commons.math;

import org.joml.Vector2fc;
import org.joml.Vector3fc;
import org.joml.Vector4fc;

public abstract class Vectors {
    private Vectors(){}

    public static float[] toArray(final Vector2fc vector) {
        return new float[] { vector.x(), vector.y() };
    }

    public static float[] toArray(final Vector3fc vector) {
        return new float[] { vector.x(), vector.y(), vector.z() };
    }

    public static float[] toArray(final Vector4fc vector) {
        return new float[] { vector.x(), vector.y(), vector.z(), vector.w() };
    }

}
