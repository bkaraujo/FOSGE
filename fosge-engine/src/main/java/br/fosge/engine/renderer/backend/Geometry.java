package br.fosge.engine.renderer.backend;

import br.fosge.commons.annotation.Configurable;

public interface Geometry extends GraphicsObject, Configurable {

    DrawMode mode();
    DataType indexType();

    int elements();
    void elements(byte ... values);
    void elements(short ... values);
    void elements(int ... values);

    void vertices(float ... values);

}
