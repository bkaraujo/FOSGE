package br.fosge.editor.forms;

import br.fosge.Logger;
import br.fosge.editor.ui.FFrame;
import br.fosge.editor.ui.FPanel;

import javax.swing.*;
import java.awt.*;

public final class EditorForm extends FFrame {

    @Override
    public boolean initialize() {
        try {
            setTitle("FOSGE :: Editor");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            final var screen = Toolkit.getDefaultToolkit().getScreenSize();
            setSize(screen.width / 4,screen.height / 4);
            setLayout(new BorderLayout());

            add(leftPanel(), BorderLayout.WEST);
            add(centerPanel(), BorderLayout.CENTER);
            add(bottomPanel(), BorderLayout.SOUTH);
            add(rightPanel(), BorderLayout.EAST);

            return true;
        } catch (Throwable throwable) {
            Logger.error("Failed to initialize form: %s", throwable);
            return false;
        }
    }

    private FPanel leftPanel() {
        final var panel = new FPanel();
        panel.add(new JTabbedPane(JTabbedPane.TOP));

        return panel;
    }

    private FPanel centerPanel() {
        final var panel = new FPanel();

        return panel;
    }

    private FPanel bottomPanel() {
        final var panel = new FPanel();
        panel.add(new JTabbedPane(JTabbedPane.TOP));

        return panel;
    }

    private FPanel rightPanel() {
        final var panel = new FPanel();
        panel.add(new JTabbedPane(JTabbedPane.TOP));

        return panel;
    }

    @Override
    public boolean terminate() {
        try {
            return true;
        } catch (Throwable throwable) {
            Logger.error("Failed to terminate form: %s", throwable);
            return false;
        }
    }
}
