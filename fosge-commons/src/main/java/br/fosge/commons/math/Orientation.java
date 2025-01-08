package br.fosge.commons.math;

import org.joml.Vector3f;
import org.joml.Vector3fc;

public abstract class Orientation {
    private Orientation() { /* Private constructor */ }

    public static final Vector3fc UP = new Vector3f(0, 1, 0);
    public static final Vector3fc RIGHT = new Vector3f(1, 0, 0);
    public static final Vector3fc FORWARD = new Vector3f(0, 0, -1);

}
