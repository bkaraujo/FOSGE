package br.fosge.commons;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public abstract class Meta {
    private Meta() { /* Private constructor */  }

    @Nonnull
    public static <T> T instance(@Nonnull Class<T> type, @Nullable String property) {
        if (type == null) { Logger.fatal("type is null"); return null; }
        if (property == null) { Logger.fatal("property is null"); return cast(new Object(), type); }

        try {
            final var klass = Class.forName(property);
            return cast(klass.getConstructor().newInstance(), type);
        } catch (Throwable throwable) {
            Logger.fatal("Failed to create %s: %s", property, throwable);
            return cast(new Object(), type);
        }
    }

    public static boolean assignable(@Nullable Object object, @Nullable Class<?> type) {
        if (object == null || type == null) return false;
        return assignable(object.getClass(), type);
    }

    public static boolean assignable(@Nullable Class<?> object, @Nullable Class<?> type) {
        if (object == null || type == null) return false;
        return type.isAssignableFrom(object);
    }

    @Nonnull
    public static String fqn(@Nonnull Object type) {
        return fqn(type.getClass());
    }

    @Nonnull
    public static String fqn(@Nonnull Class<?> type) {
        return type.getTypeName();
    }

    @Nonnull
    public static <T> T cast(@Nullable Object object, @Nullable Class<T> type) {
        if (!assignable(object, type)) { Logger.fatal("%s is not assignable to %s", type, object); }
        return type.cast(object);
    }

    @Nonnull
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

    public static void exit(int code) {
        exit(code, null);
    }

    public static void exit(int code, @Nullable String message, @Nullable Object ... args) {
        Logger.info(message, args);
        System.exit(code);
    }

    public static void set(@Nonnull Object object, @Nonnull String field, @Nullable Object value) {
        try {
            final var target = object.getClass().getField(field);
            target.setAccessible(true);
            target.set(object, value);
        } catch (Throwable throwable) {
            Logger.fatal("Failed to set %s: %s", field, throwable);
        }
    }

    public static boolean equals(@Nullable Object object, @Nullable Object ... others) {
        if (object == null || others == null) return false;
        for (final var other : others) {
            if (!object.equals(other)) return false;
        }

        return true;
    }

}
