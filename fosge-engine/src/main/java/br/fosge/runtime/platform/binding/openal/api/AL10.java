package br.fosge.runtime.platform.binding.openal.api;

import org.lwjgl.openal.ALUtil;

import java.nio.*;

public interface AL10 {

    /** General tokens.*/
    int ALC_INVALID = -1;

    /** General tokens.*/
    int ALC_FALSE = 0;

    /** General tokens.*/
    int ALC_TRUE = 1;

    /** Context creation attributes.*/
    int ALC_FREQUENCY = 4103;

    /** Context creation attributes.*/
    int ALC_REFRESH = 4104;

    /** Context creation attributes.*/
    int ALC_SYNC = 4105;

    /** Error conditions.*/
    int ALC_NO_ERROR = 0;

    /** Error conditions.*/
    int ALC_INVALID_DEVICE = 40961;

    /** Error conditions.*/
    int ALC_INVALID_CONTEXT = 40962;

    /** Error conditions.*/
    int ALC_INVALID_ENUM = 40963;

    /** Error conditions.*/
    int ALC_INVALID_VALUE = 40964;

    /** Error conditions.*/
    int ALC_OUT_OF_MEMORY = 40965;

    /** String queries.*/
    int ALC_DEFAULT_DEVICE_SPECIFIER = 4100;

    /** String queries.*/
    int ALC_DEVICE_SPECIFIER = 4101;

    /** String queries.*/
    int ALC_EXTENSIONS = 4102;

    /** Integer queries.*/
    int ALC_MAJOR_VERSION = 4096;

    /** Integer queries.*/
    int ALC_MINOR_VERSION = 4097;

    /** Integer queries.*/
    int ALC_ATTRIBUTES_SIZE = 4098;

    /** Integer queries.*/
    int ALC_ALL_ATTRIBUTES = 4099;

    /** Allows the application to connect to a device.  <p>If the function returns {@code NULL}, then no sound driver/device has been found. The argument is a null terminated string that requests a certain device or device configuration. If {@code NULL} is specified, the implementation will provide an implementation specific default.</p>@param deviceSpecifier the requested device or device configuration*/
    long alcOpenDevice(ByteBuffer deviceSpecifier);

    /** Allows the application to connect to a device.  <p>If the function returns {@code NULL}, then no sound driver/device has been found. The argument is a null terminated string that requests a certain device or device configuration. If {@code NULL} is specified, the implementation will provide an implementation specific default.</p>@param deviceSpecifier the requested device or device configuration*/
    long alcOpenDevice(CharSequence deviceSpecifier);

    /** Allows the application to disconnect from a device.  <p>The return code will be ALC_TRUE or ALC_FALSE, indicating success or failure. Failure will occur if all the device's contexts and buffers have not been destroyed. Once closed, the {@code deviceHandle} is invalid.</p>@param deviceHandle the device to close*/
    boolean alcCloseDevice(long deviceHandle);

    /** Creates an AL context.@param deviceHandle a valid device@param attrList null or a zero terminated list of integer pairs composed of valid ALC attribute tokens and requested values. One of:<br><table><tr><td>{@link #ALC_FREQUENCY FREQUENCY}</td><td>{@link #ALC_REFRESH REFRESH}</td><td>{@link #ALC_SYNC SYNC}</td><td>{@link AL11#ALC_MONO_SOURCES MONO_SOURCES}</td><td>{@link AL11#ALC_STEREO_SOURCES STEREO_SOURCES}</td></tr></table>*/
    long alcCreateContext(long deviceHandle, IntBuffer attrList);

    /** Makes a context current with respect to OpenAL operation.  <p>The context parameter can be {@code NULL} or a valid context pointer. Using {@code NULL} results in no context being current, which is useful when shutting OpenAL down. The operation will apply to the device that the context was created for.</p>  <p>For each OS process (usually this means for each application), only one context can be current at any given time. All AL commands apply to the current context. Commands that affect objects shared among contexts (e.g. buffers) have side effects on other contexts.</p>@param context the context to make current*/
    boolean alcMakeContextCurrent(long context);

    /** The current context is the only context accessible to state changes by AL commands (aside from state changes affecting shared objects). However, multiple contexts can be processed at the same time. To indicate that a context should be processed (i.e. that internal execution state such as the offset increments are to be performed), the application uses {@code alcProcessContext}.  <p>Repeated calls to alcProcessContext are legal, and do not affect a context that is already marked as processing. The default state of a context created by alcCreateContext is that it is processing.</p>@param context the context to mark for processing*/
    void alcProcessContext(long context);

    /** The application can suspend any context from processing (including the current one). To indicate that a context should be suspended from processing (i.e. that internal execution state such as offset increments are not to be changed), the application uses {@code alcSuspendContext}.  <p>Repeated calls to alcSuspendContext are legal, and do not affect a context that is already marked as suspended.</p>@param context the context to mark as suspended*/
    void alcSuspendContext(long context);

    /** Destroys a context.  <p>The correct way to destroy a context is to first release it using alcMakeCurrent with a {@code NULL} context. Applications should not attempt to destroy a current context \u2013 doing so will not work and will result in an ALC_INVALID_OPERATION error. All sources within a context will automatically be deleted during context destruction.</p>@param context the context to destroy*/
    void alcDestroyContext(long context);

    /** Queries for, and obtains a handle to, the current context for the application. If there is no current context, {@code NULL} is returned.*/
    long alcGetCurrentContext();

    /** Queries for, and obtains a handle to, the device of a given context.@param context the context to query*/
    long alcGetContextsDevice(long context);

    /** Verifies that a given extension is available for the current context and the device it is associated with.  <p>Invalid and unsupported string tokens return ALC_FALSE. A {@code NULL} deviceHandle is acceptable. {@code extName} is not case sensitive \u2013 the implementation will convert the name to all upper-case internally (and will express extension names in upper-case).</p>@param deviceHandle the device to query@param extName the extension name*/
    boolean alcIsExtensionPresent(long deviceHandle, ByteBuffer extName);

    /** Verifies that a given extension is available for the current context and the device it is associated with.  <p>Invalid and unsupported string tokens return ALC_FALSE. A {@code NULL} deviceHandle is acceptable. {@code extName} is not case sensitive \u2013 the implementation will convert the name to all upper-case internally (and will express extension names in upper-case).</p>@param deviceHandle the device to query@param extName the extension name*/
    boolean alcIsExtensionPresent(long deviceHandle, CharSequence extName);

    /** Retrieves extension entry points.  <p>The application is expected to verify the applicability of an extension or core function entry point before requesting it by name, by use of {@link #alcIsExtensionPresent IsExtensionPresent}.</p>  <p>Entry points can be device specific, but are not context specific. Using a {@code NULL} device handle does not guarantee that the entry point is returned, even if available for one of the available devices.</p>@param deviceHandle the device to query@param funcName the function name*/
    long alcGetProcAddress(long deviceHandle, ByteBuffer funcName);

    /** Retrieves extension entry points.  <p>The application is expected to verify the applicability of an extension or core function entry point before requesting it by name, by use of {@link #alcIsExtensionPresent IsExtensionPresent}.</p>  <p>Entry points can be device specific, but are not context specific. Using a {@code NULL} device handle does not guarantee that the entry point is returned, even if available for one of the available devices.</p>@param deviceHandle the device to query@param funcName the function name*/
    long alcGetProcAddress(long deviceHandle, CharSequence funcName);

    /** Returns extension enum values.  <p>Enumeration/token values are device independent, but tokens defined for extensions might not be present for a given device. Using a {@code NULL} handle is legal, but only the tokens defined by the AL core are guaranteed. Availability of extension tokens depends on the ALC extension.</p>@param deviceHandle the device to query@param enumName the enum name*/
    int alcGetEnumValue(long deviceHandle, ByteBuffer enumName);

    /** Returns extension enum values.  <p>Enumeration/token values are device independent, but tokens defined for extensions might not be present for a given device. Using a {@code NULL} handle is legal, but only the tokens defined by the AL core are guaranteed. Availability of extension tokens depends on the ALC extension.</p>@param deviceHandle the device to query@param enumName the enum name*/
    int alcGetEnumValue(long deviceHandle, CharSequence enumName);

    /** Queries ALC errors.  <p>ALC uses the same conventions and mechanisms as AL for error handling. In particular, ALC does not use conventions derived from X11 (GLX) or Windows (WGL).</p>  <p>Error conditions are specific to the device, and (like AL) a call to alcGetError resets the error state.</p>@param deviceHandle the device to query*/
    int alcGetError(long deviceHandle);

    /** Obtains string value(s) from ALC.  <p><b>LWJGL note</b>: Use {@link ALUtil#getStringList} for those tokens that return multiple values.</p>@param deviceHandle the device to query@param token the information to query. One of:<br><table><tr><td>{@link #ALC_DEFAULT_DEVICE_SPECIFIER DEFAULT_DEVICE_SPECIFIER}</td><td>{@link #ALC_DEVICE_SPECIFIER DEVICE_SPECIFIER}</td><td>{@link #ALC_EXTENSIONS EXTENSIONS}</td></tr><tr><td>{@link AL11#ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER CAPTURE_DEFAULT_DEVICE_SPECIFIER}</td><td>{@link AL11#ALC_CAPTURE_DEVICE_SPECIFIER CAPTURE_DEVICE_SPECIFIER}</td></tr></table>*/
    String alcGetString(long deviceHandle, int token);

    /** Obtains integer value(s) from ALC.@param deviceHandle the device to query@param token the information to query. One of:<br><table><tr><td>{@link #ALC_MAJOR_VERSION MAJOR_VERSION}</td><td>{@link #ALC_MINOR_VERSION MINOR_VERSION}</td><td>{@link #ALC_ATTRIBUTES_SIZE ATTRIBUTES_SIZE}</td><td>{@link #ALC_ALL_ATTRIBUTES ALL_ATTRIBUTES}</td><td>{@link AL11#ALC_CAPTURE_SAMPLES CAPTURE_SAMPLES}</td></tr></table>@param dest the destination buffer*/
    void alcGetIntegerv(long deviceHandle, int token, IntBuffer dest);

    /** Obtains integer value(s) from ALC.@param deviceHandle the device to query@param token the information to query. One of:<br><table><tr><td>{@link #ALC_MAJOR_VERSION MAJOR_VERSION}</td><td>{@link #ALC_MINOR_VERSION MINOR_VERSION}</td><td>{@link #ALC_ATTRIBUTES_SIZE ATTRIBUTES_SIZE}</td><td>{@link #ALC_ALL_ATTRIBUTES ALL_ATTRIBUTES}</td><td>{@link AL11#ALC_CAPTURE_SAMPLES CAPTURE_SAMPLES}</td></tr></table>*/
    int alcGetInteger(long deviceHandle, int token);

    /** Array version of: {@link #alcCreateContext CreateContext}*/
    long alcCreateContext(long deviceHandle, int[] attrList);

    /** Array version of: {@link #alcGetIntegerv GetIntegerv}*/
    void alcGetIntegerv(long deviceHandle, int token, int[] dest);


    /** General tokens.*/
    int AL_INVALID = -1;

    /** General tokens.*/
    int AL_NONE = 0;

    /** General tokens.*/
    int AL_FALSE = 0;

    /** General tokens.*/
    int AL_TRUE = 1;

    /** Error conditions.*/
    int AL_NO_ERROR = 0;

    /** Error conditions.*/
    int AL_INVALID_NAME = 40961;

    /** Error conditions.*/
    int AL_INVALID_ENUM = 40962;

    /** Error conditions.*/
    int AL_INVALID_VALUE = 40963;

    /** Error conditions.*/
    int AL_INVALID_OPERATION = 40964;

    /** Error conditions.*/
    int AL_OUT_OF_MEMORY = 40965;

    /** Numerical queries.*/
    int AL_DOPPLER_FACTOR = 49152;

    /** Numerical queries.*/
    int AL_DISTANCE_MODEL = 53248;

    /** String queries.*/
    int AL_VENDOR = 45057;

    /** String queries.*/
    int AL_VERSION = 45058;

    /** String queries.*/
    int AL_RENDERER = 45059;

    /** String queries.*/
    int AL_EXTENSIONS = 45060;

    /** Distance attenuation models.*/
    int AL_INVERSE_DISTANCE = 53249;

    /** Distance attenuation models.*/
    int AL_INVERSE_DISTANCE_CLAMPED = 53250;

    /** Source types.*/
    int AL_SOURCE_ABSOLUTE = 513;

    /** Source types.*/
    int AL_SOURCE_RELATIVE = 514;

    /** Listener and Source attributes.*/
    int AL_POSITION = 4100;

    /** Listener and Source attributes.*/
    int AL_VELOCITY = 4102;

    /** Listener and Source attributes.*/
    int AL_GAIN = 4106;

    /** Source attributes.*/
    int AL_CONE_INNER_ANGLE = 4097;

    /** Source attributes.*/
    int AL_CONE_OUTER_ANGLE = 4098;

    /** Source attributes.*/
    int AL_PITCH = 4099;

    /** Source attributes.*/
    int AL_DIRECTION = 4101;

    /** Source attributes.*/
    int AL_LOOPING = 4103;

    /** Source attributes.*/
    int AL_BUFFER = 4105;

    /** Source attributes.*/
    int AL_SOURCE_STATE = 4112;

    /** Source attributes.*/
    int AL_CONE_OUTER_GAIN = 4130;

    /** Source attributes.*/
    int AL_SOURCE_TYPE = 4135;

    /** Source state.*/
    int AL_INITIAL = 4113;

    /** Source state.*/
    int AL_PLAYING = 4114;

    /** Source state.*/
    int AL_PAUSED = 4115;

    /** Source state.*/
    int AL_STOPPED = 4116;

    /** Listener attributes.*/
    int AL_ORIENTATION = 4111;

    /** Queue state.*/
    int AL_BUFFERS_QUEUED = 4117;

    /** Queue state.*/
    int AL_BUFFERS_PROCESSED = 4118;

    /** Gain bounds.*/
    int AL_MIN_GAIN = 4109;

    /** Gain bounds.*/
    int AL_MAX_GAIN = 4110;

    /** Distance model attributes,*/
    int AL_REFERENCE_DISTANCE = 4128;

    /** Distance model attributes,*/
    int AL_ROLLOFF_FACTOR = 4129;

    /** Distance model attributes,*/
    int AL_MAX_DISTANCE = 4131;

    /** Buffer attributes,*/
    int AL_FREQUENCY = 8193;

    /** Buffer attributes,*/
    int AL_BITS = 8194;

    /** Buffer attributes,*/
    int AL_CHANNELS = 8195;

    /** Buffer attributes,*/
    int AL_SIZE = 8196;

    /** Buffer formats.*/
    int AL_FORMAT_MONO8 = 4352;

    /** Buffer formats.*/
    int AL_FORMAT_MONO16 = 4353;

    /** Buffer formats.*/
    int AL_FORMAT_STEREO8 = 4354;

    /** Buffer formats.*/
    int AL_FORMAT_STEREO16 = 4355;

    /** Buffer state.*/
    int AL_UNUSED = 8208;

    /** Buffer state.*/
    int AL_PENDING = 8209;

    /** Buffer state.*/
    int AL_PROCESSED = 8210;

    /** Obtains error information.  <p>Each detectable error is assigned a numeric code. When an error is detected by AL, a flag is set and the error code is recorded. Further errors, if they occur, do not affect this recorded code. When alGetError is called, the code is returned and the flag is cleared, so that a further error will again record its code. If a call to alGetError returns AL_NO_ERROR then there has been no detectable error since the last call to alGetError (or since the AL was initialized).</p>  <p>Error codes can be mapped to strings. The alGetString function returns a pointer to a constant (literal) string that is identical to the identifier used for the enumeration value, as defined in the specification.</p>*/
    int alGetError();

    /** Enables AL capabilities.@param target the capability to enable*/
    void alEnable(int target);

    /** Disables AL capabilities.@param target the capability to disable*/
    void alDisable(int target);

    /** Queries whether a given capability is currently enabled or not.@param target the capability to query*/
    boolean alIsEnabled(int target);

    /** Returns the boolean value of the specified parameter.@param paramName the parameter to query*/
    boolean alGetBoolean(int paramName);

    /** Returns the integer value of the specified parameter.@param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_DOPPLER_FACTOR DOPPLER_FACTOR}</td><td>{@link #AL_DISTANCE_MODEL DISTANCE_MODEL}</td><td>{@link org.lwjgl.openal.AL11#AL_SPEED_OF_SOUND SPEED_OF_SOUND}</td></tr></table>*/
    int alGetInteger(int paramName);

    /** Returns the float value of the specified parameter.@param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_DOPPLER_FACTOR DOPPLER_FACTOR}</td><td>{@link #AL_DISTANCE_MODEL DISTANCE_MODEL}</td><td>{@link org.lwjgl.openal.AL11#AL_SPEED_OF_SOUND SPEED_OF_SOUND}</td></tr></table>*/
    float alGetFloat(int paramName);

    /** Returns the double value of the specified parameter.@param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_DOPPLER_FACTOR DOPPLER_FACTOR}</td><td>{@link #AL_DISTANCE_MODEL DISTANCE_MODEL}</td><td>{@link org.lwjgl.openal.AL11#AL_SPEED_OF_SOUND SPEED_OF_SOUND}</td></tr></table>*/
    double alGetDouble(int paramName);

    /** Pointer version of {@link #alGetBoolean GetBoolean}.@param paramName the parameter to query@param dest a buffer that will receive the parameter values*/
    void alGetBooleanv(int paramName, ByteBuffer dest);

    /** Pointer version of {@link #alGetInteger GetInteger}.@param paramName the parameter to query@param dest a buffer that will receive the parameter values*/
    void alGetIntegerv(int paramName, IntBuffer dest);

    /** Pointer version of {@link #alGetFloat GetFloat}.@param paramName the parameter to query@param dest a buffer that will receive the parameter values*/
    void alGetFloatv(int paramName, FloatBuffer dest);

    /** Pointer version of {@link #alGetDouble GetDouble}.@param paramName the parameter to query@param dest a buffer that will receive the parameter values*/
    void alGetDoublev(int paramName, DoubleBuffer dest);

    /** Returns the string value of the specified parameter@param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_VENDOR VENDOR}</td><td>{@link #AL_VERSION VERSION}</td><td>{@link #AL_RENDERER RENDERER}</td><td>{@link #AL_EXTENSIONS EXTENSIONS}</td></tr></table>*/
    String alGetString(int paramName);

    /** Sets the distance attenuation model.  <p>Samples usually use the entire dynamic range of the chosen format/encoding, independent of their real world intensity. For example, a jet engine and a clockwork both will have samples with full amplitude. The application will then have to adjust source gain accordingly to account for relative differences.</p>  <p>Source gain is then attenuated by distance. The effective attenuation of a source depends on many factors, among which distance attenuation and source and listener gain are only some of the contributing factors. Even if the source and listener gain exceed 1.0 (amplification beyond the guaranteed dynamic range), distance and other attenuation might ultimately limit the overall gain to a value below 1.0.</p>  <p>OpenAL currently supports three modes of operation with respect to distance attenuation, including one that is similar to the IASIG I3DL2 model. The application can choose one of these models (or chooses to disable distance-dependent attenuation) on a per-context basis.</p>@param modelName the distance attenuation model to set. One of:<br><table><tr><td>{@link #AL_INVERSE_DISTANCE INVERSE_DISTANCE}</td><td>{@link #AL_INVERSE_DISTANCE_CLAMPED INVERSE_DISTANCE_CLAMPED}</td><td>{@link org.lwjgl.openal.AL11#AL_LINEAR_DISTANCE LINEAR_DISTANCE}</td><td>{@link org.lwjgl.openal.AL11#AL_LINEAR_DISTANCE_CLAMPED LINEAR_DISTANCE_CLAMPED}</td></tr><tr><td>{@link org.lwjgl.openal.AL11#AL_EXPONENT_DISTANCE EXPONENT_DISTANCE}</td><td>{@link org.lwjgl.openal.AL11#AL_EXPONENT_DISTANCE_CLAMPED EXPONENT_DISTANCE_CLAMPED}</td><td>{@link #AL_NONE NONE}</td></tr></table>*/
    void alDistanceModel(int modelName);

    /** Sets the doppler effect factor.  <p>The Doppler Effect depends on the velocities of source and listener relative to the medium, and the propagation speed of sound in that medium. The application might want to emphasize or de-emphasize the Doppler Effect as physically accurate calculation might not give the desired results. The amount of frequency shift (pitch change) is proportional to the speed of listener and source along their line of sight. The Doppler Effect as implemented by OpenAL is described by the formula below. Effects of the medium (air, water) moving with respect to listener and source are ignored.</p>  <pre><code> SS: AL_SPEED_OF_SOUND = speed of sound (default value 343.3) DF: AL_DOPPLER_FACTOR = Doppler factor (default 1.0) vls: Listener velocity scalar (scalar, projected on source-to-listener vector) vss: Source velocity scalar (scalar, projected on source-to-listener vector) f: Frequency of sample f': effective Doppler shifted frequency  3D Mathematical representation of vls and vss:  Mag(vector) = sqrt(vector.x * vector.x + vector.y * vector.y + vector.z * vector.z) DotProduct(v1, v2) = (v1.x * v2.x + v1.y * v2.y + v1.z * v2.z)  SL = source to listener vector SV = Source velocity vector LV = Listener velocity vector  vls = DotProduct(SL, LV) / Mag(SL) vss = DotProduct(SL, SV) / Mag(SL)  Dopper Calculation:  vss = min(vss, SS / DF) vls = min(vls, SS / DF)  f' = f * (SS - DF * vls) / (SS - DF * vss)</code></pre>  <p>The {@code dopplerFactor} is a simple scaling of source and listener velocities to exaggerate or deemphasize the Doppler (pitch) shift resulting from the calculation.</p>@param dopplerFactor the doppler factor*/
    void alDopplerFactor(float dopplerFactor);

    /** Sets the doppler effect propagation velocity.  <p>The OpenAL 1.1 Doppler implementation is different than that of OpenAL 1.0, because the older implementation was confusing and not implemented consistently. The new "speed of sound" property makes the 1.1 implementation more intuitive than the old implementation. If your implementation wants to support the AL_DOPPLER_VELOCITY parameter (the alDopplerVelocity call will remain as an entry point so that 1.0 applications can link with a 1.1 library), the above formula can be changed to the following:</p>  <pre><code> vss = min(vss, (SS * DV)/DF) vls = min(vls, (SS * DV)/DF)  f' = f * (SS * DV - DF*vls) / (SS * DV - DF * vss)</code></pre>  <p>OpenAL 1.1 programmers would never use AL_DOPPLER_VELOCITY (which defaults to 1.0).</p>@param dopplerVelocity the doppler velocity*/
    void alDopplerVelocity(float dopplerVelocity);

    /** Sets the float value of a listener parameter.@param paramName the parameter to modify. One of:<br><table><tr><td>{@link #AL_ORIENTATION ORIENTATION}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td></tr></table>@param value the parameter value*/
    void alListenerf(int paramName, float value);

    /** Integer version of {@link #alListenerf Listenerf}.@param paramName the parameter to modify. One of:<br><table><tr><td>{@link #AL_ORIENTATION ORIENTATION}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td></tr></table>@param values the parameter value*/
    void alListeneri(int paramName, int values);

    /** Sets the 3 dimensional float values of a listener parameter.@param paramName the parameter to modify. One of:<br><table><tr><td>{@link #AL_ORIENTATION ORIENTATION}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td></tr></table>@param value1 the first value@param value2 the second value@param value3 the third value*/
    void alListener3f(int paramName, float value1, float value2, float value3);

    /** Pointer version of {@link #alListenerf Listenerf}.@param paramName the parameter to modify@param values the parameter values*/
    void alListenerfv(int paramName, FloatBuffer values);

    /** Returns the float value of a listener parameter.@param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_ORIENTATION ORIENTATION}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td></tr></table>@param value the parameter value*/
    void alGetListenerf(int paramName, FloatBuffer value);

    /** Returns the float value of a listener parameter.@param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_ORIENTATION ORIENTATION}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td></tr></table>*/
    float alGetListenerf(int paramName);

    /** Returns the integer value of a listener parameter.@param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_ORIENTATION ORIENTATION}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td></tr></table>@param value the parameter value*/
    void alGetListeneri(int paramName, IntBuffer value);

    /** Returns the integer value of a listener parameter.@param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_ORIENTATION ORIENTATION}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td></tr></table>*/
    int alGetListeneri(int paramName);

    /** Returns the 3 dimensional values of a listener parameter.@param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_ORIENTATION ORIENTATION}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td></tr></table>@param value1 the first parameter value@param value2 the second parameter value@param value3 the third parameter value*/
    void alGetListener3f(int paramName, FloatBuffer value1, FloatBuffer value2, FloatBuffer value3);

    /** Returns float values of a listener parameter.@param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_ORIENTATION ORIENTATION}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td></tr></table>@param values the parameter values*/
    void alGetListenerfv(int paramName, FloatBuffer values);

    /** Requests a number of source names.@param srcNames the buffer that will receive the source names*/
    void alGenSources(IntBuffer srcNames);

    /** Requests a number of source names.*/
    int alGenSources();

    /** Requests the deletion of a number of sources.@param sources the sources to delete*/
    void alDeleteSources(IntBuffer sources);

    /** Requests the deletion of a number of sources.*/
    void alDeleteSources(int source);

    /** Verifies whether the specified object name is a source name.@param sourceName a value that may be a source name*/
    boolean alIsSource(int sourceName);

    /** Sets the float value of a source parameter.@param source the source to modify@param param the parameter to modify. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>@param value the parameter value*/
    void alSourcef(int source, int param, float value);

    /** Sets the 3 dimensional values of a source parameter.@param source the source to modify@param param the parameter to modify. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>@param v1 the first parameter value@param v2 the second parameter value@param v3 the third parameter value*/
    void alSource3f(int source, int param, float v1, float v2, float v3);

    /** Pointer version of {@link #alSourcef Sourcef}.@param source the source to modify@param param the parameter to modify@param values the parameter values*/
    void alSourcefv(int source, int param, FloatBuffer values);

    /** Integer version of {@link #alSourcef Sourcef}.@param source the source to modify@param param the parameter to modify@param value the parameter value*/
    void alSourcei(int source, int param, int value);

    /** Returns the float value of the specified source parameter.@param source the source to query@param param the parameter to query. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>@param value the parameter value*/
    void alGetSourcef(int source, int param, FloatBuffer value);

    /** Returns the float value of the specified source parameter.@param source the source to query@param param the parameter to query. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>*/
    float alGetSourcef(int source, int param);

    /** Returns the 3 dimensional values of the specified source parameter.@param source the source to query@param param the parameter to query. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>@param v1 the first parameter value@param v2 the second parameter value@param v3 the third parameter value*/
    void alGetSource3f(int source, int param, FloatBuffer v1, FloatBuffer v2, FloatBuffer v3);

    /** Returns the float values of the specified source parameter.@param source the source to query@param param the parameter to query. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>@param values the parameter values*/
    void alGetSourcefv(int source, int param, FloatBuffer values);

    /** Returns the integer value of the specified source parameter.@param source the source to query@param param the parameter to query. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>@param value the parameter value*/
    void alGetSourcei(int source, int param, IntBuffer value);

    /** Returns the integer value of the specified source parameter.@param source the source to query@param param the parameter to query. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>*/
    int alGetSourcei(int source, int param);

    /** Returns the integer values of the specified source parameter.@param source the source to query@param param the parameter to query. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>@param values the parameter values*/
    void alGetSourceiv(int source, int param, IntBuffer values);

    /** Queues up one or multiple buffer names to the specified source.  <p>The buffers will be queued in the sequence in which they appear in the array. This command is legal on a source in any playback state (to allow for streaming, queuing has to be possible on a AL_PLAYING source). All buffers in a queue must have the same format and attributes, with the exception of the {@code NULL} buffer (i.e., 0) which can always be queued.</p>@param sourceName the target source@param bufferNames the buffer names*/
    void alSourceQueueBuffers(int sourceName, IntBuffer bufferNames);

    /** Queues up one or multiple buffer names to the specified source.  <p>The buffers will be queued in the sequence in which they appear in the array. This command is legal on a source in any playback state (to allow for streaming, queuing has to be possible on a AL_PLAYING source). All buffers in a queue must have the same format and attributes, with the exception of the {@code NULL} buffer (i.e., 0) which can always be queued.</p>@param sourceName the target source*/
    void alSourceQueueBuffers(int sourceName, int bufferName);

    /** Removes a number of buffer entries that have finished processing, in the order of apperance, from the queue of the specified source.  <p>Once a queue entry for a buffer has been appended to a queue and is pending processing, it should not be changed. Removal of a given queue entry is not possible unless either the source is stopped (in which case then entire queue is considered processed), or if the queue entry has already been processed (AL_PLAYING or AL_PAUSED source). A playing source will enter the AL_STOPPED state if it completes playback of the last buffer in its queue (the same behavior as when a single buffer has been attached to a source and has finished playback).</p>@param sourceName the target source@param bufferNames the buffer names*/
    void alSourceUnqueueBuffers(int sourceName, IntBuffer bufferNames);

    /** Removes a number of buffer entries that have finished processing, in the order of apperance, from the queue of the specified source.  <p>Once a queue entry for a buffer has been appended to a queue and is pending processing, it should not be changed. Removal of a given queue entry is not possible unless either the source is stopped (in which case then entire queue is considered processed), or if the queue entry has already been processed (AL_PLAYING or AL_PAUSED source). A playing source will enter the AL_STOPPED state if it completes playback of the last buffer in its queue (the same behavior as when a single buffer has been attached to a source and has finished playback).</p>@param sourceName the target source*/
    int alSourceUnqueueBuffers(int sourceName);

    /** Sets the source state to AL_PLAYING.  <p>alSourcePlay applied to an AL_INITIAL source will promote the source to AL_PLAYING, thus the data found in the buffer will be fed into the processing, starting at the beginning. alSourcePlay applied to a AL_PLAYING source will restart the source from the beginning. It will not affect the configuration, and will leave the source in AL_PLAYING state, but reset the sampling offset to the beginning. alSourcePlay applied to a AL_PAUSED source will resume processing using the source state as preserved at the alSourcePause operation. alSourcePlay applied to a AL_STOPPED source will propagate it to AL_INITIAL then to AL_PLAYING immediately.</p>@param source the source to play*/
    void alSourcePlay(int source);

    /** Sets the source state to AL_PAUSED.  <p>alSourcePause applied to an AL_INITIAL source is a legal NOP. alSourcePause applied to a AL_PLAYING source will change its state to AL_PAUSED. The source is exempt from processing, its current state is preserved. alSourcePause applied to a AL_PAUSED source is a legal NOP. alSourcePause applied to a AL_STOPPED source is a legal NOP.</p>@param source the source to pause*/
    void alSourcePause(int source);

    /** Sets the source state to AL_STOPPED.  <p>alSourceStop applied to an AL_INITIAL source is a legal NOP. alSourceStop applied to a AL_PLAYING source will change its state to AL_STOPPED. The source is exempt from processing, its current state is preserved. alSourceStop applied to a AL_PAUSED source will change its state to AL_STOPPED, with the same consequences as on a AL_PLAYING source. alSourceStop applied to a AL_STOPPED source is a legal NOP.</p>@param source the source to stop*/
    void alSourceStop(int source);

    /** Sets the source state to AL_INITIAL.  <p>alSourceRewind applied to an AL_INITIAL source is a legal NOP. alSourceRewind applied to a AL_PLAYING source will change its state to AL_STOPPED then AL_INITIAL. The source is exempt from processing: its current state is preserved, with the exception of the sampling offset, which is reset to the beginning. alSourceRewind applied to a AL_PAUSED source will change its state to AL_INITIAL, with the same consequences as on a AL_PLAYING source. alSourceRewind applied to an AL_STOPPED source promotes the source to AL_INITIAL, resetting the sampling offset to the beginning.</p>@param source the source to rewind*/
    void alSourceRewind(int source);

    /** Pointer version of {@link #alSourcePlay SourcePlay}.@param sources the sources to play*/
    void alSourcePlayv(IntBuffer sources);

    /** Pointer version of {@link #alSourcePause SourcePause}.@param sources the sources to pause*/
    void alSourcePausev(IntBuffer sources);

    /** Pointer version of {@link #alSourceStop SourceStop}.@param sources the sources to stop*/
    void alSourceStopv(IntBuffer sources);

    /** Pointer version of {@link #alSourceRewind SourceRewind}.@param sources the sources to rewind*/
    void alSourceRewindv(IntBuffer sources);

    /** Requests a number of buffer names.@param bufferNames the buffer that will receive the buffer names*/
    void alGenBuffers(IntBuffer bufferNames);

    /** Requests a number of buffer names.*/
    int alGenBuffers();

    /** Requests the deletion of a number of buffers.@param bufferNames the buffers to delete*/
    void alDeleteBuffers(IntBuffer bufferNames);

    /** Requests the deletion of a number of buffers.*/
    void alDeleteBuffers(int bufferName);

    /** Verifies whether the specified object name is a buffer name.@param bufferName a value that may be a buffer name*/
    boolean alIsBuffer(int bufferName);

    /** Returns the float value of the specified buffer parameter.@param bufferName the buffer to query@param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_FREQUENCY FREQUENCY}</td><td>{@link #AL_BITS BITS}</td><td>{@link #AL_CHANNELS CHANNELS}</td><td>{@link #AL_SIZE SIZE}</td></tr></table>@param value the parameter value*/
    void alGetBufferf(int bufferName, int paramName, FloatBuffer value);

    /** Returns the float value of the specified buffer parameter.@param bufferName the buffer to query@param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_FREQUENCY FREQUENCY}</td><td>{@link #AL_BITS BITS}</td><td>{@link #AL_CHANNELS CHANNELS}</td><td>{@link #AL_SIZE SIZE}</td></tr></table>*/
    float alGetBufferf(int bufferName, int paramName);

    /** Returns the integer value of the specified buffer parameter.@param bufferName the buffer to query@param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_FREQUENCY FREQUENCY}</td><td>{@link #AL_BITS BITS}</td><td>{@link #AL_CHANNELS CHANNELS}</td><td>{@link #AL_SIZE SIZE}</td></tr></table>@param value the parameter value*/
    void alGetBufferi(int bufferName, int paramName, IntBuffer value);

    /** Returns the integer value of the specified buffer parameter.@param bufferName the buffer to query@param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_FREQUENCY FREQUENCY}</td><td>{@link #AL_BITS BITS}</td><td>{@link #AL_CHANNELS CHANNELS}</td><td>{@link #AL_SIZE SIZE}</td></tr></table>*/
    int alGetBufferi(int bufferName, int paramName);

    /** Sets the sample data of the specified buffer.  <p>The data specified is copied to an internal software, or if possible, hardware buffer. The implementation is free to apply decompression, conversion, resampling, and filtering as needed.</p>  <p>8-bit data is expressed as an unsigned value over the range 0 to 255, 128 being an audio output level of zero.</p>  <p>16-bit data is expressed as a signed value over the range -32768 to 32767, 0 being an audio output level of zero. Byte order for 16-bit values is determined by the native format of the CPU.</p>  <p>Stereo data is expressed in an interleaved format, left channel sample followed by the right channel sample.</p>  <p>Buffers containing audio data with more than one channel will be played without 3D spatialization features \u2013 these formats are normally used for background music.</p>@param bufferName the buffer to modify@param format the data format. One of:<br><table><tr><td>{@link #AL_FORMAT_MONO8 FORMAT_MONO8}</td><td>{@link #AL_FORMAT_MONO16 FORMAT_MONO16}</td><td>{@link #AL_FORMAT_STEREO8 FORMAT_STEREO8}</td><td>{@link #AL_FORMAT_STEREO16 FORMAT_STEREO16}</td></tr></table>@param data the sample data@param frequency the data frequency*/
    void alBufferData(int bufferName, int format, ByteBuffer data, int frequency);

    /** Sets the sample data of the specified buffer.  <p>The data specified is copied to an internal software, or if possible, hardware buffer. The implementation is free to apply decompression, conversion, resampling, and filtering as needed.</p>  <p>8-bit data is expressed as an unsigned value over the range 0 to 255, 128 being an audio output level of zero.</p>  <p>16-bit data is expressed as a signed value over the range -32768 to 32767, 0 being an audio output level of zero. Byte order for 16-bit values is determined by the native format of the CPU.</p>  <p>Stereo data is expressed in an interleaved format, left channel sample followed by the right channel sample.</p>  <p>Buffers containing audio data with more than one channel will be played without 3D spatialization features \u2013 these formats are normally used for background music.</p>@param bufferName the buffer to modify@param format the data format. One of:<br><table><tr><td>{@link #AL_FORMAT_MONO8 FORMAT_MONO8}</td><td>{@link #AL_FORMAT_MONO16 FORMAT_MONO16}</td><td>{@link #AL_FORMAT_STEREO8 FORMAT_STEREO8}</td><td>{@link #AL_FORMAT_STEREO16 FORMAT_STEREO16}</td></tr></table>@param data the sample data@param frequency the data frequency*/
    void alBufferData(int bufferName, int format, ShortBuffer data, int frequency);

    /** Sets the sample data of the specified buffer.  <p>The data specified is copied to an internal software, or if possible, hardware buffer. The implementation is free to apply decompression, conversion, resampling, and filtering as needed.</p>  <p>8-bit data is expressed as an unsigned value over the range 0 to 255, 128 being an audio output level of zero.</p>  <p>16-bit data is expressed as a signed value over the range -32768 to 32767, 0 being an audio output level of zero. Byte order for 16-bit values is determined by the native format of the CPU.</p>  <p>Stereo data is expressed in an interleaved format, left channel sample followed by the right channel sample.</p>  <p>Buffers containing audio data with more than one channel will be played without 3D spatialization features \u2013 these formats are normally used for background music.</p>@param bufferName the buffer to modify@param format the data format. One of:<br><table><tr><td>{@link #AL_FORMAT_MONO8 FORMAT_MONO8}</td><td>{@link #AL_FORMAT_MONO16 FORMAT_MONO16}</td><td>{@link #AL_FORMAT_STEREO8 FORMAT_STEREO8}</td><td>{@link #AL_FORMAT_STEREO16 FORMAT_STEREO16}</td></tr></table>@param data the sample data@param frequency the data frequency*/
    void alBufferData(int bufferName, int format, IntBuffer data, int frequency);

    /** Sets the sample data of the specified buffer.  <p>The data specified is copied to an internal software, or if possible, hardware buffer. The implementation is free to apply decompression, conversion, resampling, and filtering as needed.</p>  <p>8-bit data is expressed as an unsigned value over the range 0 to 255, 128 being an audio output level of zero.</p>  <p>16-bit data is expressed as a signed value over the range -32768 to 32767, 0 being an audio output level of zero. Byte order for 16-bit values is determined by the native format of the CPU.</p>  <p>Stereo data is expressed in an interleaved format, left channel sample followed by the right channel sample.</p>  <p>Buffers containing audio data with more than one channel will be played without 3D spatialization features \u2013 these formats are normally used for background music.</p>@param bufferName the buffer to modify@param format the data format. One of:<br><table><tr><td>{@link #AL_FORMAT_MONO8 FORMAT_MONO8}</td><td>{@link #AL_FORMAT_MONO16 FORMAT_MONO16}</td><td>{@link #AL_FORMAT_STEREO8 FORMAT_STEREO8}</td><td>{@link #AL_FORMAT_STEREO16 FORMAT_STEREO16}</td></tr></table>@param data the sample data@param frequency the data frequency*/
    void alBufferData(int bufferName, int format, FloatBuffer data, int frequency);

    /** Returns the enumeration value of the specified enum.@param enumName the enum name*/
    int alGetEnumValue(ByteBuffer enumName);

    /** Returns the enumeration value of the specified enum.@param enumName the enum name*/
    int alGetEnumValue(CharSequence enumName);

    /** Retrieves extension entry points.  <p>Returns {@code NULL} if no entry point with the name funcName can be found. Implementations are free to return {@code NULL} if an entry point is present, but not applicable for the current context. However the specification does not guarantee this behavior.</p>  <p>Applications can use alGetProcAddress to obtain core API entry points, not just extensions. This is the recommended way to dynamically load and unload OpenAL DLL's as sound drivers.</p>@param funcName the function name*/
    long alGetProcAddress(ByteBuffer funcName);

    /** Retrieves extension entry points.  <p>Returns {@code NULL} if no entry point with the name funcName can be found. Implementations are free to return {@code NULL} if an entry point is present, but not applicable for the current context. However the specification does not guarantee this behavior.</p>  <p>Applications can use alGetProcAddress to obtain core API entry points, not just extensions. This is the recommended way to dynamically load and unload OpenAL DLL's as sound drivers.</p>@param funcName the function name*/
    long alGetProcAddress(CharSequence funcName);

    /** Verifies that a given extension is available for the current context and the device it is associated with.  <p>Invalid and unsupported string tokens return ALC_FALSE. {@code extName} is not case sensitive \u2013 the implementation will convert the name to all upper-case internally (and will express extension names in upper-case).</p>@param extName the extension name*/
    boolean alIsExtensionPresent(ByteBuffer extName);

    /** Verifies that a given extension is available for the current context and the device it is associated with.  <p>Invalid and unsupported string tokens return ALC_FALSE. {@code extName} is not case sensitive \u2013 the implementation will convert the name to all upper-case internally (and will express extension names in upper-case).</p>@param extName the extension name*/
    boolean alIsExtensionPresent(CharSequence extName);

    /** Array version of: {@link #alGetIntegerv GetIntegerv}*/
    void alGetIntegerv(int paramName, int[] dest);

    /** Array version of: {@link #alGetFloatv GetFloatv}*/
    void alGetFloatv(int paramName, float[] dest);

    /** Array version of: {@link #alGetDoublev GetDoublev}*/
    void alGetDoublev(int paramName, double[] dest);

    /** Array version of: {@link #alListenerfv Listenerfv}*/
    void alListenerfv(int paramName, float[] values);

    /** Array version of: {@link #alGetListenerf GetListenerf}*/
    void alGetListenerf(int paramName, float[] value);

    /** Array version of: {@link #alGetListeneri GetListeneri}*/
    void alGetListeneri(int paramName, int[] value);

    /** Array version of: {@link #alGetListener3f GetListener3f}*/
    void alGetListener3f(int paramName, float[] value1, float[] value2, float[] value3);

    /** Array version of: {@link #alGetListenerfv GetListenerfv}*/
    void alGetListenerfv(int paramName, float[] values);

    /** Array version of: {@link #alGenSources GenSources}*/
    void alGenSources(int[] srcNames);

    /** Array version of: {@link #alDeleteSources DeleteSources}*/
    void alDeleteSources(int[] sources);

    /** Array version of: {@link #alSourcefv Sourcefv}*/
    void alSourcefv(int source, int param, float[] values);

    /** Array version of: {@link #alGetSourcef GetSourcef}*/
    void alGetSourcef(int source, int param, float[] value);

    /** Array version of: {@link #alGetSource3f GetSource3f}*/
    void alGetSource3f(int source, int param, float[] v1, float[] v2, float[] v3);

    /** Array version of: {@link #alGetSourcefv GetSourcefv}*/
    void alGetSourcefv(int source, int param, float[] values);

    /** Array version of: {@link #alGetSourcei GetSourcei}*/
    void alGetSourcei(int source, int param, int[] value);

    /** Array version of: {@link #alGetSourceiv GetSourceiv}*/
    void alGetSourceiv(int source, int param, int[] values);

    /** Array version of: {@link #alSourceQueueBuffers SourceQueueBuffers}*/
    void alSourceQueueBuffers(int sourceName, int[] bufferNames);

    /** Array version of: {@link #alSourceUnqueueBuffers SourceUnqueueBuffers}*/
    void alSourceUnqueueBuffers(int sourceName, int[] bufferNames);

    /** Array version of: {@link #alSourcePlayv SourcePlayv}*/
    void alSourcePlayv(int[] sources);

    /** Array version of: {@link #alSourcePausev SourcePausev}*/
    void alSourcePausev(int[] sources);

    /** Array version of: {@link #alSourceStopv SourceStopv}*/
    void alSourceStopv(int[] sources);

    /** Array version of: {@link #alSourceRewindv SourceRewindv}*/
    void alSourceRewindv(int[] sources);

    /** Array version of: {@link #alGenBuffers GenBuffers}*/
    void alGenBuffers(int[] bufferNames);

    /** Array version of: {@link #alDeleteBuffers DeleteBuffers}*/
    void alDeleteBuffers(int[] bufferNames);

    /** Array version of: {@link #alGetBufferf GetBufferf}*/
    void alGetBufferf(int bufferName, int paramName, float[] value);

    /** Array version of: {@link #alGetBufferi GetBufferi}*/
    void alGetBufferi(int bufferName, int paramName, int[] value);

    /** Array version of: {@link #alBufferData BufferData}*/
    void alBufferData(int bufferName, int format, short[] data, int frequency);

    /** Array version of: {@link #alBufferData BufferData}*/
    void alBufferData(int bufferName, int format, int[] data, int frequency);

    /** Array version of: {@link #alBufferData BufferData}*/
    void alBufferData(int bufferName, int format, float[] data, int frequency);


}
