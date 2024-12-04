package br.fosge.editor.ui;

import br.fosge.editor.dialog.ProjectBrowseDialog;
import br.fosge.editor.forms.EditorForm;

public abstract class Forms {
    private Forms() { /* Private constructor */ }

    public static EditorForm editor() { return new EditorForm(); }
    public static ProjectBrowseDialog projectBrowse() { return new ProjectBrowseDialog(); }
}
