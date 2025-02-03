package br.fosge.engine.runtime.ecs.system;

import br.fosge.engine.ecs.ECS;
import br.fosge.engine.ecs.System;
import br.fosge.engine.graphics.Shader;
import br.fosge.engine.runtime.ecs.component.MeshComponent;
import br.fosge.engine.runtime.ecs.component.TransformComponent;

import java.util.*;

import static br.fosge.RT.Application.scene;
import static br.fosge.RT.yaml;
import static br.fosge.engine.runtime.Platform.graphics;

public final class RenderSystem implements System {
    private final Map<Shader, SortedSet<MeshComponent>> ofShaders = new HashMap<>();

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
        // 1 - Sort by draw order

        // 2 - Sort by Shader

        for (final var mesh : ECS.list(MeshComponent.class)) {
            ofShaders.computeIfAbsent(mesh.shader, ignored -> new TreeSet<>((o1, o2) -> {
                final var t1 = ECS.get(o1.owner, TransformComponent.class);
                final var t2 = ECS.get(o2.owner, TransformComponent.class);

                if (t1.position.z == t2.position.z) return 0;
                if (t1.position.z > t2.position.z) return 1;

                return -1;
            }));
            ofShaders.get(mesh.shader).add(mesh);
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
