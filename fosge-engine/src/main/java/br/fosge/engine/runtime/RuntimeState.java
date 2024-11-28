package br.fosge.engine.runtime;

import br.fosge.engine.annotation.State;

public abstract class RuntimeState implements State {
    private RuntimeState() { /* Private constructor */ }

    public static long frame;
    public static long framePerSecond;
    public static long simulationPerSecond;
}
