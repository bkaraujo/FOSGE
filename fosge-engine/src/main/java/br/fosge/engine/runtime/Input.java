package br.fosge.engine.runtime;

import br.fosge.engine.annotation.Facade;
import br.fosge.engine.input.Keyboard;
import br.fosge.engine.input.Mouse;
import org.joml.Vector2ic;

public abstract class Input implements Facade {

    public static boolean active(Keyboard key) { return CoreState.currKey[key.ordinal()]; }
    public static boolean pressed(Keyboard key) { return active(key) && !CoreState.prevKey[key.ordinal()]; }
    public static boolean released(Keyboard key) { return !active(key) && CoreState.prevKey[key.ordinal()]; }

    public static byte scroll() { return CoreState.currMouseScroll; }
    public static Vector2ic position() { return CoreState.currMousePos; }
    public static boolean active(Mouse button) { return CoreState.currMouse[button.ordinal()]; }
    public static boolean pressed(Mouse button) { return active(button) && !CoreState.prevMouse[button.ordinal()]; }
    public static boolean released(Mouse button) { return !active(button) && CoreState.prevMouse[button.ordinal()]; }

}
