package br.fosge.commons;

import java.util.List;

public abstract class Meta {
    private Meta() { /* Private constructor */  }

    public static <T> T instance(Class<T> type, String property) {
        if (property == null) { Logger.fatal("property is null"); return cast(new Object(), type);}

        try {
            final var klass = Class.forName(property);
            return cast(klass.getConstructor().newInstance(), type);
        } catch (Throwable throwable) {
            Logger.fatal("Failed to create %s: %s", property, throwable);
            return cast(new Object(), type);
        }
    }

    public static boolean assignable(Object object, Class<?> type) {
        if (object == null) return false;
        return assignable(object.getClass(), type);
    }

    public static boolean assignable(Class<?> object, Class<?> type) {
        if (object == null || type == null) return false;
        return type.isAssignableFrom(object);
    }

    public static String fqn(Object type) {
        return fqn(type.getClass());
    }

    public static String fqn(Class<?> type) {
        return type.getTypeName();
    }

    public static <T> T cast(Object object, Class<T> type) {
        if (!assignable(object, type)) { Logger.fatal("%s is not assignable to %s", type, object); }
        return type.cast(object);
    }

    public static List<StackFrame> stackTrace() {
        return StackWalker
                .getInstance()
                .walk(stream -> stream
                        .filter(stack -> stack
                                .getClassName().startsWith("br.fosge"))
                        .map(frame -> new StackFrame(frame.getClassName(), frame.getLineNumber()))
                        .skip(1)
                        .toList()
                );
    }

    public static void exit(int code, String message, Object ... args) {
        Logger.info(message, args);
        System.exit(code);
    }

    public static void set(Object object, String field, Object value) {
        try {
            final var target = object.getClass().getField(field);
            target.setAccessible(true);
            target.set(object, value);
        } catch (Throwable throwable) {
            Logger.fatal("Failed to set %s: %s", field, throwable);
        }
    }

    public static boolean equals(Object object, Object ... others) {
        if (object == null) return false;
        if (others == null) return false;

        for (final var other : others) {
            if (!object.equals(other)) return false;
        }

        return true;
    }

}
