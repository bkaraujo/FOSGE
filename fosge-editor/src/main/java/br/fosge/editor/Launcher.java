package br.fosge.editor;

import br.fosge.Logger;
import br.fosge.MessageBus;
import br.fosge.RT;
import br.fosge.editor.forms.BrowseFrame;
import br.fosge.editor.ui.SWTools;
import br.fosge.editor.ui.UIState;
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

    public static void main(String[] args) throws Exception {
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
            }
        }, FocusEvent.FOCUS_EVENT_MASK);

        RT.set("settingsfs", RT.rootfs().resolve("settings"));

        SwingUtilities.invokeLater(() -> {
            final var window = new BrowseFrame();
            if (!window.initialize()) {
                Logger.error("Failed to initialize %s", Meta.fqn(window));
                Meta.exit(99);
            }

            SWTools.toScreenCenter(window);
            window.setVisible(true);
        });
    }

    @MessageListener
    public MessagePipeline handle(UIBeepEvent event) {
        toolkit.beep();
        return MessagePipeline.CONSUMED;
    }

}
