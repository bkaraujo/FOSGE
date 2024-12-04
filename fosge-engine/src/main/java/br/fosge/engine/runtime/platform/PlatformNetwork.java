package br.fosge.engine.runtime.platform;

import br.fosge.annotation.Lifecycle;

public final class PlatformNetwork implements Lifecycle {

    @Override
    public boolean initialize() {
        return true;
    }

    public void update() {
    }

    @Override
    public boolean terminate() {
        return true;
    }
}
