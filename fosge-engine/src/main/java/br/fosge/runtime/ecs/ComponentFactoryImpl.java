package br.fosge.runtime.ecs;

import br.fosge.commons.*;
import br.fosge.engine.Resources;
import br.fosge.engine.audio.AudioSourceComponent;
import br.fosge.engine.ecs.BehaviourComponent;
import br.fosge.engine.ecs.ComponentFactory;
import br.fosge.engine.ecs.NameComponent;
import br.fosge.engine.physics.RigidBodyComponent;
import br.fosge.engine.physics.SoftBodyComponent;
import br.fosge.engine.renderer.Primitives;
import br.fosge.engine.renderer.TransformComponent;
import br.fosge.engine.renderer.backend.DataType;
import br.fosge.engine.renderer.backend.DrawMode;
import br.fosge.engine.renderer.backend.geometry.BufferLayout;
import br.fosge.engine.renderer.backend.geometry.BufferType;
import br.fosge.engine.renderer.backend.geometry.GeometrySpec;
import br.fosge.engine.renderer.backend.texture.PixelFormat;
import br.fosge.engine.renderer.backend.texture.TextureSpec;
import br.fosge.engine.renderer.frontend.CameraComponent;
import br.fosge.engine.renderer.frontend.MeshComponent;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;

import static br.fosge.RT.Graphics.textureUnitLimit;
import static br.fosge.RT.Platform.filesystem;

public final class ComponentFactoryImpl implements ComponentFactory {

    @Override @Nonnull
    public NameComponent name(@Nullable Tuple... properties) {
        final var component = new NameComponent();
        if (properties != null && properties.length > 0) {
            component.name = Tuples.find("name", properties);
        }

        return component;
    }

    @Override
    public MeshComponent mesh(@Nullable Tuple... properties) {
        final var component = new MeshComponent();
        // ###################################################################
        //
        // SHADER
        //
        // ###################################################################
        component.shader = Resources.shader(Tuples.find("shader", properties));
        if (component.shader == null) {
            Logger.error("Failed to configure shader");
            component.terminate();
            return null;
        }

        Logger.trace("Attaching shader: %s", component.shader);
        // ###################################################################
        //
        // TEXTURE
        //
        // ###################################################################
        for (int i = 0; i < textureUnitLimit; i++) {
            final var predicate = "texture." + i;

            // Expect bind unit to be contiguous
            if (!Tuples.contains( predicate+ ".asset", properties)) { break; }

            final var path = Tuples.find(predicate + ".asset", properties);
            if (path == null) {
                Logger.error("Missing property [texture.<id>.asset].");
                component.terminate();
                return null;
            }

            final var txMips = Tuples.find(predicate+ ".mips", properties);
            final var txFormat = Tuples.find(predicate + ".format", properties);
            if (txFormat == null) {
                Logger.error("Missing property [texture.<id>.format]: %s.", path);
                component.terminate();
                return null;
            }

            final var txStorageFormat = Tuples.find(predicate + ".storageFormat", properties);
            if (txStorageFormat == null) {
                Logger.error("Missing property [texture.<id>.storageFormat]: %s.", path);
                component.terminate();
                return null;
            }

            final var txDataType = Tuples.find(predicate + ".dataType", properties);
            if (txDataType == null) {
                Logger.error("Missing property [texture.<id>.dataType]: %s.", path);
                component.terminate();
                return null;
            }

            final var texture = Resources.texture2d(new TextureSpec(
                    filesystem.assets.resolve(path),
                    txMips != null ? Integer.parseInt(txMips) : 1,
                    PixelFormat.valueOf(txFormat),
                    PixelFormat.valueOf(txStorageFormat),
                    DataType.valueOf(txDataType),
                    Boolean.parseBoolean(Tuples.find(predicate + ".verticalFlip", properties))
            ));

            if (texture == null) {
                Logger.error("Failed to configure texture");
                component.terminate();
                return null;
            }

            Logger.trace("Attaching texture: %s", texture);
            component.textures.add(texture);
        }
        // ###################################################################
        //
        // GEOMETRY
        //
        // ###################################################################
        final var primitive = Tuples.find("geometry.primitive", properties);
        switch (primitive) {
            case "quadrilateral": { component.geometry = Primitives.quadrilateral(); } break;
            case null:
            default: {
                final var layouts = new ArrayList<BufferLayout>();
                for (final var tuple : properties) {
                    if (tuple.name().startsWith("geometry.layout")) {
                        layouts.add(new BufferLayout(
                                tuple.name().substring(tuple.name().lastIndexOf('.') + 1),
                                BufferType.valueOf(tuple.value())
                        ));
                    }
                }

                component.geometry = Resources.geometry(new GeometrySpec(
                        DrawMode.valueOf(Tuples.find("geometry.mode", properties)),
                        DataType.valueOf(Tuples.find("geometry.type", properties)),
                        layouts.toArray(new BufferLayout[0])
                ));

                if (component.geometry == null) {
                    Logger.error("Failed to configure texture");
                    component.terminate();
                    return null;
                }

                component.geometry.elements(Strings.ints(Tuples.find("geometry.elements", properties)));
                component.geometry.vertices(Strings.floats(Tuples.find("geometry.vertices", properties)));
            }
        }

        if (component.geometry == null) {
            Logger.error("Failed to configure geometry");
            component.terminate();
            return null;
        }

        Logger.trace("Attaching geometry: %s", component.geometry);
        return component;
    }

    @Override @Nonnull
    public SoftBodyComponent softBody(@Nullable Tuple... properties) {
        return new SoftBodyComponent();
    }

    @Override @Nonnull
    public TransformComponent transform(@Nullable Tuple... properties) {
        final var component = new TransformComponent();

        final var position = Tuples.find("position", properties);
        if (position != null) { component.position.set(Strings.floats(position)); }

        final var rotation = Tuples.find("rotation", properties);
        if (rotation != null) { component.rotation.set(Strings.floats(rotation)); }

        final var scale = Tuples.find("scale", properties);
        if (scale != null) { component.scale.set(Strings.floats(scale)); }

        return component;
    }

    @Override @Nonnull
    public RigidBodyComponent rigidBody(@Nullable Tuple... properties) {
        return new RigidBodyComponent();
    }

    @Override
    public BehaviourComponent behaviour(@Nullable Tuple... properties) {
        final var target = Tuples.find("target", properties);
        if (target == null) { return null; }

        final var component = Meta.instance(BehaviourComponent.class, target);
        for (final var property : properties) {
            if (!property.name().contains(".")) continue;

            final var tokens = property.name().split("\\.");
            Meta.set(component, tokens[1], property.value());
        }

        return component;
    }

    @Override
    public AudioSourceComponent audioSource(@Nullable Tuple... properties) {
        final var component = new AudioSourceComponent();

        final var sGain = Tuples.find("gain", properties);
        component.gain = sGain != null ? Float.parseFloat(sGain) : 0.5f;
        component.loop = Boolean.parseBoolean(Tuples.find("loop", properties));

        final var buffer = Resources.audioBuffer(Tuples.find("path", properties));
        if (buffer == null) { return null; }

        component.source = Resources.audioSource();
        component.source.initialize();
        component.source.buffer(buffer);
        component.source.gain(component.gain);

        return component;
    }

    @Override
    public CameraComponent camera(@Nullable Tuple... properties) {
        final var component = new CameraComponent();

        if (Tuples.contains("rectangle", properties) && Tuples.contains("depth", properties)) {
            final var sRectangle = Tuples.find("rectangle", properties);
            float[] fRectangle = null;
            if (sRectangle != null) {
                fRectangle = Strings.floats(sRectangle);
                if (fRectangle.length != 4) {
                    Logger.warn("Invalid camera rectangle: Expected 4 elements, got %d", fRectangle.length);
                    return null;
                }
            }

            final var sDepth = Tuples.find("depth", properties);
            float[] fDepth = null;
            if (sDepth != null) {
                fDepth = Strings.floats(sDepth);
                if (fDepth.length != 2) {
                    Logger.warn("Invalid camera depth: Expected 2 elements, got %d", fDepth.length);
                    return null;
                }
            }

            if (fRectangle == null || fDepth == null) { return null; }

            Logger.debug("Rectangle [left=" +
                    fRectangle[0] + ", right=" +
                    fRectangle[1] + ", bottom=" +
                    fRectangle[2] + ", top=" +
                    fRectangle[3] + "] Depth [near=" +
                    fDepth[0] + ", far=" +
                    fDepth[1] + "]"
            );

            component.projection.ortho(
                    fRectangle[0], fRectangle[1],
                    fRectangle[2], fRectangle[3],
                    fDepth[0], fDepth[1]
            );

        }

        return component;
    }
}
