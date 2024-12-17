package br.fosge.editor.ui.framework;

import br.fosge.Logger;
import br.fosge.editor.ui.framework.component.FGFrame;
import br.fosge.tools.Meta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class ActionAdapter implements ActionListener {

    protected final FGFrame frame;
    private final String actionCommand;
    protected ActionAdapter(final FGFrame frame, String actionCommand) {
        this.frame = frame;
        this.actionCommand = actionCommand;
    }

    @Override
    public final void actionPerformed(ActionEvent event) {
        if (!Meta.assignable(event.getSource(), AbstractButton.class)) {
            Logger.warn("Don't know how to process: %s", Meta.fqn(event.getSource()));
            return;
        }

        final var button = Meta.cast(event.getSource(), AbstractButton.class);
        if (button.getActionCommand() == null) { return; }
        if (!button.getActionCommand().equals(actionCommand)) { return; }

        doAction(event);
    }

    protected abstract void doAction(ActionEvent event);
}
