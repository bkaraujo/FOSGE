package br.fosge.runtime.scene.component;

import br.fosge.runtime.scene.Component;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;

public final class TransformComponent extends Component {
    public final Vector3f position = new Vector3f();
    public final Vector3f rotation = new Vector3f();
    public final Vector3f scale = new Vector3f(1, 1, 1);

    private TransformComponent() {}
    public static TransformComponent create() {
        return new TransformComponent();
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