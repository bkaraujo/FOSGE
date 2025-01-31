package br.fosge.engine.runtime.platform.input;

import br.fosge.RT;
import br.fosge.commons.message.MessageListener;
import br.fosge.commons.message.MessagePipeline;
import br.fosge.engine.platform.input.*;

public final class InputListener {

    @MessageListener
    public MessagePipeline handle(InputKeyboardPressedEvent event) {
        RT.Input.currKey[event.key.ordinal()] = true;
        return MessagePipeline.CONSUMED;
    }

    @MessageListener
    public MessagePipeline handle(InputKeyboardReleasedEvent event) {
        RT.Input.currKey[event.key.ordinal()] = false;
        return MessagePipeline.CONSUMED;
    }

    @MessageListener
    public MessagePipeline handle(InputMousePressedEvent event) {
        RT.Input.currMouse[event.button.ordinal()] = false;
        return MessagePipeline.CONSUMED;
    }

    @MessageListener
    public MessagePipeline handle(InputMouseReleasedEvent event) {
        RT.Input.currMouse[event.button.ordinal()] = false;
        return MessagePipeline.CONSUMED;
    }

    @MessageListener
    public MessagePipeline handle(InputMouseScrolledEvent event) {
        RT.Input.currMouseScroll = event.scroll;
        return MessagePipeline.CONSUMED;
    }

    @MessageListener
    public MessagePipeline handle(InputMouseMovedEvent event) {
        RT.Input.currMousePos.set(event.x, event.y);
        return MessagePipeline.CONSUMED;
    }

}
