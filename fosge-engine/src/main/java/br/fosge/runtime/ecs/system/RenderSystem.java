package br.fosge.runtime.ecs.system;

import br.fosge.engine.ecs.ECS;
import br.fosge.engine.ecs.System;
import br.fosge.engine.graphics.Shader;
import br.fosge.engine.renderer.MeshComponent;
import br.fosge.engine.renderer.TransformComponent;

import java.util.*;

import static br.fosge.RT.Application.scene;
import static br.fosge.RT.Platform.graphics;
import static br.fosge.RT.yaml;

public final class RenderSystem implements System {
    private final Map<Shader, List<MeshComponent>> ofShaders = new HashMap<>();

    private final String modelMatrix;
    private final String viewProjectionMatrix;

    public RenderSystem(){
        modelMatrix = yaml.contains("engine.renderer.modelMatrix") ?
                yaml.asString("engine.renderer.modelMatrix")
                : "un_model";

        viewProjectionMatrix = yaml.contains("engine.renderer.viewProjectionMatrix") ?
                yaml.asString("engine.renderer.viewProjectionMatrix")
                : "un_viewProjection";
    }

    @Override
    public void onAwake() {
        ofShaders.clear();
        // 1 - Sort by Shader
        for (final var mesh : ECS.list(MeshComponent.class)) {
            ofShaders
                    .computeIfAbsent(mesh.shader, ignored -> new ArrayList<>())
                    .add(mesh);

        }

        // 2 - Sort by z-index
        for (final var shader : ofShaders.keySet()) {
            ofShaders.get(shader).sort((m1, m2) -> {
                final var t1 = ECS.get(m1.owner, TransformComponent.class);
                final var t2 = ECS.get(m2.owner, TransformComponent.class);

                return Float.compare(t1.position.z, t2.position.z);
            });
        }
    }

    @Override
    public void onRest() {
        for(final var entry : ofShaders.entrySet()) {
            final var shader = entry.getKey();
            shader.bind();
            shader.uniform(viewProjectionMatrix, scene.camera().viewProjectionMatrix());

            for (final var mesh : entry.getValue()) {
                final var transform = ECS.get(mesh.owner, TransformComponent.class);
                shader.uniform(modelMatrix, transform.matrix());

                mesh.geometry.bind();
                for (int i = 0 ; i < mesh.textures.size() ; ++i) {
                    mesh.textures.get(i).bind(i);
                }

                graphics.draw(mesh.geometry);
            }
        }
    }
}
