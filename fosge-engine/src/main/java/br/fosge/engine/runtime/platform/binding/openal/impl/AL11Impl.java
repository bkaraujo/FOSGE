package br.fosge.engine.runtime.platform.binding.openal.impl;

import br.fosge.engine.runtime.platform.binding.openal.api.AL11;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public class AL11Impl extends AL10Impl implements AL11 {

    public final long alcCaptureOpenDevice(ByteBuffer deviceName, int frequency, int format, int samples) {
        return org.lwjgl.openal.ALC11.alcCaptureOpenDevice(deviceName, frequency, format, samples);
    }

    public final long alcCaptureOpenDevice(CharSequence deviceName, int frequency, int format, int samples) {
        return org.lwjgl.openal.ALC11.alcCaptureOpenDevice(deviceName, frequency, format, samples);
    }

    public final boolean alcCaptureCloseDevice(long device) {
        return org.lwjgl.openal.ALC11.alcCaptureCloseDevice(device);
    }

    public final void alcCaptureStart(long device) {
        org.lwjgl.openal.ALC11.alcCaptureStart(device);
    }

    public final void alcCaptureStop(long device) {
        org.lwjgl.openal.ALC11.alcCaptureStop(device);
    }

    public final void alcCaptureSamples(long device, ByteBuffer buffer, int samples) {
        org.lwjgl.openal.ALC11.alcCaptureSamples(device, buffer, samples);
    }

    public final void alcCaptureSamples(long device, ShortBuffer buffer, int samples) {
        org.lwjgl.openal.ALC11.alcCaptureSamples(device, buffer, samples);
    }

    public final void alcCaptureSamples(long device, IntBuffer buffer, int samples) {
        org.lwjgl.openal.ALC11.alcCaptureSamples(device, buffer, samples);
    }

    public final void alcCaptureSamples(long device, FloatBuffer buffer, int samples) {
        org.lwjgl.openal.ALC11.alcCaptureSamples(device, buffer, samples);
    }

    public final void alcCaptureSamples(long device, short[] buffer, int samples) {
        org.lwjgl.openal.ALC11.alcCaptureSamples(device, buffer, samples);
    }

    public final void alcCaptureSamples(long device, int[] buffer, int samples) {
        org.lwjgl.openal.ALC11.alcCaptureSamples(device, buffer, samples);
    }

    public final void alcCaptureSamples(long device, float[] buffer, int samples) {
        org.lwjgl.openal.ALC11.alcCaptureSamples(device, buffer, samples);
    }

    public final void alListener3i(int paramName, int value1, int value2, int value3) {
        org.lwjgl.openal.AL11.alListener3i(paramName, value1, value2, value3);
    }

    public final void alGetListeneriv(int param, IntBuffer values) {
        org.lwjgl.openal.AL11.alGetListeneriv(param, values);
    }

    public final void alSource3i(int source, int paramName, int value1, int value2, int value3) {
        org.lwjgl.openal.AL11.alSource3i(source, paramName, value1, value2, value3);
    }

    public final void alListeneriv(int listener, IntBuffer value) {
        org.lwjgl.openal.AL11.alListeneriv(listener, value);
    }

    public final void alSourceiv(int source, int paramName, IntBuffer value) {
        org.lwjgl.openal.AL11.alSourceiv(source, paramName, value);
    }

    public final void alBufferf(int buffer, int paramName, float value) {
        org.lwjgl.openal.AL11.alBufferf(buffer, paramName, value);
    }

    public final void alBuffer3f(int buffer, int paramName, float value1, float value2, float value3) {
        org.lwjgl.openal.AL11.alBuffer3f(buffer, paramName, value1, value2, value3);
    }

    public final void alBufferfv(int buffer, int paramName, FloatBuffer value) {
        org.lwjgl.openal.AL11.alBufferfv(buffer, paramName, value);
    }

    public final void alBufferi(int buffer, int paramName, int value) {
        org.lwjgl.openal.AL11.alBufferi(buffer, paramName, value);
    }

    public final void alBuffer3i(int buffer, int paramName, int value1, int value2, int value3) {
        org.lwjgl.openal.AL11.alBuffer3i(buffer, paramName, value1, value2, value3);
    }

    public final void alBufferiv(int buffer, int paramName, IntBuffer value) {
        org.lwjgl.openal.AL11.alBufferiv(buffer, paramName, value);
    }

    public final void alGetBufferiv(int buffer, int param, IntBuffer values) {
        org.lwjgl.openal.AL11.alGetBufferiv(buffer, param, values);
    }

    public final void alGetBufferfv(int buffer, int param, FloatBuffer values) {
        org.lwjgl.openal.AL11.alGetBufferfv(buffer, param, values);
    }

    public final void alSpeedOfSound(float value) {
        org.lwjgl.openal.AL11.alSpeedOfSound(value);
    }

    public final void alGetListeneriv(int param, int[] values) {
        org.lwjgl.openal.AL11.alGetListeneriv(param, values);
    }

    public final void alListeneriv(int listener, int[] value) {
        org.lwjgl.openal.AL11.alListeneriv(listener, value);
    }

    public final void alSourceiv(int source, int paramName, int[] value) {
        org.lwjgl.openal.AL11.alSourceiv(source, paramName, value);
    }

    public final void alBufferfv(int buffer, int paramName, float[] value) {
        org.lwjgl.openal.AL11.alBufferfv(buffer, paramName, value);
    }

    public final void alBufferiv(int buffer, int paramName, int[] value) {
        org.lwjgl.openal.AL11.alBufferiv(buffer, paramName, value);
    }

    public final void alGetBufferiv(int buffer, int param, int[] values) {
        org.lwjgl.openal.AL11.alGetBufferiv(buffer, param, values);
    }

    public final void alGetBufferfv(int buffer, int param, float[] values) {
        org.lwjgl.openal.AL11.alGetBufferfv(buffer, param, values);
    }

}
