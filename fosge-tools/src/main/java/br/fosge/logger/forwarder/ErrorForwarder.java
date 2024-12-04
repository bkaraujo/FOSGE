package br.fosge.logger.forwarder;

import br.fosge.Time;
import br.fosge.logger.LogLevel;
import br.fosge.logger.LogRecord;

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
