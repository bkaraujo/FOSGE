package br.fosge.runtime.renderer;

import com.github.f4b6a3.ulid.Ulid;
import com.github.f4b6a3.ulid.UlidCreator;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class DelayedTask<T> {
    public final Ulid ulid = UlidCreator.getMonotonicUlid();
    public final Callable<T> callable;
    public final AtomicBoolean done = new AtomicBoolean(false);
    private T result;

    public static <T> DelayedTask<T> of(Callable<T> desired) {
        return new DelayedTask<>(desired);
    }

    private DelayedTask(Callable<T> desired) {
        callable = desired;
    }

    public void execute() {
        try { result = callable.call(); }
        catch (Throwable throwable) { result = null; }
        finally { done.getAndSet(true); }
    }

    public T result() { return result; }
}
