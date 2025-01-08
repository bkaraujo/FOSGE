package br.fosge.commons.annotation;

public interface Configurable {

    default boolean configure(Specification specification) { return true; }

}
