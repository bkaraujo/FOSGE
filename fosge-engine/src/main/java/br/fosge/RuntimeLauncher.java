package br.fosge;

import br.fosge.commons.Logger;
import br.fosge.commons.RT;
import br.fosge.commons.logger.LogLevel;
import br.fosge.commons.tools.Meta;
import br.fosge.engine.runtime.Engine;
import org.lwjgl.Version;

public final class RuntimeLauncher {

    public static void main(String[] args) {
        final var level = RT.get("fosge.logging.level", LogLevel.class);
        Logger.level(level == null ? LogLevel.TRACE : level);

        if (args.length == 0) { Logger.fatal("Usage: java -jar <application>.jar [rootfs]"); }

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
        if (!engine.initialize()) { if (!engine.terminate()) { Meta.exit(99); } Meta.exit(90); }
        if (!engine.run()) { if (!engine.terminate()) { Meta.exit(99); } Meta.exit(90); }
        if (!engine.terminate()) { Meta.exit(99); }
    }
}
