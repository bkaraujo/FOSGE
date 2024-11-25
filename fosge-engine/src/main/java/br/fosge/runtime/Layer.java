package br.fosge.runtime;

import br.fosge.annotation.Lifecycle;

public interface Layer extends Lifecycle {

    default void onAwake() {}
    default void onSimulate(double step) {}
    default void onUpdate(double delta) {}
    default void onGui() {}
    default void onRest() {}

}
