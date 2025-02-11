package br.fosge.runtime.renderer;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class RenderTask<T> {
    public final Callable<T> callable;
    public final AtomicBoolean done = new AtomicBoolean(false);
    private T result;

    public static <T> RenderTask<T> of(Callable<T> desired) {
        return new RenderTask<>(desired);
    }

    private RenderTask(Callable<T> desired) {
        callable = desired;
    }

    public void execute() {
        try { result = callable.call(); }
        catch (Throwable throwable) { result = null; }
        finally { done.getAndSet(true); }
    }

    public T result() { return result; }
}
