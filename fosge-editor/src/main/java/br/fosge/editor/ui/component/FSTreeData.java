package br.fosge.editor.ui.component;

import br.fosge.commons.tools.Meta;

import java.nio.file.Path;

public record FSTreeData(
        Path path
) {

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!Meta.assignable(obj, FSTreeData.class)) return false;
        return Meta.cast(obj, FSTreeData.class).path.equals(path);
    }

    @Override
    public int hashCode() {
        return path.hashCode();
    }

    @Override
    public String toString() {
        return path.toFile().getName();
    }

}
