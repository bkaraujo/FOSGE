package br.fosge.engine.runtime.platform;

import br.fosge.RT;
import br.fosge.commons.MessageBus;
import br.fosge.commons.annotation.Lifecycle;
import br.fosge.engine.runtime.platform.input.InputListener;

public final class PlatformInput implements Lifecycle {

    @Override
    public boolean initialize() {
        MessageBus.subscribe(new InputListener());

        return true;
    }

    public void update() {
        System.arraycopy(RT.Input.currKey, 0, RT.Input.prevKey, 0, RT.Input.currKey.length);
        System.arraycopy(RT.Input.currMouse, 0, RT.Input.prevMouse, 0, RT.Input.currMouse.length);
    }
}
