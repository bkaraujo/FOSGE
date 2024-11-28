package br.fosge.engine.runtime;

import br.fosge.engine.message.MessageListener;
import br.fosge.engine.message.Result;
import br.fosge.engine.runtime.platform.input.*;

public final class InputListener {

    @MessageListener
    public Result handle(InputKeyboardPressedEvent event) {
        CoreState.currKey[event.key.ordinal()] = true;
        return Result.AVAILABLE;
    }

    @MessageListener
    public Result handle(InputKeyboardReleasedEvent event) {
        CoreState.currKey[event.key.ordinal()] = false;
        return Result.AVAILABLE;
    }

    @MessageListener
    public Result handle(InputMousePressedEvent event) {
        CoreState.currMouse[event.button.ordinal()] = false;
        return Result.AVAILABLE;
    }

    @MessageListener
    public Result handle(InputMouseReleasedEvent event) {
        CoreState.currMouse[event.button.ordinal()] = false;
        return Result.AVAILABLE;
    }

    @MessageListener
    public Result handle(InputMouseScrolledEvent event) {
        CoreState.currMouseScroll = event.scroll;
        return Result.AVAILABLE;
    }

    @MessageListener
    public Result handle(InputMouseMovedEvent event) {
        CoreState.currMousePos.set(event.x, event.y);
        return Result.AVAILABLE;
    }

}
