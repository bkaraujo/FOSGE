package br.fosge.engine.runtime.platform.binding.opengl.api;

import org.lwjgl.PointerBuffer;

import java.nio.*;

public interface GL15 {

    /** New token names.*/
    int GL_FOG_COORD_SRC = 33872;

    /** New token names.*/
    int GL_FOG_COORD = 33873;

    /** New token names.*/
    int GL_CURRENT_FOG_COORD = 33875;

    /** New token names.*/
    int GL_FOG_COORD_ARRAY_TYPE = 33876;

    /** New token names.*/
    int GL_FOG_COORD_ARRAY_STRIDE = 33877;

    /** New token names.*/
    int GL_FOG_COORD_ARRAY_POINTER = 33878;

    /** New token names.*/
    int GL_FOG_COORD_ARRAY = 33879;

    /** New token names.*/
    int GL_FOG_COORD_ARRAY_BUFFER_BINDING = 34973;

    /** New token names.*/
    int GL_SRC0_RGB = 34176;

    /** New token names.*/
    int GL_SRC1_RGB = 34177;

    /** New token names.*/
    int GL_SRC2_RGB = 34178;

    /** New token names.*/
    int GL_SRC0_ALPHA = 34184;

    /** New token names.*/
    int GL_SRC1_ALPHA = 34185;

    /** New token names.*/
    int GL_SRC2_ALPHA = 34186;

    /** Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferParameteriv, and GetBufferPointerv.*/
    int GL_ARRAY_BUFFER = 34962;

    /** Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferParameteriv, and GetBufferPointerv.*/
    int GL_ELEMENT_ARRAY_BUFFER = 34963;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_ARRAY_BUFFER_BINDING = 34964;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_ELEMENT_ARRAY_BUFFER_BINDING = 34965;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_VERTEX_ARRAY_BUFFER_BINDING = 34966;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_NORMAL_ARRAY_BUFFER_BINDING = 34967;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_COLOR_ARRAY_BUFFER_BINDING = 34968;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_INDEX_ARRAY_BUFFER_BINDING = 34969;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING = 34970;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_EDGE_FLAG_ARRAY_BUFFER_BINDING = 34971;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING = 34972;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING = 34973;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_WEIGHT_ARRAY_BUFFER_BINDING = 34974;

    /** Accepted by the {@code pname} parameter of GetVertexAttribiv.*/
    int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 34975;

    /** Accepted by the {@code usage} parameter of BufferData.*/
    int GL_STREAM_DRAW = 35040;

    /** Accepted by the {@code usage} parameter of BufferData.*/
    int GL_STREAM_READ = 35041;

    /** Accepted by the {@code usage} parameter of BufferData.*/
    int GL_STREAM_COPY = 35042;

    /** Accepted by the {@code usage} parameter of BufferData.*/
    int GL_STATIC_DRAW = 35044;

    /** Accepted by the {@code usage} parameter of BufferData.*/
    int GL_STATIC_READ = 35045;

    /** Accepted by the {@code usage} parameter of BufferData.*/
    int GL_STATIC_COPY = 35046;

    /** Accepted by the {@code usage} parameter of BufferData.*/
    int GL_DYNAMIC_DRAW = 35048;

    /** Accepted by the {@code usage} parameter of BufferData.*/
    int GL_DYNAMIC_READ = 35049;

    /** Accepted by the {@code usage} parameter of BufferData.*/
    int GL_DYNAMIC_COPY = 35050;

    /** Accepted by the {@code access} parameter of MapBuffer.*/
    int GL_READ_ONLY = 35000;

    /** Accepted by the {@code access} parameter of MapBuffer.*/
    int GL_WRITE_ONLY = 35001;

    /** Accepted by the {@code access} parameter of MapBuffer.*/
    int GL_READ_WRITE = 35002;

    /** Accepted by the {@code pname} parameter of GetBufferParameteriv.*/
    int GL_BUFFER_SIZE = 34660;

    /** Accepted by the {@code pname} parameter of GetBufferParameteriv.*/
    int GL_BUFFER_USAGE = 34661;

    /** Accepted by the {@code pname} parameter of GetBufferParameteriv.*/
    int GL_BUFFER_ACCESS = 35003;

    /** Accepted by the {@code pname} parameter of GetBufferParameteriv.*/
    int GL_BUFFER_MAPPED = 35004;

    /** Accepted by the {@code pname} parameter of GetBufferPointerv.*/
    int GL_BUFFER_MAP_POINTER = 35005;

    /** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv.*/
    int GL_SAMPLES_PASSED = 35092;

    /** Accepted by the {@code pname} parameter of GetQueryiv.*/
    int GL_QUERY_COUNTER_BITS = 34916;

    /** Accepted by the {@code pname} parameter of GetQueryiv.*/
    int GL_CURRENT_QUERY = 34917;

    /** Accepted by the {@code pname} parameter of GetQueryObjectiv and GetQueryObjectuiv.*/
    int GL_QUERY_RESULT = 34918;

    /** Accepted by the {@code pname} parameter of GetQueryObjectiv and GetQueryObjectuiv.*/
    int GL_QUERY_RESULT_AVAILABLE = 34919;

    /** Binds a named buffer object.@param target the target to which the buffer object is bound. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param buffer the name of a buffer object@see <a href="https://docs.gl/gl4/glBindBuffer">Reference Page</a>*/
    void glBindBuffer(int target, int buffer);

    /** Deletes named buffer objects.@param buffers an array of buffer objects to be deleted@see <a href="https://docs.gl/gl4/glDeleteBuffers">Reference Page</a>*/
    void glDeleteBuffers(IntBuffer buffers);

    /** Deletes named buffer objects.@see <a href="https://docs.gl/gl4/glDeleteBuffers">Reference Page</a>*/
    void glDeleteBuffers(int buffer);

    /** Generates buffer object names.@param buffers a buffer in which the generated buffer object names are stored@see <a href="https://docs.gl/gl4/glGenBuffers">Reference Page</a>*/
    void glGenBuffers(IntBuffer buffers);

    /** Generates buffer object names.@see <a href="https://docs.gl/gl4/glGenBuffers">Reference Page</a>*/
    int glGenBuffers();

    /** Determines if a name corresponds to a buffer object.@param buffer a value that may be the name of a buffer object@see <a href="https://docs.gl/gl4/glIsBuffer">Reference Page</a>*/
    boolean glIsBuffer(int buffer);

    /** Creates and initializes a buffer object's data store. <p>{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store. {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The frequency of access may be one of these:</p> <ul> <li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li> <li><em>STATIC</em> - The data store contents will be modified once and used many times.</li> <li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li> </ul> <p>The nature of access may be one of these:</p> <ul> <li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li> <li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li> <li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li> </ul>@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param size the size in bytes of the buffer object's new data store@param usage the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15C#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15C#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15C#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15C#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15C#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15C#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15C#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15C#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15C#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>@see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>*/
    void glBufferData(int target, long size, int usage);

    /** Creates and initializes a buffer object's data store. <p>{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store. {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The frequency of access may be one of these:</p> <ul> <li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li> <li><em>STATIC</em> - The data store contents will be modified once and used many times.</li> <li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li> </ul> <p>The nature of access may be one of these:</p> <ul> <li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li> <li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li> <li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li> </ul>@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param data a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied@param usage the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15C#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15C#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15C#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15C#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15C#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15C#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15C#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15C#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15C#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>@see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>*/
    void glBufferData(int target, ByteBuffer data, int usage);

    /** Creates and initializes a buffer object's data store. <p>{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store. {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The frequency of access may be one of these:</p> <ul> <li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li> <li><em>STATIC</em> - The data store contents will be modified once and used many times.</li> <li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li> </ul> <p>The nature of access may be one of these:</p> <ul> <li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li> <li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li> <li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li> </ul>@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param data a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied@param usage the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15C#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15C#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15C#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15C#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15C#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15C#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15C#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15C#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15C#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>@see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>*/
    void glBufferData(int target, ShortBuffer data, int usage);

    /** Creates and initializes a buffer object's data store. <p>{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store. {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The frequency of access may be one of these:</p> <ul> <li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li> <li><em>STATIC</em> - The data store contents will be modified once and used many times.</li> <li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li> </ul> <p>The nature of access may be one of these:</p> <ul> <li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li> <li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li> <li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li> </ul>@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param data a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied@param usage the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15C#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15C#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15C#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15C#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15C#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15C#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15C#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15C#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15C#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>@see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>*/
    void glBufferData(int target, IntBuffer data, int usage);

    /** Creates and initializes a buffer object's data store. <p>{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store. {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The frequency of access may be one of these:</p> <ul> <li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li> <li><em>STATIC</em> - The data store contents will be modified once and used many times.</li> <li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li> </ul> <p>The nature of access may be one of these:</p> <ul> <li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li> <li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li> <li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li> </ul>@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param data a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied@param usage the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15C#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15C#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15C#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15C#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15C#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15C#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15C#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15C#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15C#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>@see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>*/
    void glBufferData(int target, LongBuffer data, int usage);

    /** Creates and initializes a buffer object's data store. <p>{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store. {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The frequency of access may be one of these:</p> <ul> <li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li> <li><em>STATIC</em> - The data store contents will be modified once and used many times.</li> <li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li> </ul> <p>The nature of access may be one of these:</p> <ul> <li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li> <li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li> <li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li> </ul>@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param data a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied@param usage the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15C#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15C#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15C#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15C#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15C#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15C#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15C#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15C#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15C#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>@see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>*/
    void glBufferData(int target, FloatBuffer data, int usage);

    /** Creates and initializes a buffer object's data store. <p>{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store. {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The frequency of access may be one of these:</p> <ul> <li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li> <li><em>STATIC</em> - The data store contents will be modified once and used many times.</li> <li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li> </ul> <p>The nature of access may be one of these:</p> <ul> <li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li> <li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li> <li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li> </ul>@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param data a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied@param usage the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15C#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15C#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15C#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15C#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15C#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15C#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15C#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15C#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15C#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>@see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>*/
    void glBufferData(int target, DoubleBuffer data, int usage);

    /** Updates a subset of a buffer object's data store.@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes@param data a pointer to the new data that will be copied into the data store@see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>*/
    void glBufferSubData(int target, long offset, ByteBuffer data);

    /** Updates a subset of a buffer object's data store.@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes@param data a pointer to the new data that will be copied into the data store@see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>*/
    void glBufferSubData(int target, long offset, ShortBuffer data);

    /** Updates a subset of a buffer object's data store.@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes@param data a pointer to the new data that will be copied into the data store@see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>*/
    void glBufferSubData(int target, long offset, IntBuffer data);

    /** Updates a subset of a buffer object's data store.@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes@param data a pointer to the new data that will be copied into the data store@see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>*/
    void glBufferSubData(int target, long offset, LongBuffer data);

    /** Updates a subset of a buffer object's data store.@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes@param data a pointer to the new data that will be copied into the data store@see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>*/
    void glBufferSubData(int target, long offset, FloatBuffer data);

    /** Updates a subset of a buffer object's data store.@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes@param data a pointer to the new data that will be copied into the data store@see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>*/
    void glBufferSubData(int target, long offset, DoubleBuffer data);

    /** Returns a subset of a buffer object's data store.@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param offset the offset into the buffer object's data store from which data will be returned, measured in bytes@param data a pointer to the location where buffer object data is returned@see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>*/
    void glGetBufferSubData(int target, long offset, ByteBuffer data);

    /** Returns a subset of a buffer object's data store.@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param offset the offset into the buffer object's data store from which data will be returned, measured in bytes@param data a pointer to the location where buffer object data is returned@see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>*/
    void glGetBufferSubData(int target, long offset, ShortBuffer data);

    /** Returns a subset of a buffer object's data store.@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param offset the offset into the buffer object's data store from which data will be returned, measured in bytes@param data a pointer to the location where buffer object data is returned@see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>*/
    void glGetBufferSubData(int target, long offset, IntBuffer data);

    /** Returns a subset of a buffer object's data store.@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param offset the offset into the buffer object's data store from which data will be returned, measured in bytes@param data a pointer to the location where buffer object data is returned@see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>*/
    void glGetBufferSubData(int target, long offset, LongBuffer data);

    /** Returns a subset of a buffer object's data store.@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param offset the offset into the buffer object's data store from which data will be returned, measured in bytes@param data a pointer to the location where buffer object data is returned@see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>*/
    void glGetBufferSubData(int target, long offset, FloatBuffer data);

    /** Returns a subset of a buffer object's data store.@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param offset the offset into the buffer object's data store from which data will be returned, measured in bytes@param data a pointer to the location where buffer object data is returned@see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>*/
    void glGetBufferSubData(int target, long offset, DoubleBuffer data);

    /** Maps a buffer object's data store. <p><b>LWJGL note</b>: This method comes in 3 flavors:</p> <ol> <li>{@link #glMapBuffer(int, int)} - Calls {@link #glGetBufferParameteriv GetBufferParameteriv} to retrieve the buffer size and a new ByteBuffer instance is always returned.</li> <li>{@link #glMapBuffer(int, int, ByteBuffer)} - Calls {@link #glGetBufferParameteriv GetBufferParameteriv} to retrieve the buffer size and the {@code old_buffer} parameter is reused if not null.</li> <li>{@link #glMapBuffer(int, int, long, ByteBuffer)} - The buffer size is explicitly specified and the {@code old_buffer} parameter is reused if not null. This is the most efficient method.</li> </ol>@param target the target buffer object being mapped. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br><table><tr><td>{@link GL15C#GL_READ_ONLY READ_ONLY}</td><td>{@link GL15C#GL_WRITE_ONLY WRITE_ONLY}</td><td>{@link GL15C#GL_READ_WRITE READ_WRITE}</td></tr></table>@see <a href="https://docs.gl/gl4/glMapBuffer">Reference Page</a>*/
    ByteBuffer glMapBuffer(int target, int access);

    /** Maps a buffer object's data store. <p><b>LWJGL note</b>: This method comes in 3 flavors:</p> <ol> <li>{@link #glMapBuffer(int, int)} - Calls {@link #glGetBufferParameteriv GetBufferParameteriv} to retrieve the buffer size and a new ByteBuffer instance is always returned.</li> <li>{@link #glMapBuffer(int, int, ByteBuffer)} - Calls {@link #glGetBufferParameteriv GetBufferParameteriv} to retrieve the buffer size and the {@code old_buffer} parameter is reused if not null.</li> <li>{@link #glMapBuffer(int, int, long, ByteBuffer)} - The buffer size is explicitly specified and the {@code old_buffer} parameter is reused if not null. This is the most efficient method.</li> </ol>@param target the target buffer object being mapped. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br><table><tr><td>{@link GL15C#GL_READ_ONLY READ_ONLY}</td><td>{@link GL15C#GL_WRITE_ONLY WRITE_ONLY}</td><td>{@link GL15C#GL_READ_WRITE READ_WRITE}</td></tr></table>@see <a href="https://docs.gl/gl4/glMapBuffer">Reference Page</a>*/
    ByteBuffer glMapBuffer(int target, int access, ByteBuffer old_buffer);

    /** Maps a buffer object's data store. <p><b>LWJGL note</b>: This method comes in 3 flavors:</p> <ol> <li>{@link #glMapBuffer(int, int)} - Calls {@link #glGetBufferParameteriv GetBufferParameteriv} to retrieve the buffer size and a new ByteBuffer instance is always returned.</li> <li>{@link #glMapBuffer(int, int, ByteBuffer)} - Calls {@link #glGetBufferParameteriv GetBufferParameteriv} to retrieve the buffer size and the {@code old_buffer} parameter is reused if not null.</li> <li>{@link #glMapBuffer(int, int, long, ByteBuffer)} - The buffer size is explicitly specified and the {@code old_buffer} parameter is reused if not null. This is the most efficient method.</li> </ol>@param target the target buffer object being mapped. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br><table><tr><td>{@link GL15C#GL_READ_ONLY READ_ONLY}</td><td>{@link GL15C#GL_WRITE_ONLY WRITE_ONLY}</td><td>{@link GL15C#GL_READ_WRITE READ_WRITE}</td></tr></table>@see <a href="https://docs.gl/gl4/glMapBuffer">Reference Page</a>*/
    ByteBuffer glMapBuffer(int target, int access, long length, ByteBuffer old_buffer);

    /** Relinquishes the mapping of a buffer object and invalidates the pointer to its data store. <p>Returns TRUE unless data values in the buffer\u2019s data store have become corrupted during the period that the buffer was mapped. Such corruption can be the result of a screen resolution change or other window system-dependent event that causes system heaps such as those for high-performance graphics memory to be discarded. GL implementations must guarantee that such corruption can occur only during the periods that a buffer\u2019s data store is mapped. If such corruption has occurred, UnmapBuffer returns FALSE, and the contents of the buffer\u2019s data store become undefined.</p>@param target the target buffer object being unmapped. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@see <a href="https://docs.gl/gl4/glUnmapBuffer">Reference Page</a>*/
    boolean glUnmapBuffer(int target);

    /** Returns the value of a buffer object parameter.@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param pname the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15C#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15C#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15C#GL_BUFFER_MAPPED BUFFER_MAPPED}</td></tr><tr><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td></tr><tr><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>@param params the requested parameter@see <a href="https://docs.gl/gl4/glGetBufferParameter">Reference Page</a>*/
    void glGetBufferParameteriv(int target, int pname, IntBuffer params);

    /** Returns the value of a buffer object parameter.@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param pname the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15C#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15C#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15C#GL_BUFFER_MAPPED BUFFER_MAPPED}</td></tr><tr><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td></tr><tr><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetBufferParameter">Reference Page</a>*/
    int glGetBufferParameteri(int target, int pname);

    /** Returns the pointer to a mapped buffer object's data store.@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param pname the pointer to be returned. Must be:<br><table><tr><td>{@link GL15C#GL_BUFFER_MAP_POINTER BUFFER_MAP_POINTER}</td></tr></table>@param params the pointer value specified by {@code pname}@see <a href="https://docs.gl/gl4/glGetBufferPointerv">Reference Page</a>*/
    void glGetBufferPointerv(int target, int pname, PointerBuffer params);

    /** Returns the pointer to a mapped buffer object's data store.@param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param pname the pointer to be returned. Must be:<br><table><tr><td>{@link GL15C#GL_BUFFER_MAP_POINTER BUFFER_MAP_POINTER}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetBufferPointerv">Reference Page</a>*/
    long glGetBufferPointer(int target, int pname);

    /** Generates query object names.@param ids a buffer in which the generated query object names are stored@see <a href="https://docs.gl/gl4/glGenQueries">Reference Page</a>*/
    void glGenQueries(IntBuffer ids);

    /** Generates query object names.@see <a href="https://docs.gl/gl4/glGenQueries">Reference Page</a>*/
    int glGenQueries();

    /** Deletes named query objects.@param ids an array of query objects to be deleted@see <a href="https://docs.gl/gl4/glDeleteQueries">Reference Page</a>*/
    void glDeleteQueries(IntBuffer ids);

    /** Deletes named query objects.@see <a href="https://docs.gl/gl4/glDeleteQueries">Reference Page</a>*/
    void glDeleteQueries(int id);

    /** Determine if a name corresponds to a query object.@param id a value that may be the name of a query object@see <a href="https://docs.gl/gl4/glIsQuery">Reference Page</a>*/
    boolean glIsQuery(int id);

    /** Creates a query object and makes it active.@param target the target type of query object established. One of:<br><table><tr><td>{@link GL15C#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>@param id the name of a query object@see <a href="https://docs.gl/gl4/glBeginQuery">Reference Page</a>*/
    void glBeginQuery(int target, int id);

    /** Marks the end of the sequence of commands to be tracked for the active query specified by {@code target}.@param target the query object target. One of:<br><table><tr><td>{@link GL15C#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>@see <a href="https://docs.gl/gl4/glEndQuery">Reference Page</a>*/
    void glEndQuery(int target);

    /** Returns parameters of a query object target.@param target the query object target. One of:<br><table><tr><td>{@link GL15C#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>@param pname the symbolic name of a query object target parameter. One of:<br><table><tr><td>{@link GL15C#GL_QUERY_COUNTER_BITS QUERY_COUNTER_BITS}</td><td>{@link GL15C#GL_CURRENT_QUERY CURRENT_QUERY}</td></tr></table>@param params the requested data@see <a href="https://docs.gl/gl4/glGetQuery">Reference Page</a>*/
    void glGetQueryiv(int target, int pname, IntBuffer params);

    /** Returns parameters of a query object target.@param target the query object target. One of:<br><table><tr><td>{@link GL15C#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>@param pname the symbolic name of a query object target parameter. One of:<br><table><tr><td>{@link GL15C#GL_QUERY_COUNTER_BITS QUERY_COUNTER_BITS}</td><td>{@link GL15C#GL_CURRENT_QUERY CURRENT_QUERY}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetQuery">Reference Page</a>*/
    int glGetQueryi(int target, int pname);

    /** Returns the integer value of a query object parameter.@param id the name of a query object@param pname the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15C#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15C#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>@param params the requested data@see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>*/
    void glGetQueryObjectiv(int id, int pname, IntBuffer params);

    /** Returns the integer value of a query object parameter.@param id the name of a query object@param pname the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15C#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15C#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>@param params the requested data@see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>*/
    void glGetQueryObjectiv(int id, int pname, long params);

    /** Returns the integer value of a query object parameter.@param id the name of a query object@param pname the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15C#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15C#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>*/
    int glGetQueryObjecti(int id, int pname);

    /** Unsigned version of {@link #glGetQueryObjectiv GetQueryObjectiv}.@param id the name of a query object@param pname the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15C#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15C#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>@param params the requested data@see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>*/
    void glGetQueryObjectuiv(int id, int pname, IntBuffer params);

    /** Unsigned version of {@link #glGetQueryObjectiv GetQueryObjectiv}.@param id the name of a query object@param pname the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15C#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15C#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>@param params the requested data@see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>*/
    void glGetQueryObjectuiv(int id, int pname, long params);

    /** Unsigned version of {@link #glGetQueryObjectiv GetQueryObjectiv}.@param id the name of a query object@param pname the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15C#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15C#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>*/
    int glGetQueryObjectui(int id, int pname);

    /** Array version of: {@link #glDeleteBuffers DeleteBuffers}@see <a href="https://docs.gl/gl4/glDeleteBuffers">Reference Page</a>*/
    void glDeleteBuffers(int[] buffers);

    /** Array version of: {@link #glGenBuffers GenBuffers}@see <a href="https://docs.gl/gl4/glGenBuffers">Reference Page</a>*/
    void glGenBuffers(int[] buffers);

    /** Array version of: {@link #glBufferData BufferData}@see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>*/
    void glBufferData(int target, short[] data, int usage);

    /** Array version of: {@link #glBufferData BufferData}@see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>*/
    void glBufferData(int target, int[] data, int usage);

    /** Array version of: {@link #glBufferData BufferData}@see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>*/
    void glBufferData(int target, long[] data, int usage);

    /** Array version of: {@link #glBufferData BufferData}@see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>*/
    void glBufferData(int target, float[] data, int usage);

    /** Array version of: {@link #glBufferData BufferData}@see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>*/
    void glBufferData(int target, double[] data, int usage);

    /** Array version of: {@link #glBufferSubData BufferSubData}@see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>*/
    void glBufferSubData(int target, long offset, short[] data);

    /** Array version of: {@link #glBufferSubData BufferSubData}@see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>*/
    void glBufferSubData(int target, long offset, int[] data);

    /** Array version of: {@link #glBufferSubData BufferSubData}@see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>*/
    void glBufferSubData(int target, long offset, long[] data);

    /** Array version of: {@link #glBufferSubData BufferSubData}@see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>*/
    void glBufferSubData(int target, long offset, float[] data);

    /** Array version of: {@link #glBufferSubData BufferSubData}@see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>*/
    void glBufferSubData(int target, long offset, double[] data);

    /** Array version of: {@link #glGetBufferSubData GetBufferSubData}@see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>*/
    void glGetBufferSubData(int target, long offset, short[] data);

    /** Array version of: {@link #glGetBufferSubData GetBufferSubData}@see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>*/
    void glGetBufferSubData(int target, long offset, int[] data);

    /** Array version of: {@link #glGetBufferSubData GetBufferSubData}@see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>*/
    void glGetBufferSubData(int target, long offset, long[] data);

    /** Array version of: {@link #glGetBufferSubData GetBufferSubData}@see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>*/
    void glGetBufferSubData(int target, long offset, float[] data);

    /** Array version of: {@link #glGetBufferSubData GetBufferSubData}@see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>*/
    void glGetBufferSubData(int target, long offset, double[] data);

    /** Array version of: {@link #glGetBufferParameteriv GetBufferParameteriv}@see <a href="https://docs.gl/gl4/glGetBufferParameter">Reference Page</a>*/
    void glGetBufferParameteriv(int target, int pname, int[] params);

    /** Array version of: {@link #glGenQueries GenQueries}@see <a href="https://docs.gl/gl4/glGenQueries">Reference Page</a>*/
    void glGenQueries(int[] ids);

    /** Array version of: {@link #glDeleteQueries DeleteQueries}@see <a href="https://docs.gl/gl4/glDeleteQueries">Reference Page</a>*/
    void glDeleteQueries(int[] ids);

    /** Array version of: {@link #glGetQueryiv GetQueryiv}@see <a href="https://docs.gl/gl4/glGetQuery">Reference Page</a>*/
    void glGetQueryiv(int target, int pname, int[] params);

    /** Array version of: {@link #glGetQueryObjectiv GetQueryObjectiv}@see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>*/
    void glGetQueryObjectiv(int id, int pname, int[] params);

    /** Array version of: {@link #glGetQueryObjectuiv GetQueryObjectuiv}@see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>*/
    void glGetQueryObjectuiv(int id, int pname, int[] params);

}
