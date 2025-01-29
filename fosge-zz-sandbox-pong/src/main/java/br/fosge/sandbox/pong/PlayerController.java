package br.fosge.sandbox.pong;

import br.fosge.engine.Input;
import br.fosge.engine.ecs.BehaviourComponent;
import br.fosge.engine.ecs.ECS;
import br.fosge.engine.input.Keyboard;
import br.fosge.engine.runtime.ecs.component.TransformComponent;

public final class PlayerController extends BehaviourComponent {
    public float speed;
    private TransformComponent transform;

    @Override
    public void onAwake() {
        transform = ECS.get(owner, TransformComponent.class);
    }

    @Override
    public void onUpdate(double delta) {
        if (Input.active(Keyboard.KEY_W)) { transform.position.y += (float) (speed * delta); }
        if (Input.active(Keyboard.KEY_S)) { transform.position.y -= (float) (speed * delta); }
        if (Input.active(Keyboard.KEY_D)) { transform.position.x += (float) (speed * delta); }
        if (Input.active(Keyboard.KEY_A)) { transform.position.x -= (float) (speed * delta); }
    }
}
