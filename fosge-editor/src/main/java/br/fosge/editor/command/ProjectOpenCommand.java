package br.fosge.editor.command;

import br.fosge.commons.Logger;
import br.fosge.commons.tools.Yaml;
import br.fosge.editor.RTKeys;
import br.fosge.editor.forms.ProjectEditor;
import br.fosge.editor.ui.SWTools;

import java.nio.file.Path;
import java.util.Map;

public final class ProjectOpenCommand implements Command {
    public static final String PROJECT_PATH = RTKeys.Project.PATH;

    ProjectOpenCommand(){}

    @Override
    public boolean execute(Map<String, ?> param) {
        if (!param.containsKey(PROJECT_PATH)) { Logger.warn("%s not informed", PROJECT_PATH); return false; }
        final var rootfs = Path.of((String) param.get(PROJECT_PATH));

        try {
            final var yaml = Yaml.from(rootfs.resolve("project.yml"));
            if (yaml.isEmpty()) { Logger.warn("Failed to read project.yml"); return false; }

            final var frame = new ProjectEditor(rootfs, yaml);
            SWTools.toScreenCenter(frame);
            frame.setVisible(true);

            return true;
        } catch (Throwable throwable) {
            Logger.warn("Failed to open project: %s", throwable);
            return false;
        }
    }

}
