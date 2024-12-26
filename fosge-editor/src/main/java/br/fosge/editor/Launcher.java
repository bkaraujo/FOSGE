package br.fosge.editor;

import br.fosge.Logger;
import br.fosge.MessageBus;
import br.fosge.RT;
import br.fosge.editor.command.Commands;
import br.fosge.editor.forms.ProjectBrowse;
import br.fosge.editor.ui.SWTools;
import br.fosge.editor.ui.UIState;
import br.fosge.editor.ui.event.UIBeepEvent;
import br.fosge.logger.LogLevel;
import br.fosge.message.MessageListener;
import br.fosge.message.MessagePipeline;
import br.fosge.tools.Meta;
import br.fosge.tools.Yaml;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Launcher {
    private final Toolkit toolkit = Toolkit.getDefaultToolkit();

    public static void main(String[] args) {
        new Launcher(args.length == 1 ? args[0] : null);
    }

    public Launcher(String path) {
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
            if (path == null) {
                final var window = new ProjectBrowse();

                if (!window.initialize()) {
                    Logger.error("Failed to initialize %s", Meta.fqn(window));
                    Meta.exit(99);
                }

                SWTools.toScreenCenter(window);
                window.setVisible(true);
            } else {
                Commands.projectOpen(path);
            }
        });
    }

    @MessageListener
    public MessagePipeline handle(UIBeepEvent event) {
        toolkit.beep();
        return MessagePipeline.CONSUMED;
    }

    private void createFilesystemStructures() {
        final var settingsFS = RT.set("settingsfs", Path.class, RT.rootfs().resolve("settings"));
        if (!Files.exists(settingsFS)) {
            try { Files.createDirectories(settingsFS); }
            catch (IOException e) { Logger.fatal("Failed to create %s: %s", settingsFS, e); }
        }

        RT.set(RTKeys.Editor.SETTINGS, Yaml.class, Yaml.from(settingsFS.resolve("settings.yml")));
        RT.set(RTKeys.Editor.PROJECTS, Yaml.class, Yaml.from(settingsFS.resolve("projects.yml")));
    }
}
