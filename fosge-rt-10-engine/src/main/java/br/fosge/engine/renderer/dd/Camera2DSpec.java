package br.fosge.engine.renderer.dd;

import br.fosge.commons.annotation.Specification;

public record Camera2DSpec(
    float left,
    float right,
    float bottom,
    float top,
    float near,
    float far
) implements Specification {

    public Camera2DSpec(float box, float z) {
        this(-box, box, -box, box, -z, z);
    }

    @Override
    public String toString() {
        return "Rectangle [left=" + left + ", right=" + right + ", bottom=" + bottom + ", top=" + top + "] Depth [near=" + near + ", far=" + far + "]";
    }
}
