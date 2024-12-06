package br.fosge.editor.ui;

import br.fosge.Logger;
import br.fosge.Triplet;
import br.fosge.tools.Meta;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class FPanel extends JPanel {

    public void reset() {}
    public List<Triplet<?>> values() { return new ArrayList<>(); }

    public final void resetTree() {
        for (final var component : getComponents()) {
            if (Meta.assignable(component, FPanel.class)) {
                final var panel = Meta.cast(component, FPanel.class);
                panel.resetTree();
            }
        }

        Logger.trace("Resetting: %s", Meta.fqn(this));
        reset();
    }
}
