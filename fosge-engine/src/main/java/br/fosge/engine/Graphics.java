package br.fosge.engine;

import br.fosge.RT;
import br.fosge.commons.annotation.Facade;
import org.joml.Matrix4fc;
import org.joml.Vector2ic;

public abstract class Graphics implements Facade {

    public static final Vector2ic windowSize = RT.Window.size;
    public static final Matrix4fc projectionMatrix = RT.Graphics.projectionMatrix;

}
