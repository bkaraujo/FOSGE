package br.fosge.scene;

import br.fosge.annotation.Configurable;
import br.fosge.annotation.Lifecycle;
import org.joml.Matrix4fc;

public interface Camera extends Lifecycle, Configurable {

    Matrix4fc projectionMatrix();
    Matrix4fc viewProjectionMatrix();

}
