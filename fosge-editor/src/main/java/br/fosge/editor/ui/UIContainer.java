package br.fosge.editor.ui;

import javax.swing.*;
import java.awt.*;

public abstract class UIContainer {
    private UIContainer() { /* Private constructor */ }

    public static FPanel box(int axis) {
        final var panel = new FPanel();
        panel.setLayout(new BoxLayout(panel, axis));

        return panel;
    }

    public static FPanel girdBag() {
        final var panel = new FPanel();
        panel.setLayout(new GridBagLayout());

        return panel;
    }

    public static void gridBagXY(GridBagConstraints constraints, int x, int y) {
        gridBagXYWH(constraints, x, y, 1, 1);
    }

    public static void gridBagXYWH(GridBagConstraints constraints, int x, int y, int width, int height) {
        constraints.gridx = x;
        constraints.gridy = y;
        constraints.gridwidth = width;
        constraints.gridheight = height;
    }

    public static void gridBagWXWY(GridBagConstraints constraints, double weightx, double weighty) {
        constraints.weightx = weightx;
        constraints.weighty = weighty;
    }

    public static void gridBagAF(GridBagConstraints constraints, int anchor, int fill) {
        constraints.anchor = anchor;
        constraints.fill = fill;
    }

    public static FPanel border() {
        final var panel = new FPanel();
        panel.setLayout(new BorderLayout());

        return panel;
    }

    public static FPanel flow() {
        return flow(5, 5);
    }

    public static FPanel flow(int hgap, int vgap) {
        return flow(FlowLayout.CENTER, hgap, vgap);
    }

    public static FPanel flow(int align, int hgap, int vgap) {
        final var panel = new FPanel();
        panel.setLayout(new FlowLayout(align, hgap, vgap));

        return panel;
    }

    public static FPanel card(CardLayout layout) {
        final var panel = new FPanel();
        panel.setLayout(layout);

        return panel;
    }
}
