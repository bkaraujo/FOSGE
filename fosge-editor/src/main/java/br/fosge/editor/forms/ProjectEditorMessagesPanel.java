package br.fosge.editor.forms;

import br.fosge.editor.ui.container.FGFrame;
import br.fosge.editor.ui.container.FGPanel;

import java.awt.*;

public class ProjectEditorMessagesPanel extends FGPanel {
    private final FGFrame owner;

    public ProjectEditorMessagesPanel(FGFrame owner) {
        this.owner = owner;
        setBackground(Color.WHITE);
    }
}
