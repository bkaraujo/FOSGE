package br.fosge.engine.platform.window;

public final class WindowResizedEvent extends WindowEvent {
    public final int width;
    public final int height;

    public WindowResizedEvent(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
