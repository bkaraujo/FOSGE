package br.fosge.runtime.platform.input;

import br.fosge.input.Mouse;

public final class InputMouseReleasedEvent extends InputMouseEvent {
    public final Mouse button;

    public InputMouseReleasedEvent(Mouse button) {
        this.button = button;
    }
}
