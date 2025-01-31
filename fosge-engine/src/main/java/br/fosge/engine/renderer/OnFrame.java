package br.fosge.engine.renderer;

public interface OnFrame {
    default void onAwake(){}
    default void onSimulate(double step){}
    default void onUpdate(double delta){}
    default void onRest(){}
    default void onGui(){}
}
