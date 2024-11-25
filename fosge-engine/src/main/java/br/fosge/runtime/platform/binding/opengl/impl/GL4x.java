package br.fosge.runtime.platform.binding.opengl.impl;

import br.fosge.runtime.platform.binding.opengl.api.*;
import org.lwjgl.PointerBuffer;
import org.lwjgl.opengl.GLDebugMessageCallbackI;

import java.nio.*;

public class GL4x extends GL3x implements GL40, GL41, GL42, GL43, GL44, GL45, GL46 {

    public final void glBlendEquationi(int buf, int mode) {
        org.lwjgl.opengl.GL40.glBlendEquationi(buf, mode);
    }

    public final void glBlendEquationSeparatei(int buf, int modeRGB, int modeAlpha) {
        org.lwjgl.opengl.GL40.glBlendEquationSeparatei(buf, modeRGB, modeAlpha);
    }

    public final void glBlendFunci(int buf, int sfactor, int dfactor) {
        org.lwjgl.opengl.GL40.glBlendFunci(buf, sfactor, dfactor);
    }

    public final void glBlendFuncSeparatei(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        org.lwjgl.opengl.GL40.glBlendFuncSeparatei(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
    }

    public final void glDrawArraysIndirect(int mode, ByteBuffer indirect) {
        org.lwjgl.opengl.GL40.glDrawArraysIndirect(mode, indirect);
    }

    public final void glDrawArraysIndirect(int mode, long indirect) {
        org.lwjgl.opengl.GL40.glDrawArraysIndirect(mode, indirect);
    }

    public final void glDrawArraysIndirect(int mode, IntBuffer indirect) {
        org.lwjgl.opengl.GL40.glDrawArraysIndirect(mode, indirect);
    }

    public final void glDrawElementsIndirect(int mode, int type, ByteBuffer indirect) {
        org.lwjgl.opengl.GL40.glDrawElementsIndirect(mode, type, indirect);
    }

    public final void glDrawElementsIndirect(int mode, int type, long indirect) {
        org.lwjgl.opengl.GL40.glDrawElementsIndirect(mode, type, indirect);
    }

    public final void glDrawElementsIndirect(int mode, int type, IntBuffer indirect) {
        org.lwjgl.opengl.GL40.glDrawElementsIndirect(mode, type, indirect);
    }

    public final void glUniform1d(int location, double x) {
        org.lwjgl.opengl.GL40.glUniform1d(location, x);
    }

    public final void glUniform2d(int location, double x, double y) {
        org.lwjgl.opengl.GL40.glUniform2d(location, x, y);
    }

    public final void glUniform3d(int location, double x, double y, double z) {
        org.lwjgl.opengl.GL40.glUniform3d(location, x, y, z);
    }

    public final void glUniform4d(int location, double x, double y, double z, double w) {
        org.lwjgl.opengl.GL40.glUniform4d(location, x, y, z, w);
    }

    public final void glUniform1dv(int location, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniform1dv(location, value);
    }

    public final void glUniform2dv(int location, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniform2dv(location, value);
    }

    public final void glUniform3dv(int location, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniform3dv(location, value);
    }

    public final void glUniform4dv(int location, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniform4dv(location, value);
    }

    public final void glUniformMatrix2dv(int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix2dv(location, transpose, value);
    }

    public final void glUniformMatrix3dv(int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix3dv(location, transpose, value);
    }

    public final void glUniformMatrix4dv(int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix4dv(location, transpose, value);
    }

    public final void glUniformMatrix2x3dv(int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix2x3dv(location, transpose, value);
    }

    public final void glUniformMatrix2x4dv(int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix2x4dv(location, transpose, value);
    }

    public final void glUniformMatrix3x2dv(int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix3x2dv(location, transpose, value);
    }

    public final void glUniformMatrix3x4dv(int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix3x4dv(location, transpose, value);
    }

    public final void glUniformMatrix4x2dv(int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix4x2dv(location, transpose, value);
    }

    public final void glUniformMatrix4x3dv(int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix4x3dv(location, transpose, value);
    }

    public final void glGetUniformdv(int program, int location, DoubleBuffer params) {
        org.lwjgl.opengl.GL40.glGetUniformdv(program, location, params);
    }

    public final double glGetUniformd(int program, int location) {
        return org.lwjgl.opengl.GL40.glGetUniformd(program, location);
    }

    public final void glMinSampleShading(float value) {
        org.lwjgl.opengl.GL40.glMinSampleShading(value);
    }

    public final int glGetSubroutineUniformLocation(int program, int shadertype, ByteBuffer name) {
        return org.lwjgl.opengl.GL40.glGetSubroutineUniformLocation(program, shadertype, name);
    }

    public final int glGetSubroutineUniformLocation(int program, int shadertype, CharSequence name) {
        return org.lwjgl.opengl.GL40.glGetSubroutineUniformLocation(program, shadertype, name);
    }

    public final int glGetSubroutineIndex(int program, int shadertype, ByteBuffer name) {
        return org.lwjgl.opengl.GL40.glGetSubroutineIndex(program, shadertype, name);
    }

    public final int glGetSubroutineIndex(int program, int shadertype, CharSequence name) {
        return org.lwjgl.opengl.GL40.glGetSubroutineIndex(program, shadertype, name);
    }

    public final void glGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, IntBuffer values) {
        org.lwjgl.opengl.GL40.glGetActiveSubroutineUniformiv(program, shadertype, index, pname, values);
    }

    public final int glGetActiveSubroutineUniformi(int program, int shadertype, int index, int pname) {
        return org.lwjgl.opengl.GL40.glGetActiveSubroutineUniformi(program, shadertype, index, pname);
    }

    public final void glGetActiveSubroutineUniformName(int program, int shadertype, int index, IntBuffer length, ByteBuffer name) {
        org.lwjgl.opengl.GL40.glGetActiveSubroutineUniformName(program, shadertype, index, length, name);
    }

    public final String glGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize) {
        return org.lwjgl.opengl.GL40.glGetActiveSubroutineUniformName(program, shadertype, index, bufsize);
    }

    public final String glGetActiveSubroutineUniformName(int program, int shadertype, int index) {
        return org.lwjgl.opengl.GL40.glGetActiveSubroutineUniformName(program, shadertype, index);
    }

    public final void glGetActiveSubroutineName(int program, int shadertype, int index, IntBuffer length, ByteBuffer name) {
        org.lwjgl.opengl.GL40.glGetActiveSubroutineName(program, shadertype, index, length, name);
    }

    public final String glGetActiveSubroutineName(int program, int shadertype, int index, int bufsize) {
        return org.lwjgl.opengl.GL40.glGetActiveSubroutineName(program, shadertype, index, bufsize);
    }

    public final String glGetActiveSubroutineName(int program, int shadertype, int index) {
        return org.lwjgl.opengl.GL40.glGetActiveSubroutineName(program, shadertype, index);
    }

    public final void glUniformSubroutinesuiv(int shadertype, IntBuffer indices) {
        org.lwjgl.opengl.GL40.glUniformSubroutinesuiv(shadertype, indices);
    }

    public final void glUniformSubroutinesui(int shadertype, int index) {
        org.lwjgl.opengl.GL40.glUniformSubroutinesui(shadertype, index);
    }

    public final void glGetUniformSubroutineuiv(int shadertype, int location, IntBuffer params) {
        org.lwjgl.opengl.GL40.glGetUniformSubroutineuiv(shadertype, location, params);
    }

    public final int glGetUniformSubroutineui(int shadertype, int location) {
        return org.lwjgl.opengl.GL40.glGetUniformSubroutineui(shadertype, location);
    }

    public final void glGetProgramStageiv(int program, int shadertype, int pname, IntBuffer values) {
        org.lwjgl.opengl.GL40.glGetProgramStageiv(program, shadertype, pname, values);
    }

    public final int glGetProgramStagei(int program, int shadertype, int pname) {
        return org.lwjgl.opengl.GL40.glGetProgramStagei(program, shadertype, pname);
    }

    public final void glPatchParameteri(int pname, int value) {
        org.lwjgl.opengl.GL40.glPatchParameteri(pname, value);
    }

    public final void glPatchParameterfv(int pname, FloatBuffer values) {
        org.lwjgl.opengl.GL40.glPatchParameterfv(pname, values);
    }

    public final void glBindTransformFeedback(int target, int id) {
        org.lwjgl.opengl.GL40.glBindTransformFeedback(target, id);
    }

    public final void glDeleteTransformFeedbacks(IntBuffer ids) {
        org.lwjgl.opengl.GL40.glDeleteTransformFeedbacks(ids);
    }

    public final void glDeleteTransformFeedbacks(int id) {
        org.lwjgl.opengl.GL40.glDeleteTransformFeedbacks(id);
    }

    public final void glGenTransformFeedbacks(IntBuffer ids) {
        org.lwjgl.opengl.GL40.glGenTransformFeedbacks(ids);
    }

    public final int glGenTransformFeedbacks() {
        return org.lwjgl.opengl.GL40.glGenTransformFeedbacks();
    }

    public final boolean glIsTransformFeedback(int id) {
        return org.lwjgl.opengl.GL40.glIsTransformFeedback(id);
    }

    public final void glPauseTransformFeedback() {
        org.lwjgl.opengl.GL40.glPauseTransformFeedback();
    }

    public final void glResumeTransformFeedback() {
        org.lwjgl.opengl.GL40.glResumeTransformFeedback();
    }

    public final void glDrawTransformFeedback(int mode, int id) {
        org.lwjgl.opengl.GL40.glDrawTransformFeedback(mode, id);
    }

    public final void glDrawTransformFeedbackStream(int mode, int id, int stream) {
        org.lwjgl.opengl.GL40.glDrawTransformFeedbackStream(mode, id, stream);
    }

    public final void glBeginQueryIndexed(int target, int index, int id) {
        org.lwjgl.opengl.GL40.glBeginQueryIndexed(target, index, id);
    }

    public final void glEndQueryIndexed(int target, int index) {
        org.lwjgl.opengl.GL40.glEndQueryIndexed(target, index);
    }

    public final void glGetQueryIndexediv(int target, int index, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL40.glGetQueryIndexediv(target, index, pname, params);
    }

    public final int glGetQueryIndexedi(int target, int index, int pname) {
        return org.lwjgl.opengl.GL40.glGetQueryIndexedi(target, index, pname);
    }

    public final void glDrawArraysIndirect(int mode, int[] indirect) {
        org.lwjgl.opengl.GL40.glDrawArraysIndirect(mode, indirect);
    }

    public final void glDrawElementsIndirect(int mode, int type, int[] indirect) {
        org.lwjgl.opengl.GL40.glDrawElementsIndirect(mode, type, indirect);
    }

    public final void glUniform1dv(int location, double[] value) {
        org.lwjgl.opengl.GL40.glUniform1dv(location, value);
    }

    public final void glUniform2dv(int location, double[] value) {
        org.lwjgl.opengl.GL40.glUniform2dv(location, value);
    }

    public final void glUniform3dv(int location, double[] value) {
        org.lwjgl.opengl.GL40.glUniform3dv(location, value);
    }

    public final void glUniform4dv(int location, double[] value) {
        org.lwjgl.opengl.GL40.glUniform4dv(location, value);
    }

    public final void glUniformMatrix2dv(int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix2dv(location, transpose, value);
    }

    public final void glUniformMatrix3dv(int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix3dv(location, transpose, value);
    }

    public final void glUniformMatrix4dv(int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix4dv(location, transpose, value);
    }

    public final void glUniformMatrix2x3dv(int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix2x3dv(location, transpose, value);
    }

    public final void glUniformMatrix2x4dv(int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix2x4dv(location, transpose, value);
    }

    public final void glUniformMatrix3x2dv(int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix3x2dv(location, transpose, value);
    }

    public final void glUniformMatrix3x4dv(int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix3x4dv(location, transpose, value);
    }

    public final void glUniformMatrix4x2dv(int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix4x2dv(location, transpose, value);
    }

    public final void glUniformMatrix4x3dv(int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix4x3dv(location, transpose, value);
    }

    public final void glGetUniformdv(int program, int location, double[] params) {
        org.lwjgl.opengl.GL40.glGetUniformdv(program, location, params);
    }

    public final void glGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, int[] values) {
        org.lwjgl.opengl.GL40.glGetActiveSubroutineUniformiv(program, shadertype, index, pname, values);
    }

    public final void glGetActiveSubroutineUniformName(int program, int shadertype, int index, int[] length, ByteBuffer name) {
        org.lwjgl.opengl.GL40.glGetActiveSubroutineUniformName(program, shadertype, index, length, name);
    }

    public final void glGetActiveSubroutineName(int program, int shadertype, int index, int[] length, ByteBuffer name) {
        org.lwjgl.opengl.GL40.glGetActiveSubroutineName(program, shadertype, index, length, name);
    }

    public final void glUniformSubroutinesuiv(int shadertype, int[] indices) {
        org.lwjgl.opengl.GL40.glUniformSubroutinesuiv(shadertype, indices);
    }

    public final void glGetUniformSubroutineuiv(int shadertype, int location, int[] params) {
        org.lwjgl.opengl.GL40.glGetUniformSubroutineuiv(shadertype, location, params);
    }

    public final void glGetProgramStageiv(int program, int shadertype, int pname, int[] values) {
        org.lwjgl.opengl.GL40.glGetProgramStageiv(program, shadertype, pname, values);
    }

    public final void glPatchParameterfv(int pname, float[] values) {
        org.lwjgl.opengl.GL40.glPatchParameterfv(pname, values);
    }

    public final void glDeleteTransformFeedbacks(int[] ids) {
        org.lwjgl.opengl.GL40.glDeleteTransformFeedbacks(ids);
    }

    public final void glGenTransformFeedbacks(int[] ids) {
        org.lwjgl.opengl.GL40.glGenTransformFeedbacks(ids);
    }

    public final void glGetQueryIndexediv(int target, int index, int pname, int[] params) {
        org.lwjgl.opengl.GL40.glGetQueryIndexediv(target, index, pname, params);
    }

    public final void glReleaseShaderCompiler() {
        org.lwjgl.opengl.GL41.glReleaseShaderCompiler();
    }

    public final void glShaderBinary(IntBuffer shaders, int binaryformat, ByteBuffer binary) {
        org.lwjgl.opengl.GL41.glShaderBinary(shaders, binaryformat, binary);
    }

    public final void glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntBuffer range, IntBuffer precision) {
        org.lwjgl.opengl.GL41.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    public final int glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntBuffer range) {
        return org.lwjgl.opengl.GL41.glGetShaderPrecisionFormat(shadertype, precisiontype, range);
    }

    public final void glDepthRangef(float zNear, float zFar) {
        org.lwjgl.opengl.GL41.glDepthRangef(zNear, zFar);
    }

    public final void glClearDepthf(float depth) {
        org.lwjgl.opengl.GL41.glClearDepthf(depth);
    }

    public final void glGetProgramBinary(int program, IntBuffer length, IntBuffer binaryFormat, ByteBuffer binary) {
        org.lwjgl.opengl.GL41.glGetProgramBinary(program, length, binaryFormat, binary);
    }

    public final void glProgramBinary(int program, int binaryFormat, ByteBuffer binary) {
        org.lwjgl.opengl.GL41.glProgramBinary(program, binaryFormat, binary);
    }

    public final void glProgramParameteri(int program, int pname, int value) {
        org.lwjgl.opengl.GL41.glProgramParameteri(program, pname, value);
    }

    public final void glUseProgramStages(int pipeline, int stages, int program) {
        org.lwjgl.opengl.GL41.glUseProgramStages(pipeline, stages, program);
    }

    public final void glActiveShaderProgram(int pipeline, int program) {
        org.lwjgl.opengl.GL41.glActiveShaderProgram(pipeline, program);
    }

    public final int glCreateShaderProgramv(int type, PointerBuffer strings) {
        return org.lwjgl.opengl.GL41.glCreateShaderProgramv(type, strings);
    }

    public final int glCreateShaderProgramv(int type, CharSequence[] strings) {
        return org.lwjgl.opengl.GL41.glCreateShaderProgramv(type, strings);
    }

    public final int glCreateShaderProgramv(int type, CharSequence string) {
        return org.lwjgl.opengl.GL41.glCreateShaderProgramv(type, string);
    }

    public final void glBindProgramPipeline(int pipeline) {
        org.lwjgl.opengl.GL41.glBindProgramPipeline(pipeline);
    }

    public final void glDeleteProgramPipelines(IntBuffer pipelines) {
        org.lwjgl.opengl.GL41.glDeleteProgramPipelines(pipelines);
    }

    public final void glDeleteProgramPipelines(int pipeline) {
        org.lwjgl.opengl.GL41.glDeleteProgramPipelines(pipeline);
    }

    public final void glGenProgramPipelines(IntBuffer pipelines) {
        org.lwjgl.opengl.GL41.glGenProgramPipelines(pipelines);
    }

    public final int glGenProgramPipelines() {
        return org.lwjgl.opengl.GL41.glGenProgramPipelines();
    }

    public final boolean glIsProgramPipeline(int pipeline) {
        return org.lwjgl.opengl.GL41.glIsProgramPipeline(pipeline);
    }

    public final void glGetProgramPipelineiv(int pipeline, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL41.glGetProgramPipelineiv(pipeline, pname, params);
    }

    public final int glGetProgramPipelinei(int pipeline, int pname) {
        return org.lwjgl.opengl.GL41.glGetProgramPipelinei(pipeline, pname);
    }

    public final void glProgramUniform1i(int program, int location, int x) {
        org.lwjgl.opengl.GL41.glProgramUniform1i(program, location, x);
    }

    public final void glProgramUniform2i(int program, int location, int x, int y) {
        org.lwjgl.opengl.GL41.glProgramUniform2i(program, location, x, y);
    }

    public final void glProgramUniform3i(int program, int location, int x, int y, int z) {
        org.lwjgl.opengl.GL41.glProgramUniform3i(program, location, x, y, z);
    }

    public final void glProgramUniform4i(int program, int location, int x, int y, int z, int w) {
        org.lwjgl.opengl.GL41.glProgramUniform4i(program, location, x, y, z, w);
    }

    public final void glProgramUniform1ui(int program, int location, int x) {
        org.lwjgl.opengl.GL41.glProgramUniform1ui(program, location, x);
    }

    public final void glProgramUniform2ui(int program, int location, int x, int y) {
        org.lwjgl.opengl.GL41.glProgramUniform2ui(program, location, x, y);
    }

    public final void glProgramUniform3ui(int program, int location, int x, int y, int z) {
        org.lwjgl.opengl.GL41.glProgramUniform3ui(program, location, x, y, z);
    }

    public final void glProgramUniform4ui(int program, int location, int x, int y, int z, int w) {
        org.lwjgl.opengl.GL41.glProgramUniform4ui(program, location, x, y, z, w);
    }

    public final void glProgramUniform1f(int program, int location, float x) {
        org.lwjgl.opengl.GL41.glProgramUniform1f(program, location, x);
    }

    public final void glProgramUniform2f(int program, int location, float x, float y) {
        org.lwjgl.opengl.GL41.glProgramUniform2f(program, location, x, y);
    }

    public final void glProgramUniform3f(int program, int location, float x, float y, float z) {
        org.lwjgl.opengl.GL41.glProgramUniform3f(program, location, x, y, z);
    }

    public final void glProgramUniform4f(int program, int location, float x, float y, float z, float w) {
        org.lwjgl.opengl.GL41.glProgramUniform4f(program, location, x, y, z, w);
    }

    public final void glProgramUniform1d(int program, int location, double x) {
        org.lwjgl.opengl.GL41.glProgramUniform1d(program, location, x);
    }

    public final void glProgramUniform2d(int program, int location, double x, double y) {
        org.lwjgl.opengl.GL41.glProgramUniform2d(program, location, x, y);
    }

    public final void glProgramUniform3d(int program, int location, double x, double y, double z) {
        org.lwjgl.opengl.GL41.glProgramUniform3d(program, location, x, y, z);
    }

    public final void glProgramUniform4d(int program, int location, double x, double y, double z, double w) {
        org.lwjgl.opengl.GL41.glProgramUniform4d(program, location, x, y, z, w);
    }

    public final void glProgramUniform1iv(int program, int location, IntBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform1iv(program, location, value);
    }

    public final void glProgramUniform2iv(int program, int location, IntBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform2iv(program, location, value);
    }

    public final void glProgramUniform3iv(int program, int location, IntBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform3iv(program, location, value);
    }

    public final void glProgramUniform4iv(int program, int location, IntBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform4iv(program, location, value);
    }

    public final void glProgramUniform1uiv(int program, int location, IntBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform1uiv(program, location, value);
    }

    public final void glProgramUniform2uiv(int program, int location, IntBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform2uiv(program, location, value);
    }

    public final void glProgramUniform3uiv(int program, int location, IntBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform3uiv(program, location, value);
    }

    public final void glProgramUniform4uiv(int program, int location, IntBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform4uiv(program, location, value);
    }

    public final void glProgramUniform1fv(int program, int location, FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform1fv(program, location, value);
    }

    public final void glProgramUniform2fv(int program, int location, FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform2fv(program, location, value);
    }

    public final void glProgramUniform3fv(int program, int location, FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform3fv(program, location, value);
    }

    public final void glProgramUniform4fv(int program, int location, FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform4fv(program, location, value);
    }

    public final void glProgramUniform1dv(int program, int location, DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform1dv(program, location, value);
    }

    public final void glProgramUniform2dv(int program, int location, DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform2dv(program, location, value);
    }

    public final void glProgramUniform3dv(int program, int location, DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform3dv(program, location, value);
    }

    public final void glProgramUniform4dv(int program, int location, DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform4dv(program, location, value);
    }

    public final void glProgramUniformMatrix2fv(int program, int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2fv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix3fv(int program, int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3fv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix4fv(int program, int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4fv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix2dv(int program, int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2dv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix3dv(int program, int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3dv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix4dv(int program, int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4dv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix2x3fv(int program, int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2x3fv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix3x2fv(int program, int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3x2fv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix2x4fv(int program, int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2x4fv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix4x2fv(int program, int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4x2fv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix3x4fv(int program, int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3x4fv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix4x3fv(int program, int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4x3fv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix2x3dv(int program, int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2x3dv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix3x2dv(int program, int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3x2dv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix2x4dv(int program, int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2x4dv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix4x2dv(int program, int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4x2dv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix3x4dv(int program, int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3x4dv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix4x3dv(int program, int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4x3dv(program, location, transpose, value);
    }

    public final void glValidateProgramPipeline(int pipeline) {
        org.lwjgl.opengl.GL41.glValidateProgramPipeline(pipeline);
    }

    public final void glGetProgramPipelineInfoLog(int pipeline, IntBuffer length, ByteBuffer infoLog) {
        org.lwjgl.opengl.GL41.glGetProgramPipelineInfoLog(pipeline, length, infoLog);
    }

    public final String glGetProgramPipelineInfoLog(int pipeline, int bufSize) {
        return org.lwjgl.opengl.GL41.glGetProgramPipelineInfoLog(pipeline, bufSize);
    }

    public final String glGetProgramPipelineInfoLog(int pipeline) {
        return org.lwjgl.opengl.GL41.glGetProgramPipelineInfoLog(pipeline);
    }

    public final void glVertexAttribL1d(int index, double x) {
        org.lwjgl.opengl.GL41.glVertexAttribL1d(index, x);
    }

    public final void glVertexAttribL2d(int index, double x, double y) {
        org.lwjgl.opengl.GL41.glVertexAttribL2d(index, x, y);
    }

    public final void glVertexAttribL3d(int index, double x, double y, double z) {
        org.lwjgl.opengl.GL41.glVertexAttribL3d(index, x, y, z);
    }

    public final void glVertexAttribL4d(int index, double x, double y, double z, double w) {
        org.lwjgl.opengl.GL41.glVertexAttribL4d(index, x, y, z, w);
    }

    public final void glVertexAttribL1dv(int index, DoubleBuffer v) {
        org.lwjgl.opengl.GL41.glVertexAttribL1dv(index, v);
    }

    public final void glVertexAttribL2dv(int index, DoubleBuffer v) {
        org.lwjgl.opengl.GL41.glVertexAttribL2dv(index, v);
    }

    public final void glVertexAttribL3dv(int index, DoubleBuffer v) {
        org.lwjgl.opengl.GL41.glVertexAttribL3dv(index, v);
    }

    public final void glVertexAttribL4dv(int index, DoubleBuffer v) {
        org.lwjgl.opengl.GL41.glVertexAttribL4dv(index, v);
    }

    public final void glVertexAttribLPointer(int index, int size, int type, int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL41.glVertexAttribLPointer(index, size, type, stride, pointer);
    }

    public final void glVertexAttribLPointer(int index, int size, int type, int stride, long pointer) {
        org.lwjgl.opengl.GL41.glVertexAttribLPointer(index, size, type, stride, pointer);
    }

    public final void glVertexAttribLPointer(int index, int size, int stride, DoubleBuffer pointer) {
        org.lwjgl.opengl.GL41.glVertexAttribLPointer(index, size, stride, pointer);
    }

    public final void glGetVertexAttribLdv(int index, int pname, DoubleBuffer params) {
        org.lwjgl.opengl.GL41.glGetVertexAttribLdv(index, pname, params);
    }

    public final void glViewportArrayv(int first, FloatBuffer v) {
        org.lwjgl.opengl.GL41.glViewportArrayv(first, v);
    }

    public final void glViewportIndexedf(int index, float x, float y, float w, float h) {
        org.lwjgl.opengl.GL41.glViewportIndexedf(index, x, y, w, h);
    }

    public final void glViewportIndexedfv(int index, FloatBuffer v) {
        org.lwjgl.opengl.GL41.glViewportIndexedfv(index, v);
    }

    public final void glScissorArrayv(int first, IntBuffer v) {
        org.lwjgl.opengl.GL41.glScissorArrayv(first, v);
    }

    public final void glScissorIndexed(int index, int left, int bottom, int width, int height) {
        org.lwjgl.opengl.GL41.glScissorIndexed(index, left, bottom, width, height);
    }

    public final void glScissorIndexedv(int index, IntBuffer v) {
        org.lwjgl.opengl.GL41.glScissorIndexedv(index, v);
    }

    public final void glDepthRangeArrayv(int first, DoubleBuffer v) {
        org.lwjgl.opengl.GL41.glDepthRangeArrayv(first, v);
    }

    public final void glDepthRangeIndexed(int index, double zNear, double zFar) {
        org.lwjgl.opengl.GL41.glDepthRangeIndexed(index, zNear, zFar);
    }

    public final void glGetFloati_v(int target, int index, FloatBuffer data) {
        org.lwjgl.opengl.GL41.glGetFloati_v(target, index, data);
    }

    public final float glGetFloati(int target, int index) {
        return org.lwjgl.opengl.GL41.glGetFloati(target, index);
    }

    public final void glGetDoublei_v(int target, int index, DoubleBuffer data) {
        org.lwjgl.opengl.GL41.glGetDoublei_v(target, index, data);
    }

    public final double glGetDoublei(int target, int index) {
        return org.lwjgl.opengl.GL41.glGetDoublei(target, index);
    }

    public final void glShaderBinary(int[] shaders, int binaryformat, ByteBuffer binary) {
        org.lwjgl.opengl.GL41.glShaderBinary(shaders, binaryformat, binary);
    }

    public final void glGetShaderPrecisionFormat(int shadertype, int precisiontype, int[] range, int[] precision) {
        org.lwjgl.opengl.GL41.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    public final void glGetProgramBinary(int program, int[] length, int[] binaryFormat, ByteBuffer binary) {
        org.lwjgl.opengl.GL41.glGetProgramBinary(program, length, binaryFormat, binary);
    }

    public final void glDeleteProgramPipelines(int[] pipelines) {
        org.lwjgl.opengl.GL41.glDeleteProgramPipelines(pipelines);
    }

    public final void glGenProgramPipelines(int[] pipelines) {
        org.lwjgl.opengl.GL41.glGenProgramPipelines(pipelines);
    }

    public final void glGetProgramPipelineiv(int pipeline, int pname, int[] params) {
        org.lwjgl.opengl.GL41.glGetProgramPipelineiv(pipeline, pname, params);
    }

    public final void glProgramUniform1iv(int program, int location, int[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform1iv(program, location, value);
    }

    public final void glProgramUniform2iv(int program, int location, int[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform2iv(program, location, value);
    }

    public final void glProgramUniform3iv(int program, int location, int[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform3iv(program, location, value);
    }

    public final void glProgramUniform4iv(int program, int location, int[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform4iv(program, location, value);
    }

    public final void glProgramUniform1uiv(int program, int location, int[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform1uiv(program, location, value);
    }

    public final void glProgramUniform2uiv(int program, int location, int[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform2uiv(program, location, value);
    }

    public final void glProgramUniform3uiv(int program, int location, int[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform3uiv(program, location, value);
    }

    public final void glProgramUniform4uiv(int program, int location, int[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform4uiv(program, location, value);
    }

    public final void glProgramUniform1fv(int program, int location, float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform1fv(program, location, value);
    }

    public final void glProgramUniform2fv(int program, int location, float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform2fv(program, location, value);
    }

    public final void glProgramUniform3fv(int program, int location, float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform3fv(program, location, value);
    }

    public final void glProgramUniform4fv(int program, int location, float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform4fv(program, location, value);
    }

    public final void glProgramUniform1dv(int program, int location, double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform1dv(program, location, value);
    }

    public final void glProgramUniform2dv(int program, int location, double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform2dv(program, location, value);
    }

    public final void glProgramUniform3dv(int program, int location, double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform3dv(program, location, value);
    }

    public final void glProgramUniform4dv(int program, int location, double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform4dv(program, location, value);
    }

    public final void glProgramUniformMatrix2fv(int program, int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2fv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix3fv(int program, int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3fv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix4fv(int program, int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4fv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix2dv(int program, int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2dv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix3dv(int program, int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3dv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix4dv(int program, int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4dv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix2x3fv(int program, int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2x3fv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix3x2fv(int program, int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3x2fv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix2x4fv(int program, int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2x4fv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix4x2fv(int program, int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4x2fv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix3x4fv(int program, int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3x4fv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix4x3fv(int program, int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4x3fv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix2x3dv(int program, int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2x3dv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix3x2dv(int program, int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3x2dv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix2x4dv(int program, int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2x4dv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix4x2dv(int program, int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4x2dv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix3x4dv(int program, int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3x4dv(program, location, transpose, value);
    }

    public final void glProgramUniformMatrix4x3dv(int program, int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4x3dv(program, location, transpose, value);
    }

    public final void glGetProgramPipelineInfoLog(int pipeline, int[] length, ByteBuffer infoLog) {
        org.lwjgl.opengl.GL41.glGetProgramPipelineInfoLog(pipeline, length, infoLog);
    }

    public final void glVertexAttribL1dv(int index, double[] v) {
        org.lwjgl.opengl.GL41.glVertexAttribL1dv(index, v);
    }

    public final void glVertexAttribL2dv(int index, double[] v) {
        org.lwjgl.opengl.GL41.glVertexAttribL2dv(index, v);
    }

    public final void glVertexAttribL3dv(int index, double[] v) {
        org.lwjgl.opengl.GL41.glVertexAttribL3dv(index, v);
    }

    public final void glVertexAttribL4dv(int index, double[] v) {
        org.lwjgl.opengl.GL41.glVertexAttribL4dv(index, v);
    }

    public final void glGetVertexAttribLdv(int index, int pname, double[] params) {
        org.lwjgl.opengl.GL41.glGetVertexAttribLdv(index, pname, params);
    }

    public final void glViewportArrayv(int first, float[] v) {
        org.lwjgl.opengl.GL41.glViewportArrayv(first, v);
    }

    public final void glViewportIndexedfv(int index, float[] v) {
        org.lwjgl.opengl.GL41.glViewportIndexedfv(index, v);
    }

    public final void glScissorArrayv(int first, int[] v) {
        org.lwjgl.opengl.GL41.glScissorArrayv(first, v);
    }

    public final void glScissorIndexedv(int index, int[] v) {
        org.lwjgl.opengl.GL41.glScissorIndexedv(index, v);
    }

    public final void glDepthRangeArrayv(int first, double[] v) {
        org.lwjgl.opengl.GL41.glDepthRangeArrayv(first, v);
    }

    public final void glGetFloati_v(int target, int index, float[] data) {
        org.lwjgl.opengl.GL41.glGetFloati_v(target, index, data);
    }

    public final void glGetDoublei_v(int target, int index, double[] data) {
        org.lwjgl.opengl.GL41.glGetDoublei_v(target, index, data);
    }

    public final void glGetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL42.glGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, params);
    }

    public final int glGetActiveAtomicCounterBufferi(int program, int bufferIndex, int pname) {
        return org.lwjgl.opengl.GL42.glGetActiveAtomicCounterBufferi(program, bufferIndex, pname);
    }

    public final void glTexStorage1D(int target, int levels, int internalformat, int width) {
        org.lwjgl.opengl.GL42.glTexStorage1D(target, levels, internalformat, width);
    }

    public final void glTexStorage2D(int target, int levels, int internalformat, int width, int height) {
        org.lwjgl.opengl.GL42.glTexStorage2D(target, levels, internalformat, width, height);
    }

    public final void glTexStorage3D(int target, int levels, int internalformat, int width, int height, int depth) {
        org.lwjgl.opengl.GL42.glTexStorage3D(target, levels, internalformat, width, height, depth);
    }

    public final void glDrawTransformFeedbackInstanced(int mode, int id, int primcount) {
        org.lwjgl.opengl.GL42.glDrawTransformFeedbackInstanced(mode, id, primcount);
    }

    public final void glDrawTransformFeedbackStreamInstanced(int mode, int id, int stream, int primcount) {
        org.lwjgl.opengl.GL42.glDrawTransformFeedbackStreamInstanced(mode, id, stream, primcount);
    }

    public final void glDrawArraysInstancedBaseInstance(int mode, int first, int count, int primcount, int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawArraysInstancedBaseInstance(mode, first, count, primcount, baseinstance);
    }

    public final void glDrawElementsInstancedBaseInstance(int mode, int count, int type, long indices, int primcount, int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseInstance(mode, count, type, indices, primcount, baseinstance);
    }

    public final void glDrawElementsInstancedBaseInstance(int mode, int type, ByteBuffer indices, int primcount, int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseInstance(mode, type, indices, primcount, baseinstance);
    }

    public final void glDrawElementsInstancedBaseInstance(int mode, ByteBuffer indices, int primcount, int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
    }

    public final void glDrawElementsInstancedBaseInstance(int mode, ShortBuffer indices, int primcount, int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
    }

    public final void glDrawElementsInstancedBaseInstance(int mode, IntBuffer indices, int primcount, int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
    }

    public final void glDrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, long indices, int primcount, int basevertex, int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indices, primcount, basevertex, baseinstance);
    }

    public final void glDrawElementsInstancedBaseVertexBaseInstance(int mode, int type, ByteBuffer indices, int primcount, int basevertex, int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseVertexBaseInstance(mode, type, indices, primcount, basevertex, baseinstance);
    }

    public final void glDrawElementsInstancedBaseVertexBaseInstance(int mode, ByteBuffer indices, int primcount, int basevertex, int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
    }

    public final void glDrawElementsInstancedBaseVertexBaseInstance(int mode, ShortBuffer indices, int primcount, int basevertex, int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
    }

    public final void glDrawElementsInstancedBaseVertexBaseInstance(int mode, IntBuffer indices, int primcount, int basevertex, int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
    }

    public final void glBindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format) {
        org.lwjgl.opengl.GL42.glBindImageTexture(unit, texture, level, layered, layer, access, format);
    }

    public final void glMemoryBarrier(int barriers) {
        org.lwjgl.opengl.GL42.glMemoryBarrier(barriers);
    }

    public final void glGetInternalformativ(int target, int internalformat, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL42.glGetInternalformativ(target, internalformat, pname, params);
    }

    public final int glGetInternalformati(int target, int internalformat, int pname) {
        return org.lwjgl.opengl.GL42.glGetInternalformati(target, internalformat, pname);
    }

    public final void glGetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, int[] params) {
        org.lwjgl.opengl.GL42.glGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, params);
    }

    public final void glGetInternalformativ(int target, int internalformat, int pname, int[] params) {
        org.lwjgl.opengl.GL42.glGetInternalformativ(target, internalformat, pname, params);
    }

    public final void glClearBufferData(int target, int internalformat, int format, int type, ByteBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferData(target, internalformat, format, type, data);
    }

    public final void glClearBufferData(int target, int internalformat, int format, int type, ShortBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferData(target, internalformat, format, type, data);
    }

    public final void glClearBufferData(int target, int internalformat, int format, int type, IntBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferData(target, internalformat, format, type, data);
    }

    public final void glClearBufferData(int target, int internalformat, int format, int type, FloatBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferData(target, internalformat, format, type, data);
    }

    public final void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, ByteBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    public final void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, ShortBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    public final void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, IntBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    public final void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, FloatBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    public final void glDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z) {
        org.lwjgl.opengl.GL43.glDispatchCompute(num_groups_x, num_groups_y, num_groups_z);
    }

    public final void glDispatchComputeIndirect(long indirect) {
        org.lwjgl.opengl.GL43.glDispatchComputeIndirect(indirect);
    }

    public final void glCopyImageSubData(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth) {
        org.lwjgl.opengl.GL43.glCopyImageSubData(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
    }

    public final void glDebugMessageControl(int source, int type, int severity, IntBuffer ids, boolean enabled) {
        org.lwjgl.opengl.GL43.glDebugMessageControl(source, type, severity, ids, enabled);
    }

    public final void glDebugMessageControl(int source, int type, int severity, int id, boolean enabled) {
        org.lwjgl.opengl.GL43.glDebugMessageControl(source, type, severity, id, enabled);
    }

    public final void glDebugMessageInsert(int source, int type, int id, int severity, ByteBuffer message) {
        org.lwjgl.opengl.GL43.glDebugMessageInsert(source, type, id, severity, message);
    }

    public final void glDebugMessageInsert(int source, int type, int id, int severity, CharSequence message) {
        org.lwjgl.opengl.GL43.glDebugMessageInsert(source, type, id, severity, message);
    }

    public final void glDebugMessageCallback(GLDebugMessageCallbackI callback, long userParam) {
        org.lwjgl.opengl.GL43.glDebugMessageCallback(callback, userParam);
    }

    public final int glGetDebugMessageLog(int count, IntBuffer sources, IntBuffer types, IntBuffer ids, IntBuffer severities, IntBuffer lengths, ByteBuffer messageLog) {
        return org.lwjgl.opengl.GL43.glGetDebugMessageLog(count, sources, types, ids, severities, lengths, messageLog);
    }

    public final void glPushDebugGroup(int source, int id, ByteBuffer message) {
        org.lwjgl.opengl.GL43.glPushDebugGroup(source, id, message);
    }

    public final void glPushDebugGroup(int source, int id, CharSequence message) {
        org.lwjgl.opengl.GL43.glPushDebugGroup(source, id, message);
    }

    public final void glPopDebugGroup() {
        org.lwjgl.opengl.GL43.glPopDebugGroup();
    }

    public final void glObjectLabel(int identifier, int name, ByteBuffer label) {
        org.lwjgl.opengl.GL43.glObjectLabel(identifier, name, label);
    }

    public final void glObjectLabel(int identifier, int name, CharSequence label) {
        org.lwjgl.opengl.GL43.glObjectLabel(identifier, name, label);
    }

    public final void glGetObjectLabel(int identifier, int name, IntBuffer length, ByteBuffer label) {
        org.lwjgl.opengl.GL43.glGetObjectLabel(identifier, name, length, label);
    }

    public final String glGetObjectLabel(int identifier, int name, int bufSize) {
        return org.lwjgl.opengl.GL43.glGetObjectLabel(identifier, name, bufSize);
    }

    public final String glGetObjectLabel(int identifier, int name) {
        return org.lwjgl.opengl.GL43.glGetObjectLabel(identifier, name);
    }

    public final void glObjectPtrLabel(long ptr, ByteBuffer label) {
        org.lwjgl.opengl.GL43.glObjectPtrLabel(ptr, label);
    }

    public final void glObjectPtrLabel(long ptr, CharSequence label) {
        org.lwjgl.opengl.GL43.glObjectPtrLabel(ptr, label);
    }

    public final void glGetObjectPtrLabel(long ptr, IntBuffer length, ByteBuffer label) {
        org.lwjgl.opengl.GL43.glGetObjectPtrLabel(ptr, length, label);
    }

    public final String glGetObjectPtrLabel(long ptr, int bufSize) {
        return org.lwjgl.opengl.GL43.glGetObjectPtrLabel(ptr, bufSize);
    }

    public final String glGetObjectPtrLabel(long ptr) {
        return org.lwjgl.opengl.GL43.glGetObjectPtrLabel(ptr);
    }

    public final void glFramebufferParameteri(int target, int pname, int param) {
        org.lwjgl.opengl.GL43.glFramebufferParameteri(target, pname, param);
    }

    public final void glGetFramebufferParameteriv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL43.glGetFramebufferParameteriv(target, pname, params);
    }

    public final int glGetFramebufferParameteri(int target, int pname) {
        return org.lwjgl.opengl.GL43.glGetFramebufferParameteri(target, pname);
    }

    public final void glGetInternalformati64v(int target, int internalformat, int pname, LongBuffer params) {
        org.lwjgl.opengl.GL43.glGetInternalformati64v(target, internalformat, pname, params);
    }

    public final long glGetInternalformati64(int target, int internalformat, int pname) {
        return org.lwjgl.opengl.GL43.glGetInternalformati64(target, internalformat, pname);
    }

    public final void glInvalidateTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth) {
        org.lwjgl.opengl.GL43.glInvalidateTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth);
    }

    public final void glInvalidateTexImage(int texture, int level) {
        org.lwjgl.opengl.GL43.glInvalidateTexImage(texture, level);
    }

    public final void glInvalidateBufferSubData(int buffer, long offset, long length) {
        org.lwjgl.opengl.GL43.glInvalidateBufferSubData(buffer, offset, length);
    }

    public final void glInvalidateBufferData(int buffer) {
        org.lwjgl.opengl.GL43.glInvalidateBufferData(buffer);
    }

    public final void glInvalidateFramebuffer(int target, IntBuffer attachments) {
        org.lwjgl.opengl.GL43.glInvalidateFramebuffer(target, attachments);
    }

    public final void glInvalidateFramebuffer(int target, int attachment) {
        org.lwjgl.opengl.GL43.glInvalidateFramebuffer(target, attachment);
    }

    public final void glInvalidateSubFramebuffer(int target, IntBuffer attachments, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL43.glInvalidateSubFramebuffer(target, attachments, x, y, width, height);
    }

    public final void glInvalidateSubFramebuffer(int target, int attachment, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL43.glInvalidateSubFramebuffer(target, attachment, x, y, width, height);
    }

    public final void glMultiDrawArraysIndirect(int mode, ByteBuffer indirect, int drawcount, int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    public final void glMultiDrawArraysIndirect(int mode, long indirect, int drawcount, int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    public final void glMultiDrawArraysIndirect(int mode, IntBuffer indirect, int drawcount, int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    public final void glMultiDrawElementsIndirect(int mode, int type, ByteBuffer indirect, int drawcount, int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    public final void glMultiDrawElementsIndirect(int mode, int type, long indirect, int drawcount, int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    public final void glMultiDrawElementsIndirect(int mode, int type, IntBuffer indirect, int drawcount, int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    public final void glGetProgramInterfaceiv(int program, int programInterface, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL43.glGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    public final int glGetProgramInterfacei(int program, int programInterface, int pname) {
        return org.lwjgl.opengl.GL43.glGetProgramInterfacei(program, programInterface, pname);
    }

    public final int glGetProgramResourceIndex(int program, int programInterface, ByteBuffer name) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceIndex(program, programInterface, name);
    }

    public final int glGetProgramResourceIndex(int program, int programInterface, CharSequence name) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceIndex(program, programInterface, name);
    }

    public final void glGetProgramResourceName(int program, int programInterface, int index, IntBuffer length, ByteBuffer name) {
        org.lwjgl.opengl.GL43.glGetProgramResourceName(program, programInterface, index, length, name);
    }

    public final String glGetProgramResourceName(int program, int programInterface, int index, int bufSize) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceName(program, programInterface, index, bufSize);
    }

    public final String glGetProgramResourceName(int program, int programInterface, int index) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceName(program, programInterface, index);
    }

    public final void glGetProgramResourceiv(int program, int programInterface, int index, IntBuffer props, IntBuffer length, IntBuffer params) {
        org.lwjgl.opengl.GL43.glGetProgramResourceiv(program, programInterface, index, props, length, params);
    }

    public final int glGetProgramResourceLocation(int program, int programInterface, ByteBuffer name) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceLocation(program, programInterface, name);
    }

    public final int glGetProgramResourceLocation(int program, int programInterface, CharSequence name) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceLocation(program, programInterface, name);
    }

    public final int glGetProgramResourceLocationIndex(int program, int programInterface, ByteBuffer name) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceLocationIndex(program, programInterface, name);
    }

    public final int glGetProgramResourceLocationIndex(int program, int programInterface, CharSequence name) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceLocationIndex(program, programInterface, name);
    }

    public final void glShaderStorageBlockBinding(int program, int storageBlockIndex, int storageBlockBinding) {
        org.lwjgl.opengl.GL43.glShaderStorageBlockBinding(program, storageBlockIndex, storageBlockBinding);
    }

    public final void glTexBufferRange(int target, int internalformat, int buffer, long offset, long size) {
        org.lwjgl.opengl.GL43.glTexBufferRange(target, internalformat, buffer, offset, size);
    }

    public final void glTexStorage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
        org.lwjgl.opengl.GL43.glTexStorage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
    }

    public final void glTexStorage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
        org.lwjgl.opengl.GL43.glTexStorage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
    }

    public final void glTextureView(int texture, int target, int origtexture, int internalformat, int minlevel, int numlevels, int minlayer, int numlayers) {
        org.lwjgl.opengl.GL43.glTextureView(texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers);
    }

    public final void glBindVertexBuffer(int bindingindex, int buffer, long offset, int stride) {
        org.lwjgl.opengl.GL43.glBindVertexBuffer(bindingindex, buffer, offset, stride);
    }

    public final void glVertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset) {
        org.lwjgl.opengl.GL43.glVertexAttribFormat(attribindex, size, type, normalized, relativeoffset);
    }

    public final void glVertexAttribIFormat(int attribindex, int size, int type, int relativeoffset) {
        org.lwjgl.opengl.GL43.glVertexAttribIFormat(attribindex, size, type, relativeoffset);
    }

    public final void glVertexAttribLFormat(int attribindex, int size, int type, int relativeoffset) {
        org.lwjgl.opengl.GL43.glVertexAttribLFormat(attribindex, size, type, relativeoffset);
    }

    public final void glVertexAttribBinding(int attribindex, int bindingindex) {
        org.lwjgl.opengl.GL43.glVertexAttribBinding(attribindex, bindingindex);
    }

    public final void glVertexBindingDivisor(int bindingindex, int divisor) {
        org.lwjgl.opengl.GL43.glVertexBindingDivisor(bindingindex, divisor);
    }

    public final void glClearBufferData(int target, int internalformat, int format, int type, short[] data) {
        org.lwjgl.opengl.GL43.glClearBufferData(target, internalformat, format, type, data);
    }

    public final void glClearBufferData(int target, int internalformat, int format, int type, int[] data) {
        org.lwjgl.opengl.GL43.glClearBufferData(target, internalformat, format, type, data);
    }

    public final void glClearBufferData(int target, int internalformat, int format, int type, float[] data) {
        org.lwjgl.opengl.GL43.glClearBufferData(target, internalformat, format, type, data);
    }

    public final void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, short[] data) {
        org.lwjgl.opengl.GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    public final void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, int[] data) {
        org.lwjgl.opengl.GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    public final void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, float[] data) {
        org.lwjgl.opengl.GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    public final void glDebugMessageControl(int source, int type, int severity, int[] ids, boolean enabled) {
        org.lwjgl.opengl.GL43.glDebugMessageControl(source, type, severity, ids, enabled);
    }

    public final int glGetDebugMessageLog(int count, int[] sources, int[] types, int[] ids, int[] severities, int[] lengths, ByteBuffer messageLog) {
        return org.lwjgl.opengl.GL43.glGetDebugMessageLog(count, sources, types, ids, severities, lengths, messageLog);
    }

    public final void glGetObjectLabel(int identifier, int name, int[] length, ByteBuffer label) {
        org.lwjgl.opengl.GL43.glGetObjectLabel(identifier, name, length, label);
    }

    public final void glGetObjectPtrLabel(long ptr, int[] length, ByteBuffer label) {
        org.lwjgl.opengl.GL43.glGetObjectPtrLabel(ptr, length, label);
    }

    public final void glGetFramebufferParameteriv(int target, int pname, int[] params) {
        org.lwjgl.opengl.GL43.glGetFramebufferParameteriv(target, pname, params);
    }

    public final void glGetInternalformati64v(int target, int internalformat, int pname, long[] params) {
        org.lwjgl.opengl.GL43.glGetInternalformati64v(target, internalformat, pname, params);
    }

    public final void glInvalidateFramebuffer(int target, int[] attachments) {
        org.lwjgl.opengl.GL43.glInvalidateFramebuffer(target, attachments);
    }

    public final void glInvalidateSubFramebuffer(int target, int[] attachments, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL43.glInvalidateSubFramebuffer(target, attachments, x, y, width, height);
    }

    public final void glMultiDrawArraysIndirect(int mode, int[] indirect, int drawcount, int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    public final void glMultiDrawElementsIndirect(int mode, int type, int[] indirect, int drawcount, int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    public final void glGetProgramInterfaceiv(int program, int programInterface, int pname, int[] params) {
        org.lwjgl.opengl.GL43.glGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    public final void glGetProgramResourceName(int program, int programInterface, int index, int[] length, ByteBuffer name) {
        org.lwjgl.opengl.GL43.glGetProgramResourceName(program, programInterface, index, length, name);
    }

    public final void glGetProgramResourceiv(int program, int programInterface, int index, int[] props, int[] length, int[] params) {
        org.lwjgl.opengl.GL43.glGetProgramResourceiv(program, programInterface, index, props, length, params);
    }

    public final void glBufferStorage(int target, long size, int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, size, flags);
    }

    public final void glBufferStorage(int target, ByteBuffer data, int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    public final void glBufferStorage(int target, ShortBuffer data, int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    public final void glBufferStorage(int target, IntBuffer data, int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    public final void glBufferStorage(int target, FloatBuffer data, int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    public final void glBufferStorage(int target, DoubleBuffer data, int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    public final void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    public final void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    public final void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    public final void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    public final void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    public final void glClearTexImage(int texture, int level, int format, int type, ByteBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    public final void glClearTexImage(int texture, int level, int format, int type, ShortBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    public final void glClearTexImage(int texture, int level, int format, int type, IntBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    public final void glClearTexImage(int texture, int level, int format, int type, FloatBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    public final void glClearTexImage(int texture, int level, int format, int type, DoubleBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    public final void glBindBuffersBase(int target, int first, IntBuffer buffers) {
        org.lwjgl.opengl.GL44.glBindBuffersBase(target, first, buffers);
    }

    public final void glBindBuffersRange(int target, int first, IntBuffer buffers, PointerBuffer offsets, PointerBuffer sizes) {
        org.lwjgl.opengl.GL44.glBindBuffersRange(target, first, buffers, offsets, sizes);
    }

    public final void glBindTextures(int first, IntBuffer textures) {
        org.lwjgl.opengl.GL44.glBindTextures(first, textures);
    }

    public final void glBindSamplers(int first, IntBuffer samplers) {
        org.lwjgl.opengl.GL44.glBindSamplers(first, samplers);
    }

    public final void glBindImageTextures(int first, IntBuffer textures) {
        org.lwjgl.opengl.GL44.glBindImageTextures(first, textures);
    }

    public final void glBindVertexBuffers(int first, IntBuffer buffers, PointerBuffer offsets, IntBuffer strides) {
        org.lwjgl.opengl.GL44.glBindVertexBuffers(first, buffers, offsets, strides);
    }

    public final void glBufferStorage(int target, short[] data, int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    public final void glBufferStorage(int target, int[] data, int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    public final void glBufferStorage(int target, float[] data, int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    public final void glBufferStorage(int target, double[] data, int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    public final void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    public final void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    public final void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    public final void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, double[] data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    public final void glClearTexImage(int texture, int level, int format, int type, short[] data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    public final void glClearTexImage(int texture, int level, int format, int type, int[] data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    public final void glClearTexImage(int texture, int level, int format, int type, float[] data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    public final void glClearTexImage(int texture, int level, int format, int type, double[] data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    public final void glBindBuffersBase(int target, int first, int[] buffers) {
        org.lwjgl.opengl.GL44.glBindBuffersBase(target, first, buffers);
    }

    public final void glBindBuffersRange(int target, int first, int[] buffers, PointerBuffer offsets, PointerBuffer sizes) {
        org.lwjgl.opengl.GL44.glBindBuffersRange(target, first, buffers, offsets, sizes);
    }

    public final void glBindTextures(int first, int[] textures) {
        org.lwjgl.opengl.GL44.glBindTextures(first, textures);
    }

    public final void glBindSamplers(int first, int[] samplers) {
        org.lwjgl.opengl.GL44.glBindSamplers(first, samplers);
    }

    public final void glBindImageTextures(int first, int[] textures) {
        org.lwjgl.opengl.GL44.glBindImageTextures(first, textures);
    }

    public final void glBindVertexBuffers(int first, int[] buffers, PointerBuffer offsets, int[] strides) {
        org.lwjgl.opengl.GL44.glBindVertexBuffers(first, buffers, offsets, strides);
    }

    public final void glClipControl(int origin, int depth) {
        org.lwjgl.opengl.GL45.glClipControl(origin, depth);
    }

    public final void glCreateTransformFeedbacks(IntBuffer ids) {
        org.lwjgl.opengl.GL45.glCreateTransformFeedbacks(ids);
    }

    public final int glCreateTransformFeedbacks() {
        return org.lwjgl.opengl.GL45.glCreateTransformFeedbacks();
    }

    public final void glTransformFeedbackBufferBase(int xfb, int index, int buffer) {
        org.lwjgl.opengl.GL45.glTransformFeedbackBufferBase(xfb, index, buffer);
    }

    public final void glTransformFeedbackBufferRange(int xfb, int index, int buffer, long offset, long size) {
        org.lwjgl.opengl.GL45.glTransformFeedbackBufferRange(xfb, index, buffer, offset, size);
    }

    public final void glGetTransformFeedbackiv(int xfb, int pname, IntBuffer param) {
        org.lwjgl.opengl.GL45.glGetTransformFeedbackiv(xfb, pname, param);
    }

    public final int glGetTransformFeedbacki(int xfb, int pname) {
        return org.lwjgl.opengl.GL45.glGetTransformFeedbacki(xfb, pname);
    }

    public final void glGetTransformFeedbacki_v(int xfb, int pname, int index, IntBuffer param) {
        org.lwjgl.opengl.GL45.glGetTransformFeedbacki_v(xfb, pname, index, param);
    }

    public final int glGetTransformFeedbacki(int xfb, int pname, int index) {
        return org.lwjgl.opengl.GL45.glGetTransformFeedbacki(xfb, pname, index);
    }

    public final void glGetTransformFeedbacki64_v(int xfb, int pname, int index, LongBuffer param) {
        org.lwjgl.opengl.GL45.glGetTransformFeedbacki64_v(xfb, pname, index, param);
    }

    public final long glGetTransformFeedbacki64(int xfb, int pname, int index) {
        return org.lwjgl.opengl.GL45.glGetTransformFeedbacki64(xfb, pname, index);
    }

    public final void glCreateBuffers(IntBuffer buffers) {
        org.lwjgl.opengl.GL45.glCreateBuffers(buffers);
    }

    public final int glCreateBuffers() {
        return org.lwjgl.opengl.GL45.glCreateBuffers();
    }

    public final void glNamedBufferStorage(int buffer, long size, int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, size, flags);
    }

    public final void glNamedBufferStorage(int buffer, ByteBuffer data, int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    public final void glNamedBufferStorage(int buffer, ShortBuffer data, int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    public final void glNamedBufferStorage(int buffer, IntBuffer data, int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    public final void glNamedBufferStorage(int buffer, FloatBuffer data, int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    public final void glNamedBufferStorage(int buffer, DoubleBuffer data, int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    public final void glNamedBufferData(int buffer, long size, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, size, usage);
    }

    public final void glNamedBufferData(int buffer, ByteBuffer data, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    public final void glNamedBufferData(int buffer, ShortBuffer data, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    public final void glNamedBufferData(int buffer, IntBuffer data, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    public final void glNamedBufferData(int buffer, LongBuffer data, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    public final void glNamedBufferData(int buffer, FloatBuffer data, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    public final void glNamedBufferData(int buffer, DoubleBuffer data, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    public final void glNamedBufferSubData(int buffer, long offset, ByteBuffer data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    public final void glNamedBufferSubData(int buffer, long offset, ShortBuffer data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    public final void glNamedBufferSubData(int buffer, long offset, IntBuffer data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    public final void glNamedBufferSubData(int buffer, long offset, LongBuffer data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    public final void glNamedBufferSubData(int buffer, long offset, FloatBuffer data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    public final void glNamedBufferSubData(int buffer, long offset, DoubleBuffer data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    public final void glCopyNamedBufferSubData(int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size) {
        org.lwjgl.opengl.GL45.glCopyNamedBufferSubData(readBuffer, writeBuffer, readOffset, writeOffset, size);
    }

    public final void glClearNamedBufferData(int buffer, int internalformat, int format, int type, ByteBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    public final void glClearNamedBufferData(int buffer, int internalformat, int format, int type, ShortBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    public final void glClearNamedBufferData(int buffer, int internalformat, int format, int type, IntBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    public final void glClearNamedBufferData(int buffer, int internalformat, int format, int type, FloatBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    public final void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, ByteBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    public final void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, ShortBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    public final void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, IntBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    public final void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, FloatBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    public final ByteBuffer glMapNamedBuffer(int buffer, int access) {
        return org.lwjgl.opengl.GL45.glMapNamedBuffer(buffer, access);
    }

    public final ByteBuffer glMapNamedBuffer(int buffer, int access, ByteBuffer old_buffer) {
        return org.lwjgl.opengl.GL45.glMapNamedBuffer(buffer, access, old_buffer);
    }

    public final ByteBuffer glMapNamedBuffer(int buffer, int access, long length, ByteBuffer old_buffer) {
        return org.lwjgl.opengl.GL45.glMapNamedBuffer(buffer, access, length, old_buffer);
    }

    public final ByteBuffer glMapNamedBufferRange(int buffer, long offset, long length, int access) {
        return org.lwjgl.opengl.GL45.glMapNamedBufferRange(buffer, offset, length, access);
    }

    public final ByteBuffer glMapNamedBufferRange(int buffer, long offset, long length, int access, ByteBuffer old_buffer) {
        return org.lwjgl.opengl.GL45.glMapNamedBufferRange(buffer, offset, length, access, old_buffer);
    }

    public final boolean glUnmapNamedBuffer(int buffer) {
        return org.lwjgl.opengl.GL45.glUnmapNamedBuffer(buffer);
    }

    public final void glFlushMappedNamedBufferRange(int buffer, long offset, long length) {
        org.lwjgl.opengl.GL45.glFlushMappedNamedBufferRange(buffer, offset, length);
    }

    public final void glGetNamedBufferParameteriv(int buffer, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetNamedBufferParameteriv(buffer, pname, params);
    }

    public final int glGetNamedBufferParameteri(int buffer, int pname) {
        return org.lwjgl.opengl.GL45.glGetNamedBufferParameteri(buffer, pname);
    }

    public final void glGetNamedBufferParameteri64v(int buffer, int pname, LongBuffer params) {
        org.lwjgl.opengl.GL45.glGetNamedBufferParameteri64v(buffer, pname, params);
    }

    public final long glGetNamedBufferParameteri64(int buffer, int pname) {
        return org.lwjgl.opengl.GL45.glGetNamedBufferParameteri64(buffer, pname);
    }

    public final void glGetNamedBufferPointerv(int buffer, int pname, PointerBuffer params) {
        org.lwjgl.opengl.GL45.glGetNamedBufferPointerv(buffer, pname, params);
    }

    public final long glGetNamedBufferPointer(int buffer, int pname) {
        return org.lwjgl.opengl.GL45.glGetNamedBufferPointer(buffer, pname);
    }

    public final void glGetNamedBufferSubData(int buffer, long offset, ByteBuffer data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    public final void glGetNamedBufferSubData(int buffer, long offset, ShortBuffer data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    public final void glGetNamedBufferSubData(int buffer, long offset, IntBuffer data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    public final void glGetNamedBufferSubData(int buffer, long offset, LongBuffer data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    public final void glGetNamedBufferSubData(int buffer, long offset, FloatBuffer data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    public final void glGetNamedBufferSubData(int buffer, long offset, DoubleBuffer data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    public final void glCreateFramebuffers(IntBuffer framebuffers) {
        org.lwjgl.opengl.GL45.glCreateFramebuffers(framebuffers);
    }

    public final int glCreateFramebuffers() {
        return org.lwjgl.opengl.GL45.glCreateFramebuffers();
    }

    public final void glNamedFramebufferRenderbuffer(int framebuffer, int attachment, int renderbuffertarget, int renderbuffer) {
        org.lwjgl.opengl.GL45.glNamedFramebufferRenderbuffer(framebuffer, attachment, renderbuffertarget, renderbuffer);
    }

    public final void glNamedFramebufferParameteri(int framebuffer, int pname, int param) {
        org.lwjgl.opengl.GL45.glNamedFramebufferParameteri(framebuffer, pname, param);
    }

    public final void glNamedFramebufferTexture(int framebuffer, int attachment, int texture, int level) {
        org.lwjgl.opengl.GL45.glNamedFramebufferTexture(framebuffer, attachment, texture, level);
    }

    public final void glNamedFramebufferTextureLayer(int framebuffer, int attachment, int texture, int level, int layer) {
        org.lwjgl.opengl.GL45.glNamedFramebufferTextureLayer(framebuffer, attachment, texture, level, layer);
    }

    public final void glNamedFramebufferDrawBuffer(int framebuffer, int buf) {
        org.lwjgl.opengl.GL45.glNamedFramebufferDrawBuffer(framebuffer, buf);
    }

    public final void glNamedFramebufferDrawBuffers(int framebuffer, IntBuffer bufs) {
        org.lwjgl.opengl.GL45.glNamedFramebufferDrawBuffers(framebuffer, bufs);
    }

    public final void glNamedFramebufferDrawBuffers(int framebuffer, int buf) {
        org.lwjgl.opengl.GL45.glNamedFramebufferDrawBuffers(framebuffer, buf);
    }

    public final void glNamedFramebufferReadBuffer(int framebuffer, int src) {
        org.lwjgl.opengl.GL45.glNamedFramebufferReadBuffer(framebuffer, src);
    }

    public final void glInvalidateNamedFramebufferData(int framebuffer, IntBuffer attachments) {
        org.lwjgl.opengl.GL45.glInvalidateNamedFramebufferData(framebuffer, attachments);
    }

    public final void glInvalidateNamedFramebufferData(int framebuffer, int attachment) {
        org.lwjgl.opengl.GL45.glInvalidateNamedFramebufferData(framebuffer, attachment);
    }

    public final void glInvalidateNamedFramebufferSubData(int framebuffer, IntBuffer attachments, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL45.glInvalidateNamedFramebufferSubData(framebuffer, attachments, x, y, width, height);
    }

    public final void glInvalidateNamedFramebufferSubData(int framebuffer, int attachment, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL45.glInvalidateNamedFramebufferSubData(framebuffer, attachment, x, y, width, height);
    }

    public final void glClearNamedFramebufferiv(int framebuffer, int buffer, int drawbuffer, IntBuffer value) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, value);
    }

    public final void glClearNamedFramebufferuiv(int framebuffer, int buffer, int drawbuffer, IntBuffer value) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, value);
    }

    public final void glClearNamedFramebufferfv(int framebuffer, int buffer, int drawbuffer, FloatBuffer value) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, value);
    }

    public final void glClearNamedFramebufferfi(int framebuffer, int buffer, int drawbuffer, float depth, int stencil) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferfi(framebuffer, buffer, drawbuffer, depth, stencil);
    }

    public final void glBlitNamedFramebuffer(int readFramebuffer, int drawFramebuffer, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        org.lwjgl.opengl.GL45.glBlitNamedFramebuffer(readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
    }

    public final int glCheckNamedFramebufferStatus(int framebuffer, int target) {
        return org.lwjgl.opengl.GL45.glCheckNamedFramebufferStatus(framebuffer, target);
    }

    public final void glGetNamedFramebufferParameteriv(int framebuffer, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetNamedFramebufferParameteriv(framebuffer, pname, params);
    }

    public final int glGetNamedFramebufferParameteri(int framebuffer, int pname) {
        return org.lwjgl.opengl.GL45.glGetNamedFramebufferParameteri(framebuffer, pname);
    }

    public final void glGetNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, params);
    }

    public final int glGetNamedFramebufferAttachmentParameteri(int framebuffer, int attachment, int pname) {
        return org.lwjgl.opengl.GL45.glGetNamedFramebufferAttachmentParameteri(framebuffer, attachment, pname);
    }

    public final void glCreateRenderbuffers(IntBuffer renderbuffers) {
        org.lwjgl.opengl.GL45.glCreateRenderbuffers(renderbuffers);
    }

    public final int glCreateRenderbuffers() {
        return org.lwjgl.opengl.GL45.glCreateRenderbuffers();
    }

    public final void glNamedRenderbufferStorage(int renderbuffer, int internalformat, int width, int height) {
        org.lwjgl.opengl.GL45.glNamedRenderbufferStorage(renderbuffer, internalformat, width, height);
    }

    public final void glNamedRenderbufferStorageMultisample(int renderbuffer, int samples, int internalformat, int width, int height) {
        org.lwjgl.opengl.GL45.glNamedRenderbufferStorageMultisample(renderbuffer, samples, internalformat, width, height);
    }

    public final void glGetNamedRenderbufferParameteriv(int renderbuffer, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetNamedRenderbufferParameteriv(renderbuffer, pname, params);
    }

    public final int glGetNamedRenderbufferParameteri(int renderbuffer, int pname) {
        return org.lwjgl.opengl.GL45.glGetNamedRenderbufferParameteri(renderbuffer, pname);
    }

    public final void glCreateTextures(int target, IntBuffer textures) {
        org.lwjgl.opengl.GL45.glCreateTextures(target, textures);
    }

    public final int glCreateTextures(int target) {
        return org.lwjgl.opengl.GL45.glCreateTextures(target);
    }

    public final void glTextureBuffer(int texture, int internalformat, int buffer) {
        org.lwjgl.opengl.GL45.glTextureBuffer(texture, internalformat, buffer);
    }

    public final void glTextureBufferRange(int texture, int internalformat, int buffer, long offset, long size) {
        org.lwjgl.opengl.GL45.glTextureBufferRange(texture, internalformat, buffer, offset, size);
    }

    public final void glTextureStorage1D(int texture, int levels, int internalformat, int width) {
        org.lwjgl.opengl.GL45.glTextureStorage1D(texture, levels, internalformat, width);
    }

    public final void glTextureStorage2D(int texture, int levels, int internalformat, int width, int height) {
        org.lwjgl.opengl.GL45.glTextureStorage2D(texture, levels, internalformat, width, height);
    }

    public final void glTextureStorage3D(int texture, int levels, int internalformat, int width, int height, int depth) {
        org.lwjgl.opengl.GL45.glTextureStorage3D(texture, levels, internalformat, width, height, depth);
    }

    public final void glTextureStorage2DMultisample(int texture, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
        org.lwjgl.opengl.GL45.glTextureStorage2DMultisample(texture, samples, internalformat, width, height, fixedsamplelocations);
    }

    public final void glTextureStorage3DMultisample(int texture, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
        org.lwjgl.opengl.GL45.glTextureStorage3DMultisample(texture, samples, internalformat, width, height, depth, fixedsamplelocations);
    }

    public final void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    public final void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, long pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    public final void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    public final void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    public final void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    public final void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    public final void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public final void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public final void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public final void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public final void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public final void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public final void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, long data) {
        org.lwjgl.opengl.GL45.glCompressedTextureSubImage1D(texture, level, xoffset, width, format, imageSize, data);
    }

    public final void glCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, ByteBuffer data) {
        org.lwjgl.opengl.GL45.glCompressedTextureSubImage1D(texture, level, xoffset, width, format, data);
    }

    public final void glCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
        org.lwjgl.opengl.GL45.glCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    public final void glCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
        org.lwjgl.opengl.GL45.glCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, data);
    }

    public final void glCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        org.lwjgl.opengl.GL45.glCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    public final void glCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
        org.lwjgl.opengl.GL45.glCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, data);
    }

    public final void glCopyTextureSubImage1D(int texture, int level, int xoffset, int x, int y, int width) {
        org.lwjgl.opengl.GL45.glCopyTextureSubImage1D(texture, level, xoffset, x, y, width);
    }

    public final void glCopyTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL45.glCopyTextureSubImage2D(texture, level, xoffset, yoffset, x, y, width, height);
    }

    public final void glCopyTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL45.glCopyTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, x, y, width, height);
    }

    public final void glTextureParameterf(int texture, int pname, float param) {
        org.lwjgl.opengl.GL45.glTextureParameterf(texture, pname, param);
    }

    public final void glTextureParameterfv(int texture, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL45.glTextureParameterfv(texture, pname, params);
    }

    public final void glTextureParameteri(int texture, int pname, int param) {
        org.lwjgl.opengl.GL45.glTextureParameteri(texture, pname, param);
    }

    public final void glTextureParameterIiv(int texture, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glTextureParameterIiv(texture, pname, params);
    }

    public final void glTextureParameterIi(int texture, int pname, int param) {
        org.lwjgl.opengl.GL45.glTextureParameterIi(texture, pname, param);
    }

    public final void glTextureParameterIuiv(int texture, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glTextureParameterIuiv(texture, pname, params);
    }

    public final void glTextureParameterIui(int texture, int pname, int param) {
        org.lwjgl.opengl.GL45.glTextureParameterIui(texture, pname, param);
    }

    public final void glTextureParameteriv(int texture, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glTextureParameteriv(texture, pname, params);
    }

    public final void glGenerateTextureMipmap(int texture) {
        org.lwjgl.opengl.GL45.glGenerateTextureMipmap(texture);
    }

    public final void glBindTextureUnit(int unit, int texture) {
        org.lwjgl.opengl.GL45.glBindTextureUnit(unit, texture);
    }

    public final void glGetTextureImage(int texture, int level, int format, int type, int bufSize, long pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, bufSize, pixels);
    }

    public final void glGetTextureImage(int texture, int level, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    public final void glGetTextureImage(int texture, int level, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    public final void glGetTextureImage(int texture, int level, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    public final void glGetTextureImage(int texture, int level, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    public final void glGetTextureImage(int texture, int level, int format, int type, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    public final void glGetCompressedTextureImage(int texture, int level, int bufSize, long pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureImage(texture, level, bufSize, pixels);
    }

    public final void glGetCompressedTextureImage(int texture, int level, ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureImage(texture, level, pixels);
    }

    public final void glGetTextureLevelParameterfv(int texture, int level, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL45.glGetTextureLevelParameterfv(texture, level, pname, params);
    }

    public final float glGetTextureLevelParameterf(int texture, int level, int pname) {
        return org.lwjgl.opengl.GL45.glGetTextureLevelParameterf(texture, level, pname);
    }

    public final void glGetTextureLevelParameteriv(int texture, int level, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetTextureLevelParameteriv(texture, level, pname, params);
    }

    public final int glGetTextureLevelParameteri(int texture, int level, int pname) {
        return org.lwjgl.opengl.GL45.glGetTextureLevelParameteri(texture, level, pname);
    }

    public final void glGetTextureParameterfv(int texture, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL45.glGetTextureParameterfv(texture, pname, params);
    }

    public final float glGetTextureParameterf(int texture, int pname) {
        return org.lwjgl.opengl.GL45.glGetTextureParameterf(texture, pname);
    }

    public final void glGetTextureParameterIiv(int texture, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetTextureParameterIiv(texture, pname, params);
    }

    public final int glGetTextureParameterIi(int texture, int pname) {
        return org.lwjgl.opengl.GL45.glGetTextureParameterIi(texture, pname);
    }

    public final void glGetTextureParameterIuiv(int texture, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetTextureParameterIuiv(texture, pname, params);
    }

    public final int glGetTextureParameterIui(int texture, int pname) {
        return org.lwjgl.opengl.GL45.glGetTextureParameterIui(texture, pname);
    }

    public final void glGetTextureParameteriv(int texture, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetTextureParameteriv(texture, pname, params);
    }

    public final int glGetTextureParameteri(int texture, int pname) {
        return org.lwjgl.opengl.GL45.glGetTextureParameteri(texture, pname);
    }

    public final void glCreateVertexArrays(IntBuffer arrays) {
        org.lwjgl.opengl.GL45.glCreateVertexArrays(arrays);
    }

    public final int glCreateVertexArrays() {
        return org.lwjgl.opengl.GL45.glCreateVertexArrays();
    }

    public final void glDisableVertexArrayAttrib(int vaobj, int index) {
        org.lwjgl.opengl.GL45.glDisableVertexArrayAttrib(vaobj, index);
    }

    public final void glEnableVertexArrayAttrib(int vaobj, int index) {
        org.lwjgl.opengl.GL45.glEnableVertexArrayAttrib(vaobj, index);
    }

    public final void glVertexArrayElementBuffer(int vaobj, int buffer) {
        org.lwjgl.opengl.GL45.glVertexArrayElementBuffer(vaobj, buffer);
    }

    public final void glVertexArrayVertexBuffer(int vaobj, int bindingindex, int buffer, long offset, int stride) {
        org.lwjgl.opengl.GL45.glVertexArrayVertexBuffer(vaobj, bindingindex, buffer, offset, stride);
    }

    public final void glVertexArrayVertexBuffers(int vaobj, int first, IntBuffer buffers, PointerBuffer offsets, IntBuffer strides) {
        org.lwjgl.opengl.GL45.glVertexArrayVertexBuffers(vaobj, first, buffers, offsets, strides);
    }

    public final void glVertexArrayAttribFormat(int vaobj, int attribindex, int size, int type, boolean normalized, int relativeoffset) {
        org.lwjgl.opengl.GL45.glVertexArrayAttribFormat(vaobj, attribindex, size, type, normalized, relativeoffset);
    }

    public final void glVertexArrayAttribIFormat(int vaobj, int attribindex, int size, int type, int relativeoffset) {
        org.lwjgl.opengl.GL45.glVertexArrayAttribIFormat(vaobj, attribindex, size, type, relativeoffset);
    }

    public final void glVertexArrayAttribLFormat(int vaobj, int attribindex, int size, int type, int relativeoffset) {
        org.lwjgl.opengl.GL45.glVertexArrayAttribLFormat(vaobj, attribindex, size, type, relativeoffset);
    }

    public final void glVertexArrayAttribBinding(int vaobj, int attribindex, int bindingindex) {
        org.lwjgl.opengl.GL45.glVertexArrayAttribBinding(vaobj, attribindex, bindingindex);
    }

    public final void glVertexArrayBindingDivisor(int vaobj, int bindingindex, int divisor) {
        org.lwjgl.opengl.GL45.glVertexArrayBindingDivisor(vaobj, bindingindex, divisor);
    }

    public final void glGetVertexArrayiv(int vaobj, int pname, IntBuffer param) {
        org.lwjgl.opengl.GL45.glGetVertexArrayiv(vaobj, pname, param);
    }

    public final int glGetVertexArrayi(int vaobj, int pname) {
        return org.lwjgl.opengl.GL45.glGetVertexArrayi(vaobj, pname);
    }

    public final void glGetVertexArrayIndexediv(int vaobj, int index, int pname, IntBuffer param) {
        org.lwjgl.opengl.GL45.glGetVertexArrayIndexediv(vaobj, index, pname, param);
    }

    public final int glGetVertexArrayIndexedi(int vaobj, int index, int pname) {
        return org.lwjgl.opengl.GL45.glGetVertexArrayIndexedi(vaobj, index, pname);
    }

    public final void glGetVertexArrayIndexed64iv(int vaobj, int index, int pname, LongBuffer param) {
        org.lwjgl.opengl.GL45.glGetVertexArrayIndexed64iv(vaobj, index, pname, param);
    }

    public final long glGetVertexArrayIndexed64i(int vaobj, int index, int pname) {
        return org.lwjgl.opengl.GL45.glGetVertexArrayIndexed64i(vaobj, index, pname);
    }

    public final void glCreateSamplers(IntBuffer samplers) {
        org.lwjgl.opengl.GL45.glCreateSamplers(samplers);
    }

    public final int glCreateSamplers() {
        return org.lwjgl.opengl.GL45.glCreateSamplers();
    }

    public final void glCreateProgramPipelines(IntBuffer pipelines) {
        org.lwjgl.opengl.GL45.glCreateProgramPipelines(pipelines);
    }

    public final int glCreateProgramPipelines() {
        return org.lwjgl.opengl.GL45.glCreateProgramPipelines();
    }

    public final void glCreateQueries(int target, IntBuffer ids) {
        org.lwjgl.opengl.GL45.glCreateQueries(target, ids);
    }

    public final int glCreateQueries(int target) {
        return org.lwjgl.opengl.GL45.glCreateQueries(target);
    }

    public final void glGetQueryBufferObjectiv(int id, int buffer, int pname, long offset) {
        org.lwjgl.opengl.GL45.glGetQueryBufferObjectiv(id, buffer, pname, offset);
    }

    public final void glGetQueryBufferObjectuiv(int id, int buffer, int pname, long offset) {
        org.lwjgl.opengl.GL45.glGetQueryBufferObjectuiv(id, buffer, pname, offset);
    }

    public final void glGetQueryBufferObjecti64v(int id, int buffer, int pname, long offset) {
        org.lwjgl.opengl.GL45.glGetQueryBufferObjecti64v(id, buffer, pname, offset);
    }

    public final void glGetQueryBufferObjectui64v(int id, int buffer, int pname, long offset) {
        org.lwjgl.opengl.GL45.glGetQueryBufferObjectui64v(id, buffer, pname, offset);
    }

    public final void glMemoryBarrierByRegion(int barriers) {
        org.lwjgl.opengl.GL45.glMemoryBarrierByRegion(barriers);
    }

    public final void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, long pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels);
    }

    public final void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, long pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels);
    }

    public final void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    public final void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, ShortBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    public final void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, IntBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    public final void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, FloatBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    public final void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    public final void glTextureBarrier() {
        org.lwjgl.opengl.GL45.glTextureBarrier();
    }

    public final int glGetGraphicsResetStatus() {
        return org.lwjgl.opengl.GL45.glGetGraphicsResetStatus();
    }

    public final void glGetnMapdv(int target, int query, DoubleBuffer data) {
        org.lwjgl.opengl.GL45.glGetnMapdv(target, query, data);
    }

    public final double glGetnMapd(int target, int query) {
        return org.lwjgl.opengl.GL45.glGetnMapd(target, query);
    }

    public final void glGetnMapfv(int target, int query, FloatBuffer data) {
        org.lwjgl.opengl.GL45.glGetnMapfv(target, query, data);
    }

    public final float glGetnMapf(int target, int query) {
        return org.lwjgl.opengl.GL45.glGetnMapf(target, query);
    }

    public final void glGetnMapiv(int target, int query, IntBuffer data) {
        org.lwjgl.opengl.GL45.glGetnMapiv(target, query, data);
    }

    public final int glGetnMapi(int target, int query) {
        return org.lwjgl.opengl.GL45.glGetnMapi(target, query);
    }

    public final void glGetnPixelMapfv(int map, FloatBuffer data) {
        org.lwjgl.opengl.GL45.glGetnPixelMapfv(map, data);
    }

    public final void glGetnPixelMapuiv(int map, IntBuffer data) {
        org.lwjgl.opengl.GL45.glGetnPixelMapuiv(map, data);
    }

    public final void glGetnPixelMapusv(int map, ShortBuffer data) {
        org.lwjgl.opengl.GL45.glGetnPixelMapusv(map, data);
    }

    public final void glGetnPolygonStipple(int bufSize, long pattern) {
        org.lwjgl.opengl.GL45.glGetnPolygonStipple(bufSize, pattern);
    }

    public final void glGetnPolygonStipple(ByteBuffer pattern) {
        org.lwjgl.opengl.GL45.glGetnPolygonStipple(pattern);
    }

    public final void glGetnTexImage(int tex, int level, int format, int type, int bufSize, long img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, bufSize, img);
    }

    public final void glGetnTexImage(int tex, int level, int format, int type, ByteBuffer img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    public final void glGetnTexImage(int tex, int level, int format, int type, ShortBuffer img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    public final void glGetnTexImage(int tex, int level, int format, int type, IntBuffer img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    public final void glGetnTexImage(int tex, int level, int format, int type, FloatBuffer img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    public final void glGetnTexImage(int tex, int level, int format, int type, DoubleBuffer img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    public final void glReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, bufSize, pixels);
    }

    public final void glReadnPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    public final void glReadnPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    public final void glReadnPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    public final void glReadnPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    public final void glGetnColorTable(int target, int format, int type, int bufSize, long table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, bufSize, table);
    }

    public final void glGetnColorTable(int target, int format, int type, ByteBuffer table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, table);
    }

    public final void glGetnColorTable(int target, int format, int type, ShortBuffer table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, table);
    }

    public final void glGetnColorTable(int target, int format, int type, IntBuffer table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, table);
    }

    public final void glGetnColorTable(int target, int format, int type, FloatBuffer table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, table);
    }

    public final void glGetnConvolutionFilter(int target, int format, int type, int bufSize, long image) {
        org.lwjgl.opengl.GL45.glGetnConvolutionFilter(target, format, type, bufSize, image);
    }

    public final void glGetnConvolutionFilter(int target, int format, int type, ByteBuffer image) {
        org.lwjgl.opengl.GL45.glGetnConvolutionFilter(target, format, type, image);
    }

    public final void glGetnSeparableFilter(int target, int format, int type, int rowBufSize, long row, int columnBufSize, long column, ByteBuffer span) {
        org.lwjgl.opengl.GL45.glGetnSeparableFilter(target, format, type, rowBufSize, row, columnBufSize, column, span);
    }

    public final void glGetnSeparableFilter(int target, int format, int type, ByteBuffer row, ByteBuffer column, ByteBuffer span) {
        org.lwjgl.opengl.GL45.glGetnSeparableFilter(target, format, type, row, column, span);
    }

    public final void glGetnHistogram(int target, boolean reset, int format, int type, int bufSize, long values) {
        org.lwjgl.opengl.GL45.glGetnHistogram(target, reset, format, type, bufSize, values);
    }

    public final void glGetnHistogram(int target, boolean reset, int format, int type, ByteBuffer values) {
        org.lwjgl.opengl.GL45.glGetnHistogram(target, reset, format, type, values);
    }

    public final void glGetnMinmax(int target, boolean reset, int format, int type, int bufSize, long values) {
        org.lwjgl.opengl.GL45.glGetnMinmax(target, reset, format, type, bufSize, values);
    }

    public final void glGetnMinmax(int target, boolean reset, int format, int type, ByteBuffer values) {
        org.lwjgl.opengl.GL45.glGetnMinmax(target, reset, format, type, values);
    }

    public final void glGetnCompressedTexImage(int target, int level, int bufSize, long img) {
        org.lwjgl.opengl.GL45.glGetnCompressedTexImage(target, level, bufSize, img);
    }

    public final void glGetnCompressedTexImage(int target, int level, ByteBuffer img) {
        org.lwjgl.opengl.GL45.glGetnCompressedTexImage(target, level, img);
    }

    public final void glGetnUniformfv(int program, int location, FloatBuffer params) {
        org.lwjgl.opengl.GL45.glGetnUniformfv(program, location, params);
    }

    public final float glGetnUniformf(int program, int location) {
        return org.lwjgl.opengl.GL45.glGetnUniformf(program, location);
    }

    public final void glGetnUniformdv(int program, int location, DoubleBuffer params) {
        org.lwjgl.opengl.GL45.glGetnUniformdv(program, location, params);
    }

    public final double glGetnUniformd(int program, int location) {
        return org.lwjgl.opengl.GL45.glGetnUniformd(program, location);
    }

    public final void glGetnUniformiv(int program, int location, IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetnUniformiv(program, location, params);
    }

    public final int glGetnUniformi(int program, int location) {
        return org.lwjgl.opengl.GL45.glGetnUniformi(program, location);
    }

    public final void glGetnUniformuiv(int program, int location, IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetnUniformuiv(program, location, params);
    }

    public final int glGetnUniformui(int program, int location) {
        return org.lwjgl.opengl.GL45.glGetnUniformui(program, location);
    }

    public final void glCreateTransformFeedbacks(int[] ids) {
        org.lwjgl.opengl.GL45.glCreateTransformFeedbacks(ids);
    }

    public final void glGetTransformFeedbackiv(int xfb, int pname, int[] param) {
        org.lwjgl.opengl.GL45.glGetTransformFeedbackiv(xfb, pname, param);
    }

    public final void glGetTransformFeedbacki_v(int xfb, int pname, int index, int[] param) {
        org.lwjgl.opengl.GL45.glGetTransformFeedbacki_v(xfb, pname, index, param);
    }

    public final void glGetTransformFeedbacki64_v(int xfb, int pname, int index, long[] param) {
        org.lwjgl.opengl.GL45.glGetTransformFeedbacki64_v(xfb, pname, index, param);
    }

    public final void glCreateBuffers(int[] buffers) {
        org.lwjgl.opengl.GL45.glCreateBuffers(buffers);
    }

    public final void glNamedBufferStorage(int buffer, short[] data, int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    public final void glNamedBufferStorage(int buffer, int[] data, int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    public final void glNamedBufferStorage(int buffer, float[] data, int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    public final void glNamedBufferStorage(int buffer, double[] data, int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    public final void glNamedBufferData(int buffer, short[] data, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    public final void glNamedBufferData(int buffer, int[] data, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    public final void glNamedBufferData(int buffer, long[] data, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    public final void glNamedBufferData(int buffer, float[] data, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    public final void glNamedBufferData(int buffer, double[] data, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    public final void glNamedBufferSubData(int buffer, long offset, short[] data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    public final void glNamedBufferSubData(int buffer, long offset, int[] data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    public final void glNamedBufferSubData(int buffer, long offset, long[] data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    public final void glNamedBufferSubData(int buffer, long offset, float[] data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    public final void glNamedBufferSubData(int buffer, long offset, double[] data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    public final void glClearNamedBufferData(int buffer, int internalformat, int format, int type, short[] data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    public final void glClearNamedBufferData(int buffer, int internalformat, int format, int type, int[] data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    public final void glClearNamedBufferData(int buffer, int internalformat, int format, int type, float[] data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    public final void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, short[] data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    public final void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, int[] data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    public final void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, float[] data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    public final void glGetNamedBufferParameteriv(int buffer, int pname, int[] params) {
        org.lwjgl.opengl.GL45.glGetNamedBufferParameteriv(buffer, pname, params);
    }

    public final void glGetNamedBufferParameteri64v(int buffer, int pname, long[] params) {
        org.lwjgl.opengl.GL45.glGetNamedBufferParameteri64v(buffer, pname, params);
    }

    public final void glGetNamedBufferSubData(int buffer, long offset, short[] data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    public final void glGetNamedBufferSubData(int buffer, long offset, int[] data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    public final void glGetNamedBufferSubData(int buffer, long offset, long[] data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    public final void glGetNamedBufferSubData(int buffer, long offset, float[] data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    public final void glGetNamedBufferSubData(int buffer, long offset, double[] data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    public final void glCreateFramebuffers(int[] framebuffers) {
        org.lwjgl.opengl.GL45.glCreateFramebuffers(framebuffers);
    }

    public final void glNamedFramebufferDrawBuffers(int framebuffer, int[] bufs) {
        org.lwjgl.opengl.GL45.glNamedFramebufferDrawBuffers(framebuffer, bufs);
    }

    public final void glInvalidateNamedFramebufferData(int framebuffer, int[] attachments) {
        org.lwjgl.opengl.GL45.glInvalidateNamedFramebufferData(framebuffer, attachments);
    }

    public final void glInvalidateNamedFramebufferSubData(int framebuffer, int[] attachments, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL45.glInvalidateNamedFramebufferSubData(framebuffer, attachments, x, y, width, height);
    }

    public final void glClearNamedFramebufferiv(int framebuffer, int buffer, int drawbuffer, int[] value) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, value);
    }

    public final void glClearNamedFramebufferuiv(int framebuffer, int buffer, int drawbuffer, int[] value) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, value);
    }

    public final void glClearNamedFramebufferfv(int framebuffer, int buffer, int drawbuffer, float[] value) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, value);
    }

    public final void glGetNamedFramebufferParameteriv(int framebuffer, int pname, int[] params) {
        org.lwjgl.opengl.GL45.glGetNamedFramebufferParameteriv(framebuffer, pname, params);
    }

    public final void glGetNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, int[] params) {
        org.lwjgl.opengl.GL45.glGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, params);
    }

    public final void glCreateRenderbuffers(int[] renderbuffers) {
        org.lwjgl.opengl.GL45.glCreateRenderbuffers(renderbuffers);
    }

    public final void glGetNamedRenderbufferParameteriv(int renderbuffer, int pname, int[] params) {
        org.lwjgl.opengl.GL45.glGetNamedRenderbufferParameteriv(renderbuffer, pname, params);
    }

    public final void glCreateTextures(int target, int[] textures) {
        org.lwjgl.opengl.GL45.glCreateTextures(target, textures);
    }

    public final void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    public final void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    public final void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    public final void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, double[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    public final void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public final void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public final void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public final void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, double[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public final void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, double[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glTextureParameterfv(int texture, int pname, float[] params) {
        org.lwjgl.opengl.GL45.glTextureParameterfv(texture, pname, params);
    }

    public final void glTextureParameterIiv(int texture, int pname, int[] params) {
        org.lwjgl.opengl.GL45.glTextureParameterIiv(texture, pname, params);
    }

    public final void glTextureParameterIuiv(int texture, int pname, int[] params) {
        org.lwjgl.opengl.GL45.glTextureParameterIuiv(texture, pname, params);
    }

    public final void glTextureParameteriv(int texture, int pname, int[] params) {
        org.lwjgl.opengl.GL45.glTextureParameteriv(texture, pname, params);
    }

    public final void glGetTextureImage(int texture, int level, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    public final void glGetTextureImage(int texture, int level, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    public final void glGetTextureImage(int texture, int level, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    public final void glGetTextureImage(int texture, int level, int format, int type, double[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    public final void glGetTextureLevelParameterfv(int texture, int level, int pname, float[] params) {
        org.lwjgl.opengl.GL45.glGetTextureLevelParameterfv(texture, level, pname, params);
    }

    public final void glGetTextureLevelParameteriv(int texture, int level, int pname, int[] params) {
        org.lwjgl.opengl.GL45.glGetTextureLevelParameteriv(texture, level, pname, params);
    }

    public final void glGetTextureParameterfv(int texture, int pname, float[] params) {
        org.lwjgl.opengl.GL45.glGetTextureParameterfv(texture, pname, params);
    }

    public final void glGetTextureParameterIiv(int texture, int pname, int[] params) {
        org.lwjgl.opengl.GL45.glGetTextureParameterIiv(texture, pname, params);
    }

    public final void glGetTextureParameterIuiv(int texture, int pname, int[] params) {
        org.lwjgl.opengl.GL45.glGetTextureParameterIuiv(texture, pname, params);
    }

    public final void glGetTextureParameteriv(int texture, int pname, int[] params) {
        org.lwjgl.opengl.GL45.glGetTextureParameteriv(texture, pname, params);
    }

    public final void glCreateVertexArrays(int[] arrays) {
        org.lwjgl.opengl.GL45.glCreateVertexArrays(arrays);
    }

    public final void glVertexArrayVertexBuffers(int vaobj, int first, int[] buffers, PointerBuffer offsets, int[] strides) {
        org.lwjgl.opengl.GL45.glVertexArrayVertexBuffers(vaobj, first, buffers, offsets, strides);
    }

    public final void glGetVertexArrayiv(int vaobj, int pname, int[] param) {
        org.lwjgl.opengl.GL45.glGetVertexArrayiv(vaobj, pname, param);
    }

    public final void glGetVertexArrayIndexediv(int vaobj, int index, int pname, int[] param) {
        org.lwjgl.opengl.GL45.glGetVertexArrayIndexediv(vaobj, index, pname, param);
    }

    public final void glGetVertexArrayIndexed64iv(int vaobj, int index, int pname, long[] param) {
        org.lwjgl.opengl.GL45.glGetVertexArrayIndexed64iv(vaobj, index, pname, param);
    }

    public final void glCreateSamplers(int[] samplers) {
        org.lwjgl.opengl.GL45.glCreateSamplers(samplers);
    }

    public final void glCreateProgramPipelines(int[] pipelines) {
        org.lwjgl.opengl.GL45.glCreateProgramPipelines(pipelines);
    }

    public final void glCreateQueries(int target, int[] ids) {
        org.lwjgl.opengl.GL45.glCreateQueries(target, ids);
    }

    public final void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, double[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public final void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, short[] pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    public final void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int[] pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    public final void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, float[] pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    public final void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, double[] pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    public final void glGetnMapdv(int target, int query, double[] data) {
        org.lwjgl.opengl.GL45.glGetnMapdv(target, query, data);
    }

    public final void glGetnMapfv(int target, int query, float[] data) {
        org.lwjgl.opengl.GL45.glGetnMapfv(target, query, data);
    }

    public final void glGetnMapiv(int target, int query, int[] data) {
        org.lwjgl.opengl.GL45.glGetnMapiv(target, query, data);
    }

    public final void glGetnPixelMapfv(int map, float[] data) {
        org.lwjgl.opengl.GL45.glGetnPixelMapfv(map, data);
    }

    public final void glGetnPixelMapuiv(int map, int[] data) {
        org.lwjgl.opengl.GL45.glGetnPixelMapuiv(map, data);
    }

    public final void glGetnPixelMapusv(int map, short[] data) {
        org.lwjgl.opengl.GL45.glGetnPixelMapusv(map, data);
    }

    public final void glGetnTexImage(int tex, int level, int format, int type, short[] img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    public final void glGetnTexImage(int tex, int level, int format, int type, int[] img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    public final void glGetnTexImage(int tex, int level, int format, int type, float[] img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    public final void glGetnTexImage(int tex, int level, int format, int type, double[] img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    public final void glReadnPixels(int x, int y, int width, int height, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    public final void glReadnPixels(int x, int y, int width, int height, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    public final void glReadnPixels(int x, int y, int width, int height, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    public final void glGetnColorTable(int target, int format, int type, short[] table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, table);
    }

    public final void glGetnColorTable(int target, int format, int type, int[] table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, table);
    }

    public final void glGetnColorTable(int target, int format, int type, float[] table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, table);
    }

    public final void glGetnUniformfv(int program, int location, float[] params) {
        org.lwjgl.opengl.GL45.glGetnUniformfv(program, location, params);
    }

    public final void glGetnUniformdv(int program, int location, double[] params) {
        org.lwjgl.opengl.GL45.glGetnUniformdv(program, location, params);
    }

    public final void glGetnUniformiv(int program, int location, int[] params) {
        org.lwjgl.opengl.GL45.glGetnUniformiv(program, location, params);
    }

    public final void glGetnUniformuiv(int program, int location, int[] params) {
        org.lwjgl.opengl.GL45.glGetnUniformuiv(program, location, params);
    }

    public final void glMultiDrawArraysIndirectCount(int mode, ByteBuffer indirect, long drawcount, int maxdrawcount, int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawArraysIndirectCount(mode, indirect, drawcount, maxdrawcount, stride);
    }

    public final void glMultiDrawArraysIndirectCount(int mode, long indirect, long drawcount, int maxdrawcount, int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawArraysIndirectCount(mode, indirect, drawcount, maxdrawcount, stride);
    }

    public final void glMultiDrawArraysIndirectCount(int mode, IntBuffer indirect, long drawcount, int maxdrawcount, int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawArraysIndirectCount(mode, indirect, drawcount, maxdrawcount, stride);
    }

    public final void glMultiDrawElementsIndirectCount(int mode, int type, ByteBuffer indirect, long drawcount, int maxdrawcount, int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawElementsIndirectCount(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    public final void glMultiDrawElementsIndirectCount(int mode, int type, long indirect, long drawcount, int maxdrawcount, int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawElementsIndirectCount(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    public final void glMultiDrawElementsIndirectCount(int mode, int type, IntBuffer indirect, long drawcount, int maxdrawcount, int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawElementsIndirectCount(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    public final void glPolygonOffsetClamp(float factor, float units, float clamp) {
        org.lwjgl.opengl.GL46.glPolygonOffsetClamp(factor, units, clamp);
    }

    public final void glSpecializeShader(int shader, ByteBuffer pEntryPoint, IntBuffer pConstantIndex, IntBuffer pConstantValue) {
        org.lwjgl.opengl.GL46.glSpecializeShader(shader, pEntryPoint, pConstantIndex, pConstantValue);
    }

    public final void glSpecializeShader(int shader, CharSequence pEntryPoint, IntBuffer pConstantIndex, IntBuffer pConstantValue) {
        org.lwjgl.opengl.GL46.glSpecializeShader(shader, pEntryPoint, pConstantIndex, pConstantValue);
    }

    public final void glMultiDrawArraysIndirectCount(int mode, int[] indirect, long drawcount, int maxdrawcount, int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawArraysIndirectCount(mode, indirect, drawcount, maxdrawcount, stride);
    }

    public final void glMultiDrawElementsIndirectCount(int mode, int type, int[] indirect, long drawcount, int maxdrawcount, int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawElementsIndirectCount(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    public final void glSpecializeShader(int shader, ByteBuffer pEntryPoint, int[] pConstantIndex, int[] pConstantValue) {
        org.lwjgl.opengl.GL46.glSpecializeShader(shader, pEntryPoint, pConstantIndex, pConstantValue);
    }

    public final void glSpecializeShader(int shader, CharSequence pEntryPoint, int[] pConstantIndex, int[] pConstantValue) {
        org.lwjgl.opengl.GL46.glSpecializeShader(shader, pEntryPoint, pConstantIndex, pConstantValue);
    }

}
