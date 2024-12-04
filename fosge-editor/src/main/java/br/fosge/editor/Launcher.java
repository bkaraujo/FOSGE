package br.fosge.editor;

import br.fosge.Logger;
import br.fosge.MessageBus;
import br.fosge.editor.ui.Forms;
import br.fosge.editor.ui.UIState;
import br.fosge.editor.ui.Components;
import br.fosge.editor.ui.event.UIBeepEvent;
import br.fosge.logger.LogLevel;
import br.fosge.message.MessageListener;
import br.fosge.message.MessagePipeline;
import br.fosge.tools.Meta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;

public class Launcher {
    private final Toolkit toolkit = Toolkit.getDefaultToolkit();

    public static void main(String[] args) {
        new Launcher();
    }

    public Launcher() {
        Logger.level(LogLevel.TRACE);
        MessageBus.subscribe(this);
        toolkit.addAWTEventListener(e -> {
            if (e.getID() != FocusEvent.FOCUS_LOST) return;
            if (Meta.assignable(e.getSource(), Component.class)) return;
            final var component = Meta.cast(e.getSource(), Component.class);
            if (component != UIState.lastFocus) {
                UIState.lastFocus = component;
                Logger.trace("UIState.lastFocus = %s", Meta.fqn(UIState.lastFocus));
            }
        }, FocusEvent.FOCUS_EVENT_MASK);

        SwingUtilities.invokeLater(() -> {
//            final var form = new EditorForm();
            final var form = Forms.projectBrowse();
            if (!form.initialize()) {
                Logger.error("Failed to initialize Form");
            }

            Components.centralize(form);
            form.setVisible(true);
        });
    }

    @MessageListener
    public MessagePipeline handle(UIBeepEvent event) {
        toolkit.beep();
        return MessagePipeline.CONSUMED;
    }

}
