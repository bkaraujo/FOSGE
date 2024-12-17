package br.fosge.editor.ui.forms;

import br.fosge.editor.ui.framework.component.FGFrame;
import br.fosge.editor.ui.framework.component.FGPanel;
import net.miginfocom.swing.MigLayout;

final class ProjectBrowseOpenPanel extends FGPanel {
    public static final String ACTION = " Open ";

    private final FGFrame parent;

    ProjectBrowseOpenPanel(FGFrame parent) {
        setLayout(new MigLayout("fillx, insets 50", "[][][]", "[][][][]"));
        this.parent = parent;
    }
}
