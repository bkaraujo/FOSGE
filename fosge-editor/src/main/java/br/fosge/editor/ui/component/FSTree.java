package br.fosge.editor.ui.component;

import br.fosge.commons.Logger;
import br.fosge.commons.tools.Meta;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.nio.file.Files;
import java.nio.file.Path;

public final class FSTree extends JTree {
    public final Path rootfs;
    private final DefaultTreeModel model;

    public FSTree(final Path path) {
        rootfs = path;
        model = new DefaultTreeModel(new DefaultMutableTreeNode(new FSTreeData(rootfs), true));
        try { Files.walkFileTree(path, new FSTreeWalker(this)); }
        catch (Throwable throwable) { Logger.error("Failed to walk %s: %s", rootfs, throwable); }

        setRootVisible(true);
        setModel(model);
        repaint();
    }

    public void attach(final String ... elements) {
        var path = rootfs;
        var node = Meta.cast(model.getRoot(), DefaultMutableTreeNode.class);

        for (final var element : elements) {
            path = path.resolve(element);

            boolean found = false;
            final var children = node.children();
            if (children != null) {
                while (children.hasMoreElements()) {
                    final var child = Meta.cast(children.nextElement(), DefaultMutableTreeNode.class);
                    if (child.toString().equals(element)) {
                        found = true;
                        node = child;
                        break;
                    }
                }
            }

            if (!found) {
                node.add(new DefaultMutableTreeNode(
                        new FSTreeData(path),
                        path.toFile().isDirectory()
                ));

                model.nodeStructureChanged(node);
            }
        }
    }

    public void detach(final String ... elements) {
        var path = rootfs;
        var node = Meta.cast(model.getRoot(), DefaultMutableTreeNode.class);

        for (final var element : elements) {
            path = path.resolve(element);

            boolean found = false;
            final var children = node.children();
            if (children != null) {
                while (children.hasMoreElements()) {
                    final var child = Meta.cast(children.nextElement(), DefaultMutableTreeNode.class);
                    if (child.toString().equals(element)) {
                        found = true;
                        node = child;
                        break;
                    }
                }
            }

            if (!found) {
                node = null;
            }
        }

        if (node != null) {
            final var parent = node.getParent();
            node.removeFromParent();

            model.nodeStructureChanged(parent);
        }
    }

}
