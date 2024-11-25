package br.fosge.graphics.geometry;

import br.fosge.annotation.Specification;
import br.fosge.graphics.DataType;
import br.fosge.graphics.DrawMode;

public record GeometrySpec(
        DrawMode mode,
        DataType indexType,
        BufferLayout ... layouts
) implements Specification {
}
