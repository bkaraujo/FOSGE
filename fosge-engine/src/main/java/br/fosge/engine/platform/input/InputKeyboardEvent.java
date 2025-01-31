package br.fosge.engine.platform.input;

import br.fosge.engine.input.Keyboard;

public abstract class InputKeyboardEvent extends InputEvent {
    public final Keyboard key;

    protected InputKeyboardEvent(Keyboard key) {
        this.key = key;
    }
}
