package br.fosge.logger.forwarder;

import br.fosge.Logger;
import br.fosge.logger.LogForwarder;
import br.fosge.logger.LogLevel;
import br.fosge.logger.LogRecord;
import br.fosge.tools.Meta;

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

        Logger.channel().write("%s%s %5s %s:%d - %s".formatted(
                record.level().color,
                sdf.format(new Date(record.timestamp())),
                record.level().name(),
                frame.className(),
                frame.lineNumber(),
                record.userMessage()
        ));
    }
}
