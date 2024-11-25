package br.fosge.runtime.message;

import br.fosge.Logger;
import br.fosge.Meta;
import br.fosge.message.Message;
import br.fosge.message.Result;

import java.lang.reflect.Method;

public record MessageProcessor (
        Object container,
        Method method
) {

    public Result process(Message message) {
        try {
            return (Result) method.invoke(container, message);
        } catch (Throwable throwable) {
            Logger.fatal("Failed to process %s: %s", Meta.fqn(message), throwable.toString());
            return Result.AVAILABLE;
        }
    }

}
