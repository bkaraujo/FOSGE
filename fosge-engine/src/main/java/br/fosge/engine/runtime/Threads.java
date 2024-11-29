package br.fosge.engine.runtime;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class Threads {

    public static final ExecutorService physical = Executors.newFixedThreadPool(3);
    public static final ExecutorService virtual = Executors.newVirtualThreadPerTaskExecutor();

}
