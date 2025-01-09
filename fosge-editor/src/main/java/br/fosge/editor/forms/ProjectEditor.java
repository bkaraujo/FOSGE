package br.fosge.editor.forms;

import br.fosge.commons.tools.Strings;
import br.fosge.commons.tools.Yaml;
import br.fosge.editor.RTKeys;
import br.fosge.editor.ui.component.FGMenuItem;
import br.fosge.editor.ui.container.FGFrame;

import javax.swing.*;
import java.awt.*;
import java.nio.file.Path;

public final class ProjectEditor extends FGFrame {
    private final Yaml yaml;
    private final Path rootfs;

    public ProjectEditor(Path rootfs, Yaml yaml) {
        this.yaml = yaml;
        this.rootfs = rootfs;
    }

    @Override
    public boolean initialize() {
        setResizable(true);
        setSize(1024, 768);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        addMenu("Project",
                new FGMenuItem("Export", null),
                new FGMenuItem(),
                new FGMenuItem("Close", null),
                new FGMenuItem("Properties", null),
                new FGMenuItem(),
                new FGMenuItem("Exit", (_) -> ProjectEditor.this.dispose())
        );

        addMenu("Help",
                new FGMenuItem("About", null)
        );

        final var projectName = yaml.asString(RTKeys.Project.NAME);
        setTitle("FOSGE :: %s".formatted(Strings.toTitleCase(projectName)));

        final var CRPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT); {
            final var tbCenter = new JTabbedPane();

            CRPanel.setTopComponent(tbCenter);
            tbCenter.addTab("Renderer", new ProjectEditorRenderPanel(this));

            final var tbRight = new JTabbedPane();
            CRPanel.setRightComponent(tbRight);
            tbRight.addTab("Properties", new ProjectEditorPropertiesPanel(this));
        }

        final var NSPanel = new JSplitPane(JSplitPane.VERTICAL_SPLIT); {
            NSPanel.setTopComponent(CRPanel);

            final var tbBottom = new JTabbedPane();
            NSPanel.setBottomComponent(tbBottom);
            tbBottom.addTab("Assets", new ProjectEditorAssetsPanel(this));
            tbBottom.addTab("Messages", new ProjectEditorMessagesPanel(this));
        }

        final var LCPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT); {
            LCPanel.setRightComponent(NSPanel);

            final var tbLeft = new JTabbedPane();
            LCPanel.setLeftComponent(tbLeft);
            tbLeft.addTab(
                    "Project",
                    new ProjectEditorExplorerPanel (
                            this,
                            rootfs
                    )
            );

            add(LCPanel);
        }

        return true;
    }

    @Override
    public void reset() {

    }

}
