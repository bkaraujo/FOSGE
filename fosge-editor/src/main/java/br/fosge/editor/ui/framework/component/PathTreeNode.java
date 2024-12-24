package br.fosge.editor.ui.framework.component;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class PathTreeNode extends DefaultMutableTreeNode {
    private final JTree tree;
    private final Path path;
    private final boolean showFiles;
    public PathTreeNode(JTree tree, final Path path, boolean showFiles) {
        this.path = path;
        this.showFiles = showFiles;
        this.tree = tree;
    }

    public void expand() {
        if (path.toFile().isFile()) return;

        try (final var files = Files.list(path)) {
            for (final var children : files.toList()) {
                if (children.toFile().isFile() && !showFiles) continue;
                add(new PathTreeNode(tree, children, showFiles));
            }
        } catch (final IOException _) {}

        tree.repaint();
    }

    @Override
    public String toString() {
        return path.toFile().getName();
    }
}
