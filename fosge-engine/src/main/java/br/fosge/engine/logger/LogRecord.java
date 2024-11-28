package br.fosge.engine.logger;

public record LogRecord(
        long timestamp,
        LogLevel level,
        String message,
        Object ... args
) {

    public String userMessage() {
        return message.formatted(args);
    }

}
