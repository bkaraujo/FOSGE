package br.fosge.editor.ui;

import br.fosge.editor.ui.component.JLimitedDocument;
import br.fosge.graphics.Rectangle;
import br.fosge.tools.Meta;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.EventListener;

/**
 * Factory for standard styled components
 */
public abstract class Components {
    private Components() { /* Private constructor */ }

    public static void centralize(JFrame frame) {
        final var screen = Toolkit.getDefaultToolkit().getScreenSize();

        frame.setLocation(
                (screen.width - frame.getWidth()) / 2,
                (screen.height - frame.getHeight()) / 2
        );
    }

    public static JMenuItem menuItem(String title, EventListener ... listeners) {
        final var component = new JMenuItem(title);
        attach(component, listeners);
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

    public static void emptyBorder(JComponent component, Rectangle rectangle) {
        component.setBorder(new EmptyBorder(rectangle.top(), rectangle.left(), rectangle.bottom(), rectangle.right()));
    }

    public static JSeparator separator(int orientation, int x, int y) {
        final var component = new JSeparator(orientation);
        component.setPreferredSize(new Dimension(x, y));
        return component;
    }

    public static JSeparator separator(int orientation) {
        return new JSeparator(orientation);
    }

    public static JLabel label(String title, Rectangle border, EventListener ... listeners) {
        final var component = label(title, listeners);
        emptyBorder(component, border);

        return component;
    }

    public static JLabel label(String title, EventListener ... listeners) {
        final var component = new JLabel(title);
        attach(component, listeners);
        return component;
    }

    public static JTextField textField(int size) {
        return textField(size, (String) null);
    }

    public static JTextField textField(int size, EventListener ... listeners) {
        return textField(size, (String) null, listeners);
    }

    public static JTextField textField(int size, String title, EventListener ... listeners) {
        return textField(size, title, null, listeners);
    }

    public static JTextField textField(int size, Rectangle border, EventListener ... listeners) {
        return textField(size, null, border, listeners);
    }

    public static JTextField textField(int size, String title, Rectangle border, EventListener ... listeners) {
        final var component = new JTextField(title);

        if (size > 0 ) {
            component.setColumns(size);
            component.setDocument(new JLimitedDocument(size));
        }

        attach(component, listeners);
        if (border != null) { emptyBorder(component, border); }

        return component;
    }

    public static JButton button(String title, EventListener ... listeners) {
        final var component = new JButton(title);
        attach(component, listeners);

        return component;
    }

    public static Font fontDroidSerifRegular(int size) {
        return fontDroidSerif(Font.PLAIN, size);
    }

    public static Font fontDroidSerif(int style, int size) {
        return new Font("Droid Serif", style, size);
    }

    private static void attach(JComponent component, EventListener ... listeners) {
        for (final EventListener listener : listeners) {
            if (Meta.assignable(listener, MouseListener.class)) {
                component.addMouseListener(Meta.cast(listener, MouseListener.class));
                continue;
            }

            if (Meta.assignable(listener, ActionListener.class)) {
                if (Meta.assignable(component, AbstractButton.class)) {
                    final var button = Meta.cast(component, AbstractButton.class);
                    button.addActionListener(Meta.cast(listener, ActionListener.class));
                }
            }
        }
    }
}
