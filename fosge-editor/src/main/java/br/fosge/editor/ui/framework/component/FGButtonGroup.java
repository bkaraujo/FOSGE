package br.fosge.editor.ui.framework.component;

import javax.swing.*;

public class FGButtonGroup extends ButtonGroup {

    public <T> T add(Class<T> type, AbstractButton b) {
        super.add(b);
        return type.cast(b);
    }

    public final AbstractButton getSelected() {
        final var elements = getElements();
        while (elements.hasMoreElements()) {
            final var element = elements.nextElement();
            if (element.isSelected()) {
                return element;
            }
        }

        return null;
    }

}