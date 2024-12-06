package br.fosge.editor.command;

import br.fosge.Logger;
import br.fosge.Triplet;
import br.fosge.editor.ui.FFrame;
import br.fosge.editor.ui.SwingTools;
import br.fosge.tools.Meta;

import java.nio.file.Path;
import java.util.List;

public class OpenWindowCommand extends AbstractCommand {

    @Override
    public boolean execute(List<Triplet<?>> parameters) {
        final var frame = get("frame", FFrame.class, parameters);
        final var path = get("path", Path.class, parameters);
        if (frame == null || path == null) return false;

        if (!frame.initialize()) {
            Logger.error("Failed to initialize %s", Meta.fqn(frame));
            return false;
        }

        SwingTools.centralize(frame);
        frame.setTitle("FOSGE :: %s".formatted(path));
        frame.setVisible(true);

        return true;
    }

}
