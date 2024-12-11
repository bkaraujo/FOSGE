package br.fosge.editor.ui.component;

import br.fosge.Logger;
import br.fosge.annotation.Lifecycle;
import br.fosge.math.SimpleMath;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class FGPanel extends JPanel implements Lifecycle {
    private GradientPaint gradient;
    private FGGradientSpec gradientSpec;

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

    public static FGPanel newFlow() {
        return new FGPanel(new FlowLayout());
    }

    public static FGPanel newBorder() {
        return new FGPanel(new BorderLayout());
    }

    public static FGPanel newGridBag() {
        return new FGPanel(new GridBagLayout());
    }

    public static FGPanel newGrid() {
        return new FGPanel(new GridLayout());
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
