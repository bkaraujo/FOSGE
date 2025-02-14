package br.fosge.runtime.platform.binding.opengl.impl;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.commons.logger.LogLevel;
import br.fosge.runtime.platform.binding.opengl.api.*;
import org.lwjgl.PointerBuffer;

import java.nio.*;

import static br.fosge.runtime.platform.binding.opengl.GLState.blendFunctions;
import static br.fosge.runtime.platform.binding.opengl.GLState.enabled;

public class GL1x implements GL11, GL12, GL13, GL14, GL15 {

    public final void glEnable(int target) {
        if (enabled.containsKey(target) && enabled.get(target)) {
            Logger.warn("Unnecessary glEnable(%d)", target);
            Logger.stackTrace(LogLevel.WARN);
            return;
        }

        org.lwjgl.opengl.GL11.glEnable(target);
        enabled.put(target, true);
    }

    public final void glDisable(int target) {
        if (enabled.containsKey(target) && !enabled.get(target)) {
            Logger.warn("Unnecessary glDisable(%d)", target);
            Logger.stackTrace(LogLevel.WARN);
            return;
        }

        org.lwjgl.opengl.GL11.glDisable(target);
        enabled.put(target, false);
    }

    public final void glAccum(int op, float value) {
        org.lwjgl.opengl.GL11.glAccum(op, value);
    }

    public final void glAlphaFunc(int func, float ref) {
        org.lwjgl.opengl.GL11.glAlphaFunc(func, ref);
    }

    public final boolean glAreTexturesResident(IntBuffer textures, ByteBuffer residences) {
        return org.lwjgl.opengl.GL11.glAreTexturesResident(textures, residences);
    }

    public final boolean glAreTexturesResident(int texture, ByteBuffer residences) {
        return org.lwjgl.opengl.GL11.glAreTexturesResident(texture, residences);
    }

    public final void glArrayElement(int i) {
        org.lwjgl.opengl.GL11.glArrayElement(i);
    }

    public final void glBegin(int mode) {
        org.lwjgl.opengl.GL11.glBegin(mode);
    }

    public final void glBindTexture(int target, int texture) {
        org.lwjgl.opengl.GL11.glBindTexture(target, texture);
    }

    public final void glBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, ByteBuffer data) {
        org.lwjgl.opengl.GL11.glBitmap(w, h, xOrig, yOrig, xInc, yInc, data);
    }

    public final void glBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, long data) {
        org.lwjgl.opengl.GL11.glBitmap(w, h, xOrig, yOrig, xInc, yInc, data);
    }

    public final void glBlendFunc(int sfactor, int dfactor) {
        if (blendFunctions[0] == sfactor && blendFunctions[1] == dfactor) {
            Logger.warn("Unnecessary glBlendFunc(%d, %d)", sfactor, dfactor);
            Logger.stackTrace(LogLevel.WARN);
            return;
        }

        org.lwjgl.opengl.GL11.glBlendFunc(sfactor, dfactor);
        blendFunctions[0] = sfactor;
        blendFunctions[1] = dfactor;
    }

    public final void glCallList(int list) {
        org.lwjgl.opengl.GL11.glCallList(list);
    }

    public final void glCallLists(int type, ByteBuffer lists) {
        org.lwjgl.opengl.GL11.glCallLists(type, lists);
    }

    public final void glCallLists(ByteBuffer lists) {
        org.lwjgl.opengl.GL11.glCallLists(lists);
    }

    public final void glCallLists(ShortBuffer lists) {
        org.lwjgl.opengl.GL11.glCallLists(lists);
    }

    public final void glCallLists(IntBuffer lists) {
        org.lwjgl.opengl.GL11.glCallLists(lists);
    }

    public final void glClear(int mask) {
        org.lwjgl.opengl.GL11.glClear(mask);
    }

    public final void glClearAccum(float red, float green, float blue, float alpha) {
        org.lwjgl.opengl.GL11.glClearAccum(red, green, blue, alpha);
    }

    public final void glClearColor(float red, float green, float blue, float alpha) {
        org.lwjgl.opengl.GL11.glClearColor(red, green, blue, alpha);
    }

    public final void glClearDepth(double depth) {
        org.lwjgl.opengl.GL11.glClearDepth(depth);
    }

    public final void glClearIndex(float index) {
        org.lwjgl.opengl.GL11.glClearIndex(index);
    }

    public final void glClearStencil(int s) {
        org.lwjgl.opengl.GL11.glClearStencil(s);
    }

    public final void glClipPlane(int plane, DoubleBuffer equation) {
        org.lwjgl.opengl.GL11.glClipPlane(plane, equation);
    }

    public final void glColor3b(byte red, byte green, byte blue) {
        org.lwjgl.opengl.GL11.glColor3b(red, green, blue);
    }

    public final void glColor3s(short red, short green, short blue) {
        org.lwjgl.opengl.GL11.glColor3s(red, green, blue);
    }

    public final void glColor3i(int red, int green, int blue) {
        org.lwjgl.opengl.GL11.glColor3i(red, green, blue);
    }

    public final void glColor3f(float red, float green, float blue) {
        org.lwjgl.opengl.GL11.glColor3f(red, green, blue);
    }

    public final void glColor3d(double red, double green, double blue) {
        org.lwjgl.opengl.GL11.glColor3d(red, green, blue);
    }

    public final void glColor3ub(byte red, byte green, byte blue) {
        org.lwjgl.opengl.GL11.glColor3ub(red, green, blue);
    }

    public final void glColor3us(short red, short green, short blue) {
        org.lwjgl.opengl.GL11.glColor3us(red, green, blue);
    }

    public final void glColor3ui(int red, int green, int blue) {
        org.lwjgl.opengl.GL11.glColor3ui(red, green, blue);
    }

    public final void glColor3bv(ByteBuffer v) {
        org.lwjgl.opengl.GL11.glColor3bv(v);
    }

    public final void glColor3sv(ShortBuffer v) {
        org.lwjgl.opengl.GL11.glColor3sv(v);
    }

    public final void glColor3iv(IntBuffer v) {
        org.lwjgl.opengl.GL11.glColor3iv(v);
    }

    public final void glColor3fv(FloatBuffer v) {
        org.lwjgl.opengl.GL11.glColor3fv(v);
    }

    public final void glColor3dv(DoubleBuffer v) {
        org.lwjgl.opengl.GL11.glColor3dv(v);
    }

    public final void glColor3ubv(ByteBuffer v) {
        org.lwjgl.opengl.GL11.glColor3ubv(v);
    }

    public final void glColor3usv(ShortBuffer v) {
        org.lwjgl.opengl.GL11.glColor3usv(v);
    }

    public final void glColor3uiv(IntBuffer v) {
        org.lwjgl.opengl.GL11.glColor3uiv(v);
    }

    public final void glColor4b(byte red, byte green, byte blue, byte alpha) {
        org.lwjgl.opengl.GL11.glColor4b(red, green, blue, alpha);
    }

    public final void glColor4s(short red, short green, short blue, short alpha) {
        org.lwjgl.opengl.GL11.glColor4s(red, green, blue, alpha);
    }

    public final void glColor4i(int red, int green, int blue, int alpha) {
        org.lwjgl.opengl.GL11.glColor4i(red, green, blue, alpha);
    }

    public final void glColor4f(float red, float green, float blue, float alpha) {
        org.lwjgl.opengl.GL11.glColor4f(red, green, blue, alpha);
    }

    public final void glColor4d(double red, double green, double blue, double alpha) {
        org.lwjgl.opengl.GL11.glColor4d(red, green, blue, alpha);
    }

    public final void glColor4ub(byte red, byte green, byte blue, byte alpha) {
        org.lwjgl.opengl.GL11.glColor4ub(red, green, blue, alpha);
    }

    public final void glColor4us(short red, short green, short blue, short alpha) {
        org.lwjgl.opengl.GL11.glColor4us(red, green, blue, alpha);
    }

    public final void glColor4ui(int red, int green, int blue, int alpha) {
        org.lwjgl.opengl.GL11.glColor4ui(red, green, blue, alpha);
    }

    public final void glColor4bv(ByteBuffer v) {
        org.lwjgl.opengl.GL11.glColor4bv(v);
    }

    public final void glColor4sv(ShortBuffer v) {
        org.lwjgl.opengl.GL11.glColor4sv(v);
    }

    public final void glColor4iv(IntBuffer v) {
        org.lwjgl.opengl.GL11.glColor4iv(v);
    }

    public final void glColor4fv(FloatBuffer v) {
        org.lwjgl.opengl.GL11.glColor4fv(v);
    }

    public final void glColor4dv(DoubleBuffer v) {
        org.lwjgl.opengl.GL11.glColor4dv(v);
    }

    public final void glColor4ubv(ByteBuffer v) {
        org.lwjgl.opengl.GL11.glColor4ubv(v);
    }

    public final void glColor4usv(ShortBuffer v) {
        org.lwjgl.opengl.GL11.glColor4usv(v);
    }

    public final void glColor4uiv(IntBuffer v) {
        org.lwjgl.opengl.GL11.glColor4uiv(v);
    }

    public final void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
        org.lwjgl.opengl.GL11.glColorMask(red, green, blue, alpha);
    }

    public final void glColorMaterial(int face, int mode) {
        org.lwjgl.opengl.GL11.glColorMaterial(face, mode);
    }

    public final void glColorPointer(int size, int type, int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer);
    }

    public final void glColorPointer(int size, int type, int stride, long pointer) {
        org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer);
    }

    public final void glColorPointer(int size, int type, int stride, ShortBuffer pointer) {
        org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer);
    }

    public final void glColorPointer(int size, int type, int stride, IntBuffer pointer) {
        org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer);
    }

    public final void glColorPointer(int size, int type, int stride, FloatBuffer pointer) {
        org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer);
    }

    public final void glCopyPixels(int x, int y, int width, int height, int type) {
        org.lwjgl.opengl.GL11.glCopyPixels(x, y, width, height, type);
    }

    public final void glCullFace(int mode) {
        org.lwjgl.opengl.GL11.glCullFace(mode);
    }

    public final void glDeleteLists(int list, int range) {
        org.lwjgl.opengl.GL11.glDeleteLists(list, range);
    }

    public final void glDepthFunc(int func) {
        org.lwjgl.opengl.GL11.glDepthFunc(func);
    }

    public final void glDepthMask(boolean flag) {
        org.lwjgl.opengl.GL11.glDepthMask(flag);
    }

    public final void glDepthRange(double zNear, double zFar) {
        org.lwjgl.opengl.GL11.glDepthRange(zNear, zFar);
    }

    public final void glDisableClientState(int cap) {
        org.lwjgl.opengl.GL11.glDisableClientState(cap);
    }

    public final void glDrawArrays(int mode, int first, int count) {
        org.lwjgl.opengl.GL11.glDrawArrays(mode, first, count);
    }

    public final void glDrawBuffer(int buf) {
        org.lwjgl.opengl.GL11.glDrawBuffer(buf);
    }

    public final void glDrawElements(int mode, int count, int type, long indices) {
        org.lwjgl.opengl.GL11.glDrawElements(mode, count, type, indices);
    }

    public final void glDrawElements(int mode, int type, ByteBuffer indices) {
        org.lwjgl.opengl.GL11.glDrawElements(mode, type, indices);
    }

    public final void glDrawElements(int mode, ByteBuffer indices) {
        org.lwjgl.opengl.GL11.glDrawElements(mode, indices);
    }

    public final void glDrawElements(int mode, ShortBuffer indices) {
        org.lwjgl.opengl.GL11.glDrawElements(mode, indices);
    }

    public final void glDrawElements(int mode, IntBuffer indices) {
        org.lwjgl.opengl.GL11.glDrawElements(mode, indices);
    }

    public final void glDrawPixels(int width, int height, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    public final void glDrawPixels(int width, int height, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    public final void glDrawPixels(int width, int height, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    public final void glDrawPixels(int width, int height, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    public final void glDrawPixels(int width, int height, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    public final void glEdgeFlag(boolean flag) {
        org.lwjgl.opengl.GL11.glEdgeFlag(flag);
    }

    public final void glEdgeFlagv(ByteBuffer flag) {
        org.lwjgl.opengl.GL11.glEdgeFlagv(flag);
    }

    public final void glEdgeFlagPointer(int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glEdgeFlagPointer(stride, pointer);
    }

    public final void glEdgeFlagPointer(int stride, long pointer) {
        org.lwjgl.opengl.GL11.glEdgeFlagPointer(stride, pointer);
    }

    public final void glEnableClientState(int cap) {
        org.lwjgl.opengl.GL11.glEnableClientState(cap);
    }

    public final void glEnd() {
        org.lwjgl.opengl.GL11.glEnd();
    }

    public final void glEvalCoord1f(float u) {
        org.lwjgl.opengl.GL11.glEvalCoord1f(u);
    }

    public final void glEvalCoord1fv(FloatBuffer u) {
        org.lwjgl.opengl.GL11.glEvalCoord1fv(u);
    }

    public final void glEvalCoord1d(double u) {
        org.lwjgl.opengl.GL11.glEvalCoord1d(u);
    }

    public final void glEvalCoord1dv(DoubleBuffer u) {
        org.lwjgl.opengl.GL11.glEvalCoord1dv(u);
    }

    public final void glEvalCoord2f(float u, float v) {
        org.lwjgl.opengl.GL11.glEvalCoord2f(u, v);
    }

    public final void glEvalCoord2fv(FloatBuffer u) {
        org.lwjgl.opengl.GL11.glEvalCoord2fv(u);
    }

    public final void glEvalCoord2d(double u, double v) {
        org.lwjgl.opengl.GL11.glEvalCoord2d(u, v);
    }

    public final void glEvalCoord2dv(DoubleBuffer u) {
        org.lwjgl.opengl.GL11.glEvalCoord2dv(u);
    }

    public final void glEvalMesh1(int mode, int i1, int i2) {
        org.lwjgl.opengl.GL11.glEvalMesh1(mode, i1, i2);
    }

    public final void glEvalMesh2(int mode, int i1, int i2, int j1, int j2) {
        org.lwjgl.opengl.GL11.glEvalMesh2(mode, i1, i2, j1, j2);
    }

    public final void glEvalPoint1(int i) {
        org.lwjgl.opengl.GL11.glEvalPoint1(i);
    }

    public final void glEvalPoint2(int i, int j) {
        org.lwjgl.opengl.GL11.glEvalPoint2(i, j);
    }

    public final void glFeedbackBuffer(int type, FloatBuffer buffer) {
        org.lwjgl.opengl.GL11.glFeedbackBuffer(type, buffer);
    }

    public final void glFinish() {
        org.lwjgl.opengl.GL11.glFinish();
    }

    public final void glFlush() {
        org.lwjgl.opengl.GL11.glFlush();
    }

    public final void glFogi(int pname, int param) {
        org.lwjgl.opengl.GL11.glFogi(pname, param);
    }

    public final void glFogiv(int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glFogiv(pname, params);
    }

    public final void glFogf(int pname, float param) {
        org.lwjgl.opengl.GL11.glFogf(pname, param);
    }

    public final void glFogfv(int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glFogfv(pname, params);
    }

    public final void glFrontFace(int dir) {
        org.lwjgl.opengl.GL11.glFrontFace(dir);
    }

    public final int glGenLists(int s) {
        return org.lwjgl.opengl.GL11.glGenLists(s);
    }

    public final void glGenTextures(IntBuffer textures) {
        org.lwjgl.opengl.GL11.glGenTextures(textures);
    }

    public final int glGenTextures() {
        return org.lwjgl.opengl.GL11.glGenTextures();
    }

    public final void glDeleteTextures(IntBuffer textures) {
        org.lwjgl.opengl.GL11.glDeleteTextures(textures);
    }

    public final void glDeleteTextures(int texture) {
        org.lwjgl.opengl.GL11.glDeleteTextures(texture);
    }

    public final void glGetClipPlane(int plane, DoubleBuffer equation) {
        org.lwjgl.opengl.GL11.glGetClipPlane(plane, equation);
    }

    public final void glGetBooleanv(int pname, ByteBuffer params) {
        org.lwjgl.opengl.GL11.glGetBooleanv(pname, params);
    }

    public final boolean glGetBoolean(int pname) {
        return org.lwjgl.opengl.GL11.glGetBoolean(pname);
    }

    public final void glGetFloatv(int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glGetFloatv(pname, params);
    }

    public final float glGetFloat(int pname) {
        return org.lwjgl.opengl.GL11.glGetFloat(pname);
    }

    public final void glGetIntegerv(int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glGetIntegerv(pname, params);
    }

    public final int glGetInteger(int pname) {
        return org.lwjgl.opengl.GL11.glGetInteger(pname);
    }

    public final void glGetDoublev(int pname, DoubleBuffer params) {
        org.lwjgl.opengl.GL11.glGetDoublev(pname, params);
    }

    public final double glGetDouble(int pname) {
        return org.lwjgl.opengl.GL11.glGetDouble(pname);
    }

    public final int glGetError() {
        return org.lwjgl.opengl.GL11.glGetError();
    }

    public final void glGetLightiv(int light, int pname, IntBuffer data) {
        org.lwjgl.opengl.GL11.glGetLightiv(light, pname, data);
    }

    public final int glGetLighti(int light, int pname) {
        return org.lwjgl.opengl.GL11.glGetLighti(light, pname);
    }

    public final void glGetLightfv(int light, int pname, FloatBuffer data) {
        org.lwjgl.opengl.GL11.glGetLightfv(light, pname, data);
    }

    public final float glGetLightf(int light, int pname) {
        return org.lwjgl.opengl.GL11.glGetLightf(light, pname);
    }

    public final void glGetMapiv(int target, int query, IntBuffer data) {
        org.lwjgl.opengl.GL11.glGetMapiv(target, query, data);
    }

    public final int glGetMapi(int target, int query) {
        return org.lwjgl.opengl.GL11.glGetMapi(target, query);
    }

    public final void glGetMapfv(int target, int query, FloatBuffer data) {
        org.lwjgl.opengl.GL11.glGetMapfv(target, query, data);
    }

    public final float glGetMapf(int target, int query) {
        return org.lwjgl.opengl.GL11.glGetMapf(target, query);
    }

    public final void glGetMapdv(int target, int query, DoubleBuffer data) {
        org.lwjgl.opengl.GL11.glGetMapdv(target, query, data);
    }

    public final double glGetMapd(int target, int query) {
        return org.lwjgl.opengl.GL11.glGetMapd(target, query);
    }

    public final void glGetMaterialiv(int face, int pname, IntBuffer data) {
        org.lwjgl.opengl.GL11.glGetMaterialiv(face, pname, data);
    }

    public final void glGetMaterialfv(int face, int pname, FloatBuffer data) {
        org.lwjgl.opengl.GL11.glGetMaterialfv(face, pname, data);
    }

    public final void glGetPixelMapfv(int map, FloatBuffer data) {
        org.lwjgl.opengl.GL11.glGetPixelMapfv(map, data);
    }

    public final void glGetPixelMapfv(int map, long data) {
        org.lwjgl.opengl.GL11.glGetPixelMapfv(map, data);
    }

    public final void glGetPixelMapusv(int map, ShortBuffer data) {
        org.lwjgl.opengl.GL11.glGetPixelMapusv(map, data);
    }

    public final void glGetPixelMapusv(int map, long data) {
        org.lwjgl.opengl.GL11.glGetPixelMapusv(map, data);
    }

    public final void glGetPixelMapuiv(int map, IntBuffer data) {
        org.lwjgl.opengl.GL11.glGetPixelMapuiv(map, data);
    }

    public final void glGetPixelMapuiv(int map, long data) {
        org.lwjgl.opengl.GL11.glGetPixelMapuiv(map, data);
    }

    public final void glGetPointerv(int pname, PointerBuffer params) {
        org.lwjgl.opengl.GL11.glGetPointerv(pname, params);
    }

    public final long glGetPointer(int pname) {
        return org.lwjgl.opengl.GL11.glGetPointer(pname);
    }

    public final void glGetPolygonStipple(ByteBuffer pattern) {
        org.lwjgl.opengl.GL11.glGetPolygonStipple(pattern);
    }

    public final void glGetPolygonStipple(long pattern) {
        org.lwjgl.opengl.GL11.glGetPolygonStipple(pattern);
    }

    public final String glGetString(int name) {
        return org.lwjgl.opengl.GL11.glGetString(name);
    }

    public final void glGetTexEnviv(int env, int pname, IntBuffer data) {
        org.lwjgl.opengl.GL11.glGetTexEnviv(env, pname, data);
    }

    public final int glGetTexEnvi(int env, int pname) {
        return org.lwjgl.opengl.GL11.glGetTexEnvi(env, pname);
    }

    public final void glGetTexEnvfv(int env, int pname, FloatBuffer data) {
        org.lwjgl.opengl.GL11.glGetTexEnvfv(env, pname, data);
    }

    public final float glGetTexEnvf(int env, int pname) {
        return org.lwjgl.opengl.GL11.glGetTexEnvf(env, pname);
    }

    public final void glGetTexGeniv(int coord, int pname, IntBuffer data) {
        org.lwjgl.opengl.GL11.glGetTexGeniv(coord, pname, data);
    }

    public final int glGetTexGeni(int coord, int pname) {
        return org.lwjgl.opengl.GL11.glGetTexGeni(coord, pname);
    }

    public final void glGetTexGenfv(int coord, int pname, FloatBuffer data) {
        org.lwjgl.opengl.GL11.glGetTexGenfv(coord, pname, data);
    }

    public final float glGetTexGenf(int coord, int pname) {
        return org.lwjgl.opengl.GL11.glGetTexGenf(coord, pname);
    }

    public final void glGetTexGendv(int coord, int pname, DoubleBuffer data) {
        org.lwjgl.opengl.GL11.glGetTexGendv(coord, pname, data);
    }

    public final double glGetTexGend(int coord, int pname) {
        return org.lwjgl.opengl.GL11.glGetTexGend(coord, pname);
    }

    public final void glGetTexImage(int tex, int level, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    public final void glGetTexImage(int tex, int level, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    public final void glGetTexImage(int tex, int level, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    public final void glGetTexImage(int tex, int level, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    public final void glGetTexImage(int tex, int level, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    public final void glGetTexImage(int tex, int level, int format, int type, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    public final void glGetTexLevelParameteriv(int target, int level, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glGetTexLevelParameteriv(target, level, pname, params);
    }

    public final int glGetTexLevelParameteri(int target, int level, int pname) {
        return org.lwjgl.opengl.GL11.glGetTexLevelParameteri(target, level, pname);
    }

    public final void glGetTexLevelParameterfv(int target, int level, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glGetTexLevelParameterfv(target, level, pname, params);
    }

    public final float glGetTexLevelParameterf(int target, int level, int pname) {
        return org.lwjgl.opengl.GL11.glGetTexLevelParameterf(target, level, pname);
    }

    public final void glGetTexParameteriv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glGetTexParameteriv(target, pname, params);
    }

    public final int glGetTexParameteri(int target, int pname) {
        return org.lwjgl.opengl.GL11.glGetTexParameteri(target, pname);
    }

    public final void glGetTexParameterfv(int target, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glGetTexParameterfv(target, pname, params);
    }

    public final float glGetTexParameterf(int target, int pname) {
        return org.lwjgl.opengl.GL11.glGetTexParameterf(target, pname);
    }

    public final void glHint(int target, int hint) {
        org.lwjgl.opengl.GL11.glHint(target, hint);
    }

    public final void glIndexi(int index) {
        org.lwjgl.opengl.GL11.glIndexi(index);
    }

    public final void glIndexub(byte index) {
        org.lwjgl.opengl.GL11.glIndexub(index);
    }

    public final void glIndexs(short index) {
        org.lwjgl.opengl.GL11.glIndexs(index);
    }

    public final void glIndexf(float index) {
        org.lwjgl.opengl.GL11.glIndexf(index);
    }

    public final void glIndexd(double index) {
        org.lwjgl.opengl.GL11.glIndexd(index);
    }

    public final void glIndexiv(IntBuffer index) {
        org.lwjgl.opengl.GL11.glIndexiv(index);
    }

    public final void glIndexubv(ByteBuffer index) {
        org.lwjgl.opengl.GL11.glIndexubv(index);
    }

    public final void glIndexsv(ShortBuffer index) {
        org.lwjgl.opengl.GL11.glIndexsv(index);
    }

    public final void glIndexfv(FloatBuffer index) {
        org.lwjgl.opengl.GL11.glIndexfv(index);
    }

    public final void glIndexdv(DoubleBuffer index) {
        org.lwjgl.opengl.GL11.glIndexdv(index);
    }

    public final void glIndexMask(int mask) {
        org.lwjgl.opengl.GL11.glIndexMask(mask);
    }

    public final void glIndexPointer(int type, int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glIndexPointer(type, stride, pointer);
    }

    public final void glIndexPointer(int type, int stride, long pointer) {
        org.lwjgl.opengl.GL11.glIndexPointer(type, stride, pointer);
    }

    public final void glIndexPointer(int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glIndexPointer(stride, pointer);
    }

    public final void glIndexPointer(int stride, ShortBuffer pointer) {
        org.lwjgl.opengl.GL11.glIndexPointer(stride, pointer);
    }

    public final void glIndexPointer(int stride, IntBuffer pointer) {
        org.lwjgl.opengl.GL11.glIndexPointer(stride, pointer);
    }

    public final void glInitNames() {
        org.lwjgl.opengl.GL11.glInitNames();
    }

    public final void glInterleavedArrays(int format, int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    public final void glInterleavedArrays(int format, int stride, long pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    public final void glInterleavedArrays(int format, int stride, ShortBuffer pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    public final void glInterleavedArrays(int format, int stride, IntBuffer pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    public final void glInterleavedArrays(int format, int stride, FloatBuffer pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    public final void glInterleavedArrays(int format, int stride, DoubleBuffer pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    public final boolean glIsEnabled(int cap) {
        return org.lwjgl.opengl.GL11.glIsEnabled(cap);
    }

    public final boolean glIsList(int list) {
        return org.lwjgl.opengl.GL11.glIsList(list);
    }

    public final boolean glIsTexture(int texture) {
        return org.lwjgl.opengl.GL11.glIsTexture(texture);
    }

    public final void glLightModeli(int pname, int param) {
        org.lwjgl.opengl.GL11.glLightModeli(pname, param);
    }

    public final void glLightModelf(int pname, float param) {
        org.lwjgl.opengl.GL11.glLightModelf(pname, param);
    }

    public final void glLightModeliv(int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glLightModeliv(pname, params);
    }

    public final void glLightModelfv(int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glLightModelfv(pname, params);
    }

    public final void glLighti(int light, int pname, int param) {
        org.lwjgl.opengl.GL11.glLighti(light, pname, param);
    }

    public final void glLightf(int light, int pname, float param) {
        org.lwjgl.opengl.GL11.glLightf(light, pname, param);
    }

    public final void glLightiv(int light, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glLightiv(light, pname, params);
    }

    public final void glLightfv(int light, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glLightfv(light, pname, params);
    }

    public final void glLineStipple(int factor, short pattern) {
        org.lwjgl.opengl.GL11.glLineStipple(factor, pattern);
    }

    public final void glLineWidth(float width) {
        org.lwjgl.opengl.GL11.glLineWidth(width);
    }

    public final void glListBase(int base) {
        org.lwjgl.opengl.GL11.glListBase(base);
    }

    public final void glLoadMatrixf(FloatBuffer m) {
        org.lwjgl.opengl.GL11.glLoadMatrixf(m);
    }

    public final void glLoadMatrixd(DoubleBuffer m) {
        org.lwjgl.opengl.GL11.glLoadMatrixd(m);
    }

    public final void glLoadIdentity() {
        org.lwjgl.opengl.GL11.glLoadIdentity();
    }

    public final void glLoadName(int name) {
        org.lwjgl.opengl.GL11.glLoadName(name);
    }

    public final void glLogicOp(int op) {
        org.lwjgl.opengl.GL11.glLogicOp(op);
    }

    public final void glMap1f(int target, float u1, float u2, int stride, int order, FloatBuffer points) {
        org.lwjgl.opengl.GL11.glMap1f(target, u1, u2, stride, order, points);
    }

    public final void glMap1d(int target, double u1, double u2, int stride, int order, DoubleBuffer points) {
        org.lwjgl.opengl.GL11.glMap1d(target, u1, u2, stride, order, points);
    }

    public final void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, FloatBuffer points) {
        org.lwjgl.opengl.GL11.glMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
    }

    public final void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, DoubleBuffer points) {
        org.lwjgl.opengl.GL11.glMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
    }

    public final void glMapGrid1f(int n, float u1, float u2) {
        org.lwjgl.opengl.GL11.glMapGrid1f(n, u1, u2);
    }

    public final void glMapGrid1d(int n, double u1, double u2) {
        org.lwjgl.opengl.GL11.glMapGrid1d(n, u1, u2);
    }

    public final void glMapGrid2f(int un, float u1, float u2, int vn, float v1, float v2) {
        org.lwjgl.opengl.GL11.glMapGrid2f(un, u1, u2, vn, v1, v2);
    }

    public final void glMapGrid2d(int un, double u1, double u2, int vn, double v1, double v2) {
        org.lwjgl.opengl.GL11.glMapGrid2d(un, u1, u2, vn, v1, v2);
    }

    public final void glMateriali(int face, int pname, int param) {
        org.lwjgl.opengl.GL11.glMateriali(face, pname, param);
    }

    public final void glMaterialf(int face, int pname, float param) {
        org.lwjgl.opengl.GL11.glMaterialf(face, pname, param);
    }

    public final void glMaterialiv(int face, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glMaterialiv(face, pname, params);
    }

    public final void glMaterialfv(int face, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glMaterialfv(face, pname, params);
    }

    public final void glMatrixMode(int mode) {
        org.lwjgl.opengl.GL11.glMatrixMode(mode);
    }

    public final void glMultMatrixf(FloatBuffer m) {
        org.lwjgl.opengl.GL11.glMultMatrixf(m);
    }

    public final void glMultMatrixd(DoubleBuffer m) {
        org.lwjgl.opengl.GL11.glMultMatrixd(m);
    }

    public final void glFrustum(double l, double r, double b, double t, double n, double f) {
        org.lwjgl.opengl.GL11.glFrustum(l, r, b, t, n, f);
    }

    public final void glNewList(int n, int mode) {
        org.lwjgl.opengl.GL11.glNewList(n, mode);
    }

    public final void glEndList() {
        org.lwjgl.opengl.GL11.glEndList();
    }

    public final void glNormal3f(float nx, float ny, float nz) {
        org.lwjgl.opengl.GL11.glNormal3f(nx, ny, nz);
    }

    public final void glNormal3b(byte nx, byte ny, byte nz) {
        org.lwjgl.opengl.GL11.glNormal3b(nx, ny, nz);
    }

    public final void glNormal3s(short nx, short ny, short nz) {
        org.lwjgl.opengl.GL11.glNormal3s(nx, ny, nz);
    }

    public final void glNormal3i(int nx, int ny, int nz) {
        org.lwjgl.opengl.GL11.glNormal3i(nx, ny, nz);
    }

    public final void glNormal3d(double nx, double ny, double nz) {
        org.lwjgl.opengl.GL11.glNormal3d(nx, ny, nz);
    }

    public final void glNormal3fv(FloatBuffer v) {
        org.lwjgl.opengl.GL11.glNormal3fv(v);
    }

    public final void glNormal3bv(ByteBuffer v) {
        org.lwjgl.opengl.GL11.glNormal3bv(v);
    }

    public final void glNormal3sv(ShortBuffer v) {
        org.lwjgl.opengl.GL11.glNormal3sv(v);
    }

    public final void glNormal3iv(IntBuffer v) {
        org.lwjgl.opengl.GL11.glNormal3iv(v);
    }

    public final void glNormal3dv(DoubleBuffer v) {
        org.lwjgl.opengl.GL11.glNormal3dv(v);
    }

    public final void glNormalPointer(int type, int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer);
    }

    public final void glNormalPointer(int type, int stride, long pointer) {
        org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer);
    }

    public final void glNormalPointer(int type, int stride, ShortBuffer pointer) {
        org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer);
    }

    public final void glNormalPointer(int type, int stride, IntBuffer pointer) {
        org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer);
    }

    public final void glNormalPointer(int type, int stride, FloatBuffer pointer) {
        org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer);
    }

    public final void glOrtho(double l, double r, double b, double t, double n, double f) {
        org.lwjgl.opengl.GL11.glOrtho(l, r, b, t, n, f);
    }

    public final void glPassThrough(float token) {
        org.lwjgl.opengl.GL11.glPassThrough(token);
    }

    public final void glPixelMapfv(int map, int size, long values) {
        org.lwjgl.opengl.GL11.glPixelMapfv(map, size, values);
    }

    public final void glPixelMapfv(int map, FloatBuffer values) {
        org.lwjgl.opengl.GL11.glPixelMapfv(map, values);
    }

    public final void glPixelMapusv(int map, int size, long values) {
        org.lwjgl.opengl.GL11.glPixelMapusv(map, size, values);
    }

    public final void glPixelMapusv(int map, ShortBuffer values) {
        org.lwjgl.opengl.GL11.glPixelMapusv(map, values);
    }

    public final void glPixelMapuiv(int map, int size, long values) {
        org.lwjgl.opengl.GL11.glPixelMapuiv(map, size, values);
    }

    public final void glPixelMapuiv(int map, IntBuffer values) {
        org.lwjgl.opengl.GL11.glPixelMapuiv(map, values);
    }

    public final void glPixelStorei(int pname, int param) {
        org.lwjgl.opengl.GL11.glPixelStorei(pname, param);
    }

    public final void glPixelStoref(int pname, float param) {
        org.lwjgl.opengl.GL11.glPixelStoref(pname, param);
    }

    public final void glPixelTransferi(int pname, int param) {
        org.lwjgl.opengl.GL11.glPixelTransferi(pname, param);
    }

    public final void glPixelTransferf(int pname, float param) {
        org.lwjgl.opengl.GL11.glPixelTransferf(pname, param);
    }

    public final void glPixelZoom(float xfactor, float yfactor) {
        org.lwjgl.opengl.GL11.glPixelZoom(xfactor, yfactor);
    }

    public final void glPointSize(float size) {
        org.lwjgl.opengl.GL11.glPointSize(size);
    }

    public final void glPolygonMode(int face, int mode) {
        org.lwjgl.opengl.GL11.glPolygonMode(face, mode);
    }

    public final void glPolygonOffset(float factor, float units) {
        org.lwjgl.opengl.GL11.glPolygonOffset(factor, units);
    }

    public final void glPolygonStipple(ByteBuffer pattern) {
        org.lwjgl.opengl.GL11.glPolygonStipple(pattern);
    }

    public final void glPolygonStipple(long pattern) {
        org.lwjgl.opengl.GL11.glPolygonStipple(pattern);
    }

    public final void glPushAttrib(int mask) {
        org.lwjgl.opengl.GL11.glPushAttrib(mask);
    }

    public final void glPushClientAttrib(int mask) {
        org.lwjgl.opengl.GL11.glPushClientAttrib(mask);
    }

    public final void glPopAttrib() {
        org.lwjgl.opengl.GL11.glPopAttrib();
    }

    public final void glPopClientAttrib() {
        org.lwjgl.opengl.GL11.glPopClientAttrib();
    }

    public final void glPopMatrix() {
        org.lwjgl.opengl.GL11.glPopMatrix();
    }

    public final void glPopName() {
        org.lwjgl.opengl.GL11.glPopName();
    }

    public final void glPrioritizeTextures(IntBuffer textures, FloatBuffer priorities) {
        org.lwjgl.opengl.GL11.glPrioritizeTextures(textures, priorities);
    }

    public final void glPushMatrix() {
        org.lwjgl.opengl.GL11.glPushMatrix();
    }

    public final void glPushName(int name) {
        org.lwjgl.opengl.GL11.glPushName(name);
    }

    public final void glRasterPos2i(int x, int y) {
        org.lwjgl.opengl.GL11.glRasterPos2i(x, y);
    }

    public final void glRasterPos2s(short x, short y) {
        org.lwjgl.opengl.GL11.glRasterPos2s(x, y);
    }

    public final void glRasterPos2f(float x, float y) {
        org.lwjgl.opengl.GL11.glRasterPos2f(x, y);
    }

    public final void glRasterPos2d(double x, double y) {
        org.lwjgl.opengl.GL11.glRasterPos2d(x, y);
    }

    public final void glRasterPos2iv(IntBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos2iv(coords);
    }

    public final void glRasterPos2sv(ShortBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos2sv(coords);
    }

    public final void glRasterPos2fv(FloatBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos2fv(coords);
    }

    public final void glRasterPos2dv(DoubleBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos2dv(coords);
    }

    public final void glRasterPos3i(int x, int y, int z) {
        org.lwjgl.opengl.GL11.glRasterPos3i(x, y, z);
    }

    public final void glRasterPos3s(short x, short y, short z) {
        org.lwjgl.opengl.GL11.glRasterPos3s(x, y, z);
    }

    public final void glRasterPos3f(float x, float y, float z) {
        org.lwjgl.opengl.GL11.glRasterPos3f(x, y, z);
    }

    public final void glRasterPos3d(double x, double y, double z) {
        org.lwjgl.opengl.GL11.glRasterPos3d(x, y, z);
    }

    public final void glRasterPos3iv(IntBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos3iv(coords);
    }

    public final void glRasterPos3sv(ShortBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos3sv(coords);
    }

    public final void glRasterPos3fv(FloatBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos3fv(coords);
    }

    public final void glRasterPos3dv(DoubleBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos3dv(coords);
    }

    public final void glRasterPos4i(int x, int y, int z, int w) {
        org.lwjgl.opengl.GL11.glRasterPos4i(x, y, z, w);
    }

    public final void glRasterPos4s(short x, short y, short z, short w) {
        org.lwjgl.opengl.GL11.glRasterPos4s(x, y, z, w);
    }

    public final void glRasterPos4f(float x, float y, float z, float w) {
        org.lwjgl.opengl.GL11.glRasterPos4f(x, y, z, w);
    }

    public final void glRasterPos4d(double x, double y, double z, double w) {
        org.lwjgl.opengl.GL11.glRasterPos4d(x, y, z, w);
    }

    public final void glRasterPos4iv(IntBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos4iv(coords);
    }

    public final void glRasterPos4sv(ShortBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos4sv(coords);
    }

    public final void glRasterPos4fv(FloatBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos4fv(coords);
    }

    public final void glRasterPos4dv(DoubleBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos4dv(coords);
    }

    public final void glReadBuffer(int src) {
        org.lwjgl.opengl.GL11.glReadBuffer(src);
    }

    public final void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    public final void glReadPixels(int x, int y, int width, int height, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    public final void glReadPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    public final void glReadPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    public final void glReadPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    public final void glRecti(int x1, int y1, int x2, int y2) {
        org.lwjgl.opengl.GL11.glRecti(x1, y1, x2, y2);
    }

    public final void glRects(short x1, short y1, short x2, short y2) {
        org.lwjgl.opengl.GL11.glRects(x1, y1, x2, y2);
    }

    public final void glRectf(float x1, float y1, float x2, float y2) {
        org.lwjgl.opengl.GL11.glRectf(x1, y1, x2, y2);
    }

    public final void glRectd(double x1, double y1, double x2, double y2) {
        org.lwjgl.opengl.GL11.glRectd(x1, y1, x2, y2);
    }

    public final void glRectiv(IntBuffer v1, IntBuffer v2) {
        org.lwjgl.opengl.GL11.glRectiv(v1, v2);
    }

    public final void glRectsv(ShortBuffer v1, ShortBuffer v2) {
        org.lwjgl.opengl.GL11.glRectsv(v1, v2);
    }

    public final void glRectfv(FloatBuffer v1, FloatBuffer v2) {
        org.lwjgl.opengl.GL11.glRectfv(v1, v2);
    }

    public final void glRectdv(DoubleBuffer v1, DoubleBuffer v2) {
        org.lwjgl.opengl.GL11.glRectdv(v1, v2);
    }

    public final int glRenderMode(int mode) {
        return org.lwjgl.opengl.GL11.glRenderMode(mode);
    }

    public final void glRotatef(float angle, float x, float y, float z) {
        org.lwjgl.opengl.GL11.glRotatef(angle, x, y, z);
    }

    public final void glRotated(double angle, double x, double y, double z) {
        org.lwjgl.opengl.GL11.glRotated(angle, x, y, z);
    }

    public final void glScalef(float x, float y, float z) {
        org.lwjgl.opengl.GL11.glScalef(x, y, z);
    }

    public final void glScaled(double x, double y, double z) {
        org.lwjgl.opengl.GL11.glScaled(x, y, z);
    }

    public final void glScissor(int x, int y, int width, int height) {
        org.lwjgl.opengl.GL11.glScissor(x, y, width, height);
    }

    public final void glSelectBuffer(IntBuffer buffer) {
        org.lwjgl.opengl.GL11.glSelectBuffer(buffer);
    }

    public final void glShadeModel(int mode) {
        org.lwjgl.opengl.GL11.glShadeModel(mode);
    }

    public final void glStencilFunc(int func, int ref, int mask) {
        org.lwjgl.opengl.GL11.glStencilFunc(func, ref, mask);
    }

    public final void glStencilMask(int mask) {
        org.lwjgl.opengl.GL11.glStencilMask(mask);
    }

    public final void glStencilOp(int sfail, int dpfail, int dppass) {
        org.lwjgl.opengl.GL11.glStencilOp(sfail, dpfail, dppass);
    }

    public final void glTexCoord1f(float s) {
        org.lwjgl.opengl.GL11.glTexCoord1f(s);
    }

    public final void glTexCoord1s(short s) {
        org.lwjgl.opengl.GL11.glTexCoord1s(s);
    }

    public final void glTexCoord1i(int s) {
        org.lwjgl.opengl.GL11.glTexCoord1i(s);
    }

    public final void glTexCoord1d(double s) {
        org.lwjgl.opengl.GL11.glTexCoord1d(s);
    }

    public final void glTexCoord1fv(FloatBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord1fv(v);
    }

    public final void glTexCoord1sv(ShortBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord1sv(v);
    }

    public final void glTexCoord1iv(IntBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord1iv(v);
    }

    public final void glTexCoord1dv(DoubleBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord1dv(v);
    }

    public final void glTexCoord2f(float s, float t) {
        org.lwjgl.opengl.GL11.glTexCoord2f(s, t);
    }

    public final void glTexCoord2s(short s, short t) {
        org.lwjgl.opengl.GL11.glTexCoord2s(s, t);
    }

    public final void glTexCoord2i(int s, int t) {
        org.lwjgl.opengl.GL11.glTexCoord2i(s, t);
    }

    public final void glTexCoord2d(double s, double t) {
        org.lwjgl.opengl.GL11.glTexCoord2d(s, t);
    }

    public final void glTexCoord2fv(FloatBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord2fv(v);
    }

    public final void glTexCoord2sv(ShortBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord2sv(v);
    }

    public final void glTexCoord2iv(IntBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord2iv(v);
    }

    public final void glTexCoord2dv(DoubleBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord2dv(v);
    }

    public final void glTexCoord3f(float s, float t, float r) {
        org.lwjgl.opengl.GL11.glTexCoord3f(s, t, r);
    }

    public final void glTexCoord3s(short s, short t, short r) {
        org.lwjgl.opengl.GL11.glTexCoord3s(s, t, r);
    }

    public final void glTexCoord3i(int s, int t, int r) {
        org.lwjgl.opengl.GL11.glTexCoord3i(s, t, r);
    }

    public final void glTexCoord3d(double s, double t, double r) {
        org.lwjgl.opengl.GL11.glTexCoord3d(s, t, r);
    }

    public final void glTexCoord3fv(FloatBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord3fv(v);
    }

    public final void glTexCoord3sv(ShortBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord3sv(v);
    }

    public final void glTexCoord3iv(IntBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord3iv(v);
    }

    public final void glTexCoord3dv(DoubleBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord3dv(v);
    }

    public final void glTexCoord4f(float s, float t, float r, float q) {
        org.lwjgl.opengl.GL11.glTexCoord4f(s, t, r, q);
    }

    public final void glTexCoord4s(short s, short t, short r, short q) {
        org.lwjgl.opengl.GL11.glTexCoord4s(s, t, r, q);
    }

    public final void glTexCoord4i(int s, int t, int r, int q) {
        org.lwjgl.opengl.GL11.glTexCoord4i(s, t, r, q);
    }

    public final void glTexCoord4d(double s, double t, double r, double q) {
        org.lwjgl.opengl.GL11.glTexCoord4d(s, t, r, q);
    }

    public final void glTexCoord4fv(FloatBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord4fv(v);
    }

    public final void glTexCoord4sv(ShortBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord4sv(v);
    }

    public final void glTexCoord4iv(IntBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord4iv(v);
    }

    public final void glTexCoord4dv(DoubleBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord4dv(v);
    }

    public final void glTexCoordPointer(int size, int type, int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer);
    }

    public final void glTexCoordPointer(int size, int type, int stride, long pointer) {
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer);
    }

    public final void glTexCoordPointer(int size, int type, int stride, ShortBuffer pointer) {
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer);
    }

    public final void glTexCoordPointer(int size, int type, int stride, IntBuffer pointer) {
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer);
    }

    public final void glTexCoordPointer(int size, int type, int stride, FloatBuffer pointer) {
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer);
    }

    public final void glTexEnvi(int target, int pname, int param) {
        org.lwjgl.opengl.GL11.glTexEnvi(target, pname, param);
    }

    public final void glTexEnviv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glTexEnviv(target, pname, params);
    }

    public final void glTexEnvf(int target, int pname, float param) {
        org.lwjgl.opengl.GL11.glTexEnvf(target, pname, param);
    }

    public final void glTexEnvfv(int target, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glTexEnvfv(target, pname, params);
    }

    public final void glTexGeni(int coord, int pname, int param) {
        org.lwjgl.opengl.GL11.glTexGeni(coord, pname, param);
    }

    public final void glTexGeniv(int coord, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glTexGeniv(coord, pname, params);
    }

    public final void glTexGenf(int coord, int pname, float param) {
        org.lwjgl.opengl.GL11.glTexGenf(coord, pname, param);
    }

    public final void glTexGenfv(int coord, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glTexGenfv(coord, pname, params);
    }

    public final void glTexGend(int coord, int pname, double param) {
        org.lwjgl.opengl.GL11.glTexGend(coord, pname, param);
    }

    public final void glTexGendv(int coord, int pname, DoubleBuffer params) {
        org.lwjgl.opengl.GL11.glTexGendv(coord, pname, params);
    }

    public final void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public final void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public final void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public final void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public final void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public final void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public final void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public final void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public final void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public final void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public final void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public final void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public final void glCopyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border) {
        org.lwjgl.opengl.GL11.glCopyTexImage1D(target, level, internalFormat, x, y, width, border);
    }

    public final void glCopyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border) {
        org.lwjgl.opengl.GL11.glCopyTexImage2D(target, level, internalFormat, x, y, width, height, border);
    }

    public final void glCopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width) {
        org.lwjgl.opengl.GL11.glCopyTexSubImage1D(target, level, xoffset, x, y, width);
    }

    public final void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL11.glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
    }

    public final void glTexParameteri(int target, int pname, int param) {
        org.lwjgl.opengl.GL11.glTexParameteri(target, pname, param);
    }

    public final void glTexParameteriv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glTexParameteriv(target, pname, params);
    }

    public final void glTexParameterf(int target, int pname, float param) {
        org.lwjgl.opengl.GL11.glTexParameterf(target, pname, param);
    }

    public final void glTexParameterfv(int target, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glTexParameterfv(target, pname, params);
    }

    public final void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ByteBuffer pixels) {
        Logger.fatal("Use DSA GL45.glTextureSubImage1D");
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public final void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels) {
        Logger.fatal("Use DSA GL45.glTextureSubImage1D");
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public final void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ShortBuffer pixels) {
        Logger.fatal("Use DSA GL45.glTextureSubImage1D");
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public final void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, IntBuffer pixels) {
        Logger.fatal("Use DSA GL45.glTextureSubImage1D");
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public final void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, FloatBuffer pixels) {
        Logger.fatal("Use DSA GL45.glTextureSubImage1D");
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public final void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels) {
        Logger.fatal("Use DSA GL45.glTextureSubImage1D");
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public final void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
        Logger.fatal("Use DSA GL45.glTextureSubImage2D");
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public final void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        Logger.fatal("Use DSA GL45.glTextureSubImage2D");
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public final void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
        Logger.fatal("Use DSA GL45.glTextureSubImage2D");
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public final void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
        Logger.fatal("Use DSA GL45.glTextureSubImage2D");
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public final void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
        Logger.fatal("Use DSA GL45.glTextureSubImage2D");
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public final void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels) {
        Logger.fatal("Use DSA GL45.glTextureSubImage2D");
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public final void glTranslatef(float x, float y, float z) {
        org.lwjgl.opengl.GL11.glTranslatef(x, y, z);
    }

    public final void glTranslated(double x, double y, double z) {
        org.lwjgl.opengl.GL11.glTranslated(x, y, z);
    }

    public final void glVertex2f(float x, float y) {
        org.lwjgl.opengl.GL11.glVertex2f(x, y);
    }

    public final void glVertex2s(short x, short y) {
        org.lwjgl.opengl.GL11.glVertex2s(x, y);
    }

    public final void glVertex2i(int x, int y) {
        org.lwjgl.opengl.GL11.glVertex2i(x, y);
    }

    public final void glVertex2d(double x, double y) {
        org.lwjgl.opengl.GL11.glVertex2d(x, y);
    }

    public final void glVertex2fv(FloatBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex2fv(coords);
    }

    public final void glVertex2sv(ShortBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex2sv(coords);
    }

    public final void glVertex2iv(IntBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex2iv(coords);
    }

    public final void glVertex2dv(DoubleBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex2dv(coords);
    }

    public final void glVertex3f(float x, float y, float z) {
        org.lwjgl.opengl.GL11.glVertex3f(x, y, z);
    }

    public final void glVertex3s(short x, short y, short z) {
        org.lwjgl.opengl.GL11.glVertex3s(x, y, z);
    }

    public final void glVertex3i(int x, int y, int z) {
        org.lwjgl.opengl.GL11.glVertex3i(x, y, z);
    }

    public final void glVertex3d(double x, double y, double z) {
        org.lwjgl.opengl.GL11.glVertex3d(x, y, z);
    }

    public final void glVertex3fv(FloatBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex3fv(coords);
    }

    public final void glVertex3sv(ShortBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex3sv(coords);
    }

    public final void glVertex3iv(IntBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex3iv(coords);
    }

    public final void glVertex3dv(DoubleBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex3dv(coords);
    }

    public final void glVertex4f(float x, float y, float z, float w) {
        org.lwjgl.opengl.GL11.glVertex4f(x, y, z, w);
    }

    public final void glVertex4s(short x, short y, short z, short w) {
        org.lwjgl.opengl.GL11.glVertex4s(x, y, z, w);
    }

    public final void glVertex4i(int x, int y, int z, int w) {
        org.lwjgl.opengl.GL11.glVertex4i(x, y, z, w);
    }

    public final void glVertex4d(double x, double y, double z, double w) {
        org.lwjgl.opengl.GL11.glVertex4d(x, y, z, w);
    }

    public final void glVertex4fv(FloatBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex4fv(coords);
    }

    public final void glVertex4sv(ShortBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex4sv(coords);
    }

    public final void glVertex4iv(IntBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex4iv(coords);
    }

    public final void glVertex4dv(DoubleBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex4dv(coords);
    }

    public final void glVertexPointer(int size, int type, int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer);
    }

    public final void glVertexPointer(int size, int type, int stride, long pointer) {
        org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer);
    }

    public final void glVertexPointer(int size, int type, int stride, ShortBuffer pointer) {
        org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer);
    }

    public final void glVertexPointer(int size, int type, int stride, IntBuffer pointer) {
        org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer);
    }

    public final void glVertexPointer(int size, int type, int stride, FloatBuffer pointer) {
        org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer);
    }

    public final void glViewport(int x, int y, int w, int h) {
        org.lwjgl.opengl.GL11.glViewport(x, y, w, h);
    }

    public final boolean glAreTexturesResident(int[] textures, ByteBuffer residences) {
        return org.lwjgl.opengl.GL11.glAreTexturesResident(textures, residences);
    }

    public final void glClipPlane(int plane, double[] equation) {
        org.lwjgl.opengl.GL11.glClipPlane(plane, equation);
    }

    public final void glColor3sv(short[] v) {
        org.lwjgl.opengl.GL11.glColor3sv(v);
    }

    public final void glColor3iv(int[] v) {
        org.lwjgl.opengl.GL11.glColor3iv(v);
    }

    public final void glColor3fv(float[] v) {
        org.lwjgl.opengl.GL11.glColor3fv(v);
    }

    public final void glColor3dv(double[] v) {
        org.lwjgl.opengl.GL11.glColor3dv(v);
    }

    public final void glColor3usv(short[] v) {
        org.lwjgl.opengl.GL11.glColor3usv(v);
    }

    public final void glColor3uiv(int[] v) {
        org.lwjgl.opengl.GL11.glColor3uiv(v);
    }

    public final void glColor4sv(short[] v) {
        org.lwjgl.opengl.GL11.glColor4sv(v);
    }

    public final void glColor4iv(int[] v) {
        org.lwjgl.opengl.GL11.glColor4iv(v);
    }

    public final void glColor4fv(float[] v) {
        org.lwjgl.opengl.GL11.glColor4fv(v);
    }

    public final void glColor4dv(double[] v) {
        org.lwjgl.opengl.GL11.glColor4dv(v);
    }

    public final void glColor4usv(short[] v) {
        org.lwjgl.opengl.GL11.glColor4usv(v);
    }

    public final void glColor4uiv(int[] v) {
        org.lwjgl.opengl.GL11.glColor4uiv(v);
    }

    public final void glDrawPixels(int width, int height, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    public final void glDrawPixels(int width, int height, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    public final void glDrawPixels(int width, int height, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    public final void glEvalCoord1fv(float[] u) {
        org.lwjgl.opengl.GL11.glEvalCoord1fv(u);
    }

    public final void glEvalCoord1dv(double[] u) {
        org.lwjgl.opengl.GL11.glEvalCoord1dv(u);
    }

    public final void glEvalCoord2fv(float[] u) {
        org.lwjgl.opengl.GL11.glEvalCoord2fv(u);
    }

    public final void glEvalCoord2dv(double[] u) {
        org.lwjgl.opengl.GL11.glEvalCoord2dv(u);
    }

    public final void glFeedbackBuffer(int type, float[] buffer) {
        org.lwjgl.opengl.GL11.glFeedbackBuffer(type, buffer);
    }

    public final void glFogiv(int pname, int[] params) {
        org.lwjgl.opengl.GL11.glFogiv(pname, params);
    }

    public final void glFogfv(int pname, float[] params) {
        org.lwjgl.opengl.GL11.glFogfv(pname, params);
    }

    public final void glGenTextures(int[] textures) {
        org.lwjgl.opengl.GL11.glGenTextures(textures);
    }

    public final void glDeleteTextures(int[] textures) {
        org.lwjgl.opengl.GL11.glDeleteTextures(textures);
    }

    public final void glGetClipPlane(int plane, double[] equation) {
        org.lwjgl.opengl.GL11.glGetClipPlane(plane, equation);
    }

    public final void glGetFloatv(int pname, float[] params) {
        org.lwjgl.opengl.GL11.glGetFloatv(pname, params);
    }

    public final void glGetIntegerv(int pname, int[] params) {
        org.lwjgl.opengl.GL11.glGetIntegerv(pname, params);
    }

    public final void glGetDoublev(int pname, double[] params) {
        org.lwjgl.opengl.GL11.glGetDoublev(pname, params);
    }

    public final void glGetLightiv(int light, int pname, int[] data) {
        org.lwjgl.opengl.GL11.glGetLightiv(light, pname, data);
    }

    public final void glGetLightfv(int light, int pname, float[] data) {
        org.lwjgl.opengl.GL11.glGetLightfv(light, pname, data);
    }

    public final void glGetMapiv(int target, int query, int[] data) {
        org.lwjgl.opengl.GL11.glGetMapiv(target, query, data);
    }

    public final void glGetMapfv(int target, int query, float[] data) {
        org.lwjgl.opengl.GL11.glGetMapfv(target, query, data);
    }

    public final void glGetMapdv(int target, int query, double[] data) {
        org.lwjgl.opengl.GL11.glGetMapdv(target, query, data);
    }

    public final void glGetMaterialiv(int face, int pname, int[] data) {
        org.lwjgl.opengl.GL11.glGetMaterialiv(face, pname, data);
    }

    public final void glGetMaterialfv(int face, int pname, float[] data) {
        org.lwjgl.opengl.GL11.glGetMaterialfv(face, pname, data);
    }

    public final void glGetPixelMapfv(int map, float[] data) {
        org.lwjgl.opengl.GL11.glGetPixelMapfv(map, data);
    }

    public final void glGetPixelMapusv(int map, short[] data) {
        org.lwjgl.opengl.GL11.glGetPixelMapusv(map, data);
    }

    public final void glGetPixelMapuiv(int map, int[] data) {
        org.lwjgl.opengl.GL11.glGetPixelMapuiv(map, data);
    }

    public final void glGetTexEnviv(int env, int pname, int[] data) {
        org.lwjgl.opengl.GL11.glGetTexEnviv(env, pname, data);
    }

    public final void glGetTexEnvfv(int env, int pname, float[] data) {
        org.lwjgl.opengl.GL11.glGetTexEnvfv(env, pname, data);
    }

    public final void glGetTexGeniv(int coord, int pname, int[] data) {
        org.lwjgl.opengl.GL11.glGetTexGeniv(coord, pname, data);
    }

    public final void glGetTexGenfv(int coord, int pname, float[] data) {
        org.lwjgl.opengl.GL11.glGetTexGenfv(coord, pname, data);
    }

    public final void glGetTexGendv(int coord, int pname, double[] data) {
        org.lwjgl.opengl.GL11.glGetTexGendv(coord, pname, data);
    }

    public final void glGetTexImage(int tex, int level, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    public final void glGetTexImage(int tex, int level, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    public final void glGetTexImage(int tex, int level, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    public final void glGetTexImage(int tex, int level, int format, int type, double[] pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    public final void glGetTexLevelParameteriv(int target, int level, int pname, int[] params) {
        org.lwjgl.opengl.GL11.glGetTexLevelParameteriv(target, level, pname, params);
    }

    public final void glGetTexLevelParameterfv(int target, int level, int pname, float[] params) {
        org.lwjgl.opengl.GL11.glGetTexLevelParameterfv(target, level, pname, params);
    }

    public final void glGetTexParameteriv(int target, int pname, int[] params) {
        org.lwjgl.opengl.GL11.glGetTexParameteriv(target, pname, params);
    }

    public final void glGetTexParameterfv(int target, int pname, float[] params) {
        org.lwjgl.opengl.GL11.glGetTexParameterfv(target, pname, params);
    }

    public final void glIndexiv(int[] index) {
        org.lwjgl.opengl.GL11.glIndexiv(index);
    }

    public final void glIndexsv(short[] index) {
        org.lwjgl.opengl.GL11.glIndexsv(index);
    }

    public final void glIndexfv(float[] index) {
        org.lwjgl.opengl.GL11.glIndexfv(index);
    }

    public final void glIndexdv(double[] index) {
        org.lwjgl.opengl.GL11.glIndexdv(index);
    }

    public final void glInterleavedArrays(int format, int stride, short[] pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    public final void glInterleavedArrays(int format, int stride, int[] pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    public final void glInterleavedArrays(int format, int stride, float[] pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    public final void glInterleavedArrays(int format, int stride, double[] pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    public final void glLightModeliv(int pname, int[] params) {
        org.lwjgl.opengl.GL11.glLightModeliv(pname, params);
    }

    public final void glLightModelfv(int pname, float[] params) {
        org.lwjgl.opengl.GL11.glLightModelfv(pname, params);
    }

    public final void glLightiv(int light, int pname, int[] params) {
        org.lwjgl.opengl.GL11.glLightiv(light, pname, params);
    }

    public final void glLightfv(int light, int pname, float[] params) {
        org.lwjgl.opengl.GL11.glLightfv(light, pname, params);
    }

    public final void glLoadMatrixf(float[] m) {
        org.lwjgl.opengl.GL11.glLoadMatrixf(m);
    }

    public final void glLoadMatrixd(double[] m) {
        org.lwjgl.opengl.GL11.glLoadMatrixd(m);
    }

    public final void glMap1f(int target, float u1, float u2, int stride, int order, float[] points) {
        org.lwjgl.opengl.GL11.glMap1f(target, u1, u2, stride, order, points);
    }

    public final void glMap1d(int target, double u1, double u2, int stride, int order, double[] points) {
        org.lwjgl.opengl.GL11.glMap1d(target, u1, u2, stride, order, points);
    }

    public final void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, float[] points) {
        org.lwjgl.opengl.GL11.glMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
    }

    public final void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, double[] points) {
        org.lwjgl.opengl.GL11.glMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
    }

    public final void glMaterialiv(int face, int pname, int[] params) {
        org.lwjgl.opengl.GL11.glMaterialiv(face, pname, params);
    }

    public final void glMaterialfv(int face, int pname, float[] params) {
        org.lwjgl.opengl.GL11.glMaterialfv(face, pname, params);
    }

    public final void glMultMatrixf(float[] m) {
        org.lwjgl.opengl.GL11.glMultMatrixf(m);
    }

    public final void glMultMatrixd(double[] m) {
        org.lwjgl.opengl.GL11.glMultMatrixd(m);
    }

    public final void glNormal3fv(float[] v) {
        org.lwjgl.opengl.GL11.glNormal3fv(v);
    }

    public final void glNormal3sv(short[] v) {
        org.lwjgl.opengl.GL11.glNormal3sv(v);
    }

    public final void glNormal3iv(int[] v) {
        org.lwjgl.opengl.GL11.glNormal3iv(v);
    }

    public final void glNormal3dv(double[] v) {
        org.lwjgl.opengl.GL11.glNormal3dv(v);
    }

    public final void glPixelMapfv(int map, float[] values) {
        org.lwjgl.opengl.GL11.glPixelMapfv(map, values);
    }

    public final void glPixelMapusv(int map, short[] values) {
        org.lwjgl.opengl.GL11.glPixelMapusv(map, values);
    }

    public final void glPixelMapuiv(int map, int[] values) {
        org.lwjgl.opengl.GL11.glPixelMapuiv(map, values);
    }

    public final void glPrioritizeTextures(int[] textures, float[] priorities) {
        org.lwjgl.opengl.GL11.glPrioritizeTextures(textures, priorities);
    }

    public final void glRasterPos2iv(int[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos2iv(coords);
    }

    public final void glRasterPos2sv(short[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos2sv(coords);
    }

    public final void glRasterPos2fv(float[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos2fv(coords);
    }

    public final void glRasterPos2dv(double[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos2dv(coords);
    }

    public final void glRasterPos3iv(int[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos3iv(coords);
    }

    public final void glRasterPos3sv(short[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos3sv(coords);
    }

    public final void glRasterPos3fv(float[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos3fv(coords);
    }

    public final void glRasterPos3dv(double[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos3dv(coords);
    }

    public final void glRasterPos4iv(int[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos4iv(coords);
    }

    public final void glRasterPos4sv(short[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos4sv(coords);
    }

    public final void glRasterPos4fv(float[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos4fv(coords);
    }

    public final void glRasterPos4dv(double[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos4dv(coords);
    }

    public final void glReadPixels(int x, int y, int width, int height, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    public final void glReadPixels(int x, int y, int width, int height, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    public final void glReadPixels(int x, int y, int width, int height, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    public final void glRectiv(int[] v1, int[] v2) {
        org.lwjgl.opengl.GL11.glRectiv(v1, v2);
    }

    public final void glRectsv(short[] v1, short[] v2) {
        org.lwjgl.opengl.GL11.glRectsv(v1, v2);
    }

    public final void glRectfv(float[] v1, float[] v2) {
        org.lwjgl.opengl.GL11.glRectfv(v1, v2);
    }

    public final void glRectdv(double[] v1, double[] v2) {
        org.lwjgl.opengl.GL11.glRectdv(v1, v2);
    }

    public final void glSelectBuffer(int[] buffer) {
        org.lwjgl.opengl.GL11.glSelectBuffer(buffer);
    }

    public final void glTexCoord1fv(float[] v) {
        org.lwjgl.opengl.GL11.glTexCoord1fv(v);
    }

    public final void glTexCoord1sv(short[] v) {
        org.lwjgl.opengl.GL11.glTexCoord1sv(v);
    }

    public final void glTexCoord1iv(int[] v) {
        org.lwjgl.opengl.GL11.glTexCoord1iv(v);
    }

    public final void glTexCoord1dv(double[] v) {
        org.lwjgl.opengl.GL11.glTexCoord1dv(v);
    }

    public final void glTexCoord2fv(float[] v) {
        org.lwjgl.opengl.GL11.glTexCoord2fv(v);
    }

    public final void glTexCoord2sv(short[] v) {
        org.lwjgl.opengl.GL11.glTexCoord2sv(v);
    }

    public final void glTexCoord2iv(int[] v) {
        org.lwjgl.opengl.GL11.glTexCoord2iv(v);
    }

    public final void glTexCoord2dv(double[] v) {
        org.lwjgl.opengl.GL11.glTexCoord2dv(v);
    }

    public final void glTexCoord3fv(float[] v) {
        org.lwjgl.opengl.GL11.glTexCoord3fv(v);
    }

    public final void glTexCoord3sv(short[] v) {
        org.lwjgl.opengl.GL11.glTexCoord3sv(v);
    }

    public final void glTexCoord3iv(int[] v) {
        org.lwjgl.opengl.GL11.glTexCoord3iv(v);
    }

    public final void glTexCoord3dv(double[] v) {
        org.lwjgl.opengl.GL11.glTexCoord3dv(v);
    }

    public final void glTexCoord4fv(float[] v) {
        org.lwjgl.opengl.GL11.glTexCoord4fv(v);
    }

    public final void glTexCoord4sv(short[] v) {
        org.lwjgl.opengl.GL11.glTexCoord4sv(v);
    }

    public final void glTexCoord4iv(int[] v) {
        org.lwjgl.opengl.GL11.glTexCoord4iv(v);
    }

    public final void glTexCoord4dv(double[] v) {
        org.lwjgl.opengl.GL11.glTexCoord4dv(v);
    }

    public final void glTexEnviv(int target, int pname, int[] params) {
        org.lwjgl.opengl.GL11.glTexEnviv(target, pname, params);
    }

    public final void glTexEnvfv(int target, int pname, float[] params) {
        org.lwjgl.opengl.GL11.glTexEnvfv(target, pname, params);
    }

    public final void glTexGeniv(int coord, int pname, int[] params) {
        org.lwjgl.opengl.GL11.glTexGeniv(coord, pname, params);
    }

    public final void glTexGenfv(int coord, int pname, float[] params) {
        org.lwjgl.opengl.GL11.glTexGenfv(coord, pname, params);
    }

    public final void glTexGendv(int coord, int pname, double[] params) {
        org.lwjgl.opengl.GL11.glTexGendv(coord, pname, params);
    }

    public final void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public final void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public final void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public final void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, double[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public final void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public final void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public final void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public final void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, double[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public final void glTexParameteriv(int target, int pname, int[] params) {
        org.lwjgl.opengl.GL11.glTexParameteriv(target, pname, params);
    }

    public final void glTexParameterfv(int target, int pname, float[] params) {
        org.lwjgl.opengl.GL11.glTexParameterfv(target, pname, params);
    }

    public final void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public final void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public final void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public final void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, double[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public final void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public final void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public final void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public final void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, double[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public final void glVertex2fv(float[] coords) {
        org.lwjgl.opengl.GL11.glVertex2fv(coords);
    }

    public final void glVertex2sv(short[] coords) {
        org.lwjgl.opengl.GL11.glVertex2sv(coords);
    }

    public final void glVertex2iv(int[] coords) {
        org.lwjgl.opengl.GL11.glVertex2iv(coords);
    }

    public final void glVertex2dv(double[] coords) {
        org.lwjgl.opengl.GL11.glVertex2dv(coords);
    }

    public final void glVertex3fv(float[] coords) {
        org.lwjgl.opengl.GL11.glVertex3fv(coords);
    }

    public final void glVertex3sv(short[] coords) {
        org.lwjgl.opengl.GL11.glVertex3sv(coords);
    }

    public final void glVertex3iv(int[] coords) {
        org.lwjgl.opengl.GL11.glVertex3iv(coords);
    }

    public final void glVertex3dv(double[] coords) {
        org.lwjgl.opengl.GL11.glVertex3dv(coords);
    }

    public final void glVertex4fv(float[] coords) {
        org.lwjgl.opengl.GL11.glVertex4fv(coords);
    }

    public final void glVertex4sv(short[] coords) {
        org.lwjgl.opengl.GL11.glVertex4sv(coords);
    }

    public final void glVertex4iv(int[] coords) {
        org.lwjgl.opengl.GL11.glVertex4iv(coords);
    }

    public final void glVertex4dv(double[] coords) {
        org.lwjgl.opengl.GL11.glVertex4dv(coords);
    }

    public final void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    public final void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    public final void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    public final void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    public final void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    public final void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    public final void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL12.glCopyTexSubImage3D(target, level, xoffset, yoffset, zoffset, x, y, width, height);
    }

    public final void glDrawRangeElements(int mode, int start, int end, int count, int type, long indices) {
        org.lwjgl.opengl.GL12.glDrawRangeElements(mode, start, end, count, type, indices);
    }

    public final void glDrawRangeElements(int mode, int start, int end, int type, ByteBuffer indices) {
        org.lwjgl.opengl.GL12.glDrawRangeElements(mode, start, end, type, indices);
    }

    public final void glDrawRangeElements(int mode, int start, int end, ByteBuffer indices) {
        org.lwjgl.opengl.GL12.glDrawRangeElements(mode, start, end, indices);
    }

    public final void glDrawRangeElements(int mode, int start, int end, ShortBuffer indices) {
        org.lwjgl.opengl.GL12.glDrawRangeElements(mode, start, end, indices);
    }

    public final void glDrawRangeElements(int mode, int start, int end, IntBuffer indices) {
        org.lwjgl.opengl.GL12.glDrawRangeElements(mode, start, end, indices);
    }

    public final void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    public final void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    public final void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    public final void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, double[] pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    public final void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, double[] pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
        org.lwjgl.opengl.GL13.glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    public final void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer data) {
        org.lwjgl.opengl.GL13.glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, data);
    }

    public final void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
        org.lwjgl.opengl.GL13.glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
    }

    public final void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, ByteBuffer data) {
        org.lwjgl.opengl.GL13.glCompressedTexImage2D(target, level, internalformat, width, height, border, data);
    }

    public final void glCompressedTexImage1D(int target, int level, int internalformat, int width, int border, int imageSize, long data) {
        org.lwjgl.opengl.GL13.glCompressedTexImage1D(target, level, internalformat, width, border, imageSize, data);
    }

    public final void glCompressedTexImage1D(int target, int level, int internalformat, int width, int border, ByteBuffer data) {
        org.lwjgl.opengl.GL13.glCompressedTexImage1D(target, level, internalformat, width, border, data);
    }

    public final void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        org.lwjgl.opengl.GL13.glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    public final void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
        org.lwjgl.opengl.GL13.glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data);
    }

    public final void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
        org.lwjgl.opengl.GL13.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    public final void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
        org.lwjgl.opengl.GL13.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, data);
    }

    public final void glCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int imageSize, long data) {
        org.lwjgl.opengl.GL13.glCompressedTexSubImage1D(target, level, xoffset, width, format, imageSize, data);
    }

    public final void glCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, ByteBuffer data) {
        org.lwjgl.opengl.GL13.glCompressedTexSubImage1D(target, level, xoffset, width, format, data);
    }

    public final void glGetCompressedTexImage(int target, int level, ByteBuffer pixels) {
        org.lwjgl.opengl.GL13.glGetCompressedTexImage(target, level, pixels);
    }

    public final void glGetCompressedTexImage(int target, int level, long pixels) {
        org.lwjgl.opengl.GL13.glGetCompressedTexImage(target, level, pixels);
    }

    public final void glSampleCoverage(float value, boolean invert) {
        org.lwjgl.opengl.GL13.glSampleCoverage(value, invert);
    }

    public final void glActiveTexture(int texture) {
        org.lwjgl.opengl.GL13.glActiveTexture(texture);
    }

    public final void glClientActiveTexture(int texture) {
        org.lwjgl.opengl.GL13.glClientActiveTexture(texture);
    }

    public final void glMultiTexCoord1f(int texture, float s) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1f(texture, s);
    }

    public final void glMultiTexCoord1s(int texture, short s) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1s(texture, s);
    }

    public final void glMultiTexCoord1i(int texture, int s) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1i(texture, s);
    }

    public final void glMultiTexCoord1d(int texture, double s) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1d(texture, s);
    }

    public final void glMultiTexCoord1fv(int texture, FloatBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1fv(texture, v);
    }

    public final void glMultiTexCoord1sv(int texture, ShortBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1sv(texture, v);
    }

    public final void glMultiTexCoord1iv(int texture, IntBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1iv(texture, v);
    }

    public final void glMultiTexCoord1dv(int texture, DoubleBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1dv(texture, v);
    }

    public final void glMultiTexCoord2f(int texture, float s, float t) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2f(texture, s, t);
    }

    public final void glMultiTexCoord2s(int texture, short s, short t) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2s(texture, s, t);
    }

    public final void glMultiTexCoord2i(int texture, int s, int t) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2i(texture, s, t);
    }

    public final void glMultiTexCoord2d(int texture, double s, double t) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2d(texture, s, t);
    }

    public final void glMultiTexCoord2fv(int texture, FloatBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2fv(texture, v);
    }

    public final void glMultiTexCoord2sv(int texture, ShortBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2sv(texture, v);
    }

    public final void glMultiTexCoord2iv(int texture, IntBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2iv(texture, v);
    }

    public final void glMultiTexCoord2dv(int texture, DoubleBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2dv(texture, v);
    }

    public final void glMultiTexCoord3f(int texture, float s, float t, float r) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3f(texture, s, t, r);
    }

    public final void glMultiTexCoord3s(int texture, short s, short t, short r) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3s(texture, s, t, r);
    }

    public final void glMultiTexCoord3i(int texture, int s, int t, int r) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3i(texture, s, t, r);
    }

    public final void glMultiTexCoord3d(int texture, double s, double t, double r) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3d(texture, s, t, r);
    }

    public final void glMultiTexCoord3fv(int texture, FloatBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3fv(texture, v);
    }

    public final void glMultiTexCoord3sv(int texture, ShortBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3sv(texture, v);
    }

    public final void glMultiTexCoord3iv(int texture, IntBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3iv(texture, v);
    }

    public final void glMultiTexCoord3dv(int texture, DoubleBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3dv(texture, v);
    }

    public final void glMultiTexCoord4f(int texture, float s, float t, float r, float q) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4f(texture, s, t, r, q);
    }

    public final void glMultiTexCoord4s(int texture, short s, short t, short r, short q) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4s(texture, s, t, r, q);
    }

    public final void glMultiTexCoord4i(int texture, int s, int t, int r, int q) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4i(texture, s, t, r, q);
    }

    public final void glMultiTexCoord4d(int texture, double s, double t, double r, double q) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4d(texture, s, t, r, q);
    }

    public final void glMultiTexCoord4fv(int texture, FloatBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4fv(texture, v);
    }

    public final void glMultiTexCoord4sv(int texture, ShortBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4sv(texture, v);
    }

    public final void glMultiTexCoord4iv(int texture, IntBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4iv(texture, v);
    }

    public final void glMultiTexCoord4dv(int texture, DoubleBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4dv(texture, v);
    }

    public final void glLoadTransposeMatrixf(FloatBuffer m) {
        org.lwjgl.opengl.GL13.glLoadTransposeMatrixf(m);
    }

    public final void glLoadTransposeMatrixd(DoubleBuffer m) {
        org.lwjgl.opengl.GL13.glLoadTransposeMatrixd(m);
    }

    public final void glMultTransposeMatrixf(FloatBuffer m) {
        org.lwjgl.opengl.GL13.glMultTransposeMatrixf(m);
    }

    public final void glMultTransposeMatrixd(DoubleBuffer m) {
        org.lwjgl.opengl.GL13.glMultTransposeMatrixd(m);
    }

    public final void glMultiTexCoord1fv(int texture, float[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1fv(texture, v);
    }

    public final void glMultiTexCoord1sv(int texture, short[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1sv(texture, v);
    }

    public final void glMultiTexCoord1iv(int texture, int[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1iv(texture, v);
    }

    public final void glMultiTexCoord1dv(int texture, double[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1dv(texture, v);
    }

    public final void glMultiTexCoord2fv(int texture, float[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2fv(texture, v);
    }

    public final void glMultiTexCoord2sv(int texture, short[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2sv(texture, v);
    }

    public final void glMultiTexCoord2iv(int texture, int[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2iv(texture, v);
    }

    public final void glMultiTexCoord2dv(int texture, double[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2dv(texture, v);
    }

    public final void glMultiTexCoord3fv(int texture, float[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3fv(texture, v);
    }

    public final void glMultiTexCoord3sv(int texture, short[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3sv(texture, v);
    }

    public final void glMultiTexCoord3iv(int texture, int[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3iv(texture, v);
    }

    public final void glMultiTexCoord3dv(int texture, double[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3dv(texture, v);
    }

    public final void glMultiTexCoord4fv(int texture, float[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4fv(texture, v);
    }

    public final void glMultiTexCoord4sv(int texture, short[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4sv(texture, v);
    }

    public final void glMultiTexCoord4iv(int texture, int[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4iv(texture, v);
    }

    public final void glMultiTexCoord4dv(int texture, double[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4dv(texture, v);
    }

    public final void glLoadTransposeMatrixf(float[] m) {
        org.lwjgl.opengl.GL13.glLoadTransposeMatrixf(m);
    }

    public final void glLoadTransposeMatrixd(double[] m) {
        org.lwjgl.opengl.GL13.glLoadTransposeMatrixd(m);
    }

    public final void glMultTransposeMatrixf(float[] m) {
        org.lwjgl.opengl.GL13.glMultTransposeMatrixf(m);
    }

    public final void glMultTransposeMatrixd(double[] m) {
        org.lwjgl.opengl.GL13.glMultTransposeMatrixd(m);
    }

    public final void glBlendColor(float red, float green, float blue, float alpha) {
        org.lwjgl.opengl.GL14.glBlendColor(red, green, blue, alpha);
    }

    public final void glBlendEquation(int mode) {
        org.lwjgl.opengl.GL14.glBlendEquation(mode);
    }

    public final void glFogCoordf(float coord) {
        org.lwjgl.opengl.GL14.glFogCoordf(coord);
    }

    public final void glFogCoordd(double coord) {
        org.lwjgl.opengl.GL14.glFogCoordd(coord);
    }

    public final void glFogCoordfv(FloatBuffer coord) {
        org.lwjgl.opengl.GL14.glFogCoordfv(coord);
    }

    public final void glFogCoorddv(DoubleBuffer coord) {
        org.lwjgl.opengl.GL14.glFogCoorddv(coord);
    }

    public final void glFogCoordPointer(int type, int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL14.glFogCoordPointer(type, stride, pointer);
    }

    public final void glFogCoordPointer(int type, int stride, long pointer) {
        org.lwjgl.opengl.GL14.glFogCoordPointer(type, stride, pointer);
    }

    public final void glFogCoordPointer(int type, int stride, ShortBuffer pointer) {
        org.lwjgl.opengl.GL14.glFogCoordPointer(type, stride, pointer);
    }

    public final void glFogCoordPointer(int type, int stride, FloatBuffer pointer) {
        org.lwjgl.opengl.GL14.glFogCoordPointer(type, stride, pointer);
    }

    public final void glMultiDrawArrays(int mode, IntBuffer first, IntBuffer count) {
        org.lwjgl.opengl.GL14.glMultiDrawArrays(mode, first, count);
    }

    public final void glMultiDrawElements(int mode, IntBuffer count, int type, PointerBuffer indices) {
        org.lwjgl.opengl.GL14.glMultiDrawElements(mode, count, type, indices);
    }

    public final void glPointParameterf(int pname, float param) {
        org.lwjgl.opengl.GL14.glPointParameterf(pname, param);
    }

    public final void glPointParameteri(int pname, int param) {
        org.lwjgl.opengl.GL14.glPointParameteri(pname, param);
    }

    public final void glPointParameterfv(int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL14.glPointParameterfv(pname, params);
    }

    public final void glPointParameteriv(int pname, IntBuffer params) {
        org.lwjgl.opengl.GL14.glPointParameteriv(pname, params);
    }

    public final void glSecondaryColor3b(byte red, byte green, byte blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3b(red, green, blue);
    }

    public final void glSecondaryColor3s(short red, short green, short blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3s(red, green, blue);
    }

    public final void glSecondaryColor3i(int red, int green, int blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3i(red, green, blue);
    }

    public final void glSecondaryColor3f(float red, float green, float blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3f(red, green, blue);
    }

    public final void glSecondaryColor3d(double red, double green, double blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3d(red, green, blue);
    }

    public final void glSecondaryColor3ub(byte red, byte green, byte blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3ub(red, green, blue);
    }

    public final void glSecondaryColor3us(short red, short green, short blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3us(red, green, blue);
    }

    public final void glSecondaryColor3ui(int red, int green, int blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3ui(red, green, blue);
    }

    public final void glSecondaryColor3bv(ByteBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3bv(v);
    }

    public final void glSecondaryColor3sv(ShortBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3sv(v);
    }

    public final void glSecondaryColor3iv(IntBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3iv(v);
    }

    public final void glSecondaryColor3fv(FloatBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3fv(v);
    }

    public final void glSecondaryColor3dv(DoubleBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3dv(v);
    }

    public final void glSecondaryColor3ubv(ByteBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3ubv(v);
    }

    public final void glSecondaryColor3usv(ShortBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3usv(v);
    }

    public final void glSecondaryColor3uiv(IntBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3uiv(v);
    }

    public final void glSecondaryColorPointer(int size, int type, int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL14.glSecondaryColorPointer(size, type, stride, pointer);
    }

    public final void glSecondaryColorPointer(int size, int type, int stride, long pointer) {
        org.lwjgl.opengl.GL14.glSecondaryColorPointer(size, type, stride, pointer);
    }

    public final void glSecondaryColorPointer(int size, int type, int stride, ShortBuffer pointer) {
        org.lwjgl.opengl.GL14.glSecondaryColorPointer(size, type, stride, pointer);
    }

    public final void glSecondaryColorPointer(int size, int type, int stride, IntBuffer pointer) {
        org.lwjgl.opengl.GL14.glSecondaryColorPointer(size, type, stride, pointer);
    }

    public final void glSecondaryColorPointer(int size, int type, int stride, FloatBuffer pointer) {
        org.lwjgl.opengl.GL14.glSecondaryColorPointer(size, type, stride, pointer);
    }

    public final void glBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
        org.lwjgl.opengl.GL14.glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
    }

    public final void glWindowPos2i(int x, int y) {
        org.lwjgl.opengl.GL14.glWindowPos2i(x, y);
    }

    public final void glWindowPos2s(short x, short y) {
        org.lwjgl.opengl.GL14.glWindowPos2s(x, y);
    }

    public final void glWindowPos2f(float x, float y) {
        org.lwjgl.opengl.GL14.glWindowPos2f(x, y);
    }

    public final void glWindowPos2d(double x, double y) {
        org.lwjgl.opengl.GL14.glWindowPos2d(x, y);
    }

    public final void glWindowPos2iv(IntBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos2iv(p);
    }

    public final void glWindowPos2sv(ShortBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos2sv(p);
    }

    public final void glWindowPos2fv(FloatBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos2fv(p);
    }

    public final void glWindowPos2dv(DoubleBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos2dv(p);
    }

    public final void glWindowPos3i(int x, int y, int z) {
        org.lwjgl.opengl.GL14.glWindowPos3i(x, y, z);
    }

    public final void glWindowPos3s(short x, short y, short z) {
        org.lwjgl.opengl.GL14.glWindowPos3s(x, y, z);
    }

    public final void glWindowPos3f(float x, float y, float z) {
        org.lwjgl.opengl.GL14.glWindowPos3f(x, y, z);
    }

    public final void glWindowPos3d(double x, double y, double z) {
        org.lwjgl.opengl.GL14.glWindowPos3d(x, y, z);
    }

    public final void glWindowPos3iv(IntBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos3iv(p);
    }

    public final void glWindowPos3sv(ShortBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos3sv(p);
    }

    public final void glWindowPos3fv(FloatBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos3fv(p);
    }

    public final void glWindowPos3dv(DoubleBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos3dv(p);
    }

    public final void glFogCoordfv(float[] coord) {
        org.lwjgl.opengl.GL14.glFogCoordfv(coord);
    }

    public final void glFogCoorddv(double[] coord) {
        org.lwjgl.opengl.GL14.glFogCoorddv(coord);
    }

    public final void glMultiDrawArrays(int mode, int[] first, int[] count) {
        org.lwjgl.opengl.GL14.glMultiDrawArrays(mode, first, count);
    }

    public final void glMultiDrawElements(int mode, int[] count, int type, PointerBuffer indices) {
        org.lwjgl.opengl.GL14.glMultiDrawElements(mode, count, type, indices);
    }

    public final void glPointParameterfv(int pname, float[] params) {
        org.lwjgl.opengl.GL14.glPointParameterfv(pname, params);
    }

    public final void glPointParameteriv(int pname, int[] params) {
        org.lwjgl.opengl.GL14.glPointParameteriv(pname, params);
    }

    public final void glSecondaryColor3sv(short[] v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3sv(v);
    }

    public final void glSecondaryColor3iv(int[] v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3iv(v);
    }

    public final void glSecondaryColor3fv(float[] v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3fv(v);
    }

    public final void glSecondaryColor3dv(double[] v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3dv(v);
    }

    public final void glSecondaryColor3usv(short[] v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3usv(v);
    }

    public final void glSecondaryColor3uiv(int[] v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3uiv(v);
    }

    public final void glWindowPos2iv(int[] p) {
        org.lwjgl.opengl.GL14.glWindowPos2iv(p);
    }

    public final void glWindowPos2sv(short[] p) {
        org.lwjgl.opengl.GL14.glWindowPos2sv(p);
    }

    public final void glWindowPos2fv(float[] p) {
        org.lwjgl.opengl.GL14.glWindowPos2fv(p);
    }

    public final void glWindowPos2dv(double[] p) {
        org.lwjgl.opengl.GL14.glWindowPos2dv(p);
    }

    public final void glWindowPos3iv(int[] p) {
        org.lwjgl.opengl.GL14.glWindowPos3iv(p);
    }

    public final void glWindowPos3sv(short[] p) {
        org.lwjgl.opengl.GL14.glWindowPos3sv(p);
    }

    public final void glWindowPos3fv(float[] p) {
        org.lwjgl.opengl.GL14.glWindowPos3fv(p);
    }

    public final void glWindowPos3dv(double[] p) {
        org.lwjgl.opengl.GL14.glWindowPos3dv(p);
    }

    public final void glBindBuffer(int target, int buffer) {
        org.lwjgl.opengl.GL15.glBindBuffer(target, buffer);
    }

    public final void glDeleteBuffers(IntBuffer buffers) {
        org.lwjgl.opengl.GL15.glDeleteBuffers(buffers);
    }

    public final void glDeleteBuffers(int buffer) {
        org.lwjgl.opengl.GL15.glDeleteBuffers(buffer);
    }

    public final void glGenBuffers(IntBuffer buffers) {
        org.lwjgl.opengl.GL15.glGenBuffers(buffers);
    }

    public final int glGenBuffers() {
        return org.lwjgl.opengl.GL15.glGenBuffers();
    }

    public final boolean glIsBuffer(int buffer) {
        return org.lwjgl.opengl.GL15.glIsBuffer(buffer);
    }

    public final void glBufferData(int target, long size, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, size, usage);
    }

    public final void glBufferData(int target, ByteBuffer data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    public final void glBufferData(int target, ShortBuffer data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    public final void glBufferData(int target, IntBuffer data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    public final void glBufferData(int target, LongBuffer data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    public final void glBufferData(int target, FloatBuffer data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    public final void glBufferData(int target, DoubleBuffer data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    public final void glBufferSubData(int target, long offset, ByteBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    public final void glBufferSubData(int target, long offset, ShortBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    public final void glBufferSubData(int target, long offset, IntBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    public final void glBufferSubData(int target, long offset, LongBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    public final void glBufferSubData(int target, long offset, FloatBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    public final void glBufferSubData(int target, long offset, DoubleBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    public final void glGetBufferSubData(int target, long offset, ByteBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    public final void glGetBufferSubData(int target, long offset, ShortBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    public final void glGetBufferSubData(int target, long offset, IntBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    public final void glGetBufferSubData(int target, long offset, LongBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    public final void glGetBufferSubData(int target, long offset, FloatBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    public final void glGetBufferSubData(int target, long offset, DoubleBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    public final ByteBuffer glMapBuffer(int target, int access) {
        return org.lwjgl.opengl.GL15.glMapBuffer(target, access);
    }

    public final ByteBuffer glMapBuffer(int target, int access, ByteBuffer old_buffer) {
        return org.lwjgl.opengl.GL15.glMapBuffer(target, access, old_buffer);
    }

    public final ByteBuffer glMapBuffer(int target, int access, long length, ByteBuffer old_buffer) {
        return org.lwjgl.opengl.GL15.glMapBuffer(target, access, length, old_buffer);
    }

    public final boolean glUnmapBuffer(int target) {
        return org.lwjgl.opengl.GL15.glUnmapBuffer(target);
    }

    public final void glGetBufferParameteriv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL15.glGetBufferParameteriv(target, pname, params);
    }

    public final int glGetBufferParameteri(int target, int pname) {
        return org.lwjgl.opengl.GL15.glGetBufferParameteri(target, pname);
    }

    public final void glGetBufferPointerv(int target, int pname, PointerBuffer params) {
        org.lwjgl.opengl.GL15.glGetBufferPointerv(target, pname, params);
    }

    public final long glGetBufferPointer(int target, int pname) {
        return org.lwjgl.opengl.GL15.glGetBufferPointer(target, pname);
    }

    public final void glGenQueries(IntBuffer ids) {
        org.lwjgl.opengl.GL15.glGenQueries(ids);
    }

    public final int glGenQueries() {
        return org.lwjgl.opengl.GL15.glGenQueries();
    }

    public final void glDeleteQueries(IntBuffer ids) {
        org.lwjgl.opengl.GL15.glDeleteQueries(ids);
    }

    public final void glDeleteQueries(int id) {
        org.lwjgl.opengl.GL15.glDeleteQueries(id);
    }

    public final boolean glIsQuery(int id) {
        return org.lwjgl.opengl.GL15.glIsQuery(id);
    }

    public final void glBeginQuery(int target, int id) {
        org.lwjgl.opengl.GL15.glBeginQuery(target, id);
    }

    public final void glEndQuery(int target) {
        org.lwjgl.opengl.GL15.glEndQuery(target);
    }

    public final void glGetQueryiv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL15.glGetQueryiv(target, pname, params);
    }

    public final int glGetQueryi(int target, int pname) {
        return org.lwjgl.opengl.GL15.glGetQueryi(target, pname);
    }

    public final void glGetQueryObjectiv(int id, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL15.glGetQueryObjectiv(id, pname, params);
    }

    public final void glGetQueryObjectiv(int id, int pname, long params) {
        org.lwjgl.opengl.GL15.glGetQueryObjectiv(id, pname, params);
    }

    public final int glGetQueryObjecti(int id, int pname) {
        return org.lwjgl.opengl.GL15.glGetQueryObjecti(id, pname);
    }

    public final void glGetQueryObjectuiv(int id, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL15.glGetQueryObjectuiv(id, pname, params);
    }

    public final void glGetQueryObjectuiv(int id, int pname, long params) {
        org.lwjgl.opengl.GL15.glGetQueryObjectuiv(id, pname, params);
    }

    public final int glGetQueryObjectui(int id, int pname) {
        return org.lwjgl.opengl.GL15.glGetQueryObjectui(id, pname);
    }

    public final void glDeleteBuffers(int[] buffers) {
        org.lwjgl.opengl.GL15.glDeleteBuffers(buffers);
    }

    public final void glGenBuffers(int[] buffers) {
        org.lwjgl.opengl.GL15.glGenBuffers(buffers);
    }

    public final void glBufferData(int target, short[] data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    public final void glBufferData(int target, int[] data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    public final void glBufferData(int target, long[] data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    public final void glBufferData(int target, float[] data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    public final void glBufferData(int target, double[] data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    public final void glBufferSubData(int target, long offset, short[] data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    public final void glBufferSubData(int target, long offset, int[] data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    public final void glBufferSubData(int target, long offset, long[] data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    public final void glBufferSubData(int target, long offset, float[] data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    public final void glBufferSubData(int target, long offset, double[] data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    public final void glGetBufferSubData(int target, long offset, short[] data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    public final void glGetBufferSubData(int target, long offset, int[] data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    public final void glGetBufferSubData(int target, long offset, long[] data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    public final void glGetBufferSubData(int target, long offset, float[] data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    public final void glGetBufferSubData(int target, long offset, double[] data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    public final void glGetBufferParameteriv(int target, int pname, int[] params) {
        org.lwjgl.opengl.GL15.glGetBufferParameteriv(target, pname, params);
    }

    public final void glGenQueries(int[] ids) {
        org.lwjgl.opengl.GL15.glGenQueries(ids);
    }

    public final void glDeleteQueries(int[] ids) {
        org.lwjgl.opengl.GL15.glDeleteQueries(ids);
    }

    public final void glGetQueryiv(int target, int pname, int[] params) {
        org.lwjgl.opengl.GL15.glGetQueryiv(target, pname, params);
    }

    public final void glGetQueryObjectiv(int id, int pname, int[] params) {
        org.lwjgl.opengl.GL15.glGetQueryObjectiv(id, pname, params);
    }

    public final void glGetQueryObjectuiv(int id, int pname, int[] params) {
        org.lwjgl.opengl.GL15.glGetQueryObjectuiv(id, pname, params);
    }

}
