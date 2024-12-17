package br.fosge.editor.ui.actions;

import br.fosge.Logger;
import br.fosge.editor.ui.framework.ActionAdapter;
import br.fosge.editor.ui.framework.component.FGFrame;

import java.awt.event.ActionEvent;

public final class NoopAction extends ActionAdapter {

    public NoopAction(FGFrame frame) {
        super(frame);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Logger.debug("No action");
    }
}
