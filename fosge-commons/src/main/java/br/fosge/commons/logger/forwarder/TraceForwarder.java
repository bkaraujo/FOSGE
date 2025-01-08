package br.fosge.commons.logger.forwarder;

import br.fosge.commons.Time;
import br.fosge.commons.logger.LogLevel;
import br.fosge.commons.logger.LogRecord;

public final class TraceForwarder extends DebugForwarder {

    @Override
    public final void trace(String message, Object... args) {
        forward(new LogRecord(
                Time.millis(),
                LogLevel.TRACE,
                message,
                args
        ));
    }

}
