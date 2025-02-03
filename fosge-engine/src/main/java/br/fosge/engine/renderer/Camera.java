package br.fosge.engine.renderer;

import br.fosge.commons.Logger;
import br.fosge.commons.annotation.Configurable;
import br.fosge.commons.annotation.Lifecycle;
import br.fosge.commons.serializer.Yaml;
import br.fosge.engine.runtime.renderer.dd.Camera2D;
import br.fosge.engine.runtime.renderer.dd.Camera2DSpec;
import org.joml.Matrix4fc;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface Camera extends Lifecycle, Configurable {

    @Nonnull
    Matrix4fc projectionMatrix();

    @Nonnull
    Matrix4fc viewProjectionMatrix();

    @Nullable
    static Camera from(@Nullable final Yaml yaml) {
        if (yaml == null) {
            final var camera = new Camera2D();
            camera.configure(new Camera2DSpec(3f, 1f));
            return camera;
        }
        // ########################################################################
        Logger.debug("Checking for 2D Camera");
        // ########################################################################
        if (yaml.contains("rectangle") && yaml.contains("depth")) {
            final var camera = new Camera2D();
            if (!camera.initialize()) { Logger.fatal("Failed to initialize camera"); }

            final var rectangle = yaml.asFloats("rectangle");
            if (rectangle.length != 4) {
                Logger.warn("Invalid camera rectangle: Expected 4 elements, got %d", rectangle.length);
                return null;
            }

            final var depth = yaml.asFloats("depth");
            if (depth.length != 2) {
                Logger.warn("Invalid camera depth: Expected 2 elements, got %d", rectangle.length);
                return null;
            }

            camera.configure(new Camera2DSpec(
                    rectangle[0], rectangle[1], rectangle[2], rectangle[3],
                    depth[0], depth[1]
            ));

            return camera;
        }
        // ########################################################################
        Logger.debug("Checking for 3D Camera");
        // ########################################################################
        if (yaml.contains("frustum")) {
            final var camera = new Camera2D();
            camera.configure(new Camera2DSpec(3f, 1f));

            return camera;
        }

        Logger.error("Failed to determine if scene is 2D or 3D");
        return null;
    }
}
