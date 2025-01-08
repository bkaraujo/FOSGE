package br.fosge.editor.forms;

import br.fosge.editor.ui.container.FGFrame;
import br.fosge.editor.ui.container.FGPanel;

import java.awt.*;

public class ProjectEditorRenderPanel extends FGPanel {
    private final FGFrame owner;

    public ProjectEditorRenderPanel(FGFrame owner) {
        this.owner = owner;
        setBackground(Color.MAGENTA);
    }
}
