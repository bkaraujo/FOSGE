package br.fosge.commons.logger.forwarder;

import br.fosge.commons.Logger;
import br.fosge.commons.Meta;
import br.fosge.commons.logger.LogForwarder;
import br.fosge.commons.logger.LogLevel;
import br.fosge.commons.logger.LogRecord;

import java.text.SimpleDateFormat;
import java.util.Date;

public sealed class FatalForwarder implements LogForwarder permits ErrorForwarder{
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");

    @Override
    public final void fatal(String message, Object... args) {
        forward(new LogRecord(
                System.currentTimeMillis(),
                LogLevel.FATAL,
                message,
                args
        ));

        System.exit(99);
    }

    protected final void forward(LogRecord record) {
        final var frame = Meta.stackTrace().get(3);

        Logger.channel().write("%s%s %-20s %5s %s:%d - %s".formatted(
                record.level().color,
                sdf.format(new Date(record.timestamp())),
                Thread.currentThread().getName(),
                record.level().name(),
                frame.className(),
                frame.lineNumber(),
                record.userMessage()
        ));
    }
}
