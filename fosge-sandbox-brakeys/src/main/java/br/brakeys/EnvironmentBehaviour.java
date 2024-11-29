package br.brakeys;

import br.fosge.Time;
import br.fosge.engine.ecs.ComponentType;
import br.fosge.engine.runtime.ecs.ECS;
import br.fosge.engine.runtime.ecs.component.BehaviourComponent;

public class EnvironmentBehaviour extends BehaviourComponent {
    private long start;
    @Override
    public boolean initialize() {
        start = Time.millis();
        return true;
    }

    @Override
    public void onUpdate(double delta) {
        if (Time.millis() - start > 5_000) {
            if( ECS.get(owner, ComponentType.AUDIO_SOURCE_COMPONENT) != null) {
                ECS.detach(owner, ComponentType.AUDIO_SOURCE_COMPONENT);
            }
        }
    }
}
