package br.fosge.engine.runtime.platform.input;

import br.fosge.engine.input.Keyboard;

public final class InputKeyboardPressedEvent extends InputKeyboardEvent {
    public InputKeyboardPressedEvent(Keyboard key) {
        super(key);
    }
}
