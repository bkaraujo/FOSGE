package br.fosge.editor;

import br.fosge.Logger;
import br.fosge.MessageBus;
import br.fosge.editor.ui.Forms;
import br.fosge.editor.ui.SwingTools;
import br.fosge.editor.ui.UIState;
import br.fosge.editor.ui.event.UIBeepEvent;
import br.fosge.logger.LogLevel;
import br.fosge.message.MessageListener;
import br.fosge.message.MessagePipeline;
import br.fosge.tools.Meta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.nio.file.Files;

public class Launcher {
    private final Toolkit toolkit = Toolkit.getDefaultToolkit();

    public static void main(String[] args) throws Exception {
        new Launcher();
    }

    public Launcher() throws Exception {
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

        if (!RuntimeState.SETTINGSFS.toFile().exists()) {
            if (!RuntimeState.SETTINGSFS.toFile().mkdirs()) {
                Logger.error("Failed to create: %s", RuntimeState.SETTINGSFS);
            }
        }

        for (final var file : new String[] {"editor.yaml", "projects.yaml"}) {
            final var absolute = RuntimeState.SETTINGSFS.resolve(file);

            if (!absolute.toFile().exists()) {
                Logger.trace("Creating file: %s", absolute);
                Files.createFile(absolute);
            }
        }

        SwingUtilities.invokeLater(() -> {
            final var form = Forms.projectBrowse();
            if (!form.initialize()) { Logger.error("Failed to initialize %s", Meta.fqn(form)); Meta.exit(99); }

            SwingTools.centralize(form);
            form.setVisible(true);
        });
    }

    @MessageListener
    public MessagePipeline handle(UIBeepEvent event) {
        toolkit.beep();
        return MessagePipeline.CONSUMED;
    }

}
