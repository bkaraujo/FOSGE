package br.fosge.editor;

import br.fosge.RT;
import br.fosge.commons.Launcher;
import br.fosge.commons.Logger;
import br.fosge.commons.filesystem.Directories;
import br.fosge.commons.serializer.Yaml;
import br.fosge.editor.command.BrowserOpenCommand;
import br.fosge.editor.ui.Swing;

public class EditorLauncher extends Launcher {

    public EditorLauncher(){
        RT.yaml = Yaml.from(Directories.resolve("editor.yml"));
    }

    @Override
    public boolean initialize() {
        if (RT.yaml.isEmpty()) {
            Logger.error("Failed to load %s", RT.yaml);
            return false;
        }

        return true;
    }

    @Override
    public boolean run() {
        boolean[] result = new boolean[]{ true };

        Swing.invokeLater(() -> {
            final var command = new BrowserOpenCommand(RT.yaml.folder());
            if (!command.execute()) {
                Logger.error("Failed to open Project Browser");
                result[0] = false;
            }
        });

        return result[0];
    }

    @Override
    public boolean terminate() {
        RT.yaml.save();

        return true;
    }
}
