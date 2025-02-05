package br.fosge.runtime.renderer.dd;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.commons.Meta;
import br.fosge.commons.annotation.Specification;
import br.fosge.engine.ecs.ComponentFactory;
import br.fosge.engine.renderer.frontend.Camera;
import br.fosge.engine.renderer.TransformComponent;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;

import javax.annotation.Nonnull;

import static br.fosge.RT.Graphics.projectionMatrix;

public final class Camera2D implements Camera {
    private final TransformComponent transform = RT.Factory.component.transform();
    private final Matrix4f viewMatrix = new Matrix4f();
    private final Matrix4f viewProjectionMatrix = new Matrix4f();

    private final Vector3f position = new Vector3f();
    private final Vector3f rotation = new Vector3f(-1 ,-1, -1);

    @Override
    public boolean initialize() {
        projectionMatrix = new Matrix4f();

        return true;
    }

    @Override
    public boolean configure(Specification specification) {
        final var spec = Meta.cast(specification, Camera2DSpec.class);

        Logger.debug(spec.toString());
        projectionMatrix.ortho(
                spec.left()  , spec.right(),
                spec.bottom(), spec.top(),
                spec.near()  , spec.far()
        );

        return true;
    }

    @Override
    @Nonnull
    public Matrix4fc projectionMatrix() {
        return projectionMatrix;
    }

    @Override
    @Nonnull
    public Matrix4fc viewProjectionMatrix() {
        // Do not recalculate if it didn't move
        if (position.equals(transform.position) && rotation.equals(transform.rotation)) {
            return viewProjectionMatrix;
        }

        Logger.trace("recalculating viewProjectionMatrix");
        position.set(transform.position);
        rotation.set(transform.rotation);
        return viewProjectionMatrix
                .set(projectionMatrix)
                .mul(viewMatrix
                                .translate(position)
                                .rotateZ(rotation.z)
                                .invert()
                );
    }
}
