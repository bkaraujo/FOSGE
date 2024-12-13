package br.fosge.editor.ui.component;

import javax.swing.*;

public class FGButtonGroup extends ButtonGroup {

    public <T> T add(Class<T> type, AbstractButton b) {
        super.add(b);
        return type.cast(b);
    }

}
