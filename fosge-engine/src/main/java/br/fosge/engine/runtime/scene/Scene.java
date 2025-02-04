package br.fosge.engine.runtime.scene;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.commons.Strings;
import br.fosge.commons.annotation.Lifecycle;
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
) implements Lifecycle {

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

        Ulid identity;
        if (!yaml.contains("identity")) { identity = UlidCreator.getMonotonicUlid(); }
        else { identity = Ulid.from(yaml.asString("identity")); }

        return new Scene(identity, name, yaml, Camera.from(yaml.subtree("camera")), new ArrayList<>());
    }

    @Override
    public boolean initialize() {
        for (final var found : yaml.list("actors")) {
            final var actor = new ActorImpl(Ulid.from(found.asString("identity")), found);
            if (!actor.initialize()) { Logger.error("Failed to initialize actor: %s", actor); return false; }
            actors.add(actor);
        }

        return true;
    }

    public Vector4fc clearColor() {
        final var value = yaml.asString("clearColor");
        if (value == null) { return new Vector4f(); }

        final var tokens = Strings.floats(value);
        if (tokens.length < 3 || tokens.length > 4) {
            Logger.fatal("Scene clear color must have 3 float values and optionally alpha value.");
        }

        try {
            return new Vector4f(tokens[0], tokens[1], tokens[2], tokens.length == 3 ? 1.0f : tokens[3]);
        } catch (NumberFormatException ignored) {
            Logger.fatal("Failed to parse clear color value.");
            return new Vector4f();
        }
    }

    @Override
    public boolean terminate() {
        for (final var actor : actors) {
            if (!actor.terminate()) {
                Logger.error("Failed to terminate actor: %s", actor);
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return identity + ": <" + name + ">";
    }
}
