package br.fosge.commons.concurrent;

import br.fosge.commons.RT;

public final class FGThread extends Thread {

    public FGThread(Runnable task) {
        super(task);
    }

    @Override
    public final void run() {
        try {
            RT.threads.getAndIncrement();
            super.run();
        } finally {
            RT.threads.getAndDecrement();
        }
    }
}
