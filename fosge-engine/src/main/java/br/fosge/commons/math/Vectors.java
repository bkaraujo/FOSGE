package br.fosge.commons.math;

import org.joml.*;

public abstract class Vectors {
    private Vectors(){}

    public static int[] toArray(final Vector2ic vector) {
        return new int[] { vector.x(), vector.y() };
    }

    public static int[] toArray(final Vector3ic vector) {
        return new int[] { vector.x(), vector.y(), vector.z() };
    }

    public static int[] toArray(final Vector4ic vector) {
        return new int[] { vector.x(), vector.y(), vector.z(), vector.w() };
    }

    public static long[] toArray(final Vector2Lc vector) {
        return new long[] { vector.x(), vector.y() };
    }

    public static long[] toArray(final Vector3Lc vector) {
        return new long[] { vector.x(), vector.y(), vector.z() };
    }

    public static long[] toArray(final Vector4Lc vector) {
        return new long[] { vector.x(), vector.y(), vector.z(), vector.w() };
    }

    public static float[] toArray(final Vector2fc vector) {
        return new float[] { vector.x(), vector.y() };
    }

    public static float[] toArray(final Vector3fc vector) {
        return new float[] { vector.x(), vector.y(), vector.z() };
    }

    public static float[] toArray(final Vector4fc vector) {
        return new float[] { vector.x(), vector.y(), vector.z(), vector.w() };
    }

    public static double[] toArray(final Vector2dc vector) {
        return new double[] { vector.x(), vector.y() };
    }

    public static double[] toArray(final Vector3dc vector) {
        return new double[] { vector.x(), vector.y(), vector.z() };
    }

    public static double[] toArray(final Vector4dc vector) {
        return new double[] { vector.x(), vector.y(), vector.z(), vector.w() };
    }

}
