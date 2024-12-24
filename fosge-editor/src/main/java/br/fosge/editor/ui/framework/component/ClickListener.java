package br.fosge.editor.ui.framework.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClickListener extends MouseAdapter implements ActionListener {
    private final static int clickInterval = (Integer) Toolkit.getDefaultToolkit().
            getDesktopProperty("awt.multiClickInterval");

    private MouseEvent lastEvent;
    private final Timer timer;

    public ClickListener() {
        this(clickInterval);
    }

    public ClickListener(int delay) {
        timer = new Timer(delay, ClickListener.this);
    }

    public void mouseClicked (MouseEvent e) {
        if (e.getClickCount() > 2) return;
        lastEvent = e;

        if (timer.isRunning()) {
            timer.stop();
            doubleClick( lastEvent );
        } else {
            timer.restart();
        }
    }

    public void actionPerformed(ActionEvent e) {
        timer.stop();
        singleClick( lastEvent );
    }

    public void singleClick(MouseEvent e) {}
    public void doubleClick(MouseEvent e) {}
}
