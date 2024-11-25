package br.fosge.graphics;

import br.fosge.annotation.Lifecycle;

public interface GraphicsObject extends Lifecycle {
    int handle();

    default void bind() {}
    default void unbind() {}

}
