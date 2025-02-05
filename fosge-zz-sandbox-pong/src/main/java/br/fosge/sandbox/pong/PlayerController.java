package br.fosge.sandbox.pong;

import br.fosge.runtime.Input;
import br.fosge.engine.ecs.BehaviourComponent;
import br.fosge.engine.input.Keyboard;

public final class PlayerController extends BehaviourComponent {
    public float speed;

    @Override
    public void onUpdate(double delta) {
        if (Input.active(Keyboard.KEY_D)) {
            transform.position.x += (float) (speed * delta);
            if (transform.position.x >= 0.35f) { transform.position.x = -0.35f; }
        }

        if (Input.active(Keyboard.KEY_A)) {
            transform.position.x -= (float) (speed * delta);
            if (transform.position.x < -0.35f) { transform.position.x = 0.35f; }
        }
    }
}
