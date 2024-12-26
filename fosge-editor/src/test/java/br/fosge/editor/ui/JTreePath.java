package br.fosge.editor.ui;

import br.fosge.editor.ui.component.TreePath;

import javax.swing.*;
import java.nio.file.Path;

public class JTreePath {

    public static void main(String ... args) {
        final var frame = new JFrame();
        frame.setTitle("FSTree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final var rootfs = Path.of(System.getProperty("user.home"));
        final var tree = new TreePath(rootfs);
        tree.setCellRenderer(new TreePathNodeRenderer());

        final var scrollPane = new JScrollPane(tree);
        frame.getContentPane().add(scrollPane);
        SwingUtilities.invokeLater(() -> {
            frame.pack();
            frame.setVisible(true);
        });
    }

}
