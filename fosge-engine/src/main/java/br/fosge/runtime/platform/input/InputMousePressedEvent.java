package br.fosge.runtime.platform.input;

import br.fosge.input.Mouse;

public final class InputMousePressedEvent extends InputMouseEvent {
    public final Mouse button;

    public InputMousePressedEvent(Mouse button) {
        this.button = button;
    }
}
