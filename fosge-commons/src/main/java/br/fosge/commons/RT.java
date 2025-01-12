package br.fosge.commons;

import br.fosge.commons.annotation.State;
import br.fosge.commons.tools.Meta;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Set of runtime properties
 */
public abstract class RT implements State {
    private RT() {}

    private static final Lock lock = new ReentrantLock();
    public static final Map<String, Object> state = new HashMap<>();

    static {
        state.put("rootfs", Path.of(System.getProperty("user.dir")));
    }

    public static <T> T set(String key, Class<T> type, Object value) {
        try {
            lock.lock();
            Logger.trace("set(%s, %s)", key, Meta.cast(value, type));
            state.put(key, value);
            return Meta.cast(value, type);
        } finally {
            lock.unlock();
        }
    }
    public static <T> T get(String key, Class<T> type) {
        try {
            lock.lock();
            Logger.trace("get(%s, %s)", key, Meta.fqn(type));
            final var value = state.getOrDefault(key, null);
            return value == null ? null : Meta.cast(value, type);
        } finally {
            lock.unlock();
        }
    }

    public static final AtomicInteger threads = new AtomicInteger(0);
    public static boolean running;
    public static boolean suspended;

    public static Byte      getByte     (String key) { return get(key, Byte     .class); }
    public static Short     getShort    (String key) { return get(key, Short    .class); }
    public static Integer   getInt      (String key) { return get(key, Integer  .class); }
    public static Long      getLong     (String key) { return get(key, Long     .class); }
    public static Float     getFloat    (String key) { return get(key, Float    .class); }
    public static Double    getDouble   (String key) { return get(key, Double   .class); }
    public static Boolean   getBoolean  (String key) { return get(key, Boolean  .class); }
    public static String    getString   (String key) { return get(key, String   .class); }

    public static Boolean getBooleanOrFalse(String key) {
        final var value = get(key, Boolean.class);
        return value != null && value;
    }

    public static Path rootfs() { return get("rootfs", Path.class); }
}
