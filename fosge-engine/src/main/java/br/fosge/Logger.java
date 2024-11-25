package br.fosge;

import br.fosge.annotation.Facade;
import br.fosge.logger.LogChannel;
import br.fosge.logger.LogForwarder;
import br.fosge.logger.LogLevel;
import br.fosge.runtime.logger.channel.ConsoleChannel;
import br.fosge.runtime.logger.forwarder.*;

import java.util.HashMap;
import java.util.Map;

public abstract class Logger implements Facade {

    private static LogForwarder forwarder;
    private static final Map<LogLevel, LogForwarder> forwarders = new HashMap<>();

    static {
        forwarders.put(LogLevel.TRACE, new TraceForwarder());
        forwarders.put(LogLevel.DEBUG, new DebugForwarder());
        forwarders.put(LogLevel.INFO, new InfoForwarder());
        forwarders.put(LogLevel.WARN, new WarnForwarder());
        forwarders.put(LogLevel.ERROR, new ErrorForwarder());
        forwarders.put(LogLevel.FATAL, new FatalForwarder());
    }

    private static LogLevel level;
    public static LogLevel level() { return level; }
    public static void level(LogLevel desired) {
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
    public static void fatal(String message, Object... args) { forwarder.fatal(message, args); }

}
