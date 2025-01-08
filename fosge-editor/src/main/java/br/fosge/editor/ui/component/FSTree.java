package br.fosge.editor.ui.component;

import br.fosge.commons.Logger;
import br.fosge.commons.filesystem.FSWatcher;
import br.fosge.commons.tools.Meta;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;

public final class FSTree extends JTree {
    private final Path rootfs;
    private final DefaultMutableTreeNode rootNode;
    public FSTree(final Path path) {
        rootfs = path;
        rootNode = new DefaultMutableTreeNode(new FSTreeData(rootfs), true);

        setRootVisible(true);
        try {
            Files.walkFileTree(path, new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes attrs) {
                    if (path.equals(rootfs)) return FileVisitResult.CONTINUE;

                    newEntry(path.toString().replace(rootfs + "\\", "").split("\\\\"));
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) {
                    newEntry(path.toString().replace(rootfs + "\\", "").split("\\\\"));
                    return FileVisitResult.CONTINUE;
                }
            });

            FSWatcher.watchTree(rootfs, (event, absolute) -> {
                if (Meta.equals(event.kind(), StandardWatchEventKinds.OVERFLOW, StandardWatchEventKinds.ENTRY_MODIFY)) return;

                if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
                    newEntry(absolute.toString().replace(rootfs + "\\", "").split("\\\\"));
                }

                if (event.kind() == StandardWatchEventKinds.ENTRY_DELETE) {
                    Logger.warn("ENTRY_DELETE: %s", absolute);
                }

                FSTree.this.repaint();
            });

            setModel(new DefaultTreeModel(rootNode));
        } catch (Throwable throwable) {
            Logger.error("Failed to walk %s: %s", rootfs, throwable);
        }

        FSTree.this.repaint();
    }

    private void expand(final DefaultMutableTreeNode node) {
        final var nodeData = Meta.cast(node.getUserObject(), FSTreeData.class);
        try (final var files = Files.list(nodeData.path())) {
            for (final var inode : files.map(Path::toFile).toList()) {
                final var newNode = new DefaultMutableTreeNode(new FSTreeData(inode.toPath()), true);

                if (inode.isDirectory()) {
                    expand(newNode);
                } else {
                    newNode.setAllowsChildren(false);
                }
                node.add(newNode);
            }
        } catch (final IOException _) {}
    }

    private void newEntry(String ... elements) {
        var path = rootfs;
        var node = rootNode;

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
            }
        }
    }
}
