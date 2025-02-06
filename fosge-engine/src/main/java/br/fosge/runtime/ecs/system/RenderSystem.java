package br.fosge.runtime.ecs.system;

import br.fosge.commons.Tasks;
import br.fosge.engine.ecs.ECS;
import br.fosge.engine.ecs.System;
import br.fosge.engine.graphics.MeshComponent;
import br.fosge.engine.graphics.Shader;
import br.fosge.engine.renderer.TransformComponent;
import br.fosge.engine.renderer.frontend.CameraComponent;
import org.joml.Matrix4f;
import org.joml.Vector3f;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static br.fosge.RT.Application.scene;
import static br.fosge.RT.Platform.graphics;
import static br.fosge.RT.yaml;

public final class RenderSystem implements System {
    private final Map<Shader, List<MeshComponent>> ofShaders = new HashMap<>();

    private final String modelMatrixName;
    private final String viewProjectionMatrixName;

    private final Vector3f cameraPos = new Vector3f();
    private final Vector3f cameraRot = new Vector3f(-1 ,-1, -1);
    private final Matrix4f viewProjectionMatrix = new Matrix4f();

    public RenderSystem(){
        modelMatrixName = yaml.contains("engine.renderer.modelMatrix") ?
                yaml.asString("engine.renderer.modelMatrix")
                : "un_model";

        viewProjectionMatrixName = yaml.contains("engine.renderer.viewProjectionMatrix") ?
                yaml.asString("engine.renderer.viewProjectionMatrix")
                : "un_viewProjection";
    }

    @Override
    public void onAwake() {
        Tasks.platform(() ->{
            final var camera = scene.camera();
            if (!camera.transform().position.equals(cameraPos) || !camera.transform().rotation.equals(cameraRot)) {
                cameraPos.set(camera.transform().position);
                cameraRot.set(camera.transform().rotation);

                final var component = camera.get(CameraComponent.class);
                viewProjectionMatrix
                        .set(component.projection)
                        .mul(component.view
                                .translate(cameraPos)
                                .rotateZ(cameraRot.z)
                                .invert()
                        );
            }
        });

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
                final var t1 = m1.owner.get(TransformComponent.class);
                final var t2 = m2.owner.get(TransformComponent.class);

                return Float.compare(t1.position.z, t2.position.z);
            });
        }
    }

    @Override
    public void onRest() {
        for(final var entry : ofShaders.entrySet()) {
            final var shader = entry.getKey();
            shader.bind();
            shader.uniform(viewProjectionMatrixName, viewProjectionMatrix);

            for (final var mesh : entry.getValue()) {
                final var transform = mesh.owner.get(TransformComponent.class);
                shader.uniform(modelMatrixName, transform.matrix());

                mesh.geometry.bind();
                for (int i = 0 ; i < mesh.textures.size() ; ++i) {
                    mesh.textures.get(i).bind(i);
                }

                graphics.draw(mesh.geometry);
            }
        }
    }
}
