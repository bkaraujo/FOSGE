package br.fosge.message;

import br.fosge.Logger;
import br.fosge.tools.Meta;

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
