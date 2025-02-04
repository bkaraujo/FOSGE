package br.fosge.engine.runtime.ecs;

import br.fosge.engine.ecs.BehaviourComponent;
import br.fosge.engine.ecs.Component;
import br.fosge.engine.physics.RigidBodyComponent;
import br.fosge.engine.physics.SoftBodyComponent;
import br.fosge.engine.runtime.ecs.component.AudioSourceComponent;
import br.fosge.engine.runtime.ecs.component.MeshComponent;
import br.fosge.engine.runtime.ecs.component.TransformComponent;

public enum ComponentType {
    TRANSFORM_COMPONENT(TransformComponent.class),
    MESH_COMPONENT(MeshComponent.class),
    AUDIO_SOURCE_COMPONENT(AudioSourceComponent.class),
    BEHAVIOUR_COMPONENT(BehaviourComponent.class),
    RIGID_BODY_COMPONENT(RigidBodyComponent.class),
    SOFT_BODY_COMPONENT(SoftBodyComponent.class);

    public final Class<? extends Component> klass;
    ComponentType(Class<? extends Component> klass) {
        this.klass = klass;
    }
}
