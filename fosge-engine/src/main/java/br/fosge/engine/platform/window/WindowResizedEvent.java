package br.fosge.engine.platform.window;

import org.joml.Vector2i;
import org.joml.Vector2ic;

public final class WindowResizedEvent extends WindowEvent {
    public final int width;
    public final int height;

    public WindowResizedEvent(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Vector2ic size() {
        return new Vector2i(width, height);
    }
}
