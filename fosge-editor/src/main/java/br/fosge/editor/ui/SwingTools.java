package br.fosge.editor.ui;

import br.fosge.graphics.Rectangle;
import br.fosge.tools.Meta;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentListener;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.EventListener;

/**
 * Factory for standard styled components
 */
public abstract class SwingTools {
    private SwingTools() { /* Private constructor */ }

    public static void centralize(JFrame frame) {
        final var screen = Toolkit.getDefaultToolkit().getScreenSize();

        frame.setLocation(
                (screen.width - frame.getWidth()) / 2,
                (screen.height - frame.getHeight()) / 2
        );
    }

    public static void emptyBorder(JComponent component, Rectangle rectangle) {
        component.setBorder(new EmptyBorder(rectangle.top(), rectangle.left(), rectangle.bottom(), rectangle.right()));
    }

    public static Font fontDroidSerifRegular(int size) {
        return fontDroidSerif(Font.PLAIN, size);
    }

    public static Font fontDroidSerif(int style, int size) {
        return new Font("Droid Serif", style, size);
    }

    public static void onMouseHover(JComponent component, Cursor desired) {
        component.addMouseListener(new MouseAdapter() {
            private Cursor cursor = Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR);

            @Override
            public void mouseEntered(MouseEvent e) {
                cursor = e.getComponent().getCursor();
                e.getComponent().setCursor(desired);
                super.mouseEntered(e);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                e.getComponent().setCursor(cursor);
                super.mouseExited(e);
            }
        });
    }

    static void initialize(JComponent component, Rectangle border, EventListener ... listeners) {
        component.setFont(fontDroidSerifRegular(16));
        if (border != null) emptyBorder(component, border);
        if (listeners != null && listeners.length > 0) {
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
                    continue;
                }

                if (Meta.assignable(listener, DocumentListener.class)) {
                    if (Meta.assignable(component, JTextComponent.class)) {
                        final var txt = Meta.cast(component, JTextComponent.class);
                        txt.getDocument().addDocumentListener(Meta.cast(listener, DocumentListener.class));
                    }
                }
            }
        }
    }
}
