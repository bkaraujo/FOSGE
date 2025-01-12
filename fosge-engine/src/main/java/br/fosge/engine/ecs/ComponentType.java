package br.fosge.engine.ecs;

import br.fosge.engine.runtime.ecs.component.AudioSourceComponent;
import br.fosge.engine.runtime.ecs.component.BehaviourComponent;
import br.fosge.engine.runtime.ecs.component.MeshComponent;
import br.fosge.engine.runtime.ecs.component.TransformComponent;

public enum ComponentType {
    TRANSFORM_COMPONENT(TransformComponent.class),
    MESH_COMPONENT(MeshComponent.class),
    AUDIO_SOURCE_COMPONENT(AudioSourceComponent.class),
    BEHAVIOUR_COMPONENT(BehaviourComponent.class);

    public final Class<? extends Component> klass;
    ComponentType(Class<? extends Component> klass) {
        this.klass = klass;
    }
}
