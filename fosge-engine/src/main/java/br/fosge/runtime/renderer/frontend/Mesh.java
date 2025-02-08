package br.fosge.runtime.renderer.frontend;

import br.fosge.engine.renderer.backend.Geometry;
import br.fosge.engine.renderer.backend.Texture;
import org.joml.Matrix4fc;

import java.util.List;

public record Mesh (
        Matrix4fc model,
        Geometry geometry,
        List<Texture> textures
) {
}
