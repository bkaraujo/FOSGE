package br.fosge.sandbox.pong;

import br.fosge.RT;
import br.fosge.commons.Tuple;
import br.fosge.engine.ecs.BehaviourComponent;
import br.fosge.engine.ecs.ComponentType;
import br.fosge.engine.ecs.ECS;
import br.fosge.engine.input.Keyboard;
import br.fosge.engine.renderer.TransformComponent;
import br.fosge.runtime.Input;
import com.github.f4b6a3.ulid.Ulid;

import java.util.ArrayList;
import java.util.List;

public final class EnvironmentController extends BehaviourComponent {
    final List<Ulid> enemies = new ArrayList<>();

    @Override
    public boolean initialize() {
        for (int i = 0 ; i < 1 ; ++i) {
            for (int j = 0 ; j < 1 ; ++j) {
                final var enemy = ECS.entity();
                enemies.add(enemy);

                ECS.attach(enemy, TransformComponent.class,
//                        new Tuple("position", "shader/default.glsl"),
                        new Tuple("scale", "4, 2, 0")
                );

                ECS.attach(enemy, ComponentType.MESH_COMPONENT,
                        new Tuple("shader", "shader/default.glsl"),
                        new Tuple("texture.0.asset", "texture/block.png"),
                        new Tuple("texture.0.dataType", "UBYTE"),
                        new Tuple("texture.0.storageFormat", "RGB8"),
                        new Tuple("texture.0.format", "RGB"),
                        new Tuple("texture.0.mips", "1"),
                        new Tuple("geometry.primitive", "quadrilateral")
                );
            }
        }

        return super.initialize();
    }

    @Override
    public void onUpdate(double delta) {
        if (Input.released(Keyboard.KEY_ESCAPE)) {
            RT.running = false;
        }
    }
}
