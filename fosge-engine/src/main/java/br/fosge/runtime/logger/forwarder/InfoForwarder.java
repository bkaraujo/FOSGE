package br.fosge.runtime.logger.forwarder;

import br.fosge.Time;
import br.fosge.logger.LogLevel;
import br.fosge.logger.LogRecord;

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
