package br.fosge.engine.ecs;

import br.fosge.commons.Meta;
import br.fosge.engine.audio.AudioSourceComponent;
import br.fosge.engine.physics.RigidBodyComponent;
import br.fosge.engine.physics.SoftBodyComponent;
import br.fosge.engine.renderer.MeshComponent;
import br.fosge.engine.renderer.TransformComponent;

public enum ComponentType {
    TRANSFORM_COMPONENT(TransformComponent.class),
    MESH_COMPONENT(MeshComponent.class),
    AUDIO_SOURCE_COMPONENT(AudioSourceComponent.class),
    BEHAVIOUR_COMPONENT(BehaviourComponent.class),
    RIGID_BODY_COMPONENT(RigidBodyComponent.class),
    SOFT_BODY_COMPONENT(SoftBodyComponent.class),
    NAME_COMPONENT(NameComponent.class);

    public final Class<? extends Component> klass;
    ComponentType(Class<? extends Component> desired) {
        klass = desired;
    }

    public static ComponentType valueOf(Class<? extends Component> klass) {
        for (final var type : ComponentType.values()) {
            if (Meta.assignable(klass, type.klass)) {
                return type;
            }
        }

        return null;
    }
}
