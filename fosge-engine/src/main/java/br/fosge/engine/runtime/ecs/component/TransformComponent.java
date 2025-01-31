package br.fosge.engine.runtime.ecs.component;

import br.fosge.commons.Strings;
import br.fosge.commons.Tuple;
import br.fosge.engine.ecs.Component;
import br.fosge.engine.runtime.ecs.ComponentType;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;

public class TransformComponent  extends Component {
    public static final ComponentType type = ComponentType.TRANSFORM_COMPONENT;

    public final Vector3f position = new Vector3f();
    public final Vector3f rotation = new Vector3f();
    public final Vector3f scale = new Vector3f(1, 1, 1);

    private TransformComponent() {}


    public static TransformComponent create(Tuple... properties) {
        final var component = new TransformComponent();

        if (properties != null && properties.length > 0) {
            component.position.set(Strings.floats(find("position", properties)));
            component.rotation.set(Strings.floats(find("rotation", properties)));
            component.scale.set(Strings.floats(find("scale", properties)));
        }

        return component;
    }

    public Matrix4fc matrix() {
        return new Matrix4f()
                .rotateXYZ(rotation)
                .scale(scale)
                .translate(position);
    }

    public void identity() {
        position.set(0,0,0);
        rotation.set(0, 0, 0);
        scale.set(1, 1, 1);
    }
}
