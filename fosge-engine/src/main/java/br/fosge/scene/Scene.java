package br.fosge.scene;

import br.fosge.annotation.Lifecycle;
import br.fosge.runtime.OnFrame;

public final class Scene implements Lifecycle, OnFrame {

    public final String name;
    private Scene(String name) {
        this.name = name;
    }

}
