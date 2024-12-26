package br.fosge.editor.ui.listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseAdapter implements ActionListener, MouseListener, MouseWheelListener, MouseMotionListener {
    private MouseEvent lastEvent;
    private final Timer timer;

    public MouseAdapter() {
        this((Integer) Toolkit.getDefaultToolkit().getDesktopProperty("awt.multiClickInterval"));
    }

    public MouseAdapter(int delay) {
        timer = new Timer(delay, MouseAdapter.this);
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    public final void mouseClicked (MouseEvent e) {
        if (e.getClickCount() > 2) return;
        lastEvent = e;

        if (timer.isRunning()) { timer.stop(); mouseDoubleClick(lastEvent); }
        else { timer.restart(); }
    }

    public void actionPerformed(ActionEvent e) {
        timer.stop();
        mouseSingleClick(lastEvent);
    }

    public void mouseSingleClick(MouseEvent e) {}
    public void mouseDoubleClick(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {}

    @Override
    public void mouseMoved(MouseEvent e) {}

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {}
}
