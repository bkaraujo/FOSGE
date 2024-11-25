package br.fosge.runtime;

import br.fosge.annotation.State;

public abstract class RuntimeState implements State {
    private RuntimeState() { /* Private constructor */ }

    public static long frame;
    public static long framePerSecond;
    public static long simulationPerSecond;
}
