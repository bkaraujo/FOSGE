package br.fosge.editor.ui.forms;

import br.fosge.editor.ui.framework.component.FGFrame;
import br.fosge.tools.Yaml;

public final class ProjectEditor extends FGFrame {
    private final Yaml yaml;

    public ProjectEditor(Yaml desired) {
        yaml = desired;

        setResizable(true);
        setSize(1024, 768);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setTitle("FOSGE :: %s".formatted(yaml.asString("project.name")));
    }

    @Override
    public void reset() {

    }

}
