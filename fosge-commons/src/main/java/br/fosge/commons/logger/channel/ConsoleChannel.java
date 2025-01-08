package br.fosge.commons.logger.channel;

import br.fosge.commons.logger.LogChannel;

public class ConsoleChannel implements LogChannel {

    @Override
    public void write(String message) {
        System.out.printf("%s\033[0m%n", message);
    }

}
