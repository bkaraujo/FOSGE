package br.fosge.commons.task;

import br.fosge.commons.Logger;
import br.fosge.commons.logger.LogLevel;

import java.util.concurrent.atomic.AtomicInteger;

public final class TaskSupervisor implements Runnable {
    private final Runnable task;
    private final String name;
    public static AtomicInteger taskCounter = new AtomicInteger(0);

    public TaskSupervisor(String name, Runnable desired) {
        this.name = name;
        task = desired;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("FOSGE::" + name);
        try {
            taskCounter.getAndIncrement();
            task.run();
        } catch (Throwable throwable) {
            Logger.error("Task execution failed: %s", throwable);
            Logger.stackTrace(LogLevel.ERROR);
        } finally {
            taskCounter.getAndDecrement();
        }
    }
}
