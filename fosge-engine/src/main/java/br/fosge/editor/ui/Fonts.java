package br.fosge.editor.ui;

import java.awt.*;

public abstract class Fonts {
    public static final int DEFAULT_SIZE = 16;
    public static final int DEFAULT_STYLE = Font.PLAIN;
    public static final String DEFAULT_NAME = "Droid Serif";

    public static Font fontDefault() {
        return fontDroidSerifRegular(DEFAULT_SIZE);
    }

    public static Font fontDroidSerifRegular(int size) {
        return fontDroidSerif(DEFAULT_STYLE, size);
    }

    public static Font fontDroidSerif(int style, int size) {
        return custom(DEFAULT_NAME, style, size);
    }

    public static Font custom(String name, int style, int size) {
        return new Font(name, style, size);
    }
}
