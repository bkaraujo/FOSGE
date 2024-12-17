package br.fosge.editor.ui.actions;

import br.fosge.Logger;
import br.fosge.editor.ui.framework.ActionAdapter;
import br.fosge.editor.ui.framework.component.FGFrame;
import br.fosge.tools.Meta;

import javax.swing.*;
import java.awt.event.ActionEvent;

public final class NoopAction extends ActionAdapter {

    public NoopAction(FGFrame frame) {
        super(frame, "");
    }

    @Override
    protected void doAction(ActionEvent event) {
        if (!Meta.assignable(event.getSource(), AbstractButton.class)) { return; }
        final var button = Meta.cast(event.getSource(), AbstractButton.class);
        if (button.getActionCommand() != null) { return; }

        Logger.debug("No action");
    }
}
