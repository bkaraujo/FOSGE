package br.fosge;

import br.fosge.annotation.State;
import br.fosge.tools.Meta;

import java.nio.file.Path;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class RT implements State {
    private RT() {}

    public static final Map<String, Object> state = new ConcurrentHashMap<>();

    static {
        state.put("rootfs", Path.of(System.getProperty("user.dir")));
    }

    public static void set(String key, Object value) { state.put(key, value); }
    public static <T> T get(String key, Class<T> type) {
        final var value = state.getOrDefault(key, null);
        return value == null ? null : Meta.cast(value, type);
    }

    public static Path rootfs() { return get("rootfs", Path.class); }
    public static Path settingsfs() { return get("settingsfs", Path.class); }
}
