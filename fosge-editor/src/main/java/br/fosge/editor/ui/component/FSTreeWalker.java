package br.fosge.editor.ui.component;

import br.fosge.commons.filesystem.FSWatcher;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

final class FSTreeWalker extends SimpleFileVisitor<Path> {
    private final FSTree tree;

    public FSTreeWalker(final FSTree tree) {
        this.tree = tree;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes attrs) {
        if (path.equals(tree.rootfs)) return FileVisitResult.CONTINUE;

        FSWatcher.watchSingle(path, new FSTreeWatcher(tree));
        tree.attach(
                path
                        .toString()
                        .replace(tree.rootfs + "\\", "")
                        .split("\\\\")
        );

        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) {
        tree.attach(
                path
                        .toString()
                        .replace(tree.rootfs + "\\", "")
                        .split("\\\\")
        );

        return FileVisitResult.CONTINUE;
    }
}
