package br.fosge.editor.ui.framework.dock;

import br.fosge.editor.ui.forms.ProjectEditorAssetsPanel;
import br.fosge.editor.ui.forms.ProjectEditorExplorerPanel;
import br.fosge.editor.ui.forms.ProjectEditorRenderPanel;
import br.fosge.editor.ui.framework.component.FGPanel;

import javax.swing.*;

public final class RootPanel extends FGPanel {
    private final JSplitPane HPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
    private final JSplitPane VPanel = new JSplitPane(JSplitPane.VERTICAL_SPLIT);

    public RootPanel() {
        VPanel.setLeftComponent(new ProjectEditorExplorerPanel());
        VPanel.setRightComponent(HPanel);
        HPanel.setTopComponent(new ProjectEditorRenderPanel());
        HPanel.setBottomComponent(new ProjectEditorAssetsPanel());

        add(VPanel);
    }
}
