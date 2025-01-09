package br.fosge.editor;

/**
 * Set of keys used with the {@link br.fosge.commons.RT RT} facility.
 */
public abstract class RTKeys {
    private RTKeys(){}

    public static abstract class UI {
        private UI(){}

        public static final String MULTI_CLICK_INTERVAL = "fosge.editor.ui.multiClickInterval";
        public static final String WINDOWS = "fosge.editor.ui.open-window";
    }

    public static abstract class Editor {
        private Editor(){}

        public static final String SETTINGS_DIR = "fosge.editor.settings.dir";
        public static final String SETTINGS_FILE = "fosge.editor.settings.file";
        public static final String PROJECTS_FILE = "fosge.editor.projects.file";
    }

    public static abstract class Project {

        private Project(){}

        public static final String PATH = "fosge.project.path";
        public static final String NAME = "fosge.project.name";
        public static final String TYPE = "fosge.project.type";
        public static final String VERSION = "fosge.project.version";
    }

}
