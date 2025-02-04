package br.fosge.engine.runtime.ecs.component;

import br.fosge.commons.Tuple;
import br.fosge.engine.ecs.Component;

public final class NameComponent extends Component {
    public String name;

    public static NameComponent create(Tuple ... properties) {
        final var instance = new NameComponent();
        instance.name = find("name", properties);

        return instance;
    }
}
