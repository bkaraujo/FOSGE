package br.fosge.engine.platform.input;

import br.fosge.engine.input.Mouse;

public final class InputMousePressedEvent extends InputMouseEvent {
    public final Mouse button;

    public InputMousePressedEvent(Mouse button) {
        this.button = button;
    }
}
