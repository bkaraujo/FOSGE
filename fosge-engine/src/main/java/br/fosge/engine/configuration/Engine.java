package br.fosge.engine.configuration;

import br.fosge.commons.logger.LogLevel;

public record Engine(
        boolean debug,
        LogLevel logLevel
) {
}
