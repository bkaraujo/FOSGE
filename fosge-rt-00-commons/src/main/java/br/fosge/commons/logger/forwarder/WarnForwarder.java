package br.fosge.commons.logger.forwarder;

import br.fosge.commons.Time;
import br.fosge.commons.logger.LogLevel;
import br.fosge.commons.logger.LogRecord;

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
