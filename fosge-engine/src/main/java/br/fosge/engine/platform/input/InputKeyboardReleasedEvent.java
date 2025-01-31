package br.fosge.engine.platform.input;

import br.fosge.engine.input.Keyboard;

public final class InputKeyboardReleasedEvent extends InputKeyboardEvent {
    public InputKeyboardReleasedEvent(Keyboard key) {
        super(key);
    }
}
