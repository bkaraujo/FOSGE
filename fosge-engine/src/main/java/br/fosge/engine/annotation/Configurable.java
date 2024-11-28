package br.fosge.engine.annotation;

public interface Configurable {

    default boolean configure(Specification specification) { return true; }

}
