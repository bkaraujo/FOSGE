package br.fosge.editor.command;

import br.fosge.commons.Logger;
import br.fosge.commons.tools.Meta;
import br.fosge.editor.forms.ProjectBrowse;
import br.fosge.editor.ui.SWTools;

import java.util.Map;

public final class BrowserOpenCommand implements Command {

    @Override
    public boolean execute(Map<String, ?> param) {
        final var window = new ProjectBrowse();

        if (!window.initialize()) {
            Logger.error("Failed to initialize %s", Meta.fqn(window));
            return false;
        }

        SWTools.toScreenCenter(window);
        window.setVisible(true);

        return true;
    }
}
