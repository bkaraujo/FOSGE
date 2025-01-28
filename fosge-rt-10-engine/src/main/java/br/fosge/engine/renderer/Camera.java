package br.fosge.engine.renderer;

import br.fosge.commons.annotation.Configurable;
import br.fosge.commons.annotation.Lifecycle;
import org.joml.Matrix4fc;

public interface Camera extends Lifecycle, Configurable {

    Matrix4fc projectionMatrix();
    Matrix4fc viewProjectionMatrix();
}
