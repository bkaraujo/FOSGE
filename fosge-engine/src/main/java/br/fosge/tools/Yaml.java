package br.fosge.tools;

import br.fosge.Logger;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.nio.file.Path;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Yaml {
    private static final ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

    public static Map<String, Object> load(Path file) {
        try {
            final var map = mapper.readValue(file.toFile(), Map.class);
            return Collections.unmodifiableMap(map);
        } catch (Throwable throwable) {
            Logger.error("Failed to read %s: %s", file, throwable);
            return new HashMap<>();
        }
    }

//    public static Map<String, Object> load(Path file) {
//        try {
//            final var map = new HashMap<String, Object>(20);
//
//            flatten(
//                    mapper.readValue(file.toFile(), Map.class),
//                    map,
//                    null
//            );
//
//            return Collections.unmodifiableMap(map);
//        } catch (Throwable throwable) {
//            Logger.error("Failed to read %s: %s", file, throwable);
//            return new HashMap<>();
//        }
//    }

//    private static void flatten(Map<String, Object> in, Map<String, Object> out, String parent) {
//        if (in == null || in.isEmpty()){ return; }
//        in.keySet().forEach( x -> {
//            String keyBeingProcessed;
//
//            if(parent != null && out.containsKey(parent)){
//                final var currentKey = parent + "." + x;
//                out.put(currentKey, null);
//                keyBeingProcessed = currentKey;
//            } else {
//                out.put(x, null);
//                keyBeingProcessed = x;
//            }
//
//            final var o = in.get(x);
//            out.put(keyBeingProcessed,o);
//
//            if(o instanceof Map) {
//                flatten((Map)in.get(x), out, keyBeingProcessed);
//            } else if (o instanceof List<?> list)  {
//                int counter = 0;
//                for (final var obj: list){
//                    if (obj instanceof  Map) {
//                        final var currentKey = keyBeingProcessed + ".[" + counter + "]";
//                        out.put(currentKey, null);
//                        flatten((Map) obj, out, currentKey);
//                    }
//                }
//            }
//        });
//    }
}