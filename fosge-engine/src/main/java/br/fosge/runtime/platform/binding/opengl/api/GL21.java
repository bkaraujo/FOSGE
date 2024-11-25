package br.fosge.runtime.platform.binding.opengl.api;

import java.nio.FloatBuffer;

public interface GL21 {

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_CURRENT_RASTER_SECONDARY_COLOR = 33887;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_FLOAT_MAT2x3 = 35685;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_FLOAT_MAT2x4 = 35686;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_FLOAT_MAT3x2 = 35687;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_FLOAT_MAT3x4 = 35688;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_FLOAT_MAT4x2 = 35689;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_FLOAT_MAT4x3 = 35690;

    /** Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferParameteriv, and GetBufferPointerv.*/
    int GL_PIXEL_PACK_BUFFER = 35051;

    /** Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferParameteriv, and GetBufferPointerv.*/
    int GL_PIXEL_UNPACK_BUFFER = 35052;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_PIXEL_PACK_BUFFER_BINDING = 35053;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_PIXEL_UNPACK_BUFFER_BINDING = 35055;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D.*/
    int GL_SRGB = 35904;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D.*/
    int GL_SRGB8 = 35905;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D.*/
    int GL_SRGB_ALPHA = 35906;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D.*/
    int GL_SRGB8_ALPHA8 = 35907;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D.*/
    int GL_SLUMINANCE_ALPHA = 35908;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D.*/
    int GL_SLUMINANCE8_ALPHA8 = 35909;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D.*/
    int GL_SLUMINANCE = 35910;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D.*/
    int GL_SLUMINANCE8 = 35911;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D.*/
    int GL_COMPRESSED_SRGB = 35912;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D.*/
    int GL_COMPRESSED_SRGB_ALPHA = 35913;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D.*/
    int GL_COMPRESSED_SLUMINANCE = 35914;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D.*/
    int GL_COMPRESSED_SLUMINANCE_ALPHA = 35915;

    /** Specifies the value of a single mat2x3 uniform variable or a mat2x3 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix2x3fv(int location, boolean transpose, FloatBuffer value);

    /** Specifies the value of a single mat3x2 uniform variable or a mat3x2 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix3x2fv(int location, boolean transpose, FloatBuffer value);

    /** Specifies the value of a single mat2x4 uniform variable or a mat2x4 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix2x4fv(int location, boolean transpose, FloatBuffer value);

    /** Specifies the value of a single mat4x2 uniform variable or a mat4x2 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix4x2fv(int location, boolean transpose, FloatBuffer value);

    /** Specifies the value of a single mat3x4 uniform variable or a mat3x4 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix3x4fv(int location, boolean transpose, FloatBuffer value);

    /** Specifies the value of a single mat4x3 uniform variable or a mat4x3 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix4x3fv(int location, boolean transpose, FloatBuffer value);

    /** Array version of: {@link #glUniformMatrix2x3fv UniformMatrix2x3fv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix2x3fv(int location, boolean transpose, float[] value);

    /** Array version of: {@link #glUniformMatrix3x2fv UniformMatrix3x2fv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix3x2fv(int location, boolean transpose, float[] value);

    /** Array version of: {@link #glUniformMatrix2x4fv UniformMatrix2x4fv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix2x4fv(int location, boolean transpose, float[] value);

    /** Array version of: {@link #glUniformMatrix4x2fv UniformMatrix4x2fv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix4x2fv(int location, boolean transpose, float[] value);

    /** Array version of: {@link #glUniformMatrix3x4fv UniformMatrix3x4fv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix3x4fv(int location, boolean transpose, float[] value);

    /** Array version of: {@link #glUniformMatrix4x3fv UniformMatrix4x3fv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix4x3fv(int location, boolean transpose, float[] value);

}
