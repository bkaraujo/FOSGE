package br.fosge.editor.forms;

import br.fosge.editor.ui.component.TreePath;
import br.fosge.editor.ui.container.FGFrame;
import br.fosge.editor.ui.container.FGPanel;

import java.nio.file.Path;

public class ProjectEditorExplorerPanel extends FGPanel {
    private final FGFrame owner;
    private final TreePath tree;
    public ProjectEditorExplorerPanel(FGFrame owner, Path rootfs) {
        this.owner = owner;
        tree = new TreePath(rootfs);
        add(tree);
    }
}
