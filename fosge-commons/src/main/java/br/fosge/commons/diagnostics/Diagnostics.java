package br.fosge.commons.diagnostics;

import br.fosge.commons.Logger;
import br.fosge.commons.RT;

public abstract class Diagnostics {
    private Diagnostics(){}

    public static void offHeap(long value) { RT.set("fosge.diagnostics.offheap", Long.class, value); }
    public static long offHeap() { return RT.getLong("fosge.diagnostics.offheap"); }

    public static void print() {
        final var runtime = Runtime.getRuntime();

        Logger.info("Java Vendor    : %s", System.getProperty("java.vm.vendor"));
        Logger.info("Java Version   : %s", System.getProperty("java.vm.version"));
        Logger.info("Java Heap Min  : %.2f MB", runtime.totalMemory() / (1024.0 * 1024.0));
        Logger.info("Java Heap Max  : %.2f MB", runtime.maxMemory() / (1024.0 * 1024.0));

        Logger.info("OS Name        : %s", System.getProperty("os.name"));
        Logger.info("OS Version     : %s", System.getProperty("os.version"));
        Logger.info("OS Architecture: %s", System.getProperty("os.arch"));
    }
}
