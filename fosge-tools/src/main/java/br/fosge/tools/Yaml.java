package br.fosge.tools;

import br.fosge.Logger;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class Yaml {
    private final Map<String, Object> raw = new ConcurrentHashMap<>();

    public static Yaml from(Path path) {
        try {
            final var mapper = new ObjectMapper(new YAMLFactory());
            return from(mapper.readValue(path.toFile(), Map.class));
        } catch (Throwable throwable) {
            Logger.error("Failed to read %s: %s", path, throwable);
            return null;
        }
    }

    public static Yaml empty() {
        return from(new HashMap<>());
    }

    public static Yaml from(Map<String, Object> values) {
        return new Yaml(values);
    }

    private Yaml(final Map<String, Object> values) {
        raw.putAll(values);
    }

    public boolean isEmpty() {
        return raw.isEmpty();
    }

    public void clear() {
        raw.clear();
    }

    public boolean containsKey(final String key) {
        return asString(key) != null;
    }

    public void put(String key, Object value) {
        put(raw, 0, value, key.split("\\."));
    }

    private void put(Object root, final int index, Object value, String ... tokens) {
        final var token = tokens[index];

        if (Meta.assignable(root, Map.class)) {

        }
    }

    public void save(Path path) {
        final var file = path.toFile();
        try {
            if (!file.exists()) { Files.createFile(path); }
            new ObjectMapper(new YAMLFactory()).writeValue(file, raw);
        } catch (Throwable throwable) {
            Logger.error("Failed to write %s: %s", path, throwable);
        }
    }

    public Boolean asBoolean(String key) {
        return Meta.cast(find(key, raw), Boolean.class);
    }

    public String asString(String key) {
        return Meta.cast(find(key, raw), String.class);
    }

    public <T extends Enum<T>> T asEnum(String key, Class<T> klass) {
        final var value = asString(key);
        for (final var constant : klass.getEnumConstants()) {
            if (constant.name().equals(value)) {
                return constant;
            }
        }

        return null;
    }

    public Byte asByte(String key) {
        return Meta.cast(find(key, raw), Byte.class);
    }

    public Short asShort(String key) {
        return Meta.cast(find(key, raw), Short.class);
    }

    public Integer asInt(String key) {
        return Meta.cast(find(key, raw), Integer.class);
    }

    public Long asLong(String key) {
        return Meta.cast(find(key, raw), Long.class);
    }

    public Float asFloat(String key) {
        return Meta.cast(find(key, raw), Float.class);
    }

    public Double asDouble(String key) {
        return Meta.cast(find(key, raw), Double.class);
    }

    public Yaml slice(String key) {
        return Yaml.from(subtree(raw, 0, key.split("\\.")));
    }

    private Map<String, Object> subtree(Object root, final int index, String ... tokens) {
        final var token = tokens[index];

        if (Meta.assignable(root, Map.class)) {
            final var map = Meta.cast(root, Map.class);
            if (map.containsKey(token)) {
                final var value = map.get(token);
                if (index != tokens.length - 1) { return subtree(value, index + 1, tokens); }
                if (Meta.assignable(value, Map.class)) { return Meta.cast(value, Map.class); }

                final var values = new ConcurrentHashMap<String, Object>();
                values.put(token, value);

                return values;
            }
        }

        if (Meta.assignable(root, List.class)) {
            final var list = Meta.cast(root, List.class);

            try {
                final var number = Integer.parseInt(token);
                if (number >= list.size()) {
                    Logger.warn("Element index (%d) beyond bounds (%d)", number, list.size() - 1);
                    return null;
                }

                final var value = list.get(number);
                if (index != tokens.length - 1) { return subtree(value, index + 1, tokens); }
                if (Meta.assignable(value, Map.class)) { return Meta.cast(value, Map.class); }

                Logger.warn("Expected a map, got: %s", Meta.fqn(value));
                return null;
            } catch (final NumberFormatException e) {
                Logger.fatal("Expected a number, got %s", token);
            }
        }

        return null;
    }

    public Map<String, Object> raw() {
        return Collections.unmodifiableMap(raw);
    }

    private Object find(String key, Object root) {
        return find(root, 0, key.split("\\."));
    }

    private Object find(Object root, final int index, String ... tokens) {
        final var token = tokens[index];

        if (Meta.assignable(root, Map.class)) {
            final var map = Meta.cast(root, Map.class);
            if (map.containsKey(token)) {
                if (index == tokens.length - 1) return map.get(token);
                return find(map.get(token), index + 1, tokens);
            }
        }

        if (Meta.assignable(root, List.class)) {
            final var list = Meta.cast(root, List.class);

            try {
                final var number = Integer.parseInt(token);
                if (number >= list.size()) {
                    Logger.warn("Element index (%d) beyond bounds (%d)", number, list.size() - 1);
                    return null;
                }

                if (index == tokens.length - 1) return list.get(number);
                return find(list.get(number), index + 1, tokens);
            } catch (final NumberFormatException e) {
                Logger.fatal("Expected a number, got %s", token);
            }
        }

        return null;
    }

}
