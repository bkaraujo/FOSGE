package br.fosge.engine.renderer.frontend;

import br.fosge.engine.ecs.Component;
import org.joml.Matrix4f;

public final class CameraComponent extends Component {

    public final Matrix4f view = new Matrix4f();
    public final Matrix4f projection = new Matrix4f();

}
