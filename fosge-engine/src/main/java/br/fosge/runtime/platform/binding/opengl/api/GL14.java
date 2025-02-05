package br.fosge.runtime.platform.binding.opengl.api;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryUtil;

import java.nio.*;

public interface GL14 {

    /** Accepted by the {@code pname} parameter of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameteriv, and GetTexParameterfv.*/
    int GL_GENERATE_MIPMAP = 33169;

    /** Accepted by the {@code target} parameter of Hint, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_GENERATE_MIPMAP_HINT = 33170;

    /** Accepted by the {@code sfactor} and {@code dfactor} parameters of BlendFunc.*/
    int GL_CONSTANT_COLOR = 32769;

    /** Accepted by the {@code sfactor} and {@code dfactor} parameters of BlendFunc.*/
    int GL_ONE_MINUS_CONSTANT_COLOR = 32770;

    /** Accepted by the {@code sfactor} and {@code dfactor} parameters of BlendFunc.*/
    int GL_CONSTANT_ALPHA = 32771;

    /** Accepted by the {@code sfactor} and {@code dfactor} parameters of BlendFunc.*/
    int GL_ONE_MINUS_CONSTANT_ALPHA = 32772;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_BLEND_COLOR = 32773;

    /** Accepted by the {@code mode} parameter of BlendEquation.*/
    int GL_FUNC_ADD = 32774;

    /** Accepted by the {@code mode} parameter of BlendEquation.*/
    int GL_MIN = 32775;

    /** Accepted by the {@code mode} parameter of BlendEquation.*/
    int GL_MAX = 32776;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_BLEND_EQUATION = 32777;

    /** Accepted by the {@code mode} parameter of BlendEquation.*/
    int GL_FUNC_SUBTRACT = 32778;

    /** Accepted by the {@code mode} parameter of BlendEquation.*/
    int GL_FUNC_REVERSE_SUBTRACT = 32779;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, CopyTexImage1D and CopyTexImage2D.*/
    int GL_DEPTH_COMPONENT16 = 33189;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, CopyTexImage1D and CopyTexImage2D.*/
    int GL_DEPTH_COMPONENT24 = 33190;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, CopyTexImage1D and CopyTexImage2D.*/
    int GL_DEPTH_COMPONENT32 = 33191;

    /** Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv.*/
    int GL_TEXTURE_DEPTH_SIZE = 34890;

    /** Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, GetTexParameterfv, and GetTexParameteriv.*/
    int GL_DEPTH_TEXTURE_MODE = 34891;

    /** Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, GetTexParameterfv, and GetTexParameteriv.*/
    int GL_TEXTURE_COMPARE_MODE = 34892;

    /** Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, GetTexParameterfv, and GetTexParameteriv.*/
    int GL_TEXTURE_COMPARE_FUNC = 34893;

    /** Accepted by the {@code param} parameter of TexParameterf, TexParameteri, TexParameterfv, and TexParameteriv when the {@code pname} parameter is TEXTURE_COMPARE_MODE.*/
    int GL_COMPARE_R_TO_TEXTURE = 34894;

    /** Accepted by the {@code pname} parameter of Fogi and Fogf.*/
    int GL_FOG_COORDINATE_SOURCE = 33872;

    /** Accepted by the {@code param} parameter of Fogi and Fogf.*/
    int GL_FOG_COORDINATE = 33873;

    /** Accepted by the {@code param} parameter of Fogi and Fogf.*/
    int GL_FRAGMENT_DEPTH = 33874;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_CURRENT_FOG_COORDINATE = 33875;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_FOG_COORDINATE_ARRAY_TYPE = 33876;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_FOG_COORDINATE_ARRAY_STRIDE = 33877;

    /** Accepted by the {@code pname} parameter of GetPointerv.*/
    int GL_FOG_COORDINATE_ARRAY_POINTER = 33878;

    /** Accepted by the {@code array} parameter of EnableClientState and DisableClientState.*/
    int GL_FOG_COORDINATE_ARRAY = 33879;

    /** Accepted by the {@code pname} parameter of PointParameterfARB, and the {@code pname} of Get.*/
    int GL_POINT_SIZE_MIN = 33062;

    /** Accepted by the {@code pname} parameter of PointParameterfARB, and the {@code pname} of Get.*/
    int GL_POINT_SIZE_MAX = 33063;

    /** Accepted by the {@code pname} parameter of PointParameterfARB, and the {@code pname} of Get.*/
    int GL_POINT_FADE_THRESHOLD_SIZE = 33064;

    /** Accepted by the {@code pname} parameter of PointParameterfARB, and the {@code pname} of Get.*/
    int GL_POINT_DISTANCE_ATTENUATION = 33065;

    /** Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_COLOR_SUM = 33880;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_CURRENT_SECONDARY_COLOR = 33881;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_SECONDARY_COLOR_ARRAY_SIZE = 33882;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_SECONDARY_COLOR_ARRAY_TYPE = 33883;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_SECONDARY_COLOR_ARRAY_STRIDE = 33884;

    /** Accepted by the {@code pname} parameter of GetPointerv.*/
    int GL_SECONDARY_COLOR_ARRAY_POINTER = 33885;

    /** Accepted by the {@code array} parameter of EnableClientState and DisableClientState.*/
    int GL_SECONDARY_COLOR_ARRAY = 33886;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_BLEND_DST_RGB = 32968;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_BLEND_SRC_RGB = 32969;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_BLEND_DST_ALPHA = 32970;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_BLEND_SRC_ALPHA = 32971;

    /** Accepted by the {@code sfail}, {@code dpfail}, and {@code dppass} parameter of StencilOp.*/
    int GL_INCR_WRAP = 34055;

    /** Accepted by the {@code sfail}, {@code dpfail}, and {@code dppass} parameter of StencilOp.*/
    int GL_DECR_WRAP = 34056;

    /** Accepted by the {@code target} parameters of GetTexEnvfv, GetTexEnviv, TexEnvi, TexEnvf, Texenviv, and TexEnvfv.*/
    int GL_TEXTURE_FILTER_CONTROL = 34048;

    /** When the {@code target} parameter of GetTexEnvfv, GetTexEnviv, TexEnvi, TexEnvf, TexEnviv, and TexEnvfv is TEXTURE_FILTER_CONTROL, then the value of {@code pname} may be.*/
    int GL_TEXTURE_LOD_BIAS = 34049;

    /** Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_TEXTURE_LOD_BIAS = 34045;

    /** Accepted by the {@code param} parameter of TexParameteri and TexParameterf, and by the {@code params} parameter of TexParameteriv and TexParameterfv, when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T, or TEXTURE_WRAP_R.*/
    int GL_MIRRORED_REPEAT = 33648;

    /** Specifies the constant color C<sub>c</sub> to be used in blending.@param red the red color component@param green the green color component@param blue the blue color component@param alpha the alpha color component@see <a href="https://docs.gl/gl4/glBlendColor">Reference Page</a>*/
    void glBlendColor(float red, float green, float blue, float alpha);

    /** Controls the blend equations used for per-fragment blending.@param mode the blend equation. One of:<br><table><tr><td>{@link GL14C#GL_FUNC_ADD FUNC_ADD}</td><td>{@link GL14C#GL_FUNC_SUBTRACT FUNC_SUBTRACT}</td><td>{@link GL14C#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}</td><td>{@link GL14C#GL_MIN MIN}</td><td>{@link GL14C#GL_MAX MAX}</td></tr></table>@see <a href="https://docs.gl/gl4/glBlendEquation">Reference Page</a>*/
    void glBlendEquation(int mode);

    /** Sets the current fog coordinate.@param coord the fog coordinate value@see <a href="https://docs.gl/gl3/glFogCoordf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glFogCoordf(float coord);

    /** Double version of {@link #glFogCoordf FogCoordf}.@param coord the fog coordinate value@see <a href="https://docs.gl/gl3/glFogCoordd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glFogCoordd(double coord);

    /** Pointer version of {@link #glFogCoordf FogCoordf}.@param coord the fog coordinate value@see <a href="https://docs.gl/gl3/glFogCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glFogCoordfv(FloatBuffer coord);

    /** Pointer version of {@link #glFogCoordd FogCoordd}.@param coord the fog coordinate value@see <a href="https://docs.gl/gl3/glFogCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glFogCoorddv(DoubleBuffer coord);

    /** Specifies the location and organization of a fog coordinate array.@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the fog coordinate array data@see <a href="https://docs.gl/gl3/glFogCoordPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glFogCoordPointer(int type, int stride, ByteBuffer pointer);

    /** Specifies the location and organization of a fog coordinate array.@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the fog coordinate array data@see <a href="https://docs.gl/gl3/glFogCoordPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glFogCoordPointer(int type, int stride, long pointer);

    /** Specifies the location and organization of a fog coordinate array.@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the fog coordinate array data@see <a href="https://docs.gl/gl3/glFogCoordPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glFogCoordPointer(int type, int stride, ShortBuffer pointer);

    /** Specifies the location and organization of a fog coordinate array.@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the fog coordinate array data@see <a href="https://docs.gl/gl3/glFogCoordPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glFogCoordPointer(int type, int stride, FloatBuffer pointer);

    /** Renders multiple sets of primitives from array data.@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>@param first an array of starting indices in the enabled arrays@param count an array of the number of indices to be rendered@see <a href="https://docs.gl/gl4/glMultiDrawArrays">Reference Page</a>*/
    void glMultiDrawArrays(int mode, IntBuffer first, IntBuffer count);

    /** Renders multiple sets of primitives by specifying indices of array data elements. <p><b>LWJGL note</b>: Use {@link MemoryUtil#memAddress} to retrieve pointers to the index buffers.</p>@param mode the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>@param count an array of the elements counts@param type the type of the values in indices. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param indices a pointer to the location where the indices are stored@see <a href="https://docs.gl/gl4/glMultiDrawElements">Reference Page</a>*/
    void glMultiDrawElements(int mode, IntBuffer count, int type, PointerBuffer indices);

    /** Sets the float value of a pointer parameter.@param pname the parameter to set. Must be:<br><table><tr><td>{@link GL14C#GL_POINT_FADE_THRESHOLD_SIZE POINT_FADE_THRESHOLD_SIZE}</td></tr></table>@param param the parameter value@see <a href="https://docs.gl/gl4/glPointParameterf">Reference Page</a>*/
    void glPointParameterf(int pname, float param);

    /** Integer version of {@link #glPointParameterf PointParameterf}.@param pname the parameter to set. Must be:<br><table><tr><td>{@link GL14C#GL_POINT_FADE_THRESHOLD_SIZE POINT_FADE_THRESHOLD_SIZE}</td></tr></table>@param param the parameter value@see <a href="https://docs.gl/gl4/glPointParameteri">Reference Page</a>*/
    void glPointParameteri(int pname, int param);

    /** Pointer version of {@link #glPointParameterf PointParameterf}.@param pname the parameter to set@param params the parameter value@see <a href="https://docs.gl/gl4/glPointParameter">Reference Page</a>*/
    void glPointParameterfv(int pname, FloatBuffer params);

    /** Pointer version of {@link #glPointParameteri PointParameteri}.@param pname the parameter to set@param params the parameter value@see <a href="https://docs.gl/gl4/glPointParameter">Reference Page</a>*/
    void glPointParameteriv(int pname, IntBuffer params);

    /** Sets the R, G, and B components of the current secondary color. The alpha component is set to 1.0.@param red the red component of the current secondary color@param green the green component of the current secondary color@param blue the blue component of the current secondary color@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColor3b(byte red, byte green, byte blue);

    /** Short version of {@link #glSecondaryColor3b SecondaryColor3b}@param red the red component of the current secondary color@param green the green component of the current secondary color@param blue the blue component of the current secondary color@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColor3s(short red, short green, short blue);

    /** Integer version of {@link #glSecondaryColor3b SecondaryColor3b}@param red the red component of the current secondary color@param green the green component of the current secondary color@param blue the blue component of the current secondary color@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColor3i(int red, int green, int blue);

    /** Float version of {@link #glSecondaryColor3b SecondaryColor3b}@param red the red component of the current secondary color@param green the green component of the current secondary color@param blue the blue component of the current secondary color@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColor3f(float red, float green, float blue);

    /** Double version of {@link #glSecondaryColor3b SecondaryColor3b}@param red the red component of the current secondary color@param green the green component of the current secondary color@param blue the blue component of the current secondary color@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColor3d(double red, double green, double blue);

    /** Unsigned version of {@link #glSecondaryColor3b SecondaryColor3b}@param red the red component of the current secondary color@param green the green component of the current secondary color@param blue the blue component of the current secondary color@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColor3ub(byte red, byte green, byte blue);

    /** Unsigned short version of {@link #glSecondaryColor3b SecondaryColor3b}@param red the red component of the current secondary color@param green the green component of the current secondary color@param blue the blue component of the current secondary color@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColor3us(short red, short green, short blue);

    /** Unsigned int version of {@link #glSecondaryColor3b SecondaryColor3b}@param red the red component of the current secondary color@param green the green component of the current secondary color@param blue the blue component of the current secondary color@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColor3ui(int red, int green, int blue);

    /** Byte pointer version of {@link #glSecondaryColor3b SecondaryColor3b}.@param _2 the secondary color buffer@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColor3bv(ByteBuffer v);

    /** Pointer version of {@link #glSecondaryColor3s SecondaryColor3s}.@param _2 the secondary color buffer@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColor3sv(ShortBuffer v);

    /** Pointer version of {@link #glSecondaryColor3i SecondaryColor3i}.@param _2 the secondary color buffer@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColor3iv(IntBuffer v);

    /** Pointer version of {@link #glSecondaryColor3f SecondaryColor3f}.@param _2 the secondary color buffer@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColor3fv(FloatBuffer v);

    /** Pointer version of {@link #glSecondaryColor3d SecondaryColor3d}.@param _2 the secondary color buffer@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColor3dv(DoubleBuffer v);

    /** Pointer version of {@link #glSecondaryColor3ub SecondaryColor3ub}.@param _2 the secondary color buffer@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColor3ubv(ByteBuffer v);

    /** Pointer version of {@link #glSecondaryColor3us SecondaryColor3us}.@param _2 the secondary color buffer@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColor3usv(ShortBuffer v);

    /** Pointer version of {@link #glSecondaryColor3ui SecondaryColor3ui}.@param _2 the secondary color buffer@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColor3uiv(IntBuffer v);

    /** Specifies the location and organization of a secondary color array.@param size the number of values per vertex that are stored in the array, as well as their component ordering. Must be:<br><table><tr><td>3</td></tr></table>@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the secondary color array data@see <a href="https://docs.gl/gl3/glSecondaryColorPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColorPointer(int size, int type, int stride, ByteBuffer pointer);

    /** Specifies the location and organization of a secondary color array.@param size the number of values per vertex that are stored in the array, as well as their component ordering. Must be:<br><table><tr><td>3</td></tr></table>@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the secondary color array data@see <a href="https://docs.gl/gl3/glSecondaryColorPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColorPointer(int size, int type, int stride, long pointer);

    /** Specifies the location and organization of a secondary color array.@param size the number of values per vertex that are stored in the array, as well as their component ordering. Must be:<br><table><tr><td>3</td></tr></table>@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the secondary color array data@see <a href="https://docs.gl/gl3/glSecondaryColorPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColorPointer(int size, int type, int stride, ShortBuffer pointer);

    /** Specifies the location and organization of a secondary color array.@param size the number of values per vertex that are stored in the array, as well as their component ordering. Must be:<br><table><tr><td>3</td></tr></table>@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the secondary color array data@see <a href="https://docs.gl/gl3/glSecondaryColorPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColorPointer(int size, int type, int stride, IntBuffer pointer);

    /** Specifies the location and organization of a secondary color array.@param size the number of values per vertex that are stored in the array, as well as their component ordering. Must be:<br><table><tr><td>3</td></tr></table>@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the secondary color array data@see <a href="https://docs.gl/gl3/glSecondaryColorPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColorPointer(int size, int type, int stride, FloatBuffer pointer);

    /** Specifies pixel arithmetic for RGB and alpha components separately.@param sfactorRGB how the red, green, and blue blending factors are computed. The initial value is GL_ONE.@param dfactorRGB how the red, green, and blue destination blending factors are computed. The initial value is GL_ZERO.@param sfactorAlpha how the alpha source blending factor is computed. The initial value is GL_ONE.@param dfactorAlpha how the alpha destination blending factor is computed. The initial value is GL_ZERO.@see <a href="https://docs.gl/gl4/glBlendFuncSeparate">Reference Page</a>*/
    void glBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha);

    /** Alternate way to set the current raster position. {@code z} is implictly set to 0.@param x the x value@param y the y value@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos2i(int x, int y);

    /** Short version of {@link #glWindowPos2i WindowPos2i}.@param x the x value@param y the y value@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos2s(short x, short y);

    /** Float version of {@link #glWindowPos2i WindowPos2i}.@param x the x value@param y the y value@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos2f(float x, float y);

    /** Double version of {@link #glWindowPos2i WindowPos2i}.@param x the x value@param y the y value@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos2d(double x, double y);

    /** Pointer version of {@link #glWindowPos2i WindowPos2i}.@param p the position value@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos2iv(IntBuffer p);

    /** Pointer version of {@link #glWindowPos2s WindowPos2s}.@param p the position value@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos2sv(ShortBuffer p);

    /** Pointer version of {@link #glWindowPos2f WindowPos2f}.@param p the position value@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos2fv(FloatBuffer p);

    /** Pointer version of {@link #glWindowPos2d WindowPos2d}.@param p the position value@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos2dv(DoubleBuffer p);

    /** Alternate way to set the current raster position.@param x the x value@param y the y value@param z the z value@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos3i(int x, int y, int z);

    /** Short version of {@link #glWindowPos3i WindowPos3i}.@param x the x value@param y the y value@param z the z value@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos3s(short x, short y, short z);

    /** Float version of {@link #glWindowPos3i WindowPos3i}.@param x the x value@param y the y value@param z the z value@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos3f(float x, float y, float z);

    /** Double version of {@link #glWindowPos3i WindowPos3i}.@param x the x value@param y the y value@param z the z value@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos3d(double x, double y, double z);

    /** Pointer version of {@link #glWindowPos3i WindowPos3i}.@param p the position value@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos3iv(IntBuffer p);

    /** Pointer version of {@link #glWindowPos3s WindowPos3s}.@param p the position value@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos3sv(ShortBuffer p);

    /** Pointer version of {@link #glWindowPos3f WindowPos3f}.@param p the position value@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos3fv(FloatBuffer p);

    /** Pointer version of {@link #glWindowPos3d WindowPos3d}.@param p the position value@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos3dv(DoubleBuffer p);

    /** Array version of: {@link #glFogCoordfv FogCoordfv}@see <a href="https://docs.gl/gl3/glFogCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glFogCoordfv(float[] coord);

    /** Array version of: {@link #glFogCoorddv FogCoorddv}@see <a href="https://docs.gl/gl3/glFogCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glFogCoorddv(double[] coord);

    /** Array version of: {@link #glMultiDrawArrays MultiDrawArrays}@see <a href="https://docs.gl/gl4/glMultiDrawArrays">Reference Page</a>*/
    void glMultiDrawArrays(int mode, int[] first, int[] count);

    /** Array version of: {@link #glMultiDrawElements MultiDrawElements}@see <a href="https://docs.gl/gl4/glMultiDrawElements">Reference Page</a>*/
    void glMultiDrawElements(int mode, int[] count, int type, PointerBuffer indices);

    /** Array version of: {@link #glPointParameterfv PointParameterfv}@see <a href="https://docs.gl/gl4/glPointParameter">Reference Page</a>*/
    void glPointParameterfv(int pname, float[] params);

    /** Array version of: {@link #glPointParameteriv PointParameteriv}@see <a href="https://docs.gl/gl4/glPointParameter">Reference Page</a>*/
    void glPointParameteriv(int pname, int[] params);

    /** Array version of: {@link #glSecondaryColor3sv SecondaryColor3sv}@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColor3sv(short[] v);

    /** Array version of: {@link #glSecondaryColor3iv SecondaryColor3iv}@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColor3iv(int[] v);

    /** Array version of: {@link #glSecondaryColor3fv SecondaryColor3fv}@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColor3fv(float[] v);

    /** Array version of: {@link #glSecondaryColor3dv SecondaryColor3dv}@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColor3dv(double[] v);

    /** Array version of: {@link #glSecondaryColor3usv SecondaryColor3usv}@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColor3usv(short[] v);

    /** Array version of: {@link #glSecondaryColor3uiv SecondaryColor3uiv}@see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSecondaryColor3uiv(int[] v);

    /** Array version of: {@link #glWindowPos2iv WindowPos2iv}@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos2iv(int[] p);

    /** Array version of: {@link #glWindowPos2sv WindowPos2sv}@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos2sv(short[] p);

    /** Array version of: {@link #glWindowPos2fv WindowPos2fv}@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos2fv(float[] p);

    /** Array version of: {@link #glWindowPos2dv WindowPos2dv}@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos2dv(double[] p);

    /** Array version of: {@link #glWindowPos3iv WindowPos3iv}@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos3iv(int[] p);

    /** Array version of: {@link #glWindowPos3sv WindowPos3sv}@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos3sv(short[] p);

    /** Array version of: {@link #glWindowPos3fv WindowPos3fv}@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos3fv(float[] p);

    /** Array version of: {@link #glWindowPos3dv WindowPos3dv}@see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glWindowPos3dv(double[] p);

}
