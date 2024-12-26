package br.fosge.editor.ui.framework.component;

import br.fosge.tools.Meta;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class PathTree extends JTree {

    public PathTree(Path rootfs) {
        this(rootfs, true);
    }

    public PathTree(Path rootfs, boolean showFiles) {
        setRootVisible(true);

        if (rootfs != null && rootfs.toFile().isDirectory()) {
            final var rootNode = new DefaultMutableTreeNode(rootfs.toFile().getName());
            try (final var files = Files.list(rootfs)) {
                for (final var path : files.toList()) {
                    if (path.toFile().isFile() && !showFiles) continue;
                    rootNode.add(new PathTreeNode(this, path, showFiles));
                }
            } catch (final IOException _) {}

            setModel(new DefaultTreeModel(rootNode));
        }

        addMouseListener(new ClickListener() {
            public void doubleClick(MouseEvent e) {
                final var component = getLastSelectedPathComponent();
                if (Meta.assignable(component, DefaultMutableTreeNode.class)) {
                    final var selected = Meta.cast(component, PathTreeNode.class);
                    selected.expand();
                }
            }
        });
    }
}
