package br.fosge.commons;

import br.fosge.commons.annotation.Facade;
import br.fosge.commons.task.TaskSupervisor;

import javax.annotation.Nonnull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class Tasks implements Facade {
    private Tasks() {}

    private static final ExecutorService virtual = Executors.newVirtualThreadPerTaskExecutor();
    private static final ExecutorService system = Executors.newFixedThreadPool((Runtime.getRuntime().availableProcessors() / 2) + 1);

    public static void system(final @Nonnull Runnable task) {
        system(task.getClass().getSimpleName(), task);
    }

    public static void system(final @Nonnull String name, final @Nonnull Runnable task) {
        final var thread = new Thread(new TaskSupervisor(name, task));
        thread.setDaemon(false);
        thread.start();
    }

    public static void parallel(final @Nonnull Runnable task) {
        parallel(task.getClass().getSimpleName(), task);
    }

    public static void parallel(final @Nonnull String name, final @Nonnull Runnable task) {
        system.execute(new TaskSupervisor(name, task));
    }

    public static void concurrent(final @Nonnull Runnable task) {
        concurrent(task.getClass().getSimpleName(), task);
    }

    public static void concurrent(final @Nonnull String name, final @Nonnull Runnable task) {
        virtual.execute(new TaskSupervisor(name, task));
    }

    public static void sleep(final long millis) {
        try { Thread.sleep(millis); }
        catch (final InterruptedException ignored) {}
    }
}
