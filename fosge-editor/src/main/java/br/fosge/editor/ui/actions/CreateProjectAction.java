package br.fosge.editor.ui.actions;

import br.fosge.Logger;
import br.fosge.RT;
import br.fosge.editor.ui.forms.ProjectBrowseCreatePanel;
import br.fosge.editor.ui.forms.ProjectEditor;
import br.fosge.editor.ui.framework.ActionAdapter;
import br.fosge.editor.ui.framework.SWTools;
import br.fosge.editor.ui.framework.component.FGFrame;
import br.fosge.tools.Meta;
import br.fosge.tools.Yaml;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class CreateProjectAction extends ActionAdapter {

    public CreateProjectAction(FGFrame frame) {
        super(frame, ProjectBrowseCreatePanel.ACTION);
    }

    @Override
    protected void doAction(ActionEvent event) {
        final var values = frame.values();

        insertKnownProject(values);
        createProjectFolder(values);

        frame.setVisible(false);
        frame.dispose();

        SwingUtilities.invokeLater(() -> {
            final var projectName = Meta.cast(values.get("project.name"), String.class);
            final var projectPath = Meta.cast(values.get("project.path"), String.class);
            final var frame = new ProjectEditor(Path.of(projectPath, projectName));
            SWTools.toScreenCenter(frame);
            frame.setVisible(true);
        });
    }

    private void insertKnownProject(final Map<String, ?> values) {
        final var yaml = Yaml.load(RT.get("projects.yml", Path.class));
        if (!yaml.containsKey("projects")) { yaml.put("projects", new ArrayList<>()); }

        final var project = new HashMap<String, Object>();
        final var projectName = Meta.cast(values.get("project.name"), String.class);
        final var projectPath = Meta.cast(values.get("project.path"), String.class);

        project.put("path", projectPath + "/" + projectName.toLowerCase());
        project.put("thumbnail", "n/a");

        final var projects = (List< Map<String, Object>>) yaml.get("projects");
        projects.add(project);

        Yaml.save(RT.get("projects.yml", Path.class), yaml);
    }

    private void createProjectFolder(final Map<String, ?> values) {
        final var projectName = Meta.cast(values.get("project.name"), String.class);
        final var projectPath = Meta.cast(values.get("project.path"), String.class);

        final var path = Path.of(projectPath, projectName);
        try {
            for (final var folder : new String[]{ "sound", "texture", "geometry" }) {
                Files.createDirectories(path.resolve("assets", folder));
            }

            Files.createFile(path.resolve("project.yml"));
            Files.createFile(path.resolve("settings.yml"));
        } catch (final Throwable throwable) {
            Logger.error("Failed to create %s: %s", path, throwable);
        }
    }
}
