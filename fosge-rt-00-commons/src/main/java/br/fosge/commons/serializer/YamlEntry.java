package br.fosge.commons.serializer;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public record YamlEntry (
        String key,
        Object value
) {

    public Map<String, Object> toMap() {
        final var map = new ConcurrentSkipListMap<String, Object>();
        map.put(key, value);
        return map;
    }

}
