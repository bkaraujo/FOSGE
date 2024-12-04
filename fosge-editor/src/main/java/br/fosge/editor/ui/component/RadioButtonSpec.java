package br.fosge.editor.ui.component;

import javax.swing.*;
import java.util.EventListener;

public record RadioButtonSpec (
        ButtonGroup group,
        String name,
        EventListener ... listeners
) {

    public RadioButtonSpec(String name) {
        this(null, name);
    }

    public RadioButtonSpec(String name, EventListener ... listeners) {
        this(null, name, listeners);
    }
}
