package br.fosge.editor;

import br.fosge.RT;
import br.fosge.commons.Launcher;
import br.fosge.commons.Logger;
import br.fosge.commons.filesystem.Directories;
import br.fosge.commons.serializer.Yaml;

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
        return true;
    }

    @Override
    public boolean terminate() {
        RT.yaml.save();

        return true;
    }
}
