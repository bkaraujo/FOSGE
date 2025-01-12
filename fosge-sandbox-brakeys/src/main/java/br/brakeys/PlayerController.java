package br.brakeys;

import br.fosge.commons.MessageBus;
import br.fosge.engine.input.Keyboard;
import br.fosge.engine.platform.window.WindowClosedEvent;
import br.fosge.engine.runtime.Input;
import br.fosge.engine.runtime.ecs.ECS;
import br.fosge.engine.runtime.ecs.component.AudioSourceComponent;
import br.fosge.engine.runtime.ecs.component.BehaviourComponent;
import br.fosge.engine.runtime.ecs.component.TransformComponent;

public class PlayerController extends BehaviourComponent {
    private AudioSourceComponent audioSource;
    private TransformComponent transform;
    public float speed;

    @Override
    public void onAwake() {
        if (transform == null) {
            transform = ECS.get(owner, TransformComponent.class);
        }

        if (audioSource == null) {
            audioSource = ECS.get(owner, AudioSourceComponent.class);
            audioSource.source.gain(.3f);
        }
    }

    @Override
    public void onSimulate(double step) {
        if (Input.active(Keyboard.KEY_D)) { transform.position.add((float) (speed * step), 0f, 0f); }
        if (Input.active(Keyboard.KEY_A)) { transform.position.add((float) (-speed * step), 0f, 0f); }
        if (Input.active(Keyboard.KEY_W)) { transform.position.add(0f, (float) (speed * step), 0f); }
        if (Input.active(Keyboard.KEY_S)) { transform.position.add(0f, (float) (-speed * step), 0f); }
    }

    @Override
    public void onUpdate(double delta) {
        if (Input.released(Keyboard.KEY_ESCAPE)) {
            MessageBus.submit(new WindowClosedEvent());
        }

        if (Input.released(Keyboard.KEY_SPACE)) {
            audioSource.source.play();
        }
    }
}
