package br.fosge.commons.serializer;

import br.fosge.commons.Logger;
import br.fosge.commons.Meta;
import br.fosge.commons.Strings;
import br.fosge.commons.Tuple;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public final class Yaml {
    private Path source;
    private final Map<String, Object> raw;

    public static Yaml from(Path path) {
        try {
            Yaml yaml;
            if (!Files.exists(path) || Files.size(path) == 0) {
                yaml = empty();
            } else {
                final var mapper = new ObjectMapper(new YAMLFactory());
                yaml = from(mapper.readValue(path.toFile(), Map.class));
            }

            yaml.source = path;
            return yaml;
        } catch (Throwable throwable) {
            Logger.error("Failed to read %s: %s", path, throwable);
            return null;
        }
    }

    public static Yaml empty() {
        return from(new ConcurrentSkipListMap<>());
    }

    public static Yaml from(final Map<String, Object> values) {
        return new Yaml(values);
    }

    private Yaml(final Map<String, Object> values) {
        raw = values;
    }

    public boolean isEmpty() {
        return raw.isEmpty();
    }

    public void clear() {
        raw.clear();
    }

    public Path folder() {
        if (source == null) return null;
        return source.getParent();
    }

    public Map<String, Object> raw() {
        return Collections.unmodifiableMap(raw);
    }

    public boolean contains(final String key) {
        return find(key) != null;
    }

    /** Attach a key-value pair into the current map position */
    public void append(String key, String value) {
        append(new YamlEntry(key, value));
    }
    /** Attach a key-value pair into the current map position */
    public void append(final YamlEntry ... values) {
        for (final var entry : values) {
            raw.putAll(entry.toMap());
        }
    }

    /** Attach a key-value pair into any desired map position */
    public void append(final String key, final String name, Object value) {
        append(key, new YamlEntry(name, value));
    }

    /** Attach a key-value pair into any desired map position */
    public void append(final String key, final YamlEntry ... values) {
        var container = find(key);
        if (Meta.assignable(container, List.class)) {
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

        if (key.contains(".")) {
            final var path = key.substring(0, key.lastIndexOf('.'));
            final var item = key.substring(key.lastIndexOf('.') + 1);
            newMap(path).put(item, list);
        } else {
            newList(key).addAll(list);
        }
    }

    public void put(final String key, final Object value) {
        if (!key.contains(".")) { raw.put(key, value); return; }

        final var path = key.substring(0, key.lastIndexOf('.'));
        final var item = key.substring(key.lastIndexOf('.') + 1);

        var container = find(path);
        if (container == null) {
            container = newMap(path);
        }

        final var map = Meta.cast(container, Map.class);
        map.put(item, value.toString());
    }

    private Map<String, Object> newMap(final String key) {
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

    private List newList(final String key) {
        final var tokens = key.split("\\.");

        Object container = raw;
        for(int i = 0 ; i < tokens.length; ++i) {
            final var token = tokens[i];

            if (Meta.assignable(container, Map.class)) {
                final var map = Meta.cast(container, Map.class);
                if (i != tokens.length - 1) {
                    container = map.get(token);
                } else {
                    container = new ArrayList<>();
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

        return Meta.cast(container, List.class);
    }

    public void save() {
        if (source == null) {
            Logger.warn("Failed to save: Yaml not loaded from a known file");
            return;
        }

        save(source);
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

    public Byte     asByte      (final String key) { return find(key, Byte      .class); }
    public Short    asShort     (final String key) { return find(key, Short     .class); }
    public Integer  asInt       (final String key) { return find(key, Integer   .class); }
    public Long     asLong      (final String key) { return find(key, Long      .class); }
    public Float    asFloat     (final String key) { return find(key, Float     .class); }
    public Boolean  asBoolean   (final String key) { return find(key, Boolean   .class); }
    public Double   asDouble    (final String key) { return find(key, Double    .class); }

    public byte[]   asBytes     (String name) { return Strings.bytes    (asString(name)); }
    public short[]  asShorts    (String name) { return Strings.shorts   (asString(name)); }
    public int[]    asInts      (String name) { return Strings.ints     (asString(name)); }
    public long[]   asLongs     (String name) { return Strings.longs    (asString(name)); }
    public float[]  asFloats    (String name) { return Strings.floats   (asString(name)); }
    public double[] asDoubles   (String name) { return Strings.doubles  (asString(name)); }

    public String asString(final String key) {
        final var string = find(key, String.class);
        return string != null ? string.trim() : null;
    }

    public <T extends Enum<T>> T asEnum(final String key, Class<T> klass) {
        final var value = asString(key);
        for (final var constant : klass.getEnumConstants()) {
            if (constant.name().equals(value)) {
                return constant;
            }
        }

        return null;
    }

    public Tuple[] asTuples(String key) {
        final var properties = new ArrayList<Tuple>();

        for (final var property : list(key)) {
            final var name = property.asString("name");
            final var value = property.asString("value");
            properties.add(new Tuple(name, value));
        }

        return properties.toArray(Tuple[]::new);
    }

    public List<Yaml> list(final String key) {
        final var result = new ArrayList<Yaml>();
        if (Strings.isNumeric(key.substring(key.lastIndexOf('.') + 1))) {
            Logger.warn("Key must relate to a yaml array");
            return result;
        }

        final var found = find(key);
        if (!Meta.assignable(found, List.class)) {
            Logger.warn("Key must relate to a yaml array");
            return result;
        }

        for (final var entry : Meta.cast(found, List.class)) {
            final var yaml = from(Meta.cast(entry, Map.class));
            yaml.source = source;
            result.add(yaml);
        }

        return result;
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
            return from(Meta.cast(result, Map.class));
        }

        if (Meta.assignable(result, List.class)) {
            final var map = new ConcurrentSkipListMap<String, Object>();
            final var desired = key.contains(".") ? key.substring(key.lastIndexOf('.') + 1) : key;
            map.put(desired, result);
            final var yaml = Yaml.from(map);
            yaml.source = source;
            return yaml;
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
        if (value == null) return null;

        if (Meta.assignable(type, Number.class)) {
            if (Meta.assignable(type, Byte.class)) {
                try { return Meta.cast(Byte.parseByte(value.toString()), type); }
                catch (final NumberFormatException ignored) { Logger.fatal("Expected a number, got %s", value); }
            }

            if (Meta.assignable(type, Short.class)) {
                try { return Meta.cast(Short.parseShort(value.toString()), type); }
                catch (final NumberFormatException ignored) { Logger.fatal("Expected a number, got %s", value); }
            }

            if (Meta.assignable(type, Integer.class)) {
                try { return Meta.cast(Integer.parseInt(value.toString()), type); }
                catch (final NumberFormatException ignored) { Logger.fatal("Expected a number, got %s", value); }
            }

            if (Meta.assignable(type, Long.class)) {
                try { return Meta.cast(Long.parseLong(value.toString()), type); }
                catch (final NumberFormatException ignored) { Logger.fatal("Expected a number, got %s", value); }
            }

            if (Meta.assignable(type, Float.class)) {
                try { return Meta.cast(Float.parseFloat(value.toString()), type); }
                catch (final NumberFormatException ignored) { Logger.fatal("Expected a number, got %s", value); }
            }

            if (Meta.assignable(type, Double.class)) {
                try { return Meta.cast(Double.parseDouble(value.toString()), type); }
                catch (final NumberFormatException ignored) { Logger.fatal("Expected a number, got %s", value); }
            }
        }

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

    public String toString() {
        return source == null ? "null" : source.toString();
    }

}
