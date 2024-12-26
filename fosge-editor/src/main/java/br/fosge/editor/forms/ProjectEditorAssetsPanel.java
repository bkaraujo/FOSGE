package br.fosge.editor.forms;

import br.fosge.editor.ui.container.FGFrame;
import br.fosge.editor.ui.container.FGPanel;

import java.awt.*;

public class ProjectEditorAssetsPanel extends FGPanel {
    private final FGFrame owner;
    public ProjectEditorAssetsPanel(FGFrame owner) {
        this.owner = owner;
        setBackground(Color.ORANGE);
    }
}
