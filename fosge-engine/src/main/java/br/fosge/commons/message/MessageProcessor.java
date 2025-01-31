package br.fosge.commons.message;

import br.fosge.commons.Logger;
import br.fosge.commons.Meta;

import java.lang.reflect.Method;

public record MessageProcessor (
        Object container,
        Method method
) {

    public MessagePipeline process(Message message) {
        try {
            return (MessagePipeline) method.invoke(container, message);
        } catch (Throwable throwable) {
            Logger.fatal("Failed to process %s: %s", Meta.fqn(message), throwable.toString());
            return MessagePipeline.CONSUMED;
        }
    }

}
