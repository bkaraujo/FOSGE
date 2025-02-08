package br.fosge.engine.renderer;

import br.fosge.engine.renderer.backend.Geometry;
import br.fosge.engine.renderer.backend.Shader;
import br.fosge.engine.renderer.backend.Texture;

import java.util.List;

public record RenderCommand (
        Shader shader,
        Geometry geometry,
        List<Texture> textures
) {}
