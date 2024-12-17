package br.fosge.editor.ui.framework.listener;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public final class CursorHoverListener extends MouseAdapter {
    private Cursor cursorOriginal;
    private final Cursor cursorDesired;

    public CursorHoverListener(final int desired) {
        cursorDesired =  Cursor.getPredefinedCursor(desired);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        cursorOriginal = e.getComponent().getCursor();
        e.getComponent().setCursor(cursorDesired);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        e.getComponent().setCursor(cursorOriginal);
    }
}
