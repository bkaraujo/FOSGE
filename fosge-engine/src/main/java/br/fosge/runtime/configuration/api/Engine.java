package br.fosge.runtime.configuration.api;

import br.fosge.logger.LogLevel;

public record Engine(
        boolean debug,
        LogLevel logLevel
) {
}
