package br.fosge.engine.runtime.application;

import br.fosge.Logger;
import br.fosge.Version;
import br.fosge.engine.configuration.*;
import br.fosge.engine.ecs.ComponentType;
import br.fosge.graphics.Resolution;
import br.fosge.logger.LogLevel;
import br.fosge.tools.Meta;
import br.fosge.tools.Yaml;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static br.fosge.engine.runtime.Resources.ROOTFS;

public abstract class ApplicationYaml {
    private static Configuration configuration;

    public static Configuration get() {
        if (configuration != null) return configuration;
        final var yaml = Yaml.load(ROOTFS.resolve("application.yaml"));

        configuration = new Configuration(
                new Engine(
                        read(Boolean.class, yaml, "engine.debug"),
                        LogLevel.valueOf(read(String.class, yaml, "engine.logger.level"))
                ),
                new Application(
                        read(String.class, yaml, "application.name"),
                        new Version(
                                read(Integer.class, yaml, "application.version.major"),
                                read(Integer.class, yaml, "application.version.minor"),
                                read(Integer.class, yaml, "application.version.revision")
                        ),
                        new Window(
                                read(String.class, yaml, "application.window.title"),
                                Resolution.valueOf(read(String.class, yaml, "application.window.resolution"))
                        ),
                        new Graphics(
                                read(Boolean.class, yaml, "application.graphics.vsync")
                        ),
                        list(yaml, "application.scenes").stream().map(entry -> (Map<String, Object>) entry).map(scene -> new Scene(
                                read(String.class, scene, "name"),
                                new Color(
                                        read(Double.class, scene, "clearColor.red").floatValue(),
                                        read(Double.class, scene, "clearColor.green").floatValue(),
                                        read(Double.class,  scene, "clearColor.blue").floatValue(),
                                        read(Double.class, scene, "clearColor.alpha").floatValue()
                                ),
                                new Camera(
                                        read(Double.class, scene, "camera.left").floatValue(),
                                        read(Double.class, scene, "camera.right").floatValue(),
                                        read(Double.class, scene, "camera.bottom").floatValue(),
                                        read(Double.class, scene, "camera.top").floatValue(),
                                        read(Double.class, scene, "camera.near").floatValue(),
                                        read(Double.class, scene, "camera.far").floatValue()
                                ),
                                list(scene, "layers").stream().map(entry -> (Map<String, Object>) entry).map(layer -> new Layer(
                                        read(String.class, layer, "name"),
                                        list(layer, "actors").stream().map(entry -> (Map<String, Object>) entry).map(actor -> new Actor(
                                                read(String.class, actor, "name"),
                                                list(actor, "components").stream().map(entry -> (Map<String, Object>) entry).map(component -> new Component(
                                                        ComponentType.valueOf(read(String.class, component, "type")),
                                                        list(component, "properties").stream().map(entry -> (Map<String, Object>) entry).map(property -> new Tuple(
                                                                read(String.class, property, "name"),
                                                                read(String.class, property, "value")
                                                        )).toArray(Tuple[]::new)
                                                )).toArray(Component[]::new)
                                        )).toArray(Actor[]::new)
                                )).toArray(Layer[]::new)
                        )).toArray(Scene[]::new)
                )
        );

        return configuration;
    }

    private static <T> T read(Class<T> klass, Map<String, Object> yaml, String name) {
        final var tokens = name.split("\\.");

        Object value = null;
        for (int i = 0; i < tokens.length; ++i) {
            final var token = tokens[i];

            if (value == null) {
                value = ensureKey(yaml, name, token);
                continue;
            }

            if (Meta.assignable(value, Map.class)) {
                final var map = Meta.cast(value, Map.class);
                value = ensureKey(map, name, token);
                continue;
            }

            if (Meta.assignable(value, List.class)) {
                if (i == tokens.length - 1) {
                    Logger.fatal("Element '%s' is a list", name);
                }
            }
        }

        if (value == null) { return null; }
        return ensureType(klass, name, value);
    }

    private static List<Object> list (Map<String, Object> yaml, String name) {
        final var tokens = name.split("\\.");

        Object value = null;
        for (int i = 0; i < tokens.length; ++i) {
            final var token = tokens[i];
            if (value == null) {
                value = yaml.getOrDefault(token, new ArrayList<>());
                continue;
            }

            if (Meta.assignable(value, Map.class)) {
                final var map = Meta.cast(value, Map.class);
                value = map.getOrDefault(token, new ArrayList<>());
                continue;
            }

            if (Meta.assignable(value, List.class)) {
                if (i != tokens.length - 1) {
                    Logger.fatal("Element '%s' is not leaf", name);
                }
            }
        }

        if (value == null || !Meta.assignable(value, List.class)) {
            Logger.fatal("Element '%s' is not a list", name);
        }

        return Meta.cast(value, List.class);
    }

    private static Object ensureKey(Map<String, Object> map, String name, String token) {
        if (!map.containsKey(token)) {
            Logger.fatal("Missing '%s' in application.yaml", name);
        }

        return map.get(token);
    }

    private static <T> T ensureType(Class<T> klass, String name, Object value) {
        if (!Meta.assignable(value, klass)) {
            Logger.fatal("Element '%s' type miss match. Expected '%s' got '%s'", name, Meta.fqn(klass), Meta.fqn(value));
        }

        return Meta.cast(value, klass);
    }
}
