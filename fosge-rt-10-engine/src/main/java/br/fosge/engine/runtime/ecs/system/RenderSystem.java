package br.fosge.engine.runtime.ecs.system;

import br.fosge.RT;
import br.fosge.engine.Graphics;
import br.fosge.engine.ecs.ECS;
import br.fosge.engine.ecs.System;
import br.fosge.engine.runtime.ecs.component.MeshComponent;
import br.fosge.engine.runtime.ecs.component.TransformComponent;
import org.joml.Matrix4f;

import java.util.ArrayList;
import java.util.List;

public final class RenderSystem implements System {
    private final List<MeshComponent> meshes = new ArrayList<>();

    private final String modelMatrix;
    private final String viewProjectionMatrix;

    public RenderSystem(){
        modelMatrix = RT.yaml.contains("engine.renderer.modelMatrix") ?
                RT.yaml.asString("engine.renderer.modelMatrix")
                : "un_model";

        viewProjectionMatrix = RT.yaml.contains("engine.renderer.viewProjectionMatrix") ?
                RT.yaml.asString("engine.renderer.viewProjectionMatrix")
                : "un_viewProjection";

    }

    @Override
    public void onAwake() {
        meshes.clear();
        meshes.addAll(ECS.list(MeshComponent.class));
    }

    @Override
    public void onRest() {
        for(final var mesh : meshes) {
            final var transform = ECS.get(mesh.owner, TransformComponent.class);
            mesh.shader.uniform(modelMatrix, transform.matrix());
//            mesh.shader.uniform(viewProjectionMatrix, actor.layer.scene.camera.viewProjectionMatrix());
            mesh.shader.uniform(viewProjectionMatrix, new Matrix4f());

            Graphics.draw(
                    mesh.shader,
                    mesh.geometry,
                    mesh.texture
            );
        }
    }
}
