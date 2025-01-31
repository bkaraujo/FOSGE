package br.fosge.editor.project;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public enum ProjectType {
    EMPTY("Empty"),
    DD("2D"),
    DD_AND_A_HALF("2.5D"),
    DDD("3d");

    public final String displayName;
    ProjectType(String desired) {
        displayName = desired;
    }

    @Nullable
    public static ProjectType of(final @Nonnull String desired) {
        for (ProjectType type : ProjectType.values()) {
            if (type.displayName.equals(desired)) {
                return type;
            }
        }

        return null;
    }
}
