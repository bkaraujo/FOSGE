package br.fosge.editor.command;

import br.fosge.editor.project.ProjectType;

import java.nio.file.Path;

public record ProjectCreateCommand(
        Path folder,
        ProjectType projectType
) implements Command {

    @Override
    public boolean execute() {
        return false;
    }

}
