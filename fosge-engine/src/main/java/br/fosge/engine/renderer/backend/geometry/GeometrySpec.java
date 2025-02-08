package br.fosge.engine.renderer.backend.geometry;

import br.fosge.commons.annotation.Specification;
import br.fosge.engine.renderer.backend.DataType;
import br.fosge.engine.renderer.backend.DrawMode;

public record GeometrySpec(
        DrawMode mode,
        DataType indexType,
        BufferLayout ... layouts
) implements Specification {
}
