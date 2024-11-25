package br.fosge.runtime.platform.input;

import br.fosge.input.Keyboard;

public final class InputKeyboardPressedEvent extends InputKeyboardEvent {
    public InputKeyboardPressedEvent(Keyboard key) {
        super(key);
    }
}
