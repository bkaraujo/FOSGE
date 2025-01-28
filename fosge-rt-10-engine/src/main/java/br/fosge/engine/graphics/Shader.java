package br.fosge.engine.graphics;

import br.fosge.commons.annotation.Configurable;
import br.fosge.commons.annotation.Reference;
import org.joml.*;

public interface Shader extends GraphicsObject, Configurable, Reference {

    boolean uniform(String name, int ... values);
    boolean uniform(String name, float ... values);
    boolean uniform(String name, int rows, int columns, float ... values);

    boolean uniform(String name, Matrix2fc matrix);
    boolean uniform(String name, Matrix3fc matrix);
    boolean uniform(String name, Matrix3x2fc matrix);
    boolean uniform(String name, Matrix4fc matrix);
    boolean uniform(String name, Matrix4x3fc matrix);
}
