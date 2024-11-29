package br.fosge.engine.input;

import static br.fosge.engine.runtime.platform.binding.glfw.GLFWConstants.*;

public enum Mouse {
    BUTTON_UNKNOWN,

    BUTTON_1,
    BUTTON_2,
    BUTTON_3,
    BUTTON_4,
    BUTTON_5,
    BUTTON_6,
    BUTTON_7,
    BUTTON_8;

    public static Mouse from(int glfw) {
        return switch (glfw) {
            default -> BUTTON_UNKNOWN;
            case GLFW_MOUSE_BUTTON_1 -> BUTTON_1;
            case GLFW_MOUSE_BUTTON_2 -> BUTTON_2;
            case GLFW_MOUSE_BUTTON_3 -> BUTTON_3;
            case GLFW_MOUSE_BUTTON_4 -> BUTTON_4;
            case GLFW_MOUSE_BUTTON_5 -> BUTTON_5;
            case GLFW_MOUSE_BUTTON_6 -> BUTTON_6;
            case GLFW_MOUSE_BUTTON_7 -> BUTTON_7;
            case GLFW_MOUSE_BUTTON_8 -> BUTTON_8;
        };
    }
}
