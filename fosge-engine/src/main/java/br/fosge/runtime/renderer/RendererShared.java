package br.fosge.runtime.renderer;

import org.joml.Matrix4f;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

abstract class RendererShared {
    private RendererShared(){}

    static final Lock lock = new ReentrantLock();

    // Camera buffer
    static final Matrix4f viewProjectionMatrix = new Matrix4f();

    // Render data
    static RenderGraph frameGraph;
    static RenderGraph renderGraph;
    static final Queue<RenderTask<?>> tasks = new ConcurrentLinkedQueue<>();

}
