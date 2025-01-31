package br.fosge.commons;

import org.lwjgl.system.MemoryUtil;

import java.nio.ByteBuffer;

/**
 * The recommended way to deal with these issues in LWJGL 3 is via explicit memory management.
 * We have the org.lwjgl.system.MemoryUtil class that uses a configurable memory allocator and
 * exposes a user-friendly API, but other allocators can be used directly, as dictated by application
 * requirements.
 */
public abstract class Memory {

    public static ByteBuffer bytes(int size) {
        return MemoryUtil.memAlloc(size);
    }

    public static void free(ByteBuffer buffer) {
        MemoryUtil.memFree(buffer);
    }
}
