package br.fosge.engine.scene;

import br.fosge.engine.annotation.Configurable;
import br.fosge.engine.annotation.Lifecycle;
import org.joml.Matrix4fc;

public interface Camera extends Lifecycle, Configurable {

    Matrix4fc projectionMatrix();
    Matrix4fc viewProjectionMatrix();

}
