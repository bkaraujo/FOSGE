package br.fosge.editor.ui.component;

import br.fosge.commons.Logger;
import br.fosge.commons.RT;
import br.fosge.commons.filesystem.FSTools;
import br.fosge.commons.filesystem.FSWatcher;
import br.fosge.commons.logger.LogLevel;
import br.fosge.commons.tools.Meta;
import br.fosge.editor.RTKeys;

import javax.swing.*;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;

public class JTreePathTest {

    public static void main(String ... args) {
        Logger.level(LogLevel.TRACE);

        RT.running = true;
        RT.set(RTKeys.Swing.MULTI_CLICK_INTERVAL, Integer.class, 250);

        new Thread(new FSWatcher()).start();

        final var frame = new JFrame();
        frame.setTitle("FSTree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final var rootfs = FSTools.defaultDirectory();
        final var tree = new FSTree(rootfs);

        frame.getContentPane().add(new JScrollPane(tree));
        SwingUtilities.invokeLater(() -> {
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

}
