package br.fosge.runtime.ecs;

import br.fosge.commons.*;
import br.fosge.engine.audio.AudioSourceComponent;
import br.fosge.engine.ecs.BehaviourComponent;
import br.fosge.engine.ecs.ComponentFactory;
import br.fosge.engine.ecs.NameComponent;
import br.fosge.engine.graphics.DataType;
import br.fosge.engine.graphics.DrawMode;
import br.fosge.engine.graphics.geometry.BufferLayout;
import br.fosge.engine.graphics.geometry.BufferType;
import br.fosge.engine.graphics.geometry.GeometrySpec;
import br.fosge.engine.graphics.texture.PixelFormat;
import br.fosge.engine.graphics.texture.TextureSpec;
import br.fosge.engine.physics.RigidBodyComponent;
import br.fosge.engine.physics.SoftBodyComponent;
import br.fosge.engine.renderer.MeshComponent;
import br.fosge.engine.renderer.TransformComponent;
import br.fosge.runtime.Resources;
import br.fosge.runtime.graphics.Primitives;

import java.util.ArrayList;

import static br.fosge.RT.Graphics.textureUnitLimit;
import static br.fosge.RT.Platform.filesystem;

public final class ComponentFactoryImpl implements ComponentFactory {

    @Override
    public NameComponent name(Tuple... properties) {
        final var component = new NameComponent();
        component.name = Tuples.find("name", properties);

        return component;
    }

    @Override
    public MeshComponent mesh(Tuple... properties) {
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

    @Override
    public SoftBodyComponent softBody(Tuple... properties) {
        return new SoftBodyComponent();
    }

    @Override
    public TransformComponent transform(Tuple... properties) {
        final var component = new TransformComponent();

        final var position = Tuples.find("position", properties);
        if (position != null) { component.position.set(Strings.floats(position)); }

        final var rotation = Tuples.find("rotation", properties);
        if (rotation != null) { component.rotation.set(Strings.floats(rotation)); }

        final var scale = Tuples.find("scale", properties);
        if (scale != null) { component.scale.set(Strings.floats(scale)); }

        return component;
    }

    @Override
    public RigidBodyComponent rigidBody(Tuple... properties) {
        return new RigidBodyComponent();
    }

    @Override
    public BehaviourComponent behaviour(Tuple... properties) {
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
    public AudioSourceComponent audioSource(Tuple... properties) {
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

}
