package br.fosge.commons;

import br.fosge.commons.annotation.Facade;
import br.fosge.commons.logger.LogChannel;
import br.fosge.commons.logger.LogForwarder;
import br.fosge.commons.logger.LogLevel;
import br.fosge.commons.logger.channel.ConsoleChannel;
import br.fosge.commons.logger.forwarder.*;

import java.util.HashMap;
import java.util.Map;

public abstract class Logger implements Facade {
    private Logger(){}

    private static LogForwarder forwarder;
    private static final Map<LogLevel, LogForwarder> forwarders = new HashMap<>();

    static {
        forwarders.put(LogLevel.TRACE, new TraceForwarder());
        forwarders.put(LogLevel.DEBUG, new DebugForwarder());
        forwarders.put(LogLevel.INFO, new InfoForwarder());
        forwarders.put(LogLevel.WARN, new WarnForwarder());
        forwarders.put(LogLevel.ERROR, new ErrorForwarder());
        forwarders.put(LogLevel.FATAL, new FatalForwarder());

        level(LogLevel.INFO);
    }

    private static LogLevel level;
    public static LogLevel level() { return level; }
    public static void level(LogLevel desired) {
        if (desired == null) { Meta.exit(99, "Invalid log level: %s", desired); }

        level = desired;
        forwarder = forwarders.get(desired);
    }

    private static LogChannel channel = new ConsoleChannel();
    public static LogChannel channel() { return channel; }
    public static void channel(LogChannel desired) {
        channel = desired;
    }

    public static void trace(String message, Object... args) { forwarder.trace(message, args); }
    public static void debug(String message, Object... args) { forwarder.debug(message, args); }
    public static void info (String message, Object... args) { forwarder.info (message, args); }
    public static void warn (String message, Object... args) { forwarder.warn (message, args); }
    public static void error(String message, Object... args) { forwarder.error(message, args); }
    public static void fatal(String message, Object... args) {
        final var local = new StringBuilder(message.formatted(args));
        local.append("\n");

        final var stackTrace = Meta.stackTrace();
        for (final var entry : stackTrace.subList(2, stackTrace.size())) {
            local.append(entry).append("\n");
        }

        forwarder.fatal(local.toString());
    }

    public static void stackTrace(LogLevel level) {
        final var message = new StringBuilder("\n\n");
        final var stackTrace = Meta.stackTrace();
        for (final var entry : stackTrace.subList(1, stackTrace.size())) {
            message.append(entry).append("\n");
        }

        switch (level) {
            case TRACE: trace(message.toString()); break;
            case DEBUG: debug(message.toString()); break;
            case INFO: info(message.toString()); break;
            case WARN: warn(message.toString()); break;
            case ERROR: error(message.toString()); break;
        }
    }
}
