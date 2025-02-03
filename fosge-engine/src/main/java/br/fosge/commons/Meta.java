package br.fosge.commons;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

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
        if (!object.isPrimitive()) { return type.isAssignableFrom(object); }

        final var typeName = type.getSimpleName();
        final var objectName = object.getSimpleName();
        if (typeName.equalsIgnoreCase(objectName)) { return true; }
        if (typeName.equals("int")) { return objectName.equalsIgnoreCase("integer"); }

        return false;
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

    /** Set the field casting the value to the field type */
    public static void set(@Nonnull Object object, @Nonnull String fieldName, @Nullable Object fieldValue) {
        try {
            final var field = field(object, fieldName);
            field.setAccessible(true);

            if (fieldValue == null) { field.set(object, null); return; }
            if (Meta.assignable(field.getType(), Byte   .class)) { field.set(object, Byte   .valueOf(fieldValue.toString())); return; }
            if (Meta.assignable(field.getType(), Short  .class)) { field.set(object, Short  .valueOf(fieldValue.toString())); return; }
            if (Meta.assignable(field.getType(), Integer.class)) { field.set(object, Integer.valueOf(fieldValue.toString())); return; }
            if (Meta.assignable(field.getType(), Long   .class)) { field.set(object, Long   .valueOf(fieldValue.toString())); return; }
            if (Meta.assignable(field.getType(), Float  .class)) { field.set(object, Float  .valueOf(fieldValue.toString())); return; }
            if (Meta.assignable(field.getType(), Double .class)) { field.set(object, Double .valueOf(fieldValue.toString())); return; }
            if (Meta.assignable(field.getType(), Boolean.class)) { field.set(object, Boolean.valueOf(fieldValue.toString())); return; }

            field.set(object, fieldValue);
        } catch (Throwable throwable) {
            Logger.fatal("Failed to set %s: %s", fieldName, throwable);
        }
    }

    public static boolean equals(@Nullable Object object, @Nullable Object ... others) {
        if (object == null || others == null) return false;
        for (final var other : others) {
            if (!object.equals(other)) return false;
        }

        return true;
    }

    public static Field field(Object container, String name) {
        for (final var field : fields(container)) {
            if (field.getName().equals(name)) {
                return field;
            }
        }

        return null;
    }

    private static Set<Field> fields(Object container) {
        return fields(container.getClass());
    }

    private static final Map<Class<?>, AtomicInteger> knownFieldsCount = new ConcurrentHashMap<>();
    private static final Map<Class<?>, Set<Field>> knownFields = new ConcurrentHashMap<>();
    private static Set<Field> fields(Class<?> container) {
        if (knownFields.containsKey(container)) { return knownFields.get(container); }

        knownFieldsCount
                .computeIfAbsent(container, k -> new AtomicInteger(0))
                .incrementAndGet();

        final var fields = new HashSet<Field>();

        Class<?> klass = container;
        while (klass != null) {
            try {
                fields.addAll(List.of(klass.getFields()));
                fields.addAll(List.of(klass.getDeclaredFields()));
            } catch (Throwable ignored) {

            }

            klass = klass.getSuperclass();
        }

        if (knownFieldsCount.get(container).getAcquire() >= 3) {
            if (!knownFields.containsKey(container)) {
                Logger.trace("Creating Set<Field> for %s", container);
                knownFields.put(container, fields);
            }
        }

        return fields;
    }

}
