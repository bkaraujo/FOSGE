package br.fosge.editor.ui.forms;

import br.fosge.editor.ui.framework.component.FGFrame;
import br.fosge.tools.Strings;
import br.fosge.tools.Yaml;

import javax.swing.*;
import java.nio.file.Path;

public final class ProjectEditor extends FGFrame {
    private final Yaml yaml;

    private final JTabbedPane tbCenter = new JTabbedPane();
    private final JTabbedPane tbBottom = new JTabbedPane();
    private final JTabbedPane tbLeft = new JTabbedPane();
    private final JTabbedPane tbRight = new JTabbedPane();

    public ProjectEditor(Path rootfs, Yaml desired) {
        yaml = desired;

        setResizable(true);
        setSize(1024, 768);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        final var projectName = yaml.asString("project.name");
        setTitle("FOSGE :: %s".formatted(Strings.toTitleCase(projectName)));

        final var CRPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT); {
            CRPanel.setTopComponent(tbCenter);
            tbCenter.addTab("Renderer", new ProjectEditorRenderPanel(this));

            CRPanel.setRightComponent(tbRight);
            tbRight.addTab("Properties", new ProjectEditorPropertiesPanel(this));
        }

        final var NSPanel = new JSplitPane(JSplitPane.VERTICAL_SPLIT); {
            NSPanel.setTopComponent(CRPanel);
            NSPanel.setBottomComponent(tbBottom);
            tbBottom.addTab("Assets", new ProjectEditorAssetsPanel(this));
            tbBottom.addTab("Messages", new ProjectEditorMessagesPanel(this));
        }

        final var LCPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT); {
            LCPanel.setRightComponent(NSPanel);
            LCPanel.setLeftComponent(tbLeft);
            tbLeft.addTab(
                    "Project",
                    new ProjectEditorExplorerPanel(
                            this,
                            rootfs
                    )
            );
            add(LCPanel);
        }
    }

    @Override
    public void reset() {

    }

}
