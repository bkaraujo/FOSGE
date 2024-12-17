package br.fosge.editor.ui.command;

import java.util.Map;

public abstract class Commands {

    public static boolean projectCreate(Map<String, ?> values) {
        return new ProjectCreateCommand().execute(values);
    }

    public static boolean projectOpen(Map<String, ?> values) {
        return new ProjectOpenCommand().execute(values);
    }
}
