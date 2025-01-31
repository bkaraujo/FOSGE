package br.fosge.editor.ui;

import br.fosge.commons.annotation.Facade;

import javax.swing.*;

public abstract class Swing implements Facade {
    private Swing() {}

    public static void invokeLater(final Runnable runnable) {
        SwingUtilities.invokeLater(runnable);
    }

    public static void invokeAndWait(final Runnable runnable) {
        try { SwingUtilities.invokeAndWait(runnable); }
        catch (Throwable ignored) {}
    }

}
