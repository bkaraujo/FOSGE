package br.fosge.editor.ui.command;

import br.fosge.Logger;
import br.fosge.RT;
import br.fosge.tools.Meta;
import br.fosge.tools.Yaml;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class ProjectCreateCommand implements Command {

    @Override
    public boolean execute(Map<String, ?> values) {
        try {
            insertKnownProject(values);
            createProjectFolder(values);

            return true;
        } catch (Throwable throwable) {
            Logger.warn("Failed to create project: %s", throwable);
            return false;
        }
    }

    private void insertKnownProject(final Map<String, ?> values) {
        final var yaml = Yaml.from(RT.get("projects.yml", Path.class)).raw();
        if (!yaml.containsKey("projects")) { yaml.put("projects", new ArrayList<>()); }

        final var project = new HashMap<String, Object>();
        final var projectName = Meta.cast(values.get("project.name"), String.class);
        final var projectPath = Meta.cast(values.get("project.path"), String.class);

        project.put("path", projectPath + "/" + projectName.toLowerCase());
        project.put("thumbnail", "n/a");

        final var projects = (List< Map<String, Object>>) yaml.get("projects");
        projects.add(project);

        Yaml.from(yaml).save(RT.get("projects.yml", Path.class));
    }

    private void createProjectFolder(final Map<String, ?> values) {
        final var projectName = Meta.cast(values.get("project.name"), String.class);
        final var projectPath = Meta.cast(values.get("project.path"), String.class);

        final var path = Path.of(projectPath, projectName);
        try {
            for (final var folder : new String[]{ "sound", "texture", "geometry" }) {
                Files.createDirectories(path.resolve("assets", folder));
            }

            {
                final var yaml = Yaml.empty().raw();
                final var project = (HashMap<String, Object>) yaml.put("project", new HashMap<String, Object>());
                project.put("name", projectName);
                project.put("version", "0.1.0");
                Yaml.from(yaml).save(path.resolve("project.yml"));
            }

            Files.createFile(path.resolve("settings.yml"));
        } catch (final Throwable throwable) {
            Logger.error("Failed to create %s: %s", path, throwable);
        }
    }
}