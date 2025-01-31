package br.fosge.editor.ui.form;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.editor.command.Command;
import br.fosge.editor.command.ProjectOpenCommand;
import br.fosge.editor.ui.framework.container.FGImagePanel;
import br.fosge.editor.ui.framework.container.FGPanel;
import br.fosge.editor.ui.framework.control.FGButtonGroup;
import br.fosge.editor.ui.framework.listener.CursorHoverListener;
import com.formdev.flatlaf.FlatClientProperties;
import net.miginfocom.swing.MigLayout;

import javax.annotation.Nullable;
import javax.swing.*;
import java.awt.*;
import java.nio.file.Path;

public final class ProjectBrowseOpenPanel extends FGPanel {
    public static final String ACTION = " Open ";

    private final FGButtonGroup buttonGroup = new FGButtonGroup();

    ProjectBrowseOpenPanel() {
        setLayout(new MigLayout("filly, insets 20 50 20 50", "[][grow]"));
        final var pnlProjects = FGPanel.newBoxVertical(); {
            try {
                for (final var project : RT.yaml.list("projects")) {
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

    @Nullable
    @Override
    public Command command() {
        final var selected = buttonGroup.getSelected();
        if (selected == null) return null;

        return new ProjectOpenCommand(
                Path.of(selected.getActionCommand())
        );
    }

    @Override
    public void reset() {
        buttonGroup.clearSelection();
    }
}
