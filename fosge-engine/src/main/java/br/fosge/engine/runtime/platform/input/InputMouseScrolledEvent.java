package br.fosge.engine.runtime.platform.input;

public final class InputMouseScrolledEvent extends InputMouseEvent {
    public final byte scroll;

    public InputMouseScrolledEvent(byte scroll) {
        this.scroll = scroll;
    }
}
