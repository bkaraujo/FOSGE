package br.fosge.commons.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public abstract class Threads {
    private Threads(){}

    private static final ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

    public static void submit(final Runnable task) { executor.submit(task); }
    public static <T> Future<T> submit(final Callable<T> task) { return executor.submit(task); }

}
