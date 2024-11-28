package br.fosge.engine.runtime;

public interface OnFrame {

    default void onAwake() {}
    default void onSimulate(double step) {}
    default void onUpdate(double delta) {}
    default void onGui() {}
    default void onRest() {}

}
