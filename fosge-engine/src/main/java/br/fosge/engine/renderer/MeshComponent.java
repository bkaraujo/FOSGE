package br.fosge.engine.renderer;

import br.fosge.RT;
import br.fosge.engine.ecs.Component;
import br.fosge.engine.graphics.Geometry;
import br.fosge.engine.graphics.Shader;
import br.fosge.engine.graphics.Texture;

import java.util.ArrayList;
import java.util.List;

public final class MeshComponent extends Component {

    public Shader shader;
    public Geometry geometry;
    public final List<Texture> textures = new ArrayList<>(RT.Graphics.textureUnitLimit);

    @Override
    public boolean terminate() {
        if (shader != null) { shader.terminate(); shader = null; }
        if (geometry != null) { geometry.terminate(); geometry = null; }
        for (final var texture : textures) { texture.terminate(); }
        textures.clear();

        return true;
    }
}
