package br.fosge.editor.ui.forms;

import br.fosge.editor.ui.framework.component.FGFrame;
import br.fosge.editor.ui.framework.component.FGPanel;
import br.fosge.tools.Strings;
import br.fosge.tools.Yaml;

import javax.swing.*;

public final class ProjectEditor extends FGFrame {
    private final Yaml yaml;

    private final JSplitPane LCPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
    private final JSplitPane NSPanel = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
    private final JSplitPane CRPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

    private final JTabbedPane tbCenter = new JTabbedPane();
    private final JTabbedPane tbBottom = new JTabbedPane();
    private final JTabbedPane tbLeft = new JTabbedPane();
    private final JTabbedPane tbRight = new JTabbedPane();

    public ProjectEditor(Yaml desired) {
        yaml = desired;

        setResizable(true);
        setSize(1024, 768);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        final var projectName = yaml.asString("project.name");
        setTitle("FOSGE :: %s".formatted(Strings.toTitleCase(projectName)));

        LCPanel.setRightComponent(NSPanel);
        NSPanel.setTopComponent(CRPanel);

        LCPanel.setLeftComponent(tbLeft);
        tbLeft.addTab("Project", new ProjectEditorExplorerPanel());

        CRPanel.setTopComponent(tbCenter);
        tbCenter.addTab("Renderer", new ProjectEditorRenderPanel());

        NSPanel.setBottomComponent(tbBottom);
        tbBottom.addTab("Assets", new ProjectEditorAssetsPanel());
        tbBottom.addTab("Messages", new ProjectEditorMessagesPanel());

        CRPanel.setRightComponent(tbRight);
        tbRight.addTab("Properties", new ProjectEditorPropertiesPanel());

        add(LCPanel);
    }

    @Override
    public void reset() {

    }

}
