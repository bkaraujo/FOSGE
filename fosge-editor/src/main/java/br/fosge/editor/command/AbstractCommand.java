package br.fosge.editor.command;

import br.fosge.Logger;
import br.fosge.Triplet;
import br.fosge.editor.ui.framworks.action.Command;
import br.fosge.tools.Meta;

import java.util.List;

abstract class AbstractCommand implements Command {

    protected <T> T get(String name, Class<T> type, List<Triplet<?>> triplets) {
        for (final var triplet : triplets) {
            if (triplet.name().contentEquals(name)) {
                return Meta.cast(triplet.value(), type);
            }
        }

        Logger.warn("Parameter %s not found", name);
        return null;
    }

}
