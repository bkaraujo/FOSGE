package br.fosge.editor.ui.container;

import br.fosge.commons.Logger;
import br.fosge.commons.RT;
import br.fosge.commons.annotation.Lifecycle;
import br.fosge.commons.tools.Meta;
import br.fosge.editor.RTKeys;
import br.fosge.editor.ui.component.FGMenuItem;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class FGFrame extends JFrame implements Lifecycle {

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

        var count = RT.getInt(RTKeys.UI.WINDOWS);
        RT.set(RTKeys.UI.WINDOWS, Integer.class, count == null ? 1 : count + 1);
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

    public final void addMenu(String menu, FGMenuItem ... items) {
        final var mnu = new JMenu(menu);
        mnu.addSeparator();
        for (final var item : items) {
            if (item.title() == null && item.action() == null) {
                mnu.addSeparator();
                continue;
            }

            mnu.add(item.asMenuItem());
        }

        var menuBar = getJMenuBar();
        if (menuBar == null) {
            menuBar = new JMenuBar();
            setJMenuBar(menuBar);
        }

        menuBar.add(mnu);
    }

    public Map<String, ?> values() {
        Logger.fatal("Implementation missing");
        return new HashMap<>();
    }

    public void reset() {
        Logger.fatal("Implementation missing");
    }

    @Override
    public final void dispose() {
        setVisible(false);
        super.dispose();

        var count = RT.getInt(RTKeys.UI.WINDOWS);
        if (count == null) { Logger.error("Wrong window count @ %s", RTKeys.UI.WINDOWS); }
        RT.set(RTKeys.UI.WINDOWS, Integer.class, count == null ? 0 : count - 1);
    }
}
