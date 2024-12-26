package br.fosge.editor.ui;

import br.fosge.editor.ui.container.FGPanel;

import javax.swing.*;

public final class TreePathNodePanel extends FGPanel {

    public TreePathNodePanel(Icon icon, String text) {
        add(new JLabel(text, icon, SwingConstants.CENTER));
    }

}
