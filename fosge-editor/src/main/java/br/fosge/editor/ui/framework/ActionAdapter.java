package br.fosge.editor.ui.framework;

import br.fosge.editor.ui.framework.component.FGFrame;

import javax.swing.*;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ActionAdapter implements Action {
    private boolean enabled = true;
    private final Map<String, Object> values = new HashMap<>();
    private final List<PropertyChangeListener> listeners = new ArrayList();

    protected final FGFrame frame;
    protected ActionAdapter(final FGFrame frame) {
        this.frame = frame;
    }

    @Override public final Object getValue(String key) { return values.getOrDefault(key, null); }
    @Override public final void putValue(String key, Object value) { values.put(key, value); }

    @Override public final boolean isEnabled() { return enabled; }
    @Override public final void setEnabled(boolean desired) { enabled = desired; }

    @Override public final void addPropertyChangeListener(PropertyChangeListener desired) { listeners.add(desired); }
    @Override public final void removePropertyChangeListener(PropertyChangeListener desired) { listeners.remove(desired); }
}
