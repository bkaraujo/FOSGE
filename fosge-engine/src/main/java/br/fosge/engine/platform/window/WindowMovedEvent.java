package br.fosge.engine.platform.window;

public final class WindowMovedEvent extends WindowEvent {
    public final int x;
    public final int y;

    public WindowMovedEvent(final int x, final int y) {
        this.x = x;
        this.y = y;
    }
}
