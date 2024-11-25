package br.fosge.runtime.platform.input;

import br.fosge.input.Keyboard;

public abstract class InputKeyboardEvent extends InputEvent {
    public final Keyboard key;

    protected InputKeyboardEvent(Keyboard key) {
        this.key = key;
    }
}
