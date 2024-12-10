package br.fosge.editor.ui;

import javax.swing.*;
import java.awt.*;

/**
 * Factory for standard styled components
 */
public abstract class SWTools {
    private SWTools() { /* Private constructor */ }

    public static void toScreenCenter(JFrame frame) {
        final var screen = Toolkit.getDefaultToolkit().getScreenSize();

        frame.setLocation(
                (screen.width - frame.getWidth()) / 2,
                (screen.height - frame.getHeight()) / 2
        );
    }

}
