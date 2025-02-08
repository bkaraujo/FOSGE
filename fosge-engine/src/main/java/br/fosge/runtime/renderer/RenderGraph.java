package br.fosge.runtime.renderer;

import br.fosge.engine.renderer.backend.Shader;
import br.fosge.runtime.renderer.frontend.Mesh;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public record RenderGraph (
        Matrix4fc viewProjection,
        Map<Shader, List<Mesh>> ofShader
) {
    public RenderGraph(Matrix4fc viewProjection) {
        this(
                new Matrix4f(viewProjection),
                new HashMap<>()
        );
    }
}
