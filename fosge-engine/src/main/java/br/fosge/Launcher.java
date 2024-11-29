package br.fosge;

import br.fosge.engine.runtime.Configuration;
import br.fosge.engine.runtime.Engine;
import br.fosge.tools.Meta;
import org.lwjgl.Version;

public class Launcher {

    public static void main(String ... args) {
        if (args.length != 1) {
            System.out.println("Usage: java -jar <application>.jar [rootfs]");
            System.exit(-1);
        }

        System.setProperty("br.fosge.rootfs", args[0]);
//        org.lwjgl.system.Configuration.DEBUG.set(Configuration.CHECKS);
//        org.lwjgl.system.Configuration.DEBUG_FUNCTIONS.set(Configuration.CHECKS);
        org.lwjgl.system.Configuration.DEBUG_STACK.set(Configuration.CHECKS);
        org.lwjgl.system.Configuration.DEBUG_STREAM.set(Configuration.CHECKS);
        org.lwjgl.system.Configuration.DEBUG_LOADER.set(Configuration.CHECKS);
        org.lwjgl.system.Configuration.DISABLE_FUNCTION_CHECKS.set(!Configuration.CHECKS);
        org.lwjgl.system.Configuration.DEBUG_MEMORY_ALLOCATOR.set(Configuration.CHECKS);
//        org.lwjgl.system.Configuration.DEBUG_MEMORY_ALLOCATOR_INTERNAL.set(Configuration.CHECKS);
        org.lwjgl.system.Configuration.DEBUG_MEMORY_ALLOCATOR_FAST.set(Configuration.CHECKS);
        org.lwjgl.system.Configuration.DISABLE_CHECKS.set(!Configuration.CHECKS);

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
