package br.fosge.commons.logger.forwarder;

import br.fosge.commons.Time;
import br.fosge.commons.logger.LogLevel;
import br.fosge.commons.logger.LogRecord;

public sealed class ErrorForwarder extends FatalForwarder permits WarnForwarder {

    @Override
    public final void error(String message, Object... args) {
        forward(new LogRecord(
                Time.millis(),
                LogLevel.ERROR,
                message,
                args
        ));
    }

}
