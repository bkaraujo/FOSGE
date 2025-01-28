package br.fosge.engine.platform.input;

import br.fosge.engine.input.Mouse;

public final class InputMouseReleasedEvent extends InputMouseEvent {
    public final Mouse button;

    public InputMouseReleasedEvent(Mouse button) {
        this.button = button;
    }
}
