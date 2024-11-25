package br.fosge.runtime.scene;

import br.fosge.Logger;
import br.fosge.Meta;
import br.fosge.annotation.Specification;
import br.fosge.renderer.Transform;
import br.fosge.runtime.Runtime;
import br.fosge.scene.Camera;
import br.fosge.scene.Camera2DSpec;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;

public final class Camera2D implements Camera {
    public final Transform transform = Transform.origin();
    private final Matrix4f projectionMatrix = new Matrix4f();
    private final Matrix4f viewMatrix = new Matrix4f();
    private final Matrix4f viewProjectionMatrix = new Matrix4f();

    private final Vector3f position = new Vector3f();
    private final Vector3f rotation = new Vector3f(-1 ,-1, -1);

    @Override
    public boolean initialize() {
        return Camera.super.initialize();
    }

    @Override
    public boolean configure(Specification specification) {
        if (Runtime.CHECKS && !Meta.assignable(specification, Camera2DSpec.class)) {
            Logger.error("Expecting %s got %s", Meta.fqn(Camera2DSpec.class), Meta.fqn(specification));
            return false;
        }

        final var spec = Meta.cast(specification, Camera2DSpec.class);

        projectionMatrix.ortho(
                spec.left()  , spec.right(),
                spec.bottom(), spec.top(),
                spec.near()  , spec.far()
        );

        return true;
    }

    @Override
    public Matrix4fc projectionMatrix() {
        return projectionMatrix;
    }

    @Override
    public Matrix4fc viewProjectionMatrix() {
        if (position.equals(transform.position()) && rotation.equals(transform.rotation())) {
            return viewProjectionMatrix;
        }

        Logger.trace("recalculating viewProjectionMatrix");
        position.set(transform.position());
        rotation.set(transform.rotation());
        return viewProjectionMatrix
                .set(projectionMatrix)
                .mul(viewMatrix
                                .translate(position)
                                .rotateZ(rotation.z)
                                .invert()
                );
    }
}
