package br.fosge.graphics;

import br.fosge.annotation.Configurable;
import org.joml.*;

public interface Shader extends GraphicsObject, Configurable {

    boolean uniform(String name, int ... values);
    boolean uniform(String name, float ... values);
    boolean uniform(String name, int rows, int columns, float ... values);

    boolean uniform(String name, Matrix2fc matrix);
    boolean uniform(String name, Matrix3fc matrix);
    boolean uniform(String name, Matrix3x2fc matrix);
    boolean uniform(String name, Matrix4fc matrix);
    boolean uniform(String name, Matrix4x3fc matrix);
}