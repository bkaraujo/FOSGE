package br.fosge.editor.ui.command;

import br.fosge.Logger;
import br.fosge.RT;
import br.fosge.tools.Meta;
import br.fosge.tools.Yaml;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public final class ProjectCreateCommand implements Command {
    public static final String PROJECT_NAME = "project.name";
    public static final String PROJECT_PATH = "project.path";
    public static final String PROJECT_TYPE = "project.type";

    private Path projectPath;

    ProjectCreateCommand(){}

    @Override
    public boolean execute(Map<String, ?> values) {
        try {
            insertKnownProject(values);
            createProjectFolder(values);
            openProject();
            return true;
        } catch (Throwable throwable) {
            Logger.warn("Failed to create project: %s", throwable);
            return false;
        }
    }

    private void insertKnownProject(final Map<String, ?> values) {
        final var yaml = RT.get("editor.projects", Yaml.class);
        final var projectName = Meta.cast(values.get(PROJECT_NAME), String.class);
        projectPath = Path.of(Meta.cast(values.get(PROJECT_PATH), String.class), projectName.toLowerCase());
        yaml.append("projects", "path", projectPath.toString());
        yaml.put("projects.0.thumbnail", "n/a");
        yaml.save();
    }

    private void createProjectFolder(final Map<String, ?> values) {
        final var projectName = Meta.cast(values.get("project.name"), String.class);
        final var projectPath = Meta.cast(values.get("project.path"), String.class);

        final var path = Path.of(projectPath, projectName);
        try {
            for (final var folder : new String[]{ "sound", "texture", "geometry" }) {
                Files.createDirectories(path.resolve("assets", folder));
            }

            final var yaml = Yaml.empty();
            yaml.put("project.name", projectName);
            yaml.put("project.version", "0.1.0");
            yaml.save(path.resolve("project.yml"));

            Files.createFile(path.resolve("settings.yml"));
        } catch (final Throwable throwable) {
            Logger.error("Failed to create %s: %s", path, throwable);
        }
    }

    private void openProject() {
        Commands.projectOpen(projectPath.toString());
    }
}
