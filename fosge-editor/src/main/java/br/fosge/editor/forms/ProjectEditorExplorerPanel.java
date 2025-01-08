package br.fosge.editor.forms;

import br.fosge.editor.ui.component.FSTree;
import br.fosge.editor.ui.container.FGFrame;
import br.fosge.editor.ui.container.FGPanel;

import javax.swing.*;
import java.nio.file.Path;

public class ProjectEditorExplorerPanel extends FGPanel {
    private final FGFrame owner;
    private final FSTree tree;

    public ProjectEditorExplorerPanel(FGFrame owner, Path rootfs) {
        this.owner = owner;
        tree = new FSTree(rootfs);

        add(new JScrollPane(tree));
    }
}
