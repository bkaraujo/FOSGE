package br.fosge.engine.ecs;

import br.fosge.commons.Tuple;
import br.fosge.commons.annotation.Factory;
import br.fosge.commons.serializer.Yaml;
import br.fosge.engine.audio.AudioSourceComponent;
import br.fosge.engine.physics.RigidBodyComponent;
import br.fosge.engine.physics.SoftBodyComponent;
import br.fosge.engine.renderer.MeshComponent;
import br.fosge.engine.renderer.TransformComponent;
import br.fosge.engine.renderer.frontend.Camera;

public interface ComponentFactory extends Factory {

    Camera camera(Yaml yaml);
    NameComponent name(Tuple ... properties);
    MeshComponent mesh(Tuple ... properties);
    SoftBodyComponent softBody(Tuple ... properties);
    TransformComponent transform(Tuple ... properties);
    RigidBodyComponent rigidBody(Tuple ... properties);
    BehaviourComponent behaviour(Tuple ... properties);
    AudioSourceComponent audioSource(Tuple ... properties);

}
