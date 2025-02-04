package br.fosge.engine.physics;

import br.fosge.commons.Tuple;
import br.fosge.engine.ecs.Component;

public final class SoftBodyComponent extends Component {

    public static SoftBodyComponent create(Tuple ... properties) {
        return new SoftBodyComponent();
    }

}
