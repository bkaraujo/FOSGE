package br.fosge;

import br.fosge.runtime.Engine;
import br.fosge.runtime.Runtime;
import org.lwjgl.Version;
import org.lwjgl.system.Configuration;

public class Launcher {

    public static void main(String ... args) {
        Configuration.DEBUG.set(Runtime.CHECKS);
        Configuration.DEBUG_STACK.set(Runtime.CHECKS);
        Configuration.DEBUG_STREAM.set(Runtime.CHECKS);
        Configuration.DEBUG_LOADER.set(Runtime.CHECKS);
        Configuration.DEBUG_MEMORY_ALLOCATOR.set(Runtime.CHECKS);
        Configuration.DISABLE_FUNCTION_CHECKS.set(!Runtime.CHECKS);
        Configuration.DEBUG_MEMORY_ALLOCATOR_INTERNAL.set(Runtime.CHECKS);
        Configuration.DEBUG_FUNCTIONS.set(Runtime.CHECKS);
        Configuration.DISABLE_CHECKS.set(!Runtime.CHECKS);

        Logger.debug("LWJGL: %s", Version.getVersion());

        final var engine = new Engine();

        if (!engine.initialize()) {
            if (!engine.terminate()) {
                Meta.exit(99);
            }

            Meta.exit(90);
        }

        if (!engine.run()) {
            if (!engine.terminate()) {
                Meta.exit(99);
            }

            Meta.exit(90);
        }

        if (!engine.terminate()) {
            Meta.exit(99);
        }
    }
}
