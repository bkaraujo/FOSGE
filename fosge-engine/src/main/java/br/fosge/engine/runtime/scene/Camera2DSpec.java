package br.fosge.engine.runtime.scene;

import br.fosge.annotation.Specification;

public record Camera2DSpec (
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

}
