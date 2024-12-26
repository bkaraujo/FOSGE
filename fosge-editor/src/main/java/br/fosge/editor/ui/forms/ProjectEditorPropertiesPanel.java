package br.fosge.editor.ui.forms;

import br.fosge.editor.ui.framework.component.FGFrame;
import br.fosge.editor.ui.framework.component.FGPanel;

import java.awt.*;

public class ProjectEditorPropertiesPanel extends FGPanel {
    private final FGFrame owner;

    public ProjectEditorPropertiesPanel(FGFrame owner) {
        this.owner = owner;
        setBackground(Color.RED);
    }
}
