package br.fosge.engine.graphics.geometry;

import br.fosge.engine.annotation.Specification;
import br.fosge.engine.graphics.DataType;
import br.fosge.engine.graphics.DrawMode;

public record GeometrySpec(
        DrawMode mode,
        DataType indexType,
        BufferLayout ... layouts
) implements Specification {
}
