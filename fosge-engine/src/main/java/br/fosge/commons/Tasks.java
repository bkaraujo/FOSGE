package br.fosge.commons;

import br.fosge.RT;
import br.fosge.commons.annotation.Facade;
import br.fosge.commons.task.TaskSupervisor;

import javax.annotation.Nonnull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Tasks implements Facade {
    private Tasks() {}

    public static final AtomicInteger onPlatform = new AtomicInteger(0);
    public static final AtomicInteger onVirtual = new AtomicInteger(0);

    private static final ExecutorService virtual = Executors.newVirtualThreadPerTaskExecutor();
    private static final ExecutorService platform = Executors.newFixedThreadPool((Runtime.getRuntime().availableProcessors() / 2) + 1);

    /** Best fit for tasks that without IO */
    public static void platform(final @Nonnull Runnable task) {
        platform(task.getClass().getSimpleName(), task);
    }

    /** Best fit for tasks that without IO */
    public static void platform(final @Nonnull String name, final @Nonnull Runnable task) {
        if (RT.trace) { task.run(); return; }
        platform.execute(new TaskSupervisor(name, task, onPlatform));
    }

    /** Best fit for tasks that execute IO */
    public static void virtual(final @Nonnull Runnable task) {
        virtual(task.getClass().getSimpleName(), task);
    }

    /** Best fit for tasks that execute IO */
    public static void virtual(final @Nonnull String name, final @Nonnull Runnable task) {
        if (RT.trace) { task.run(); return; }
        virtual.execute(new TaskSupervisor(name, task, onVirtual));
    }

    public static void sleep(final long millis) {
        try { Thread.sleep(millis); }
        catch (final InterruptedException ignored) {}
    }
}
