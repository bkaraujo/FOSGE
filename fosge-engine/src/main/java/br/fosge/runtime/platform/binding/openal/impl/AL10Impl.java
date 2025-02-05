package br.fosge.runtime.platform.binding.openal.impl;

import br.fosge.runtime.platform.binding.openal.api.AL10;

import java.nio.*;

public class AL10Impl implements AL10 {

    public final long alcOpenDevice(ByteBuffer deviceSpecifier) {
        return org.lwjgl.openal.ALC10.alcOpenDevice(deviceSpecifier);
    }

    public final long alcOpenDevice(CharSequence deviceSpecifier) {
        return org.lwjgl.openal.ALC10.alcOpenDevice(deviceSpecifier);
    }

    public final boolean alcCloseDevice(long deviceHandle) {
        return org.lwjgl.openal.ALC10.alcCloseDevice(deviceHandle);
    }

    public final long alcCreateContext(long deviceHandle, IntBuffer attrList) {
        return org.lwjgl.openal.ALC10.alcCreateContext(deviceHandle, attrList);
    }

    public final boolean alcMakeContextCurrent(long context) {
        return org.lwjgl.openal.ALC10.alcMakeContextCurrent(context);
    }

    public final void alcProcessContext(long context) {
        org.lwjgl.openal.ALC10.alcProcessContext(context);
    }

    public final void alcSuspendContext(long context) {
        org.lwjgl.openal.ALC10.alcSuspendContext(context);
    }

    public final void alcDestroyContext(long context) {
        org.lwjgl.openal.ALC10.alcDestroyContext(context);
    }

    public final long alcGetCurrentContext() {
        return org.lwjgl.openal.ALC10.alcGetCurrentContext();
    }

    public final long alcGetContextsDevice(long context) {
        return org.lwjgl.openal.ALC10.alcGetContextsDevice(context);
    }

    public final boolean alcIsExtensionPresent(long deviceHandle, ByteBuffer extName) {
        return org.lwjgl.openal.ALC10.alcIsExtensionPresent(deviceHandle, extName);
    }

    public final boolean alcIsExtensionPresent(long deviceHandle, CharSequence extName) {
        return org.lwjgl.openal.ALC10.alcIsExtensionPresent(deviceHandle, extName);
    }

    public final long alcGetProcAddress(long deviceHandle, ByteBuffer funcName) {
        return org.lwjgl.openal.ALC10.alcGetProcAddress(deviceHandle, funcName);
    }

    public final long alcGetProcAddress(long deviceHandle, CharSequence funcName) {
        return org.lwjgl.openal.ALC10.alcGetProcAddress(deviceHandle, funcName);
    }

    public final int alcGetEnumValue(long deviceHandle, ByteBuffer enumName) {
        return org.lwjgl.openal.ALC10.alcGetEnumValue(deviceHandle, enumName);
    }

    public final int alcGetEnumValue(long deviceHandle, CharSequence enumName) {
        return org.lwjgl.openal.ALC10.alcGetEnumValue(deviceHandle, enumName);
    }

    public final int alcGetError(long deviceHandle) {
        return org.lwjgl.openal.ALC10.alcGetError(deviceHandle);
    }

    public final String alcGetString(long deviceHandle, int token) {
        return org.lwjgl.openal.ALC10.alcGetString(deviceHandle, token);
    }

    public final void alcGetIntegerv(long deviceHandle, int token, IntBuffer dest) {
        org.lwjgl.openal.ALC10.alcGetIntegerv(deviceHandle, token, dest);
    }

    public final int alcGetInteger(long deviceHandle, int token) {
        return org.lwjgl.openal.ALC10.alcGetInteger(deviceHandle, token);
    }

    public final long alcCreateContext(long deviceHandle, int[] attrList) {
        return org.lwjgl.openal.ALC10.alcCreateContext(deviceHandle, attrList);
    }

    public final void alcGetIntegerv(long deviceHandle, int token, int[] dest) {
        org.lwjgl.openal.ALC10.alcGetIntegerv(deviceHandle, token, dest);
    }


    public final int alGetError() {
        return org.lwjgl.openal.AL10.alGetError();
    }

    public final void alEnable(int target) {
        org.lwjgl.openal.AL10.alEnable(target);
    }

    public final void alDisable(int target) {
        org.lwjgl.openal.AL10.alDisable(target);
    }

    public final boolean alIsEnabled(int target) {
        return org.lwjgl.openal.AL10.alIsEnabled(target);
    }

    public final boolean alGetBoolean(int paramName) {
        return org.lwjgl.openal.AL10.alGetBoolean(paramName);
    }

    public final int alGetInteger(int paramName) {
        return org.lwjgl.openal.AL10.alGetInteger(paramName);
    }

    public final float alGetFloat(int paramName) {
        return org.lwjgl.openal.AL10.alGetFloat(paramName);
    }

    public final double alGetDouble(int paramName) {
        return org.lwjgl.openal.AL10.alGetDouble(paramName);
    }

    public final void alGetBooleanv(int paramName, ByteBuffer dest) {
        org.lwjgl.openal.AL10.alGetBooleanv(paramName, dest);
    }

    public final void alGetIntegerv(int paramName, IntBuffer dest) {
        org.lwjgl.openal.AL10.alGetIntegerv(paramName, dest);
    }

    public final void alGetFloatv(int paramName, FloatBuffer dest) {
        org.lwjgl.openal.AL10.alGetFloatv(paramName, dest);
    }

    public final void alGetDoublev(int paramName, DoubleBuffer dest) {
        org.lwjgl.openal.AL10.alGetDoublev(paramName, dest);
    }

    public final String alGetString(int paramName) {
        return org.lwjgl.openal.AL10.alGetString(paramName);
    }

    public final void alDistanceModel(int modelName) {
        org.lwjgl.openal.AL10.alDistanceModel(modelName);
    }

    public final void alDopplerFactor(float dopplerFactor) {
        org.lwjgl.openal.AL10.alDopplerFactor(dopplerFactor);
    }

    public final void alDopplerVelocity(float dopplerVelocity) {
        org.lwjgl.openal.AL10.alDopplerVelocity(dopplerVelocity);
    }

    public final void alListenerf(int paramName, float value) {
        org.lwjgl.openal.AL10.alListenerf(paramName, value);
    }

    public final void alListeneri(int paramName, int values) {
        org.lwjgl.openal.AL10.alListeneri(paramName, values);
    }

    public final void alListener3f(int paramName, float value1, float value2, float value3) {
        org.lwjgl.openal.AL10.alListener3f(paramName, value1, value2, value3);
    }

    public final void alListenerfv(int paramName, FloatBuffer values) {
        org.lwjgl.openal.AL10.alListenerfv(paramName, values);
    }

    public final void alGetListenerf(int paramName, FloatBuffer value) {
        org.lwjgl.openal.AL10.alGetListenerf(paramName, value);
    }

    public final float alGetListenerf(int paramName) {
        return org.lwjgl.openal.AL10.alGetListenerf(paramName);
    }

    public final void alGetListeneri(int paramName, IntBuffer value) {
        org.lwjgl.openal.AL10.alGetListeneri(paramName, value);
    }

    public final int alGetListeneri(int paramName) {
        return org.lwjgl.openal.AL10.alGetListeneri(paramName);
    }

    public final void alGetListener3f(int paramName, FloatBuffer value1, FloatBuffer value2, FloatBuffer value3) {
        org.lwjgl.openal.AL10.alGetListener3f(paramName, value1, value2, value3);
    }

    public final void alGetListenerfv(int paramName, FloatBuffer values) {
        org.lwjgl.openal.AL10.alGetListenerfv(paramName, values);
    }

    public final void alGenSources(IntBuffer srcNames) {
        org.lwjgl.openal.AL10.alGenSources(srcNames);
    }

    public final int alGenSources() {
        return org.lwjgl.openal.AL10.alGenSources();
    }

    public final void alDeleteSources(IntBuffer sources) {
        org.lwjgl.openal.AL10.alDeleteSources(sources);
    }

    public final void alDeleteSources(int source) {
        org.lwjgl.openal.AL10.alDeleteSources(source);
    }

    public final boolean alIsSource(int sourceName) {
        return org.lwjgl.openal.AL10.alIsSource(sourceName);
    }

    public final void alSourcef(int source, int param, float value) {
        org.lwjgl.openal.AL10.alSourcef(source, param, value);
    }

    public final void alSource3f(int source, int param, float v1, float v2, float v3) {
        org.lwjgl.openal.AL10.alSource3f(source, param, v1, v2, v3);
    }

    public final void alSourcefv(int source, int param, FloatBuffer values) {
        org.lwjgl.openal.AL10.alSourcefv(source, param, values);
    }

    public final void alSourcei(int source, int param, int value) {
        org.lwjgl.openal.AL10.alSourcei(source, param, value);
    }

    public final void alGetSourcef(int source, int param, FloatBuffer value) {
        org.lwjgl.openal.AL10.alGetSourcef(source, param, value);
    }

    public final float alGetSourcef(int source, int param) {
        return org.lwjgl.openal.AL10.alGetSourcef(source, param);
    }

    public final void alGetSource3f(int source, int param, FloatBuffer v1, FloatBuffer v2, FloatBuffer v3) {
        org.lwjgl.openal.AL10.alGetSource3f(source, param, v1, v2, v3);
    }

    public final void alGetSourcefv(int source, int param, FloatBuffer values) {
        org.lwjgl.openal.AL10.alGetSourcefv(source, param, values);
    }

    public final void alGetSourcei(int source, int param, IntBuffer value) {
        org.lwjgl.openal.AL10.alGetSourcei(source, param, value);
    }

    public final int alGetSourcei(int source, int param) {
        return org.lwjgl.openal.AL10.alGetSourcei(source, param);
    }

    public final void alGetSourceiv(int source, int param, IntBuffer values) {
        org.lwjgl.openal.AL10.alGetSourceiv(source, param, values);
    }

    public final void alSourceQueueBuffers(int sourceName, IntBuffer bufferNames) {
        org.lwjgl.openal.AL10.alSourceQueueBuffers(sourceName, bufferNames);
    }

    public final void alSourceQueueBuffers(int sourceName, int bufferName) {
        org.lwjgl.openal.AL10.alSourceQueueBuffers(sourceName, bufferName);
    }

    public final void alSourceUnqueueBuffers(int sourceName, IntBuffer bufferNames) {
        org.lwjgl.openal.AL10.alSourceUnqueueBuffers(sourceName, bufferNames);
    }

    public final int alSourceUnqueueBuffers(int sourceName) {
        return org.lwjgl.openal.AL10.alSourceUnqueueBuffers(sourceName);
    }

    public final void alSourcePlay(int source) {
        org.lwjgl.openal.AL10.alSourcePlay(source);
    }

    public final void alSourcePause(int source) {
        org.lwjgl.openal.AL10.alSourcePause(source);
    }

    public final void alSourceStop(int source) {
        org.lwjgl.openal.AL10.alSourceStop(source);
    }

    public final void alSourceRewind(int source) {
        org.lwjgl.openal.AL10.alSourceRewind(source);
    }

    public final void alSourcePlayv(IntBuffer sources) {
        org.lwjgl.openal.AL10.alSourcePlayv(sources);
    }

    public final void alSourcePausev(IntBuffer sources) {
        org.lwjgl.openal.AL10.alSourcePausev(sources);
    }

    public final void alSourceStopv(IntBuffer sources) {
        org.lwjgl.openal.AL10.alSourceStopv(sources);
    }

    public final void alSourceRewindv(IntBuffer sources) {
        org.lwjgl.openal.AL10.alSourceRewindv(sources);
    }

    public final void alGenBuffers(IntBuffer bufferNames) {
        org.lwjgl.openal.AL10.alGenBuffers(bufferNames);
    }

    public final int alGenBuffers() {
        return org.lwjgl.openal.AL10.alGenBuffers();
    }

    public final void alDeleteBuffers(IntBuffer bufferNames) {
        org.lwjgl.openal.AL10.alDeleteBuffers(bufferNames);
    }

    public final void alDeleteBuffers(int bufferName) {
        org.lwjgl.openal.AL10.alDeleteBuffers(bufferName);
    }

    public final boolean alIsBuffer(int bufferName) {
        return org.lwjgl.openal.AL10.alIsBuffer(bufferName);
    }

    public final void alGetBufferf(int bufferName, int paramName, FloatBuffer value) {
        org.lwjgl.openal.AL10.alGetBufferf(bufferName, paramName, value);
    }

    public final float alGetBufferf(int bufferName, int paramName) {
        return org.lwjgl.openal.AL10.alGetBufferf(bufferName, paramName);
    }

    public final void alGetBufferi(int bufferName, int paramName, IntBuffer value) {
        org.lwjgl.openal.AL10.alGetBufferi(bufferName, paramName, value);
    }

    public final int alGetBufferi(int bufferName, int paramName) {
        return org.lwjgl.openal.AL10.alGetBufferi(bufferName, paramName);
    }

    public final void alBufferData(int bufferName, int format, ByteBuffer data, int frequency) {
        org.lwjgl.openal.AL10.alBufferData(bufferName, format, data, frequency);
    }

    public final void alBufferData(int bufferName, int format, ShortBuffer data, int frequency) {
        org.lwjgl.openal.AL10.alBufferData(bufferName, format, data, frequency);
    }

    public final void alBufferData(int bufferName, int format, IntBuffer data, int frequency) {
        org.lwjgl.openal.AL10.alBufferData(bufferName, format, data, frequency);
    }

    public final void alBufferData(int bufferName, int format, FloatBuffer data, int frequency) {
        org.lwjgl.openal.AL10.alBufferData(bufferName, format, data, frequency);
    }

    public final int alGetEnumValue(ByteBuffer enumName) {
        return org.lwjgl.openal.AL10.alGetEnumValue(enumName);
    }

    public final int alGetEnumValue(CharSequence enumName) {
        return org.lwjgl.openal.AL10.alGetEnumValue(enumName);
    }

    public final long alGetProcAddress(ByteBuffer funcName) {
        return org.lwjgl.openal.AL10.alGetProcAddress(funcName);
    }

    public final long alGetProcAddress(CharSequence funcName) {
        return org.lwjgl.openal.AL10.alGetProcAddress(funcName);
    }

    public final boolean alIsExtensionPresent(ByteBuffer extName) {
        return org.lwjgl.openal.AL10.alIsExtensionPresent(extName);
    }

    public final boolean alIsExtensionPresent(CharSequence extName) {
        return org.lwjgl.openal.AL10.alIsExtensionPresent(extName);
    }

    public final void alGetIntegerv(int paramName, int[] dest) {
        org.lwjgl.openal.AL10.alGetIntegerv(paramName, dest);
    }

    public final void alGetFloatv(int paramName, float[] dest) {
        org.lwjgl.openal.AL10.alGetFloatv(paramName, dest);
    }

    public final void alGetDoublev(int paramName, double[] dest) {
        org.lwjgl.openal.AL10.alGetDoublev(paramName, dest);
    }

    public final void alListenerfv(int paramName, float[] values) {
        org.lwjgl.openal.AL10.alListenerfv(paramName, values);
    }

    public final void alGetListenerf(int paramName, float[] value) {
        org.lwjgl.openal.AL10.alGetListenerf(paramName, value);
    }

    public final void alGetListeneri(int paramName, int[] value) {
        org.lwjgl.openal.AL10.alGetListeneri(paramName, value);
    }

    public final void alGetListener3f(int paramName, float[] value1, float[] value2, float[] value3) {
        org.lwjgl.openal.AL10.alGetListener3f(paramName, value1, value2, value3);
    }

    public final void alGetListenerfv(int paramName, float[] values) {
        org.lwjgl.openal.AL10.alGetListenerfv(paramName, values);
    }

    public final void alGenSources(int[] srcNames) {
        org.lwjgl.openal.AL10.alGenSources(srcNames);
    }

    public final void alDeleteSources(int[] sources) {
        org.lwjgl.openal.AL10.alDeleteSources(sources);
    }

    public final void alSourcefv(int source, int param, float[] values) {
        org.lwjgl.openal.AL10.alSourcefv(source, param, values);
    }

    public final void alGetSourcef(int source, int param, float[] value) {
        org.lwjgl.openal.AL10.alGetSourcef(source, param, value);
    }

    public final void alGetSource3f(int source, int param, float[] v1, float[] v2, float[] v3) {
        org.lwjgl.openal.AL10.alGetSource3f(source, param, v1, v2, v3);
    }

    public final void alGetSourcefv(int source, int param, float[] values) {
        org.lwjgl.openal.AL10.alGetSourcefv(source, param, values);
    }

    public final void alGetSourcei(int source, int param, int[] value) {
        org.lwjgl.openal.AL10.alGetSourcei(source, param, value);
    }

    public final void alGetSourceiv(int source, int param, int[] values) {
        org.lwjgl.openal.AL10.alGetSourceiv(source, param, values);
    }

    public final void alSourceQueueBuffers(int sourceName, int[] bufferNames) {
        org.lwjgl.openal.AL10.alSourceQueueBuffers(sourceName, bufferNames);
    }

    public final void alSourceUnqueueBuffers(int sourceName, int[] bufferNames) {
        org.lwjgl.openal.AL10.alSourceUnqueueBuffers(sourceName, bufferNames);
    }

    public final void alSourcePlayv(int[] sources) {
        org.lwjgl.openal.AL10.alSourcePlayv(sources);
    }

    public final void alSourcePausev(int[] sources) {
        org.lwjgl.openal.AL10.alSourcePausev(sources);
    }

    public final void alSourceStopv(int[] sources) {
        org.lwjgl.openal.AL10.alSourceStopv(sources);
    }

    public final void alSourceRewindv(int[] sources) {
        org.lwjgl.openal.AL10.alSourceRewindv(sources);
    }

    public final void alGenBuffers(int[] bufferNames) {
        org.lwjgl.openal.AL10.alGenBuffers(bufferNames);
    }

    public final void alDeleteBuffers(int[] bufferNames) {
        org.lwjgl.openal.AL10.alDeleteBuffers(bufferNames);
    }

    public final void alGetBufferf(int bufferName, int paramName, float[] value) {
        org.lwjgl.openal.AL10.alGetBufferf(bufferName, paramName, value);
    }

    public final void alGetBufferi(int bufferName, int paramName, int[] value) {
        org.lwjgl.openal.AL10.alGetBufferi(bufferName, paramName, value);
    }

    public final void alBufferData(int bufferName, int format, short[] data, int frequency) {
        org.lwjgl.openal.AL10.alBufferData(bufferName, format, data, frequency);
    }

    public final void alBufferData(int bufferName, int format, int[] data, int frequency) {
        org.lwjgl.openal.AL10.alBufferData(bufferName, format, data, frequency);
    }

    public final void alBufferData(int bufferName, int format, float[] data, int frequency) {
        org.lwjgl.openal.AL10.alBufferData(bufferName, format, data, frequency);
    }


}
