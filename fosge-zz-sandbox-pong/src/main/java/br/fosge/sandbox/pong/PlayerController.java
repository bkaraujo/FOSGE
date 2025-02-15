package br.fosge.sandbox.pong;

import br.fosge.engine.Input;
import br.fosge.engine.ecs.BehaviourComponent;
import br.fosge.engine.input.Keyboard;

public final class PlayerController extends BehaviourComponent {
    public float speed;

    @Override
    public void onUpdate(double delta) {
        final var offset = 0.4f;

        if (Input.active(Keyboard.KEY_D)) {
            transform.position.x += (float) (speed * delta);
            if (transform.position.x >= offset) { transform.position.x = -offset; }
        }

        if (Input.active(Keyboard.KEY_A)) {
            transform.position.x -= (float) (speed * delta);
            if (transform.position.x < -offset) { transform.position.x = offset; }
        }
    }
}
