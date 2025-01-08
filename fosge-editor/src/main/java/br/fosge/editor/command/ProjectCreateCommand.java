package br.fosge.editor.command;

import br.fosge.commons.Logger;
import br.fosge.commons.RT;
import br.fosge.commons.tools.Meta;
import br.fosge.commons.tools.Yaml;
import br.fosge.editor.RTKeys;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public final class ProjectCreateCommand implements Command {
    public static final String PROJECT_NAME = RTKeys.Project.NAME;
    public static final String PROJECT_PATH = RTKeys.Project.PATH;
    public static final String PROJECT_TYPE = RTKeys.Project.TYPE;

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
        final var yaml = RT.get(RTKeys.Editor.PROJECTS, Yaml.class);
        final var projectName = Meta.cast(values.get(RTKeys.Project.NAME), String.class);
        projectPath = Path.of(Meta.cast(values.get(RTKeys.Project.PATH), String.class), projectName.toLowerCase());
        yaml.append("projects", "path", projectPath.toString());
        yaml.put("projects.0.thumbnail", "n/a");
        yaml.save();
    }

    private void createProjectFolder(final Map<String, ?> values) {
        final var projectName = Meta.cast(values.get(PROJECT_NAME), String.class);
        final var projectPath = Meta.cast(values.get(PROJECT_PATH), String.class);

        final var path = Path.of(projectPath, projectName);
        try {
            for (final var folder : new String[]{ "sound", "texture", "geometry" }) {
                Files.createDirectories(path.resolve("assets", folder));
            }

            final var yaml = Yaml.empty();
            yaml.put(RTKeys.Project.NAME, projectName);
            yaml.put(RTKeys.Project.VERSION, "0.1.0");
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
