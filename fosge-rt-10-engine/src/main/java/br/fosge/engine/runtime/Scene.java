package br.fosge.engine.runtime;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.commons.serializer.Yaml;
import br.fosge.engine.ecs.Actor;
import br.fosge.engine.renderer.Camera;
import com.github.f4b6a3.ulid.Ulid;
import com.github.f4b6a3.ulid.UlidCreator;
import org.joml.Vector4f;
import org.joml.Vector4fc;

import java.util.ArrayList;
import java.util.List;

public record Scene(
        Ulid identity,
        String name,
        Yaml yaml,
        Camera camera,
        List<Actor> actors
) {

    public static Scene of (String name) {
        Yaml yaml = null;
        for (final var candidate : RT.yaml.list("fosge.application.scenes")) {
            final var candidateName = candidate.asString("name");
            if (candidateName == null) {
                Logger.warn("Ignoring malformed scene, name property not found");
                continue;
            }

            if (candidateName.equals(name)) {
                yaml = candidate;
                break;
            }
        }

        if (yaml == null) { Logger.error("Scene not found: %s", name); return null; }
        return new Scene(name, Camera.from(yaml.subtree("camera")), yaml);
    }

    private Scene(String name, Camera camera, Yaml yaml) {
        this(UlidCreator.getMonotonicUlid(), name, yaml, camera, new ArrayList<>());
        for (final var found : yaml.list("actors")) {
            actors.add(Actor.from(found));
        }
    }

    public Vector4fc clearColor() {
        final var tokens = yaml.asString("clearColor").split(",");
        if (tokens.length < 3 || tokens.length > 4) {
            Logger.fatal("Scene clear color must have 3 float values and optionally alpha value.");
        }

        try {
            return new Vector4f(
                    Float.parseFloat(tokens[0]),
                    Float.parseFloat(tokens[1]),
                    Float.parseFloat(tokens[2]),
                    tokens.length == 3 ? 1.0f : Float.parseFloat(tokens[3])
            );
        } catch (NumberFormatException ignored) {
            Logger.fatal("Failed to parse clear color value.");
            return new Vector4f();
        }
    }
}
