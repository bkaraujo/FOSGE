package br.fosge.sandbox.pong;

import br.fosge.RT;
import br.fosge.engine.Input;
import br.fosge.engine.ecs.BehaviourComponent;
import br.fosge.engine.input.Keyboard;

public final class PlayerController extends BehaviourComponent {

    @Override
    public void onUpdate(double delta) {
        if (Input.released(Keyboard.KEY_ESCAPE)) {
            RT.running = false;
        }
    }
}
