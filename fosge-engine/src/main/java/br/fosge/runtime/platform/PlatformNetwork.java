package br.fosge.runtime.platform;

import br.fosge.annotation.Lifecycle;

public final class PlatformNetwork implements Lifecycle {
    PlatformNetwork() { /* Private constructor */ }

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
