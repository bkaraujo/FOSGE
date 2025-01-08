package br.fosge.editor.ui;

import br.fosge.commons.annotation.State;

import java.awt.*;

public abstract class UIState implements State {
    private UIState(){/* Private constructor */}

    public static Component lastFocus;

}
