package br.fosge.annotation;

public interface Lifecycle {
    default boolean initialize(){ return true; }
    default boolean terminate(){ return true; }
}
