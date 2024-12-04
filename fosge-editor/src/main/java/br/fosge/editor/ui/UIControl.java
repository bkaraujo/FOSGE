package br.fosge.editor.ui;

import br.fosge.editor.ui.component.JLimitedDocument;
import br.fosge.editor.ui.component.RadioButtonSpec;
import br.fosge.graphics.Rectangle;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

public abstract class UIControl {
    private UIControl()  { /* Private constructor */ }

    public static JButton button(String title, EventListener... listeners) {
        return button(title, null, listeners);
    }

    public static JButton button(String title, Rectangle border, EventListener ... listeners) {
        final var component = new JButton(title);
        SwingTools.initialize(component, border, listeners);
        SwingTools.onMouseHover(component, Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

//        component.setMinimumSize(new Dimension(60, component.getHeight()));
//        component.setPreferredSize(component.getMinimumSize());
//        component.setMaximumSize(component.getMinimumSize());
        return component;
    }


    public static List<JRadioButton> radioButton(RadioButtonSpec... specs) {
        final var components = new ArrayList<JRadioButton>();

        for (final var spec : specs) {
            final var component = new JRadioButton(spec.name());
            spec.group().add(component);
            SwingTools.initialize(component, null, spec.listeners());
            components.add(component);
        }

        return components;
    }


    public static JTextField textField(int size) {
        return textField(size, (String) null);
    }

    public static JTextField textField(int size, EventListener ... listeners) {
        return textField(size, (String) null, listeners);
    }

    public static JTextField textField(int size, String title, EventListener ... listeners) {
        return textField(size, title, null, listeners);
    }

    public static JTextField textField(int size, Rectangle border, EventListener ... listeners) {
        return textField(size, null, border, listeners);
    }

    public static JTextField textField(int size, String title, Rectangle border, EventListener ... listeners) {
        final var component = new JTextField(title);

        if (size > 0 ) {
            component.setColumns(size);
            component.setDocument(new JLimitedDocument(size));
        }

        SwingTools.initialize(component, border, listeners);
        return component;
    }


}
