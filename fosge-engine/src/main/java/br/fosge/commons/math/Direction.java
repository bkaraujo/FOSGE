package br.fosge.commons.math;

import org.joml.Vector3f;
import org.joml.Vector3fc;

public enum Direction {
    UP          (new Vector3f( 0,  1,  0)),
    DOWN        (new Vector3f( 0, -1,  0)),
    LEFT        (new Vector3f(-1,  0,  0)),
    RIGHT       (new Vector3f( 1,  0,  0)),
    FORWARD     (new Vector3f( 0,  0, -1)),
    BACKWARD    (new Vector3f( 0,  0,  1));

    public final Vector3fc vector;
    Direction(Vector3fc vector) {
        this.vector = vector;
    }
}
