package br.fosge.engine.physics;

import br.fosge.commons.Tuple;
import br.fosge.engine.ecs.Component;

public final class RigidBodyComponent extends Component {

    public static RigidBodyComponent create(Tuple ... properties) {
        return new RigidBodyComponent();
    }

}
