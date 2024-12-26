package br.fosge.editor.ui.component;

import br.fosge.editor.ui.listener.MouseAdapter;
import br.fosge.tools.Meta;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class TreePath extends JTree {

    public TreePath(Path rootfs) {
        this(rootfs, true);
    }

    public TreePath(Path rootfs, boolean showFiles) {
        setRootVisible(true);

        if (rootfs != null && rootfs.toFile().isDirectory()) {
            final var rootNode = new DefaultMutableTreeNode(rootfs.toFile().getName());
            try (final var files = Files.list(rootfs)) {
                for (final var path : files.toList()) {
                    if (path.toFile().isFile() && !showFiles) continue;
                    final var data = new NodeData(this, path, showFiles);
                    final var node = new DefaultMutableTreeNode(data);
                    rootNode.add(node);
                }
            } catch (final IOException _) {}

            setModel(new DefaultTreeModel(rootNode));
        }

        addMouseListener(new MouseAdapter() {
            public void mouseDoubleClick(MouseEvent e) {
                final var tree = Meta.cast(e.getComponent(), TreePath.class);
                final var node = Meta.cast(tree.getLastSelectedPathComponent(), DefaultMutableTreeNode.class);

                final var userData = node.getUserObject();

                if (userData == null) return;
                if (!Meta.assignable(userData, NodeData.class)) return;
                final var data = Meta.cast(node.getUserObject(), NodeData.class);

                try (final var files = Files.list(data.path())) {
                    for (final var path : files.toList()) {
                        if (path.toFile().isFile() && !data.files()) continue;
                        final var newData = new NodeData(data.tree(), path, data.files());
                        final var newNode = new DefaultMutableTreeNode(newData);
                        node.add(newNode);
                    }
                } catch (final IOException _) {}
            }
        });
    }

    public record NodeData(
            JTree tree,
            Path path,
            boolean files
    ) {

        @Override
        public boolean equals(Object obj) {
            if (obj == null) return false;
            if (!Meta.assignable(obj, NodeData.class)) return false;
            return Meta.cast(obj, NodeData.class).path.equals(path);
        }

        @Override
        public int hashCode() {
            return path.hashCode();
        }

        @Override
        public String toString() {
            return path.toFile().getName();
        }

    }
}
