package br.fosge.engine.runtime.platform;

import br.fosge.engine.platform.input.*;
import br.fosge.engine.runtime.RuntimeState;
import br.fosge.message.MessageListener;
import br.fosge.message.MessagePipeline;

public final class InputListener {

    @MessageListener
    public MessagePipeline handle(InputKeyboardPressedEvent event) {
        RuntimeState.currKey[event.key.ordinal()] = true;
        return MessagePipeline.CONSUMED;
    }

    @MessageListener
    public MessagePipeline handle(InputKeyboardReleasedEvent event) {
        RuntimeState.currKey[event.key.ordinal()] = false;
        return MessagePipeline.CONSUMED;
    }

    @MessageListener
    public MessagePipeline handle(InputMousePressedEvent event) {
        RuntimeState.currMouse[event.button.ordinal()] = false;
        return MessagePipeline.CONSUMED;
    }

    @MessageListener
    public MessagePipeline handle(InputMouseReleasedEvent event) {
        RuntimeState.currMouse[event.button.ordinal()] = false;
        return MessagePipeline.CONSUMED;
    }

    @MessageListener
    public MessagePipeline handle(InputMouseScrolledEvent event) {
        RuntimeState.currMouseScroll = event.scroll;
        return MessagePipeline.CONSUMED;
    }

    @MessageListener
    public MessagePipeline handle(InputMouseMovedEvent event) {
        RuntimeState.currMousePos.set(event.x, event.y);
        return MessagePipeline.CONSUMED;
    }

}
