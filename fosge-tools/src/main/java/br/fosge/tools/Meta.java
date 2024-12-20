package br.fosge.tools;

import br.fosge.Logger;

import java.text.DecimalFormatSymbols;
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
        return assignable(object.getClass(), type);
    }

    public static boolean assignable(Class<?> object, Class<?> type) {
        return type.isAssignableFrom(object);
    }

    public static String fqn(Object type) {
        return fqn(type.getClass());
    }

    public static String fqn(Class<?> type) {
        return type.getTypeName();
    }

    public static <T> T cast(Object object, Class<T> type) {
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

    public static void exit(int code) {
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

    public static boolean isNumeric(String input) {
        if(input == null || input.trim().isBlank()) return false;

        final var isNegative = input.charAt(0) == DecimalFormatSymbols.getInstance().getMinusSign();
        if (isNegative && input.length() == 1) return false;

        var isDecimalSeparatorFound = false;
        final var separator = DecimalFormatSymbols.getInstance().getDecimalSeparator();

        for (var i = isNegative ? 1 : 0; i < input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) {
                if(!isDecimalSeparatorFound && input.charAt(i) == separator) {
                    isDecimalSeparatorFound = true;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
