package br.fosge.runtime.platform.binding.opengl.api;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryUtil;

import java.nio.*;

public interface GL32 {

    /** Accepted by the {@code pname} parameter of GetIntegerv.*/
    int GL_CONTEXT_PROFILE_MASK = 37158;

    /** Context profile bits.*/
    int GL_CONTEXT_CORE_PROFILE_BIT = 1;

    /** Context profile bits.*/
    int GL_CONTEXT_COMPATIBILITY_PROFILE_BIT = 2;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_VERTEX_OUTPUT_COMPONENTS = 37154;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_GEOMETRY_INPUT_COMPONENTS = 37155;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_GEOMETRY_OUTPUT_COMPONENTS = 37156;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_FRAGMENT_INPUT_COMPONENTS = 37157;

    /** Accepted by the {@code mode} parameter of ProvokingVertex.*/
    int GL_FIRST_VERTEX_CONVENTION = 36429;

    /** Accepted by the {@code mode} parameter of ProvokingVertex.*/
    int GL_LAST_VERTEX_CONVENTION = 36430;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_PROVOKING_VERTEX = 36431;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION = 36428;

    /** Accepted by the {@code cap} parameter of Enable, Disable and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and GetDoublev.*/
    int GL_TEXTURE_CUBE_MAP_SEAMLESS = 34895;

    /** Accepted by the {@code pname} parameter of GetMultisamplefv.*/
    int GL_SAMPLE_POSITION = 36432;

    /** Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_SAMPLE_MASK = 36433;

    /** Accepted by the {@code target} parameter of GetBooleani_v and GetIntegeri_v.*/
    int GL_SAMPLE_MASK_VALUE = 36434;

    /** Accepted by the {@code target} parameter of BindTexture and TexImage2DMultisample.*/
    int GL_TEXTURE_2D_MULTISAMPLE = 37120;

    /** Accepted by the {@code target} parameter of TexImage2DMultisample.*/
    int GL_PROXY_TEXTURE_2D_MULTISAMPLE = 37121;

    /** Accepted by the {@code target} parameter of BindTexture and TexImage3DMultisample.*/
    int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 37122;

    /** Accepted by the {@code target} parameter of TexImage3DMultisample.*/
    int GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY = 37123;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_MAX_SAMPLE_MASK_WORDS = 36441;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_MAX_COLOR_TEXTURE_SAMPLES = 37134;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_MAX_DEPTH_TEXTURE_SAMPLES = 37135;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_MAX_INTEGER_SAMPLES = 37136;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_TEXTURE_BINDING_2D_MULTISAMPLE = 37124;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = 37125;

    /** Accepted by the {@code pname} parameter of GetTexLevelParameter.*/
    int GL_TEXTURE_SAMPLES = 37126;

    /** Accepted by the {@code pname} parameter of GetTexLevelParameter.*/
    int GL_TEXTURE_FIXED_SAMPLE_LOCATIONS = 37127;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_SAMPLER_2D_MULTISAMPLE = 37128;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_SAMPLER_2D_MULTISAMPLE = 37129;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE = 37130;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_SAMPLER_2D_MULTISAMPLE_ARRAY = 37131;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 37132;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 37133;

    /** Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_DEPTH_CLAMP = 34383;

    /** Accepted by the {@code type} parameter of CreateShader and returned by the {@code params} parameter of GetShaderiv.*/
    int GL_GEOMETRY_SHADER = 36313;

    /** Accepted by the {@code pname} parameter of ProgramParameteri and GetProgramiv.*/
    int GL_GEOMETRY_VERTICES_OUT = 36314;

    /** Accepted by the {@code pname} parameter of ProgramParameteri and GetProgramiv.*/
    int GL_GEOMETRY_INPUT_TYPE = 36315;

    /** Accepted by the {@code pname} parameter of ProgramParameteri and GetProgramiv.*/
    int GL_GEOMETRY_OUTPUT_TYPE = 36316;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS = 35881;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS = 36319;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_GEOMETRY_OUTPUT_VERTICES = 36320;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS = 36321;

    /** Accepted by the {@code mode} parameter of Begin, DrawArrays, MultiDrawArrays, DrawElements, MultiDrawElements, and DrawRangeElements.*/
    int GL_LINES_ADJACENCY = 10;

    /** Accepted by the {@code mode} parameter of Begin, DrawArrays, MultiDrawArrays, DrawElements, MultiDrawElements, and DrawRangeElements.*/
    int GL_LINE_STRIP_ADJACENCY = 11;

    /** Accepted by the {@code mode} parameter of Begin, DrawArrays, MultiDrawArrays, DrawElements, MultiDrawElements, and DrawRangeElements.*/
    int GL_TRIANGLES_ADJACENCY = 12;

    /** Accepted by the {@code mode} parameter of Begin, DrawArrays, MultiDrawArrays, DrawElements, MultiDrawElements, and DrawRangeElements.*/
    int GL_TRIANGLE_STRIP_ADJACENCY = 13;

    /** Returned by CheckFramebufferStatus.*/
    int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS = 36264;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachment- Parameteriv.*/
    int GL_FRAMEBUFFER_ATTACHMENT_LAYERED = 36263;

    /** Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetIntegerv, GetFloatv, GetDoublev, and GetBooleanv.*/
    int GL_PROGRAM_POINT_SIZE = 34370;

    /** Accepted as the {@code pname} parameter of GetInteger64v.*/
    int GL_MAX_SERVER_WAIT_TIMEOUT = 37137;

    /** Accepted as the {@code pname} parameter of GetSynciv.*/
    int GL_OBJECT_TYPE = 37138;

    /** Accepted as the {@code pname} parameter of GetSynciv.*/
    int GL_SYNC_CONDITION = 37139;

    /** Accepted as the {@code pname} parameter of GetSynciv.*/
    int GL_SYNC_STATUS = 37140;

    /** Accepted as the {@code pname} parameter of GetSynciv.*/
    int GL_SYNC_FLAGS = 37141;

    /** Returned in {@code values} for GetSynciv {@code pname} OBJECT_TYPE.*/
    int GL_SYNC_FENCE = 37142;

    /** Returned in {@code values} for GetSynciv {@code pname} SYNC_CONDITION.*/
    int GL_SYNC_GPU_COMMANDS_COMPLETE = 37143;

    /** Returned in {@code values} for GetSynciv {@code pname} SYNC_STATUS.*/
    int GL_UNSIGNALED = 37144;

    /** Returned in {@code values} for GetSynciv {@code pname} SYNC_STATUS.*/
    int GL_SIGNALED = 37145;

    /** Accepted in the {@code flags} parameter of ClientWaitSync.*/
    int GL_SYNC_FLUSH_COMMANDS_BIT = 1;

    /** Accepted in the {@code timeout} parameter of WaitSync.*/
    long GL_TIMEOUT_IGNORED = -1L;

    /** Returned by ClientWaitSync.*/
    int GL_ALREADY_SIGNALED = 37146;

    /** Returned by ClientWaitSync.*/
    int GL_TIMEOUT_EXPIRED = 37147;

    /** Returned by ClientWaitSync.*/
    int GL_CONDITION_SATISFIED = 37148;

    /** Returned by ClientWaitSync.*/
    int GL_WAIT_FAILED = 37149;

    /** Returns the value of a buffer object parameter.@param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param pname the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}</td></tr><tr><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td></tr><tr><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>@param params the requested parameter@see <a href="https://docs.gl/gl4/glGetBufferParameter">Reference Page</a>*/
    void glGetBufferParameteri64v(int target, int pname, LongBuffer params);

    /** Returns the value of a buffer object parameter.@param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param pname the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}</td></tr><tr><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td></tr><tr><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetBufferParameter">Reference Page</a>*/
    long glGetBufferParameteri64(int target, int pname);

    /** Renders primitives from array data with a per-element offset.@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32C#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32C#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param count the number of elements to be rendered@param type the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param indices a pointer to the location where the indices are stored@param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays@see <a href="https://docs.gl/gl4/glDrawElementsBaseVertex">Reference Page</a>*/
    void glDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex);

    /** Renders primitives from array data with a per-element offset.@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32C#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32C#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param type the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param indices a pointer to the location where the indices are stored@param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays@see <a href="https://docs.gl/gl4/glDrawElementsBaseVertex">Reference Page</a>*/
    void glDrawElementsBaseVertex(int mode, int type, ByteBuffer indices, int basevertex);

    /** Renders primitives from array data with a per-element offset.@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32C#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32C#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param indices a pointer to the location where the indices are stored@param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays@see <a href="https://docs.gl/gl4/glDrawElementsBaseVertex">Reference Page</a>*/
    void glDrawElementsBaseVertex(int mode, ByteBuffer indices, int basevertex);

    /** Renders primitives from array data with a per-element offset.@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32C#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32C#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param indices a pointer to the location where the indices are stored@param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays@see <a href="https://docs.gl/gl4/glDrawElementsBaseVertex">Reference Page</a>*/
    void glDrawElementsBaseVertex(int mode, ShortBuffer indices, int basevertex);

    /** Renders primitives from array data with a per-element offset.@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32C#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32C#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param indices a pointer to the location where the indices are stored@param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays@see <a href="https://docs.gl/gl4/glDrawElementsBaseVertex">Reference Page</a>*/
    void glDrawElementsBaseVertex(int mode, IntBuffer indices, int basevertex);

    /** Renders primitives from array data with a per-element offset.@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32C#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32C#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param start the minimum array index contained in {@code indices}@param end the maximum array index contained in {@code indices}@param count the number of elements to be rendered@param type the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param indices a pointer to the location where the indices are stored@param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays@see <a href="https://docs.gl/gl4/glDrawRangeElementsBaseVertex">Reference Page</a>*/
    void glDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices, int basevertex);

    /** Renders primitives from array data with a per-element offset.@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32C#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32C#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param start the minimum array index contained in {@code indices}@param end the maximum array index contained in {@code indices}@param type the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param indices a pointer to the location where the indices are stored@param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays@see <a href="https://docs.gl/gl4/glDrawRangeElementsBaseVertex">Reference Page</a>*/
    void glDrawRangeElementsBaseVertex(int mode, int start, int end, int type, ByteBuffer indices, int basevertex);

    /** Renders primitives from array data with a per-element offset.@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32C#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32C#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param start the minimum array index contained in {@code indices}@param end the maximum array index contained in {@code indices}@param indices a pointer to the location where the indices are stored@param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays@see <a href="https://docs.gl/gl4/glDrawRangeElementsBaseVertex">Reference Page</a>*/
    void glDrawRangeElementsBaseVertex(int mode, int start, int end, ByteBuffer indices, int basevertex);

    /** Renders primitives from array data with a per-element offset.@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32C#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32C#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param start the minimum array index contained in {@code indices}@param end the maximum array index contained in {@code indices}@param indices a pointer to the location where the indices are stored@param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays@see <a href="https://docs.gl/gl4/glDrawRangeElementsBaseVertex">Reference Page</a>*/
    void glDrawRangeElementsBaseVertex(int mode, int start, int end, ShortBuffer indices, int basevertex);

    /** Renders primitives from array data with a per-element offset.@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32C#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32C#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param start the minimum array index contained in {@code indices}@param end the maximum array index contained in {@code indices}@param indices a pointer to the location where the indices are stored@param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays@see <a href="https://docs.gl/gl4/glDrawRangeElementsBaseVertex">Reference Page</a>*/
    void glDrawRangeElementsBaseVertex(int mode, int start, int end, IntBuffer indices, int basevertex);

    /** Renders multiple instances of a set of primitives from array data with a per-element offset.@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32C#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32C#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param count the number of elements to be rendered@param type the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param indices a pointer to the location where the indices are stored@param primcount the number of instances of the indexed geometry that should be drawn@param basevertex a constant that should be added to each element of indices when chosing elements from the enabled vertex arrays@see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseVertex">Reference Page</a>*/
    void glDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices, int primcount, int basevertex);

    /** Renders multiple instances of a set of primitives from array data with a per-element offset.@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32C#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32C#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param type the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param indices a pointer to the location where the indices are stored@param primcount the number of instances of the indexed geometry that should be drawn@param basevertex a constant that should be added to each element of indices when chosing elements from the enabled vertex arrays@see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseVertex">Reference Page</a>*/
    void glDrawElementsInstancedBaseVertex(int mode, int type, ByteBuffer indices, int primcount, int basevertex);

    /** Renders multiple instances of a set of primitives from array data with a per-element offset.@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32C#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32C#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param indices a pointer to the location where the indices are stored@param primcount the number of instances of the indexed geometry that should be drawn@param basevertex a constant that should be added to each element of indices when chosing elements from the enabled vertex arrays@see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseVertex">Reference Page</a>*/
    void glDrawElementsInstancedBaseVertex(int mode, ByteBuffer indices, int primcount, int basevertex);

    /** Renders multiple instances of a set of primitives from array data with a per-element offset.@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32C#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32C#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param indices a pointer to the location where the indices are stored@param primcount the number of instances of the indexed geometry that should be drawn@param basevertex a constant that should be added to each element of indices when chosing elements from the enabled vertex arrays@see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseVertex">Reference Page</a>*/
    void glDrawElementsInstancedBaseVertex(int mode, ShortBuffer indices, int primcount, int basevertex);

    /** Renders multiple instances of a set of primitives from array data with a per-element offset.@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32C#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32C#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param indices a pointer to the location where the indices are stored@param primcount the number of instances of the indexed geometry that should be drawn@param basevertex a constant that should be added to each element of indices when chosing elements from the enabled vertex arrays@see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseVertex">Reference Page</a>*/
    void glDrawElementsInstancedBaseVertex(int mode, IntBuffer indices, int primcount, int basevertex);

    /** Renders multiple sets of primitives by specifying indices of array data elements and an offset to apply to each index. <p><b>LWJGL note</b>: Use {@link MemoryUtil#memAddress} to retrieve pointers to the index buffers.</p>@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32C#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32C#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32C#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param count an array of the elements counts@param type the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param indices a pointer to the location where the indices are stored@param basevertex a pointer to the location where the base vertices are stored@see <a href="https://docs.gl/gl4/glMultiDrawElementsBaseVertex">Reference Page</a>*/
    void glMultiDrawElementsBaseVertex(int mode, IntBuffer count, int type, PointerBuffer indices, IntBuffer basevertex);

    /** Specifies the vertex to be used as the source of data for flat shaded varyings.@param mode the provoking vertex mode. One of:<br><table><tr><td>{@link GL32C#GL_FIRST_VERTEX_CONVENTION FIRST_VERTEX_CONVENTION}</td><td>{@link GL32C#GL_LAST_VERTEX_CONVENTION LAST_VERTEX_CONVENTION}</td></tr></table>@see <a href="https://docs.gl/gl4/glProvokingVertex">Reference Page</a>*/
    void glProvokingVertex(int mode);

    /** Establishes the data storage, format, dimensions, and number of samples of a 2D multisample texture's image.@param target the target of the operation. One of:<br><table><tr><td>{@link GL32C#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32C#GL_PROXY_TEXTURE_2D_MULTISAMPLE PROXY_TEXTURE_2D_MULTISAMPLE}</td></tr></table>@param samples the number of samples in the multisample texture's image@param internalformat the internal format to be used to store the multisample texture's image. {@code internalformat} must specify a color-renderable, depth-renderable,                             or stencil-renderable format.@param width the width of the multisample texture's image, in texels@param height the height of the multisample texture's image, in texels@param fixedsamplelocations whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not                             depend on the internal format or size of the image@see <a href="https://docs.gl/gl4/glTexImage2DMultisample">Reference Page</a>*/
    void glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations);

    /** Establishes the data storage, format, dimensions, and number of samples of a 3D multisample texture's image.@param target the target of the operation. One of:<br><table><tr><td>{@link GL32C#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td><td>{@link GL32C#GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>@param samples the number of samples in the multisample texture's image@param internalformat the internal format to be used to store the multisample texture's image. {@code internalformat} must specify a color-renderable, depth-renderable,                             or stencil-renderable format.@param width the width of the multisample texture's image, in texels@param height the height of the multisample texture's image, in texels@param depth the depth of the multisample texture's image, in texels@param fixedsamplelocations whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not                             depend on the internal format or size of the image@see <a href="https://docs.gl/gl4/glTexImage3DMultisample">Reference Page</a>*/
    void glTexImage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations);

    /** Retrieves the location of a sample.@param pname the sample parameter name. Must be:<br><table><tr><td>{@link GL32C#GL_SAMPLE_POSITION SAMPLE_POSITION}</td></tr></table>@param index the index of the sample whose position to query@param val an array to receive the position of the sample@see <a href="https://docs.gl/gl4/glGetMultisample">Reference Page</a>*/
    void glGetMultisamplefv(int pname, int index, FloatBuffer val);

    /** Retrieves the location of a sample.@param pname the sample parameter name. Must be:<br><table><tr><td>{@link GL32C#GL_SAMPLE_POSITION SAMPLE_POSITION}</td></tr></table>@param index the index of the sample whose position to query@see <a href="https://docs.gl/gl4/glGetMultisample">Reference Page</a>*/
    float glGetMultisamplef(int pname, int index);

    /** Sets the value of a sub-word of the sample mask.@param index which 32-bit sub-word of the sample mask to update@param mask the new value of the mask sub-word@see <a href="https://docs.gl/gl4/glSampleMaski">Reference Page</a>*/
    void glSampleMaski(int index, int mask);

    /** Attaches a level of a texture object as a logical buffer to the currently bound framebuffer object.@param target the framebuffer target. One of:<br><table><tr><td>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>@param attachment the attachment point of the framebuffer@param texture the texture object to attach to the framebuffer attachment point named by {@code attachment}@param level the mipmap level of {@code texture} to attach@see <a href="https://docs.gl/gl4/glFramebufferTexture">Reference Page</a>*/
    void glFramebufferTexture(int target, int attachment, int texture, int level);

    /** Creates a new sync object and inserts it into the GL command stream.@param condition the condition that must be met to set the sync object's state to signaled. Must be:<br><table><tr><td>{@link GL32C#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE}</td></tr></table>@param flags a bitwise combination of flags controlling the behavior of the sync object. No flags are presently defined for this operation and {@code flags} must                  be zero.@see <a href="https://docs.gl/gl4/glFenceSync">Reference Page</a>*/
    long glFenceSync(int condition, int flags);

    /** Determines if a name corresponds to a sync object.@param sync a value that may be the name of a sync object@see <a href="https://docs.gl/gl4/glIsSync">Reference Page</a>*/
    boolean glIsSync(long sync);

    /** Deletes a sync object.@param sync the sync object to be deleted@see <a href="https://docs.gl/gl4/glDeleteSync">Reference Page</a>*/
    void glDeleteSync(long sync);

    /** Causes the client to block and wait for a sync object to become signaled. If {@code sync} is signaled when {@code glClientWaitSync} is called, {@code glClientWaitSync} returns immediately, otherwise it will block and wait for up to timeout nanoseconds for {@code sync} to become signaled. <p>The return value is one of four status values:</p> <ul> <li>{@link GL32C#GL_ALREADY_SIGNALED ALREADY_SIGNALED} indicates that sync was signaled at the time that glClientWaitSync was called.</li> <li>{@link GL32C#GL_TIMEOUT_EXPIRED TIMEOUT_EXPIRED} indicates that at least timeout nanoseconds passed and sync did not become signaled.</li> <li>{@link GL32C#GL_CONDITION_SATISFIED CONDITION_SATISFIED} indicates that sync was signaled before the timeout expired.</li> <li>{@link GL32C#GL_WAIT_FAILED WAIT_FAILED} indicates that an error occurred. Additionally, an OpenGL error will be generated.</li> </ul>@param sync the sync object whose status to wait on@param flags a bitfield controlling the command flushing behavior. One or more of:<br><table><tr><td>0</td><td>{@link GL32C#GL_SYNC_FLUSH_COMMANDS_BIT SYNC_FLUSH_COMMANDS_BIT}</td></tr></table>@param timeout the timeout, specified in nanoseconds, for which the implementation should wait for {@code sync} to become signaled@see <a href="https://docs.gl/gl4/glClientWaitSync">Reference Page</a>*/
    int glClientWaitSync(long sync, int flags, long timeout);

    /** Causes the GL server to block and wait for a sync object to become signaled. <p>{@code glWaitSync} will always wait no longer than an implementation-dependent timeout. The duration of this timeout in nanoseconds may be queried by with {@link GL32C#GL_MAX_SERVER_WAIT_TIMEOUT MAX_SERVER_WAIT_TIMEOUT}. There is currently no way to determine whether glWaitSync unblocked because the timeout expired or because the sync object being waited on was signaled.</p> <p>If an error occurs, {@code glWaitSync} does not cause the GL server to block.</p>@param sync the sync object whose status to wait on@param flags a bitfield controlling the command flushing behavior. Must be:<br><table><tr><td>0</td></tr></table>@param timeout the timeout that the server should wait before continuing. Must be:<br><table><tr><td>{@link GL32C#GL_TIMEOUT_IGNORED TIMEOUT_IGNORED}</td></tr></table>@see <a href="https://docs.gl/gl4/glWaitSync">Reference Page</a>*/
    void glWaitSync(long sync, int flags, long timeout);

    /** Returns the 64bit integer value or values of a selected parameter.@param pname the parameter value to be returned@param params the value or values of the specified parameter@see <a href="https://docs.gl/gl4/glGetInteger64v">Reference Page</a>*/
    void glGetInteger64v(int pname, LongBuffer params);

    /** Returns the 64bit integer value or values of a selected parameter.@param pname the parameter value to be returned@see <a href="https://docs.gl/gl4/glGetInteger64v">Reference Page</a>*/
    long glGetInteger64(int pname);

    /** Queries the 64bit integer value of an indexed state variable.@param pname the indexed state to query@param index the index of the element being queried@param params the value or values of the specified parameter@see <a href="https://docs.gl/gl4/glGetInteger">Reference Page</a>*/
    void glGetInteger64i_v(int pname, int index, LongBuffer params);

    /** Queries the 64bit integer value of an indexed state variable.@param pname the indexed state to query@param index the index of the element being queried@see <a href="https://docs.gl/gl4/glGetInteger">Reference Page</a>*/
    long glGetInteger64i(int pname, int index);

    /** Queries the properties of a sync object.@param sync the sync object whose properties to query@param pname the parameter whose value to retrieve from the sync object specified in {@code sync}. One of:<br><table><tr><td>{@link GL32C#GL_OBJECT_TYPE OBJECT_TYPE}</td><td>{@link GL32C#GL_SYNC_CONDITION SYNC_CONDITION}</td><td>{@link GL32C#GL_SYNC_STATUS SYNC_STATUS}</td><td>{@link GL32C#GL_SYNC_FLAGS SYNC_FLAGS}</td></tr></table>@param length the address of an variable to receive the number of integers placed in {@code values}@param values the address of an array to receive the values of the queried parameter@see <a href="https://docs.gl/gl4/glGetSync">Reference Page</a>*/
    void glGetSynciv(long sync, int pname, IntBuffer length, IntBuffer values);

    /** Queries the properties of a sync object.@param sync the sync object whose properties to query@param pname the parameter whose value to retrieve from the sync object specified in {@code sync}. One of:<br><table><tr><td>{@link GL32C#GL_OBJECT_TYPE OBJECT_TYPE}</td><td>{@link GL32C#GL_SYNC_CONDITION SYNC_CONDITION}</td><td>{@link GL32C#GL_SYNC_STATUS SYNC_STATUS}</td><td>{@link GL32C#GL_SYNC_FLAGS SYNC_FLAGS}</td></tr></table>@param length the address of an variable to receive the number of integers placed in {@code values}@see <a href="https://docs.gl/gl4/glGetSync">Reference Page</a>*/
    int glGetSynci(long sync, int pname, IntBuffer length);

    /** Array version of: {@link #glGetBufferParameteri64v GetBufferParameteri64v}@see <a href="https://docs.gl/gl4/glGetBufferParameter">Reference Page</a>*/
    void glGetBufferParameteri64v(int target, int pname, long[] params);

    /** Array version of: {@link #glMultiDrawElementsBaseVertex MultiDrawElementsBaseVertex}@see <a href="https://docs.gl/gl4/glMultiDrawElementsBaseVertex">Reference Page</a>*/
    void glMultiDrawElementsBaseVertex(int mode, int[] count, int type, PointerBuffer indices, int[] basevertex);

    /** Array version of: {@link #glGetMultisamplefv GetMultisamplefv}@see <a href="https://docs.gl/gl4/glGetMultisample">Reference Page</a>*/
    void glGetMultisamplefv(int pname, int index, float[] val);

    /** Array version of: {@link #glGetInteger64v GetInteger64v}@see <a href="https://docs.gl/gl4/glGetInteger64v">Reference Page</a>*/
    void glGetInteger64v(int pname, long[] params);

    /** Array version of: {@link #glGetInteger64i_v GetInteger64i_v}@see <a href="https://docs.gl/gl4/glGetInteger">Reference Page</a>*/
    void glGetInteger64i_v(int pname, int index, long[] params);

    /** Array version of: {@link #glGetSynciv GetSynciv}@see <a href="https://docs.gl/gl4/glGetSync">Reference Page</a>*/
    void glGetSynciv(long sync, int pname, int[] length, int[] values);

}
