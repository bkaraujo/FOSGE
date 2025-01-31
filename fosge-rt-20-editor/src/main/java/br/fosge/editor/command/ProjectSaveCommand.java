package br.fosge.editor.command;

import java.nio.file.Path;

public record ProjectSaveCommand(
        Path folder
) implements Command {

    @Override
    public boolean execute() {
        return false;
    }
}
