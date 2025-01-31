package br.fosge.engine.runtime.platform.binding.openal.api;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public interface AL11 extends AL10 {

    /** Context creation attributes.*/
    int ALC_MONO_SOURCES = 4112;

    /** Context creation attributes.*/
    int ALC_STEREO_SOURCES = 4113;

    /** String queries.*/
    int ALC_DEFAULT_ALL_DEVICES_SPECIFIER = 4114;

    /** String queries.*/
    int ALC_ALL_DEVICES_SPECIFIER = 4115;

    /** String queries.*/
    int ALC_CAPTURE_DEVICE_SPECIFIER = 784;

    /** String queries.*/
    int ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER = 785;

    /** Integer queries.*/
    int ALC_CAPTURE_SAMPLES = 786;

    /** Allows the application to connect to a capture device.  <p>The {@code deviceName} argument is a null terminated string that requests a certain device or device configuration. If {@code NULL} is specified, the implementation will provide an implementation specific default.</p>@param deviceName the device or device configuration@param frequency the audio frequency@param format the audio format@param samples the number of sample frames to buffer in the AL*/
    long alcCaptureOpenDevice(ByteBuffer deviceName, int frequency, int format, int samples);

    /** Allows the application to connect to a capture device.  <p>The {@code deviceName} argument is a null terminated string that requests a certain device or device configuration. If {@code NULL} is specified, the implementation will provide an implementation specific default.</p>@param deviceName the device or device configuration@param frequency the audio frequency@param format the audio format@param samples the number of sample frames to buffer in the AL*/
    long alcCaptureOpenDevice(CharSequence deviceName, int frequency, int format, int samples);

    /** Allows the application to disconnect from a capture device.@param device the capture device to close*/
    boolean alcCaptureCloseDevice(long device);

    /** Starts recording audio on the specific capture device.  <p>Once started, the device will record audio to an internal ring buffer, the size of which was specified when opening the device. The application may query the capture device to discover how much data is currently available via the alcGetInteger with the ALC_CAPTURE_SAMPLES token. This will report the number of sample frames currently available.</p>@param device the capture device*/
    void alcCaptureStart(long device);

    /** Halts audio capturing without closing the capture device.  <p>The implementation is encouraged to optimize for this case. The amount of audio samples available after restarting a stopped capture device is reset to zero. The application does not need to stop the capture device to read from it.</p>@param device the capture device*/
    void alcCaptureStop(long device);

    /** Obtains captured audio samples from the AL.  <p>The implementation may defer conversion and resampling until this point. Requesting more sample frames than are currently available is an error.</p>@param device the capture device@param buffer the buffer that will receive the samples. It must be big enough to contain at least {@code samples} sample frames.@param samples the number of sample frames to obtain*/
    void alcCaptureSamples(long device, ByteBuffer buffer, int samples);

    /** Obtains captured audio samples from the AL.  <p>The implementation may defer conversion and resampling until this point. Requesting more sample frames than are currently available is an error.</p>@param device the capture device@param buffer the buffer that will receive the samples. It must be big enough to contain at least {@code samples} sample frames.@param samples the number of sample frames to obtain*/
    void alcCaptureSamples(long device, ShortBuffer buffer, int samples);

    /** Obtains captured audio samples from the AL.  <p>The implementation may defer conversion and resampling until this point. Requesting more sample frames than are currently available is an error.</p>@param device the capture device@param buffer the buffer that will receive the samples. It must be big enough to contain at least {@code samples} sample frames.@param samples the number of sample frames to obtain*/
    void alcCaptureSamples(long device, IntBuffer buffer, int samples);

    /** Obtains captured audio samples from the AL.  <p>The implementation may defer conversion and resampling until this point. Requesting more sample frames than are currently available is an error.</p>@param device the capture device@param buffer the buffer that will receive the samples. It must be big enough to contain at least {@code samples} sample frames.@param samples the number of sample frames to obtain*/
    void alcCaptureSamples(long device, FloatBuffer buffer, int samples);

    /** Array version of: {@link #alcCaptureSamples CaptureSamples}*/
    void alcCaptureSamples(long device, short[] buffer, int samples);

    /** Array version of: {@link #alcCaptureSamples CaptureSamples}*/
    void alcCaptureSamples(long device, int[] buffer, int samples);

    /** Array version of: {@link #alcCaptureSamples CaptureSamples}*/
    void alcCaptureSamples(long device, float[] buffer, int samples);

    /** General tokens.*/
    int AL_SEC_OFFSET = 4132;

    /** General tokens.*/
    int AL_SAMPLE_OFFSET = 4133;

    /** General tokens.*/
    int AL_BYTE_OFFSET = 4134;

    /** General tokens.*/
    int AL_STATIC = 4136;

    /** General tokens.*/
    int AL_STREAMING = 4137;

    /** General tokens.*/
    int AL_UNDETERMINED = 4144;

    /** General tokens.*/
    int AL_ILLEGAL_COMMAND = 40964;

    /** General tokens.*/
    int AL_SPEED_OF_SOUND = 49155;

    /** General tokens.*/
    int AL_LINEAR_DISTANCE = 53251;

    /** General tokens.*/
    int AL_LINEAR_DISTANCE_CLAMPED = 53252;

    /** General tokens.*/
    int AL_EXPONENT_DISTANCE = 53253;

    /** General tokens.*/
    int AL_EXPONENT_DISTANCE_CLAMPED = 53254;

    /** Sets the 3 dimensional integer values of a listener parameter.@param paramName the parameter to modify@param value1 the first value@param value2 the second value@param value3 the third value*/
    void alListener3i(int paramName, int value1, int value2, int value3);

    /** Returns the integer values of the specified listener parameter.@param param the parameter to query@param values the parameter values*/
    void alGetListeneriv(int param, IntBuffer values);

    /** Sets the 3 dimensional integer values of a source parameter.@param source the source to modify@param paramName the parameter to modify@param value1 the first value@param value2 the second value@param value3 the third value*/
    void alSource3i(int source, int paramName, int value1, int value2, int value3);

    /** Pointer version.@param listener the parameter to modify@param value the parameter values*/
    void alListeneriv(int listener, IntBuffer value);

    /** Pointer version.@param source the source to modify@param paramName the parameter to modify@param value the parameter values*/
    void alSourceiv(int source, int paramName, IntBuffer value);

    /** Sets the float value of a buffer parameter.@param buffer the buffer to modify@param paramName the parameter to modify@param value the value*/
    void alBufferf(int buffer, int paramName, float value);

    /** Sets the dimensional value of a buffer parameter.@param buffer the buffer to modify@param paramName the parameter to modify@param value1 the first value@param value2 the second value@param value3 the third value*/
    void alBuffer3f(int buffer, int paramName, float value1, float value2, float value3);

    /** the pointer version of {@link #alBufferf Bufferf}@param buffer the buffer to modify@param paramName the parameter to modify@param value the parameter values*/
    void alBufferfv(int buffer, int paramName, FloatBuffer value);

    /** Sets the integer value of a buffer parameter.@param buffer the buffer to modify@param paramName the parameter to modify@param value the value*/
    void alBufferi(int buffer, int paramName, int value);

    /** Sets the integer 3 dimensional value of a buffer parameter.@param buffer the buffer to modify@param paramName the parameter to modify@param value1 the first value@param value2 the second value@param value3 the third value*/
    void alBuffer3i(int buffer, int paramName, int value1, int value2, int value3);

    /** the pointer version of {@link #alBufferi Bufferi}@param buffer the buffer to modify@param paramName the parameter to modify@param value the parameter values*/
    void alBufferiv(int buffer, int paramName, IntBuffer value);

    /** Returns the integer values of the specified buffer parameter.@param buffer the buffer to query@param param the parameter to query@param values the parameter values*/
    void alGetBufferiv(int buffer, int param, IntBuffer values);

    /** Returns the float values of the specified buffer parameter.@param buffer the buffer to query@param param the parameter to query@param values the parameter values*/
    void alGetBufferfv(int buffer, int param, FloatBuffer values);

    /** Sets the speed of sound.@param value the speed of sound*/
    void alSpeedOfSound(float value);

    /** Array version of: {@link #alGetListeneriv GetListeneriv}*/
    void alGetListeneriv(int param, int[] values);

    /** Array version of: {@link #alListeneriv Listeneriv}*/
    void alListeneriv(int listener, int[] value);

    /** Array version of: {@link #alSourceiv Sourceiv}*/
    void alSourceiv(int source, int paramName, int[] value);

    /** Array version of: {@link #alBufferfv Bufferfv}*/
    void alBufferfv(int buffer, int paramName, float[] value);

    /** Array version of: {@link #alBufferiv Bufferiv}*/
    void alBufferiv(int buffer, int paramName, int[] value);

    /** Array version of: {@link #alGetBufferiv GetBufferiv}*/
    void alGetBufferiv(int buffer, int param, int[] values);

    /** Array version of: {@link #alGetBufferfv GetBufferfv}*/
    void alGetBufferfv(int buffer, int param, float[] values);

}
