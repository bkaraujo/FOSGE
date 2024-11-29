package br.fosge.engine.runtime;

import br.fosge.Logger;
import br.fosge.engine.diagnostics.Diagnostics;
import org.lwjgl.system.MemoryUtil;

import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * The recommended way to deal with these issues in LWJGL 3 is via explicit memory management.
 * We have the org.lwjgl.system.MemoryUtil class that uses a configurable memory allocator and
 * exposes a user-friendly API, but other allocators can be used directly, as dictated by application
 * requirements.
 */
public abstract class Memory {
    private static final Queue<ByteBuffer> buffers = new ConcurrentLinkedQueue<>();

    public static ByteBuffer bytes(int size) {
        Diagnostics.offHeap += size;
        final var buffer = MemoryUtil.memAlloc(size);
        if (Configuration.CHECKS) {
            buffers.offer(buffer);
        }
        return buffer;
    }

    public static void free(ByteBuffer buffer) {
        if (Configuration.CHECKS) {
            if (buffer == null) {
                Logger.error("Trying to free a null buffer");
                return;
            }

            if (!buffers.remove(buffer)) {
                Logger.error("Trying to free a buffer created elsewhere");
                return;
            }
        }

        Diagnostics.offHeap += buffer.capacity();
        MemoryUtil.memFree(buffer);
    }

    public static void free() {
        for (final var buffer : buffers) {
            Logger.warn("Freeing dangling buffer of %d bytes", buffer.capacity());
            free(buffer);
        }
    }
}
