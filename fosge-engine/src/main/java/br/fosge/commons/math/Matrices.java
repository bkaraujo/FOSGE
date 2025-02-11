package br.fosge.commons.math;

import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public abstract class Matrices {
    private Matrices() {}

    public static final Matrix4fc M4_IDENTITY = new Matrix4f();

    public static float[] toArray(final Matrix4fc matrix) {
        return new float[] {
                matrix.m00(), matrix.m01(), matrix.m02(), matrix.m03(),
                matrix.m10(), matrix.m11(), matrix.m12(), matrix.m13(),
                matrix.m20(), matrix.m21(), matrix.m22(), matrix.m23(),
                matrix.m30(), matrix.m31(), matrix.m32(), matrix.m33()
        };
    }

}
