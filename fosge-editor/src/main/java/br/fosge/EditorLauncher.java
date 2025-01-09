package br.fosge;

import br.fosge.commons.Logger;
import br.fosge.commons.RT;
import br.fosge.commons.concurrent.Threads;
import br.fosge.commons.filesystem.FSWatcher;
import br.fosge.commons.logger.LogLevel;
import br.fosge.commons.tools.Meta;
import br.fosge.commons.tools.Yaml;
import br.fosge.editor.RTKeys;
import br.fosge.editor.command.Commands;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class EditorLauncher {

    public static void main(String[] args) {
        Thread.currentThread().setName("FOSGE::Main");
        // ###########################################################################################
        //
        // Setup AWT environment
        //
        // ###########################################################################################
//        SwingUtilities.invokeLater(FlatDarkLaf::setup);
//        SwingUtilities.invokeLater(FlatDarculaLaf::setup);

        Toolkit
                .getDefaultToolkit()
                .addAWTEventListener(
                        event -> {
                            if (event.getID() != FocusEvent.FOCUS_LOST) {
                                return;
                            }

                            final var component = Meta.cast(event.getSource(), Component.class);
                            if (component != RT.get(RTKeys.UI.LAST_FOCUS, Component.class)) {
                                RT.set(RTKeys.UI.LAST_FOCUS, Component.class, component);
                            }
                        },
                        AWTEvent.FOCUS_EVENT_MASK
                );
        // ###########################################################################################
        //
        // Populate initial Runtime values
        //
        // ###########################################################################################
        final var level = RT.get("fosge.logging.level", LogLevel.class);
        Logger.level(level == null ? LogLevel.TRACE : level);

        final var settingsFS = RT.set(RTKeys.Editor.SETTINGS_DIR, Path.class, RT.rootfs().resolve("settings"));
        if (!Files.exists(settingsFS)) {
            try { Files.createDirectories(settingsFS); }
            catch (IOException e) { Logger.fatal("Failed to create %s: %s", settingsFS, e); }
        }

        RT.running = true;
        Threads.system(new FSWatcher());
        RT.set(RTKeys.UI.MULTI_CLICK_INTERVAL, Integer.class, 250);
        RT.set(RTKeys.Editor.SETTINGS_FILE, Yaml.class, Yaml.from(settingsFS.resolve("settings.yml")));
        RT.set(RTKeys.Editor.PROJECTS_FILE, Yaml.class, Yaml.from(settingsFS.resolve("projects.yml")));
        // ###########################################################################################
        //
        // Start the application finalizer thread
        //
        // ###########################################################################################
        Threads.virtual(() -> {
            Thread.currentThread().setName("FOSGE::Finalizer");
            Threads.sleep(10_000);

            for (;;) {
                Threads.sleep(1_000);

                var count = RT.getInt(RTKeys.UI.WINDOWS);
                if (count == null) { Logger.fatal("Wrong window count @ %s", RTKeys.UI.WINDOWS); }
                if (count == 0) {
                    Logger.debug("No more window showing ...");

                    RT.running = false;
                    while (RT.threads.get() != 0) {
                        Threads.sleep(100);
                    }

                    Logger.debug("Will exit now!");
                    Meta.exit(0);
                }
            }
        });
        // ###########################################################################################
        //
        // Open the desired window
        //
        // ###########################################################################################
        switch (args.length) {
            case 0: { if (!Commands.browserOpen()       ) { Meta.exit(99); } } break;
            case 1: { if (!Commands.projectOpen(args[0])) { Meta.exit(99); } } break;
            default: { System.out.println("Usage: java -jar <application>.jar [rootfs]"); } break;
        }
    }
}
