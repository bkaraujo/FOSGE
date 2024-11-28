package br.fosge.engine.runtime.configuration.api;

import br.fosge.engine.logger.LogLevel;

public record Engine(
        boolean debug,
        LogLevel logLevel
) {
}
