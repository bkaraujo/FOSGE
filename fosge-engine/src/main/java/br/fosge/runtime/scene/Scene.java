package br.fosge.runtime.scene;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.commons.Meta;
import br.fosge.commons.Strings;
import br.fosge.commons.Tuples;
import br.fosge.commons.annotation.Lifecycle;
import br.fosge.commons.serializer.Yaml;
import br.fosge.engine.ecs.Actor;
import br.fosge.engine.ecs.ComponentType;
import br.fosge.engine.ecs.ECS;
import br.fosge.engine.renderer.TransformComponent;
import br.fosge.engine.renderer.backend.*;
import br.fosge.engine.renderer.frontend.CameraComponent;
import br.fosge.runtime.platform.binding.opengl.api.GL11;
import br.fosge.runtime.renderer.Renderer;
import br.fosge.runtime.renderer.backend.opengl.GLParser;
import com.github.f4b6a3.ulid.Ulid;
import com.github.f4b6a3.ulid.UlidCreator;
import org.joml.Vector4f;
import org.joml.Vector4fc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import static br.fosge.runtime.platform.Bindings.opengl;

public record Scene (
        Ulid identity,
        String name,
        Yaml yaml,
        List<Actor> actors
) implements Lifecycle {

    public static Scene of (String name) {
        Yaml yaml = null;

        for (final var candidate : RT.yaml.list("fosge.application.scenes")) {
            final var candidateName = candidate.asString("name");
            if (candidateName == null) { Logger.warn("Ignoring malformed scene, name property not found"); continue; }
            if (candidateName.equals(name)) { yaml = candidate; break; }
        }

        if (yaml == null) { Logger.error("Scene not found: %s", name); return null; }

        Ulid identity;
        if (!yaml.contains("identity")) { identity = UlidCreator.getMonotonicUlid(); }
        else { identity = Ulid.from(yaml.asString("identity")); }

        return new Scene(identity, name, yaml, new ArrayList<>());
    }

    @Override
    public boolean initialize() {
        Logger.debug("%s :: Initializing", identity);
        // #############################################################
        // Setup scene-wide configurations
        // #############################################################
        Renderer.submit((Callable<Void>) () -> {
            var enabled = yaml.asBoolean("depth.enabled");
            if (enabled != null && enabled) { opengl.glEnable(GL11.GL_DEPTH_TEST); }

            final var function = yaml.asEnum("depth.function", DepthFunction.class);
            opengl.glDepthFunc(GLParser.parse(function != null ? function : DepthFunction.LEQUAL));

            enabled = yaml.asBoolean("blend.enabled");
            if (enabled != null && enabled) { opengl.glEnable(GL11.GL_BLEND); }
            final var equation = yaml.asEnum("blend.equation", BlendEquation.class);
            opengl.glBlendEquation(GLParser.parse(equation != null ? equation : BlendEquation.FUNC_ADD));
            final var srcFunction = yaml.asEnum("blend.function.source", BlendFunction.class);
            final var tgtFunction = yaml.asEnum("blend.function.target", BlendFunction.class);
            opengl.glBlendFunc(
                    GLParser.parse(srcFunction != null ? srcFunction : BlendFunction.SRC_ALPHA),
                    GLParser.parse(tgtFunction != null ? tgtFunction : BlendFunction.ONE_MINUS_SRC_ALPHA)
            );

            enabled = yaml.asBoolean("cullface.enabled");
            if (enabled != null && enabled) { opengl.glEnable(GL11.GL_CULL_FACE); }
            final var cullMode = yaml.asEnum("cullface.mode", CullFaceMode.class);
            opengl.glCullFace(GLParser.parse(cullMode != null ? cullMode : CullFaceMode.BACK));

            var hint = yaml.asEnum("line.smooth", SmoothHints.class);
            if (hint != null) {
                opengl.glEnable(GL11.GL_LINE_SMOOTH);
                opengl.glHint(GL11.GL_LINE_SMOOTH_HINT, GLParser.parse(hint));
            }

            return null;
        });

        final var camera = Actor.create("Camera");
        camera.attach(CameraComponent.class, yaml.asTuples("camera.properties"));
        actors.add(camera);
        // #############################################################
        // Create the actors
        // #############################################################
        for (final var candidate : yaml.list("actors")) {
            final var actor = attach(candidate);
            if (actor == null) { continue; }
            if (!actor.initialize()) { return false; }
            actors.add(actor);
        }

        return true;
    }

    private Actor attach(final Yaml candidate) {
        // -------------------------------------------------
        // Create the actor in the ECS database
        // -------------------------------------------------
        final var sIdentity = candidate.asString("identity");

        Actor actor;
        if (sIdentity == null) {
            actor = Actor.from(UlidCreator.getMonotonicUlid());
            candidate.put("identity", actor.identity().toString());
        } else {
            actor = Actor.from(Ulid.from(sIdentity));
        }

        ECS.prepare(actor.identity());
        // -------------------------------------------------
        // Create the actor's components
        // -------------------------------------------------
        for (final var component : candidate.list("components")) {
            ComponentType type;
            try { type = ComponentType.valueOf(component.asString("type")); }
            catch (IllegalArgumentException ignored) {
                Logger.error("Invalid component type: " + component.asString("type"));
                return null;
            }

            switch (type) {
                case NAME_COMPONENT: {
                    final var name = Tuples.find("name", component.asTuples("properties"));
                    if (name != null) { actor.name().name = name; }
                } break;
                case TRANSFORM_COMPONENT: {
                    final var desired = RT.Factory.component.transform(component.asTuples("properties"));
                    actor.transform().scale.set(desired.scale);
                    actor.transform().rotation.set(desired.rotation);
                    actor.transform().position.set(desired.position);
                } break;
                default: {
                    final var instance = actor.attach(type.klass, component.asTuples("properties"));
                    if (instance == null) { continue; }

                    if (type == ComponentType.BEHAVIOUR_COMPONENT) {
                        Meta.set(instance, "transform", actor.get(TransformComponent.class));
                    }
                }
            }
        }

        Logger.debug("%s :: attaching actor %s", identity, actor.identity());
        return actor;
    }

    public Actor camera() {
        return actors.getFirst();
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
        return identity.toString();
    }
}
