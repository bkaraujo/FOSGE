package br.fosge.editor.ui.component;

import br.fosge.commons.filesystem.FSWatcher;
import br.fosge.commons.filesystem.WatchDogAction;

import java.nio.file.Files;
import java.nio.file.Path;

final class FSTreeWatcher implements WatchDogAction {
    private final FSTree tree;

    public FSTreeWatcher(final FSTree tree) {
        this.tree = tree;
    }

    @Override
    public void onCreate(Path absolute) {
        if (Files.isDirectory(absolute)) {
            FSWatcher.watchSingle(absolute, this);
        }

        tree.attach(
                absolute
                        .toString()
                        .replace(tree.rootfs + "\\", "")
                        .split("\\\\")
        );
    }

    @Override
    public void onDelete(Path absolute) {
        FSWatcher.unwatchSingle(absolute);
        tree.detach(
                absolute
                        .toString()
                        .replace(tree.rootfs + "\\", "")
                        .split("\\\\")
        );

    }

}
