package br.fosge.runtime.platform.binding.opengl.api;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public interface GL42 {

    /** Renamed tokens.*/
    int GL_COPY_READ_BUFFER_BINDING = GL31.GL_COPY_READ_BUFFER;

    /** Renamed tokens.*/
    int GL_COPY_WRITE_BUFFER_BINDING = GL31.GL_COPY_WRITE_BUFFER;

    /** Renamed tokens.*/
    int GL_TRANSFORM_FEEDBACK_ACTIVE = GL40.GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE;

    /** Renamed tokens.*/
    int GL_TRANSFORM_FEEDBACK_PAUSED = GL40.GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED;

    /** Accepted by the {@code internalformat} parameter of TexImage2D, TexImage3D, CopyTexImage2D, CopyTexImage3D, CompressedTexImage2D, and CompressedTexImage3D and the {@code format} parameter of CompressedTexSubImage2D and CompressedTexSubImage3D.*/
    int GL_COMPRESSED_RGBA_BPTC_UNORM = 36492;

    /** Accepted by the {@code internalformat} parameter of TexImage2D, TexImage3D, CopyTexImage2D, CopyTexImage3D, CompressedTexImage2D, and CompressedTexImage3D and the {@code format} parameter of CompressedTexSubImage2D and CompressedTexSubImage3D.*/
    int GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM = 36493;

    /** Accepted by the {@code internalformat} parameter of TexImage2D, TexImage3D, CopyTexImage2D, CopyTexImage3D, CompressedTexImage2D, and CompressedTexImage3D and the {@code format} parameter of CompressedTexSubImage2D and CompressedTexSubImage3D.*/
    int GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT = 36494;

    /** Accepted by the {@code internalformat} parameter of TexImage2D, TexImage3D, CopyTexImage2D, CopyTexImage3D, CompressedTexImage2D, and CompressedTexImage3D and the {@code format} parameter of CompressedTexSubImage2D and CompressedTexSubImage3D.*/
    int GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT = 36495;

    /** Accepted by the {@code pname} parameter of PixelStore[fi], GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_UNPACK_COMPRESSED_BLOCK_WIDTH = 37159;

    /** Accepted by the {@code pname} parameter of PixelStore[fi], GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_UNPACK_COMPRESSED_BLOCK_HEIGHT = 37160;

    /** Accepted by the {@code pname} parameter of PixelStore[fi], GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_UNPACK_COMPRESSED_BLOCK_DEPTH = 37161;

    /** Accepted by the {@code pname} parameter of PixelStore[fi], GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_UNPACK_COMPRESSED_BLOCK_SIZE = 37162;

    /** Accepted by the {@code pname} parameter of PixelStore[fi], GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_PACK_COMPRESSED_BLOCK_WIDTH = 37163;

    /** Accepted by the {@code pname} parameter of PixelStore[fi], GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_PACK_COMPRESSED_BLOCK_HEIGHT = 37164;

    /** Accepted by the {@code pname} parameter of PixelStore[fi], GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_PACK_COMPRESSED_BLOCK_DEPTH = 37165;

    /** Accepted by the {@code pname} parameter of PixelStore[fi], GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_PACK_COMPRESSED_BLOCK_SIZE = 37166;

    /** Accepted by the {@code target} parameter of BindBufferBase and BindBufferRange.*/
    int GL_ATOMIC_COUNTER_BUFFER = 37568;

    /** Accepted by the {@code pname} parameter of GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, GetInteger64i_v, GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, GetDoublev, and GetActiveAtomicCounterBufferiv.*/
    int GL_ATOMIC_COUNTER_BUFFER_BINDING = 37569;

    /** Accepted by the {@code pname} parameter of GetIntegeri_64v.*/
    int GL_ATOMIC_COUNTER_BUFFER_START = 37570;

    /** Accepted by the {@code pname} parameter of GetIntegeri_64v.*/
    int GL_ATOMIC_COUNTER_BUFFER_SIZE = 37571;

    /** Accepted by the {@code pname} parameter of GetActiveAtomicCounterBufferiv.*/
    int GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE = 37572;

    /** Accepted by the {@code pname} parameter of GetActiveAtomicCounterBufferiv.*/
    int GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS = 37573;

    /** Accepted by the {@code pname} parameter of GetActiveAtomicCounterBufferiv.*/
    int GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES = 37574;

    /** Accepted by the {@code pname} parameter of GetActiveAtomicCounterBufferiv.*/
    int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER = 37575;

    /** Accepted by the {@code pname} parameter of GetActiveAtomicCounterBufferiv.*/
    int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER = 37576;

    /** Accepted by the {@code pname} parameter of GetActiveAtomicCounterBufferiv.*/
    int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER = 37577;

    /** Accepted by the {@code pname} parameter of GetActiveAtomicCounterBufferiv.*/
    int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER = 37578;

    /** Accepted by the {@code pname} parameter of GetActiveAtomicCounterBufferiv.*/
    int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER = 37579;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS = 37580;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS = 37581;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS = 37582;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS = 37583;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS = 37584;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS = 37585;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_VERTEX_ATOMIC_COUNTERS = 37586;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS = 37587;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS = 37588;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_GEOMETRY_ATOMIC_COUNTERS = 37589;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_FRAGMENT_ATOMIC_COUNTERS = 37590;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_COMBINED_ATOMIC_COUNTERS = 37591;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_ATOMIC_COUNTER_BUFFER_SIZE = 37592;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS = 37596;

    /** Accepted by the {@code pname} parameter of GetProgramiv.*/
    int GL_ACTIVE_ATOMIC_COUNTER_BUFFERS = 37593;

    /** Accepted by the {@code pname} parameter of GetActiveUniformsiv.*/
    int GL_UNIFORM_ATOMIC_COUNTER_BUFFER_INDEX = 37594;

    /** Returned in {@code params} by GetActiveUniform and GetActiveUniformsiv.*/
    int GL_UNSIGNED_INT_ATOMIC_COUNTER = 37595;

    /** Accepted by the {@code value} parameter of GetTexParameter{if}_2.*/
    int GL_TEXTURE_IMMUTABLE_FORMAT = 37167;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.*/
    int GL_MAX_IMAGE_UNITS = 36664;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.*/
    int GL_MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS = 36665;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.*/
    int GL_MAX_IMAGE_SAMPLES = 36973;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.*/
    int GL_MAX_VERTEX_IMAGE_UNIFORMS = 37066;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.*/
    int GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS = 37067;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.*/
    int GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS = 37068;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.*/
    int GL_MAX_GEOMETRY_IMAGE_UNIFORMS = 37069;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.*/
    int GL_MAX_FRAGMENT_IMAGE_UNIFORMS = 37070;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.*/
    int GL_MAX_COMBINED_IMAGE_UNIFORMS = 37071;

    /** Accepted by the {@code target} parameter of GetIntegeri_v and GetBooleani_v.*/
    int GL_IMAGE_BINDING_NAME = 36666;

    /** Accepted by the {@code target} parameter of GetIntegeri_v and GetBooleani_v.*/
    int GL_IMAGE_BINDING_LEVEL = 36667;

    /** Accepted by the {@code target} parameter of GetIntegeri_v and GetBooleani_v.*/
    int GL_IMAGE_BINDING_LAYERED = 36668;

    /** Accepted by the {@code target} parameter of GetIntegeri_v and GetBooleani_v.*/
    int GL_IMAGE_BINDING_LAYER = 36669;

    /** Accepted by the {@code target} parameter of GetIntegeri_v and GetBooleani_v.*/
    int GL_IMAGE_BINDING_ACCESS = 36670;

    /** Accepted by the {@code target} parameter of GetIntegeri_v and GetBooleani_v.*/
    int GL_IMAGE_BINDING_FORMAT = 36974;

    /** Accepted by the {@code barriers} parameter of MemoryBarrier.*/
    int GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT = 1;

    /** Accepted by the {@code barriers} parameter of MemoryBarrier.*/
    int GL_ELEMENT_ARRAY_BARRIER_BIT = 2;

    /** Accepted by the {@code barriers} parameter of MemoryBarrier.*/
    int GL_UNIFORM_BARRIER_BIT = 4;

    /** Accepted by the {@code barriers} parameter of MemoryBarrier.*/
    int GL_TEXTURE_FETCH_BARRIER_BIT = 8;

    /** Accepted by the {@code barriers} parameter of MemoryBarrier.*/
    int GL_SHADER_IMAGE_ACCESS_BARRIER_BIT = 32;

    /** Accepted by the {@code barriers} parameter of MemoryBarrier.*/
    int GL_COMMAND_BARRIER_BIT = 64;

    /** Accepted by the {@code barriers} parameter of MemoryBarrier.*/
    int GL_PIXEL_BUFFER_BARRIER_BIT = 128;

    /** Accepted by the {@code barriers} parameter of MemoryBarrier.*/
    int GL_TEXTURE_UPDATE_BARRIER_BIT = 256;

    /** Accepted by the {@code barriers} parameter of MemoryBarrier.*/
    int GL_BUFFER_UPDATE_BARRIER_BIT = 512;

    /** Accepted by the {@code barriers} parameter of MemoryBarrier.*/
    int GL_FRAMEBUFFER_BARRIER_BIT = 1024;

    /** Accepted by the {@code barriers} parameter of MemoryBarrier.*/
    int GL_TRANSFORM_FEEDBACK_BARRIER_BIT = 2048;

    /** Accepted by the {@code barriers} parameter of MemoryBarrier.*/
    int GL_ATOMIC_COUNTER_BARRIER_BIT = 4096;

    /** Accepted by the {@code barriers} parameter of MemoryBarrier.*/
    int GL_ALL_BARRIER_BITS = -1;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_IMAGE_1D = 36940;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_IMAGE_2D = 36941;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_IMAGE_3D = 36942;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_IMAGE_2D_RECT = 36943;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_IMAGE_CUBE = 36944;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_IMAGE_BUFFER = 36945;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_IMAGE_1D_ARRAY = 36946;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_IMAGE_2D_ARRAY = 36947;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_IMAGE_CUBE_MAP_ARRAY = 36948;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_IMAGE_2D_MULTISAMPLE = 36949;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_IMAGE_2D_MULTISAMPLE_ARRAY = 36950;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_IMAGE_1D = 36951;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_IMAGE_2D = 36952;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_IMAGE_3D = 36953;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_IMAGE_2D_RECT = 36954;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_IMAGE_CUBE = 36955;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_IMAGE_BUFFER = 36956;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_IMAGE_1D_ARRAY = 36957;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_IMAGE_2D_ARRAY = 36958;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_IMAGE_CUBE_MAP_ARRAY = 36959;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_IMAGE_2D_MULTISAMPLE = 36960;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_IMAGE_2D_MULTISAMPLE_ARRAY = 36961;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_IMAGE_1D = 36962;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_IMAGE_2D = 36963;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_IMAGE_3D = 36964;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_IMAGE_2D_RECT = 36965;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_IMAGE_CUBE = 36966;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_IMAGE_BUFFER = 36967;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_IMAGE_1D_ARRAY = 36968;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_IMAGE_2D_ARRAY = 36969;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY = 36970;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE = 36971;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY = 36972;

    /** Accepted by the {@code value} parameter of GetTexParameteriv, GetTexParameterfv, GetTexParameterIiv, and GetTexParameterIuiv.*/
    int GL_IMAGE_FORMAT_COMPATIBILITY_TYPE = 37063;

    /** Returned in the {@code data} parameter of GetTexParameteriv, GetTexParameterfv, GetTexParameterIiv, and GetTexParameterIuiv when {@code value} is IMAGE_FORMAT_COMPATIBILITY_TYPE.*/
    int GL_IMAGE_FORMAT_COMPATIBILITY_BY_SIZE = 37064;

    /** Returned in the {@code data} parameter of GetTexParameteriv, GetTexParameterfv, GetTexParameterIiv, and GetTexParameterIuiv when {@code value} is IMAGE_FORMAT_COMPATIBILITY_TYPE.*/
    int GL_IMAGE_FORMAT_COMPATIBILITY_BY_CLASS = 37065;

    /** Accepted by the {@code pname} parameter of GetInternalformativ.*/
    int GL_NUM_SAMPLE_COUNTS = 37760;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MIN_MAP_BUFFER_ALIGNMENT = 37052;

    /** Obtains information about the set of active atomic counter buffers for a program.@param program the name of a program object for which the command {@link GL20C#glLinkProgram LinkProgram} has been issued in the past@param bufferIndex the index of an active atomic counter buffer@param pname the parameter to query. One of:<br><table><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE ATOMIC_COUNTER_BUFFER_DATA_SIZE}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER}</td></tr></table>@param params a buffer in which to place the returned value@see <a href="https://docs.gl/gl4/glGetActiveAtomicCounterBuffer">Reference Page</a>*/
    void glGetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, IntBuffer params);

    /** Obtains information about the set of active atomic counter buffers for a program.@param program the name of a program object for which the command {@link GL20C#glLinkProgram LinkProgram} has been issued in the past@param bufferIndex the index of an active atomic counter buffer@param pname the parameter to query. One of:<br><table><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE ATOMIC_COUNTER_BUFFER_DATA_SIZE}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetActiveAtomicCounterBuffer">Reference Page</a>*/
    int glGetActiveAtomicCounterBufferi(int program, int bufferIndex, int pname);

    /** Simultaneously specifies storage for all levels of a one-dimensional texture.@param target the target of the operation. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>@param levels the number of texture levels@param internalformat the sized internal format to be used to store texture image data@param width the width of the texture, in texels@see <a href="https://docs.gl/gl4/glTexStorage1D">Reference Page</a>*/
    void glTexStorage1D(int target, int levels, int internalformat, int width);

    /** Simultaneously specifies storage for all levels of a two-dimensional or one-dimensional array texture.@param target the target of the operation. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL11#GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr></table>@param levels the number of texture levels@param internalformat the sized internal format to be used to store texture image data@param width the width of the texture, in texels@param height the height of the texture, in texels@see <a href="https://docs.gl/gl4/glTexStorage2D">Reference Page</a>*/
    void glTexStorage2D(int target, int levels, int internalformat, int width, int height);

    /** Simultaneously specifies storage for all levels of a three-dimensional, two-dimensional array or cube-map array texture.@param target the target of the operation. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL12#GL_PROXY_TEXTURE_3D PROXY_TEXTURE_3D}</td></tr><tr><td>{@link GL30#GL_PROXY_TEXTURE_2D_ARRAY PROXY_TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_PROXY_TEXTURE_CUBE_MAP_ARRAY PROXY_TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>@param levels the number of texture levels@param internalformat the sized internal format to be used to store texture image data@param width the width of the texture, in texels@param height the height of the texture, in texels@param depth the depth of the texture, in texels@see <a href="https://docs.gl/gl4/glTexStorage3D">Reference Page</a>*/
    void glTexStorage3D(int target, int levels, int internalformat, int width, int height, int depth);

    /** Renders multiple instances of primitives using a count derived from a transform feedback object.@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param id the name of a transform feedback object from which to retrieve a primitive count@param primcount the number of instances of the geometry to render@see <a href="https://docs.gl/gl4/glDrawTransformFeedbackInstanced">Reference Page</a>*/
    void glDrawTransformFeedbackInstanced(int mode, int id, int primcount);

    /** Renders multiple instances of primitives using a count derived from a specifed stream of a transform feedback object.@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param id the name of a transform feedback object from which to retrieve a primitive count@param stream the index of the transform feedback stream from which to retrieve a primitive count@param primcount the number of instances of the geometry to render@see <a href="https://docs.gl/gl4/glDrawTransformFeedbackStreamInstanced">Reference Page</a>*/
    void glDrawTransformFeedbackStreamInstanced(int mode, int id, int stream, int primcount);

    /** Draws multiple instances of a range of elements with an offset applied to instanced attributes.@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param first the starting index in the enabled arrays@param count the number of indices to be rendered@param primcount the number of instances of the specified range of indices to be rendered@param baseinstance the base instance for use in fetching instanced vertex attributes@see <a href="https://docs.gl/gl4/glDrawArraysInstancedBaseInstance">Reference Page</a>*/
    void glDrawArraysInstancedBaseInstance(int mode, int first, int count, int primcount, int baseinstance);

    /** Draws multiple instances of a set of elements with an offset applied to instanced attributes@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param count the number of elements to be rendered@param type the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param indices a pointer to the location where the indices are stored@param primcount the number of instances of the specified range of indices to be rendered@param baseinstance the base instance for use in fetching instanced vertex attributes@see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseInstance">Reference Page</a>*/
    void glDrawElementsInstancedBaseInstance(int mode, int count, int type, long indices, int primcount, int baseinstance);

    /** Draws multiple instances of a set of elements with an offset applied to instanced attributes@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param type the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param indices a pointer to the location where the indices are stored@param primcount the number of instances of the specified range of indices to be rendered@param baseinstance the base instance for use in fetching instanced vertex attributes@see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseInstance">Reference Page</a>*/
    void glDrawElementsInstancedBaseInstance(int mode, int type, ByteBuffer indices, int primcount, int baseinstance);

    /** Draws multiple instances of a set of elements with an offset applied to instanced attributes@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param indices a pointer to the location where the indices are stored@param primcount the number of instances of the specified range of indices to be rendered@param baseinstance the base instance for use in fetching instanced vertex attributes@see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseInstance">Reference Page</a>*/
    void glDrawElementsInstancedBaseInstance(int mode, ByteBuffer indices, int primcount, int baseinstance);

    /** Draws multiple instances of a set of elements with an offset applied to instanced attributes@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param indices a pointer to the location where the indices are stored@param primcount the number of instances of the specified range of indices to be rendered@param baseinstance the base instance for use in fetching instanced vertex attributes@see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseInstance">Reference Page</a>*/
    void glDrawElementsInstancedBaseInstance(int mode, ShortBuffer indices, int primcount, int baseinstance);

    /** Draws multiple instances of a set of elements with an offset applied to instanced attributes@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param indices a pointer to the location where the indices are stored@param primcount the number of instances of the specified range of indices to be rendered@param baseinstance the base instance for use in fetching instanced vertex attributes@see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseInstance">Reference Page</a>*/
    void glDrawElementsInstancedBaseInstance(int mode, IntBuffer indices, int primcount, int baseinstance);

    /** Renders multiple instances of a set of primitives from array data with a per-element offset.@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param count the number of elements to be rendered@param type the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param indices a pointer to the location where the indices are stored@param primcount the number of instances of the indexed geometry that should be drawn@param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays@param baseinstance the base instance for use in fetching instanced vertex attributes@see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseVertexBaseInstance">Reference Page</a>*/
    void glDrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, long indices, int primcount, int basevertex, int baseinstance);

    /** Renders multiple instances of a set of primitives from array data with a per-element offset.@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param type the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param indices a pointer to the location where the indices are stored@param primcount the number of instances of the indexed geometry that should be drawn@param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays@param baseinstance the base instance for use in fetching instanced vertex attributes@see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseVertexBaseInstance">Reference Page</a>*/
    void glDrawElementsInstancedBaseVertexBaseInstance(int mode, int type, ByteBuffer indices, int primcount, int basevertex, int baseinstance);

    /** Renders multiple instances of a set of primitives from array data with a per-element offset.@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param indices a pointer to the location where the indices are stored@param primcount the number of instances of the indexed geometry that should be drawn@param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays@param baseinstance the base instance for use in fetching instanced vertex attributes@see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseVertexBaseInstance">Reference Page</a>*/
    void glDrawElementsInstancedBaseVertexBaseInstance(int mode, ByteBuffer indices, int primcount, int basevertex, int baseinstance);

    /** Renders multiple instances of a set of primitives from array data with a per-element offset.@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param indices a pointer to the location where the indices are stored@param primcount the number of instances of the indexed geometry that should be drawn@param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays@param baseinstance the base instance for use in fetching instanced vertex attributes@see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseVertexBaseInstance">Reference Page</a>*/
    void glDrawElementsInstancedBaseVertexBaseInstance(int mode, ShortBuffer indices, int primcount, int basevertex, int baseinstance);

    /** Renders multiple instances of a set of primitives from array data with a per-element offset.@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param indices a pointer to the location where the indices are stored@param primcount the number of instances of the indexed geometry that should be drawn@param basevertex a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays@param baseinstance the base instance for use in fetching instanced vertex attributes@see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseVertexBaseInstance">Reference Page</a>*/
    void glDrawElementsInstancedBaseVertexBaseInstance(int mode, IntBuffer indices, int primcount, int basevertex, int baseinstance);

    /** Binds a level of a texture to an image unit.@param unit the index of the image unit to which to bind the texture@param texture the name of the texture to bind to the image unit@param level the level of the texture that is to be bound@param layered whether a layered texture binding is to be established@param layer if {@code layered} is false, specifies the layer of texture to be bound to the image unit. Ignored otherwise.@param access a token indicating the type of access that will be performed on the image@param format the format that the elements of the image will be treated as for the purposes of formatted stores@see <a href="https://docs.gl/gl4/glBindImageTexture">Reference Page</a>*/
    void glBindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format);

    /** Defines a barrier ordering memory transactions.@param barriers the barriers to insert (bitwise combination). One or more of:<br><table><tr><td>{@link GL42C#GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT VERTEX_ATTRIB_ARRAY_BARRIER_BIT}</td><td>{@link GL42C#GL_ELEMENT_ARRAY_BARRIER_BIT ELEMENT_ARRAY_BARRIER_BIT}</td><td>{@link GL42C#GL_UNIFORM_BARRIER_BIT UNIFORM_BARRIER_BIT}</td></tr><tr><td>{@link GL42C#GL_TEXTURE_FETCH_BARRIER_BIT TEXTURE_FETCH_BARRIER_BIT}</td><td>{@link GL42C#GL_SHADER_IMAGE_ACCESS_BARRIER_BIT SHADER_IMAGE_ACCESS_BARRIER_BIT}</td><td>{@link GL42C#GL_COMMAND_BARRIER_BIT COMMAND_BARRIER_BIT}</td></tr><tr><td>{@link GL42C#GL_PIXEL_BUFFER_BARRIER_BIT PIXEL_BUFFER_BARRIER_BIT}</td><td>{@link GL42C#GL_TEXTURE_UPDATE_BARRIER_BIT TEXTURE_UPDATE_BARRIER_BIT}</td><td>{@link GL42C#GL_BUFFER_UPDATE_BARRIER_BIT BUFFER_UPDATE_BARRIER_BIT}</td></tr><tr><td>{@link GL42C#GL_FRAMEBUFFER_BARRIER_BIT FRAMEBUFFER_BARRIER_BIT}</td><td>{@link GL42C#GL_TRANSFORM_FEEDBACK_BARRIER_BIT TRANSFORM_FEEDBACK_BARRIER_BIT}</td><td>{@link GL42C#GL_ATOMIC_COUNTER_BARRIER_BIT ATOMIC_COUNTER_BARRIER_BIT}</td></tr><tr><td>{@link GL42C#GL_ALL_BARRIER_BITS ALL_BARRIER_BITS}</td><td>{@link GL43#GL_SHADER_STORAGE_BARRIER_BIT SHADER_STORAGE_BARRIER_BIT}</td></tr></table>@see <a href="https://docs.gl/gl4/glMemoryBarrier">Reference Page</a>*/
    void glMemoryBarrier(int barriers);

    /** Retrieves information about implementation-dependent support for internal formats.@param target the usage of the internal format. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL30#GL_RENDERBUFFER RENDERBUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>@param internalformat the internal format about which to retrieve information@param pname the type of information to query@param params a variable into which to write the retrieved information@see <a href="https://docs.gl/gl4/glGetInternalformat">Reference Page</a>*/
    void glGetInternalformativ(int target, int internalformat, int pname, IntBuffer params);

    /** Retrieves information about implementation-dependent support for internal formats.@param target the usage of the internal format. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL30#GL_RENDERBUFFER RENDERBUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>@param internalformat the internal format about which to retrieve information@param pname the type of information to query@see <a href="https://docs.gl/gl4/glGetInternalformat">Reference Page</a>*/
    int glGetInternalformati(int target, int internalformat, int pname);

    /** Array version of: {@link #glGetActiveAtomicCounterBufferiv GetActiveAtomicCounterBufferiv}@see <a href="https://docs.gl/gl4/glGetActiveAtomicCounterBuffer">Reference Page</a>*/
    void glGetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, int[] params);

    /** Array version of: {@link #glGetInternalformativ GetInternalformativ}@see <a href="https://docs.gl/gl4/glGetInternalformat">Reference Page</a>*/
    void glGetInternalformativ(int target, int internalformat, int pname, int[] params);

}
