package br.fosge.editor.ui.forms;

import br.fosge.Logger;
import br.fosge.RT;
import br.fosge.editor.ui.command.ProjectOpenCommand;
import br.fosge.editor.ui.framework.component.FGButtonGroup;
import br.fosge.editor.ui.framework.component.FGImagePanel;
import br.fosge.editor.ui.framework.component.FGPanel;
import br.fosge.editor.ui.framework.listener.CursorHoverListener;
import br.fosge.tools.Yaml;
import com.formdev.flatlaf.FlatClientProperties;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public final class ProjectBrowseOpenPanel extends FGPanel {
    public static final String ACTION = " Open ";

    private final FGButtonGroup buttonGroup = new FGButtonGroup();

    ProjectBrowseOpenPanel() {
        setLayout(new MigLayout("filly, insets 20 50 20 50", "[][grow]"));
        final var pnlProjects = FGPanel.newBoxVertical(); {
            try {
                final var yaml = RT.get("editor.projects", Yaml.class);
                for (final var project : yaml.list("projects")) {
                    final var projectPath = project.asString("path");
                    final var tokens = projectPath.split("\\\\");
                    final var projectName = tokens[tokens.length - 1];

                    final var button = buttonGroup.add(JRadioButton.class, new JRadioButton(projectName));
                    button.setActionCommand(projectPath);

                    button.addMouseListener(new CursorHoverListener(Cursor.HAND_CURSOR));
                    button.putClientProperty(FlatClientProperties.STYLE, "font: bold +2");
                    pnlProjects.add(Box.createVerticalStrut(8));
                    pnlProjects.add(button);
                }
            } catch (Throwable throwable) {
                Logger.fatal("Failed to load projects.yml: %s", throwable);
            }
        }

        add(new JScrollPane(pnlProjects, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "growy, width 180");
        add(new FGImagePanel(), "grow");
    }

    @Override
    public Map<String, ?> values() {
        final var values = new ConcurrentSkipListMap<String, Object>();
        final var selected = buttonGroup.getSelected();
        if (selected == null) return values;

        values.put(ProjectOpenCommand.PROJECT_PATH, selected.getActionCommand());

        return values;
    }

    @Override
    public void reset() {
        buttonGroup.clearSelection();
    }
}
