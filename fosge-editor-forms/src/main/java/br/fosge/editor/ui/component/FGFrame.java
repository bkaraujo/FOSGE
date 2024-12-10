package br.fosge.editor.ui.component;

import br.fosge.annotation.Lifecycle;
import br.fosge.tools.Meta;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class FGFrame extends JFrame implements Lifecycle {

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

    public void reset() {}
    public boolean submit(Map<String, ?> values) {
        return false;
    }
}
