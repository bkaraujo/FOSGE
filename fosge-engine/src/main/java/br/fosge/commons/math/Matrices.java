package br.fosge.commons.math;

import org.joml.*;

public abstract class Matrices {
    private Matrices() {}

    public static final Matrix4fc M4_IDENTITY = new Matrix4f();

    public static float[] toArray(final Matrix2fc matrix) {
        return new float[] {
                matrix.m00(), matrix.m01(),
                matrix.m10(), matrix.m11()
        };
    }

    public static double[] toArray(final Matrix2dc matrix) {
        return new double[] {
                matrix.m00(), matrix.m01(),
                matrix.m10(), matrix.m11()
        };
    }

    public static float[] toArray(final Matrix3x2fc matrix) {
        return new float[] {
                matrix.m00(), matrix.m01(),
                matrix.m10(), matrix.m11(),
                matrix.m20(), matrix.m21()
        };
    }

    public static double[] toArray(final Matrix3x2dc matrix) {
        return new double[] {
                matrix.m00(), matrix.m01(),
                matrix.m10(), matrix.m11(),
                matrix.m20(), matrix.m21()
        };
    }

    public static float[] toArray(final Matrix3fc matrix) {
        return new float[] {
                matrix.m00(), matrix.m01(), matrix.m02(),
                matrix.m10(), matrix.m11(), matrix.m12(),
                matrix.m20(), matrix.m21(), matrix.m22()
        };
    }

    public static double[] toArray(final Matrix3dc matrix) {
        return new double[] {
                matrix.m00(), matrix.m01(), matrix.m02(),
                matrix.m10(), matrix.m11(), matrix.m12(),
                matrix.m20(), matrix.m21(), matrix.m22()
        };
    }

    public static float[] toArray(final Matrix4x3fc matrix) {
        return new float[] {
                matrix.m00(), matrix.m01(), matrix.m02(),
                matrix.m10(), matrix.m11(), matrix.m12(),
                matrix.m20(), matrix.m21(), matrix.m22(),
                matrix.m30(), matrix.m31(), matrix.m32()
        };
    }

    public static double[] toArray(final Matrix4x3dc matrix) {
        return new double[] {
                matrix.m00(), matrix.m01(), matrix.m02(),
                matrix.m10(), matrix.m11(), matrix.m12(),
                matrix.m20(), matrix.m21(), matrix.m22(),
                matrix.m30(), matrix.m31(), matrix.m32()
        };
    }

    public static float[] toArray(final Matrix4fc matrix) {
        return new float[] {
                matrix.m00(), matrix.m01(), matrix.m02(), matrix.m03(),
                matrix.m10(), matrix.m11(), matrix.m12(), matrix.m13(),
                matrix.m20(), matrix.m21(), matrix.m22(), matrix.m23(),
                matrix.m30(), matrix.m31(), matrix.m32(), matrix.m33()
        };
    }

    public static double[] toArray(final Matrix4dc matrix) {
        return new double[] {
                matrix.m00(), matrix.m01(), matrix.m02(), matrix.m03(),
                matrix.m10(), matrix.m11(), matrix.m12(), matrix.m13(),
                matrix.m20(), matrix.m21(), matrix.m22(), matrix.m23(),
                matrix.m30(), matrix.m31(), matrix.m32(), matrix.m33()
        };
    }

}
