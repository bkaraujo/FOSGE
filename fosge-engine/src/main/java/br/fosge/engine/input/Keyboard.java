package br.fosge.engine.input;

import static br.fosge.engine.runtime.platform.binding.glfw.GLFWConstants.*;

public enum Keyboard {
    KEY_UNKNOWN,
    KEY_SPACE,
    KEY_APOSTROPHE,
    KEY_COMMA,
    KEY_MINUS,
    KEY_PERIOD,
    KEY_SLASH,
    KEY_0,
    KEY_1,
    KEY_2,
    KEY_3,
    KEY_4,
    KEY_5,
    KEY_6,
    KEY_7,
    KEY_8,
    KEY_9,
    KEY_SEMICOLON,
    KEY_EQUAL,
    KEY_A,
    KEY_B,
    KEY_C,
    KEY_D,
    KEY_E,
    KEY_F,
    KEY_G,
    KEY_H,
    KEY_I,
    KEY_J,
    KEY_K,
    KEY_L,
    KEY_M,
    KEY_N,
    KEY_O,
    KEY_P,
    KEY_Q,
    KEY_R,
    KEY_S,
    KEY_T,
    KEY_U,
    KEY_V,
    KEY_W,
    KEY_X,
    KEY_Y,
    KEY_Z,
    KEY_LEFT_BRACKET,
    KEY_BACKSLASH,
    KEY_RIGHT_BRACKET,
    KEY_GRAVE_ACCENT,
    KEY_WORLD_1,
    KEY_WORLD_2,

    KEY_ESCAPE,
    KEY_ENTER,
    KEY_TAB,
    KEY_BACKSPACE,
    KEY_INSERT,
    KEY_DELETE,
    KEY_RIGHT,
    KEY_LEFT,
    KEY_DOWN,
    KEY_UP,
    KEY_PAGE_UP,
    KEY_PAGE_DOWN,
    KEY_HOME,
    KEY_END,
    KEY_CAPS_LOCK,
    KEY_SCROLL_LOCK,
    KEY_NUM_LOCK,
    KEY_PRINT_SCREEN,
    KEY_PAUSE,
    KEY_F1,
    KEY_F2,
    KEY_F3,
    KEY_F4,
    KEY_F5,
    KEY_F6,
    KEY_F7,
    KEY_F8,
    KEY_F9,
    KEY_F10,
    KEY_F11,
    KEY_F12,
    KEY_F13,
    KEY_F14,
    KEY_F15,
    KEY_F16,
    KEY_F17,
    KEY_F18,
    KEY_F19,
    KEY_F20,
    KEY_F21,
    KEY_F22,
    KEY_F23,
    KEY_F24,
    KEY_F25,
    KEY_KP_0,
    KEY_KP_1,
    KEY_KP_2,
    KEY_KP_3,
    KEY_KP_4,
    KEY_KP_5,
    KEY_KP_6,
    KEY_KP_7,
    KEY_KP_8,
    KEY_KP_9,
    KEY_KP_DECIMAL,
    KEY_KP_DIVIDE,
    KEY_KP_MULTIPLY,
    KEY_KP_SUBTRACT,
    KEY_KP_ADD,
    KEY_KP_ENTER,
    KEY_KP_EQUAL,
    KEY_LEFT_SHIFT,
    KEY_LEFT_CONTROL,
    KEY_LEFT_ALT,
    KEY_LEFT_SUPER,
    KEY_RIGHT_SHIFT,
    KEY_RIGHT_CONTROL,
    KEY_RIGHT_ALT,
    KEY_RIGHT_SUPER,
    KEY_MENU;

    public static Keyboard from(int glfw) {
        return switch (glfw) {
            default -> KEY_UNKNOWN;
            case GLFW_KEY_SPACE -> KEY_SPACE;
            case GLFW_KEY_APOSTROPHE -> KEY_APOSTROPHE;
            case GLFW_KEY_COMMA -> KEY_COMMA;
            case GLFW_KEY_MINUS -> KEY_MINUS;
            case GLFW_KEY_PERIOD -> KEY_PERIOD;
            case GLFW_KEY_SLASH -> KEY_SLASH;
            case GLFW_KEY_0 -> KEY_0;
            case GLFW_KEY_1 -> KEY_1;
            case GLFW_KEY_2 -> KEY_2;
            case GLFW_KEY_3 -> KEY_3;
            case GLFW_KEY_4 -> KEY_4;
            case GLFW_KEY_5 -> KEY_5;
            case GLFW_KEY_6 -> KEY_6;
            case GLFW_KEY_7 -> KEY_7;
            case GLFW_KEY_8 -> KEY_8;
            case GLFW_KEY_9 -> KEY_9;
            case GLFW_KEY_SEMICOLON -> KEY_SEMICOLON;
            case GLFW_KEY_EQUAL -> KEY_EQUAL;
            case GLFW_KEY_A -> KEY_A;
            case GLFW_KEY_B -> KEY_B;
            case GLFW_KEY_C -> KEY_C;
            case GLFW_KEY_D -> KEY_D;
            case GLFW_KEY_E -> KEY_E;
            case GLFW_KEY_F -> KEY_F;
            case GLFW_KEY_G -> KEY_G;
            case GLFW_KEY_H -> KEY_H;
            case GLFW_KEY_I -> KEY_I;
            case GLFW_KEY_J -> KEY_J;
            case GLFW_KEY_K -> KEY_K;
            case GLFW_KEY_L -> KEY_L;
            case GLFW_KEY_M -> KEY_M;
            case GLFW_KEY_N -> KEY_N;
            case GLFW_KEY_O -> KEY_O;
            case GLFW_KEY_P -> KEY_P;
            case GLFW_KEY_Q -> KEY_Q;
            case GLFW_KEY_R -> KEY_R;
            case GLFW_KEY_S -> KEY_S;
            case GLFW_KEY_T -> KEY_T;
            case GLFW_KEY_U -> KEY_U;
            case GLFW_KEY_V -> KEY_V;
            case GLFW_KEY_W -> KEY_W;
            case GLFW_KEY_X -> KEY_X;
            case GLFW_KEY_Y -> KEY_Y;
            case GLFW_KEY_Z -> KEY_Z;
            case GLFW_KEY_LEFT_BRACKET -> KEY_LEFT_BRACKET;
            case GLFW_KEY_BACKSLASH -> KEY_BACKSLASH;
            case GLFW_KEY_RIGHT_BRACKET -> KEY_RIGHT_BRACKET;
            case GLFW_KEY_GRAVE_ACCENT -> KEY_GRAVE_ACCENT;
            case GLFW_KEY_WORLD_1 -> KEY_WORLD_1;
            case GLFW_KEY_WORLD_2 -> KEY_WORLD_2;
            case GLFW_KEY_ESCAPE -> KEY_ESCAPE;
            case GLFW_KEY_ENTER -> KEY_ENTER;
            case GLFW_KEY_TAB -> KEY_TAB;
            case GLFW_KEY_BACKSPACE -> KEY_BACKSPACE;
            case GLFW_KEY_INSERT -> KEY_INSERT;
            case GLFW_KEY_DELETE -> KEY_DELETE;
            case GLFW_KEY_RIGHT -> KEY_RIGHT;
            case GLFW_KEY_LEFT -> KEY_LEFT;
            case GLFW_KEY_DOWN -> KEY_DOWN;
            case GLFW_KEY_UP -> KEY_UP;
            case GLFW_KEY_PAGE_UP -> KEY_PAGE_UP;
            case GLFW_KEY_PAGE_DOWN -> KEY_PAGE_DOWN;
            case GLFW_KEY_HOME -> KEY_HOME;
            case GLFW_KEY_END -> KEY_END;
            case GLFW_KEY_CAPS_LOCK -> KEY_CAPS_LOCK;
            case GLFW_KEY_SCROLL_LOCK -> KEY_SCROLL_LOCK;
            case GLFW_KEY_NUM_LOCK -> KEY_NUM_LOCK;
            case GLFW_KEY_PRINT_SCREEN -> KEY_PRINT_SCREEN;
            case GLFW_KEY_PAUSE -> KEY_PAUSE;
            case GLFW_KEY_F1 -> KEY_F1;
            case GLFW_KEY_F2 -> KEY_F2;
            case GLFW_KEY_F3 -> KEY_F3;
            case GLFW_KEY_F4 -> KEY_F4;
            case GLFW_KEY_F5 -> KEY_F5;
            case GLFW_KEY_F6 -> KEY_F6;
            case GLFW_KEY_F7 -> KEY_F7;
            case GLFW_KEY_F8 -> KEY_F8;
            case GLFW_KEY_F9 -> KEY_F9;
            case GLFW_KEY_F10 -> KEY_F10;
            case GLFW_KEY_F11 -> KEY_F11;
            case GLFW_KEY_F12 -> KEY_F12;
            case GLFW_KEY_F13 -> KEY_F13;
            case GLFW_KEY_F14 -> KEY_F14;
            case GLFW_KEY_F15 -> KEY_F15;
            case GLFW_KEY_F16 -> KEY_F16;
            case GLFW_KEY_F17 -> KEY_F17;
            case GLFW_KEY_F18 -> KEY_F18;
            case GLFW_KEY_F19 -> KEY_F19;
            case GLFW_KEY_F20 -> KEY_F20;
            case GLFW_KEY_F21 -> KEY_F21;
            case GLFW_KEY_F22 -> KEY_F22;
            case GLFW_KEY_F23 -> KEY_F23;
            case GLFW_KEY_F24 -> KEY_F24;
            case GLFW_KEY_F25 -> KEY_F25;
            case GLFW_KEY_KP_0 -> KEY_KP_0;
            case GLFW_KEY_KP_1 -> KEY_KP_1;
            case GLFW_KEY_KP_2 -> KEY_KP_2;
            case GLFW_KEY_KP_3 -> KEY_KP_3;
            case GLFW_KEY_KP_4 -> KEY_KP_4;
            case GLFW_KEY_KP_5 -> KEY_KP_5;
            case GLFW_KEY_KP_6 -> KEY_KP_6;
            case GLFW_KEY_KP_7 -> KEY_KP_7;
            case GLFW_KEY_KP_8 -> KEY_KP_8;
            case GLFW_KEY_KP_9 -> KEY_KP_9;
            case GLFW_KEY_KP_DECIMAL -> KEY_KP_DECIMAL;
            case GLFW_KEY_KP_DIVIDE -> KEY_KP_DIVIDE;
            case GLFW_KEY_KP_MULTIPLY -> KEY_KP_MULTIPLY;
            case GLFW_KEY_KP_SUBTRACT -> KEY_KP_SUBTRACT;
            case GLFW_KEY_KP_ADD -> KEY_KP_ADD;
            case GLFW_KEY_KP_ENTER -> KEY_KP_ENTER;
            case GLFW_KEY_KP_EQUAL -> KEY_KP_EQUAL;
            case GLFW_KEY_LEFT_SHIFT -> KEY_LEFT_SHIFT;
            case GLFW_KEY_LEFT_CONTROL -> KEY_LEFT_CONTROL;
            case GLFW_KEY_LEFT_ALT -> KEY_LEFT_ALT;
            case GLFW_KEY_LEFT_SUPER -> KEY_LEFT_SUPER;
            case GLFW_KEY_RIGHT_SHIFT -> KEY_RIGHT_SHIFT;
            case GLFW_KEY_RIGHT_CONTROL -> KEY_RIGHT_CONTROL;
            case GLFW_KEY_RIGHT_ALT -> KEY_RIGHT_ALT;
            case GLFW_KEY_RIGHT_SUPER -> KEY_RIGHT_SUPER;
            case GLFW_KEY_MENU -> KEY_MENU;
        };
    }

}
