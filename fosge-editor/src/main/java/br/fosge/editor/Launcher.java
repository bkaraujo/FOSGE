package br.fosge.editor;

import br.fosge.Logger;
import br.fosge.MessageBus;
import br.fosge.RT;
import br.fosge.editor.ui.forms.ProjectBrowse;
import br.fosge.editor.ui.framework.SWTools;
import br.fosge.editor.ui.framework.UIState;
import br.fosge.editor.ui.framework.event.UIBeepEvent;
import br.fosge.logger.LogLevel;
import br.fosge.message.MessageListener;
import br.fosge.message.MessagePipeline;
import br.fosge.tools.Meta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.io.IOException;
import java.nio.file.Files;

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
            }
        }, FocusEvent.FOCUS_EVENT_MASK);

        createFilesystemStructures();

        SwingUtilities.invokeLater(() -> {
            final var window = new ProjectBrowse();
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

    private boolean createFilesystemStructures() {
        final var settingsfs = RT.rootfs().resolve("settings");
        RT.set("settingsfs", RT.rootfs().resolve("settings"));

        if (!Files.exists(settingsfs)) {
            try { Files.createDirectories(settingsfs); }
            catch (IOException e) { Logger.fatal("Failed to create %s: %s", settingsfs, e); }
        }

        final var settings = settingsfs.resolve("settings.yml");
        if (!settings.toFile().exists()) {
            try { settings.toFile().createNewFile(); }
            catch (IOException e) { Logger.fatal("Failed to create %s: %s", settings, e); }
        }
        RT.set("settings.yml", settings);

        final var projects = settingsfs.resolve("projects.yml");
        if (!projects.toFile().exists()) {
            try { projects.toFile().createNewFile(); }
            catch (IOException e) { Logger.fatal("Failed to create %s: %s", projects, e); }
        }
        RT.set("projects.yml", projects);

        return true;
    }

}
