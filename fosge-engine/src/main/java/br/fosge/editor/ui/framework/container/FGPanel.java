package br.fosge.editor.ui.framework.container;

import br.fosge.commons.Logger;
import br.fosge.commons.annotation.Lifecycle;
import br.fosge.editor.command.Command;
import net.miginfocom.swing.MigLayout;

import javax.annotation.Nullable;
import javax.swing.*;
import java.awt.*;

public class FGPanel extends JPanel implements Lifecycle {
    private GradientPaint gradient;

    public static FGPanel newBoxVertical() {
        final var panel = new FGPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        return panel;
    }

    public static FGPanel newBoxHorizontal() {
        final var panel = new FGPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        return panel;
    }

    public static FGPanel mig() { return mig(null); }
    public static FGPanel mig(String layout) { return mig(layout, null); }
    public static FGPanel mig(String layout, String column) { return mig(layout, column, null); }
    public static FGPanel mig(String layout, String column, String row) {
        final var panel = new FGPanel();
        panel.setLayout(new MigLayout(layout, column, row));

        return panel;
    }

    protected FGPanel() {
        this(new FlowLayout());
    }

    protected FGPanel(LayoutManager layout) {
        super(layout);
    }

    public FGPanel add(FGPanel component) {
        return add(FGPanel.class, component);
    }

    public <T> T add(Class<T> type, Component component) {
        return type.cast(super.add(component));
    }

    public <T> T add(Class<T> type, Component component, String constraints) {
        super.add(component, constraints);
        return type.cast(component);
    }

    public void reset() {
        Logger.fatal("Implementation missing");
    }

    @Nullable
    public Command command() { return null; }
}
