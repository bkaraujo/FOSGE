package br.fosge.editor.ui.component;

import br.fosge.Logger;
import br.fosge.annotation.Lifecycle;
import br.fosge.tools.Meta;

import javax.swing.*;
import javax.swing.text.JTextComponent;
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
        setContentPane(new FGPanel());
    }

    public final Map<String, ?> values() {
        final var values = new HashMap<String, Object>();

        for (final var child : getComponents()) {
            if (Meta.assignable(child, JComponent.class)) {
                final var component = Meta.cast(child, JComponent.class);
                values.putAll(values(getName(), component.getComponents()));
                continue;
            }

            if (Meta.assignable(child, JTextComponent.class)) {
                final var component = Meta.cast(child, JTextComponent.class);
                values.put("%s.%s".formatted(getName(), component.getName()), component.getText());
                continue;
            }

            if (Meta.assignable(child, JToggleButton.class)) {
                final var component = Meta.cast(child, JToggleButton.class);
                values.put("%s.%s".formatted(getName(), component.getName()), component.isSelected());
                continue;
            }

            if (Meta.assignable(child, JList.class)) {
                final var component = Meta.cast(child, JList.class);
                values.put("%s.%s".formatted(getName(), component.getName()), component.getSelectedValuesList());
            }
        }

        return values;
    }

    private Map<String,?> values(String parent, Component[] components) {
        final var values = new HashMap<String, Object>();
        for (final var child : components) {
            if (Meta.assignable(child, JComponent.class)) {
                final var component = Meta.cast(child, JComponent.class);
                values.putAll(values(getName(), component.getComponents()));
                continue;
            }

            if (Meta.assignable(child, JTextComponent.class)) {
                final var component = Meta.cast(child, JTextComponent.class);
                values.put("%s.%s.%s".formatted(parent, child.getName(), component.getName()), component.getText());
                continue;
            }

            if (Meta.assignable(child, JToggleButton.class)) {
                final var component = Meta.cast(child, JToggleButton.class);
                values.put("%s.%s.%s".formatted(parent, child.getName(), component.getName()), component.isSelected());
                continue;
            }

            if (Meta.assignable(child, JList.class)) {
                final var component = Meta.cast(child, JList.class);
                values.put("%s.%s.%s".formatted(parent, child.getName(), component.getName()), component.getSelectedValuesList());
            }
        }

        return values;
    }

    public void reset() {
        for (final var child : getComponents()) {
            if (Meta.assignable(child, FGPanel.class)) {
                final var component = Meta.cast(child, FGPanel.class);
                component.reset();
            }
        }
    }

    public boolean submit(Map<String, ?> values) {
        return false;
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
}
