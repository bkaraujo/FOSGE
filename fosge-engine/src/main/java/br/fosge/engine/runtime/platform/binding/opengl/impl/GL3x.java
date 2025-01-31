package br.fosge.engine.runtime.platform.binding.opengl.impl;

import br.fosge.engine.runtime.platform.binding.opengl.api.GL30;
import br.fosge.engine.runtime.platform.binding.opengl.api.GL31;
import br.fosge.engine.runtime.platform.binding.opengl.api.GL32;
import br.fosge.engine.runtime.platform.binding.opengl.api.GL33;
import org.lwjgl.PointerBuffer;

import java.nio.*;

public class GL3x extends GL2x implements GL30, GL31, GL32, GL33 {

    public final String glGetStringi(int name, int index) {
        return org.lwjgl.opengl.GL30.glGetStringi(name, index);
    }

    public final void glClearBufferiv(int buffer, int drawbuffer, IntBuffer value) {
        org.lwjgl.opengl.GL30.glClearBufferiv(buffer, drawbuffer, value);
    }

    public final void glClearBufferuiv(int buffer, int drawbuffer, IntBuffer value) {
        org.lwjgl.opengl.GL30.glClearBufferuiv(buffer, drawbuffer, value);
    }

    public final void glClearBufferfv(int buffer, int drawbuffer, FloatBuffer value) {
        org.lwjgl.opengl.GL30.glClearBufferfv(buffer, drawbuffer, value);
    }

    public final void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil) {
        org.lwjgl.opengl.GL30.glClearBufferfi(buffer, drawbuffer, depth, stencil);
    }

    public final void glVertexAttribI1i(int index, int x) {
        org.lwjgl.opengl.GL30.glVertexAttribI1i(index, x);
    }

    public final void glVertexAttribI2i(int index, int x, int y) {
        org.lwjgl.opengl.GL30.glVertexAttribI2i(index, x, y);
    }

    public final void glVertexAttribI3i(int index, int x, int y, int z) {
        org.lwjgl.opengl.GL30.glVertexAttribI3i(index, x, y, z);
    }

    public final void glVertexAttribI4i(int index, int x, int y, int z, int w) {
        org.lwjgl.opengl.GL30.glVertexAttribI4i(index, x, y, z, w);
    }

    public final void glVertexAttribI1ui(int index, int x) {
        org.lwjgl.opengl.GL30.glVertexAttribI1ui(index, x);
    }

    public final void glVertexAttribI2ui(int index, int x, int y) {
        org.lwjgl.opengl.GL30.glVertexAttribI2ui(index, x, y);
    }

    public final void glVertexAttribI3ui(int index, int x, int y, int z) {
        org.lwjgl.opengl.GL30.glVertexAttribI3ui(index, x, y, z);
    }

    public final void glVertexAttribI4ui(int index, int x, int y, int z, int w) {
        org.lwjgl.opengl.GL30.glVertexAttribI4ui(index, x, y, z, w);
    }

    public final void glVertexAttribI1iv(int index, IntBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI1iv(index, v);
    }

    public final void glVertexAttribI2iv(int index, IntBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI2iv(index, v);
    }

    public final void glVertexAttribI3iv(int index, IntBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI3iv(index, v);
    }

    public final void glVertexAttribI4iv(int index, IntBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI4iv(index, v);
    }

    public final void glVertexAttribI1uiv(int index, IntBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI1uiv(index, v);
    }

    public final void glVertexAttribI2uiv(int index, IntBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI2uiv(index, v);
    }

    public final void glVertexAttribI3uiv(int index, IntBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI3uiv(index, v);
    }

    public final void glVertexAttribI4uiv(int index, IntBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI4uiv(index, v);
    }

    public final void glVertexAttribI4bv(int index, ByteBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI4bv(index, v);
    }

    public final void glVertexAttribI4sv(int index, ShortBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI4sv(index, v);
    }

    public final void glVertexAttribI4ubv(int index, ByteBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI4ubv(index, v);
    }

    public final void glVertexAttribI4usv(int index, ShortBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI4usv(index, v);
    }

    public final void glVertexAttribIPointer(int index, int size, int type, int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL30.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    public final void glVertexAttribIPointer(int index, int size, int type, int stride, long pointer) {
        org.lwjgl.opengl.GL30.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    public final void glVertexAttribIPointer(int index, int size, int type, int stride, ShortBuffer pointer) {
        org.lwjgl.opengl.GL30.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    public final void glVertexAttribIPointer(int index, int size, int type, int stride, IntBuffer pointer) {
        org.lwjgl.opengl.GL30.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    public final void glGetVertexAttribIiv(int index, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL30.glGetVertexAttribIiv(index, pname, params);
    }

    public final int glGetVertexAttribIi(int index, int pname) {
        return org.lwjgl.opengl.GL30.glGetVertexAttribIi(index, pname);
    }

    public final void glGetVertexAttribIuiv(int index, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL30.glGetVertexAttribIuiv(index, pname, params);
    }

    public final int glGetVertexAttribIui(int index, int pname) {
        return org.lwjgl.opengl.GL30.glGetVertexAttribIui(index, pname);
    }

    public final void glUniform1ui(int location, int v0) {
        org.lwjgl.opengl.GL30.glUniform1ui(location, v0);
    }

    public final void glUniform2ui(int location, int v0, int v1) {
        org.lwjgl.opengl.GL30.glUniform2ui(location, v0, v1);
    }

    public final void glUniform3ui(int location, int v0, int v1, int v2) {
        org.lwjgl.opengl.GL30.glUniform3ui(location, v0, v1, v2);
    }

    public final void glUniform4ui(int location, int v0, int v1, int v2, int v3) {
        org.lwjgl.opengl.GL30.glUniform4ui(location, v0, v1, v2, v3);
    }

    public final void glUniform1uiv(int location, IntBuffer value) {
        org.lwjgl.opengl.GL30.glUniform1uiv(location, value);
    }

    public final void glUniform2uiv(int location, IntBuffer value) {
        org.lwjgl.opengl.GL30.glUniform2uiv(location, value);
    }

    public final void glUniform3uiv(int location, IntBuffer value) {
        org.lwjgl.opengl.GL30.glUniform3uiv(location, value);
    }

    public final void glUniform4uiv(int location, IntBuffer value) {
        org.lwjgl.opengl.GL30.glUniform4uiv(location, value);
    }

    public final void glGetUniformuiv(int program, int location, IntBuffer params) {
        org.lwjgl.opengl.GL30.glGetUniformuiv(program, location, params);
    }

    public final int glGetUniformui(int program, int location) {
        return org.lwjgl.opengl.GL30.glGetUniformui(program, location);
    }

    public final void glBindFragDataLocation(int program, int colorNumber, ByteBuffer name) {
        org.lwjgl.opengl.GL30.glBindFragDataLocation(program, colorNumber, name);
    }

    public final void glBindFragDataLocation(int program, int colorNumber, CharSequence name) {
        org.lwjgl.opengl.GL30.glBindFragDataLocation(program, colorNumber, name);
    }

    public final int glGetFragDataLocation(int program, ByteBuffer name) {
        return org.lwjgl.opengl.GL30.glGetFragDataLocation(program, name);
    }

    public final int glGetFragDataLocation(int program, CharSequence name) {
        return org.lwjgl.opengl.GL30.glGetFragDataLocation(program, name);
    }

    public final void glBeginConditionalRender(int id, int mode) {
        org.lwjgl.opengl.GL30.glBeginConditionalRender(id, mode);
    }

    public final void glEndConditionalRender() {
        org.lwjgl.opengl.GL30.glEndConditionalRender();
    }

    public final ByteBuffer glMapBufferRange(int target, long offset, long length, int access) {
        return org.lwjgl.opengl.GL30.glMapBufferRange(target, offset, length, access);
    }

    public final ByteBuffer glMapBufferRange(int target, long offset, long length, int access, ByteBuffer old_buffer) {
        return org.lwjgl.opengl.GL30.glMapBufferRange(target, offset, length, access, old_buffer);
    }

    public final void glFlushMappedBufferRange(int target, long offset, long length) {
        org.lwjgl.opengl.GL30.glFlushMappedBufferRange(target, offset, length);
    }

    public final void glClampColor(int target, int clamp) {
        org.lwjgl.opengl.GL30.glClampColor(target, clamp);
    }

    public final boolean glIsRenderbuffer(int renderbuffer) {
        return org.lwjgl.opengl.GL30.glIsRenderbuffer(renderbuffer);
    }

    public final void glBindRenderbuffer(int target, int renderbuffer) {
        org.lwjgl.opengl.GL30.glBindRenderbuffer(target, renderbuffer);
    }

    public final void glDeleteRenderbuffers(IntBuffer renderbuffers) {
        org.lwjgl.opengl.GL30.glDeleteRenderbuffers(renderbuffers);
    }

    public final void glDeleteRenderbuffers(int renderbuffer) {
        org.lwjgl.opengl.GL30.glDeleteRenderbuffers(renderbuffer);
    }

    public final void glGenRenderbuffers(IntBuffer renderbuffers) {
        org.lwjgl.opengl.GL30.glGenRenderbuffers(renderbuffers);
    }

    public final int glGenRenderbuffers() {
        return org.lwjgl.opengl.GL30.glGenRenderbuffers();
    }

    public final void glRenderbufferStorage(int target, int internalformat, int width, int height) {
        org.lwjgl.opengl.GL30.glRenderbufferStorage(target, internalformat, width, height);
    }

    public final void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height) {
        org.lwjgl.opengl.GL30.glRenderbufferStorageMultisample(target, samples, internalformat, width, height);
    }

    public final void glGetRenderbufferParameteriv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL30.glGetRenderbufferParameteriv(target, pname, params);
    }

    public final int glGetRenderbufferParameteri(int target, int pname) {
        return org.lwjgl.opengl.GL30.glGetRenderbufferParameteri(target, pname);
    }

    public final boolean glIsFramebuffer(int framebuffer) {
        return org.lwjgl.opengl.GL30.glIsFramebuffer(framebuffer);
    }

    public final void glBindFramebuffer(int target, int framebuffer) {
        org.lwjgl.opengl.GL30.glBindFramebuffer(target, framebuffer);
    }

    public final void glDeleteFramebuffers(IntBuffer framebuffers) {
        org.lwjgl.opengl.GL30.glDeleteFramebuffers(framebuffers);
    }

    public final void glDeleteFramebuffers(int framebuffer) {
        org.lwjgl.opengl.GL30.glDeleteFramebuffers(framebuffer);
    }

    public final void glGenFramebuffers(IntBuffer framebuffers) {
        org.lwjgl.opengl.GL30.glGenFramebuffers(framebuffers);
    }

    public final int glGenFramebuffers() {
        return org.lwjgl.opengl.GL30.glGenFramebuffers();
    }

    public final int glCheckFramebufferStatus(int target) {
        return org.lwjgl.opengl.GL30.glCheckFramebufferStatus(target);
    }

    public final void glFramebufferTexture1D(int target, int attachment, int textarget, int texture, int level) {
        org.lwjgl.opengl.GL30.glFramebufferTexture1D(target, attachment, textarget, texture, level);
    }

    public final void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level) {
        org.lwjgl.opengl.GL30.glFramebufferTexture2D(target, attachment, textarget, texture, level);
    }

    public final void glFramebufferTexture3D(int target, int attachment, int textarget, int texture, int level, int layer) {
        org.lwjgl.opengl.GL30.glFramebufferTexture3D(target, attachment, textarget, texture, level, layer);
    }

    public final void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
        org.lwjgl.opengl.GL30.glFramebufferTextureLayer(target, attachment, texture, level, layer);
    }

    public final void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer) {
        org.lwjgl.opengl.GL30.glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
    }

    public final void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL30.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    public final int glGetFramebufferAttachmentParameteri(int target, int attachment, int pname) {
        return org.lwjgl.opengl.GL30.glGetFramebufferAttachmentParameteri(target, attachment, pname);
    }

    public final void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        org.lwjgl.opengl.GL30.glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
    }

    public final void glGenerateMipmap(int target) {
        org.lwjgl.opengl.GL30.glGenerateMipmap(target);
    }

    public final void glTexParameterIiv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL30.glTexParameterIiv(target, pname, params);
    }

    public final void glTexParameterIi(int target, int pname, int param) {
        org.lwjgl.opengl.GL30.glTexParameterIi(target, pname, param);
    }

    public final void glTexParameterIuiv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL30.glTexParameterIuiv(target, pname, params);
    }

    public final void glTexParameterIui(int target, int pname, int param) {
        org.lwjgl.opengl.GL30.glTexParameterIui(target, pname, param);
    }

    public final void glGetTexParameterIiv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL30.glGetTexParameterIiv(target, pname, params);
    }

    public final int glGetTexParameterIi(int target, int pname) {
        return org.lwjgl.opengl.GL30.glGetTexParameterIi(target, pname);
    }

    public final void glGetTexParameterIuiv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL30.glGetTexParameterIuiv(target, pname, params);
    }

    public final int glGetTexParameterIui(int target, int pname) {
        return org.lwjgl.opengl.GL30.glGetTexParameterIui(target, pname);
    }

    public final void glColorMaski(int buf, boolean r, boolean g, boolean b, boolean a) {
        org.lwjgl.opengl.GL30.glColorMaski(buf, r, g, b, a);
    }

    public final void glGetBooleani_v(int target, int index, ByteBuffer data) {
        org.lwjgl.opengl.GL30.glGetBooleani_v(target, index, data);
    }

    public final boolean glGetBooleani(int target, int index) {
        return org.lwjgl.opengl.GL30.glGetBooleani(target, index);
    }

    public final void glGetIntegeri_v(int target, int index, IntBuffer data) {
        org.lwjgl.opengl.GL30.glGetIntegeri_v(target, index, data);
    }

    public final int glGetIntegeri(int target, int index) {
        return org.lwjgl.opengl.GL30.glGetIntegeri(target, index);
    }

    public final void glEnablei(int cap, int index) {
        org.lwjgl.opengl.GL30.glEnablei(cap, index);
    }

    public final void glDisablei(int target, int index) {
        org.lwjgl.opengl.GL30.glDisablei(target, index);
    }

    public final boolean glIsEnabledi(int target, int index) {
        return org.lwjgl.opengl.GL30.glIsEnabledi(target, index);
    }

    public final void glBindBufferRange(int target, int index, int buffer, long offset, long size) {
        org.lwjgl.opengl.GL30.glBindBufferRange(target, index, buffer, offset, size);
    }

    public final void glBindBufferBase(int target, int index, int buffer) {
        org.lwjgl.opengl.GL30.glBindBufferBase(target, index, buffer);
    }

    public final void glBeginTransformFeedback(int primitiveMode) {
        org.lwjgl.opengl.GL30.glBeginTransformFeedback(primitiveMode);
    }

    public final void glEndTransformFeedback() {
        org.lwjgl.opengl.GL30.glEndTransformFeedback();
    }

    public final void glTransformFeedbackVaryings(int program, PointerBuffer varyings, int bufferMode) {
        org.lwjgl.opengl.GL30.glTransformFeedbackVaryings(program, varyings, bufferMode);
    }

    public final void glTransformFeedbackVaryings(int program, CharSequence[] varyings, int bufferMode) {
        org.lwjgl.opengl.GL30.glTransformFeedbackVaryings(program, varyings, bufferMode);
    }

    public final void glTransformFeedbackVaryings(int program, CharSequence varying, int bufferMode) {
        org.lwjgl.opengl.GL30.glTransformFeedbackVaryings(program, varying, bufferMode);
    }

    public final void glGetTransformFeedbackVarying(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
        org.lwjgl.opengl.GL30.glGetTransformFeedbackVarying(program, index, length, size, type, name);
    }

    public final String glGetTransformFeedbackVarying(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
        return org.lwjgl.opengl.GL30.glGetTransformFeedbackVarying(program, index, bufSize, size, type);
    }

    public final String glGetTransformFeedbackVarying(int program, int index, IntBuffer size, IntBuffer type) {
        return org.lwjgl.opengl.GL30.glGetTransformFeedbackVarying(program, index, size, type);
    }

    public final void glBindVertexArray(int array) {
        org.lwjgl.opengl.GL30.glBindVertexArray(array);
    }

    public final void glDeleteVertexArrays(IntBuffer arrays) {
        org.lwjgl.opengl.GL30.glDeleteVertexArrays(arrays);
    }

    public final void glDeleteVertexArrays(int array) {
        org.lwjgl.opengl.GL30.glDeleteVertexArrays(array);
    }

    public final void glGenVertexArrays(IntBuffer arrays) {
        org.lwjgl.opengl.GL30.glGenVertexArrays(arrays);
    }

    public final int glGenVertexArrays() {
        return org.lwjgl.opengl.GL30.glGenVertexArrays();
    }

    public final boolean glIsVertexArray(int array) {
        return org.lwjgl.opengl.GL30.glIsVertexArray(array);
    }

    public final void glClearBufferiv(int buffer, int drawbuffer, int[] value) {
        org.lwjgl.opengl.GL30.glClearBufferiv(buffer, drawbuffer, value);
    }

    public final void glClearBufferuiv(int buffer, int drawbuffer, int[] value) {
        org.lwjgl.opengl.GL30.glClearBufferuiv(buffer, drawbuffer, value);
    }

    public final void glClearBufferfv(int buffer, int drawbuffer, float[] value) {
        org.lwjgl.opengl.GL30.glClearBufferfv(buffer, drawbuffer, value);
    }

    public final void glVertexAttribI1iv(int index, int[] v) {
        org.lwjgl.opengl.GL30.glVertexAttribI1iv(index, v);
    }

    public final void glVertexAttribI2iv(int index, int[] v) {
        org.lwjgl.opengl.GL30.glVertexAttribI2iv(index, v);
    }

    public final void glVertexAttribI3iv(int index, int[] v) {
        org.lwjgl.opengl.GL30.glVertexAttribI3iv(index, v);
    }

    public final void glVertexAttribI4iv(int index, int[] v) {
        org.lwjgl.opengl.GL30.glVertexAttribI4iv(index, v);
    }

    public final void glVertexAttribI1uiv(int index, int[] v) {
        org.lwjgl.opengl.GL30.glVertexAttribI1uiv(index, v);
    }

    public final void glVertexAttribI2uiv(int index, int[] v) {
        org.lwjgl.opengl.GL30.glVertexAttribI2uiv(index, v);
    }

    public final void glVertexAttribI3uiv(int index, int[] v) {
        org.lwjgl.opengl.GL30.glVertexAttribI3uiv(index, v);
    }

    public final void glVertexAttribI4uiv(int index, int[] v) {
        org.lwjgl.opengl.GL30.glVertexAttribI4uiv(index, v);
    }

    public final void glVertexAttribI4sv(int index, short[] v) {
        org.lwjgl.opengl.GL30.glVertexAttribI4sv(index, v);
    }

    public final void glVertexAttribI4usv(int index, short[] v) {
        org.lwjgl.opengl.GL30.glVertexAttribI4usv(index, v);
    }

    public final void glGetVertexAttribIiv(int index, int pname, int[] params) {
        org.lwjgl.opengl.GL30.glGetVertexAttribIiv(index, pname, params);
    }

    public final void glGetVertexAttribIuiv(int index, int pname, int[] params) {
        org.lwjgl.opengl.GL30.glGetVertexAttribIuiv(index, pname, params);
    }

    public final void glUniform1uiv(int location, int[] value) {
        org.lwjgl.opengl.GL30.glUniform1uiv(location, value);
    }

    public final void glUniform2uiv(int location, int[] value) {
        org.lwjgl.opengl.GL30.glUniform2uiv(location, value);
    }

    public final void glUniform3uiv(int location, int[] value) {
        org.lwjgl.opengl.GL30.glUniform3uiv(location, value);
    }

    public final void glUniform4uiv(int location, int[] value) {
        org.lwjgl.opengl.GL30.glUniform4uiv(location, value);
    }

    public final void glGetUniformuiv(int program, int location, int[] params) {
        org.lwjgl.opengl.GL30.glGetUniformuiv(program, location, params);
    }

    public final void glDeleteRenderbuffers(int[] renderbuffers) {
        org.lwjgl.opengl.GL30.glDeleteRenderbuffers(renderbuffers);
    }

    public final void glGenRenderbuffers(int[] renderbuffers) {
        org.lwjgl.opengl.GL30.glGenRenderbuffers(renderbuffers);
    }

    public final void glGetRenderbufferParameteriv(int target, int pname, int[] params) {
        org.lwjgl.opengl.GL30.glGetRenderbufferParameteriv(target, pname, params);
    }

    public final void glDeleteFramebuffers(int[] framebuffers) {
        org.lwjgl.opengl.GL30.glDeleteFramebuffers(framebuffers);
    }

    public final void glGenFramebuffers(int[] framebuffers) {
        org.lwjgl.opengl.GL30.glGenFramebuffers(framebuffers);
    }

    public final void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, int[] params) {
        org.lwjgl.opengl.GL30.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    public final void glTexParameterIiv(int target, int pname, int[] params) {
        org.lwjgl.opengl.GL30.glTexParameterIiv(target, pname, params);
    }

    public final void glTexParameterIuiv(int target, int pname, int[] params) {
        org.lwjgl.opengl.GL30.glTexParameterIuiv(target, pname, params);
    }

    public final void glGetTexParameterIiv(int target, int pname, int[] params) {
        org.lwjgl.opengl.GL30.glGetTexParameterIiv(target, pname, params);
    }

    public final void glGetTexParameterIuiv(int target, int pname, int[] params) {
        org.lwjgl.opengl.GL30.glGetTexParameterIuiv(target, pname, params);
    }

    public final void glGetIntegeri_v(int target, int index, int[] data) {
        org.lwjgl.opengl.GL30.glGetIntegeri_v(target, index, data);
    }

    public final void glGetTransformFeedbackVarying(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name) {
        org.lwjgl.opengl.GL30.glGetTransformFeedbackVarying(program, index, length, size, type, name);
    }

    public final void glDeleteVertexArrays(int[] arrays) {
        org.lwjgl.opengl.GL30.glDeleteVertexArrays(arrays);
    }

    public final void glGenVertexArrays(int[] arrays) {
        org.lwjgl.opengl.GL30.glGenVertexArrays(arrays);
    }

    public final void glDrawArraysInstanced(int mode, int first, int count, int primcount) {
        org.lwjgl.opengl.GL31.glDrawArraysInstanced(mode, first, count, primcount);
    }

    public final void glDrawElementsInstanced(int mode, int count, int type, long indices, int primcount) {
        org.lwjgl.opengl.GL31.glDrawElementsInstanced(mode, count, type, indices, primcount);
    }

    public final void glDrawElementsInstanced(int mode, int type, ByteBuffer indices, int primcount) {
        org.lwjgl.opengl.GL31.glDrawElementsInstanced(mode, type, indices, primcount);
    }

    public final void glDrawElementsInstanced(int mode, ByteBuffer indices, int primcount) {
        org.lwjgl.opengl.GL31.glDrawElementsInstanced(mode, indices, primcount);
    }

    public final void glDrawElementsInstanced(int mode, ShortBuffer indices, int primcount) {
        org.lwjgl.opengl.GL31.glDrawElementsInstanced(mode, indices, primcount);
    }

    public final void glDrawElementsInstanced(int mode, IntBuffer indices, int primcount) {
        org.lwjgl.opengl.GL31.glDrawElementsInstanced(mode, indices, primcount);
    }

    public final void glCopyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size) {
        org.lwjgl.opengl.GL31.glCopyBufferSubData(readTarget, writeTarget, readOffset, writeOffset, size);
    }

    public final void glPrimitiveRestartIndex(int index) {
        org.lwjgl.opengl.GL31.glPrimitiveRestartIndex(index);
    }

    public final void glTexBuffer(int target, int internalformat, int buffer) {
        org.lwjgl.opengl.GL31.glTexBuffer(target, internalformat, buffer);
    }

    public final void glGetUniformIndices(int program, PointerBuffer uniformNames, IntBuffer uniformIndices) {
        org.lwjgl.opengl.GL31.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

    public final void glGetUniformIndices(int program, CharSequence[] uniformNames, IntBuffer uniformIndices) {
        org.lwjgl.opengl.GL31.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

    public final int glGetUniformIndices(int program, CharSequence uniformName) {
        return org.lwjgl.opengl.GL31.glGetUniformIndices(program, uniformName);
    }

    public final void glGetActiveUniformsiv(int program, IntBuffer uniformIndices, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL31.glGetActiveUniformsiv(program, uniformIndices, pname, params);
    }

    public final int glGetActiveUniformsi(int program, int uniformIndex, int pname) {
        return org.lwjgl.opengl.GL31.glGetActiveUniformsi(program, uniformIndex, pname);
    }

    public final void glGetActiveUniformName(int program, int uniformIndex, IntBuffer length, ByteBuffer uniformName) {
        org.lwjgl.opengl.GL31.glGetActiveUniformName(program, uniformIndex, length, uniformName);
    }

    public final String glGetActiveUniformName(int program, int uniformIndex, int bufSize) {
        return org.lwjgl.opengl.GL31.glGetActiveUniformName(program, uniformIndex, bufSize);
    }

    public final String glGetActiveUniformName(int program, int uniformIndex) {
        return org.lwjgl.opengl.GL31.glGetActiveUniformName(program, uniformIndex);
    }

    public final int glGetUniformBlockIndex(int program, ByteBuffer uniformBlockName) {
        return org.lwjgl.opengl.GL31.glGetUniformBlockIndex(program, uniformBlockName);
    }

    public final int glGetUniformBlockIndex(int program, CharSequence uniformBlockName) {
        return org.lwjgl.opengl.GL31.glGetUniformBlockIndex(program, uniformBlockName);
    }

    public final void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL31.glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    public final int glGetActiveUniformBlocki(int program, int uniformBlockIndex, int pname) {
        return org.lwjgl.opengl.GL31.glGetActiveUniformBlocki(program, uniformBlockIndex, pname);
    }

    public final void glGetActiveUniformBlockName(int program, int uniformBlockIndex, IntBuffer length, ByteBuffer uniformBlockName) {
        org.lwjgl.opengl.GL31.glGetActiveUniformBlockName(program, uniformBlockIndex, length, uniformBlockName);
    }

    public final String glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize) {
        return org.lwjgl.opengl.GL31.glGetActiveUniformBlockName(program, uniformBlockIndex, bufSize);
    }

    public final String glGetActiveUniformBlockName(int program, int uniformBlockIndex) {
        return org.lwjgl.opengl.GL31.glGetActiveUniformBlockName(program, uniformBlockIndex);
    }

    public final void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
        org.lwjgl.opengl.GL31.glUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding);
    }

    public final void glGetUniformIndices(int program, PointerBuffer uniformNames, int[] uniformIndices) {
        org.lwjgl.opengl.GL31.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

    public final void glGetActiveUniformsiv(int program, int[] uniformIndices, int pname, int[] params) {
        org.lwjgl.opengl.GL31.glGetActiveUniformsiv(program, uniformIndices, pname, params);
    }

    public final void glGetActiveUniformName(int program, int uniformIndex, int[] length, ByteBuffer uniformName) {
        org.lwjgl.opengl.GL31.glGetActiveUniformName(program, uniformIndex, length, uniformName);
    }

    public final void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, int[] params) {
        org.lwjgl.opengl.GL31.glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    public final void glGetActiveUniformBlockName(int program, int uniformBlockIndex, int[] length, ByteBuffer uniformBlockName) {
        org.lwjgl.opengl.GL31.glGetActiveUniformBlockName(program, uniformBlockIndex, length, uniformBlockName);
    }

    public final void glGetBufferParameteri64v(int target, int pname, LongBuffer params) {
        org.lwjgl.opengl.GL32.glGetBufferParameteri64v(target, pname, params);
    }

    public final long glGetBufferParameteri64(int target, int pname) {
        return org.lwjgl.opengl.GL32.glGetBufferParameteri64(target, pname);
    }

    public final void glDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsBaseVertex(mode, count, type, indices, basevertex);
    }

    public final void glDrawElementsBaseVertex(int mode, int type, ByteBuffer indices, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsBaseVertex(mode, type, indices, basevertex);
    }

    public final void glDrawElementsBaseVertex(int mode, ByteBuffer indices, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsBaseVertex(mode, indices, basevertex);
    }

    public final void glDrawElementsBaseVertex(int mode, ShortBuffer indices, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsBaseVertex(mode, indices, basevertex);
    }

    public final void glDrawElementsBaseVertex(int mode, IntBuffer indices, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsBaseVertex(mode, indices, basevertex);
    }

    public final void glDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
    }

    public final void glDrawRangeElementsBaseVertex(int mode, int start, int end, int type, ByteBuffer indices, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawRangeElementsBaseVertex(mode, start, end, type, indices, basevertex);
    }

    public final void glDrawRangeElementsBaseVertex(int mode, int start, int end, ByteBuffer indices, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawRangeElementsBaseVertex(mode, start, end, indices, basevertex);
    }

    public final void glDrawRangeElementsBaseVertex(int mode, int start, int end, ShortBuffer indices, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawRangeElementsBaseVertex(mode, start, end, indices, basevertex);
    }

    public final void glDrawRangeElementsBaseVertex(int mode, int start, int end, IntBuffer indices, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawRangeElementsBaseVertex(mode, start, end, indices, basevertex);
    }

    public final void glDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices, int primcount, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsInstancedBaseVertex(mode, count, type, indices, primcount, basevertex);
    }

    public final void glDrawElementsInstancedBaseVertex(int mode, int type, ByteBuffer indices, int primcount, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsInstancedBaseVertex(mode, type, indices, primcount, basevertex);
    }

    public final void glDrawElementsInstancedBaseVertex(int mode, ByteBuffer indices, int primcount, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsInstancedBaseVertex(mode, indices, primcount, basevertex);
    }

    public final void glDrawElementsInstancedBaseVertex(int mode, ShortBuffer indices, int primcount, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsInstancedBaseVertex(mode, indices, primcount, basevertex);
    }

    public final void glDrawElementsInstancedBaseVertex(int mode, IntBuffer indices, int primcount, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsInstancedBaseVertex(mode, indices, primcount, basevertex);
    }

    public final void glMultiDrawElementsBaseVertex(int mode, IntBuffer count, int type, PointerBuffer indices, IntBuffer basevertex) {
        org.lwjgl.opengl.GL32.glMultiDrawElementsBaseVertex(mode, count, type, indices, basevertex);
    }

    public final void glProvokingVertex(int mode) {
        org.lwjgl.opengl.GL32.glProvokingVertex(mode);
    }

    public final void glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
        org.lwjgl.opengl.GL32.glTexImage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
    }

    public final void glTexImage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
        org.lwjgl.opengl.GL32.glTexImage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
    }

    public final void glGetMultisamplefv(int pname, int index, FloatBuffer val) {
        org.lwjgl.opengl.GL32.glGetMultisamplefv(pname, index, val);
    }

    public final float glGetMultisamplef(int pname, int index) {
        return org.lwjgl.opengl.GL32.glGetMultisamplef(pname, index);
    }

    public final void glSampleMaski(int index, int mask) {
        org.lwjgl.opengl.GL32.glSampleMaski(index, mask);
    }

    public final void glFramebufferTexture(int target, int attachment, int texture, int level) {
        org.lwjgl.opengl.GL32.glFramebufferTexture(target, attachment, texture, level);
    }

    public final long glFenceSync(int condition, int flags) {
        return org.lwjgl.opengl.GL32.glFenceSync(condition, flags);
    }

    public final boolean glIsSync(long sync) {
        return org.lwjgl.opengl.GL32.glIsSync(sync);
    }

    public final void glDeleteSync(long sync) {
        org.lwjgl.opengl.GL32.glDeleteSync(sync);
    }

    public final int glClientWaitSync(long sync, int flags, long timeout) {
        return org.lwjgl.opengl.GL32.glClientWaitSync(sync, flags, timeout);
    }

    public final void glWaitSync(long sync, int flags, long timeout) {
        org.lwjgl.opengl.GL32.glWaitSync(sync, flags, timeout);
    }

    public final void glGetInteger64v(int pname, LongBuffer params) {
        org.lwjgl.opengl.GL32.glGetInteger64v(pname, params);
    }

    public final long glGetInteger64(int pname) {
        return org.lwjgl.opengl.GL32.glGetInteger64(pname);
    }

    public final void glGetInteger64i_v(int pname, int index, LongBuffer params) {
        org.lwjgl.opengl.GL32.glGetInteger64i_v(pname, index, params);
    }

    public final long glGetInteger64i(int pname, int index) {
        return org.lwjgl.opengl.GL32.glGetInteger64i(pname, index);
    }

    public final void glGetSynciv(long sync, int pname, IntBuffer length, IntBuffer values) {
        org.lwjgl.opengl.GL32.glGetSynciv(sync, pname, length, values);
    }

    public final int glGetSynci(long sync, int pname, IntBuffer length) {
        return org.lwjgl.opengl.GL32.glGetSynci(sync, pname, length);
    }

    public final void glGetBufferParameteri64v(int target, int pname, long[] params) {
        org.lwjgl.opengl.GL32.glGetBufferParameteri64v(target, pname, params);
    }

    public final void glMultiDrawElementsBaseVertex(int mode, int[] count, int type, PointerBuffer indices, int[] basevertex) {
        org.lwjgl.opengl.GL32.glMultiDrawElementsBaseVertex(mode, count, type, indices, basevertex);
    }

    public final void glGetMultisamplefv(int pname, int index, float[] val) {
        org.lwjgl.opengl.GL32.glGetMultisamplefv(pname, index, val);
    }

    public final void glGetInteger64v(int pname, long[] params) {
        org.lwjgl.opengl.GL32.glGetInteger64v(pname, params);
    }

    public final void glGetInteger64i_v(int pname, int index, long[] params) {
        org.lwjgl.opengl.GL32.glGetInteger64i_v(pname, index, params);
    }

    public final void glGetSynciv(long sync, int pname, int[] length, int[] values) {
        org.lwjgl.opengl.GL32.glGetSynciv(sync, pname, length, values);
    }

    public final void glBindFragDataLocationIndexed(int program, int colorNumber, int index, ByteBuffer name) {
        org.lwjgl.opengl.GL33.glBindFragDataLocationIndexed(program, colorNumber, index, name);
    }

    public final void glBindFragDataLocationIndexed(int program, int colorNumber, int index, CharSequence name) {
        org.lwjgl.opengl.GL33.glBindFragDataLocationIndexed(program, colorNumber, index, name);
    }

    public final int glGetFragDataIndex(int program, ByteBuffer name) {
        return org.lwjgl.opengl.GL33.glGetFragDataIndex(program, name);
    }

    public final int glGetFragDataIndex(int program, CharSequence name) {
        return org.lwjgl.opengl.GL33.glGetFragDataIndex(program, name);
    }

    public final void glGenSamplers(IntBuffer samplers) {
        org.lwjgl.opengl.GL33.glGenSamplers(samplers);
    }

    public final int glGenSamplers() {
        return org.lwjgl.opengl.GL33.glGenSamplers();
    }

    public final void glDeleteSamplers(IntBuffer samplers) {
        org.lwjgl.opengl.GL33.glDeleteSamplers(samplers);
    }

    public final void glDeleteSamplers(int sampler) {
        org.lwjgl.opengl.GL33.glDeleteSamplers(sampler);
    }

    public final boolean glIsSampler(int sampler) {
        return org.lwjgl.opengl.GL33.glIsSampler(sampler);
    }

    public final void glBindSampler(int unit, int sampler) {
        org.lwjgl.opengl.GL33.glBindSampler(unit, sampler);
    }

    public final void glSamplerParameteri(int sampler, int pname, int param) {
        org.lwjgl.opengl.GL33.glSamplerParameteri(sampler, pname, param);
    }

    public final void glSamplerParameterf(int sampler, int pname, float param) {
        org.lwjgl.opengl.GL33.glSamplerParameterf(sampler, pname, param);
    }

    public final void glSamplerParameteriv(int sampler, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL33.glSamplerParameteriv(sampler, pname, params);
    }

    public final void glSamplerParameterfv(int sampler, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL33.glSamplerParameterfv(sampler, pname, params);
    }

    public final void glSamplerParameterIiv(int sampler, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL33.glSamplerParameterIiv(sampler, pname, params);
    }

    public final void glSamplerParameterIuiv(int sampler, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL33.glSamplerParameterIuiv(sampler, pname, params);
    }

    public final void glGetSamplerParameteriv(int sampler, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL33.glGetSamplerParameteriv(sampler, pname, params);
    }

    public final int glGetSamplerParameteri(int sampler, int pname) {
        return org.lwjgl.opengl.GL33.glGetSamplerParameteri(sampler, pname);
    }

    public final void glGetSamplerParameterfv(int sampler, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL33.glGetSamplerParameterfv(sampler, pname, params);
    }

    public final float glGetSamplerParameterf(int sampler, int pname) {
        return org.lwjgl.opengl.GL33.glGetSamplerParameterf(sampler, pname);
    }

    public final void glGetSamplerParameterIiv(int sampler, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL33.glGetSamplerParameterIiv(sampler, pname, params);
    }

    public final int glGetSamplerParameterIi(int sampler, int pname) {
        return org.lwjgl.opengl.GL33.glGetSamplerParameterIi(sampler, pname);
    }

    public final void glGetSamplerParameterIuiv(int sampler, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL33.glGetSamplerParameterIuiv(sampler, pname, params);
    }

    public final int glGetSamplerParameterIui(int sampler, int pname) {
        return org.lwjgl.opengl.GL33.glGetSamplerParameterIui(sampler, pname);
    }

    public final void glQueryCounter(int id, int target) {
        org.lwjgl.opengl.GL33.glQueryCounter(id, target);
    }

    public final void glGetQueryObjecti64v(int id, int pname, LongBuffer params) {
        org.lwjgl.opengl.GL33.glGetQueryObjecti64v(id, pname, params);
    }

    public final void glGetQueryObjecti64v(int id, int pname, long params) {
        org.lwjgl.opengl.GL33.glGetQueryObjecti64v(id, pname, params);
    }

    public final long glGetQueryObjecti64(int id, int pname) {
        return org.lwjgl.opengl.GL33.glGetQueryObjecti64(id, pname);
    }

    public final void glGetQueryObjectui64v(int id, int pname, LongBuffer params) {
        org.lwjgl.opengl.GL33.glGetQueryObjectui64v(id, pname, params);
    }

    public final void glGetQueryObjectui64v(int id, int pname, long params) {
        org.lwjgl.opengl.GL33.glGetQueryObjectui64v(id, pname, params);
    }

    public final long glGetQueryObjectui64(int id, int pname) {
        return org.lwjgl.opengl.GL33.glGetQueryObjectui64(id, pname);
    }

    public final void glVertexAttribDivisor(int index, int divisor) {
        org.lwjgl.opengl.GL33.glVertexAttribDivisor(index, divisor);
    }

    public final void glVertexP2ui(int type, int value) {
        org.lwjgl.opengl.GL33.glVertexP2ui(type, value);
    }

    public final void glVertexP3ui(int type, int value) {
        org.lwjgl.opengl.GL33.glVertexP3ui(type, value);
    }

    public final void glVertexP4ui(int type, int value) {
        org.lwjgl.opengl.GL33.glVertexP4ui(type, value);
    }

    public final void glVertexP2uiv(int type, IntBuffer value) {
        org.lwjgl.opengl.GL33.glVertexP2uiv(type, value);
    }

    public final void glVertexP3uiv(int type, IntBuffer value) {
        org.lwjgl.opengl.GL33.glVertexP3uiv(type, value);
    }

    public final void glVertexP4uiv(int type, IntBuffer value) {
        org.lwjgl.opengl.GL33.glVertexP4uiv(type, value);
    }

    public final void glTexCoordP1ui(int type, int coords) {
        org.lwjgl.opengl.GL33.glTexCoordP1ui(type, coords);
    }

    public final void glTexCoordP2ui(int type, int coords) {
        org.lwjgl.opengl.GL33.glTexCoordP2ui(type, coords);
    }

    public final void glTexCoordP3ui(int type, int coords) {
        org.lwjgl.opengl.GL33.glTexCoordP3ui(type, coords);
    }

    public final void glTexCoordP4ui(int type, int coords) {
        org.lwjgl.opengl.GL33.glTexCoordP4ui(type, coords);
    }

    public final void glTexCoordP1uiv(int type, IntBuffer coords) {
        org.lwjgl.opengl.GL33.glTexCoordP1uiv(type, coords);
    }

    public final void glTexCoordP2uiv(int type, IntBuffer coords) {
        org.lwjgl.opengl.GL33.glTexCoordP2uiv(type, coords);
    }

    public final void glTexCoordP3uiv(int type, IntBuffer coords) {
        org.lwjgl.opengl.GL33.glTexCoordP3uiv(type, coords);
    }

    public final void glTexCoordP4uiv(int type, IntBuffer coords) {
        org.lwjgl.opengl.GL33.glTexCoordP4uiv(type, coords);
    }

    public final void glMultiTexCoordP1ui(int texture, int type, int coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP1ui(texture, type, coords);
    }

    public final void glMultiTexCoordP2ui(int texture, int type, int coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP2ui(texture, type, coords);
    }

    public final void glMultiTexCoordP3ui(int texture, int type, int coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP3ui(texture, type, coords);
    }

    public final void glMultiTexCoordP4ui(int texture, int type, int coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP4ui(texture, type, coords);
    }

    public final void glMultiTexCoordP1uiv(int texture, int type, IntBuffer coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP1uiv(texture, type, coords);
    }

    public final void glMultiTexCoordP2uiv(int texture, int type, IntBuffer coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP2uiv(texture, type, coords);
    }

    public final void glMultiTexCoordP3uiv(int texture, int type, IntBuffer coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP3uiv(texture, type, coords);
    }

    public final void glMultiTexCoordP4uiv(int texture, int type, IntBuffer coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP4uiv(texture, type, coords);
    }

    public final void glNormalP3ui(int type, int coords) {
        org.lwjgl.opengl.GL33.glNormalP3ui(type, coords);
    }

    public final void glNormalP3uiv(int type, IntBuffer coords) {
        org.lwjgl.opengl.GL33.glNormalP3uiv(type, coords);
    }

    public final void glColorP3ui(int type, int color) {
        org.lwjgl.opengl.GL33.glColorP3ui(type, color);
    }

    public final void glColorP4ui(int type, int color) {
        org.lwjgl.opengl.GL33.glColorP4ui(type, color);
    }

    public final void glColorP3uiv(int type, IntBuffer color) {
        org.lwjgl.opengl.GL33.glColorP3uiv(type, color);
    }

    public final void glColorP4uiv(int type, IntBuffer color) {
        org.lwjgl.opengl.GL33.glColorP4uiv(type, color);
    }

    public final void glSecondaryColorP3ui(int type, int color) {
        org.lwjgl.opengl.GL33.glSecondaryColorP3ui(type, color);
    }

    public final void glSecondaryColorP3uiv(int type, IntBuffer color) {
        org.lwjgl.opengl.GL33.glSecondaryColorP3uiv(type, color);
    }

    public final void glVertexAttribP1ui(int index, int type, boolean normalized, int value) {
        org.lwjgl.opengl.GL33.glVertexAttribP1ui(index, type, normalized, value);
    }

    public final void glVertexAttribP2ui(int index, int type, boolean normalized, int value) {
        org.lwjgl.opengl.GL33.glVertexAttribP2ui(index, type, normalized, value);
    }

    public final void glVertexAttribP3ui(int index, int type, boolean normalized, int value) {
        org.lwjgl.opengl.GL33.glVertexAttribP3ui(index, type, normalized, value);
    }

    public final void glVertexAttribP4ui(int index, int type, boolean normalized, int value) {
        org.lwjgl.opengl.GL33.glVertexAttribP4ui(index, type, normalized, value);
    }

    public final void glVertexAttribP1uiv(int index, int type, boolean normalized, IntBuffer value) {
        org.lwjgl.opengl.GL33.glVertexAttribP1uiv(index, type, normalized, value);
    }

    public final void glVertexAttribP2uiv(int index, int type, boolean normalized, IntBuffer value) {
        org.lwjgl.opengl.GL33.glVertexAttribP2uiv(index, type, normalized, value);
    }

    public final void glVertexAttribP3uiv(int index, int type, boolean normalized, IntBuffer value) {
        org.lwjgl.opengl.GL33.glVertexAttribP3uiv(index, type, normalized, value);
    }

    public final void glVertexAttribP4uiv(int index, int type, boolean normalized, IntBuffer value) {
        org.lwjgl.opengl.GL33.glVertexAttribP4uiv(index, type, normalized, value);
    }

    public final void glGenSamplers(int[] samplers) {
        org.lwjgl.opengl.GL33.glGenSamplers(samplers);
    }

    public final void glDeleteSamplers(int[] samplers) {
        org.lwjgl.opengl.GL33.glDeleteSamplers(samplers);
    }

    public final void glSamplerParameteriv(int sampler, int pname, int[] params) {
        org.lwjgl.opengl.GL33.glSamplerParameteriv(sampler, pname, params);
    }

    public final void glSamplerParameterfv(int sampler, int pname, float[] params) {
        org.lwjgl.opengl.GL33.glSamplerParameterfv(sampler, pname, params);
    }

    public final void glSamplerParameterIiv(int sampler, int pname, int[] params) {
        org.lwjgl.opengl.GL33.glSamplerParameterIiv(sampler, pname, params);
    }

    public final void glSamplerParameterIuiv(int sampler, int pname, int[] params) {
        org.lwjgl.opengl.GL33.glSamplerParameterIuiv(sampler, pname, params);
    }

    public final void glGetSamplerParameteriv(int sampler, int pname, int[] params) {
        org.lwjgl.opengl.GL33.glGetSamplerParameteriv(sampler, pname, params);
    }

    public final void glGetSamplerParameterfv(int sampler, int pname, float[] params) {
        org.lwjgl.opengl.GL33.glGetSamplerParameterfv(sampler, pname, params);
    }

    public final void glGetSamplerParameterIiv(int sampler, int pname, int[] params) {
        org.lwjgl.opengl.GL33.glGetSamplerParameterIiv(sampler, pname, params);
    }

    public final void glGetSamplerParameterIuiv(int sampler, int pname, int[] params) {
        org.lwjgl.opengl.GL33.glGetSamplerParameterIuiv(sampler, pname, params);
    }

    public final void glGetQueryObjecti64v(int id, int pname, long[] params) {
        org.lwjgl.opengl.GL33.glGetQueryObjecti64v(id, pname, params);
    }

    public final void glGetQueryObjectui64v(int id, int pname, long[] params) {
        org.lwjgl.opengl.GL33.glGetQueryObjectui64v(id, pname, params);
    }

    public final void glVertexP2uiv(int type, int[] value) {
        org.lwjgl.opengl.GL33.glVertexP2uiv(type, value);
    }

    public final void glVertexP3uiv(int type, int[] value) {
        org.lwjgl.opengl.GL33.glVertexP3uiv(type, value);
    }

    public final void glVertexP4uiv(int type, int[] value) {
        org.lwjgl.opengl.GL33.glVertexP4uiv(type, value);
    }

    public final void glTexCoordP1uiv(int type, int[] coords) {
        org.lwjgl.opengl.GL33.glTexCoordP1uiv(type, coords);
    }

    public final void glTexCoordP2uiv(int type, int[] coords) {
        org.lwjgl.opengl.GL33.glTexCoordP2uiv(type, coords);
    }

    public final void glTexCoordP3uiv(int type, int[] coords) {
        org.lwjgl.opengl.GL33.glTexCoordP3uiv(type, coords);
    }

    public final void glTexCoordP4uiv(int type, int[] coords) {
        org.lwjgl.opengl.GL33.glTexCoordP4uiv(type, coords);
    }

    public final void glMultiTexCoordP1uiv(int texture, int type, int[] coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP1uiv(texture, type, coords);
    }

    public final void glMultiTexCoordP2uiv(int texture, int type, int[] coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP2uiv(texture, type, coords);
    }

    public final void glMultiTexCoordP3uiv(int texture, int type, int[] coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP3uiv(texture, type, coords);
    }

    public final void glMultiTexCoordP4uiv(int texture, int type, int[] coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP4uiv(texture, type, coords);
    }

    public final void glNormalP3uiv(int type, int[] coords) {
        org.lwjgl.opengl.GL33.glNormalP3uiv(type, coords);
    }

    public final void glColorP3uiv(int type, int[] color) {
        org.lwjgl.opengl.GL33.glColorP3uiv(type, color);
    }

    public final void glColorP4uiv(int type, int[] color) {
        org.lwjgl.opengl.GL33.glColorP4uiv(type, color);
    }

    public final void glSecondaryColorP3uiv(int type, int[] color) {
        org.lwjgl.opengl.GL33.glSecondaryColorP3uiv(type, color);
    }

    public final void glVertexAttribP1uiv(int index, int type, boolean normalized, int[] value) {
        org.lwjgl.opengl.GL33.glVertexAttribP1uiv(index, type, normalized, value);
    }

    public final void glVertexAttribP2uiv(int index, int type, boolean normalized, int[] value) {
        org.lwjgl.opengl.GL33.glVertexAttribP2uiv(index, type, normalized, value);
    }

    public final void glVertexAttribP3uiv(int index, int type, boolean normalized, int[] value) {
        org.lwjgl.opengl.GL33.glVertexAttribP3uiv(index, type, normalized, value);
    }

    public final void glVertexAttribP4uiv(int index, int type, boolean normalized, int[] value) {
        org.lwjgl.opengl.GL33.glVertexAttribP4uiv(index, type, normalized, value);
    }

}
