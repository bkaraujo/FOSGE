package br.fosge.runtime.platform.binding.opengl.impl;

import br.fosge.runtime.platform.binding.opengl.api.GL20;
import br.fosge.runtime.platform.binding.opengl.api.GL21;
import org.lwjgl.PointerBuffer;

import java.nio.*;

public class GL2x extends GL1x implements GL20, GL21 {

    public final int glCreateProgram() {
        return org.lwjgl.opengl.GL20.glCreateProgram();
    }

    public final void glDeleteProgram(int program) {
        org.lwjgl.opengl.GL20.glDeleteProgram(program);
    }

    public final boolean glIsProgram(int program) {
        return org.lwjgl.opengl.GL20.glIsProgram(program);
    }

    public final int glCreateShader(int type) {
        return org.lwjgl.opengl.GL20.glCreateShader(type);
    }

    public final void glDeleteShader(int shader) {
        org.lwjgl.opengl.GL20.glDeleteShader(shader);
    }

    public final boolean glIsShader(int shader) {
        return org.lwjgl.opengl.GL20.glIsShader(shader);
    }

    public final void glAttachShader(int program, int shader) {
        org.lwjgl.opengl.GL20.glAttachShader(program, shader);
    }

    public final void glDetachShader(int program, int shader) {
        org.lwjgl.opengl.GL20.glDetachShader(program, shader);
    }

    public final void glShaderSource(int shader, PointerBuffer strings, IntBuffer length) {
        org.lwjgl.opengl.GL20.glShaderSource(shader, strings, length);
    }

    public final void glShaderSource(int shader, CharSequence[] strings) {
        org.lwjgl.opengl.GL20.glShaderSource(shader, strings);
    }

    public final void glShaderSource(int shader, CharSequence string) {
        org.lwjgl.opengl.GL20.glShaderSource(shader, string);
    }

    public final void glCompileShader(int shader) {
        org.lwjgl.opengl.GL20.glCompileShader(shader);
    }

    public final void glLinkProgram(int program) {
        org.lwjgl.opengl.GL20.glLinkProgram(program);
    }

    public final void glUseProgram(int program) {
        org.lwjgl.opengl.GL20.glUseProgram(program);
    }

    public final void glValidateProgram(int program) {
        org.lwjgl.opengl.GL20.glValidateProgram(program);
    }

    public final void glUniform1f(int location, float v0) {
        org.lwjgl.opengl.GL20.glUniform1f(location, v0);
    }

    public final void glUniform2f(int location, float v0, float v1) {
        org.lwjgl.opengl.GL20.glUniform2f(location, v0, v1);
    }

    public final void glUniform3f(int location, float v0, float v1, float v2) {
        org.lwjgl.opengl.GL20.glUniform3f(location, v0, v1, v2);
    }

    public final void glUniform4f(int location, float v0, float v1, float v2, float v3) {
        org.lwjgl.opengl.GL20.glUniform4f(location, v0, v1, v2, v3);
    }

    public final void glUniform1i(int location, int v0) {
        org.lwjgl.opengl.GL20.glUniform1i(location, v0);
    }

    public final void glUniform2i(int location, int v0, int v1) {
        org.lwjgl.opengl.GL20.glUniform2i(location, v0, v1);
    }

    public final void glUniform3i(int location, int v0, int v1, int v2) {
        org.lwjgl.opengl.GL20.glUniform3i(location, v0, v1, v2);
    }

    public final void glUniform4i(int location, int v0, int v1, int v2, int v3) {
        org.lwjgl.opengl.GL20.glUniform4i(location, v0, v1, v2, v3);
    }

    public final void glUniform1fv(int location, FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniform1fv(location, value);
    }

    public final void glUniform2fv(int location, FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniform2fv(location, value);
    }

    public final void glUniform3fv(int location, FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniform3fv(location, value);
    }

    public final void glUniform4fv(int location, FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniform4fv(location, value);
    }

    public final void glUniform1iv(int location, IntBuffer value) {
        org.lwjgl.opengl.GL20.glUniform1iv(location, value);
    }

    public final void glUniform2iv(int location, IntBuffer value) {
        org.lwjgl.opengl.GL20.glUniform2iv(location, value);
    }

    public final void glUniform3iv(int location, IntBuffer value) {
        org.lwjgl.opengl.GL20.glUniform3iv(location, value);
    }

    public final void glUniform4iv(int location, IntBuffer value) {
        org.lwjgl.opengl.GL20.glUniform4iv(location, value);
    }

    public final void glUniformMatrix2fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniformMatrix2fv(location, transpose, value);
    }

    public final void glUniformMatrix3fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniformMatrix3fv(location, transpose, value);
    }

    public final void glUniformMatrix4fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniformMatrix4fv(location, transpose, value);
    }

    public final void glGetShaderiv(int shader, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL20.glGetShaderiv(shader, pname, params);
    }

    public final int glGetShaderi(int shader, int pname) {
        return org.lwjgl.opengl.GL20.glGetShaderi(shader, pname);
    }

    public final void glGetProgramiv(int program, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL20.glGetProgramiv(program, pname, params);
    }

    public final int glGetProgrami(int program, int pname) {
        return org.lwjgl.opengl.GL20.glGetProgrami(program, pname);
    }

    public final void glGetShaderInfoLog(int shader, IntBuffer length, ByteBuffer infoLog) {
        org.lwjgl.opengl.GL20.glGetShaderInfoLog(shader, length, infoLog);
    }

    public final String glGetShaderInfoLog(int shader, int maxLength) {
        return org.lwjgl.opengl.GL20.glGetShaderInfoLog(shader, maxLength);
    }

    public final String glGetShaderInfoLog(int shader) {
        return org.lwjgl.opengl.GL20.glGetShaderInfoLog(shader);
    }

    public final void glGetProgramInfoLog(int program, IntBuffer length, ByteBuffer infoLog) {
        org.lwjgl.opengl.GL20.glGetProgramInfoLog(program, length, infoLog);
    }

    public final String glGetProgramInfoLog(int program, int maxLength) {
        return org.lwjgl.opengl.GL20.glGetProgramInfoLog(program, maxLength);
    }

    public final String glGetProgramInfoLog(int program) {
        return org.lwjgl.opengl.GL20.glGetProgramInfoLog(program);
    }

    public final void glGetAttachedShaders(int program, IntBuffer count, IntBuffer shaders) {
        org.lwjgl.opengl.GL20.glGetAttachedShaders(program, count, shaders);
    }

    public final int glGetUniformLocation(int program, ByteBuffer name) {
        return org.lwjgl.opengl.GL20.glGetUniformLocation(program, name);
    }

    public final int glGetUniformLocation(int program, CharSequence name) {
        return org.lwjgl.opengl.GL20.glGetUniformLocation(program, name);
    }

    public final void glGetActiveUniform(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
        org.lwjgl.opengl.GL20.glGetActiveUniform(program, index, length, size, type, name);
    }

    public final String glGetActiveUniform(int program, int index, int maxLength, IntBuffer size, IntBuffer type) {
        return org.lwjgl.opengl.GL20.glGetActiveUniform(program, index, maxLength, size, type);
    }

    public final String glGetActiveUniform(int program, int index, IntBuffer size, IntBuffer type) {
        return org.lwjgl.opengl.GL20.glGetActiveUniform(program, index, size, type);
    }

    public final void glGetUniformfv(int program, int location, FloatBuffer params) {
        org.lwjgl.opengl.GL20.glGetUniformfv(program, location, params);
    }

    public final float glGetUniformf(int program, int location) {
        return org.lwjgl.opengl.GL20.glGetUniformf(program, location);
    }

    public final void glGetUniformiv(int program, int location, IntBuffer params) {
        org.lwjgl.opengl.GL20.glGetUniformiv(program, location, params);
    }

    public final int glGetUniformi(int program, int location) {
        return org.lwjgl.opengl.GL20.glGetUniformi(program, location);
    }

    public final void glGetShaderSource(int shader, IntBuffer length, ByteBuffer source) {
        org.lwjgl.opengl.GL20.glGetShaderSource(shader, length, source);
    }

    public final String glGetShaderSource(int shader, int maxLength) {
        return org.lwjgl.opengl.GL20.glGetShaderSource(shader, maxLength);
    }

    public final String glGetShaderSource(int shader) {
        return org.lwjgl.opengl.GL20.glGetShaderSource(shader);
    }

    public final void glVertexAttrib1f(int index, float v0) {
        org.lwjgl.opengl.GL20.glVertexAttrib1f(index, v0);
    }

    public final void glVertexAttrib1s(int index, short v0) {
        org.lwjgl.opengl.GL20.glVertexAttrib1s(index, v0);
    }

    public final void glVertexAttrib1d(int index, double v0) {
        org.lwjgl.opengl.GL20.glVertexAttrib1d(index, v0);
    }

    public final void glVertexAttrib2f(int index, float v0, float v1) {
        org.lwjgl.opengl.GL20.glVertexAttrib2f(index, v0, v1);
    }

    public final void glVertexAttrib2s(int index, short v0, short v1) {
        org.lwjgl.opengl.GL20.glVertexAttrib2s(index, v0, v1);
    }

    public final void glVertexAttrib2d(int index, double v0, double v1) {
        org.lwjgl.opengl.GL20.glVertexAttrib2d(index, v0, v1);
    }

    public final void glVertexAttrib3f(int index, float v0, float v1, float v2) {
        org.lwjgl.opengl.GL20.glVertexAttrib3f(index, v0, v1, v2);
    }

    public final void glVertexAttrib3s(int index, short v0, short v1, short v2) {
        org.lwjgl.opengl.GL20.glVertexAttrib3s(index, v0, v1, v2);
    }

    public final void glVertexAttrib3d(int index, double v0, double v1, double v2) {
        org.lwjgl.opengl.GL20.glVertexAttrib3d(index, v0, v1, v2);
    }

    public final void glVertexAttrib4f(int index, float v0, float v1, float v2, float v3) {
        org.lwjgl.opengl.GL20.glVertexAttrib4f(index, v0, v1, v2, v3);
    }

    public final void glVertexAttrib4s(int index, short v0, short v1, short v2, short v3) {
        org.lwjgl.opengl.GL20.glVertexAttrib4s(index, v0, v1, v2, v3);
    }

    public final void glVertexAttrib4d(int index, double v0, double v1, double v2, double v3) {
        org.lwjgl.opengl.GL20.glVertexAttrib4d(index, v0, v1, v2, v3);
    }

    public final void glVertexAttrib4Nub(int index, byte x, byte y, byte z, byte w) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nub(index, x, y, z, w);
    }

    public final void glVertexAttrib1fv(int index, FloatBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib1fv(index, v);
    }

    public final void glVertexAttrib1sv(int index, ShortBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib1sv(index, v);
    }

    public final void glVertexAttrib1dv(int index, DoubleBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib1dv(index, v);
    }

    public final void glVertexAttrib2fv(int index, FloatBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib2fv(index, v);
    }

    public final void glVertexAttrib2sv(int index, ShortBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib2sv(index, v);
    }

    public final void glVertexAttrib2dv(int index, DoubleBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib2dv(index, v);
    }

    public final void glVertexAttrib3fv(int index, FloatBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib3fv(index, v);
    }

    public final void glVertexAttrib3sv(int index, ShortBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib3sv(index, v);
    }

    public final void glVertexAttrib3dv(int index, DoubleBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib3dv(index, v);
    }

    public final void glVertexAttrib4fv(int index, FloatBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4fv(index, v);
    }

    public final void glVertexAttrib4sv(int index, ShortBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4sv(index, v);
    }

    public final void glVertexAttrib4dv(int index, DoubleBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4dv(index, v);
    }

    public final void glVertexAttrib4iv(int index, IntBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4iv(index, v);
    }

    public final void glVertexAttrib4bv(int index, ByteBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4bv(index, v);
    }

    public final void glVertexAttrib4ubv(int index, ByteBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4ubv(index, v);
    }

    public final void glVertexAttrib4usv(int index, ShortBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4usv(index, v);
    }

    public final void glVertexAttrib4uiv(int index, IntBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4uiv(index, v);
    }

    public final void glVertexAttrib4Nbv(int index, ByteBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nbv(index, v);
    }

    public final void glVertexAttrib4Nsv(int index, ShortBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nsv(index, v);
    }

    public final void glVertexAttrib4Niv(int index, IntBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Niv(index, v);
    }

    public final void glVertexAttrib4Nubv(int index, ByteBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nubv(index, v);
    }

    public final void glVertexAttrib4Nusv(int index, ShortBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nusv(index, v);
    }

    public final void glVertexAttrib4Nuiv(int index, IntBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nuiv(index, v);
    }

    public final void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    public final void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer) {
        org.lwjgl.opengl.GL20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    public final void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ShortBuffer pointer) {
        org.lwjgl.opengl.GL20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    public final void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, IntBuffer pointer) {
        org.lwjgl.opengl.GL20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    public final void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, FloatBuffer pointer) {
        org.lwjgl.opengl.GL20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    public final void glEnableVertexAttribArray(int index) {
        org.lwjgl.opengl.GL20.glEnableVertexAttribArray(index);
    }

    public final void glDisableVertexAttribArray(int index) {
        org.lwjgl.opengl.GL20.glDisableVertexAttribArray(index);
    }

    public final void glBindAttribLocation(int program, int index, ByteBuffer name) {
        org.lwjgl.opengl.GL20.glBindAttribLocation(program, index, name);
    }

    public final void glBindAttribLocation(int program, int index, CharSequence name) {
        org.lwjgl.opengl.GL20.glBindAttribLocation(program, index, name);
    }

    public final void glGetActiveAttrib(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
        org.lwjgl.opengl.GL20.glGetActiveAttrib(program, index, length, size, type, name);
    }

    public final String glGetActiveAttrib(int program, int index, int maxLength, IntBuffer size, IntBuffer type) {
        return org.lwjgl.opengl.GL20.glGetActiveAttrib(program, index, maxLength, size, type);
    }

    public final String glGetActiveAttrib(int program, int index, IntBuffer size, IntBuffer type) {
        return org.lwjgl.opengl.GL20.glGetActiveAttrib(program, index, size, type);
    }

    public final int glGetAttribLocation(int program, ByteBuffer name) {
        return org.lwjgl.opengl.GL20.glGetAttribLocation(program, name);
    }

    public final int glGetAttribLocation(int program, CharSequence name) {
        return org.lwjgl.opengl.GL20.glGetAttribLocation(program, name);
    }

    public final void glGetVertexAttribiv(int index, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL20.glGetVertexAttribiv(index, pname, params);
    }

    public final int glGetVertexAttribi(int index, int pname) {
        return org.lwjgl.opengl.GL20.glGetVertexAttribi(index, pname);
    }

    public final void glGetVertexAttribfv(int index, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL20.glGetVertexAttribfv(index, pname, params);
    }

    public final void glGetVertexAttribdv(int index, int pname, DoubleBuffer params) {
        org.lwjgl.opengl.GL20.glGetVertexAttribdv(index, pname, params);
    }

    public final void glGetVertexAttribPointerv(int index, int pname, PointerBuffer pointer) {
        org.lwjgl.opengl.GL20.glGetVertexAttribPointerv(index, pname, pointer);
    }

    public final long glGetVertexAttribPointer(int index, int pname) {
        return org.lwjgl.opengl.GL20.glGetVertexAttribPointer(index, pname);
    }

    public final void glDrawBuffers(IntBuffer bufs) {
        org.lwjgl.opengl.GL20.glDrawBuffers(bufs);
    }

    public final void glDrawBuffers(int buf) {
        org.lwjgl.opengl.GL20.glDrawBuffers(buf);
    }

    public final void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
        org.lwjgl.opengl.GL20.glBlendEquationSeparate(modeRGB, modeAlpha);
    }

    public final void glStencilOpSeparate(int face, int sfail, int dpfail, int dppass) {
        org.lwjgl.opengl.GL20.glStencilOpSeparate(face, sfail, dpfail, dppass);
    }

    public final void glStencilFuncSeparate(int face, int func, int ref, int mask) {
        org.lwjgl.opengl.GL20.glStencilFuncSeparate(face, func, ref, mask);
    }

    public final void glStencilMaskSeparate(int face, int mask) {
        org.lwjgl.opengl.GL20.glStencilMaskSeparate(face, mask);
    }

    public final void glShaderSource(int shader, PointerBuffer strings, int[] length) {
        org.lwjgl.opengl.GL20.glShaderSource(shader, strings, length);
    }

    public final void glUniform1fv(int location, float[] value) {
        org.lwjgl.opengl.GL20.glUniform1fv(location, value);
    }

    public final void glUniform2fv(int location, float[] value) {
        org.lwjgl.opengl.GL20.glUniform2fv(location, value);
    }

    public final void glUniform3fv(int location, float[] value) {
        org.lwjgl.opengl.GL20.glUniform3fv(location, value);
    }

    public final void glUniform4fv(int location, float[] value) {
        org.lwjgl.opengl.GL20.glUniform4fv(location, value);
    }

    public final void glUniform1iv(int location, int[] value) {
        org.lwjgl.opengl.GL20.glUniform1iv(location, value);
    }

    public final void glUniform2iv(int location, int[] value) {
        org.lwjgl.opengl.GL20.glUniform2iv(location, value);
    }

    public final void glUniform3iv(int location, int[] value) {
        org.lwjgl.opengl.GL20.glUniform3iv(location, value);
    }

    public final void glUniform4iv(int location, int[] value) {
        org.lwjgl.opengl.GL20.glUniform4iv(location, value);
    }

    public final void glUniformMatrix2fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL20.glUniformMatrix2fv(location, transpose, value);
    }

    public final void glUniformMatrix3fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL20.glUniformMatrix3fv(location, transpose, value);
    }

    public final void glUniformMatrix4fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL20.glUniformMatrix4fv(location, transpose, value);
    }

    public final void glGetShaderiv(int shader, int pname, int[] params) {
        org.lwjgl.opengl.GL20.glGetShaderiv(shader, pname, params);
    }

    public final void glGetProgramiv(int program, int pname, int[] params) {
        org.lwjgl.opengl.GL20.glGetProgramiv(program, pname, params);
    }

    public final void glGetShaderInfoLog(int shader, int[] length, ByteBuffer infoLog) {
        org.lwjgl.opengl.GL20.glGetShaderInfoLog(shader, length, infoLog);
    }

    public final void glGetProgramInfoLog(int program, int[] length, ByteBuffer infoLog) {
        org.lwjgl.opengl.GL20.glGetProgramInfoLog(program, length, infoLog);
    }

    public final void glGetAttachedShaders(int program, int[] count, int[] shaders) {
        org.lwjgl.opengl.GL20.glGetAttachedShaders(program, count, shaders);
    }

    public final void glGetActiveUniform(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name) {
        org.lwjgl.opengl.GL20.glGetActiveUniform(program, index, length, size, type, name);
    }

    public final void glGetUniformfv(int program, int location, float[] params) {
        org.lwjgl.opengl.GL20.glGetUniformfv(program, location, params);
    }

    public final void glGetUniformiv(int program, int location, int[] params) {
        org.lwjgl.opengl.GL20.glGetUniformiv(program, location, params);
    }

    public final void glGetShaderSource(int shader, int[] length, ByteBuffer source) {
        org.lwjgl.opengl.GL20.glGetShaderSource(shader, length, source);
    }

    public final void glVertexAttrib1fv(int index, float[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib1fv(index, v);
    }

    public final void glVertexAttrib1sv(int index, short[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib1sv(index, v);
    }

    public final void glVertexAttrib1dv(int index, double[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib1dv(index, v);
    }

    public final void glVertexAttrib2fv(int index, float[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib2fv(index, v);
    }

    public final void glVertexAttrib2sv(int index, short[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib2sv(index, v);
    }

    public final void glVertexAttrib2dv(int index, double[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib2dv(index, v);
    }

    public final void glVertexAttrib3fv(int index, float[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib3fv(index, v);
    }

    public final void glVertexAttrib3sv(int index, short[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib3sv(index, v);
    }

    public final void glVertexAttrib3dv(int index, double[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib3dv(index, v);
    }

    public final void glVertexAttrib4fv(int index, float[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4fv(index, v);
    }

    public final void glVertexAttrib4sv(int index, short[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4sv(index, v);
    }

    public final void glVertexAttrib4dv(int index, double[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4dv(index, v);
    }

    public final void glVertexAttrib4iv(int index, int[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4iv(index, v);
    }

    public final void glVertexAttrib4usv(int index, short[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4usv(index, v);
    }

    public final void glVertexAttrib4uiv(int index, int[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4uiv(index, v);
    }

    public final void glVertexAttrib4Nsv(int index, short[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nsv(index, v);
    }

    public final void glVertexAttrib4Niv(int index, int[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Niv(index, v);
    }

    public final void glVertexAttrib4Nusv(int index, short[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nusv(index, v);
    }

    public final void glVertexAttrib4Nuiv(int index, int[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nuiv(index, v);
    }

    public final void glGetActiveAttrib(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name) {
        org.lwjgl.opengl.GL20.glGetActiveAttrib(program, index, length, size, type, name);
    }

    public final void glGetVertexAttribiv(int index, int pname, int[] params) {
        org.lwjgl.opengl.GL20.glGetVertexAttribiv(index, pname, params);
    }

    public final void glGetVertexAttribfv(int index, int pname, float[] params) {
        org.lwjgl.opengl.GL20.glGetVertexAttribfv(index, pname, params);
    }

    public final void glGetVertexAttribdv(int index, int pname, double[] params) {
        org.lwjgl.opengl.GL20.glGetVertexAttribdv(index, pname, params);
    }

    public final void glDrawBuffers(int[] bufs) {
        org.lwjgl.opengl.GL20.glDrawBuffers(bufs);
    }

    public final void glUniformMatrix2x3fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL21.glUniformMatrix2x3fv(location, transpose, value);
    }

    public final void glUniformMatrix3x2fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL21.glUniformMatrix3x2fv(location, transpose, value);
    }

    public final void glUniformMatrix2x4fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL21.glUniformMatrix2x4fv(location, transpose, value);
    }

    public final void glUniformMatrix4x2fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL21.glUniformMatrix4x2fv(location, transpose, value);
    }

    public final void glUniformMatrix3x4fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL21.glUniformMatrix3x4fv(location, transpose, value);
    }

    public final void glUniformMatrix4x3fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL21.glUniformMatrix4x3fv(location, transpose, value);
    }

    public final void glUniformMatrix2x3fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL21.glUniformMatrix2x3fv(location, transpose, value);
    }

    public final void glUniformMatrix3x2fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL21.glUniformMatrix3x2fv(location, transpose, value);
    }

    public final void glUniformMatrix2x4fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL21.glUniformMatrix2x4fv(location, transpose, value);
    }

    public final void glUniformMatrix4x2fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL21.glUniformMatrix4x2fv(location, transpose, value);
    }

    public final void glUniformMatrix3x4fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL21.glUniformMatrix3x4fv(location, transpose, value);
    }

    public final void glUniformMatrix4x3fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL21.glUniformMatrix4x3fv(location, transpose, value);
    }

}
