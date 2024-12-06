package br.fosge.editor.ui;

import br.fosge.graphics.Rectangle;

import javax.swing.*;
import java.awt.*;
import java.util.EventListener;

public abstract class UIComponent {
    private UIComponent() { /* Private constructor */ }

    public static JSeparator separator(int orientation, int x, int y) {
        final var component = new JSeparator(orientation);
        component.setPreferredSize(new Dimension(x, y));
        return component;
    }

    public static JSeparator separator(int orientation) {
        return new JSeparator(orientation);
    }

    public static JMenuItem menuItem(String title, EventListener... listeners) {
        final var component = new JMenuItem(title);
        SwingTools.initialize(component, null, listeners);
        return component;
    }

    public static JSeparator menuSeparator() {
        return separator(SwingConstants.HORIZONTAL);
    }

    public static JMenu menu(String title, JComponent ... items) {
        final var menu = new JMenu(title);
        for (final var item : items) {
            menu.add(item);
        }

        return menu;
    }

    public static JLabel label(String title) {
        return label(title, (br.fosge.graphics.Rectangle) null);
    }

    public static JLabel label(String title, EventListener ... listeners) {
        return label(title, null, listeners);
    }

    public static JLabel label(String title, Rectangle border, EventListener ... listeners) {
        final var component = new JLabel(title);
        SwingTools.initialize(component, border, listeners);
        return component;
    }


}
