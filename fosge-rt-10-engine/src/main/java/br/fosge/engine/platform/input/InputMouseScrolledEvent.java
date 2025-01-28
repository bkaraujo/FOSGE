package br.fosge.engine.platform.input;

public final class InputMouseScrolledEvent extends InputMouseEvent {
    public final byte scroll;

    public InputMouseScrolledEvent(byte scroll) {
        this.scroll = scroll;
    }
}
