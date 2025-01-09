package br.fosge.commons.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class Threads {
    private Threads() {}
    private static final ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

    public static void system(final Runnable runnable) {
        final var thread = new FGThread(runnable);
        thread.setName("FOSGE::%s".formatted(runnable.getClass().getSimpleName()));
        thread.setDaemon(false);
        thread.start();
    }

    public static void virtual(final Runnable runnable) {
        executor.execute(runnable);
    }

    public static void sleep(final long millis) {
        try { Thread.sleep(millis); }
        catch (final InterruptedException _) {}
    }

}
