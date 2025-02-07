package br.fosge.commons.task;

import br.fosge.commons.Logger;
import br.fosge.commons.logger.LogLevel;
import com.github.f4b6a3.ulid.Ulid;
import com.github.f4b6a3.ulid.UlidCreator;

import java.util.concurrent.atomic.AtomicInteger;

public final class TaskSupervisor implements Runnable {
    private final Ulid identity = UlidCreator.getMonotonicUlid();
    private final Runnable task;
    private final String name;
    private final AtomicInteger taskCounter;

    public TaskSupervisor(String name, Runnable desired, AtomicInteger taskCounter) {
        this.name = name;
        task = desired;
        this.taskCounter = taskCounter;
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
            Logger.trace("Exiting");
        }
    }
}
