package br.fosge.editor.ui.command;

import br.fosge.Logger;
import br.fosge.editor.ui.forms.ProjectEditor;
import br.fosge.editor.ui.framework.SWTools;
import br.fosge.tools.Yaml;

import javax.swing.*;
import java.nio.file.Path;
import java.util.Map;

final class ProjectOpenCommand implements Command {

    @Override
    public boolean execute(Map<String, ?> param) {
        if (!param.containsKey("project.path")) { Logger.warn("project.path not informed"); return false; }

        try {
            final var yaml = Yaml.from(Path.of((String) param.get("project.path"), "project.yml"));
            if (yaml.isEmpty()) { Logger.warn("Failed to read project.yml"); return false; }

            SwingUtilities.invokeLater(() -> {
                final var frame = new ProjectEditor(yaml);
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
