package br.fosge.engine.runtime;

import br.fosge.engine.annotation.State;
import br.fosge.engine.input.Keyboard;
import br.fosge.engine.input.Mouse;
import org.joml.Vector2i;

public abstract class CoreState implements State {

    public static byte currMouseScroll;
    public static final Vector2i currMousePos = new Vector2i();
    public static boolean[] currMouse = new boolean[Mouse.values().length];
    public static boolean[] prevMouse = new boolean[Mouse.values().length];

    public static boolean[] currKey = new boolean[Keyboard.values().length];
    public static boolean[] prevKey = new boolean[Keyboard.values().length];

}
