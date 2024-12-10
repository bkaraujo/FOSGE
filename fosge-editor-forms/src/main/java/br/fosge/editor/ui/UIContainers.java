package br.fosge.editor.ui;

import br.fosge.editor.ui.component.FGPanel;

import javax.swing.*;

public abstract class UIContainers {
    private UIContainers() {/* Private constructor */}

    public static FGPanel boxVertical() {
        final var panel = new FGPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        return panel;
    }

    public static FGPanel boxHorizontal() {
        final var panel = new FGPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        return panel;
    }

}
