package br.fosge.runtime.platform.binding.opengl.api;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public interface GL40 {

    /** Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv, MapBufferRange, FlushMappedBufferRange, GetBufferParameteriv, and CopyBufferSubData.*/
    int GL_DRAW_INDIRECT_BUFFER = 36671;

    /** Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev.*/
    int GL_DRAW_INDIRECT_BUFFER_BINDING = 36675;

    /** Accepted by the {@code pname} parameter of GetProgramiv.*/
    int GL_GEOMETRY_SHADER_INVOCATIONS = 34943;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.*/
    int GL_MAX_GEOMETRY_SHADER_INVOCATIONS = 36442;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.*/
    int GL_MIN_FRAGMENT_INTERPOLATION_OFFSET = 36443;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.*/
    int GL_MAX_FRAGMENT_INTERPOLATION_OFFSET = 36444;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.*/
    int GL_FRAGMENT_INTERPOLATION_OFFSET_BITS = 36445;

    /** Returned in the {@code type} parameter of GetActiveUniform, and GetTransformFeedbackVarying.*/
    int GL_DOUBLE_VEC2 = 36860;

    /** Returned in the {@code type} parameter of GetActiveUniform, and GetTransformFeedbackVarying.*/
    int GL_DOUBLE_VEC3 = 36861;

    /** Returned in the {@code type} parameter of GetActiveUniform, and GetTransformFeedbackVarying.*/
    int GL_DOUBLE_VEC4 = 36862;

    /** Returned in the {@code type} parameter of GetActiveUniform, and GetTransformFeedbackVarying.*/
    int GL_DOUBLE_MAT2 = 36678;

    /** Returned in the {@code type} parameter of GetActiveUniform, and GetTransformFeedbackVarying.*/
    int GL_DOUBLE_MAT3 = 36679;

    /** Returned in the {@code type} parameter of GetActiveUniform, and GetTransformFeedbackVarying.*/
    int GL_DOUBLE_MAT4 = 36680;

    /** Returned in the {@code type} parameter of GetActiveUniform, and GetTransformFeedbackVarying.*/
    int GL_DOUBLE_MAT2x3 = 36681;

    /** Returned in the {@code type} parameter of GetActiveUniform, and GetTransformFeedbackVarying.*/
    int GL_DOUBLE_MAT2x4 = 36682;

    /** Returned in the {@code type} parameter of GetActiveUniform, and GetTransformFeedbackVarying.*/
    int GL_DOUBLE_MAT3x2 = 36683;

    /** Returned in the {@code type} parameter of GetActiveUniform, and GetTransformFeedbackVarying.*/
    int GL_DOUBLE_MAT3x4 = 36684;

    /** Returned in the {@code type} parameter of GetActiveUniform, and GetTransformFeedbackVarying.*/
    int GL_DOUBLE_MAT4x2 = 36685;

    /** Returned in the {@code type} parameter of GetActiveUniform, and GetTransformFeedbackVarying.*/
    int GL_DOUBLE_MAT4x3 = 36686;

    /** Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_SAMPLE_SHADING = 35894;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_MIN_SAMPLE_SHADING_VALUE = 35895;

    /** Accepted by the {@code pname} parameter of GetProgramStageiv.*/
    int GL_ACTIVE_SUBROUTINES = 36325;

    /** Accepted by the {@code pname} parameter of GetProgramStageiv.*/
    int GL_ACTIVE_SUBROUTINE_UNIFORMS = 36326;

    /** Accepted by the {@code pname} parameter of GetProgramStageiv.*/
    int GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS = 36423;

    /** Accepted by the {@code pname} parameter of GetProgramStageiv.*/
    int GL_ACTIVE_SUBROUTINE_MAX_LENGTH = 36424;

    /** Accepted by the {@code pname} parameter of GetProgramStageiv.*/
    int GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH = 36425;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.*/
    int GL_MAX_SUBROUTINES = 36327;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.*/
    int GL_MAX_SUBROUTINE_UNIFORM_LOCATIONS = 36328;

    /** Accepted by the {@code pname} parameter of GetActiveSubroutineUniformiv.*/
    int GL_NUM_COMPATIBLE_SUBROUTINES = 36426;

    /** Accepted by the {@code pname} parameter of GetActiveSubroutineUniformiv.*/
    int GL_COMPATIBLE_SUBROUTINES = 36427;

    /** Accepted by the {@code mode} parameter of Begin and all vertex array functions that implicitly call Begin.*/
    int GL_PATCHES = 14;

    /** Accepted by the {@code pname} parameter of PatchParameteri, GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.*/
    int GL_PATCH_VERTICES = 36466;

    /** Accepted by the {@code pname} parameter of PatchParameterfv, GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv, and GetInteger64v.*/
    int GL_PATCH_DEFAULT_INNER_LEVEL = 36467;

    /** Accepted by the {@code pname} parameter of PatchParameterfv, GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv, and GetInteger64v.*/
    int GL_PATCH_DEFAULT_OUTER_LEVEL = 36468;

    /** Accepted by the {@code pname} parameter of GetProgramiv.*/
    int GL_TESS_CONTROL_OUTPUT_VERTICES = 36469;

    /** Accepted by the {@code pname} parameter of GetProgramiv.*/
    int GL_TESS_GEN_MODE = 36470;

    /** Accepted by the {@code pname} parameter of GetProgramiv.*/
    int GL_TESS_GEN_SPACING = 36471;

    /** Accepted by the {@code pname} parameter of GetProgramiv.*/
    int GL_TESS_GEN_VERTEX_ORDER = 36472;

    /** Accepted by the {@code pname} parameter of GetProgramiv.*/
    int GL_TESS_GEN_POINT_MODE = 36473;

    /** Returned by GetProgramiv when {@code pname} is TESS_GEN_MODE.*/
    int GL_ISOLINES = 36474;

    /** Returned by GetProgramiv when {@code pname} is TESS_GEN_SPACING.*/
    int GL_FRACTIONAL_ODD = 36475;

    /** Returned by GetProgramiv when {@code pname} is TESS_GEN_SPACING.*/
    int GL_FRACTIONAL_EVEN = 36476;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.*/
    int GL_MAX_PATCH_VERTICES = 36477;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.*/
    int GL_MAX_TESS_GEN_LEVEL = 36478;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.*/
    int GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS = 36479;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.*/
    int GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS = 36480;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.*/
    int GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS = 36481;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.*/
    int GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS = 36482;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.*/
    int GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS = 36483;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.*/
    int GL_MAX_TESS_PATCH_COMPONENTS = 36484;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.*/
    int GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS = 36485;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.*/
    int GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS = 36486;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.*/
    int GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS = 36489;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.*/
    int GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS = 36490;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.*/
    int GL_MAX_TESS_CONTROL_INPUT_COMPONENTS = 34924;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.*/
    int GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS = 34925;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.*/
    int GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS = 36382;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.*/
    int GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS = 36383;

    /** Accepted by the {@code pname} parameter of GetActiveUniformBlockiv.*/
    int GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER = 34032;

    /** Accepted by the {@code pname} parameter of GetActiveUniformBlockiv.*/
    int GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER = 34033;

    /** Accepted by the {@code type} parameter of CreateShader and returned by the {@code params} parameter of GetShaderiv.*/
    int GL_TESS_EVALUATION_SHADER = 36487;

    /** Accepted by the {@code type} parameter of CreateShader and returned by the {@code params} parameter of GetShaderiv.*/
    int GL_TESS_CONTROL_SHADER = 36488;

    /** Accepted by the {@code target} parameter of TexParameteri, TexParameteriv, TexParameterf, TexParameterfv, BindTexture, and GenerateMipmap.*/
    int GL_TEXTURE_CUBE_MAP_ARRAY = 36873;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv.*/
    int GL_TEXTURE_BINDING_CUBE_MAP_ARRAY = 36874;

    /** Accepted by the {@code target} parameter of TexImage3D, TexSubImage3D, CompressedTeximage3D, CompressedTexSubImage3D and CopyTexSubImage3D.*/
    int GL_PROXY_TEXTURE_CUBE_MAP_ARRAY = 36875;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_SAMPLER_CUBE_MAP_ARRAY = 36876;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW = 36877;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_SAMPLER_CUBE_MAP_ARRAY = 36878;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY = 36879;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET = 36446;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET = 36447;

    /** Accepted by the {@code target} parameter of BindTransformFeedback.*/
    int GL_TRANSFORM_FEEDBACK = 36386;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED = 36387;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 36388;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_TRANSFORM_FEEDBACK_BINDING = 36389;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_MAX_TRANSFORM_FEEDBACK_BUFFERS = 36464;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_MAX_VERTEX_STREAMS = 36465;

    /** Specifies the equation used for both the RGB blend equation and the Alpha blend equation for the specified draw buffer.@param buf the index of the draw buffer for which to set the blend equation@param mode how source and destination colors are combined. One of:<br><table><tr><td>{@link GL14#GL_FUNC_ADD FUNC_ADD}</td><td>{@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}</td><td>{@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}</td><td>{@link GL14#GL_MIN MIN}</td><td>{@link GL14#GL_MAX MAX}</td></tr></table>@see <a href="https://docs.gl/gl4/glBlendEquationi">Reference Page</a>*/
    void glBlendEquationi(int buf, int mode);

    /** Sets the RGB blend equation and the alpha blend equation separately for the specified draw buffer.@param buf the index of the draw buffer for which to set the blend equations@param modeRGB the RGB blend equation, how the red, green, and blue components of the source and destination colors are combined. One of:<br><table><tr><td>{@link GL14#GL_FUNC_ADD FUNC_ADD}</td><td>{@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}</td><td>{@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}</td><td>{@link GL14#GL_MIN MIN}</td><td>{@link GL14#GL_MAX MAX}</td></tr></table>@param modeAlpha the alpha blend equation, how the alpha component of the source and destination colors are combined. One of:<br><table><tr><td>{@link GL14#GL_FUNC_ADD FUNC_ADD}</td><td>{@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}</td><td>{@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}</td><td>{@link GL14#GL_MIN MIN}</td><td>{@link GL14#GL_MAX MAX}</td></tr></table>@see <a href="https://docs.gl/gl4/glBlendEquationSeparatei">Reference Page</a>*/
    void glBlendEquationSeparatei(int buf, int modeRGB, int modeAlpha);

    /** Specifies pixel arithmetic for the specified draw buffer.@param buf the index of the draw buffer for which to set the blend function@param sfactor how the red, green, blue, and alpha source blending factors are computed@param dfactor how the red, green, blue, and alpha destination blending factors are computed@see <a href="https://docs.gl/gl4/glBlendFunci">Reference Page</a>*/
    void glBlendFunci(int buf, int sfactor, int dfactor);

    /** Specifies pixel arithmetic for RGB and alpha components separately for the specified draw buffer.@param buf the index of the draw buffer for which to set the blend functions@param srcRGB how the red, green, and blue blending factors are computed@param dstRGB how the red, green, and blue destination blending factors are computed@param srcAlpha how the alpha source blending factor is computed@param dstAlpha how the alpha destination blending factor is computed@see <a href="https://docs.gl/gl4/glBlendFuncSeparatei">Reference Page</a>*/
    void glBlendFuncSeparatei(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);

    /** Renders primitives from array data, taking parameters from memory. <p>{@code glDrawArraysIndirect} behaves similarly to {@link GL42C#glDrawArraysInstancedBaseInstance DrawArraysInstancedBaseInstance}, except that the parameters to glDrawArraysInstancedBaseInstance are stored in memory at the address given by {@code indirect}.</p> <p>The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):</p> <pre><code> typedef struct {     uint count;     uint primCount;     uint first;     uint baseInstance; // must be 0 unless OpenGL 4.2 is supported } DrawArraysIndirectCommand; const DrawArraysIndirectCommand *cmd = (const DrawArraysIndirectCommand *)indirect; glDrawArraysInstancedBaseInstance(mode, cmd-&gt;first, cmd-&gt;count, cmd-&gt;primCount, cmd-&gt;baseInstance);</code></pre>@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40C#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param indirect a structure containing the draw parameters@see <a href="https://docs.gl/gl4/glDrawArraysIndirect">Reference Page</a>*/
    void glDrawArraysIndirect(int mode, ByteBuffer indirect);

    /** Renders primitives from array data, taking parameters from memory. <p>{@code glDrawArraysIndirect} behaves similarly to {@link GL42C#glDrawArraysInstancedBaseInstance DrawArraysInstancedBaseInstance}, except that the parameters to glDrawArraysInstancedBaseInstance are stored in memory at the address given by {@code indirect}.</p> <p>The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):</p> <pre><code> typedef struct {     uint count;     uint primCount;     uint first;     uint baseInstance; // must be 0 unless OpenGL 4.2 is supported } DrawArraysIndirectCommand; const DrawArraysIndirectCommand *cmd = (const DrawArraysIndirectCommand *)indirect; glDrawArraysInstancedBaseInstance(mode, cmd-&gt;first, cmd-&gt;count, cmd-&gt;primCount, cmd-&gt;baseInstance);</code></pre>@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40C#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param indirect a structure containing the draw parameters@see <a href="https://docs.gl/gl4/glDrawArraysIndirect">Reference Page</a>*/
    void glDrawArraysIndirect(int mode, long indirect);

    /** Renders primitives from array data, taking parameters from memory. <p>{@code glDrawArraysIndirect} behaves similarly to {@link GL42C#glDrawArraysInstancedBaseInstance DrawArraysInstancedBaseInstance}, except that the parameters to glDrawArraysInstancedBaseInstance are stored in memory at the address given by {@code indirect}.</p> <p>The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):</p> <pre><code> typedef struct {     uint count;     uint primCount;     uint first;     uint baseInstance; // must be 0 unless OpenGL 4.2 is supported } DrawArraysIndirectCommand; const DrawArraysIndirectCommand *cmd = (const DrawArraysIndirectCommand *)indirect; glDrawArraysInstancedBaseInstance(mode, cmd-&gt;first, cmd-&gt;count, cmd-&gt;primCount, cmd-&gt;baseInstance);</code></pre>@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40C#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param indirect a structure containing the draw parameters@see <a href="https://docs.gl/gl4/glDrawArraysIndirect">Reference Page</a>*/
    void glDrawArraysIndirect(int mode, IntBuffer indirect);

    /** Renders indexed primitives from array data, taking parameters from memory. <p>{@code glDrawElementsIndirect} behaves similarly to {@link GL42C#glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance}, execpt that the parameters to glDrawElementsInstancedBaseVertexBaseInstance are stored in memory at the address given by {@code indirect}.</p> <p>The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):</p> <pre><code> typedef struct {     uint count;     uint primCount;     uint firstIndex;     uint baseVertex;     uint baseInstance; } DrawElementsIndirectCommand;</code></pre> <p>{@code glDrawElementsIndirect} is equivalent to:</p> <pre><code> void glDrawElementsIndirect(GLenum mode, GLenum type, const void *indirect) {     const DrawElementsIndirectCommand *cmd  = (const DrawElementsIndirectCommand *)indirect;     glDrawElementsInstancedBaseVertexBaseInstance(         mode,         cmd-&gt;count,         type,         cmd-&gt;firstIndex + size-of-type,         cmd-&gt;primCount,         cmd-&gt;baseVertex,         cmd-&gt;baseInstance     ); }</code></pre>@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40C#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param type the type of data in the buffer bound to the {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER} binding. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param indirect the address of a structure containing the draw parameters@see <a href="https://docs.gl/gl4/glDrawElementsIndirect">Reference Page</a>*/
    void glDrawElementsIndirect(int mode, int type, ByteBuffer indirect);

    /** Renders indexed primitives from array data, taking parameters from memory. <p>{@code glDrawElementsIndirect} behaves similarly to {@link GL42C#glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance}, execpt that the parameters to glDrawElementsInstancedBaseVertexBaseInstance are stored in memory at the address given by {@code indirect}.</p> <p>The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):</p> <pre><code> typedef struct {     uint count;     uint primCount;     uint firstIndex;     uint baseVertex;     uint baseInstance; } DrawElementsIndirectCommand;</code></pre> <p>{@code glDrawElementsIndirect} is equivalent to:</p> <pre><code> void glDrawElementsIndirect(GLenum mode, GLenum type, const void *indirect) {     const DrawElementsIndirectCommand *cmd  = (const DrawElementsIndirectCommand *)indirect;     glDrawElementsInstancedBaseVertexBaseInstance(         mode,         cmd-&gt;count,         type,         cmd-&gt;firstIndex + size-of-type,         cmd-&gt;primCount,         cmd-&gt;baseVertex,         cmd-&gt;baseInstance     ); }</code></pre>@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40C#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param type the type of data in the buffer bound to the {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER} binding. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param indirect the address of a structure containing the draw parameters@see <a href="https://docs.gl/gl4/glDrawElementsIndirect">Reference Page</a>*/
    void glDrawElementsIndirect(int mode, int type, long indirect);

    /** Renders indexed primitives from array data, taking parameters from memory. <p>{@code glDrawElementsIndirect} behaves similarly to {@link GL42C#glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance}, execpt that the parameters to glDrawElementsInstancedBaseVertexBaseInstance are stored in memory at the address given by {@code indirect}.</p> <p>The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):</p> <pre><code> typedef struct {     uint count;     uint primCount;     uint firstIndex;     uint baseVertex;     uint baseInstance; } DrawElementsIndirectCommand;</code></pre> <p>{@code glDrawElementsIndirect} is equivalent to:</p> <pre><code> void glDrawElementsIndirect(GLenum mode, GLenum type, const void *indirect) {     const DrawElementsIndirectCommand *cmd  = (const DrawElementsIndirectCommand *)indirect;     glDrawElementsInstancedBaseVertexBaseInstance(         mode,         cmd-&gt;count,         type,         cmd-&gt;firstIndex + size-of-type,         cmd-&gt;primCount,         cmd-&gt;baseVertex,         cmd-&gt;baseInstance     ); }</code></pre>@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40C#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param type the type of data in the buffer bound to the {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER} binding. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param indirect the address of a structure containing the draw parameters@see <a href="https://docs.gl/gl4/glDrawElementsIndirect">Reference Page</a>*/
    void glDrawElementsIndirect(int mode, int type, IntBuffer indirect);

    /** Specifies the value of a double uniform variable for the current program object.@param location the location of the uniform variable to be modified@param x the uniform x value@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform1d(int location, double x);

    /** Specifies the value of a dvec2 uniform variable for the current program object.@param location the location of the uniform variable to be modified@param x the uniform x value@param y the uniform y value@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform2d(int location, double x, double y);

    /** Specifies the value of a dvec3 uniform variable for the current program object.@param location the location of the uniform variable to be modified@param x the uniform x value@param y the uniform y value@param z the uniform z value@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform3d(int location, double x, double y, double z);

    /** Specifies the value of a dvec4 uniform variable for the current program object.@param location the location of the uniform variable to be modified@param x the uniform x value@param y the uniform y value@param z the uniform z value@param w the uniform w value@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform4d(int location, double x, double y, double z, double w);

    /** Specifies the value of a single double uniform variable or a double uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform1dv(int location, DoubleBuffer value);

    /** Specifies the value of a single dvec2 uniform variable or a dvec2 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform2dv(int location, DoubleBuffer value);

    /** Specifies the value of a single dvec3 uniform variable or a dvec3 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform3dv(int location, DoubleBuffer value);

    /** Specifies the value of a single dvec4 uniform variable or a dvec4 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform4dv(int location, DoubleBuffer value);

    /** Specifies the value of a single dmat2 uniform variable or a dmat2 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix2dv(int location, boolean transpose, DoubleBuffer value);

    /** Specifies the value of a single dmat3 uniform variable or a dmat3 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix3dv(int location, boolean transpose, DoubleBuffer value);

    /** Specifies the value of a single dmat4 uniform variable or a dmat4 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix4dv(int location, boolean transpose, DoubleBuffer value);

    /** Specifies the value of a single dmat2x3 uniform variable or a dmat2x3 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix2x3dv(int location, boolean transpose, DoubleBuffer value);

    /** Specifies the value of a single dmat2x4 uniform variable or a dmat2x4 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix2x4dv(int location, boolean transpose, DoubleBuffer value);

    /** Specifies the value of a single dmat3x2 uniform variable or a dmat3x2 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix3x2dv(int location, boolean transpose, DoubleBuffer value);

    /** Specifies the value of a single dmat3x4 uniform variable or a dmat3x4 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix3x4dv(int location, boolean transpose, DoubleBuffer value);

    /** Specifies the value of a single dmat4x2 uniform variable or a dmat4x2 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix4x2dv(int location, boolean transpose, DoubleBuffer value);

    /** Specifies the value of a single dmat4x3 uniform variable or a dmat4x3 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix4x3dv(int location, boolean transpose, DoubleBuffer value);

    /** Returns the double value(s) of a uniform variable.@param program the program object to be queried@param location the location of the uniform variable to be queried@param params the value of the specified uniform variable@see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>*/
    void glGetUniformdv(int program, int location, DoubleBuffer params);

    /** Returns the double value(s) of a uniform variable.@param program the program object to be queried@param location the location of the uniform variable to be queried@see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>*/
    double glGetUniformd(int program, int location);

    /** Specifies the minimum rate at which sample shading takes place.@param value the rate at which samples are shaded within each covered pixel@see <a href="https://docs.gl/gl4/glMinSampleShading">Reference Page</a>*/
    void glMinSampleShading(float value);

    /** Retrieves the location of a subroutine uniform of a given shader stage within a program.@param program the name of the program containing shader stage@param shadertype the shader stage from which to query for subroutine uniform index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>@param name the name of the subroutine uniform whose index to query.@see <a href="https://docs.gl/gl4/glGetSubroutineUniformLocation">Reference Page</a>*/
    int glGetSubroutineUniformLocation(int program, int shadertype, ByteBuffer name);

    /** Retrieves the location of a subroutine uniform of a given shader stage within a program.@param program the name of the program containing shader stage@param shadertype the shader stage from which to query for subroutine uniform index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>@param name the name of the subroutine uniform whose index to query.@see <a href="https://docs.gl/gl4/glGetSubroutineUniformLocation">Reference Page</a>*/
    int glGetSubroutineUniformLocation(int program, int shadertype, CharSequence name);

    /** Retrieves the index of a subroutine function of a given shader stage within a program.@param program the name of the program containing shader stage@param shadertype the shader stage from which to query for subroutine function index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>@param name the name of the subroutine function whose index to query@see <a href="https://docs.gl/gl4/glGetSubroutineIndex">Reference Page</a>*/
    int glGetSubroutineIndex(int program, int shadertype, ByteBuffer name);

    /** Retrieves the index of a subroutine function of a given shader stage within a program.@param program the name of the program containing shader stage@param shadertype the shader stage from which to query for subroutine function index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>@param name the name of the subroutine function whose index to query@see <a href="https://docs.gl/gl4/glGetSubroutineIndex">Reference Page</a>*/
    int glGetSubroutineIndex(int program, int shadertype, CharSequence name);

    /** Queries a property of an active shader subroutine uniform.@param program the name of the program containing the subroutine@param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>@param index the index of the shader subroutine uniform@param pname the parameter of the shader subroutine uniform to query. One of:<br><table><tr><td>{@link GL40C#GL_NUM_COMPATIBLE_SUBROUTINES NUM_COMPATIBLE_SUBROUTINES}</td><td>{@link GL40C#GL_COMPATIBLE_SUBROUTINES COMPATIBLE_SUBROUTINES}</td><td>{@link GL31#GL_UNIFORM_SIZE UNIFORM_SIZE}</td><td>{@link GL31#GL_UNIFORM_NAME_LENGTH UNIFORM_NAME_LENGTH}</td></tr></table>@param values the address of a buffer into which the queried value or values will be placed@see <a href="https://docs.gl/gl4/glGetActiveSubroutineUniform">Reference Page</a>*/
    void glGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, IntBuffer values);

    /** Queries a property of an active shader subroutine uniform.@param program the name of the program containing the subroutine@param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>@param index the index of the shader subroutine uniform@param pname the parameter of the shader subroutine uniform to query. One of:<br><table><tr><td>{@link GL40C#GL_NUM_COMPATIBLE_SUBROUTINES NUM_COMPATIBLE_SUBROUTINES}</td><td>{@link GL40C#GL_COMPATIBLE_SUBROUTINES COMPATIBLE_SUBROUTINES}</td><td>{@link GL31#GL_UNIFORM_SIZE UNIFORM_SIZE}</td><td>{@link GL31#GL_UNIFORM_NAME_LENGTH UNIFORM_NAME_LENGTH}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetActiveSubroutineUniform">Reference Page</a>*/
    int glGetActiveSubroutineUniformi(int program, int shadertype, int index, int pname);

    /** Queries the name of an active shader subroutine uniform.@param program the name of the program containing the subroutine@param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>@param index the index of the shader subroutine uniform@param length the address of a variable into which is written the number of characters copied into {@code name}@param name the address of a buffer that will receive the name of the specified shader subroutine uniform@see <a href="https://docs.gl/gl4/glGetActiveSubroutineUniformName">Reference Page</a>*/
    void glGetActiveSubroutineUniformName(int program, int shadertype, int index, IntBuffer length, ByteBuffer name);

    /** Queries the name of an active shader subroutine uniform.@param program the name of the program containing the subroutine@param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>@param index the index of the shader subroutine uniform@param bufsize the size of the buffer whose address is given in {@code name}@see <a href="https://docs.gl/gl4/glGetActiveSubroutineUniformName">Reference Page</a>*/
    String glGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize);

    /** Queries the name of an active shader subroutine uniform.@param program the name of the program containing the subroutine@param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>@param index the index of the shader subroutine uniform@see <a href="https://docs.gl/gl4/glGetActiveSubroutineUniformName">Reference Page</a>*/
    String glGetActiveSubroutineUniformName(int program, int shadertype, int index);

    /** Queries the name of an active shader subroutine.@param program the name of the program containing the subroutine@param shadertype the shader stage from which to query the subroutine name. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>@param index the index of the shader subroutine uniform@param length a variable which is to receive the length of the shader subroutine uniform name@param name an array into which the name of the shader subroutine uniform will be written@see <a href="https://docs.gl/gl4/glGetActiveSubroutineName">Reference Page</a>*/
    void glGetActiveSubroutineName(int program, int shadertype, int index, IntBuffer length, ByteBuffer name);

    /** Queries the name of an active shader subroutine.@param program the name of the program containing the subroutine@param shadertype the shader stage from which to query the subroutine name. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>@param index the index of the shader subroutine uniform@param bufsize the size of the buffer whose address is given in {@code name}@see <a href="https://docs.gl/gl4/glGetActiveSubroutineName">Reference Page</a>*/
    String glGetActiveSubroutineName(int program, int shadertype, int index, int bufsize);

    /** Queries the name of an active shader subroutine.@param program the name of the program containing the subroutine@param shadertype the shader stage from which to query the subroutine name. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>@param index the index of the shader subroutine uniform@see <a href="https://docs.gl/gl4/glGetActiveSubroutineName">Reference Page</a>*/
    String glGetActiveSubroutineName(int program, int shadertype, int index);

    /** Loads active subroutine uniforms.@param shadertype the shader stage to update. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>@param indices an array holding the indices to load into the shader subroutine variables@see <a href="https://docs.gl/gl4/glUniformSubroutines">Reference Page</a>*/
    void glUniformSubroutinesuiv(int shadertype, IntBuffer indices);

    /** Loads active subroutine uniforms.@param shadertype the shader stage to update. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>@see <a href="https://docs.gl/gl4/glUniformSubroutines">Reference Page</a>*/
    void glUniformSubroutinesui(int shadertype, int index);

    /** Retrieves the value of a subroutine uniform of a given shader stage of the current program.@param shadertype the shader stage from which to query for subroutine uniform index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>@param location the location of the subroutine uniform@param params a variable to receive the value or values of the subroutine uniform@see <a href="https://docs.gl/gl4/glGetUniformSubroutine">Reference Page</a>*/
    void glGetUniformSubroutineuiv(int shadertype, int location, IntBuffer params);

    /** Retrieves the value of a subroutine uniform of a given shader stage of the current program.@param shadertype the shader stage from which to query for subroutine uniform index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>@param location the location of the subroutine uniform@see <a href="https://docs.gl/gl4/glGetUniformSubroutine">Reference Page</a>*/
    int glGetUniformSubroutineui(int shadertype, int location);

    /** Retrieves properties of a program object corresponding to a specified shader stage.@param program the name of the program containing shader stage@param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>@param pname the parameter of the shader to query. One of:<br><table><tr><td>{@link GL40C#GL_ACTIVE_SUBROUTINES ACTIVE_SUBROUTINES}</td><td>{@link GL40C#GL_ACTIVE_SUBROUTINE_UNIFORMS ACTIVE_SUBROUTINE_UNIFORMS}</td></tr><tr><td>{@link GL40C#GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS}</td><td>{@link GL40C#GL_ACTIVE_SUBROUTINE_MAX_LENGTH ACTIVE_SUBROUTINE_MAX_LENGTH}</td></tr><tr><td>{@link GL40C#GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH}</td></tr></table>@param values a variable into which the queried value or values will be placed@see <a href="https://docs.gl/gl4/glGetProgramStage">Reference Page</a>*/
    void glGetProgramStageiv(int program, int shadertype, int pname, IntBuffer values);

    /** Retrieves properties of a program object corresponding to a specified shader stage.@param program the name of the program containing shader stage@param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>@param pname the parameter of the shader to query. One of:<br><table><tr><td>{@link GL40C#GL_ACTIVE_SUBROUTINES ACTIVE_SUBROUTINES}</td><td>{@link GL40C#GL_ACTIVE_SUBROUTINE_UNIFORMS ACTIVE_SUBROUTINE_UNIFORMS}</td></tr><tr><td>{@link GL40C#GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS}</td><td>{@link GL40C#GL_ACTIVE_SUBROUTINE_MAX_LENGTH ACTIVE_SUBROUTINE_MAX_LENGTH}</td></tr><tr><td>{@link GL40C#GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetProgramStage">Reference Page</a>*/
    int glGetProgramStagei(int program, int shadertype, int pname);

    /** Specifies the integer value of the specified parameter for patch primitives.@param pname the name of the parameter to set. Must be:<br><table><tr><td>{@link GL40C#GL_PATCH_VERTICES PATCH_VERTICES}</td></tr></table>@param value the new value for the parameter given by {@code pname}@see <a href="https://docs.gl/gl4/glPatchParameteri">Reference Page</a>*/
    void glPatchParameteri(int pname, int value);

    /** Specifies an array of float values for the specified parameter for patch primitives.@param pname the name of the parameter to set. One of:<br><table><tr><td>{@link GL40C#GL_PATCH_DEFAULT_OUTER_LEVEL PATCH_DEFAULT_OUTER_LEVEL}</td><td>{@link GL40C#GL_PATCH_DEFAULT_INNER_LEVEL PATCH_DEFAULT_INNER_LEVEL}</td></tr></table>@param values an array containing the new values for the parameter given by {@code pname}@see <a href="https://docs.gl/gl4/glPatchParameter">Reference Page</a>*/
    void glPatchParameterfv(int pname, FloatBuffer values);

    /** Binds a transform feedback object.@param target the target to which to bind the transform feedback object {@code id}. Must be:<br><table><tr><td>{@link GL40C#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}</td></tr></table>@param id the name of a transform feedback object@see <a href="https://docs.gl/gl4/glBindTransformFeedback">Reference Page</a>*/
    void glBindTransformFeedback(int target, int id);

    /** Deletes transform feedback objects.@param ids an array of names of transform feedback objects to delete@see <a href="https://docs.gl/gl4/glDeleteTransformFeedbacks">Reference Page</a>*/
    void glDeleteTransformFeedbacks(IntBuffer ids);

    /** Deletes transform feedback objects.@see <a href="https://docs.gl/gl4/glDeleteTransformFeedbacks">Reference Page</a>*/
    void glDeleteTransformFeedbacks(int id);

    /** Reserves transform feedback object names.@param ids an array of into which the reserved names will be written@see <a href="https://docs.gl/gl4/glGenTransformFeedbacks">Reference Page</a>*/
    void glGenTransformFeedbacks(IntBuffer ids);

    /** Reserves transform feedback object names.@see <a href="https://docs.gl/gl4/glGenTransformFeedbacks">Reference Page</a>*/
    int glGenTransformFeedbacks();

    /** Determines if a name corresponds to a transform feedback object.@param id a value that may be the name of a transform feedback object@see <a href="https://docs.gl/gl4/glIsTransformFeedback">Reference Page</a>*/
    boolean glIsTransformFeedback(int id);

    /** Pauses transform feedback operations for the currently bound transform feedback object. <p>When transform feedback operations are paused, transform feedback is still considered active and changing most transform feedback state related to the object results in an error. However, a new transform feedback object may be bound while transform feedback is paused. The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated by PauseTransformFeedback if the currently bound transform feedback is not active or is paused.</p> <p>When transform feedback is active and not paused, all geometric primitives generated must be compatible with the value of {@code primitiveMode} passed to {@link GL30C#glBeginTransformFeedback BeginTransformFeedback}. The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated by {@link GL11#glBegin Begin} or any operation that implicitly calls {@link GL11#glBegin Begin} (such as {@link GL11C#glDrawElements DrawElements}) if {@code mode} is not one of the allowed modes. If a geometry shader is active, its output primitive type is used instead of the {@code mode} parameter passed to {@link GL11#glBegin Begin} for the purposes of this error check. Any primitive type may be used while transform feedback is paused.</p>@see <a href="https://docs.gl/gl4/glPauseTransformFeedback">Reference Page</a>*/
    void glPauseTransformFeedback();

    /** Resumes transform feedback operations for the currently bound transform feedback object. <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated by {@link #glResumeTransformFeedback ResumeTransformFeedback} if the currently bound transform feedback is not active or is not paused.</p>@see <a href="https://docs.gl/gl4/glResumeTransformFeedback">Reference Page</a>*/
    void glResumeTransformFeedback();

    /** Render primitives using a count derived from a transform feedback object.@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40C#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param id the name of a transform feedback object from which to retrieve a primitive count@see <a href="https://docs.gl/gl4/glDrawTransformFeedback">Reference Page</a>*/
    void glDrawTransformFeedback(int mode, int id);

    /** Renders primitives using a count derived from a specifed stream of a transform feedback object.@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40C#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param id the name of a transform feedback object from which to retrieve a primitive count@param stream the index of the transform feedback stream from which to retrieve a primitive count@see <a href="https://docs.gl/gl4/glDrawTransformFeedbackStream">Reference Page</a>*/
    void glDrawTransformFeedbackStream(int mode, int id, int stream);

    /** Begins a query object on an indexed target@param target the target type of query object established between {@code glBeginQueryIndexed} and the subsequent {@link #glEndQueryIndexed EndQueryIndexed}. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>@param index the index of the query target upon which to begin the query@param id the name of a query object@see <a href="https://docs.gl/gl4/glBeginQueryIndexed">Reference Page</a>*/
    void glBeginQueryIndexed(int target, int index, int id);

    /** Ends a query object on an indexed target@param target the target type of query object to be concluded. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>@param index the index of the query target upon which to end the query@see <a href="https://docs.gl/gl4/glEndQueryIndexed">Reference Page</a>*/
    void glEndQueryIndexed(int target, int index);

    /** Returns parameters of an indexed query object target.@param target a query object target. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>@param index the index of the query object target@param pname the symbolic name of a query object target parameter@param params the requested data@see <a href="https://docs.gl/gl4/glGetQueryIndexed">Reference Page</a>*/
    void glGetQueryIndexediv(int target, int index, int pname, IntBuffer params);

    /** Returns parameters of an indexed query object target.@param target a query object target. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>@param index the index of the query object target@param pname the symbolic name of a query object target parameter@see <a href="https://docs.gl/gl4/glGetQueryIndexed">Reference Page</a>*/
    int glGetQueryIndexedi(int target, int index, int pname);

    /** Array version of: {@link #glDrawArraysIndirect DrawArraysIndirect}@see <a href="https://docs.gl/gl4/glDrawArraysIndirect">Reference Page</a>*/
    void glDrawArraysIndirect(int mode, int[] indirect);

    /** Array version of: {@link #glDrawElementsIndirect DrawElementsIndirect}@see <a href="https://docs.gl/gl4/glDrawElementsIndirect">Reference Page</a>*/
    void glDrawElementsIndirect(int mode, int type, int[] indirect);

    /** Array version of: {@link #glUniform1dv Uniform1dv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform1dv(int location, double[] value);

    /** Array version of: {@link #glUniform2dv Uniform2dv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform2dv(int location, double[] value);

    /** Array version of: {@link #glUniform3dv Uniform3dv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform3dv(int location, double[] value);

    /** Array version of: {@link #glUniform4dv Uniform4dv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform4dv(int location, double[] value);

    /** Array version of: {@link #glUniformMatrix2dv UniformMatrix2dv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix2dv(int location, boolean transpose, double[] value);

    /** Array version of: {@link #glUniformMatrix3dv UniformMatrix3dv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix3dv(int location, boolean transpose, double[] value);

    /** Array version of: {@link #glUniformMatrix4dv UniformMatrix4dv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix4dv(int location, boolean transpose, double[] value);

    /** Array version of: {@link #glUniformMatrix2x3dv UniformMatrix2x3dv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix2x3dv(int location, boolean transpose, double[] value);

    /** Array version of: {@link #glUniformMatrix2x4dv UniformMatrix2x4dv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix2x4dv(int location, boolean transpose, double[] value);

    /** Array version of: {@link #glUniformMatrix3x2dv UniformMatrix3x2dv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix3x2dv(int location, boolean transpose, double[] value);

    /** Array version of: {@link #glUniformMatrix3x4dv UniformMatrix3x4dv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix3x4dv(int location, boolean transpose, double[] value);

    /** Array version of: {@link #glUniformMatrix4x2dv UniformMatrix4x2dv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix4x2dv(int location, boolean transpose, double[] value);

    /** Array version of: {@link #glUniformMatrix4x3dv UniformMatrix4x3dv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix4x3dv(int location, boolean transpose, double[] value);

    /** Array version of: {@link #glGetUniformdv GetUniformdv}@see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>*/
    void glGetUniformdv(int program, int location, double[] params);

    /** Array version of: {@link #glGetActiveSubroutineUniformiv GetActiveSubroutineUniformiv}@see <a href="https://docs.gl/gl4/glGetActiveSubroutineUniform">Reference Page</a>*/
    void glGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, int[] values);

    /** Array version of: {@link #glGetActiveSubroutineUniformName GetActiveSubroutineUniformName}@see <a href="https://docs.gl/gl4/glGetActiveSubroutineUniformName">Reference Page</a>*/
    void glGetActiveSubroutineUniformName(int program, int shadertype, int index, int[] length, ByteBuffer name);

    /** Array version of: {@link #glGetActiveSubroutineName GetActiveSubroutineName}@see <a href="https://docs.gl/gl4/glGetActiveSubroutineName">Reference Page</a>*/
    void glGetActiveSubroutineName(int program, int shadertype, int index, int[] length, ByteBuffer name);

    /** Array version of: {@link #glUniformSubroutinesuiv UniformSubroutinesuiv}@see <a href="https://docs.gl/gl4/glUniformSubroutines">Reference Page</a>*/
    void glUniformSubroutinesuiv(int shadertype, int[] indices);

    /** Array version of: {@link #glGetUniformSubroutineuiv GetUniformSubroutineuiv}@see <a href="https://docs.gl/gl4/glGetUniformSubroutine">Reference Page</a>*/
    void glGetUniformSubroutineuiv(int shadertype, int location, int[] params);

    /** Array version of: {@link #glGetProgramStageiv GetProgramStageiv}@see <a href="https://docs.gl/gl4/glGetProgramStage">Reference Page</a>*/
    void glGetProgramStageiv(int program, int shadertype, int pname, int[] values);

    /** Array version of: {@link #glPatchParameterfv PatchParameterfv}@see <a href="https://docs.gl/gl4/glPatchParameter">Reference Page</a>*/
    void glPatchParameterfv(int pname, float[] values);

    /** Array version of: {@link #glDeleteTransformFeedbacks DeleteTransformFeedbacks}@see <a href="https://docs.gl/gl4/glDeleteTransformFeedbacks">Reference Page</a>*/
    void glDeleteTransformFeedbacks(int[] ids);

    /** Array version of: {@link #glGenTransformFeedbacks GenTransformFeedbacks}@see <a href="https://docs.gl/gl4/glGenTransformFeedbacks">Reference Page</a>*/
    void glGenTransformFeedbacks(int[] ids);

    /** Array version of: {@link #glGetQueryIndexediv GetQueryIndexediv}@see <a href="https://docs.gl/gl4/glGetQueryIndexed">Reference Page</a>*/
    void glGetQueryIndexediv(int target, int index, int pname, int[] params);

}
