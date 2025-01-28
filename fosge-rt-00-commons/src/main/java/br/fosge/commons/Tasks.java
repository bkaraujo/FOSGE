package br.fosge.commons;

import br.fosge.commons.annotation.Facade;
import br.fosge.commons.task.TaskSupervisor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class Tasks implements Facade {
    private Tasks() {}

    private static final ExecutorService virtual = Executors.newVirtualThreadPerTaskExecutor();
    private static final ExecutorService system = Executors.newFixedThreadPool(3);

    public static void system(final Runnable task) {
        final var thread = new Thread(new TaskSupervisor(task));
        thread.setName("FOSGE::%s".formatted(task.getClass().getSimpleName()));
        thread.setDaemon(false);
        thread.start();
    }

    public static void parallel(final Runnable task) {
        system.execute(new TaskSupervisor(task));
    }

    public static void concurrent(final Runnable task) {
        virtual.execute(new TaskSupervisor(task));
    }

    public static void sleep(final long millis) {
        try { Thread.sleep(millis); }
        catch (final InterruptedException _) {}
    }
}
