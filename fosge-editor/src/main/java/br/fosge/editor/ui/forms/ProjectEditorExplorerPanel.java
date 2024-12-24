package br.fosge.editor.ui.forms;

import br.fosge.editor.ui.framework.component.FGPanel;
import br.fosge.editor.ui.framework.component.PathTree;

import java.awt.*;
import java.nio.file.Path;

public class ProjectEditorExplorerPanel extends FGPanel {
    public ProjectEditorExplorerPanel() {
        setBackground(Color.GREEN);

        add(new PathTree(Path.of(System.getProperty("user.dir"))));

    }
}
