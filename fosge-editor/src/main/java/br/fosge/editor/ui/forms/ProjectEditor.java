package br.fosge.editor.ui.forms;

import br.fosge.editor.ui.framework.component.FGFrame;
import br.fosge.editor.ui.framework.dock.RootPanel;
import br.fosge.tools.Strings;
import br.fosge.tools.Yaml;
import net.miginfocom.swing.MigLayout;

public final class ProjectEditor extends FGFrame {
    private final Yaml yaml;

    public ProjectEditor(Yaml desired) {
        yaml = desired;

        setResizable(true);
        setSize(1024, 768);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        final var projectName = yaml.asString("project.name");
        setTitle("FOSGE :: %s".formatted(Strings.toTitleCase(projectName)));
        setLayout(new MigLayout("fill"));
        setContentPane(new RootPanel());
    }

    @Override
    public void reset() {

    }

}
