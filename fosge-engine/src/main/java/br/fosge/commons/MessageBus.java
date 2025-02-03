package br.fosge.commons;

import br.fosge.commons.annotation.Facade;
import br.fosge.commons.message.Message;
import br.fosge.commons.message.MessageListener;
import br.fosge.commons.message.MessagePipeline;
import br.fosge.commons.message.MessageProcessor;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class MessageBus implements Facade {
    private MessageBus() { /* Private constructor */ }

    private static final Map<Class<?>, List<MessageProcessor>> processors = new HashMap<>();
    private static final Map<Class<?>, List<Class<?>>> hierarchy = new HashMap<>();

    public static int subscribe(@Nonnull Class<?> container) {
        return subscribe(Meta.instance(container));
    }

    public static int subscribe(@Nonnull Object container) {
        int subscribed = 0;

        for (final var method : container.getClass().getMethods()) {
            final var annotation = method.getAnnotation(MessageListener.class);
            if (annotation == null) { continue; }

            final var parameters = method.getParameters();

            if (method.getReturnType() != MessagePipeline.class) {
                Logger.warn(
                        "Method '%s.%s' must return %s",
                        Meta.fqn(container),
                        method.getName(),
                        Meta.fqn(MessagePipeline.class)
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

            try { method.setAccessible(true); }
            catch (final SecurityException e) {
                Logger.warn(
                        "Failed to make '%s.%s' accessible'",
                        Meta.fqn(container),
                        method.getName()
                );

                continue;
            }

            subscribed++;
            processors
                    .computeIfAbsent(parameters[0].getType(), ignored -> new ArrayList<>())
                    .add(new MessageProcessor(container, method));
        }

        return subscribed;
    }

    public static <T extends Message> void submit(@Nonnull T message) {
        if (!hierarchy.containsKey(message.getClass())) {
            Logger.trace("Creating message hierarchy: %s", Meta.fqn(message));
            final var list = new ArrayList<Class<?>>();

            Class<?> klass = message.getClass();
            while (klass != Object.class) {
                list.add(klass);
                klass = klass.getSuperclass();
            }

            hierarchy.put(message.getClass(), list.reversed());
        }

        for (final var entry : hierarchy.get(message.getClass())) {
            for (final var processor : processors.getOrDefault(entry, new ArrayList<>())) {
                if (processor.process(message) == MessagePipeline.AVAILABLE) {
                    break;
                }
            }
        }
    }

}
