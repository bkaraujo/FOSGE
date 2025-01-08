package br.fosge.editor.project;

public enum ProjectType {
    EMPTY("Empty"),
    FIRST_PERSON("1st Person"),
    THIRD_PERSON("3rd Person"),
    ISOMETRIC("Isometric");

    public final String displayName;
    ProjectType(final String desired) {
        displayName = desired;
    }

    public static ProjectType ofDisplayName(String name) {
        for (final var value : ProjectType.values()) {
            if (value.displayName.equals(name)) {
                return value;
            }
        }

        return null;
    }
}
