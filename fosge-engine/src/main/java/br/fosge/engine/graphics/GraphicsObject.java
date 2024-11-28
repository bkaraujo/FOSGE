package br.fosge.engine.graphics;

import br.fosge.engine.annotation.Lifecycle;

public interface GraphicsObject extends Lifecycle {
    int handle();

    default void bind() {}

}
