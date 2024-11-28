package br.fosge.engine.runtime.logger.forwarder;

import br.fosge.Time;
import br.fosge.engine.logger.LogLevel;
import br.fosge.engine.logger.LogRecord;

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
