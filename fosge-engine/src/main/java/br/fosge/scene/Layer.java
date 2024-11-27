package br.fosge.scene;

import br.fosge.annotation.Lifecycle;
import br.fosge.runtime.OnFrame;

public final class Layer implements Lifecycle, OnFrame {

    public final String name;
    public Layer(String name) {
        this.name = name;
    }

}
