package br.fosge.tools;

import br.fosge.Logger;
import br.fosge.Tuple;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class YamlFile {

    private final Map<String, Object> raw = new ConcurrentHashMap<>();

    public YamlFile() {
        this(new HashMap<>());
    }

    public YamlFile(final Map<String, Object> values) {
        raw.putAll(values);
    }

    @SafeVarargs
    public final void put(String key, Tuple<String, Object>... values) {

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

    public YamlFile slice(String key) {
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
                final var value = map.get(token);
                return index == tokens.length - 1 ? value : find(value, index + 1, tokens);
            }
        }

        if (Meta.assignable(root, List.class)) {
            try {
                final var number = Integer.parseInt(token);
                final var list = Meta.cast(root, List.class);
                if (number >= list.size()) {
                    Logger.warn("Element index (%d) beyond bounds (%d)", number, list.size() - 1);
                    return null;
                }

                final var value = list.get(number);
                return index == tokens.length - 1 ? value : find(value, index + 1, tokens);
            } catch (final NumberFormatException e) {
                Logger.fatal("Expected a number, got; %s", token);
            }
        }

        return null;
    }
}
