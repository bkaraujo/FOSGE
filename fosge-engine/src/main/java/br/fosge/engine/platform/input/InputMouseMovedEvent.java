package br.fosge.engine.platform.input;

public final class InputMouseMovedEvent extends InputMouseEvent {
    public final int x;
    public final int y;

    public InputMouseMovedEvent(double x, double y) {
        this.x = (int) x;
        this.y = (int) y;
    }
}
