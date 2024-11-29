package br.fosge.engine.configuration;

import br.fosge.engine.logger.LogLevel;

public record Engine(
        boolean debug,
        LogLevel logLevel
) {
}
