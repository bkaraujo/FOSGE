package br.fosge.engine.ecs;

import br.fosge.commons.Tuple;
import br.fosge.commons.annotation.Factory;
import br.fosge.engine.audio.AudioSourceComponent;
import br.fosge.engine.physics.RigidBodyComponent;
import br.fosge.engine.physics.SoftBodyComponent;
import br.fosge.engine.renderer.MeshComponent;
import br.fosge.engine.renderer.TransformComponent;

import javax.annotation.Nullable;

public interface ComponentFactory extends Factory {

    @Nullable NameComponent name(@Nullable Tuple ... properties);
    @Nullable MeshComponent mesh(@Nullable Tuple ... properties);
    @Nullable SoftBodyComponent softBody(@Nullable Tuple ... properties);
    @Nullable TransformComponent transform(@Nullable Tuple ... properties);
    @Nullable RigidBodyComponent rigidBody(@Nullable Tuple ... properties);
    @Nullable BehaviourComponent behaviour(@Nullable Tuple ... properties);
    @Nullable AudioSourceComponent audioSource(@Nullable Tuple ... properties);

}
