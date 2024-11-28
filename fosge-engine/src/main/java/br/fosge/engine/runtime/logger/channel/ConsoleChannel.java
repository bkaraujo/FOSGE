package br.fosge.engine.runtime.logger.channel;

import br.fosge.engine.logger.LogChannel;

public class ConsoleChannel implements LogChannel {

    @Override
    public void write(String message) {
        System.out.printf("%s\033[0m%n", message);
    }

}
