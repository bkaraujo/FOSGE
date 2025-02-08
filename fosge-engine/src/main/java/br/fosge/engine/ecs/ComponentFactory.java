package br.fosge.engine.ecs;

import br.fosge.commons.Tuple;
import br.fosge.commons.annotation.Factory;
import br.fosge.engine.audio.AudioSourceComponent;
import br.fosge.engine.physics.RigidBodyComponent;
import br.fosge.engine.physics.SoftBodyComponent;
import br.fosge.engine.renderer.TransformComponent;
import br.fosge.engine.renderer.frontend.CameraComponent;
import br.fosge.engine.renderer.frontend.MeshComponent;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface ComponentFactory extends Factory {

    @Nonnull    NameComponent           name        (@Nullable Tuple ... properties);
    @Nullable   MeshComponent           mesh        (@Nullable Tuple ... properties);
    @Nullable   CameraComponent         camera      (@Nullable Tuple ... properties);
    @Nonnull    SoftBodyComponent       softBody    (@Nullable Tuple ... properties);
    @Nonnull    TransformComponent      transform   (@Nullable Tuple ... properties);
    @Nonnull    RigidBodyComponent      rigidBody   (@Nullable Tuple ... properties);
    @Nullable   BehaviourComponent      behaviour   (@Nullable Tuple ... properties);
    @Nullable   AudioSourceComponent    audioSource (@Nullable Tuple ... properties);

}
