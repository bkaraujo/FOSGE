package br.fosge.engine.runtime.platform.binding.glfw;

import br.fosge.engine.runtime.platform.binding.glfw.api.GLFW34;

public abstract class GLFWConstants {
    private GLFWConstants() { /* Private constructor */ }

    /**
     * The major version number of the GLFW header.
     *
     * <p>This is incremented when the API is changed in non-compatible ways.</p>
     */
    public static final int GLFW_VERSION_MAJOR = 3;

    /**
     * The minor version number of the GLFW header.
     *
     * <p>This is incremented when features are added to the API but it remains backward-compatible.</p>
     */
    public static final int GLFW_VERSION_MINOR = 4;

    /**
     * The revision number of the GLFW header.
     *
     * <p>This is incremented when a bug fix release is made that does not contain any API changes.</p>
     */
    public static final int GLFW_VERSION_REVISION = 0;

    /** Boolean values. */
    public static final int
            GLFW_TRUE  = 1,
            GLFW_FALSE = 0;

    /** The key or button was released. */
    public static final int GLFW_RELEASE = 0;

    /** The key or button was pressed. */
    public static final int GLFW_PRESS = 1;

    /** The key was held down until it repeated. */
    public static final int GLFW_REPEAT = 2;

    /** Joystick hat states. */
    public static final int
            GLFW_HAT_CENTERED   = 0,
            GLFW_HAT_UP         = 1,
            GLFW_HAT_RIGHT      = 2,
            GLFW_HAT_DOWN       = 4,
            GLFW_HAT_LEFT       = 8,
            GLFW_HAT_RIGHT_UP   = (GLFW_HAT_RIGHT | GLFW_HAT_UP),
            GLFW_HAT_RIGHT_DOWN = (GLFW_HAT_RIGHT | GLFW_HAT_DOWN),
            GLFW_HAT_LEFT_UP    = (GLFW_HAT_LEFT  | GLFW_HAT_UP),
            GLFW_HAT_LEFT_DOWN  = (GLFW_HAT_LEFT  | GLFW_HAT_DOWN);

    /** The unknown key. */
    public static final int GLFW_KEY_UNKNOWN = -1;

    /** Printable keys. */
    public static final int
            GLFW_KEY_SPACE         = 32,
            GLFW_KEY_APOSTROPHE    = 39,
            GLFW_KEY_COMMA         = 44,
            GLFW_KEY_MINUS         = 45,
            GLFW_KEY_PERIOD        = 46,
            GLFW_KEY_SLASH         = 47,
            GLFW_KEY_0             = 48,
            GLFW_KEY_1             = 49,
            GLFW_KEY_2             = 50,
            GLFW_KEY_3             = 51,
            GLFW_KEY_4             = 52,
            GLFW_KEY_5             = 53,
            GLFW_KEY_6             = 54,
            GLFW_KEY_7             = 55,
            GLFW_KEY_8             = 56,
            GLFW_KEY_9             = 57,
            GLFW_KEY_SEMICOLON     = 59,
            GLFW_KEY_EQUAL         = 61,
            GLFW_KEY_A             = 65,
            GLFW_KEY_B             = 66,
            GLFW_KEY_C             = 67,
            GLFW_KEY_D             = 68,
            GLFW_KEY_E             = 69,
            GLFW_KEY_F             = 70,
            GLFW_KEY_G             = 71,
            GLFW_KEY_H             = 72,
            GLFW_KEY_I             = 73,
            GLFW_KEY_J             = 74,
            GLFW_KEY_K             = 75,
            GLFW_KEY_L             = 76,
            GLFW_KEY_M             = 77,
            GLFW_KEY_N             = 78,
            GLFW_KEY_O             = 79,
            GLFW_KEY_P             = 80,
            GLFW_KEY_Q             = 81,
            GLFW_KEY_R             = 82,
            GLFW_KEY_S             = 83,
            GLFW_KEY_T             = 84,
            GLFW_KEY_U             = 85,
            GLFW_KEY_V             = 86,
            GLFW_KEY_W             = 87,
            GLFW_KEY_X             = 88,
            GLFW_KEY_Y             = 89,
            GLFW_KEY_Z             = 90,
            GLFW_KEY_LEFT_BRACKET  = 91,
            GLFW_KEY_BACKSLASH     = 92,
            GLFW_KEY_RIGHT_BRACKET = 93,
            GLFW_KEY_GRAVE_ACCENT  = 96,
            GLFW_KEY_WORLD_1       = 161,
            GLFW_KEY_WORLD_2       = 162;

    /** Function keys. */
    public static final int
            GLFW_KEY_ESCAPE        = 256,
            GLFW_KEY_ENTER         = 257,
            GLFW_KEY_TAB           = 258,
            GLFW_KEY_BACKSPACE     = 259,
            GLFW_KEY_INSERT        = 260,
            GLFW_KEY_DELETE        = 261,
            GLFW_KEY_RIGHT         = 262,
            GLFW_KEY_LEFT          = 263,
            GLFW_KEY_DOWN          = 264,
            GLFW_KEY_UP            = 265,
            GLFW_KEY_PAGE_UP       = 266,
            GLFW_KEY_PAGE_DOWN     = 267,
            GLFW_KEY_HOME          = 268,
            GLFW_KEY_END           = 269,
            GLFW_KEY_CAPS_LOCK     = 280,
            GLFW_KEY_SCROLL_LOCK   = 281,
            GLFW_KEY_NUM_LOCK      = 282,
            GLFW_KEY_PRINT_SCREEN  = 283,
            GLFW_KEY_PAUSE         = 284,
            GLFW_KEY_F1            = 290,
            GLFW_KEY_F2            = 291,
            GLFW_KEY_F3            = 292,
            GLFW_KEY_F4            = 293,
            GLFW_KEY_F5            = 294,
            GLFW_KEY_F6            = 295,
            GLFW_KEY_F7            = 296,
            GLFW_KEY_F8            = 297,
            GLFW_KEY_F9            = 298,
            GLFW_KEY_F10           = 299,
            GLFW_KEY_F11           = 300,
            GLFW_KEY_F12           = 301,
            GLFW_KEY_F13           = 302,
            GLFW_KEY_F14           = 303,
            GLFW_KEY_F15           = 304,
            GLFW_KEY_F16           = 305,
            GLFW_KEY_F17           = 306,
            GLFW_KEY_F18           = 307,
            GLFW_KEY_F19           = 308,
            GLFW_KEY_F20           = 309,
            GLFW_KEY_F21           = 310,
            GLFW_KEY_F22           = 311,
            GLFW_KEY_F23           = 312,
            GLFW_KEY_F24           = 313,
            GLFW_KEY_F25           = 314,
            GLFW_KEY_KP_0          = 320,
            GLFW_KEY_KP_1          = 321,
            GLFW_KEY_KP_2          = 322,
            GLFW_KEY_KP_3          = 323,
            GLFW_KEY_KP_4          = 324,
            GLFW_KEY_KP_5          = 325,
            GLFW_KEY_KP_6          = 326,
            GLFW_KEY_KP_7          = 327,
            GLFW_KEY_KP_8          = 328,
            GLFW_KEY_KP_9          = 329,
            GLFW_KEY_KP_DECIMAL    = 330,
            GLFW_KEY_KP_DIVIDE     = 331,
            GLFW_KEY_KP_MULTIPLY   = 332,
            GLFW_KEY_KP_SUBTRACT   = 333,
            GLFW_KEY_KP_ADD        = 334,
            GLFW_KEY_KP_ENTER      = 335,
            GLFW_KEY_KP_EQUAL      = 336,
            GLFW_KEY_LEFT_SHIFT    = 340,
            GLFW_KEY_LEFT_CONTROL  = 341,
            GLFW_KEY_LEFT_ALT      = 342,
            GLFW_KEY_LEFT_SUPER    = 343,
            GLFW_KEY_RIGHT_SHIFT   = 344,
            GLFW_KEY_RIGHT_CONTROL = 345,
            GLFW_KEY_RIGHT_ALT     = 346,
            GLFW_KEY_RIGHT_SUPER   = 347,
            GLFW_KEY_MENU          = 348,
            GLFW_KEY_LAST          = GLFW_KEY_MENU;

    /** If this bit is set one or more Shift keys were held down. */
    public static final int GLFW_MOD_SHIFT = 0x1;

    /** If this bit is set one or more Control keys were held down. */
    public static final int GLFW_MOD_CONTROL = 0x2;

    /** If this bit is set one or more Alt keys were held down. */
    public static final int GLFW_MOD_ALT = 0x4;

    /** If this bit is set one or more Super keys were held down. */
    public static final int GLFW_MOD_SUPER = 0x8;

    /** If this bit is set the Caps Lock key is enabled and the {@link #GLFW_LOCK_KEY_MODS LOCK_KEY_MODS} input mode is set. */
    public static final int GLFW_MOD_CAPS_LOCK = 0x10;

    /** If this bit is set the Num Lock key is enabled and the {@link #GLFW_LOCK_KEY_MODS LOCK_KEY_MODS} input mode is set. */
    public static final int GLFW_MOD_NUM_LOCK = 0x20;

    /** Mouse buttons. See <a href="https://www.glfw.org/docs/latest/input.html#input_mouse_button">mouse button input</a> for how these are used. */
    public static final int
            GLFW_MOUSE_BUTTON_1      = 0,
            GLFW_MOUSE_BUTTON_2      = 1,
            GLFW_MOUSE_BUTTON_3      = 2,
            GLFW_MOUSE_BUTTON_4      = 3,
            GLFW_MOUSE_BUTTON_5      = 4,
            GLFW_MOUSE_BUTTON_6      = 5,
            GLFW_MOUSE_BUTTON_7      = 6,
            GLFW_MOUSE_BUTTON_8      = 7,
            GLFW_MOUSE_BUTTON_LAST   = GLFW_MOUSE_BUTTON_8,
            GLFW_MOUSE_BUTTON_LEFT   = GLFW_MOUSE_BUTTON_1,
            GLFW_MOUSE_BUTTON_RIGHT  = GLFW_MOUSE_BUTTON_2,
            GLFW_MOUSE_BUTTON_MIDDLE = GLFW_MOUSE_BUTTON_3;

    /** Joysticks. See <a href="https://www.glfw.org/docs/latest/input.html#joystick">joystick input</a> for how these are used. */
    public static final int
            GLFW_JOYSTICK_1    = 0,
            GLFW_JOYSTICK_2    = 1,
            GLFW_JOYSTICK_3    = 2,
            GLFW_JOYSTICK_4    = 3,
            GLFW_JOYSTICK_5    = 4,
            GLFW_JOYSTICK_6    = 5,
            GLFW_JOYSTICK_7    = 6,
            GLFW_JOYSTICK_8    = 7,
            GLFW_JOYSTICK_9    = 8,
            GLFW_JOYSTICK_10   = 9,
            GLFW_JOYSTICK_11   = 10,
            GLFW_JOYSTICK_12   = 11,
            GLFW_JOYSTICK_13   = 12,
            GLFW_JOYSTICK_14   = 13,
            GLFW_JOYSTICK_15   = 14,
            GLFW_JOYSTICK_16   = 15,
            GLFW_JOYSTICK_LAST = GLFW_JOYSTICK_16;

    /** Gamepad buttons. See <a href="https://www.glfw.org/docs/latest/input.html#gamepad">gamepad</a> for how these are used. */
    public static final int
            GLFW_GAMEPAD_BUTTON_A            = 0,
            GLFW_GAMEPAD_BUTTON_B            = 1,
            GLFW_GAMEPAD_BUTTON_X            = 2,
            GLFW_GAMEPAD_BUTTON_Y            = 3,
            GLFW_GAMEPAD_BUTTON_LEFT_BUMPER  = 4,
            GLFW_GAMEPAD_BUTTON_RIGHT_BUMPER = 5,
            GLFW_GAMEPAD_BUTTON_BACK         = 6,
            GLFW_GAMEPAD_BUTTON_START        = 7,
            GLFW_GAMEPAD_BUTTON_GUIDE        = 8,
            GLFW_GAMEPAD_BUTTON_LEFT_THUMB   = 9,
            GLFW_GAMEPAD_BUTTON_RIGHT_THUMB  = 10,
            GLFW_GAMEPAD_BUTTON_DPAD_UP      = 11,
            GLFW_GAMEPAD_BUTTON_DPAD_RIGHT   = 12,
            GLFW_GAMEPAD_BUTTON_DPAD_DOWN    = 13,
            GLFW_GAMEPAD_BUTTON_DPAD_LEFT    = 14,
            GLFW_GAMEPAD_BUTTON_LAST         = GLFW_GAMEPAD_BUTTON_DPAD_LEFT,
            GLFW_GAMEPAD_BUTTON_CROSS        = GLFW_GAMEPAD_BUTTON_A,
            GLFW_GAMEPAD_BUTTON_CIRCLE       = GLFW_GAMEPAD_BUTTON_B,
            GLFW_GAMEPAD_BUTTON_SQUARE       = GLFW_GAMEPAD_BUTTON_X,
            GLFW_GAMEPAD_BUTTON_TRIANGLE     = GLFW_GAMEPAD_BUTTON_Y;

    /** Gamepad axes. See <a href="https://www.glfw.org/docs/latest/input.html#gamepad">gamepad</a> for how these are used. */
    public static final int
            GLFW_GAMEPAD_AXIS_LEFT_X        = 0,
            GLFW_GAMEPAD_AXIS_LEFT_Y        = 1,
            GLFW_GAMEPAD_AXIS_RIGHT_X       = 2,
            GLFW_GAMEPAD_AXIS_RIGHT_Y       = 3,
            GLFW_GAMEPAD_AXIS_LEFT_TRIGGER  = 4,
            GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER = 5,
            GLFW_GAMEPAD_AXIS_LAST          = GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER;

    /**
     * Error codes.
     *
     * <h5>Enum values:</h5>
     *
     * <ul>
     * <li>{@link #GLFW_NO_ERROR NO_ERROR} - No error has occurred.</li>
     * <li>{@link #GLFW_NOT_INITIALIZED NOT_INITIALIZED} -
     * GLFW has not been initialized.
     *
     * <p>This occurs if a GLFW function was called that may not be called unless the library is initialized.</p>
     * </li>
     * <li>{@link #GLFW_NO_CURRENT_CONTEXT NO_CURRENT_CONTEXT} -
     * No context is current for this thread.
     *
     * <p>This occurs if a GLFW function was called that needs and operates on the current OpenGL or OpenGL ES context but no context is current on the
     * calling thread. One such function is {@link GLFW34#glfwSwapInterval SwapInterval}.</p>
     * </li>
     * <li>{@link #GLFW_INVALID_ENUM INVALID_ENUM} -
     * One of the arguments to the function was an invalid enum value.
     *
     * <p>One of the arguments to the function was an invalid enum value, for example requesting {@link #GLFW_RED_BITS RED_BITS} with {@link GLFW34#glfwGetWindowAttrib GetWindowAttrib}.</p>
     * </li>
     * <li>{@link #GLFW_INVALID_VALUE INVALID_VALUE} -
     * One of the arguments to the function was an invalid value.
     *
     * <p>One of the arguments to the function was an invalid value, for example requesting a non-existent OpenGL or OpenGL ES version like 2.7.</p>
     *
     * <p>Requesting a valid but unavailable OpenGL or OpenGL ES version will instead result in a {@link #GLFW_VERSION_UNAVAILABLE VERSION_UNAVAILABLE} error.</p>
     * </li>
     * <li>{@link #GLFW_OUT_OF_MEMORY OUT_OF_MEMORY} -
     * A memory allocation failed.
     *
     * <p>A bug in GLFW or the underlying operating system. Report the bug to our <a href="https://github.com/glfw/glfw/issues">issue tracker</a>.</p>
     * </li>
     * <li>{@link #GLFW_API_UNAVAILABLE API_UNAVAILABLE} -
     * GLFW could not find support for the requested API on the system.
     *
     * <p>The installed graphics driver does not support the requested API, or does not support it via the chosen context creation API. Below are a few
     * examples:</p>
     *
     * <p>Some pre-installed Windows graphics drivers do not support OpenGL. AMD only supports OpenGL ES via EGL, while Nvidia and Intel only support it via
     * a WGL or GLX extension. macOS does not provide OpenGL ES at all. The Mesa EGL, OpenGL and OpenGL ES libraries do not interface with the Nvidia
     * binary driver. Older graphics drivers do not support Vulkan.</p>
     * </li>
     * <li>{@link #GLFW_VERSION_UNAVAILABLE VERSION_UNAVAILABLE} -
     * The requested OpenGL or OpenGL ES version (including any requested context or framebuffer hints) is not available on this machine.
     *
     * <p>The machine does not support your requirements. If your application is sufficiently flexible, downgrade your requirements and try again. Otherwise,
     * inform the user that their machine does not match your requirements.</p>
     *
     * <p>Future invalid OpenGL and OpenGL ES versions, for example OpenGL 4.8 if 5.0 comes out before the 4.x series gets that far, also fail with this
     * error and not {@link #GLFW_INVALID_VALUE INVALID_VALUE}, because GLFW cannot know what future versions will exist.</p>
     * </li>
     * <li>{@link #GLFW_PLATFORM_ERROR PLATFORM_ERROR} -
     * A platform-specific error occurred that does not match any of the more specific categories.
     *
     * <p>A bug or configuration error in GLFW, the underlying operating system or its drivers, or a lack of required resources. Report the issue to our
     * <a href="https://github.com/glfw/glfw/issues">issue tracker</a>.</p>
     * </li>
     * <li>{@link #GLFW_FORMAT_UNAVAILABLE FORMAT_UNAVAILABLE} -
     * The requested format is not supported or available.
     *
     * <p>If emitted during window creation, one or more hard constraints did not match any of the available pixel formats. If your application is
     * sufficiently flexible, downgrade your requirements and try again. Otherwise, inform the user that their machine does not match your requirements.</p>
     *
     * <p>If emitted when querying the clipboard, ignore the error or report it to the user, as appropriate.</p>
     * </li>
     * <li>{@link #GLFW_NO_WINDOW_CONTEXT NO_WINDOW_CONTEXT} -
     * The specified window does not have an OpenGL or OpenGL ES context.
     *
     * <p>A window that does not have an OpenGL or OpenGL ES context was passed to a function that requires it to have one.</p>
     *
     * <p>Application programmer error. Fix the offending call.</p>
     * </li>
     * <li>{@link #GLFW_CURSOR_UNAVAILABLE CURSOR_UNAVAILABLE} -
     * The specified cursor shape is not available.
     *
     * <p>The specified standard cursor shape is not available, either because the current platform cursor theme does not provide it or because it is not
     * available on the platform.</p>
     *
     * <p>Platform or system settings limitation. Pick another standard cursor shape or create a custom cursor.</p>
     * </li>
     * <li>{@link #GLFW_FEATURE_UNAVAILABLE FEATURE_UNAVAILABLE} -
     * The requested feature is not provided by the platform.
     *
     * <p>The requested feature is not provided by the platform, so GLFW is unable to implement it. The documentation for each function notes if it could
     * emit this error.</p>
     *
     * <p>Platform or platform version limitation. The error can be ignored unless the feature is critical to the application.</p>
     *
     * <p>A function call that emits this error has no effect other than the error and updating any existing out parameters.</p>
     * </li>
     * <li>{@link #GLFW_FEATURE_UNIMPLEMENTED FEATURE_UNIMPLEMENTED} -
     * The requested feature has not yet been implemented in GLFW for this platform.
     *
     * <p>An incomplete implementation of GLFW for this platform, hopefully fixed in a future release. The error can be ignored unless the feature is
     * critical to the application.</p>
     *
     * <p>A function call that emits this error has no effect other than the error and updating any existing out parameters.</p>
     * </li>
     * <li>{@link #GLFW_PLATFORM_UNAVAILABLE PLATFORM_UNAVAILABLE} -
     * Platform unavailable or no matching platform was found.
     *
     * <p>If emitted during initialization, no matching platform was found. If the {@link #GLFW_PLATFORM PLATFORM} init hint was set to {@link #GLFW_ANY_PLATFORM ANY_PLATFORM}, GLFW could not detect any of
     * the platforms supported by this library binary, except for the {@code Null} platform.  If the init hint was set to a specific platform, it is
     * either not supported by this library binary or GLFW was not able to detect it.</p>
     *
     * <p>If emitted by a native access function, GLFW was initialized for a different platform than the function is for.</p>
     *
     * <p>Failure to detect any platform usually only happens on non-macOS Unix systems, either when no window system is running or the program was run from
     * a terminal that does not have the necessary environment variables.  Fall back to a different platform if possible or notify the user that no usable
     * platform was detected.</p>
     *
     * <p>Failure to detect a specific platform may have the same cause as above or because support for that platform was not compiled in. Call
     * {@link GLFW34#glfwPlatformSupported PlatformSupported} to check whether a specific platform is supported by a library binary.</p>
     * </li>
     * </ul>
     */
    public static final int
            GLFW_NO_ERROR              = 0,
            GLFW_NOT_INITIALIZED       = 0x10001,
            GLFW_NO_CURRENT_CONTEXT    = 0x10002,
            GLFW_INVALID_ENUM          = 0x10003,
            GLFW_INVALID_VALUE         = 0x10004,
            GLFW_OUT_OF_MEMORY         = 0x10005,
            GLFW_API_UNAVAILABLE       = 0x10006,
            GLFW_VERSION_UNAVAILABLE   = 0x10007,
            GLFW_PLATFORM_ERROR        = 0x10008,
            GLFW_FORMAT_UNAVAILABLE    = 0x10009,
            GLFW_NO_WINDOW_CONTEXT     = 0x1000A,
            GLFW_CURSOR_UNAVAILABLE    = 0x1000B,
            GLFW_FEATURE_UNAVAILABLE   = 0x1000C,
            GLFW_FEATURE_UNIMPLEMENTED = 0x1000D,
            GLFW_PLATFORM_UNAVAILABLE  = 0x1000E;

    /**
     * Window attributes.
     *
     * <h5>Enum values:</h5>
     *
     * <ul>
     * <li>{@link #GLFW_FOCUSED FOCUSED} -
     * {@code WindowHint}: Specifies whether the windowed mode window will be given input focus when created. This hint is ignored for full screen and
     * initially hidden windows.
     *
     * <p>{@code GetWindowAttrib}: Indicates whether the specified window has input focus.</p>
     * </li>
     * <li>{@link #GLFW_ICONIFIED ICONIFIED} - {@code GetWindowAttrib}: Indicates whether the specified window is iconified, whether by the user or with {@link GLFW34#glfwIconifyWindow IconifyWindow}.</li>
     * <li>{@link #GLFW_RESIZABLE RESIZABLE} -
     * {@code WindowHint}: Specifies whether the windowed mode window will be resizable <i>by the user</i>. The window will still be resizable using the
     * {@link GLFW34#glfwSetWindowSize SetWindowSize} function. This hint is ignored for full screen windows.
     *
     * <p>{@code GetWindowAttrib}: Indicates whether the specified window is resizable <i>by the user</i>.</p>
     * </li>
     * <li>{@link #GLFW_VISIBLE VISIBLE} -
     * {@code WindowHint}: Specifies whether the windowed mode window will be initially visible. This hint is ignored for full screen windows. Windows created
     * hidden are completely invisible to the user until shown. This can be useful if you need to set up your window further before showing it, for
     * example moving it to a specific location.
     *
     * <p>{@code GetWindowAttrib}: Indicates whether the specified window is visible. Window visibility can be controlled with {@link GLFW34#glfwShowWindow ShowWindow} and {@link GLFW34#glfwHideWindow HideWindow}.</p>
     * </li>
     * <li>{@link #GLFW_DECORATED DECORATED} -
     * {@code WindowHint}: Specifies whether the windowed mode window will have window decorations such as a border, a close widget, etc. An undecorated window
     * may still allow the user to generate close events on some platforms. This hint is ignored for full screen windows.
     *
     * <p>{@code GetWindowAttrib}: Indicates whether the specified window has decorations such as a border, a close widget, etc.</p>
     * </li>
     * <li>{@link #GLFW_AUTO_ICONIFY AUTO_ICONIFY} -
     * {@code WindowHint}: Specifies whether the full screen window will automatically iconify and restore the previous video mode on input focus loss. This
     * hint is ignored for windowed mode windows.
     * </li>
     * <li>{@link #GLFW_FLOATING FLOATING} -
     * {@code WindowHint}: Specifies whether the windowed mode window will be floating above other regular windows, also called topmost or always-on-top. This
     * is intended primarily for debugging purposes and cannot be used to implement proper full screen windows. This hint is ignored for full screen
     * windows.
     *
     * <p>{@code GetWindowAttrib}: Indicates whether the specified window is floating, also called topmost or always-on-top.</p>
     * </li>
     * <li>{@link #GLFW_MAXIMIZED MAXIMIZED} -
     * {@code WindowHint}: Specifies whether the windowed mode window will be maximized when created. This hint is ignored for full screen windows.
     *
     * <p>{@code GetWindowAttrib}: Indicates whether the specified window is maximized, whether by the user or {@link GLFW34#glfwMaximizeWindow MaximizeWindow}.</p>
     * </li>
     * <li>{@link #GLFW_CENTER_CURSOR CENTER_CURSOR} -
     * {@code WindowHint}: Specifies whether the cursor should be centered over newly created full screen windows. This hint is ignored for windowed mode
     * windows.
     * </li>
     * <li>{@link #GLFW_TRANSPARENT_FRAMEBUFFER TRANSPARENT_FRAMEBUFFER} -
     * {@code WindowHint}: Specifies whether the window framebuffer will be transparent. If enabled and supported by the system, the window framebuffer
     * alpha channel will be used to combine the framebuffer with the background. This does not affect window decorations.
     * </li>
     * <li>{@link #GLFW_HOVERED HOVERED} - {@code GetWindowAttrib}: Indicates whether the cursor is currently directly over the content area of the window, with no other windows between.</li>
     * <li>{@link #GLFW_FOCUS_ON_SHOW FOCUS_ON_SHOW} -
     * {@code WindowHint}: Specifies whether input focuses on calling show window.
     *
     * <p>{@code GetWindowAttrib}: Indicates whether input focuses on calling show window.</p>
     * </li>
     * <li>{@link #GLFW_MOUSE_PASSTHROUGH MOUSE_PASSTHROUGH} -
     * {@code WindowHint}: Specifies whether the window is transparent to mouse input, letting any mouse events pass through to whatever window is behind
     * it. This is only supported for undecorated windows. Decorated windows with this enabled will behave differently between platforms.
     *
     * <p>{@code GetWindowAttrib}: Indicates whether the window is transparent to mouse input.</p>
     * </li>
     * <li>{@link #GLFW_POSITION_X POSITION_X} - {@code WindowHint}: Initial position x-coordinate window hint.</li>
     * <li>{@link #GLFW_POSITION_Y POSITION_Y} - {@code WindowHint}: Initial position y-coordinate window hint.</li>
     * <li>{@link #GLFW_SOFT_FULLSCREEN SOFT_FULLSCREEN} - {@code WindowHint}: Soft fullscreen window hint.</li>
     * </ul>
     */
    public static final int
            GLFW_FOCUSED                 = 0x20001,
            GLFW_ICONIFIED               = 0x20002,
            GLFW_RESIZABLE               = 0x20003,
            GLFW_VISIBLE                 = 0x20004,
            GLFW_DECORATED               = 0x20005,
            GLFW_AUTO_ICONIFY            = 0x20006,
            GLFW_FLOATING                = 0x20007,
            GLFW_MAXIMIZED               = 0x20008,
            GLFW_CENTER_CURSOR           = 0x20009,
            GLFW_TRANSPARENT_FRAMEBUFFER = 0x2000A,
            GLFW_HOVERED                 = 0x2000B,
            GLFW_FOCUS_ON_SHOW           = 0x2000C,
            GLFW_MOUSE_PASSTHROUGH       = 0x2000D,
            GLFW_POSITION_X              = 0x2000E,
            GLFW_POSITION_Y              = 0x2000F,
            GLFW_SOFT_FULLSCREEN         = 0x20010;

    /** Input options. */
    public static final int
            GLFW_CURSOR                  = 0x33001,
            GLFW_STICKY_KEYS             = 0x33002,
            GLFW_STICKY_MOUSE_BUTTONS    = 0x33003,
            GLFW_LOCK_KEY_MODS           = 0x33004,
            GLFW_RAW_MOUSE_MOTION        = 0x33005,
            GLFW_UNLIMITED_MOUSE_BUTTONS = 0x33006,
            GLFW_IME                     = 0x33007;

    /** Cursor state. */
    public static final int
            GLFW_CURSOR_NORMAL   = 0x34001,
            GLFW_CURSOR_HIDDEN   = 0x34002,
            GLFW_CURSOR_DISABLED = 0x34003,
            GLFW_CURSOR_CAPTURED = 0x34004;

    /** The regular arrow cursor shape. */
    public static final int GLFW_ARROW_CURSOR = 0x36001;

    /** The text input I-beam cursor shape. */
    public static final int GLFW_IBEAM_CURSOR = 0x36002;

    /** The crosshair cursor shape. */
    public static final int GLFW_CROSSHAIR_CURSOR = 0x36003;

    /** The pointing hand cursor shape. */
    public static final int GLFW_POINTING_HAND_CURSOR = 0x36004;

    /**
     * The horizontal resize/move arrow shape.
     *
     * <p>This is usually a horizontal double-headed arrow.</p>
     */
    public static final int GLFW_RESIZE_EW_CURSOR = 0x36005;

    /**
     * The vertical resize/move shape.
     *
     * <p>This is usually a vertical double-headed arrow.</p>
     */
    public static final int GLFW_RESIZE_NS_CURSOR = 0x36006;

    /**
     * The top-left to bottom-right diagonal resize/move shape.
     *
     * <p>This is usually a diagonal double-headed arrow.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li><b>macOS</b>: This shape is provided by a private system API and may fail with {@link #GLFW_CURSOR_UNAVAILABLE CURSOR_UNAVAILABLE} in the future.</li>
     * <li><b>Wayland</b>: This shape is provided by a newer standard not supported by all cursor themes.</li>
     * <li><b>X11</b>: This shape is provided by a newer standard not supported by all cursor themes.</li>
     * </ul></div>
     */
    public static final int GLFW_RESIZE_NWSE_CURSOR = 0x36007;

    /**
     * The top-right to bottom-left diagonal resize/move shape.
     *
     * <p>This is usually a diagonal double-headed arrow.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li><b>macOS</b>: This shape is provided by a private system API and may fail with {@link #GLFW_CURSOR_UNAVAILABLE CURSOR_UNAVAILABLE} in the future.</li>
     * <li><b>Wayland</b>: This shape is provided by a newer standard not supported by all cursor themes.</li>
     * <li><b>X11</b>: This shape is provided by a newer standard not supported by all cursor themes.</li>
     * </ul></div>
     */
    public static final int GLFW_RESIZE_NESW_CURSOR = 0x36008;

    /**
     * The omni-directional resize cursor/move shape.
     *
     * <p>This is usually either a combined horizontal and vertical double-headed arrow or a grabbing hand.</p>
     */
    public static final int GLFW_RESIZE_ALL_CURSOR = 0x36009;

    /**
     * The operation-not-allowed shape.
     *
     * <p>This is usually a circle with a diagonal line through it.</p>
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li><b>Wayland</b>: This shape is provided by a newer standard not supported by all cursor themes.</li>
     * <li><b>X11</b>: This shape is provided by a newer standard not supported by all cursor themes.</li>
     * </ul></div>
     */
    public static final int GLFW_NOT_ALLOWED_CURSOR = 0x3600A;

    /** Legacy name for compatibility. */
    public static final int GLFW_HRESIZE_CURSOR = GLFW_RESIZE_EW_CURSOR;

    /** Legacy name for compatibility. */
    public static final int GLFW_VRESIZE_CURSOR = GLFW_RESIZE_NS_CURSOR;

    /** Legacy name for compatibility. */
    public static final int GLFW_HAND_CURSOR = GLFW_POINTING_HAND_CURSOR;

    /** Monitor events. */
    public static final int
            GLFW_CONNECTED    = 0x40001,
            GLFW_DISCONNECTED = 0x40002;

    /**
     * Joystick hat buttons init hint.
     *
     * <p>Specifies whether to also expose joystick hats as buttons, for compatibility with earlier versions of GLFW that did not have {@link GLFW34#glfwGetJoystickHats GetJoystickHats}.
     * Possible values are {@link #GLFW_TRUE TRUE} and {@link #GLFW_FALSE FALSE}.</p>
     */
    public static final int GLFW_JOYSTICK_HAT_BUTTONS = 0x50001;

    /**
     * ANGLE rendering backend init hint.
     *
     * <p>Specifies the platform type (rendering backend) to request when using OpenGL ES and EGL via <a href="https://chromium.googlesource.com/angle/angle/">ANGLE</a>. If the requested platform type is unavailable, ANGLE will use its default. Possible values are one of {@link #GLFW_ANGLE_PLATFORM_TYPE_NONE ANGLE_PLATFORM_TYPE_NONE},
     * {@link #GLFW_ANGLE_PLATFORM_TYPE_OPENGL ANGLE_PLATFORM_TYPE_OPENGL}, {@link #GLFW_ANGLE_PLATFORM_TYPE_OPENGLES ANGLE_PLATFORM_TYPE_OPENGLES}, {@link #GLFW_ANGLE_PLATFORM_TYPE_D3D9 ANGLE_PLATFORM_TYPE_D3D9}, {@link #GLFW_ANGLE_PLATFORM_TYPE_D3D11 ANGLE_PLATFORM_TYPE_D3D11}, {@link #GLFW_ANGLE_PLATFORM_TYPE_VULKAN ANGLE_PLATFORM_TYPE_VULKAN} and
     * {@link #GLFW_ANGLE_PLATFORM_TYPE_METAL ANGLE_PLATFORM_TYPE_METAL}.</p>
     */
    public static final int GLFW_ANGLE_PLATFORM_TYPE = 0x50002;

    public static final int GLFW_ANY_POSITION = 0x80000000;

    /** Platform selection init hint. */
    public static final int GLFW_PLATFORM = 0x50003;

    /** Preedit candidate init hint. */
    public static final int GLFW_MANAGE_PREEDIT_CANDIDATE = 0x50004;

    /**
     * macOS specific init hint.
     *
     * <p>Specifies whether to set the current directory to the application to the {@code Contents/Resources} subdirectory of the application's bundle, if
     * present. Possible values are {@link #GLFW_TRUE TRUE}` and {@link #GLFW_FALSE FALSE}`. This is ignored on other platforms.</p>
     */
    public static final int GLFW_COCOA_CHDIR_RESOURCES = 0x51001;

    /**
     * macOS specific init hint.
     *
     * <p>Specifies whether to create the menu bar and dock icon when GLFW is initialized. This applies whether the menu bar is created from a nib or manually by
     * GLFW. Possible values are {@link #GLFW_TRUE TRUE} and {@link #GLFW_FALSE FALSE}. This is ignored on other platforms.</p>
     */
    public static final int GLFW_COCOA_MENUBAR = 0x51002;

    /** X11 specific init hint. */
    public static final int GLFW_X11_XCB_VULKAN_SURFACE = 0x52001;

    /** X11 specific init hint. */
    public static final int GLFW_X11_ONTHESPOT = 0x52002;

    /** Wayland specific init hint. */
    public static final int GLFW_WAYLAND_LIBDECOR = 0x53001;

    /** Hint value for {@link #GLFW_PLATFORM PLATFORM} that enables automatic platform selection. */
    public static final int
            GLFW_ANY_PLATFORM     = 0x60000,
            GLFW_PLATFORM_WIN32   = 0x60001,
            GLFW_PLATFORM_COCOA   = 0x60002,
            GLFW_PLATFORM_WAYLAND = 0x60003,
            GLFW_PLATFORM_X11     = 0x60004,
            GLFW_PLATFORM_NULL    = 0x60005;

    /** Don't care value. */
    public static final int GLFW_DONT_CARE = -1;

    /** PixelFormat hints. */
    public static final int
            GLFW_RED_BITS         = 0x21001,
            GLFW_GREEN_BITS       = 0x21002,
            GLFW_BLUE_BITS        = 0x21003,
            GLFW_ALPHA_BITS       = 0x21004,
            GLFW_DEPTH_BITS       = 0x21005,
            GLFW_STENCIL_BITS     = 0x21006,
            GLFW_ACCUM_RED_BITS   = 0x21007,
            GLFW_ACCUM_GREEN_BITS = 0x21008,
            GLFW_ACCUM_BLUE_BITS  = 0x21009,
            GLFW_ACCUM_ALPHA_BITS = 0x2100A,
            GLFW_AUX_BUFFERS      = 0x2100B,
            GLFW_STEREO           = 0x2100C,
            GLFW_SAMPLES          = 0x2100D,
            GLFW_SRGB_CAPABLE     = 0x2100E,
            GLFW_REFRESH_RATE     = 0x2100F,
            GLFW_DOUBLEBUFFER     = 0x21010;

    /**
     * Client API hints.
     *
     * <h5>Enum values:</h5>
     *
     * <ul>
     * <li>{@link #GLFW_CLIENT_API CLIENT_API} -
     * {@code WindowHint}: Specifies which client API to create the context for. Possible values are {@link #GLFW_OPENGL_API OPENGL_API}, {@link #GLFW_OPENGL_ES_API OPENGL_ES_API} and {@link #GLFW_NO_API NO_API}. This is a hard
     * constraint.
     *
     * <p>{@code GetWindowAttrib}: Indicates the client API provided by the window's context; either {@link #GLFW_OPENGL_API OPENGL_API}, {@link #GLFW_OPENGL_ES_API OPENGL_ES_API} or {@link #GLFW_NO_API NO_API}.</p>
     * </li>
     * <li>{@link #GLFW_CONTEXT_VERSION_MAJOR CONTEXT_VERSION_MAJOR} -
     * {@code WindowHint}: Specifies the client API major version that the created context must be compatible with. The exact behavior of this hint depends on
     * the requested client API.
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li>While there is no way to ask the driver for a context of the highest supported version, GLFW will attempt to provide this when you ask for a
     * version 1.0 context, which is the default for these hints.</li>
     * <li><b>OpenGL</b>: {@link #GLFW_CONTEXT_VERSION_MAJOR CONTEXT_VERSION_MAJOR} and {@link #GLFW_CONTEXT_VERSION_MINOR CONTEXT_VERSION_MINOR} are not hard constraints, but creation will fail if the OpenGL version of the
     * created context is less than the one requested. It is therefore perfectly safe to use the default of version 1.0 for legacy code and you will
     * still get backwards-compatible contexts of version 3.0 and above when available.</li>
     * <li><b>OpenGL ES</b>: {@link #GLFW_CONTEXT_VERSION_MAJOR CONTEXT_VERSION_MAJOR} and {@link #GLFW_CONTEXT_VERSION_MINOR CONTEXT_VERSION_MINOR} are not hard constraints, but creation will fail if the OpenGL ES version
     * of the created context is less than the one requested. Additionally, OpenGL ES 1.x cannot be returned if 2.0 or later was requested, and vice
     * versa. This is because OpenGL ES 3.x is backward compatible with 2.0, but OpenGL ES 2.0 is not backward compatible with 1.x.</li>
     * </ul></div>
     *
     * <p>{@code GetWindowAttrib}: Indicate the client API major version of the window's context.</p>
     * </li>
     * <li>{@link #GLFW_CONTEXT_VERSION_MINOR CONTEXT_VERSION_MINOR} -
     * {@code WindowHint}: Specifies the client API minor version that the created context must be compatible with. The exact behavior of this hint depends on
     * the requested client API.
     *
     * <p>{@code GetWindowAttrib}: Indicate the client API minor version of the window's context.</p>
     * </li>
     * <li>{@link #GLFW_CONTEXT_REVISION CONTEXT_REVISION} - {@code GetWindowAttrib}: Indicates the client API version of the window's context.</li>
     * <li>{@link #GLFW_CONTEXT_ROBUSTNESS CONTEXT_ROBUSTNESS} -
     * {@code WindowHint}: Specifies the robustness strategy to be used by the context. This can be one of {@link #GLFW_NO_RESET_NOTIFICATION NO_RESET_NOTIFICATION} or {@link #GLFW_LOSE_CONTEXT_ON_RESET LOSE_CONTEXT_ON_RESET}, or
     * {@link #GLFW_NO_ROBUSTNESS NO_ROBUSTNESS} to not request a robustness strategy.
     *
     * <p>{@code GetWindowAttrib}: Indicates the robustness strategy used by the context. This is {@link #GLFW_LOSE_CONTEXT_ON_RESET LOSE_CONTEXT_ON_RESET} or {@link #GLFW_NO_RESET_NOTIFICATION NO_RESET_NOTIFICATION} if the window's
     * context supports robustness, or {@link #GLFW_NO_ROBUSTNESS NO_ROBUSTNESS} otherwise.</p>
     * </li>
     * <li>{@link #GLFW_OPENGL_FORWARD_COMPAT OPENGL_FORWARD_COMPAT} -
     * {@code WindowHint}: Specifies whether the OpenGL context should be forward-compatible, i.e. one where all functionality deprecated in the requested
     * version of OpenGL is removed. This must only be used if the requested OpenGL version is 3.0 or above. If OpenGL ES is requested, this hint is
     * ignored.
     *
     * <p>{@code GetWindowAttrib}: Indicates if the window's context is an OpenGL forward-compatible one.</p>
     * </li>
     * <li>{@link #GLFW_CONTEXT_DEBUG CONTEXT_DEBUG} -
     * {@code WindowHint}: Specifies whether to create a debug context, which may have additional error and performance issue reporting functionality.
     *
     * <p>{@code GetWindowAttrib}: Indicates if the window's context is a debug context.</p>
     * </li>
     * <li>{@link #GLFW_OPENGL_DEBUG_CONTEXT OPENGL_DEBUG_CONTEXT} - Alias of {@link #GLFW_CONTEXT_DEBUG CONTEXT_DEBUG} for compatibility with earlier versions.</li>
     * <li>{@link #GLFW_OPENGL_PROFILE OPENGL_PROFILE} -
     * {@code WindowHint}: Specifies which OpenGL profile to create the context for. Possible values are one of {@link #GLFW_OPENGL_CORE_PROFILE OPENGL_CORE_PROFILE} or {@link #GLFW_OPENGL_COMPAT_PROFILE OPENGL_COMPAT_PROFILE},
     * or {@link #GLFW_OPENGL_ANY_PROFILE OPENGL_ANY_PROFILE} to not request a specific profile. If requesting an OpenGL version below 3.2, {@link #GLFW_OPENGL_ANY_PROFILE OPENGL_ANY_PROFILE} must be used. If OpenGL ES
     * is requested, this hint is ignored.
     *
     * <p>{@code GetWindowAttrib}: Indicates the OpenGL profile used by the context. This is {@link #GLFW_OPENGL_CORE_PROFILE OPENGL_CORE_PROFILE} or {@link #GLFW_OPENGL_COMPAT_PROFILE OPENGL_COMPAT_PROFILE} if the context uses a
     * known profile, or {@link #GLFW_OPENGL_ANY_PROFILE OPENGL_ANY_PROFILE} if the OpenGL profile is unknown or the context is an OpenGL ES context. Note that the returned profile may
     * not match the profile bits of the context flags, as GLFW will try other means of detecting the profile when no bits are set.</p>
     * </li>
     * <li>{@link #GLFW_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR} -
     * {@code WindowHint}: Specifies the release behavior to be used by the context. If the behavior is {@link #GLFW_ANY_RELEASE_BEHAVIOR ANY_RELEASE_BEHAVIOR}, the default behavior of the
     * context creation API will be used. If the behavior is {@link #GLFW_RELEASE_BEHAVIOR_FLUSH RELEASE_BEHAVIOR_FLUSH}, the pipeline will be flushed whenever the context is released from
     * being the current one. If the behavior is {@link #GLFW_RELEASE_BEHAVIOR_NONE RELEASE_BEHAVIOR_NONE}, the pipeline will not be flushed on release.
     * </li>
     * <li>{@link #GLFW_CONTEXT_NO_ERROR CONTEXT_NO_ERROR} -
     * {@code WindowHint}: Specifies whether errors should be generated by the context. If enabled, situations that would have generated errors instead cause
     * undefined behavior.
     * </li>
     * <li>{@link #GLFW_CONTEXT_CREATION_API CONTEXT_CREATION_API} -
     * {@code WindowHint}: Specifies which context creation API to use to create the context. Possible values are {@link #GLFW_NATIVE_CONTEXT_API NATIVE_CONTEXT_API}, {@link #GLFW_EGL_CONTEXT_API EGL_CONTEXT_API}
     * and {@link #GLFW_OSMESA_CONTEXT_API OSMESA_CONTEXT_API}. This is a hard constraint. If no client API is requested, this hint is ignored.
     *
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     *
     * <ul>
     * <li><b>macOS</b>: The EGL API is not available on this platform and requests to use it will fail.</li>
     * <li><b>Wayland, Mir</b>: The EGL API <i>is</i> the native context creation API, so this hint will have no effect.</li>
     * <li>An OpenGL extension loader library that assumes it knows which context creation API is used on a given platform may fail if you change this
     * hint. This can be resolved by having it load via {@link GLFW34#glfwGetProcAddress GetProcAddress}, which always uses the selected API.</li>
     * </ul></div>
     *
     * <p>{@code GetWindowAttrib}: Indicates the context creation API used to create the window's context; either {@link #GLFW_NATIVE_CONTEXT_API NATIVE_CONTEXT_API} or {@link #GLFW_EGL_CONTEXT_API EGL_CONTEXT_API}.</p>
     * </li>
     * <li>{@link #GLFW_SCALE_TO_MONITOR SCALE_TO_MONITOR} -
     * {@code WindowHint}: Specifies whether the window content area should be resized based on the monitor content scale of any monitor it is placed on.
     * This includes the initial placement when the window is created. Possible values are {@link #GLFW_TRUE TRUE} and {@link #GLFW_FALSE FALSE}.
     *
     * <p>This hint only has an effect on platforms where screen coordinates and pixels always map 1:1 such as Windows and X11. On platforms like macOS the
     * resolution of the framebuffer is changed independently of the window size.</p>
     * </li>
     * <li>{@link #GLFW_SCALE_FRAMEBUFFER SCALE_FRAMEBUFFER} -
     * Legacy name for compatibility.
     *
     * <p>This is an alias for the {@code GLFW_SCALE_FRAMEBUFFER} window hint for compatibility with earlier versions.</p>
     * </li>
     * </ul>
     */
    public static final int
            GLFW_CLIENT_API               = 0x22001,
            GLFW_CONTEXT_VERSION_MAJOR    = 0x22002,
            GLFW_CONTEXT_VERSION_MINOR    = 0x22003,
            GLFW_CONTEXT_REVISION         = 0x22004,
            GLFW_CONTEXT_ROBUSTNESS       = 0x22005,
            GLFW_OPENGL_FORWARD_COMPAT    = 0x22006,
            GLFW_CONTEXT_DEBUG            = 0x22007,
            GLFW_OPENGL_DEBUG_CONTEXT     = GLFW_CONTEXT_DEBUG,
            GLFW_OPENGL_PROFILE           = 0x22008,
            GLFW_CONTEXT_RELEASE_BEHAVIOR = 0x22009,
            GLFW_CONTEXT_NO_ERROR         = 0x2200A,
            GLFW_CONTEXT_CREATION_API     = 0x2200B,
            GLFW_SCALE_TO_MONITOR         = 0x2200C,
            GLFW_SCALE_FRAMEBUFFER        = 0x2200D;

    /**
     * Specifies whether to use full resolution framebuffers on Retina displays.
     *
     * <p>This is ignored on other platforms.</p>
     */
    public static final int GLFW_COCOA_RETINA_FRAMEBUFFER = 0x23001;

    /**
     * Specifies the UTF-8 encoded name to use for autosaving the window frame, or if empty disables frame autosaving for the window.
     *
     * <p>This is ignored on other platforms.</p>
     */
    public static final int GLFW_COCOA_FRAME_NAME = 0x23002;

    /**
     * Specifies whether to enable Automatic Graphics Switching, i.e. to allow the system to choose the integrated GPU for the OpenGL context and move it
     * between GPUs if necessary or whether to force it to always run on the discrete GPU. This only affects systems with both integrated and discrete GPUs.
     *
     * <p>This is ignored on other platforms.</p>
     */
    public static final int GLFW_COCOA_GRAPHICS_SWITCHING = 0x23003;

    /**
     * The desired ASCII encoded class and instance parts of the ICCCM {@code WM_CLASS} window property.
     *
     * <p>These are ignored on other platforms.</p>
     */
    public static final int
            GLFW_X11_CLASS_NAME    = 0x24001,
            GLFW_X11_INSTANCE_NAME = 0x24002;

    /**
     * Specifies whether to allow access to the window menu via the Alt+Space and Alt-and-then-Space keyboard shortcuts.
     *
     * <p>This is ignored on other platforms.</p>
     */
    public static final int GLFW_WIN32_KEYBOARD_MENU = 0x25001;

    /** Win32 specific [window hint](@ref GLFW_WIN32_SHOWDEFAULT_hint). */
    public static final int GLFW_WIN32_SHOWDEFAULT = 0x25002;

    /**
     * Allows specification of the Wayland {@code app_id}.
     *
     * <p>This is ignored on other platforms.</p>
     */
    public static final int GLFW_WAYLAND_APP_ID = 0x26001;

    /** Values for the {@link #GLFW_CLIENT_API CLIENT_API} hint. */
    public static final int
            GLFW_NO_API        = 0,
            GLFW_OPENGL_API    = 0x30001,
            GLFW_OPENGL_ES_API = 0x30002;

    /** Values for the {@link #GLFW_CONTEXT_ROBUSTNESS CONTEXT_ROBUSTNESS} hint. */
    public static final int
            GLFW_NO_ROBUSTNESS         = 0,
            GLFW_NO_RESET_NOTIFICATION = 0x31001,
            GLFW_LOSE_CONTEXT_ON_RESET = 0x31002;

    /** Values for the {@link #GLFW_OPENGL_PROFILE OPENGL_PROFILE} hint. */
    public static final int
            GLFW_OPENGL_ANY_PROFILE    = 0,
            GLFW_OPENGL_CORE_PROFILE   = 0x32001,
            GLFW_OPENGL_COMPAT_PROFILE = 0x32002;

    /** Values for the {@link #GLFW_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR} hint. */
    public static final int
            GLFW_ANY_RELEASE_BEHAVIOR   = 0,
            GLFW_RELEASE_BEHAVIOR_FLUSH = 0x35001,
            GLFW_RELEASE_BEHAVIOR_NONE  = 0x35002;

    /** Values for the {@link #GLFW_CONTEXT_CREATION_API CONTEXT_CREATION_API} hint. */
    public static final int
            GLFW_NATIVE_CONTEXT_API = 0x36001,
            GLFW_EGL_CONTEXT_API    = 0x36002,
            GLFW_OSMESA_CONTEXT_API = 0x36003;

    /** Values for the {@link #GLFW_ANGLE_PLATFORM_TYPE ANGLE_PLATFORM_TYPE} hint. */
    public static final int
            GLFW_ANGLE_PLATFORM_TYPE_NONE     = 0x37001,
            GLFW_ANGLE_PLATFORM_TYPE_OPENGL   = 0x37002,
            GLFW_ANGLE_PLATFORM_TYPE_OPENGLES = 0x37003,
            GLFW_ANGLE_PLATFORM_TYPE_D3D9     = 0x37004,
            GLFW_ANGLE_PLATFORM_TYPE_D3D11    = 0x37005,
            GLFW_ANGLE_PLATFORM_TYPE_VULKAN   = 0x37007,
            GLFW_ANGLE_PLATFORM_TYPE_METAL    = 0x37008;

    /** Values for the {@link #GLFW_WAYLAND_LIBDECOR WAYLAND_LIBDECOR} hint. */
    public static final int
            GLFW_WAYLAND_PREFER_LIBDECOR  = 0x38001,
            GLFW_WAYLAND_DISABLE_LIBDECOR = 0x38002;
}
