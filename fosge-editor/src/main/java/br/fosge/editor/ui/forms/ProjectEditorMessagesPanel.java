package br.fosge.editor.ui.forms;

import br.fosge.editor.ui.framework.component.FGFrame;
import br.fosge.editor.ui.framework.component.FGPanel;

import java.awt.*;

public class ProjectEditorMessagesPanel extends FGPanel {
    private final FGFrame owner;

    public ProjectEditorMessagesPanel(FGFrame owner) {
        this.owner = owner;
        setBackground(Color.WHITE);
    }
}
