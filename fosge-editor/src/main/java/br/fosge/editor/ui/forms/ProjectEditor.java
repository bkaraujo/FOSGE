package br.fosge.editor.ui.forms;

import br.fosge.editor.ui.framework.component.FGFrame;

import java.nio.file.Path;

public final class ProjectEditor extends FGFrame {
    private final Path path;

    public ProjectEditor(Path desired) {
        path = desired;

        setResizable(true);
        setSize(1024, 768);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setTitle("FOSGE :: %s".formatted(path));
    }

    @Override
    public void reset() {

    }

}
