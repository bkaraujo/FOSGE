package br.fosge.editor;

public abstract class RTKeys {
    private RTKeys(){}

    public static abstract class Editor {
        private Editor(){}

        public static final String SETTINGS = "editor.settings";
        public static final String PROJECTS = "editor.projects";
    }

    public static abstract class Project {

        private Project(){}

        public static final String PATH = "project.path";
        public static final String NAME = "project.name";
        public static final String TYPE = "project.type";
        public static final String VERSION = "project.version";
    }

}
