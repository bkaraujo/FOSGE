package br.fosge.engine.runtime;

import br.fosge.annotation.Facade;
import br.fosge.engine.input.Keyboard;
import br.fosge.engine.input.Mouse;
import org.joml.Vector2ic;

public abstract class Input implements Facade {

    public static boolean active(Keyboard key) { return RuntimeState.currKey[key.ordinal()]; }
    public static boolean pressed(Keyboard key) { return active(key) && !RuntimeState.prevKey[key.ordinal()]; }
    public static boolean released(Keyboard key) { return !active(key) && RuntimeState.prevKey[key.ordinal()]; }

    public static byte scroll() { return RuntimeState.currMouseScroll; }
    public static Vector2ic position() { return RuntimeState.currMousePos; }
    public static boolean active(Mouse button) { return RuntimeState.currMouse[button.ordinal()]; }
    public static boolean pressed(Mouse button) { return active(button) && !RuntimeState.prevMouse[button.ordinal()]; }
    public static boolean released(Mouse button) { return !active(button) && RuntimeState.prevMouse[button.ordinal()]; }

}
