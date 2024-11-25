package br.fosge;

import br.fosge.logger.LogLevel;
import br.fosge.runtime.ApplicationFactory;
import br.fosge.runtime.Engine;
import br.fosge.runtime.Runtime;
import org.lwjgl.Version;
import org.lwjgl.system.Configuration;

public class Launcher {

    public static void main(String ... args) {
        Logger.level(LogLevel.TRACE);
        Logger.debug("Will run: %s", args[0]);

        Logger.level(LogLevel.TRACE);

        Logger.debug("LWJGL: %s", Version.getVersion());
        Configuration.DEBUG.set(Runtime.CHECKS);
        Configuration.DEBUG_STACK.set(Runtime.CHECKS);
        Configuration.DEBUG_STREAM.set(Runtime.CHECKS);
        Configuration.DEBUG_LOADER.set(Runtime.CHECKS);
        Configuration.DEBUG_MEMORY_ALLOCATOR.set(Runtime.CHECKS);
        Configuration.DISABLE_FUNCTION_CHECKS.set(!Runtime.CHECKS);
        Configuration.DEBUG_MEMORY_ALLOCATOR_INTERNAL.set(Runtime.CHECKS);
        Configuration.DEBUG_FUNCTIONS.set(Runtime.CHECKS);
        Configuration.DISABLE_CHECKS.set(!Runtime.CHECKS);

        final var factory = Meta.instance(ApplicationFactory.class, args[0]);
        final var application = factory.create();
        if (application == null) { Logger.fatal("Failed to create application"); }

        final var engine = new Engine(application);

        if (!engine.initialize()) {
            if (!engine.terminate()) {
                System.exit(99);
            }
            System.exit(90);
        }

        if (!engine.run()) {
            if (!engine.terminate()) {
                System.exit(99);
            }
            System.exit(90);
        }

        if (!engine.terminate()) {
            System.exit(99);
        }
    }
}
