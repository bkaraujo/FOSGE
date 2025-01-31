package br.fosge.editor.ui.framework.control;

import javax.swing.*;

public final class FGButtonGroup extends ButtonGroup {

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

    public final String getSelectedText() {
        final var selected = getSelected();
        if (selected != null) { return selected.getText(); }

        return null;
    }

}
