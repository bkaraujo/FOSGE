package br.fosge.editor.ui.container;

import br.fosge.commons.Logger;
import br.fosge.commons.RT;
import br.fosge.commons.annotation.Lifecycle;
import br.fosge.commons.tools.Meta;
import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class FGFrame extends JFrame implements Lifecycle {

    static {
        FlatDarkLaf.setup();
    }

    public FGFrame() {
        this(null, null);
    }

    public FGFrame(GraphicsConfiguration gc) {
        this(null, gc);
    }

    public FGFrame(String title) throws HeadlessException {
        this(title, null);
    }

    public FGFrame(String title, GraphicsConfiguration gc) {
        super(title, gc);

        var count = RT.getInt("fosge.editor.windows");
        RT.set("fosge.editor.windows", Integer.class, count == null ? 1 : count + 1);
    }

    public Map<String, ?> values() {
        Logger.fatal("Implementation missing");
        return new HashMap<>();
    }

    public void reset() {
        Logger.fatal("Implementation missing");
    }

    @Override
    public boolean initialize() {
        return initialize((JFrame) this);
    }

    private boolean initialize(Container container) {
        for (final var child : container.getComponents()) {
            if (Meta.assignable(child, Lifecycle.class)) {
                if (!initialize(Meta.cast(child, Lifecycle.class))) {
                    return false;
                }
            }

            if (Meta.assignable(child, Container.class)) {
                if (!initialize(Meta.cast(child, Container.class))) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean initialize(Lifecycle lifecycle) {
        if (!lifecycle.initialize()) {
            Logger.error("Failed to initialize %s", Meta.fqn(lifecycle));
            return false;
        }

        return true;
    }

    @Override
    public void dispose() {
        setVisible(false);
        SwingUtilities.invokeLater(super::dispose);
        SwingUtilities.invokeLater(() -> {
            var count = RT.getInt("fosge.editor.windows");
            if (count == null) { Logger.error("Wrong window count @ fosge.editor.windows"); }
            RT.set("fosge.editor.windows", Integer.class, count == null ? 0 : count - 1);

            if (RT.getInt("fosge.editor.windows") == 0) {
                Logger.debug("No more window showing ...");
                Meta.exit(0);
            }
        });
    }
}
