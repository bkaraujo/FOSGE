package br.fosge.commons.diagnostics;

import br.fosge.commons.Logger;

public final class ReportThread extends Thread implements Runnable {
    public ReportThread() {
        setDaemon(true);
        setName("ReportThread");
    }

    @Override
    public void run() {
        for (; ; ) {
            try {
                // TODO: Externalize ReportThread sleep time
                Thread.sleep(5000);
                final var total = java.lang.Runtime.getRuntime().totalMemory();
                final var free = java.lang.Runtime.getRuntime().freeMemory();

                Logger.debug(
                        "Java Heap (On/Off): (%.2f / %.2f) MB",
                        (total - free) / (1024.0 * 1024.0),
                        Diagnostics.offHeap() / (1024.0 * 1024.0)
                );

                System.gc();
            } catch (final Throwable throwable) {
                break;
            }
        }
    }
}
