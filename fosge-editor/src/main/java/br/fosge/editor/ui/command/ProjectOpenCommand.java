package br.fosge.editor.ui.command;

import br.fosge.Logger;
import br.fosge.editor.ui.forms.ProjectEditor;
import br.fosge.editor.ui.framework.SWTools;
import br.fosge.tools.Yaml;

import javax.swing.*;
import java.nio.file.Path;
import java.util.Map;

public final class ProjectOpenCommand implements Command {
    public static final String PROJECT_PATH = "project.path";

    ProjectOpenCommand(){}

    @Override
    public boolean execute(Map<String, ?> param) {
        if (!param.containsKey(PROJECT_PATH)) { Logger.warn("project.path not informed"); return false; }
        final var rootfs = Path.of((String) param.get(PROJECT_PATH));

        try {
            final var yaml = Yaml.from(rootfs.resolve("project.yml"));
            if (yaml.isEmpty()) { Logger.warn("Failed to read project.yml"); return false; }

            SwingUtilities.invokeLater(() -> {
                final var frame = new ProjectEditor(rootfs, yaml);
                SWTools.toScreenCenter(frame);
                frame.setVisible(true);
            });

            return true;
        } catch (Throwable throwable) {
            Logger.warn("Failed to open project: %s", throwable);
            return false;
        }
    }

}
