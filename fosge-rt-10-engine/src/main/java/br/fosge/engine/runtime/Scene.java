package br.fosge.engine.runtime;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.commons.serializer.Yaml;
import br.fosge.engine.ecs.Actor;
import br.fosge.engine.renderer.Camera;
import br.fosge.engine.renderer.dd.Camera2D;
import br.fosge.engine.renderer.dd.Camera2DSpec;
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

        if (yaml == null) {
            Logger.error("Scene not found: %s", name);
            return null;
        }
        // ########################################################################
        // If there is not information about camera, assume 2D
        // ########################################################################
        if (!yaml.contains("camera")) {
            final var camera = new Camera2D();
            camera.configure(new Camera2DSpec(3f, 1f));
            return new Scene(name, camera, yaml);
        }
        // ########################################################################
        // If it has the elements for a 2D camera, go for it
        // ########################################################################
        Logger.debug("Checking for 2D Camera");
        if (yaml.contains("camera.rectangle") && yaml.contains("camera.depth")) {
            final var camera = new Camera2D();
            final var rectangle = yaml.asFloats("camera.rectangle");
            if (rectangle.length != 4) {
                Logger.warn("Invalid camera rectangle: Expected 4 elements, got %d", rectangle.length);
                return null;
            }

            final var depth = yaml.asFloats("camera.depth");
            if (depth.length != 2) {
                Logger.warn("Invalid camera depth: Expected 2 elements, got %d", rectangle.length);
                return null;
            }

            camera.configure(new Camera2DSpec(
                    rectangle[0], rectangle[1], rectangle[2], rectangle[3],
                    depth[0], depth[1]
            ));

            return new Scene(name, camera, yaml);
        }
        // ########################################################################
        // If it has the elements for a 3D camera, go for it
        // ########################################################################
        Logger.debug("Checking for 3D Camera");
        if (yaml.contains("camera.frustum")) {
            final var camera = new Camera2D();
            camera.configure(new Camera2DSpec(3f, 1f));

            return new Scene(name, camera, yaml);
        }

        Logger.error("Failed to determine if scene is 2D or 3D");
        return null;
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
        } catch (NumberFormatException _) {
            Logger.fatal("Failed to parse clear color value.");
            return new Vector4f();
        }
    }
}
