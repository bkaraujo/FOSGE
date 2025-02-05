package br.fosge.engine.renderer.frontend;

import br.fosge.commons.annotation.Configurable;
import br.fosge.commons.annotation.Lifecycle;
import org.joml.Matrix4fc;

import javax.annotation.Nonnull;

public interface Camera extends Lifecycle, Configurable {

    @Nonnull
    Matrix4fc projectionMatrix();

    @Nonnull
    Matrix4fc viewProjectionMatrix();
}
