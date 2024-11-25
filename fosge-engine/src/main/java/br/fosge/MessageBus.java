package br.fosge;

import br.fosge.annotation.Facade;
import br.fosge.message.Message;
import br.fosge.message.MessageListener;
import br.fosge.message.Result;
import br.fosge.runtime.Runtime;
import br.fosge.runtime.message.MessageProcessor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class MessageBus implements Facade {
    private MessageBus() { /* Private constructor */ }

    private static final Map<Class<?>, List<MessageProcessor>> processors = new HashMap<>();
    private static final Map<Class<?>, List<Class<?>>> hierarchy = new HashMap<>();

    public static int subscribe(Object container) {
        int subscribed = 0;
        if (Runtime.CHECKS && container == null) {
            Logger.warn("Object container is null");
            return subscribed;
        }

        for (final var method : container.getClass().getMethods()) {
            final var annotation = method.getAnnotation(MessageListener.class);
            if (annotation == null) { continue; }

            final var parameters = method.getParameters();

            if (Runtime.CHECKS) {
                if (method.getReturnType() != Result.class) {
                    Logger.warn(
                            "Method '%s.%s' must return %s",
                            Meta.fqn(container),
                            method.getName(),
                            Meta.fqn(Result.class)
                    );
                    continue;
                }

                if (parameters.length != 1) {
                    Logger.warn(
                            "Method '%s.%s' must accept a single parameter",
                            Meta.fqn(container),
                            method.getName()
                    );
                    continue;
                }

                if (!Meta.assignable(parameters[0].getType(), Message.class)) {
                    Logger.warn(
                            "Method '%s.%s' parameter must be assignable to %s",
                            Meta.fqn(container),
                            method.getName(),
                            Meta.fqn(Message.class)
                    );

                    continue;
                }
            }

            try { method.setAccessible(true); }
            catch (final SecurityException e) {
                Logger.warn(
                        "Failed to make '%s.%s' accessible'",
                        Meta.fqn(container),
                        method.getName()
                );

                continue;
            }

            if (!hierarchy.containsKey(parameters[0].getType())) {
                final var list = new ArrayList<Class<?>>();

                Class<?> klass = parameters[0].getType();
                while (klass != Object.class) {
                    list.add(klass);
                    klass = klass.getSuperclass();
                }

                hierarchy.put(parameters[0].getType(), list.reversed());
            }

            subscribed++;
            processors
                    .computeIfAbsent(parameters[0].getType(), _ -> new ArrayList<>())
                    .add(new MessageProcessor(container, method));
        }

        return subscribed;
    }

    public static <T extends Message> void submit(T message) {
        for (final var entry : hierarchy.getOrDefault(message.getClass(), new ArrayList<>())) {
            for (final var processor : processors.getOrDefault(entry, new ArrayList<>())) {
                if (processor.process(message) == Result.CONSUMED) {
                    break;
                }
            }
        }
    }

}
