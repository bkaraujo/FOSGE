package br.fosge.commons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public final class QueueGroup<T> {
    private final List<Queue<T>> queues = new ArrayList<>();

    @SafeVarargs
    public QueueGroup(Queue<T> ... desired) {
        queues.addAll(Arrays.asList(desired));
    }

    /** Visit every element of all queues */
    public void forEach(QueueVisitor<T> visitor) {
        for (final var queue : queues) {
            for (final var element : queue) {
                visitor.visit(element);
            }
        }
    }

    /** Clear all underlying queues */
    public void clear() {
        for (final var queue : queues) {
            queue.clear();
        }
    }

    public interface QueueVisitor<T> {
        void visit(T element);
    }
}
