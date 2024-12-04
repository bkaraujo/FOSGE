package br.fosge.editor.ui;

import br.fosge.editor.ui.dialog.ProjectBrowseDialog;
import br.fosge.editor.ui.forms.EditorForm;

public abstract class Forms {
    private Forms() { /* Private constructor */ }

    public static EditorForm editor() { return new EditorForm(); }
    public static ProjectBrowseDialog projectBrowse() { return new ProjectBrowseDialog(); }
}
