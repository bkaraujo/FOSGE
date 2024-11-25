package br.fosge.runtime.platform.input;

import br.fosge.input.Keyboard;

public final class InputKeyboardReleasedEvent extends InputKeyboardEvent {
    public InputKeyboardReleasedEvent(Keyboard key) {
        super(key);
    }
}
