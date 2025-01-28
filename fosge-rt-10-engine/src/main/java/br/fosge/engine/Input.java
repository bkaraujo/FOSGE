package br.fosge.engine;

import br.fosge.commons.annotation.Facade;
import br.fosge.engine.input.Keyboard;
import br.fosge.engine.input.Mouse;
import org.joml.Vector2ic;

import static br.fosge.RT.Input.*;

public abstract class Input implements Facade {
    private Input(){}

    public static boolean active(Keyboard key) { return currKey[key.ordinal()]; }
    public static boolean pressed(Keyboard key) { return active(key) && !prevKey[key.ordinal()]; }
    public static boolean released(Keyboard key) { return !active(key) && prevKey[key.ordinal()]; }

    public static byte scroll() { return currMouseScroll; }
    public static Vector2ic position() { return currMousePos; }
    public static boolean active(Mouse button) { return currMouse[button.ordinal()]; }
    public static boolean pressed(Mouse button) { return active(button) && !prevMouse[button.ordinal()]; }
    public static boolean released(Mouse button) { return !active(button) && prevMouse[button.ordinal()]; }

}
