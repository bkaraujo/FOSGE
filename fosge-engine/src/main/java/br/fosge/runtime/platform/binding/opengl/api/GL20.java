package br.fosge.runtime.platform.binding.opengl.api;

import org.lwjgl.PointerBuffer;

import java.nio.*;

public interface GL20 {

    /** Accepted by the {@code name} parameter of GetString.*/
    int GL_SHADING_LANGUAGE_VERSION = 35724;

    /** Accepted by the {@code pname} parameter of GetInteger.*/
    int GL_CURRENT_PROGRAM = 35725;

    /** Accepted by the {@code pname} parameter of GetShaderiv.*/
    int GL_SHADER_TYPE = 35663;

    /** Accepted by the {@code pname} parameter of GetShaderiv.*/
    int GL_DELETE_STATUS = 35712;

    /** Accepted by the {@code pname} parameter of GetShaderiv.*/
    int GL_COMPILE_STATUS = 35713;

    /** Accepted by the {@code pname} parameter of GetShaderiv.*/
    int GL_LINK_STATUS = 35714;

    /** Accepted by the {@code pname} parameter of GetShaderiv.*/
    int GL_VALIDATE_STATUS = 35715;

    /** Accepted by the {@code pname} parameter of GetShaderiv.*/
    int GL_INFO_LOG_LENGTH = 35716;

    /** Accepted by the {@code pname} parameter of GetShaderiv.*/
    int GL_ATTACHED_SHADERS = 35717;

    /** Accepted by the {@code pname} parameter of GetShaderiv.*/
    int GL_ACTIVE_UNIFORMS = 35718;

    /** Accepted by the {@code pname} parameter of GetShaderiv.*/
    int GL_ACTIVE_UNIFORM_MAX_LENGTH = 35719;

    /** Accepted by the {@code pname} parameter of GetShaderiv.*/
    int GL_ACTIVE_ATTRIBUTES = 35721;

    /** Accepted by the {@code pname} parameter of GetShaderiv.*/
    int GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 35722;

    /** Accepted by the {@code pname} parameter of GetShaderiv.*/
    int GL_SHADER_SOURCE_LENGTH = 35720;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_FLOAT_VEC2 = 35664;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_FLOAT_VEC3 = 35665;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_FLOAT_VEC4 = 35666;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_VEC2 = 35667;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_VEC3 = 35668;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_VEC4 = 35669;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_BOOL = 35670;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_BOOL_VEC2 = 35671;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_BOOL_VEC3 = 35672;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_BOOL_VEC4 = 35673;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_FLOAT_MAT2 = 35674;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_FLOAT_MAT3 = 35675;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_FLOAT_MAT4 = 35676;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_SAMPLER_1D = 35677;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_SAMPLER_2D = 35678;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_SAMPLER_3D = 35679;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_SAMPLER_CUBE = 35680;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_SAMPLER_1D_SHADOW = 35681;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_SAMPLER_2D_SHADOW = 35682;

    /** Accepted by the {@code type} argument of CreateShader and returned by the {@code params} parameter of GetShaderiv.*/
    int GL_VERTEX_SHADER = 35633;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_VERTEX_UNIFORM_COMPONENTS = 35658;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_VARYING_FLOATS = 35659;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_VERTEX_ATTRIBS = 34921;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_TEXTURE_IMAGE_UNITS = 34930;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS = 35660;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 35661;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_TEXTURE_COORDS = 34929;

    /** Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_VERTEX_PROGRAM_POINT_SIZE = 34370;

    /** Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_VERTEX_PROGRAM_TWO_SIDE = 34371;

    /** Accepted by the {@code pname} parameter of GetVertexAttrib{dfi}_2.*/
    int GL_VERTEX_ATTRIB_ARRAY_ENABLED = 34338;

    /** Accepted by the {@code pname} parameter of GetVertexAttrib{dfi}_2.*/
    int GL_VERTEX_ATTRIB_ARRAY_SIZE = 34339;

    /** Accepted by the {@code pname} parameter of GetVertexAttrib{dfi}_2.*/
    int GL_VERTEX_ATTRIB_ARRAY_STRIDE = 34340;

    /** Accepted by the {@code pname} parameter of GetVertexAttrib{dfi}_2.*/
    int GL_VERTEX_ATTRIB_ARRAY_TYPE = 34341;

    /** Accepted by the {@code pname} parameter of GetVertexAttrib{dfi}_2.*/
    int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 34922;

    /** Accepted by the {@code pname} parameter of GetVertexAttrib{dfi}_2.*/
    int GL_CURRENT_VERTEX_ATTRIB = 34342;

    /** Accepted by the {@code pname} parameter of GetVertexAttribPointerv.*/
    int GL_VERTEX_ATTRIB_ARRAY_POINTER = 34373;

    /** Accepted by the {@code type} argument of CreateShader and returned by the {@code params} parameter of GetShaderiv.*/
    int GL_FRAGMENT_SHADER = 35632;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = 35657;

    /** Accepted by the {@code target} parameter of Hint and the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_FRAGMENT_SHADER_DERIVATIVE_HINT = 35723;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_DRAW_BUFFERS = 34852;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_DRAW_BUFFER0 = 34853;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_DRAW_BUFFER1 = 34854;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_DRAW_BUFFER2 = 34855;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_DRAW_BUFFER3 = 34856;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_DRAW_BUFFER4 = 34857;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_DRAW_BUFFER5 = 34858;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_DRAW_BUFFER6 = 34859;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_DRAW_BUFFER7 = 34860;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_DRAW_BUFFER8 = 34861;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_DRAW_BUFFER9 = 34862;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_DRAW_BUFFER10 = 34863;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_DRAW_BUFFER11 = 34864;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_DRAW_BUFFER12 = 34865;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_DRAW_BUFFER13 = 34866;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_DRAW_BUFFER14 = 34867;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_DRAW_BUFFER15 = 34868;

    /** Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev, and by the {@code target} parameter of TexEnvi, TexEnviv, TexEnvf, TexEnvfv, GetTexEnviv, and GetTexEnvfv.*/
    int GL_POINT_SPRITE = 34913;

    /** When the {@code target} parameter of TexEnvf, TexEnvfv, TexEnvi, TexEnviv, GetTexEnvfv, or GetTexEnviv is POINT_SPRITE, then the value of {@code pname} may be.*/
    int GL_COORD_REPLACE = 34914;

    /** Accepted by the {@code pname} parameter of PointParameter{if}_2.*/
    int GL_POINT_SPRITE_COORD_ORIGIN = 36000;

    /** Accepted by the {@code param} parameter of PointParameter{if}_2.*/
    int GL_LOWER_LEFT = 36001;

    /** Accepted by the {@code param} parameter of PointParameter{if}_2.*/
    int GL_UPPER_LEFT = 36002;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_BLEND_EQUATION_RGB = 32777;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_BLEND_EQUATION_ALPHA = 34877;

    /** Accepted by the {@code pname} parameter of GetIntegerv.*/
    int GL_STENCIL_BACK_FUNC = 34816;

    /** Accepted by the {@code pname} parameter of GetIntegerv.*/
    int GL_STENCIL_BACK_FAIL = 34817;

    /** Accepted by the {@code pname} parameter of GetIntegerv.*/
    int GL_STENCIL_BACK_PASS_DEPTH_FAIL = 34818;

    /** Accepted by the {@code pname} parameter of GetIntegerv.*/
    int GL_STENCIL_BACK_PASS_DEPTH_PASS = 34819;

    /** Accepted by the {@code pname} parameter of GetIntegerv.*/
    int GL_STENCIL_BACK_REF = 36003;

    /** Accepted by the {@code pname} parameter of GetIntegerv.*/
    int GL_STENCIL_BACK_VALUE_MASK = 36004;

    /** Accepted by the {@code pname} parameter of GetIntegerv.*/
    int GL_STENCIL_BACK_WRITEMASK = 36005;

    /** Creates a program object.@see <a href="https://docs.gl/gl4/glCreateProgram">Reference Page</a>*/
    int glCreateProgram();

    /** Deletes a program object.@param program the program object to be deleted@see <a href="https://docs.gl/gl4/glDeleteProgram">Reference Page</a>*/
    void glDeleteProgram(int program);

    /** Returns {@link GL11#GL_TRUE TRUE} if {@code program} is the name of a program object. If {@code program} is zero, or a non-zero value that is not the name of a program object, IsProgram returns {@link GL11#GL_FALSE FALSE}. No error is generated if program is not a valid program object name.@param program the program object name to query@see <a href="https://docs.gl/gl4/glIsProgram">Reference Page</a>*/
    boolean glIsProgram(int program);

    /** Creates a shader object.@param type the type of shader to be created. One of:<br><table><tr><td>{@link GL20C#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20C#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>@see <a href="https://docs.gl/gl4/glCreateShader">Reference Page</a>*/
    int glCreateShader(int type);

    /** Deletes a shader object.@param shader the shader object to be deleted@see <a href="https://docs.gl/gl4/glDeleteShader">Reference Page</a>*/
    void glDeleteShader(int shader);

    /** Returns {@link GL11#GL_TRUE TRUE} if {@code shader} is the name of a shader object. If {@code shader} is zero, or a nonzero value that is not the name of a shader object, IsShader returns {@link GL11#GL_FALSE FALSE}. No error is generated if shader is not a valid shader object name.@param shader the shader object name to query@see <a href="https://docs.gl/gl4/glIsShader">Reference Page</a>*/
    boolean glIsShader(int shader);

    /** Attaches a shader object to a program object. <p>In order to create a complete shader program, there must be a way to specify the list of things that will be linked together. Program objects provide this mechanism. Shaders that are to be linked together in a program object must first be attached to that program object. glAttachShader attaches the shader object specified by shader to the program object specified by program. This indicates that shader will be included in link operations that will be performed on program.</p> <p>All operations that can be performed on a shader object are valid whether or not the shader object is attached to a program object. It is permissible to attach a shader object to a program object before source code has been loaded into the shader object or before the shader object has been compiled. It is permissible to attach multiple shader objects of the same type because each may contain a portion of the complete shader. It is also permissible to attach a shader object to more than one program object. If a shader object is deleted while it is attached to a program object, it will be flagged for deletion, and deletion will not occur until glDetachShader is called to detach it from all program objects to which it is attached.</p>@param program the program object to which a shader object will be attached@param shader the shader object that is to be attached@see <a href="https://docs.gl/gl4/glAttachShader">Reference Page</a>*/
    void glAttachShader(int program, int shader);

    /** Detaches a shader object from a program object to which it is attached.@param program the program object from which to detach the shader object@param shader the shader object to be detached@see <a href="https://docs.gl/gl4/glDetachShader">Reference Page</a>*/
    void glDetachShader(int program, int shader);

    /** Sets the source code in {@code shader} to the source code in the array of strings specified by {@code strings}. Any source code previously stored in the shader object is completely replaced. The number of strings in the array is specified by {@code count}. If {@code length} is {@code NULL}, each string is assumed to be null terminated. If {@code length} is a value other than {@code NULL}, it points to an array containing a string length for each of the corresponding elements of {@code strings}. Each element in the length array may contain the length of the corresponding string (the null character is not counted as part of the string length) or a value less than 0 to indicate that the string is null terminated. The source code strings are not scanned or parsed at this time; they are simply copied into the specified shader object.@param shader the shader object whose source code is to be replaced@param strings an array of pointers to strings containing the source code to be loaded into the shader@param length an array of string lengths@see <a href="https://docs.gl/gl4/glShaderSource">Reference Page</a>*/
    void glShaderSource(int shader, PointerBuffer strings, IntBuffer length);

    /** Sets the source code in {@code shader} to the source code in the array of strings specified by {@code strings}. Any source code previously stored in the shader object is completely replaced. The number of strings in the array is specified by {@code count}. If {@code length} is {@code NULL}, each string is assumed to be null terminated. If {@code length} is a value other than {@code NULL}, it points to an array containing a string length for each of the corresponding elements of {@code strings}. Each element in the length array may contain the length of the corresponding string (the null character is not counted as part of the string length) or a value less than 0 to indicate that the string is null terminated. The source code strings are not scanned or parsed at this time; they are simply copied into the specified shader object.@param shader the shader object whose source code is to be replaced@param strings an array of pointers to strings containing the source code to be loaded into the shader@see <a href="https://docs.gl/gl4/glShaderSource">Reference Page</a>*/
    void glShaderSource(int shader, CharSequence[] strings);

    /** Sets the source code in {@code shader} to the source code in the array of strings specified by {@code strings}. Any source code previously stored in the shader object is completely replaced. The number of strings in the array is specified by {@code count}. If {@code length} is {@code NULL}, each string is assumed to be null terminated. If {@code length} is a value other than {@code NULL}, it points to an array containing a string length for each of the corresponding elements of {@code strings}. Each element in the length array may contain the length of the corresponding string (the null character is not counted as part of the string length) or a value less than 0 to indicate that the string is null terminated. The source code strings are not scanned or parsed at this time; they are simply copied into the specified shader object.@param shader the shader object whose source code is to be replaced@see <a href="https://docs.gl/gl4/glShaderSource">Reference Page</a>*/
    void glShaderSource(int shader, CharSequence string);

    /** Compiles a shader object.@param shader the shader object to be compiled@see <a href="https://docs.gl/gl4/glCompileShader">Reference Page</a>*/
    void glCompileShader(int shader);

    /** Links a program object.@param program the program object to be linked@see <a href="https://docs.gl/gl4/glLinkProgram">Reference Page</a>*/
    void glLinkProgram(int program);

    /** Installs a program object as part of current rendering state.@param program the program object whose executables are to be used as part of current rendering state@see <a href="https://docs.gl/gl4/glUseProgram">Reference Page</a>*/
    void glUseProgram(int program);

    /** Validates a program object.@param program the program object to be validated@see <a href="https://docs.gl/gl4/glValidateProgram">Reference Page</a>*/
    void glValidateProgram(int program);

    /** Specifies the value of a float uniform variable for the current program object.@param location the location of the uniform variable to be modified@param v0 the uniform value@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform1f(int location, float v0);

    /** Specifies the value of a vec2 uniform variable for the current program object.@param location the location of the uniform variable to be modified@param v0 the uniform x value@param v1 the uniform y value@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform2f(int location, float v0, float v1);

    /** Specifies the value of a vec3 uniform variable for the current program object.@param location the location of the uniform variable to be modified@param v0 the uniform x value@param v1 the uniform y value@param v2 the uniform z value@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform3f(int location, float v0, float v1, float v2);

    /** Specifies the value of a vec4 uniform variable for the current program object.@param location the location of the uniform variable to be modified@param v0 the uniform x value@param v1 the uniform y value@param v2 the uniform z value@param v3 the uniform w value@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform4f(int location, float v0, float v1, float v2, float v3);

    /** Specifies the value of an int uniform variable for the current program object.@param location the location of the uniform variable to be modified@param v0 the uniform value@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform1i(int location, int v0);

    /** Specifies the value of an ivec2 uniform variable for the current program object.@param location the location of the uniform variable to be modified@param v0 the uniform x value@param v1 the uniform y value@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform2i(int location, int v0, int v1);

    /** Specifies the value of an ivec3 uniform variable for the current program object.@param location the location of the uniform variable to be modified@param v0 the uniform x value@param v1 the uniform y value@param v2 the uniform z value@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform3i(int location, int v0, int v1, int v2);

    /** Specifies the value of an ivec4 uniform variable for the current program object.@param location the location of the uniform variable to be modified@param v0 the uniform x value@param v1 the uniform y value@param v2 the uniform z value@param v3 the uniform w value@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform4i(int location, int v0, int v1, int v2, int v3);

    /** Specifies the value of a single float uniform variable or a float uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform1fv(int location, FloatBuffer value);

    /** Specifies the value of a single vec2 uniform variable or a vec2 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform2fv(int location, FloatBuffer value);

    /** Specifies the value of a single vec3 uniform variable or a vec3 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform3fv(int location, FloatBuffer value);

    /** Specifies the value of a single vec4 uniform variable or a vec4 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform4fv(int location, FloatBuffer value);

    /** Specifies the value of a single int uniform variable or a int uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform1iv(int location, IntBuffer value);

    /** Specifies the value of a single ivec2 uniform variable or an ivec2 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform2iv(int location, IntBuffer value);

    /** Specifies the value of a single ivec3 uniform variable or an ivec3 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform3iv(int location, IntBuffer value);

    /** Specifies the value of a single ivec4 uniform variable or an ivec4 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform4iv(int location, IntBuffer value);

    /** Specifies the value of a single mat2 uniform variable or a mat2 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix2fv(int location, boolean transpose, FloatBuffer value);

    /** Specifies the value of a single mat3 uniform variable or a mat3 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix3fv(int location, boolean transpose, FloatBuffer value);

    /** Specifies the value of a single mat4 uniform variable or a mat4 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix4fv(int location, boolean transpose, FloatBuffer value);

    /** Returns a parameter from a shader object.@param shader the shader object to be queried@param pname the object parameter. One of:<br><table><tr><td>{@link GL20C#GL_SHADER_TYPE SHADER_TYPE}</td><td>{@link GL20C#GL_DELETE_STATUS DELETE_STATUS}</td><td>{@link GL20C#GL_COMPILE_STATUS COMPILE_STATUS}</td><td>{@link GL20C#GL_INFO_LOG_LENGTH INFO_LOG_LENGTH}</td><td>{@link GL20C#GL_SHADER_SOURCE_LENGTH SHADER_SOURCE_LENGTH}</td></tr></table>@param params the requested object parameter@see <a href="https://docs.gl/gl4/glGetShader">Reference Page</a>*/
    void glGetShaderiv(int shader, int pname, IntBuffer params);

    /** Returns a parameter from a shader object.@param shader the shader object to be queried@param pname the object parameter. One of:<br><table><tr><td>{@link GL20C#GL_SHADER_TYPE SHADER_TYPE}</td><td>{@link GL20C#GL_DELETE_STATUS DELETE_STATUS}</td><td>{@link GL20C#GL_COMPILE_STATUS COMPILE_STATUS}</td><td>{@link GL20C#GL_INFO_LOG_LENGTH INFO_LOG_LENGTH}</td><td>{@link GL20C#GL_SHADER_SOURCE_LENGTH SHADER_SOURCE_LENGTH}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetShader">Reference Page</a>*/
    int glGetShaderi(int shader, int pname);

    /** Returns a parameter from a program object.@param program the program object to be queried@param pname the object parameter. One of:<br><table><tr><td>{@link GL20C#GL_DELETE_STATUS DELETE_STATUS}</td><td>{@link GL20C#GL_LINK_STATUS LINK_STATUS}</td><td>{@link GL20C#GL_VALIDATE_STATUS VALIDATE_STATUS}</td></tr><tr><td>{@link GL20C#GL_INFO_LOG_LENGTH INFO_LOG_LENGTH}</td><td>{@link GL20C#GL_ATTACHED_SHADERS ATTACHED_SHADERS}</td><td>{@link GL20C#GL_ACTIVE_ATTRIBUTES ACTIVE_ATTRIBUTES}</td></tr><tr><td>{@link GL20C#GL_ACTIVE_ATTRIBUTE_MAX_LENGTH ACTIVE_ATTRIBUTE_MAX_LENGTH}</td><td>{@link GL20C#GL_ACTIVE_UNIFORMS ACTIVE_UNIFORMS}</td><td>{@link GL20C#GL_ACTIVE_UNIFORM_MAX_LENGTH ACTIVE_UNIFORM_MAX_LENGTH}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_MODE TRANSFORM_FEEDBACK_BUFFER_MODE}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_VARYINGS TRANSFORM_FEEDBACK_VARYINGS}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH}</td></tr><tr><td>{@link GL31#GL_ACTIVE_UNIFORM_BLOCKS ACTIVE_UNIFORM_BLOCKS}</td><td>{@link GL31#GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH}</td><td>{@link GL32#GL_GEOMETRY_VERTICES_OUT GEOMETRY_VERTICES_OUT}</td></tr><tr><td>{@link GL32#GL_GEOMETRY_INPUT_TYPE GEOMETRY_INPUT_TYPE}</td><td>{@link GL32#GL_GEOMETRY_OUTPUT_TYPE GEOMETRY_OUTPUT_TYPE}</td><td>{@link GL41#GL_PROGRAM_BINARY_LENGTH PROGRAM_BINARY_LENGTH}</td></tr><tr><td>{@link GL42#GL_ACTIVE_ATOMIC_COUNTER_BUFFERS ACTIVE_ATOMIC_COUNTER_BUFFERS}</td><td>{@link GL43#GL_COMPUTE_WORK_GROUP_SIZE COMPUTE_WORK_GROUP_SIZE}</td></tr></table>@param params the requested object parameter@see <a href="https://docs.gl/gl4/glGetProgram">Reference Page</a>*/
    void glGetProgramiv(int program, int pname, IntBuffer params);

    /** Returns a parameter from a program object.@param program the program object to be queried@param pname the object parameter. One of:<br><table><tr><td>{@link GL20C#GL_DELETE_STATUS DELETE_STATUS}</td><td>{@link GL20C#GL_LINK_STATUS LINK_STATUS}</td><td>{@link GL20C#GL_VALIDATE_STATUS VALIDATE_STATUS}</td></tr><tr><td>{@link GL20C#GL_INFO_LOG_LENGTH INFO_LOG_LENGTH}</td><td>{@link GL20C#GL_ATTACHED_SHADERS ATTACHED_SHADERS}</td><td>{@link GL20C#GL_ACTIVE_ATTRIBUTES ACTIVE_ATTRIBUTES}</td></tr><tr><td>{@link GL20C#GL_ACTIVE_ATTRIBUTE_MAX_LENGTH ACTIVE_ATTRIBUTE_MAX_LENGTH}</td><td>{@link GL20C#GL_ACTIVE_UNIFORMS ACTIVE_UNIFORMS}</td><td>{@link GL20C#GL_ACTIVE_UNIFORM_MAX_LENGTH ACTIVE_UNIFORM_MAX_LENGTH}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_MODE TRANSFORM_FEEDBACK_BUFFER_MODE}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_VARYINGS TRANSFORM_FEEDBACK_VARYINGS}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH}</td></tr><tr><td>{@link GL31#GL_ACTIVE_UNIFORM_BLOCKS ACTIVE_UNIFORM_BLOCKS}</td><td>{@link GL31#GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH}</td><td>{@link GL32#GL_GEOMETRY_VERTICES_OUT GEOMETRY_VERTICES_OUT}</td></tr><tr><td>{@link GL32#GL_GEOMETRY_INPUT_TYPE GEOMETRY_INPUT_TYPE}</td><td>{@link GL32#GL_GEOMETRY_OUTPUT_TYPE GEOMETRY_OUTPUT_TYPE}</td><td>{@link GL41#GL_PROGRAM_BINARY_LENGTH PROGRAM_BINARY_LENGTH}</td></tr><tr><td>{@link GL42#GL_ACTIVE_ATOMIC_COUNTER_BUFFERS ACTIVE_ATOMIC_COUNTER_BUFFERS}</td><td>{@link GL43#GL_COMPUTE_WORK_GROUP_SIZE COMPUTE_WORK_GROUP_SIZE}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetProgram">Reference Page</a>*/
    int glGetProgrami(int program, int pname);

    /** Returns the information log for a shader object.@param shader the shader object whose information log is to be queried@param length the length of the string returned in {@code infoLog} (excluding the null terminator)@param infoLog an array of characters that is used to return the information log@see <a href="https://docs.gl/gl4/glGetShaderInfoLog">Reference Page</a>*/
    void glGetShaderInfoLog(int shader, IntBuffer length, ByteBuffer infoLog);

    /** Returns the information log for a shader object.@param shader the shader object whose information log is to be queried@param maxLength the size of the character buffer for storing the returned information log@see <a href="https://docs.gl/gl4/glGetShaderInfoLog">Reference Page</a>*/
    String glGetShaderInfoLog(int shader, int maxLength);

    /** Returns the information log for a shader object.@param shader the shader object whose information log is to be queried@see <a href="https://docs.gl/gl4/glGetShaderInfoLog">Reference Page</a>*/
    String glGetShaderInfoLog(int shader);

    /** Returns the information log for a program object.@param program the program object whose information log is to be queried@param length the length of the string returned in {@code infoLog} (excluding the null terminator)@param infoLog an array of characters that is used to return the information log@see <a href="https://docs.gl/gl4/glGetProgramInfoLog">Reference Page</a>*/
    void glGetProgramInfoLog(int program, IntBuffer length, ByteBuffer infoLog);

    /** Returns the information log for a program object.@param program the program object whose information log is to be queried@param maxLength the size of the character buffer for storing the returned information log@see <a href="https://docs.gl/gl4/glGetProgramInfoLog">Reference Page</a>*/
    String glGetProgramInfoLog(int program, int maxLength);

    /** Returns the information log for a program object.@param program the program object whose information log is to be queried@see <a href="https://docs.gl/gl4/glGetProgramInfoLog">Reference Page</a>*/
    String glGetProgramInfoLog(int program);

    /** Returns the shader objects attached to a program object.@param program the program object to be queried@param count the number of names actually returned in {@code shaders}@param shaders an array that is used to return the names of attached shader objects@see <a href="https://docs.gl/gl4/glGetAttachedShaders">Reference Page</a>*/
    void glGetAttachedShaders(int program, IntBuffer count, IntBuffer shaders);

    /** Returns the location of a uniform variable.@param program the program object to be queried@param name a null terminated string containing the name of the uniform variable whose location is to be queried@see <a href="https://docs.gl/gl4/glGetUniformLocation">Reference Page</a>*/
    int glGetUniformLocation(int program, ByteBuffer name);

    /** Returns the location of a uniform variable.@param program the program object to be queried@param name a null terminated string containing the name of the uniform variable whose location is to be queried@see <a href="https://docs.gl/gl4/glGetUniformLocation">Reference Page</a>*/
    int glGetUniformLocation(int program, CharSequence name);

    /** Returns information about an active uniform variable for the specified program object.@param program the program object to be queried@param index the index of the uniform variable to be queried@param length the number of characters actually written by OpenGL in the string indicated by {@code name} (excluding the null terminator) if a value other than NULL is passed@param size the size of the uniform variable@param type the data type of the uniform variable@param name a null terminated string containing the name of the uniform variable@see <a href="https://docs.gl/gl4/glGetActiveUniform">Reference Page</a>*/
    void glGetActiveUniform(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name);

    /** Returns information about an active uniform variable for the specified program object.@param program the program object to be queried@param index the index of the uniform variable to be queried@param maxLength the maximum number of characters OpenGL is allowed to write in the character buffer indicated by {@code name}@param size the size of the uniform variable@param type the data type of the uniform variable@see <a href="https://docs.gl/gl4/glGetActiveUniform">Reference Page</a>*/
    String glGetActiveUniform(int program, int index, int maxLength, IntBuffer size, IntBuffer type);

    /** Returns information about an active uniform variable for the specified program object.@param program the program object to be queried@param index the index of the uniform variable to be queried@param size the size of the uniform variable@param type the data type of the uniform variable@see <a href="https://docs.gl/gl4/glGetActiveUniform">Reference Page</a>*/
    String glGetActiveUniform(int program, int index, IntBuffer size, IntBuffer type);

    /** Returns the float value(s) of a uniform variable.@param program the program object to be queried@param location the location of the uniform variable to be queried@param params the value of the specified uniform variable@see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>*/
    void glGetUniformfv(int program, int location, FloatBuffer params);

    /** Returns the float value(s) of a uniform variable.@param program the program object to be queried@param location the location of the uniform variable to be queried@see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>*/
    float glGetUniformf(int program, int location);

    /** Returns the int value(s) of a uniform variable.@param program the program object to be queried@param location the location of the uniform variable to be queried@param params the value of the specified uniform variable@see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>*/
    void glGetUniformiv(int program, int location, IntBuffer params);

    /** Returns the int value(s) of a uniform variable.@param program the program object to be queried@param location the location of the uniform variable to be queried@see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>*/
    int glGetUniformi(int program, int location);

    /** Returns the source code string from a shader object.@param shader the shader object to be queried@param length the length of the string returned in source (excluding the null terminator)@param source an array of characters that is used to return the source code string@see <a href="https://docs.gl/gl4/glGetShaderSource">Reference Page</a>*/
    void glGetShaderSource(int shader, IntBuffer length, ByteBuffer source);

    /** Returns the source code string from a shader object.@param shader the shader object to be queried@param maxLength the size of the character buffer for storing the returned source code string@see <a href="https://docs.gl/gl4/glGetShaderSource">Reference Page</a>*/
    String glGetShaderSource(int shader, int maxLength);

    /** Returns the source code string from a shader object.@param shader the shader object to be queried@see <a href="https://docs.gl/gl4/glGetShaderSource">Reference Page</a>*/
    String glGetShaderSource(int shader);

    /** Specifies the value of a generic vertex attribute. The y and z components are implicitly set to 0.0f and w to 1.0f.@param index the index of the generic vertex attribute to be modified@param v0 the vertex attribute x component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib1f(int index, float v0);

    /** Short version of {@link #glVertexAttrib1f VertexAttrib1f}.@param index the index of the generic vertex attribute to be modified@param v0 the vertex attribute x component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib1s(int index, short v0);

    /** Double version of {@link #glVertexAttrib1f VertexAttrib1f}.@param index the index of the generic vertex attribute to be modified@param v0 the vertex attribute x component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib1d(int index, double v0);

    /** Specifies the value of a generic vertex attribute. The y component is implicitly set to 0.0f and w to 1.0f.@param index the index of the generic vertex attribute to be modified@param v0 the vertex attribute x component@param v1 the vertex attribute y component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib2f(int index, float v0, float v1);

    /** Short version of {@link #glVertexAttrib2f VertexAttrib2f}.@param index the index of the generic vertex attribute to be modified@param v0 the vertex attribute x component@param v1 the vertex attribute y component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib2s(int index, short v0, short v1);

    /** Double version of {@link #glVertexAttrib2f VertexAttrib2f}.@param index the index of the generic vertex attribute to be modified@param v0 the vertex attribute x component@param v1 the vertex attribute y component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib2d(int index, double v0, double v1);

    /** Specifies the value of a generic vertex attribute. The w is implicitly set to 1.0f.@param index the index of the generic vertex attribute to be modified@param v0 the vertex attribute x component@param v1 the vertex attribute y component@param v2 the vertex attribute z component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib3f(int index, float v0, float v1, float v2);

    /** Short version of {@link #glVertexAttrib3f VertexAttrib3f}.@param index the index of the generic vertex attribute to be modified@param v0 the vertex attribute x component@param v1 the vertex attribute y component@param v2 the vertex attribute z component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib3s(int index, short v0, short v1, short v2);

    /** Double version of {@link #glVertexAttrib3f VertexAttrib3f}.@param index the index of the generic vertex attribute to be modified@param v0 the vertex attribute x component@param v1 the vertex attribute y component@param v2 the vertex attribute z component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib3d(int index, double v0, double v1, double v2);

    /** Specifies the value of a generic vertex attribute.@param index the index of the generic vertex attribute to be modified@param v0 the vertex attribute x component@param v1 the vertex attribute y component@param v2 the vertex attribute z component@param v3 the vertex attribute w component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4f(int index, float v0, float v1, float v2, float v3);

    /** Short version of {@link #glVertexAttrib4f VertexAttrib4f}.@param index the index of the generic vertex attribute to be modified@param v0 the vertex attribute x component@param v1 the vertex attribute y component@param v2 the vertex attribute z component@param v3 the vertex attribute w component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4s(int index, short v0, short v1, short v2, short v3);

    /** Double version of {@link #glVertexAttrib4f VertexAttrib4f}.@param index the index of the generic vertex attribute to be modified@param v0 the vertex attribute x component@param v1 the vertex attribute y component@param v2 the vertex attribute z component@param v3 the vertex attribute w component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4d(int index, double v0, double v1, double v2, double v3);

    /** Normalized unsigned byte version of {@link #glVertexAttrib4f VertexAttrib4f}.@param index the index of the generic vertex attribute to be modified@param x the vertex attribute x component@param y the vertex attribute y component@param z the vertex attribute z component@param w the vertex attribute w component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4Nub(int index, byte x, byte y, byte z, byte w);

    /** Pointer version of {@link #glVertexAttrib1f VertexAttrib1f}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib1fv(int index, FloatBuffer v);

    /** Pointer version of {@link #glVertexAttrib1s VertexAttrib1s}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib1sv(int index, ShortBuffer v);

    /** Pointer version of {@link #glVertexAttrib1d VertexAttrib1d}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib1dv(int index, DoubleBuffer v);

    /** Pointer version of {@link #glVertexAttrib2f VertexAttrib2f}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib2fv(int index, FloatBuffer v);

    /** Pointer version of {@link #glVertexAttrib2s VertexAttrib2s}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib2sv(int index, ShortBuffer v);

    /** Pointer version of {@link #glVertexAttrib2d VertexAttrib2d}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib2dv(int index, DoubleBuffer v);

    /** Pointer version of {@link #glVertexAttrib3f VertexAttrib3f}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib3fv(int index, FloatBuffer v);

    /** Pointer version of {@link #glVertexAttrib3s VertexAttrib3s}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib3sv(int index, ShortBuffer v);

    /** Pointer version of {@link #glVertexAttrib3d VertexAttrib3d}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib3dv(int index, DoubleBuffer v);

    /** Pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4fv(int index, FloatBuffer v);

    /** Pointer version of {@link #glVertexAttrib4s VertexAttrib4s}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4sv(int index, ShortBuffer v);

    /** Pointer version of {@link #glVertexAttrib4d VertexAttrib4d}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4dv(int index, DoubleBuffer v);

    /** Integer pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4iv(int index, IntBuffer v);

    /** Byte pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4bv(int index, ByteBuffer v);

    /** Pointer version of {@link #glVertexAttrib4Nub VertexAttrib4Nub}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4ubv(int index, ByteBuffer v);

    /** Unsigned short pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4usv(int index, ShortBuffer v);

    /** Unsigned int pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4uiv(int index, IntBuffer v);

    /** Normalized byte pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4Nbv(int index, ByteBuffer v);

    /** Normalized short pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4Nsv(int index, ShortBuffer v);

    /** Normalized int pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4Niv(int index, IntBuffer v);

    /** Normalized unsigned byte pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4Nubv(int index, ByteBuffer v);

    /** Normalized unsigned short pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4Nusv(int index, ShortBuffer v);

    /** Normalized unsigned int pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4Nuiv(int index, IntBuffer v);

    /** Specifies the location and organization of a vertex attribute array.@param index the index of the generic vertex attribute to be modified@param size the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>@param type the data type of each component in the array. The initial value is GL_FLOAT. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL41#GL_FIXED FIXED}</td></tr></table>@param normalized whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed@param stride the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in                   the array. The initial value is 0.@param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer                   currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.@see <a href="https://docs.gl/gl4/glVertexAttribPointer">Reference Page</a>*/
    void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ByteBuffer pointer);

    /** Specifies the location and organization of a vertex attribute array.@param index the index of the generic vertex attribute to be modified@param size the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>@param type the data type of each component in the array. The initial value is GL_FLOAT. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL41#GL_FIXED FIXED}</td></tr></table>@param normalized whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed@param stride the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in                   the array. The initial value is 0.@param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer                   currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.@see <a href="https://docs.gl/gl4/glVertexAttribPointer">Reference Page</a>*/
    void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer);

    /** Specifies the location and organization of a vertex attribute array.@param index the index of the generic vertex attribute to be modified@param size the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>@param type the data type of each component in the array. The initial value is GL_FLOAT. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL41#GL_FIXED FIXED}</td></tr></table>@param normalized whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed@param stride the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in                   the array. The initial value is 0.@param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer                   currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.@see <a href="https://docs.gl/gl4/glVertexAttribPointer">Reference Page</a>*/
    void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ShortBuffer pointer);

    /** Specifies the location and organization of a vertex attribute array.@param index the index of the generic vertex attribute to be modified@param size the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>@param type the data type of each component in the array. The initial value is GL_FLOAT. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL41#GL_FIXED FIXED}</td></tr></table>@param normalized whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed@param stride the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in                   the array. The initial value is 0.@param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer                   currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.@see <a href="https://docs.gl/gl4/glVertexAttribPointer">Reference Page</a>*/
    void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, IntBuffer pointer);

    /** Specifies the location and organization of a vertex attribute array.@param index the index of the generic vertex attribute to be modified@param size the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>@param type the data type of each component in the array. The initial value is GL_FLOAT. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL41#GL_FIXED FIXED}</td></tr></table>@param normalized whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed@param stride the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in                   the array. The initial value is 0.@param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer                   currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.@see <a href="https://docs.gl/gl4/glVertexAttribPointer">Reference Page</a>*/
    void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, FloatBuffer pointer);

    /** Enables a generic vertex attribute array.@param index the index of the generic vertex attribute to be enabled@see <a href="https://docs.gl/gl4/glEnableVertexAttribArray">Reference Page</a>*/
    void glEnableVertexAttribArray(int index);

    /** Disables a generic vertex attribute array.@param index the index of the generic vertex attribute to be disabled@see <a href="https://docs.gl/gl4/glDisableVertexAttribArray">Reference Page</a>*/
    void glDisableVertexAttribArray(int index);

    /** Associates a generic vertex attribute index with a named attribute variable.@param program the program object in which the association is to be made@param index the index of the generic vertex attribute to be bound@param name a null terminated string containing the name of the vertex shader attribute variable to which {@code index} is to be bound@see <a href="https://docs.gl/gl4/glBindAttribLocation">Reference Page</a>*/
    void glBindAttribLocation(int program, int index, ByteBuffer name);

    /** Associates a generic vertex attribute index with a named attribute variable.@param program the program object in which the association is to be made@param index the index of the generic vertex attribute to be bound@param name a null terminated string containing the name of the vertex shader attribute variable to which {@code index} is to be bound@see <a href="https://docs.gl/gl4/glBindAttribLocation">Reference Page</a>*/
    void glBindAttribLocation(int program, int index, CharSequence name);

    /** Returns information about an active attribute variable for the specified program object.@param program the program object to be queried@param index the index of the attribute variable to be queried@param length the number of characters actually written by OpenGL in the string indicated by {@code name} (excluding the null terminator) if a value other than                {@code NULL} is passed@param size the size of the attribute variable@param type the data type of the attribute variable@param name a null terminated string containing the name of the attribute variable@see <a href="https://docs.gl/gl4/glGetActiveAttrib">Reference Page</a>*/
    void glGetActiveAttrib(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name);

    /** Returns information about an active attribute variable for the specified program object.@param program the program object to be queried@param index the index of the attribute variable to be queried@param maxLength the maximum number of characters OpenGL is allowed to write in the character buffer indicated by {@code name}@param size the size of the attribute variable@param type the data type of the attribute variable@see <a href="https://docs.gl/gl4/glGetActiveAttrib">Reference Page</a>*/
    String glGetActiveAttrib(int program, int index, int maxLength, IntBuffer size, IntBuffer type);

    /** Returns information about an active attribute variable for the specified program object.@param program the program object to be queried@param index the index of the attribute variable to be queried@param size the size of the attribute variable@param type the data type of the attribute variable@see <a href="https://docs.gl/gl4/glGetActiveAttrib">Reference Page</a>*/
    String glGetActiveAttrib(int program, int index, IntBuffer size, IntBuffer type);

    /** Returns the location of an attribute variable.@param program the program object to be queried@param name a null terminated string containing the name of the attribute variable whose location is to be queried@see <a href="https://docs.gl/gl4/glGetAttribLocation">Reference Page</a>*/
    int glGetAttribLocation(int program, ByteBuffer name);

    /** Returns the location of an attribute variable.@param program the program object to be queried@param name a null terminated string containing the name of the attribute variable whose location is to be queried@see <a href="https://docs.gl/gl4/glGetAttribLocation">Reference Page</a>*/
    int glGetAttribLocation(int program, CharSequence name);

    /** Returns the integer value of a generic vertex attribute parameter.@param index the generic vertex attribute parameter to be queried@param pname the symbolic name of the vertex attribute parameter to be queried. One of:<br><table><tr><td>{@link GL15#GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING VERTEX_ATTRIB_ARRAY_BUFFER_BINDING}</td><td>{@link GL20C#GL_VERTEX_ATTRIB_ARRAY_ENABLED VERTEX_ATTRIB_ARRAY_ENABLED}</td></tr><tr><td>{@link GL20C#GL_VERTEX_ATTRIB_ARRAY_SIZE VERTEX_ATTRIB_ARRAY_SIZE}</td><td>{@link GL20C#GL_VERTEX_ATTRIB_ARRAY_STRIDE VERTEX_ATTRIB_ARRAY_STRIDE}</td></tr><tr><td>{@link GL20C#GL_VERTEX_ATTRIB_ARRAY_TYPE VERTEX_ATTRIB_ARRAY_TYPE}</td><td>{@link GL20C#GL_VERTEX_ATTRIB_ARRAY_NORMALIZED VERTEX_ATTRIB_ARRAY_NORMALIZED}</td></tr><tr><td>{@link GL20C#GL_CURRENT_VERTEX_ATTRIB CURRENT_VERTEX_ATTRIB}</td><td>{@link GL30#GL_VERTEX_ATTRIB_ARRAY_INTEGER VERTEX_ATTRIB_ARRAY_INTEGER}</td></tr><tr><td>{@link GL33#GL_VERTEX_ATTRIB_ARRAY_DIVISOR VERTEX_ATTRIB_ARRAY_DIVISOR}</td></tr></table>@param params returns the requested data@see <a href="https://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>*/
    void glGetVertexAttribiv(int index, int pname, IntBuffer params);

    /** Returns the integer value of a generic vertex attribute parameter.@param index the generic vertex attribute parameter to be queried@param pname the symbolic name of the vertex attribute parameter to be queried. One of:<br><table><tr><td>{@link GL15#GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING VERTEX_ATTRIB_ARRAY_BUFFER_BINDING}</td><td>{@link GL20C#GL_VERTEX_ATTRIB_ARRAY_ENABLED VERTEX_ATTRIB_ARRAY_ENABLED}</td></tr><tr><td>{@link GL20C#GL_VERTEX_ATTRIB_ARRAY_SIZE VERTEX_ATTRIB_ARRAY_SIZE}</td><td>{@link GL20C#GL_VERTEX_ATTRIB_ARRAY_STRIDE VERTEX_ATTRIB_ARRAY_STRIDE}</td></tr><tr><td>{@link GL20C#GL_VERTEX_ATTRIB_ARRAY_TYPE VERTEX_ATTRIB_ARRAY_TYPE}</td><td>{@link GL20C#GL_VERTEX_ATTRIB_ARRAY_NORMALIZED VERTEX_ATTRIB_ARRAY_NORMALIZED}</td></tr><tr><td>{@link GL20C#GL_CURRENT_VERTEX_ATTRIB CURRENT_VERTEX_ATTRIB}</td><td>{@link GL30#GL_VERTEX_ATTRIB_ARRAY_INTEGER VERTEX_ATTRIB_ARRAY_INTEGER}</td></tr><tr><td>{@link GL33#GL_VERTEX_ATTRIB_ARRAY_DIVISOR VERTEX_ATTRIB_ARRAY_DIVISOR}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>*/
    int glGetVertexAttribi(int index, int pname);

    /** Float version of {@link #glGetVertexAttribiv GetVertexAttribiv}.@param index the generic vertex attribute parameter to be queried@param pname the symbolic name of the vertex attribute parameter to be queried@param params returns the requested data@see <a href="https://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>*/
    void glGetVertexAttribfv(int index, int pname, FloatBuffer params);

    /** Double version of {@link #glGetVertexAttribiv GetVertexAttribiv}.@param index the generic vertex attribute parameter to be queried@param pname the symbolic name of the vertex attribute parameter to be queried@param params returns the requested data@see <a href="https://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>*/
    void glGetVertexAttribdv(int index, int pname, DoubleBuffer params);

    /** Returns the address of the specified generic vertex attribute pointer.@param index the generic vertex attribute parameter to be queried@param pname the symbolic name of the generic vertex attribute parameter to be returned. Must be:<br><table><tr><td>{@link GL20C#GL_VERTEX_ATTRIB_ARRAY_POINTER VERTEX_ATTRIB_ARRAY_POINTER}</td></tr></table>@param pointer the pointer value@see <a href="https://docs.gl/gl4/glGetVertexAttribPointerv">Reference Page</a>*/
    void glGetVertexAttribPointerv(int index, int pname, PointerBuffer pointer);

    /** Returns the address of the specified generic vertex attribute pointer.@param index the generic vertex attribute parameter to be queried@param pname the symbolic name of the generic vertex attribute parameter to be returned. Must be:<br><table><tr><td>{@link GL20C#GL_VERTEX_ATTRIB_ARRAY_POINTER VERTEX_ATTRIB_ARRAY_POINTER}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetVertexAttribPointerv">Reference Page</a>*/
    long glGetVertexAttribPointer(int index, int pname);

    /** Specifies a list of color buffers to be drawn into.@param bufs an array of symbolic constants specifying the buffers into which fragment colors or data values will be written. One of:<br><table><tr><td>{@link GL11#GL_NONE NONE}</td><td>{@link GL11#GL_FRONT_LEFT FRONT_LEFT}</td><td>{@link GL11#GL_FRONT_RIGHT FRONT_RIGHT}</td><td>{@link GL11#GL_BACK_LEFT BACK_LEFT}</td><td>{@link GL11#GL_BACK_RIGHT BACK_RIGHT}</td><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td></tr><tr><td>GL30.GL_COLOR_ATTACHMENT[1-15]</td></tr></table>@see <a href="https://docs.gl/gl4/glDrawBuffers">Reference Page</a>*/
    void glDrawBuffers(IntBuffer bufs);

    /** Specifies a list of color buffers to be drawn into.@see <a href="https://docs.gl/gl4/glDrawBuffers">Reference Page</a>*/
    void glDrawBuffers(int buf);

    /** Sets the RGB blend equation and the alpha blend equation separately.@param modeRGB the RGB blend equation, how the red, green, and blue components of the source and destination colors are combined. One of:<br><table><tr><td>{@link GL14#GL_FUNC_ADD FUNC_ADD}</td><td>{@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}</td><td>{@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}</td><td>{@link GL14#GL_MIN MIN}</td><td>{@link GL14#GL_MAX MAX}</td></tr></table>@param modeAlpha the alpha blend equation, how the alpha component of the source and destination colors are combined@see <a href="https://docs.gl/gl4/glBlendEquationSeparate">Reference Page</a>*/
    void glBlendEquationSeparate(int modeRGB, int modeAlpha);

    /** Sets front and/or back stencil test actions.@param face whether front and/or back stencil state is updated. One of:<br><table><tr><td>{@link GL11#GL_FRONT FRONT}</td><td>{@link GL11#GL_BACK BACK}</td><td>{@link GL11#GL_FRONT_AND_BACK FRONT_AND_BACK}</td></tr></table>@param sfail the action to take when the stencil test fails. The initial value is GL_KEEP. One of:<br><table><tr><td>{@link GL11#GL_KEEP KEEP}</td><td>{@link GL11#GL_ZERO ZERO}</td><td>{@link GL11#GL_REPLACE REPLACE}</td><td>{@link GL11#GL_INCR INCR}</td><td>{@link GL14#GL_INCR_WRAP INCR_WRAP}</td><td>{@link GL11#GL_DECR DECR}</td><td>{@link GL14#GL_DECR_WRAP DECR_WRAP}</td><td>{@link GL11#GL_INVERT INVERT}</td></tr></table>@param dpfail the stencil action when the stencil test passes, but the depth test fails. The initial value is GL_KEEP@param dppass the stencil action when both the stencil test and the depth test pass, or when the stencil test passes and either there is no depth buffer or depth               testing is not enabled. The initial value is GL_KEEP@see <a href="https://docs.gl/gl4/glStencilOpSeparate">Reference Page</a>*/
    void glStencilOpSeparate(int face, int sfail, int dpfail, int dppass);

    /** Sets front and/or back function and reference value for stencil testing.@param face whether front and/or back stencil state is updated. One of:<br><table><tr><td>{@link GL11#GL_FRONT FRONT}</td><td>{@link GL11#GL_BACK BACK}</td><td>{@link GL11#GL_FRONT_AND_BACK FRONT_AND_BACK}</td></tr></table>@param func the test function. The initial value is GL_ALWAYS. One of:<br><table><tr><td>{@link GL11#GL_NEVER NEVER}</td><td>{@link GL11#GL_LESS LESS}</td><td>{@link GL11#GL_LEQUAL LEQUAL}</td><td>{@link GL11#GL_GREATER GREATER}</td><td>{@link GL11#GL_GEQUAL GEQUAL}</td><td>{@link GL11#GL_EQUAL EQUAL}</td><td>{@link GL11#GL_NOTEQUAL NOTEQUAL}</td><td>{@link GL11#GL_ALWAYS ALWAYS}</td></tr></table>@param ref the reference value for the stencil test. {@code ref} is clamped to the range [0, 2n &ndash; 1], where {@code n} is the number of bitplanes in the stencil             buffer. The initial value is 0.@param mask a mask that is ANDed with both the reference value and the stored stencil value when the test is done. The initial value is all 1's.@see <a href="https://docs.gl/gl4/glStencilFuncSeparate">Reference Page</a>*/
    void glStencilFuncSeparate(int face, int func, int ref, int mask);

    /** Controls the front and/or back writing of individual bits in the stencil planes.@param face whether front and/or back stencil writemask is updated. One of:<br><table><tr><td>{@link GL11#GL_FRONT FRONT}</td><td>{@link GL11#GL_BACK BACK}</td><td>{@link GL11#GL_FRONT_AND_BACK FRONT_AND_BACK}</td></tr></table>@param mask a bit mask to enable and disable writing of individual bits in the stencil planes. Initially, the mask is all 1's.@see <a href="https://docs.gl/gl4/glStencilMaskSeparate">Reference Page</a>*/
    void glStencilMaskSeparate(int face, int mask);

    /** Array version of: {@link #glShaderSource ShaderSource}@see <a href="https://docs.gl/gl4/glShaderSource">Reference Page</a>*/
    void glShaderSource(int shader, PointerBuffer strings, int[] length);

    /** Array version of: {@link #glUniform1fv Uniform1fv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform1fv(int location, float[] value);

    /** Array version of: {@link #glUniform2fv Uniform2fv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform2fv(int location, float[] value);

    /** Array version of: {@link #glUniform3fv Uniform3fv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform3fv(int location, float[] value);

    /** Array version of: {@link #glUniform4fv Uniform4fv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform4fv(int location, float[] value);

    /** Array version of: {@link #glUniform1iv Uniform1iv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform1iv(int location, int[] value);

    /** Array version of: {@link #glUniform2iv Uniform2iv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform2iv(int location, int[] value);

    /** Array version of: {@link #glUniform3iv Uniform3iv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform3iv(int location, int[] value);

    /** Array version of: {@link #glUniform4iv Uniform4iv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform4iv(int location, int[] value);

    /** Array version of: {@link #glUniformMatrix2fv UniformMatrix2fv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix2fv(int location, boolean transpose, float[] value);

    /** Array version of: {@link #glUniformMatrix3fv UniformMatrix3fv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix3fv(int location, boolean transpose, float[] value);

    /** Array version of: {@link #glUniformMatrix4fv UniformMatrix4fv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniformMatrix4fv(int location, boolean transpose, float[] value);

    /** Array version of: {@link #glGetShaderiv GetShaderiv}@see <a href="https://docs.gl/gl4/glGetShader">Reference Page</a>*/
    void glGetShaderiv(int shader, int pname, int[] params);

    /** Array version of: {@link #glGetProgramiv GetProgramiv}@see <a href="https://docs.gl/gl4/glGetProgram">Reference Page</a>*/
    void glGetProgramiv(int program, int pname, int[] params);

    /** Array version of: {@link #glGetShaderInfoLog GetShaderInfoLog}@see <a href="https://docs.gl/gl4/glGetShaderInfoLog">Reference Page</a>*/
    void glGetShaderInfoLog(int shader, int[] length, ByteBuffer infoLog);

    /** Array version of: {@link #glGetProgramInfoLog GetProgramInfoLog}@see <a href="https://docs.gl/gl4/glGetProgramInfoLog">Reference Page</a>*/
    void glGetProgramInfoLog(int program, int[] length, ByteBuffer infoLog);

    /** Array version of: {@link #glGetAttachedShaders GetAttachedShaders}@see <a href="https://docs.gl/gl4/glGetAttachedShaders">Reference Page</a>*/
    void glGetAttachedShaders(int program, int[] count, int[] shaders);

    /** Array version of: {@link #glGetActiveUniform GetActiveUniform}@see <a href="https://docs.gl/gl4/glGetActiveUniform">Reference Page</a>*/
    void glGetActiveUniform(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name);

    /** Array version of: {@link #glGetUniformfv GetUniformfv}@see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>*/
    void glGetUniformfv(int program, int location, float[] params);

    /** Array version of: {@link #glGetUniformiv GetUniformiv}@see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>*/
    void glGetUniformiv(int program, int location, int[] params);

    /** Array version of: {@link #glGetShaderSource GetShaderSource}@see <a href="https://docs.gl/gl4/glGetShaderSource">Reference Page</a>*/
    void glGetShaderSource(int shader, int[] length, ByteBuffer source);

    /** Array version of: {@link #glVertexAttrib1fv VertexAttrib1fv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib1fv(int index, float[] v);

    /** Array version of: {@link #glVertexAttrib1sv VertexAttrib1sv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib1sv(int index, short[] v);

    /** Array version of: {@link #glVertexAttrib1dv VertexAttrib1dv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib1dv(int index, double[] v);

    /** Array version of: {@link #glVertexAttrib2fv VertexAttrib2fv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib2fv(int index, float[] v);

    /** Array version of: {@link #glVertexAttrib2sv VertexAttrib2sv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib2sv(int index, short[] v);

    /** Array version of: {@link #glVertexAttrib2dv VertexAttrib2dv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib2dv(int index, double[] v);

    /** Array version of: {@link #glVertexAttrib3fv VertexAttrib3fv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib3fv(int index, float[] v);

    /** Array version of: {@link #glVertexAttrib3sv VertexAttrib3sv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib3sv(int index, short[] v);

    /** Array version of: {@link #glVertexAttrib3dv VertexAttrib3dv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib3dv(int index, double[] v);

    /** Array version of: {@link #glVertexAttrib4fv VertexAttrib4fv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4fv(int index, float[] v);

    /** Array version of: {@link #glVertexAttrib4sv VertexAttrib4sv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4sv(int index, short[] v);

    /** Array version of: {@link #glVertexAttrib4dv VertexAttrib4dv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4dv(int index, double[] v);

    /** Array version of: {@link #glVertexAttrib4iv VertexAttrib4iv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4iv(int index, int[] v);

    /** Array version of: {@link #glVertexAttrib4usv VertexAttrib4usv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4usv(int index, short[] v);

    /** Array version of: {@link #glVertexAttrib4uiv VertexAttrib4uiv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4uiv(int index, int[] v);

    /** Array version of: {@link #glVertexAttrib4Nsv VertexAttrib4Nsv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4Nsv(int index, short[] v);

    /** Array version of: {@link #glVertexAttrib4Niv VertexAttrib4Niv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4Niv(int index, int[] v);

    /** Array version of: {@link #glVertexAttrib4Nusv VertexAttrib4Nusv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4Nusv(int index, short[] v);

    /** Array version of: {@link #glVertexAttrib4Nuiv VertexAttrib4Nuiv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttrib4Nuiv(int index, int[] v);

    /** Array version of: {@link #glGetActiveAttrib GetActiveAttrib}@see <a href="https://docs.gl/gl4/glGetActiveAttrib">Reference Page</a>*/
    void glGetActiveAttrib(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name);

    /** Array version of: {@link #glGetVertexAttribiv GetVertexAttribiv}@see <a href="https://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>*/
    void glGetVertexAttribiv(int index, int pname, int[] params);

    /** Array version of: {@link #glGetVertexAttribfv GetVertexAttribfv}@see <a href="https://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>*/
    void glGetVertexAttribfv(int index, int pname, float[] params);

    /** Array version of: {@link #glGetVertexAttribdv GetVertexAttribdv}@see <a href="https://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>*/
    void glGetVertexAttribdv(int index, int pname, double[] params);

    /** Array version of: {@link #glDrawBuffers DrawBuffers}@see <a href="https://docs.gl/gl4/glDrawBuffers">Reference Page</a>*/
    void glDrawBuffers(int[] bufs);

}
