package br.fosge.commons.logger;

public interface LogForwarder {

    default void trace(String message, Object... args) {}
    default void debug(String message, Object... args) {}
    default void info(String message, Object... args) {}
    default void warn(String message, Object... args) {}
    default void error(String message, Object... args) {}
    default void fatal(String message, Object... args) {}

}
