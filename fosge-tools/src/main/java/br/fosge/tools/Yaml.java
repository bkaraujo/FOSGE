package br.fosge.tools;

import br.fosge.Logger;
import br.fosge.Tuple;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;

public final class Yaml {
    private Path path;
    private final Map<String, Object> raw = new ConcurrentSkipListMap<>();

    public static Yaml from(Path path) {
        try {
            final var mapper = new ObjectMapper(new YAMLFactory());
            final var yaml = from(mapper.readValue(path.toFile(), Map.class));
            yaml.path = path;

            return yaml;
        } catch (Throwable throwable) {
            Logger.error("Failed to read %s: %s", path, throwable);
            return null;
        }
    }

    public static Yaml empty() {
        return from(new HashMap<>());
    }

    public static Yaml from(final Map<String, Object> values) {
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

    public Map<String, Object> raw() {
        return Collections.unmodifiableMap(raw);
    }

    public boolean containsKey(final String key) {
        return asString(key) != null;
    }

    public void append(final String key, final String name, Object value) {
        append(key, new YamlEntry(name, value));
    }

    public void append(final String key, final YamlEntry ... values) {
        var container = find(key);
        if (container != null && Meta.assignable(container, List.class)) {
            final var list = Meta.cast(container, List.class);
            for (final var entry : values) {
                list.add(entry.toMap());
            }

            return;
        }

        final var list = new ArrayList<>();
        for (final var entry : values) {
            list.add(entry.toMap());
        }

        final var path = key.substring(0, key.lastIndexOf('.'));
        final var item = key.substring(key.lastIndexOf('.') + 1);
        create(path).put(item, list);
    }

    public void put(final String key, final Object value) {
        if (!key.contains(".")) { raw.put(key, value); return; }

        final var path = key.substring(0, key.lastIndexOf('.'));
        final var item = key.substring(key.lastIndexOf('.') + 1);

        final var container = create(path);
        final var map = Meta.cast(container, Map.class);
        map.put(item, value.toString());
    }

    private Map<String, Object> create(final String key) {
        final var tokens = key.split("\\.");

        Object container = raw;
        for (final String token : tokens) {
            if (Meta.assignable(container, Map.class)) {
                final var map = Meta.cast(container, Map.class);
                if (map.containsKey(token)) {
                    container = map.get(token);
                } else {
                    container = new ConcurrentSkipListMap<String, Object>();
                    map.put(token, container);
                }

                continue;
            }

            if (Meta.assignable(container, List.class)) {
                final var list = Meta.cast(container, List.class);

                try {
                    container = new ConcurrentSkipListMap<String, Object>();
                    list.add(container);
                } catch (final NumberFormatException e) {
                    Logger.fatal("Expected a number, got %s", token);
                }
            }
        }

        return Meta.cast(container, Map.class);
    }

    public void save() {
        if (path == null) {
            Logger.warn("Failed to save: Yaml not loaded from a known file");
            return;
        }

        save(path);
    }

    public void save(final Path path) {
        final var file = path.toFile();
        try {
            if (!file.exists()) { Files.createFile(path); }
            new ObjectMapper(new YAMLFactory()).writeValue(file, raw);
        } catch (Throwable throwable) {
            Logger.error("Failed to write %s: %s", path, throwable);
        }
    }

    public Boolean asBoolean(final String key) { return find(key, Boolean.class); }
    public String asString(final String key) { return find(key, String.class); }
    public Byte asByte(final String key) { return find(key, Byte.class); }
    public Short asShort(final String key) { return find(key, Short.class); }
    public Integer asInt(final String key) { return find(key, Integer.class); }
    public Long asLong(final String key) { return find(key, Long.class); }
    public Float asFloat(final String key) { return find(key, Float.class); }
    public Double asDouble(final String key) { return find(key, Double.class); }
    public <T extends Enum<T>> T asEnum(final String key, Class<T> klass) {
        final var value = asString(key);
        for (final var constant : klass.getEnumConstants()) {
            if (constant.name().equals(value)) {
                return constant;
            }
        }

        return null;
    }

    /**
     * <p>Subset of a yaml file.</p>
     *
     * <p>The subset is dependent of the original yaml, any modification done in the subset alters the original set.</p>
     */
    public Yaml subtree(final String key) {
        final var result = find(key);
        if (result == null) { return null; }

        if (Meta.assignable(result, Map.class)) {
            return Yaml.from(Meta.cast(result, Map.class));
        }

        if (Meta.assignable(result, List.class)) {
            final var map = new ConcurrentSkipListMap<String, Object>();
            final var desired = key.contains(".") ? key.substring(key.lastIndexOf('.') + 1) : key;
            map.put(desired, result);
            return Yaml.from(map);
        }

        return null;
    }

    private <T> T find(final String key, final Class<T> type) {
        final var desired = key.contains(".") ? key.substring(0, key.lastIndexOf('.')) : key;
        final var result = find(desired);

        if (result == null) { return null; }
        if (!Meta.assignable(result, Map.class)) { return Meta.cast(result, type); }

        final var map = Meta.cast(result, Map.class);
        final var value = map.get(key.substring(key.lastIndexOf('.') + 1));
        return Meta.cast(value, type);
    }

    private Object find(final String key) {
        final var tokens = key.split("\\.");

        Object container = raw;
        for (final String token : tokens) {
            if (Meta.assignable(container, Map.class)) {
                final var map = Meta.cast(container, Map.class);
                if (map.containsKey(token)) {
                    container = map.get(token);
                    continue;
                }

                return null;
            }

            if (Meta.assignable(container, List.class)) {
                final var list = Meta.cast(container, List.class);

                try {
                    final var number = Integer.parseInt(token);
                    if (number >= list.size()) {
                        Logger.warn("Element index (%d) beyond bounds (%d)", number, list.size() - 1);
                        return null;
                    }

                    container = list.get(number);
                } catch (final NumberFormatException e) {
                    Logger.fatal("Expected a number, got %s", token);
                }
            }
        }

        return container;
    }

}
