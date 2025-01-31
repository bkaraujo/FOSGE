package br.fosge.editor.command;

import br.fosge.commons.Logger;
import br.fosge.editor.ui.form.ProjectBrowserForm;

import java.nio.file.Path;

public record BrowserOpenCommand(
        Path folder
) implements Command {

    @Override
    public boolean execute() {

        final var form = new ProjectBrowserForm();
        if (!form.initialize()) {
            Logger.error("Failed to initialize the form.");
            return false;
        }

        form.setLocationRelativeTo(null);
        form.setVisible(true);

        return true;
    }
}
