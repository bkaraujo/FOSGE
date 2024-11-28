package br.fosge.engine.runtime.logger.forwarder;

import br.fosge.Time;
import br.fosge.engine.logger.LogLevel;
import br.fosge.engine.logger.LogRecord;

public sealed class WarnForwarder extends ErrorForwarder permits InfoForwarder {

    @Override
    public final void warn(String message, Object... args) {
        forward(new LogRecord(
                Time.millis(),
                LogLevel.WARN,
                message,
                args
        ));
    }

}
