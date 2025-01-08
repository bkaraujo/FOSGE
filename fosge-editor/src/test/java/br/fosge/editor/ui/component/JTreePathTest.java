package br.fosge.editor.ui.component;

import br.fosge.commons.Logger;
import br.fosge.commons.RT;
import br.fosge.commons.filesystem.FSTools;
import br.fosge.commons.filesystem.FSWatcher;
import br.fosge.commons.logger.LogLevel;
import br.fosge.editor.RTKeys;

import javax.swing.*;

public class JTreePathTest {

    public static void main(String ... args) {
        Logger.level(LogLevel.TRACE);

        RT.running = true;
        RT.set(RTKeys.Swing.MULTI_CLICK_INTERVAL, Integer.class, 250);

        new Thread(new FSWatcher()).start();

        final var frame = new JFrame();
        frame.setTitle("FSTree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new JScrollPane(new FSTree(FSTools.defaultDirectory())));
        SwingUtilities.invokeLater(() -> {
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

}
