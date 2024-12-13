package br.fosge.editor.ui.component;

import br.fosge.annotation.Lifecycle;
import br.fosge.math.SimpleMath;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class FGPanel extends JPanel implements Lifecycle {
    private GradientPaint gradient;
    private FGGradientSpec gradientSpec;

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
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                if (gradientSpec == null) return;

                final var size = e.getComponent().getSize();
                final var solidSize = SimpleMath.percentageOf(gradientSpec.solid(), size.height);
                final var transitionSize = SimpleMath.percentageOf(gradientSpec.transition(), size.height);

                gradient = new GradientPaint(
                        0, solidSize, Color.BLUE,
                        0, solidSize + transitionSize, Color.BLACK
                );
            }
        });
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

    public void reset() {}

    public final void gradient(FGGradientSpec desired) { gradientSpec = desired; }
    public final FGGradientSpec gradient() { return gradientSpec; }

    @Override
    protected void paintChildren(Graphics g) {
        if (gradientSpec == null) { super.paintChildren(g); return; }

        final var g2 = (Graphics2D) g;
        g2.setPaint(gradient);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintChildren(g);
    }

}
