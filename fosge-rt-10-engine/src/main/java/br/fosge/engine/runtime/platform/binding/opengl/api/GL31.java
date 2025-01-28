package br.fosge.engine.runtime.platform.binding.opengl.api;

import org.lwjgl.PointerBuffer;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public interface GL31 {

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_R8_SNORM = 36756;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_RG8_SNORM = 36757;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_RGB8_SNORM = 36758;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_RGBA8_SNORM = 36759;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_R16_SNORM = 36760;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_RG16_SNORM = 36761;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_RGB16_SNORM = 36762;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_RGBA16_SNORM = 36763;

    /** Returned by GetTexLevelParameter and GetFramebufferAttachmentParameter.*/
    int GL_SIGNED_NORMALIZED = 36764;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_SAMPLER_BUFFER = 36290;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_SAMPLER_2D_RECT = 36301;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_SAMPLER_BUFFER = 36304;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_SAMPLER_2D_RECT = 36309;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_SAMPLER_BUFFER = 36312;

    /** Accepted by the target parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv, MapBufferRange, FlushMappedBufferRange, GetBufferParameteriv, BindBufferRange, BindBufferBase, and CopyBufferSubData.*/
    int GL_COPY_READ_BUFFER = 36662;

    /** Accepted by the target parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv, MapBufferRange, FlushMappedBufferRange, GetBufferParameteriv, BindBufferRange, BindBufferBase, and CopyBufferSubData.*/
    int GL_COPY_WRITE_BUFFER = 36663;

    /** Accepted by the {@code cap} parameter of Enable, Disable and IsEnabled.*/
    int GL_PRIMITIVE_RESTART = 36765;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_PRIMITIVE_RESTART_INDEX = 36766;

    /** Accepted by the {@code target} parameter of BindBuffer, BufferData, BufferSubData, MapBuffer, MapBufferRange, BindTexture, UnmapBuffer, GetBufferSubData, GetBufferParameteriv, GetBufferPointerv, and TexBuffer, and the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv.*/
    int GL_TEXTURE_BUFFER = 35882;

    /** Accepted by the {@code pname} parameters of GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv.*/
    int GL_MAX_TEXTURE_BUFFER_SIZE = 35883;

    /** Accepted by the {@code pname} parameters of GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv.*/
    int GL_TEXTURE_BINDING_BUFFER = 35884;

    /** Accepted by the {@code pname} parameters of GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv.*/
    int GL_TEXTURE_BUFFER_DATA_STORE_BINDING = 35885;

    /** Accepted by the {@code cap} parameter of Enable, Disable and IsEnabled; by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and GetDoublev; and by the {@code target} parameter of BindTexture, GetTexParameterfv, GetTexParameteriv, TexParameterf, TexParameteri, TexParameterfv and TexParameteriv.*/
    int GL_TEXTURE_RECTANGLE = 34037;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and GetDoublev.*/
    int GL_TEXTURE_BINDING_RECTANGLE = 34038;

    /** Accepted by the {@code target} parameter of GetTexLevelParameteriv, GetTexLevelParameterfv, GetTexParameteriv and TexImage2D.*/
    int GL_PROXY_TEXTURE_RECTANGLE = 34039;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv.*/
    int GL_MAX_RECTANGLE_TEXTURE_SIZE = 34040;

    /** Returned by {@code type} parameter of GetActiveUniform when the location {@code index} for program object {@code program} is of type sampler2DRect.*/
    int GL_SAMPLER_2D_RECT = 35683;

    /** Returned by {@code type} parameter of GetActiveUniform when the location {@code index} for program object {@code program} is of type sampler2DRectShadow.*/
    int GL_SAMPLER_2D_RECT_SHADOW = 35684;

    /** Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv.*/
    int GL_UNIFORM_BUFFER = 35345;

    /** Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_UNIFORM_BUFFER_BINDING = 35368;

    /** Accepted by the {@code pname} parameter of GetIntegeri_v.*/
    int GL_UNIFORM_BUFFER_START = 35369;

    /** Accepted by the {@code pname} parameter of GetIntegeri_v.*/
    int GL_UNIFORM_BUFFER_SIZE = 35370;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_VERTEX_UNIFORM_BLOCKS = 35371;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_GEOMETRY_UNIFORM_BLOCKS = 35372;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_FRAGMENT_UNIFORM_BLOCKS = 35373;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_COMBINED_UNIFORM_BLOCKS = 35374;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_UNIFORM_BUFFER_BINDINGS = 35375;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_UNIFORM_BLOCK_SIZE = 35376;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 35377;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = 35378;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 35379;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT = 35380;

    /** Accepted by the {@code pname} parameter of GetProgramiv.*/
    int GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 35381;

    /** Accepted by the {@code pname} parameter of GetProgramiv.*/
    int GL_ACTIVE_UNIFORM_BLOCKS = 35382;

    /** Accepted by the {@code pname} parameter of GetActiveUniformsiv.*/
    int GL_UNIFORM_TYPE = 35383;

    /** Accepted by the {@code pname} parameter of GetActiveUniformsiv.*/
    int GL_UNIFORM_SIZE = 35384;

    /** Accepted by the {@code pname} parameter of GetActiveUniformsiv.*/
    int GL_UNIFORM_NAME_LENGTH = 35385;

    /** Accepted by the {@code pname} parameter of GetActiveUniformsiv.*/
    int GL_UNIFORM_BLOCK_INDEX = 35386;

    /** Accepted by the {@code pname} parameter of GetActiveUniformsiv.*/
    int GL_UNIFORM_OFFSET = 35387;

    /** Accepted by the {@code pname} parameter of GetActiveUniformsiv.*/
    int GL_UNIFORM_ARRAY_STRIDE = 35388;

    /** Accepted by the {@code pname} parameter of GetActiveUniformsiv.*/
    int GL_UNIFORM_MATRIX_STRIDE = 35389;

    /** Accepted by the {@code pname} parameter of GetActiveUniformsiv.*/
    int GL_UNIFORM_IS_ROW_MAJOR = 35390;

    /** Accepted by the {@code pname} parameter of GetActiveUniformBlockiv.*/
    int GL_UNIFORM_BLOCK_BINDING = 35391;

    /** Accepted by the {@code pname} parameter of GetActiveUniformBlockiv.*/
    int GL_UNIFORM_BLOCK_DATA_SIZE = 35392;

    /** Accepted by the {@code pname} parameter of GetActiveUniformBlockiv.*/
    int GL_UNIFORM_BLOCK_NAME_LENGTH = 35393;

    /** Accepted by the {@code pname} parameter of GetActiveUniformBlockiv.*/
    int GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS = 35394;

    /** Accepted by the {@code pname} parameter of GetActiveUniformBlockiv.*/
    int GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 35395;

    /** Accepted by the {@code pname} parameter of GetActiveUniformBlockiv.*/
    int GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 35396;

    /** Accepted by the {@code pname} parameter of GetActiveUniformBlockiv.*/
    int GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER = 35397;

    /** Accepted by the {@code pname} parameter of GetActiveUniformBlockiv.*/
    int GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 35398;

    /** Returned by GetActiveUniformsiv and GetUniformBlockIndex.*/
    int GL_INVALID_INDEX = -1;

    /** Draw multiple instances of a range of elements.@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>@param first the index of the first vertex to be rendered@param count the number of vertices to be rendered@param primcount the number of instances of the specified range of vertices to be rendered@see <a href="https://docs.gl/gl4/glDrawArraysInstanced">Reference Page</a>*/
    void glDrawArraysInstanced(int mode, int first, int count, int primcount);

    /** Draws multiple instances of a set of elements.@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>@param count the number of elements to be rendered@param type the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param indices the ByteBuffer containing the indices to be rendered@param primcount the number of instances of the specified range of indices to be rendered@see <a href="https://docs.gl/gl4/glDrawElementsInstanced">Reference Page</a>*/
    void glDrawElementsInstanced(int mode, int count, int type, long indices, int primcount);

    /** Draws multiple instances of a set of elements.@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>@param type the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param indices the ByteBuffer containing the indices to be rendered@param primcount the number of instances of the specified range of indices to be rendered@see <a href="https://docs.gl/gl4/glDrawElementsInstanced">Reference Page</a>*/
    void glDrawElementsInstanced(int mode, int type, ByteBuffer indices, int primcount);

    /** Draws multiple instances of a set of elements.@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>@param indices the ByteBuffer containing the indices to be rendered@param primcount the number of instances of the specified range of indices to be rendered@see <a href="https://docs.gl/gl4/glDrawElementsInstanced">Reference Page</a>*/
    void glDrawElementsInstanced(int mode, ByteBuffer indices, int primcount);

    /** Draws multiple instances of a set of elements.@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>@param indices the ByteBuffer containing the indices to be rendered@param primcount the number of instances of the specified range of indices to be rendered@see <a href="https://docs.gl/gl4/glDrawElementsInstanced">Reference Page</a>*/
    void glDrawElementsInstanced(int mode, ShortBuffer indices, int primcount);

    /** Draws multiple instances of a set of elements.@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>@param indices the ByteBuffer containing the indices to be rendered@param primcount the number of instances of the specified range of indices to be rendered@see <a href="https://docs.gl/gl4/glDrawElementsInstanced">Reference Page</a>*/
    void glDrawElementsInstanced(int mode, IntBuffer indices, int primcount);

    /** Copies all or part of one buffer object's data store to the data store of another buffer object. <p>An {@link GL11#GL_INVALID_VALUE INVALID_VALUE} error is generated if any of readoffset, writeoffset, or size are negative, if readoffset+size exceeds the size of the buffer object bound to readtarget, or if writeoffset+size exceeds the size of the buffer object bound to writetarget.</p> <p>An {@link GL11#GL_INVALID_VALUE INVALID_VALUE} error is generated if the same buffer object is bound to both readtarget and writetarget, and the ranges [readoffset, readoffset+size) and [writeoffset, writeoffset+size) overlap.</p> <p>An {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} error is generated if zero is bound to readtarget or writetarget.</p> <p>An {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} error is generated if the buffer objects bound to either readtarget or writetarget are mapped.</p>@param readTarget the source buffer object target. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL31C#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td><td>{@link GL31C#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td></tr><tr><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31C#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td></tr><tr><td>{@link GL31C#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td></tr></table>@param writeTarget the destination buffer object target@param readOffset the source buffer object offset, in bytes@param writeOffset the destination buffer object offset, in bytes@param size the number of bytes to copy@see <a href="https://docs.gl/gl4/glCopyBufferSubData">Reference Page</a>*/
    void glCopyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size);

    /** Specifies the primitive restart index.@param index the value to be interpreted as the primitive restart index@see <a href="https://docs.gl/gl4/glPrimitiveRestartIndex">Reference Page</a>*/
    void glPrimitiveRestartIndex(int index);

    /** Attaches the storage for the buffer object named {@code buffer} to the active buffer texture, and specifies an internal format for the texel array found in the attached buffer object. If {@code buffer} is zero, any buffer object attached to the buffer texture is detached, and no new buffer object is attached. If {@code buffer} is non-zero, but is not the name of an existing buffer object, the error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated. <p>When a buffer object is attached to a buffer texture, the buffer object's data store is taken as the texture's texel array. The number of texels in the buffer texture's texel array is given by</p> <p>{@code floor(buffer_size / (components * sizeof(base_type))},</p> <p>where {@code buffer_size} is the size of the buffer object, in basic machine units and {@code components} and {@code base_type} are the element count and base data type for elements. The number of texels in the texel array is then clamped to the implementation-dependent limit {@link GL31C#GL_MAX_TEXTURE_BUFFER_SIZE MAX_TEXTURE_BUFFER_SIZE}. When a buffer texture is accessed in a shader, the results of a texel fetch are undefined if the specified texel number is greater than or equal to the clamped number of texels in the texel array.</p> <p>When a buffer texture is accessed in a shader, an integer is provided to indicate the texel number being accessed. If no buffer object is bound to the buffer texture, the results of the texel access are undefined. Otherwise, the attached buffer object's data store is interpreted as an array of elements of the GL data type corresponding to {@code internalformat}. Each texel consists of one to four elements that are mapped to texture components (R, G, B, A, L, and I). Element {@code m} of the texel numbered {@code n} is taken from element {@code n} * {@code components} + {@code m} of the attached buffer object's data store. Elements and texels are both numbered starting with zero. For texture formats with normalized components, the extracted values are converted to floating-point values. The components of the texture are then converted to an (R,G,B,A) vector, and returned to the shader as a four-component result vector with components of the appropriate data type for the texture's internal format.</p>@param target the target of the operation. Must be:<br><table><tr><td>{@link GL31C#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td></tr></table>@param internalformat the sized internal format of the data in the store belonging to {@code buffer}@param buffer the name of the buffer object whose storage to attach to the active buffer texture@see <a href="https://docs.gl/gl4/glTexBuffer">Reference Page</a>*/
    void glTexBuffer(int target, int internalformat, int buffer);

    /** Retrieves the indices of a number of uniforms within a program object@param program the name of a program containing uniforms whose indices to query@param uniformNames an array of pointers to buffers containing the names of the queried uniforms@param uniformIndices an array that will receive the indices of the uniforms@see <a href="https://docs.gl/gl4/glGetUniformIndices">Reference Page</a>*/
    void glGetUniformIndices(int program, PointerBuffer uniformNames, IntBuffer uniformIndices);

    /** Retrieves the indices of a number of uniforms within a program object@param program the name of a program containing uniforms whose indices to query@param uniformNames an array of pointers to buffers containing the names of the queried uniforms@param uniformIndices an array that will receive the indices of the uniforms@see <a href="https://docs.gl/gl4/glGetUniformIndices">Reference Page</a>*/
    void glGetUniformIndices(int program, CharSequence[] uniformNames, IntBuffer uniformIndices);

    /** Retrieves the indices of a number of uniforms within a program object@param program the name of a program containing uniforms whose indices to query@see <a href="https://docs.gl/gl4/glGetUniformIndices">Reference Page</a>*/
    int glGetUniformIndices(int program, CharSequence uniformName);

    /** Returns information about several active uniform variables for the specified program object.@param program the program object to be queried@param uniformIndices an array of {@code uniformCount} integers containing the indices of uniforms within {@code program}@param pname the property of the each uniform in {@code uniformIndices} that should be written into the corresponding element of {@code params}@param params an array of {@code uniformCount} integers which are to receive the value of {@code pname} for each uniform in {@code uniformIndices}@see <a href="https://docs.gl/gl4/glGetActiveUniforms">Reference Page</a>*/
    void glGetActiveUniformsiv(int program, IntBuffer uniformIndices, int pname, IntBuffer params);

    /** Returns information about several active uniform variables for the specified program object.@param program the program object to be queried@param pname the property of the each uniform in {@code uniformIndices} that should be written into the corresponding element of {@code params}@see <a href="https://docs.gl/gl4/glGetActiveUniforms">Reference Page</a>*/
    int glGetActiveUniformsi(int program, int uniformIndex, int pname);

    /** Queries the name of an active uniform.@param program the program containing the active uniform index {@code uniformIndex}@param uniformIndex the index of the active uniform whose name to query@param length the address of a variable that will receive the number of characters that were or would have been written to the buffer addressed by {@code uniformName}@param uniformName the address of a buffer into which the GL will place the name of the active uniform at {@code uniformIndex} within {@code program}@see <a href="https://docs.gl/gl4/glGetActiveUniformName">Reference Page</a>*/
    void glGetActiveUniformName(int program, int uniformIndex, IntBuffer length, ByteBuffer uniformName);

    /** Queries the name of an active uniform.@param program the program containing the active uniform index {@code uniformIndex}@param uniformIndex the index of the active uniform whose name to query@param bufSize the size of the buffer, in units of {@code GLchar}, of the buffer whose address is specified in {@code uniformName}@see <a href="https://docs.gl/gl4/glGetActiveUniformName">Reference Page</a>*/
    String glGetActiveUniformName(int program, int uniformIndex, int bufSize);

    /** Queries the name of an active uniform.@param program the program containing the active uniform index {@code uniformIndex}@param uniformIndex the index of the active uniform whose name to query@see <a href="https://docs.gl/gl4/glGetActiveUniformName">Reference Page</a>*/
    String glGetActiveUniformName(int program, int uniformIndex);

    /** Retrieves the index of a named uniform block.@param program the name of a program containing the uniform block@param uniformBlockName an array of characters to containing the name of the uniform block whose index to retrieve@see <a href="https://docs.gl/gl4/glGetUniformBlockIndex">Reference Page</a>*/
    int glGetUniformBlockIndex(int program, ByteBuffer uniformBlockName);

    /** Retrieves the index of a named uniform block.@param program the name of a program containing the uniform block@param uniformBlockName an array of characters to containing the name of the uniform block whose index to retrieve@see <a href="https://docs.gl/gl4/glGetUniformBlockIndex">Reference Page</a>*/
    int glGetUniformBlockIndex(int program, CharSequence uniformBlockName);

    /** Queries information about an active uniform block.@param program the name of a program containing the uniform block@param uniformBlockIndex the index of the uniform block within {@code program}@param pname the name of the parameter to query. One of:<br><table><tr><td>{@link GL31C#GL_UNIFORM_BLOCK_BINDING UNIFORM_BLOCK_BINDING}</td><td>{@link GL31C#GL_UNIFORM_BLOCK_DATA_SIZE UNIFORM_BLOCK_DATA_SIZE}</td></tr><tr><td>{@link GL31C#GL_UNIFORM_BLOCK_NAME_LENGTH UNIFORM_BLOCK_NAME_LENGTH}</td><td>{@link GL31C#GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS UNIFORM_BLOCK_ACTIVE_UNIFORMS}</td></tr><tr><td>{@link GL31C#GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES}</td><td>{@link GL31C#GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER}</td></tr><tr><td>{@link GL31C#GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER}</td><td>{@link GL31C#GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER}</td></tr></table>@param params the address of a variable to receive the result of the query@see <a href="https://docs.gl/gl4/glGetActiveUniformBlock">Reference Page</a>*/
    void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, IntBuffer params);

    /** Queries information about an active uniform block.@param program the name of a program containing the uniform block@param uniformBlockIndex the index of the uniform block within {@code program}@param pname the name of the parameter to query. One of:<br><table><tr><td>{@link GL31C#GL_UNIFORM_BLOCK_BINDING UNIFORM_BLOCK_BINDING}</td><td>{@link GL31C#GL_UNIFORM_BLOCK_DATA_SIZE UNIFORM_BLOCK_DATA_SIZE}</td></tr><tr><td>{@link GL31C#GL_UNIFORM_BLOCK_NAME_LENGTH UNIFORM_BLOCK_NAME_LENGTH}</td><td>{@link GL31C#GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS UNIFORM_BLOCK_ACTIVE_UNIFORMS}</td></tr><tr><td>{@link GL31C#GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES}</td><td>{@link GL31C#GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER}</td></tr><tr><td>{@link GL31C#GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER}</td><td>{@link GL31C#GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetActiveUniformBlock">Reference Page</a>*/
    int glGetActiveUniformBlocki(int program, int uniformBlockIndex, int pname);

    /** Retrieves the name of an active uniform block.@param program the name of a program containing the uniform block@param uniformBlockIndex the index of the uniform block within {@code program}@param length the address of a variable to receive the number of characters that were written to {@code uniformBlockName}@param uniformBlockName an array of characters to receive the name of the uniform block at {@code uniformBlockIndex}@see <a href="https://docs.gl/gl4/glGetActiveUniformBlockName">Reference Page</a>*/
    void glGetActiveUniformBlockName(int program, int uniformBlockIndex, IntBuffer length, ByteBuffer uniformBlockName);

    /** Retrieves the name of an active uniform block.@param program the name of a program containing the uniform block@param uniformBlockIndex the index of the uniform block within {@code program}@param bufSize the size of the buffer addressed by {@code uniformBlockName}@see <a href="https://docs.gl/gl4/glGetActiveUniformBlockName">Reference Page</a>*/
    String glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize);

    /** Retrieves the name of an active uniform block.@param program the name of a program containing the uniform block@param uniformBlockIndex the index of the uniform block within {@code program}@see <a href="https://docs.gl/gl4/glGetActiveUniformBlockName">Reference Page</a>*/
    String glGetActiveUniformBlockName(int program, int uniformBlockIndex);

    /** Assigns a binding point to an active uniform block.@param program the name of a program object containing the active uniform block whose binding to assign@param uniformBlockIndex the index of the active uniform block within {@code program} whose binding to assign@param uniformBlockBinding the binding point to which to bind the uniform block with index {@code uniformBlockIndex} within {@code program}@see <a href="https://docs.gl/gl4/glUniformBlockBinding">Reference Page</a>*/
    void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding);

    /** Array version of: {@link #glGetUniformIndices GetUniformIndices}@see <a href="https://docs.gl/gl4/glGetUniformIndices">Reference Page</a>*/
    void glGetUniformIndices(int program, PointerBuffer uniformNames, int[] uniformIndices);

    /** Array version of: {@link #glGetActiveUniformsiv GetActiveUniformsiv}@see <a href="https://docs.gl/gl4/glGetActiveUniforms">Reference Page</a>*/
    void glGetActiveUniformsiv(int program, int[] uniformIndices, int pname, int[] params);

    /** Array version of: {@link #glGetActiveUniformName GetActiveUniformName}@see <a href="https://docs.gl/gl4/glGetActiveUniformName">Reference Page</a>*/
    void glGetActiveUniformName(int program, int uniformIndex, int[] length, ByteBuffer uniformName);

    /** Array version of: {@link #glGetActiveUniformBlockiv GetActiveUniformBlockiv}@see <a href="https://docs.gl/gl4/glGetActiveUniformBlock">Reference Page</a>*/
    void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, int[] params);

    /** Array version of: {@link #glGetActiveUniformBlockName GetActiveUniformBlockName}@see <a href="https://docs.gl/gl4/glGetActiveUniformBlockName">Reference Page</a>*/
    void glGetActiveUniformBlockName(int program, int uniformBlockIndex, int[] length, ByteBuffer uniformBlockName);

}
