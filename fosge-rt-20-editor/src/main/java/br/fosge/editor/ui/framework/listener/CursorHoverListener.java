package br.fosge.editor.ui.framework.listener;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public final class CursorHoverListener extends MouseAdapter {
    private Cursor original;
    private final Cursor desired;

    public CursorHoverListener(final int desired) {
        this.desired =  Cursor.getPredefinedCursor(desired);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        final var component = e.getComponent();

        original = component.getCursor();
        component.setCursor(desired);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        final var component = e.getComponent();

        component.setCursor(original);
    }
}
