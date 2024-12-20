package br.fosge.logger.forwarder;

import br.fosge.Time;
import br.fosge.logger.LogLevel;
import br.fosge.logger.LogRecord;

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
