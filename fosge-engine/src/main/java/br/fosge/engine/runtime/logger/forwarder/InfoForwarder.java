package br.fosge.engine.runtime.logger.forwarder;

import br.fosge.Time;
import br.fosge.engine.logger.LogLevel;
import br.fosge.engine.logger.LogRecord;

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
