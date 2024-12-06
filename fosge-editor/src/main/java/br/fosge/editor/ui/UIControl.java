package br.fosge.editor.ui;

import br.fosge.editor.RuntimeState;
import br.fosge.editor.ui.component.JLimitedDocument;
import br.fosge.editor.ui.component.RadioButtonSpec;
import br.fosge.graphics.Rectangle;
import br.fosge.tools.Meta;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

public abstract class UIControl {
    private UIControl()  { /* Private constructor */ }
    private static final Border errorBorder = BorderFactory.createLineBorder(Color.red, 3);

    public static Border errorBorder() {
        return errorBorder;
    }

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

    public static JRadioButton radioButton(ButtonGroup group) {
        final var iterator = group.getElements().asIterator();
        while (iterator.hasNext()) {
            final var element = iterator.next();
            if (element.isSelected()) {
                return Meta.cast(element, JRadioButton.class);
            }
        }

        return null;
    }

    public static void clear(ButtonGroup group) {
        final var iterator = group.getElements();
        while (iterator.hasMoreElements()) {
            final var element = iterator.nextElement();
            element.setSelected(false);
        }
    }

    public static JTextField textField() {
        return textField(300);
    }

    public static JTextField textField( EventListener ... listeners) {
        return textField(300, listeners);
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

    public static String chooseDirectory(JComponent parent) {
        final var path = choose(parent, JFileChooser.DIRECTORIES_ONLY, "Select");
        return path != null ? path.toString() : "";
    }

    public static String chooseFile(JComponent parent) {
        final var path = choose(parent, JFileChooser.FILES_ONLY, "Open");
        return path != null ? path.toString() : null;
    }

    private static Path choose(JComponent parent, int type, String btnName) {
        final var fileChooser = new JFileChooser(RuntimeState.ROOTFS.toString());
        fileChooser.setFileSelectionMode(type);
        fileChooser.setApproveButtonText(btnName);

        final var option = fileChooser.showOpenDialog(parent);
        if(option == JFileChooser.APPROVE_OPTION){
            return Path.of(fileChooser.getSelectedFile().toURI());
        }

        return null;
    }
}
