package br.fosge.editor.command;

import java.util.HashMap;
import java.util.Map;

public abstract class Commands {

    public static boolean projectCreate(Map<String, ?> values) {
        return new ProjectCreateCommand().execute(values);
    }

    public static boolean projectOpen(String path) {
        final var values = new HashMap<String, Object>();
        values.put(ProjectOpenCommand.PROJECT_PATH, path);

        return projectOpen(values);
    }

    public static boolean projectOpen(Map<String, ?> values) {
        return new ProjectOpenCommand().execute(values);
    }
}
