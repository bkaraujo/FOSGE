package br.fosge.engine.renderer.backend;

import br.fosge.commons.annotation.Lifecycle;

public interface GraphicsObject extends Lifecycle {

    int handle();

    default void bind() {}

}
