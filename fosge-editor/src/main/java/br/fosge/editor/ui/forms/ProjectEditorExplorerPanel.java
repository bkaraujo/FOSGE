package br.fosge.editor.ui.forms;

import br.fosge.editor.ui.framework.component.FGFrame;
import br.fosge.editor.ui.framework.component.FGPanel;
import br.fosge.editor.ui.framework.component.TreePath;

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
