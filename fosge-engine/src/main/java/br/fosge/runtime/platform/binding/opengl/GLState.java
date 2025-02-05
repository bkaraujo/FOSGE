package br.fosge.runtime.platform.binding.opengl;

import br.fosge.commons.annotation.State;

import java.util.HashMap;
import java.util.Map;

public abstract class GLState implements State {
    private GLState(){}

    public static final Map<Integer, Boolean> enabled = new HashMap<>();
    public static final int[] blendFunctions = new int[2];
}
