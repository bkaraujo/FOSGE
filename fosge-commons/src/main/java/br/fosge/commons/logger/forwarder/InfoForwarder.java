package br.fosge.commons.logger.forwarder;

import br.fosge.commons.Time;
import br.fosge.commons.logger.LogLevel;
import br.fosge.commons.logger.LogRecord;

public sealed class InfoForwarder extends WarnForwarder permits DebugForwarder {

    @Override
    public final void info(String message, Object... args) {
        forward(new LogRecord(
                Time.millis(),
                LogLevel.INFO,
                message,
                args
        ));
    }

}
