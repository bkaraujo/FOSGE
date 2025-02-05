package br.fosge.runtime.platform.binding.opengl.api;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;

public interface GL33 {

    /** Accepted by the {@code src} and {@code dst} parameters of BlendFunc and BlendFunci, and by the {@code srcRGB}, {@code dstRGB}, {@code srcAlpha} and {@code dstAlpha} parameters of BlendFuncSeparate and BlendFuncSeparatei.*/
    int GL_SRC1_COLOR = 35065;

    /** Accepted by the {@code src} and {@code dst} parameters of BlendFunc and BlendFunci, and by the {@code srcRGB}, {@code dstRGB}, {@code srcAlpha} and {@code dstAlpha} parameters of BlendFuncSeparate and BlendFuncSeparatei.*/
    int GL_ONE_MINUS_SRC1_COLOR = 35066;

    /** Accepted by the {@code src} and {@code dst} parameters of BlendFunc and BlendFunci, and by the {@code srcRGB}, {@code dstRGB}, {@code srcAlpha} and {@code dstAlpha} parameters of BlendFuncSeparate and BlendFuncSeparatei.*/
    int GL_ONE_MINUS_SRC1_ALPHA = 35067;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and GetDoublev.*/
    int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS = 35068;

    /** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv.*/
    int GL_ANY_SAMPLES_PASSED = 35887;

    /** Accepted by the {@code value} parameter of the GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv and GetDoublev functions.*/
    int GL_SAMPLER_BINDING = 35097;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, RenderbufferStorage and RenderbufferStorageMultisample.*/
    int GL_RGB10_A2UI = 36975;

    /** Accepted by the {@code pname} parameters of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameterfv, and GetTexParameteriv.*/
    int GL_TEXTURE_SWIZZLE_R = 36418;

    /** Accepted by the {@code pname} parameters of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameterfv, and GetTexParameteriv.*/
    int GL_TEXTURE_SWIZZLE_G = 36419;

    /** Accepted by the {@code pname} parameters of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameterfv, and GetTexParameteriv.*/
    int GL_TEXTURE_SWIZZLE_B = 36420;

    /** Accepted by the {@code pname} parameters of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameterfv, and GetTexParameteriv.*/
    int GL_TEXTURE_SWIZZLE_A = 36421;

    /** Accepted by the {@code pname} parameters of TexParameteriv,  TexParameterfv, GetTexParameterfv, and GetTexParameteriv.*/
    int GL_TEXTURE_SWIZZLE_RGBA = 36422;

    /** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv.*/
    int GL_TIME_ELAPSED = 35007;

    /** Accepted by the {@code target} parameter of GetQueryiv and QueryCounter. Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_TIMESTAMP = 36392;

    /** Accepted by the {@code pname} parameters of GetVertexAttribdv, GetVertexAttribfv, and GetVertexAttribiv.*/
    int GL_VERTEX_ATTRIB_ARRAY_DIVISOR = 35070;

    /** Accepted by the {@code type} parameter of VertexAttribPointer, VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, TexCoordPointer, VertexAttribP{1234}ui, VertexP*, TexCoordP*, MultiTexCoordP*, NormalP3ui, ColorP*, SecondaryColorP* and VertexAttribP*.*/
    int GL_INT_2_10_10_10_REV = 36255;

    /** Binds a user-defined varying out variable to a fragment shader color number and index.@param program the name of the program containing varying out variable whose binding to modify@param colorNumber the color number to bind the user-defined varying out variable to@param index the index of the color input to bind the user-defined varying out variable to@param name the name of the user-defined varying out variable whose binding to modify@see <a href="https://docs.gl/gl4/glBindFragDataLocationIndexed">Reference Page</a>*/
    void glBindFragDataLocationIndexed(int program, int colorNumber, int index, ByteBuffer name);

    /** Binds a user-defined varying out variable to a fragment shader color number and index.@param program the name of the program containing varying out variable whose binding to modify@param colorNumber the color number to bind the user-defined varying out variable to@param index the index of the color input to bind the user-defined varying out variable to@param name the name of the user-defined varying out variable whose binding to modify@see <a href="https://docs.gl/gl4/glBindFragDataLocationIndexed">Reference Page</a>*/
    void glBindFragDataLocationIndexed(int program, int colorNumber, int index, CharSequence name);

    /** Queries the bindings of color indices to user-defined varying out variables.@param program the name of the program containing varying out variable whose binding to query@param name the name of the user-defined varying out variable whose index to query@see <a href="https://docs.gl/gl4/glGetFragDataIndex">Reference Page</a>*/
    int glGetFragDataIndex(int program, ByteBuffer name);

    /** Queries the bindings of color indices to user-defined varying out variables.@param program the name of the program containing varying out variable whose binding to query@param name the name of the user-defined varying out variable whose index to query@see <a href="https://docs.gl/gl4/glGetFragDataIndex">Reference Page</a>*/
    int glGetFragDataIndex(int program, CharSequence name);

    /** Generates sampler object names.@param samplers a buffer in which the generated sampler object names are stored@see <a href="https://docs.gl/gl4/glGenSamplers">Reference Page</a>*/
    void glGenSamplers(IntBuffer samplers);

    /** Generates sampler object names.@see <a href="https://docs.gl/gl4/glGenSamplers">Reference Page</a>*/
    int glGenSamplers();

    /** Deletes named sampler objects.@param samplers an array of sampler objects to be deleted@see <a href="https://docs.gl/gl4/glDeleteSamplers">Reference Page</a>*/
    void glDeleteSamplers(IntBuffer samplers);

    /** Deletes named sampler objects.@see <a href="https://docs.gl/gl4/glDeleteSamplers">Reference Page</a>*/
    void glDeleteSamplers(int sampler);

    /** Determines if a name corresponds to a sampler object.@param sampler a value that may be the name of a sampler object@see <a href="https://docs.gl/gl4/glIsSampler">Reference Page</a>*/
    boolean glIsSampler(int sampler);

    /** Binds a named sampler to a texturing target.@param unit the index of the texture unit to which the sampler is bound@param sampler the name of a sampler@see <a href="https://docs.gl/gl4/glBindSampler">Reference Page</a>*/
    void glBindSampler(int unit, int sampler);

    /** Set the integer value of a sampler parameter.@param sampler the sampler object whose parameter to modify@param pname the symbolic name of a single-valued sampler parameter. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td></tr><tr><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr></table>@param param the value of {@code pname}@see <a href="https://docs.gl/gl4/glSamplerParameteri">Reference Page</a>*/
    void glSamplerParameteri(int sampler, int pname, int param);

    /** Float version of {@link #glSamplerParameteri SamplerParameteri}.@param sampler the sampler object whose parameter to modify@param pname the symbolic name of a single-valued sampler parameter@param param the value of {@code pname}@see <a href="https://docs.gl/gl4/glSamplerParameterf">Reference Page</a>*/
    void glSamplerParameterf(int sampler, int pname, float param);

    /** Pointer version of {@link #glSamplerParameteri SamplerParameteri}.@param sampler the sampler object whose parameter to modify@param pname the symbolic name of a sampler parameter. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td></tr><tr><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td></tr><tr><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr></table>@param params an array where the value or values of {@code pname} are stored@see <a href="https://docs.gl/gl4/glSamplerParameter">Reference Page</a>*/
    void glSamplerParameteriv(int sampler, int pname, IntBuffer params);

    /** Float version of {@link #glSamplerParameteriv SamplerParameteriv}.@param sampler the sampler object whose parameter to modify@param pname the symbolic name of a sampler parameter@param params an array where the value or values of {@code pname} are stored@see <a href="https://docs.gl/gl4/glSamplerParameter">Reference Page</a>*/
    void glSamplerParameterfv(int sampler, int pname, FloatBuffer params);

    /** Pure integer version of {@link #glSamplerParameteriv SamplerParameteriv}.@param sampler the sampler object whose parameter to modify@param pname the symbolic name of a sampler parameter@param params an array where the value or values of {@code pname} are stored@see <a href="https://docs.gl/gl4/glSamplerParameter">Reference Page</a>*/
    void glSamplerParameterIiv(int sampler, int pname, IntBuffer params);

    /** Unsigned pure integer version of {@link #glSamplerParameteriv SamplerParameteriv}.@param sampler the sampler object whose parameter to modify@param pname the symbolic name of a sampler parameter@param params an array where the value or values of {@code pname} are stored@see <a href="https://docs.gl/gl4/glSamplerParameter">Reference Page</a>*/
    void glSamplerParameterIuiv(int sampler, int pname, IntBuffer params);

    /** Return the integer value(s) of a sampler parameter.@param sampler the name of the sampler object from which to retrieve parameters@param pname the symbolic name of a sampler parameter. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td></tr><tr><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>,</td><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td></tr></table>@param params the sampler parameters@see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>*/
    void glGetSamplerParameteriv(int sampler, int pname, IntBuffer params);

    /** Return the integer value(s) of a sampler parameter.@param sampler the name of the sampler object from which to retrieve parameters@param pname the symbolic name of a sampler parameter. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td></tr><tr><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>,</td><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>*/
    int glGetSamplerParameteri(int sampler, int pname);

    /** Float version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.@param sampler the name of the sampler object from which to retrieve parameters@param pname the symbolic name of a sampler parameter@param params the sampler parameters@see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>*/
    void glGetSamplerParameterfv(int sampler, int pname, FloatBuffer params);

    /** Float version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.@param sampler the name of the sampler object from which to retrieve parameters@param pname the symbolic name of a sampler parameter@see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>*/
    float glGetSamplerParameterf(int sampler, int pname);

    /** Pure integer version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.@param sampler the name of the sampler object from which to retrieve parameters@param pname the symbolic name of a sampler parameter@param params the sampler parameters@see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>*/
    void glGetSamplerParameterIiv(int sampler, int pname, IntBuffer params);

    /** Pure integer version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.@param sampler the name of the sampler object from which to retrieve parameters@param pname the symbolic name of a sampler parameter@see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>*/
    int glGetSamplerParameterIi(int sampler, int pname);

    /** Unsigned pure integer version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.@param sampler the name of the sampler object from which to retrieve parameters@param pname the symbolic name of a sampler parameter@param params the sampler parameters@see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>*/
    void glGetSamplerParameterIuiv(int sampler, int pname, IntBuffer params);

    /** Unsigned pure integer version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.@param sampler the name of the sampler object from which to retrieve parameters@param pname the symbolic name of a sampler parameter@see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>*/
    int glGetSamplerParameterIui(int sampler, int pname);

    /** Records the GL time into a query object after all previous commands have reached the GL server but have not yet necessarily executed.@param id the name of a query object into which to record the GL time@param target the counter to query. Must be:<br><table><tr><td>{@link GL33C#GL_TIMESTAMP TIMESTAMP}</td></tr></table>@see <a href="https://docs.gl/gl4/glQueryCounter">Reference Page</a>*/
    void glQueryCounter(int id, int target);

    /** Returns the 64bit integer value of query object parameter.@param id the name of a query object@param pname the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>@param params the requested data@see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>*/
    void glGetQueryObjecti64v(int id, int pname, LongBuffer params);

    /** Returns the 64bit integer value of query object parameter.@param id the name of a query object@param pname the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>@param params the requested data@see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>*/
    void glGetQueryObjecti64v(int id, int pname, long params);

    /** Returns the 64bit integer value of query object parameter.@param id the name of a query object@param pname the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>*/
    long glGetQueryObjecti64(int id, int pname);

    /** Unsigned version of {@link #glGetQueryObjecti64v GetQueryObjecti64v}.@param id the name of a query object@param pname the symbolic name of a query object parameter@param params the requested data@see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>*/
    void glGetQueryObjectui64v(int id, int pname, LongBuffer params);

    /** Unsigned version of {@link #glGetQueryObjecti64v GetQueryObjecti64v}.@param id the name of a query object@param pname the symbolic name of a query object parameter@param params the requested data@see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>*/
    void glGetQueryObjectui64v(int id, int pname, long params);

    /** Unsigned version of {@link #glGetQueryObjecti64v GetQueryObjecti64v}.@param id the name of a query object@param pname the symbolic name of a query object parameter@see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>*/
    long glGetQueryObjectui64(int id, int pname);

    /** Modifies the rate at which generic vertex attributes advance during instanced rendering.@param index the index of the generic vertex attribute@param divisor the number of instances that will pass between updates of the generic attribute at slot {@code index}@see <a href="https://docs.gl/gl4/glVertexAttribDivisor">Reference Page</a>*/
    void glVertexAttribDivisor(int index, int divisor);

    /** Packed component version of {@link GL11#glVertex2f Vertex2f}.@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param value the packed value@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertexP2ui(int type, int value);

    /** Packed component version of {@link GL11#glVertex3f Vertex3f}.@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param value the packed value@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertexP3ui(int type, int value);

    /** Packed component version of {@link GL11#glVertex4f Vertex4f}.@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param value the packed value@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertexP4ui(int type, int value);

    /** Pointer version of {@link #glVertexP2ui VertexP2ui}.@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param value the packed value@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertexP2uiv(int type, IntBuffer value);

    /** Pointer version of {@link #glVertexP3ui VertexP3ui}.@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param value the packed value@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertexP3uiv(int type, IntBuffer value);

    /** Pointer version of {@link #glVertexP4ui VertexP4ui}.@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param value the packed value@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertexP4uiv(int type, IntBuffer value);

    /** Packed component version of {@link GL11#glTexCoord1f TexCoord1f}.@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param coords the packed value@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoordP1ui(int type, int coords);

    /** Packed component version of {@link GL11#glTexCoord2f TexCoord2f}.@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param coords the packed value@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoordP2ui(int type, int coords);

    /** Packed component version of {@link GL11#glTexCoord3f TexCoord3f}.@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param coords the packed value@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoordP3ui(int type, int coords);

    /** Packed component version of {@link GL11#glTexCoord4f TexCoord4f}.@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param coords the packed value@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoordP4ui(int type, int coords);

    /** Pointer version of {@link #glTexCoordP1ui TexCoordP1ui}.@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param coords the packed value@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoordP1uiv(int type, IntBuffer coords);

    /** Pointer version of {@link #glTexCoordP2ui TexCoordP2ui}.@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param coords the packed value@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoordP2uiv(int type, IntBuffer coords);

    /** Pointer version of {@link #glTexCoordP3ui TexCoordP3ui}.@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param coords the packed value@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoordP3uiv(int type, IntBuffer coords);

    /** Pointer version of {@link #glTexCoordP4ui TexCoordP4ui}.@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param coords the packed value@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoordP4uiv(int type, IntBuffer coords);

    /** Packed component version of {@link GL13#glMultiTexCoord1f MultiTexCoord1f}.@param texture the coordinate set to be modified@param type type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>@param coords the packed value@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoordP1ui(int texture, int type, int coords);

    /** Packed component version of {@link GL13#glMultiTexCoord2f MultiTexCoord2f}.@param texture the coordinate set to be modified@param type type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>@param coords the packed value@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoordP2ui(int texture, int type, int coords);

    /** Packed component version of {@link GL13#glMultiTexCoord3f MultiTexCoord3f}.@param texture the coordinate set to be modified@param type type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>@param coords the packed value@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoordP3ui(int texture, int type, int coords);

    /** Packed component version of {@link GL13#glMultiTexCoord4f MultiTexCoord4f}.@param texture the coordinate set to be modified@param type type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>@param coords the packed value@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoordP4ui(int texture, int type, int coords);

    /** Pointer version of {@link #glMultiTexCoordP1ui MultiTexCoordP1ui}.@param texture the coordinate set to be modified@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param coords the packed value@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoordP1uiv(int texture, int type, IntBuffer coords);

    /** Pointer version of {@link #glMultiTexCoordP2ui MultiTexCoordP2ui}.@param texture the coordinate set to be modified@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param coords the packed value@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoordP2uiv(int texture, int type, IntBuffer coords);

    /** Pointer version of {@link #glMultiTexCoordP3ui MultiTexCoordP3ui}.@param texture the coordinate set to be modified@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param coords the packed value@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoordP3uiv(int texture, int type, IntBuffer coords);

    /** Pointer version of {@link #glMultiTexCoordP4ui MultiTexCoordP4ui}.@param texture the coordinate set to be modified@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param coords the packed value@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoordP4uiv(int texture, int type, IntBuffer coords);

    /** Packed component version of {@link GL11#glNormal3f Normal3f}.@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param coords the packed value@see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNormalP3ui(int type, int coords);

    /** Pointer version {@link #glNormalP3ui NormalP3ui}.@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param coords the packed value@see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNormalP3uiv(int type, IntBuffer coords);

    /** Packed component version of {@link GL11#glColor3f Color3f}.@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param color the packed value@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColorP3ui(int type, int color);

    /** Packed component version of {@link GL11#glColor4f Color4f}.@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param color the packed value@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColorP4ui(int type, int color);

    /** Pointer version of {@link #glColorP3ui ColorP3ui}.@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param color the packed value@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColorP3uiv(int type, IntBuffer color);

    /** Pointer version of {@link #glColorP4ui ColorP4ui}.@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param color the packed value@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColorP4uiv(int type, IntBuffer color);

    /** Packed component version of {@link GL14#glSecondaryColor3f SecondaryColor3f}.@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param color the packed value@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColorP3ui(int type, int color);

    /** Pointer version of {@link #glSecondaryColorP3ui SecondaryColorP3ui}.@param type type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param color the packed value@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColorP3uiv(int type, IntBuffer color);

    /** Packed component version of {@link GL20C#glVertexAttrib1f VertexAttrib1f}.@param index the index of the generic vertex attribute to be modified@param type type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param normalized whether values should be normalized or cast directly to floating-point@param value the packed value@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribP1ui(int index, int type, boolean normalized, int value);

    /** Packed component version of {@link GL20C#glVertexAttrib2f VertexAttrib2f}.@param index the index of the generic vertex attribute to be modified@param type type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param normalized whether values should be normalized or cast directly to floating-point@param value the packed value@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribP2ui(int index, int type, boolean normalized, int value);

    /** Packed component version of {@link GL20C#glVertexAttrib3f VertexAttrib3f}.@param index the index of the generic vertex attribute to be modified@param type type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param normalized whether values should be normalized or cast directly to floating-point@param value the packed value@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribP3ui(int index, int type, boolean normalized, int value);

    /** Packed component version of {@link GL20C#glVertexAttrib4f VertexAttrib4f}.@param index the index of the generic vertex attribute to be modified@param type type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param normalized whether values should be normalized or cast directly to floating-point@param value the packed value@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribP4ui(int index, int type, boolean normalized, int value);

    /** Pointer version of {@link #glVertexAttribP1ui VertexAttribP1ui}.@param index the index of the generic vertex attribute to be modified@param type type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param normalized whether values should be normalized or cast directly to floating-point@param value the packed value@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribP1uiv(int index, int type, boolean normalized, IntBuffer value);

    /** Pointer version of {@link #glVertexAttribP2ui VertexAttribP2ui}.@param index the index of the generic vertex attribute to be modified@param type type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param normalized whether values should be normalized or cast directly to floating-point@param value the packed value@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribP2uiv(int index, int type, boolean normalized, IntBuffer value);

    /** Pointer version of {@link #glVertexAttribP3ui VertexAttribP3ui}.@param index the index of the generic vertex attribute to be modified@param type type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param normalized whether values should be normalized or cast directly to floating-point@param value the packed value@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribP3uiv(int index, int type, boolean normalized, IntBuffer value);

    /** Pointer version of {@link #glVertexAttribP4ui VertexAttribP4ui}.@param index the index of the generic vertex attribute to be modified@param type type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>@param normalized whether values should be normalized or cast directly to floating-point@param value the packed value@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribP4uiv(int index, int type, boolean normalized, IntBuffer value);

    /** Array version of: {@link #glGenSamplers GenSamplers}@see <a href="https://docs.gl/gl4/glGenSamplers">Reference Page</a>*/
    void glGenSamplers(int[] samplers);

    /** Array version of: {@link #glDeleteSamplers DeleteSamplers}@see <a href="https://docs.gl/gl4/glDeleteSamplers">Reference Page</a>*/
    void glDeleteSamplers(int[] samplers);

    /** Array version of: {@link #glSamplerParameteriv SamplerParameteriv}@see <a href="https://docs.gl/gl4/glSamplerParameter">Reference Page</a>*/
    void glSamplerParameteriv(int sampler, int pname, int[] params);

    /** Array version of: {@link #glSamplerParameterfv SamplerParameterfv}@see <a href="https://docs.gl/gl4/glSamplerParameter">Reference Page</a>*/
    void glSamplerParameterfv(int sampler, int pname, float[] params);

    /** Array version of: {@link #glSamplerParameterIiv SamplerParameterIiv}@see <a href="https://docs.gl/gl4/glSamplerParameter">Reference Page</a>*/
    void glSamplerParameterIiv(int sampler, int pname, int[] params);

    /** Array version of: {@link #glSamplerParameterIuiv SamplerParameterIuiv}@see <a href="https://docs.gl/gl4/glSamplerParameter">Reference Page</a>*/
    void glSamplerParameterIuiv(int sampler, int pname, int[] params);

    /** Array version of: {@link #glGetSamplerParameteriv GetSamplerParameteriv}@see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>*/
    void glGetSamplerParameteriv(int sampler, int pname, int[] params);

    /** Array version of: {@link #glGetSamplerParameterfv GetSamplerParameterfv}@see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>*/
    void glGetSamplerParameterfv(int sampler, int pname, float[] params);

    /** Array version of: {@link #glGetSamplerParameterIiv GetSamplerParameterIiv}@see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>*/
    void glGetSamplerParameterIiv(int sampler, int pname, int[] params);

    /** Array version of: {@link #glGetSamplerParameterIuiv GetSamplerParameterIuiv}@see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>*/
    void glGetSamplerParameterIuiv(int sampler, int pname, int[] params);

    /** Array version of: {@link #glGetQueryObjecti64v GetQueryObjecti64v}@see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>*/
    void glGetQueryObjecti64v(int id, int pname, long[] params);

    /** Array version of: {@link #glGetQueryObjectui64v GetQueryObjectui64v}@see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>*/
    void glGetQueryObjectui64v(int id, int pname, long[] params);

    /** Array version of: {@link #glVertexP2uiv VertexP2uiv}@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertexP2uiv(int type, int[] value);

    /** Array version of: {@link #glVertexP3uiv VertexP3uiv}@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertexP3uiv(int type, int[] value);

    /** Array version of: {@link #glVertexP4uiv VertexP4uiv}@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertexP4uiv(int type, int[] value);

    /** Array version of: {@link #glTexCoordP1uiv TexCoordP1uiv}@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoordP1uiv(int type, int[] coords);

    /** Array version of: {@link #glTexCoordP2uiv TexCoordP2uiv}@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoordP2uiv(int type, int[] coords);

    /** Array version of: {@link #glTexCoordP3uiv TexCoordP3uiv}@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoordP3uiv(int type, int[] coords);

    /** Array version of: {@link #glTexCoordP4uiv TexCoordP4uiv}@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoordP4uiv(int type, int[] coords);

    /** Array version of: {@link #glMultiTexCoordP1uiv MultiTexCoordP1uiv}@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoordP1uiv(int texture, int type, int[] coords);

    /** Array version of: {@link #glMultiTexCoordP2uiv MultiTexCoordP2uiv}@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoordP2uiv(int texture, int type, int[] coords);

    /** Array version of: {@link #glMultiTexCoordP3uiv MultiTexCoordP3uiv}@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoordP3uiv(int texture, int type, int[] coords);

    /** Array version of: {@link #glMultiTexCoordP4uiv MultiTexCoordP4uiv}@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoordP4uiv(int texture, int type, int[] coords);

    /** Array version of: {@link #glNormalP3uiv NormalP3uiv}@see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNormalP3uiv(int type, int[] coords);

    /** Array version of: {@link #glColorP3uiv ColorP3uiv}@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColorP3uiv(int type, int[] color);

    /** Array version of: {@link #glColorP4uiv ColorP4uiv}@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColorP4uiv(int type, int[] color);

    /** Array version of: {@link #glSecondaryColorP3uiv SecondaryColorP3uiv}@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColorP3uiv(int type, int[] color);

    /** Array version of: {@link #glVertexAttribP1uiv VertexAttribP1uiv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribP1uiv(int index, int type, boolean normalized, int[] value);

    /** Array version of: {@link #glVertexAttribP2uiv VertexAttribP2uiv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribP2uiv(int index, int type, boolean normalized, int[] value);

    /** Array version of: {@link #glVertexAttribP3uiv VertexAttribP3uiv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribP3uiv(int index, int type, boolean normalized, int[] value);

    /** Array version of: {@link #glVertexAttribP4uiv VertexAttribP4uiv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribP4uiv(int index, int type, boolean normalized, int[] value);

}
