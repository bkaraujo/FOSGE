package br.fosge.editor.forms;

import br.fosge.Logger;
import br.fosge.annotation.Lifecycle;

import javax.swing.*;
import java.awt.*;

public final class EditorForm extends JFrame implements Lifecycle {

    @Override
    public boolean initialize() {
        try {
            setTitle("FOSGE :: Editor");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            final var screen = Toolkit.getDefaultToolkit().getScreenSize();
            setSize(screen.width / 4,screen.height / 4);

            return true;
        } catch (Throwable throwable) {
            Logger.error("Failed to initialize form: %s", throwable);
            return false;
        }
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
