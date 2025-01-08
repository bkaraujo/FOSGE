package br.fosge.commons.logger.forwarder;

import br.fosge.commons.Time;
import br.fosge.commons.logger.LogLevel;
import br.fosge.commons.logger.LogRecord;

public sealed class DebugForwarder extends InfoForwarder permits TraceForwarder {

    @Override
    public final void debug(String message, Object... args) {
        forward(new LogRecord(
                Time.millis(),
                LogLevel.DEBUG,
                message,
                args
        ));
    }

}
