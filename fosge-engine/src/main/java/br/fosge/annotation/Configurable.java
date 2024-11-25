package br.fosge.annotation;

public interface Configurable {

    default boolean configure(Specification specification) { return true; }

}
