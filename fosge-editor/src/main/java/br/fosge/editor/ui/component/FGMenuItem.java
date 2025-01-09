package br.fosge.editor.ui.component;

import javax.swing.*;
import java.awt.event.ActionListener;

public record FGMenuItem(
        String title,
        ActionListener action
) {

    public FGMenuItem() {
        this(null, null);
    }

    public JComponent asMenuItem() {
        final var mni = new JMenuItem(title);
        mni.addActionListener(action);

        return mni;
    }

}
