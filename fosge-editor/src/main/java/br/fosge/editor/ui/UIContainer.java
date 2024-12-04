package br.fosge.editor.ui;

import javax.swing.*;
import java.awt.*;

public abstract class UIContainer {
    private UIContainer() { /* Private constructor */ }

    public static JPanel box(int axis) {
        final var panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, axis));

        return panel;
    }

    public static JPanel girdBag() {
        final var panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        return panel;
    }

    public static JPanel border() {
        final var panel = new JPanel();
        panel.setLayout(new BorderLayout());

        return panel;
    }

    public static JPanel flow() {
        return flow(5, 5);
    }

    public static JPanel flow(int hgap, int vgap) {
        return flow(FlowLayout.CENTER, hgap, vgap);
    }

    public static JPanel flow(int align, int hgap, int vgap) {
        final var panel = new JPanel();
        panel.setLayout(new FlowLayout(align, hgap, vgap));

        return panel;
    }

    public static JPanel card(CardLayout layout) {
        final var panel = new JPanel();
        panel.setLayout(layout);

        return panel;
    }
}
