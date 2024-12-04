package br.fosge.engine.configuration;

import br.fosge.logger.LogLevel;

public record Engine(
        boolean debug,
        LogLevel logLevel
) {
}
