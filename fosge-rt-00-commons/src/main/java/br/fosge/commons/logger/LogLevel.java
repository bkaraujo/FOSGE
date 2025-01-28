package br.fosge.commons.logger;

public enum LogLevel {
    TRACE("\033[1;96m"),
    DEBUG("\033[1;94m"),
    INFO("\033[1;92m"),
    WARN("\033[1;93m"),
    ERROR("\033[1;91m"),
    FATAL("\033[1;91m");

    public final String color;

    LogLevel(String color) {
        this.color = color;
    }
}
