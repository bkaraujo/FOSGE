package br.fosge.engine.runtime.platform.binding.opengl.api;

import org.lwjgl.PointerBuffer;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public interface GL41 {

    /** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_SHADER_COMPILER = 36346;

    /** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_SHADER_BINARY_FORMATS = 36344;

    /** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_NUM_SHADER_BINARY_FORMATS = 36345;

    /** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_VERTEX_UNIFORM_VECTORS = 36347;

    /** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_VARYING_VECTORS = 36348;

    /** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_FRAGMENT_UNIFORM_VECTORS = 36349;

    /** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_IMPLEMENTATION_COLOR_READ_TYPE = 35738;

    /** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_IMPLEMENTATION_COLOR_READ_FORMAT = 35739;

    /** Accepted by the {@code type} parameter of VertexAttribPointer.*/
    int GL_FIXED = 5132;

    /** Accepted by the {@code precisiontype} parameter of GetShaderPrecisionFormat.*/
    int GL_LOW_FLOAT = 36336;

    /** Accepted by the {@code precisiontype} parameter of GetShaderPrecisionFormat.*/
    int GL_MEDIUM_FLOAT = 36337;

    /** Accepted by the {@code precisiontype} parameter of GetShaderPrecisionFormat.*/
    int GL_HIGH_FLOAT = 36338;

    /** Accepted by the {@code precisiontype} parameter of GetShaderPrecisionFormat.*/
    int GL_LOW_INT = 36339;

    /** Accepted by the {@code precisiontype} parameter of GetShaderPrecisionFormat.*/
    int GL_MEDIUM_INT = 36340;

    /** Accepted by the {@code precisiontype} parameter of GetShaderPrecisionFormat.*/
    int GL_HIGH_INT = 36341;

    /** Accepted by the {@code format} parameter of most commands taking sized internal formats.*/
    int GL_RGB565 = 36194;

    /** Accepted by the {@code pname} parameter of ProgramParameteri and GetProgramiv.*/
    int GL_PROGRAM_BINARY_RETRIEVABLE_HINT = 33367;

    /** Accepted by the {@code pname} parameter of GetProgramiv.*/
    int GL_PROGRAM_BINARY_LENGTH = 34625;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv and GetDoublev.*/
    int GL_NUM_PROGRAM_BINARY_FORMATS = 34814;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv and GetDoublev.*/
    int GL_PROGRAM_BINARY_FORMATS = 34815;

    /** Accepted by {@code stages} parameter to UseProgramStages.*/
    int GL_VERTEX_SHADER_BIT = 1;

    /** Accepted by {@code stages} parameter to UseProgramStages.*/
    int GL_FRAGMENT_SHADER_BIT = 2;

    /** Accepted by {@code stages} parameter to UseProgramStages.*/
    int GL_GEOMETRY_SHADER_BIT = 4;

    /** Accepted by {@code stages} parameter to UseProgramStages.*/
    int GL_TESS_CONTROL_SHADER_BIT = 8;

    /** Accepted by {@code stages} parameter to UseProgramStages.*/
    int GL_TESS_EVALUATION_SHADER_BIT = 16;

    /** Accepted by {@code stages} parameter to UseProgramStages.*/
    int GL_ALL_SHADER_BITS = -1;

    /** Accepted by the {@code pname} parameter of ProgramParameteri and GetProgramiv.*/
    int GL_PROGRAM_SEPARABLE = 33368;

    /** Accepted by {@code type} parameter to GetProgramPipelineiv.*/
    int GL_ACTIVE_PROGRAM = 33369;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_PROGRAM_PIPELINE_BINDING = 33370;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev and GetInteger64v.*/
    int GL_MAX_VIEWPORTS = 33371;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev and GetInteger64v.*/
    int GL_VIEWPORT_SUBPIXEL_BITS = 33372;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev and GetInteger64v.*/
    int GL_VIEWPORT_BOUNDS_RANGE = 33373;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev and GetInteger64v.*/
    int GL_LAYER_PROVOKING_VERTEX = 33374;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev and GetInteger64v.*/
    int GL_VIEWPORT_INDEX_PROVOKING_VERTEX = 33375;

    /** Returned in the {@code data} parameter from a Get query with a {@code pname} of LAYER_PROVOKING_VERTEX or VIEWPORT_INDEX_PROVOKING_VERTEX.*/
    int GL_UNDEFINED_VERTEX = 33376;

    /** Releases resources allocated by the shader compiler. This is a hint from the application, and does not prevent later use of the shader compiler.@see <a href="https://docs.gl/gl4/glReleaseShaderCompiler">Reference Page</a>*/
    void glReleaseShaderCompiler();

    /** Loads pre-compiled shader binaries.@param shaders an array of shader handles into which to load pre-compiled shader binaries@param binaryformat the format of the shader binaries contained in {@code binary}@param binary an array of bytes containing pre-compiled binary shader code@see <a href="https://docs.gl/gl4/glShaderBinary">Reference Page</a>*/
    void glShaderBinary(IntBuffer shaders, int binaryformat, ByteBuffer binary);

    /** Retrieves the range and precision for numeric formats supported by the shader compiler.@param shadertype the type of shader whose precision to query. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td></tr></table>@param precisiontype the numeric format whose precision and range to query@param range the address of array of two integers into which encodings of the implementation's numeric range are returned@param precision the address of an integer into which the numeric precision of the implementation is written@see <a href="https://docs.gl/gl4/glGetShaderPrecisionFormat">Reference Page</a>*/
    void glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntBuffer range, IntBuffer precision);

    /** Retrieves the range and precision for numeric formats supported by the shader compiler.@param shadertype the type of shader whose precision to query. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td></tr></table>@param precisiontype the numeric format whose precision and range to query@param range the address of array of two integers into which encodings of the implementation's numeric range are returned@see <a href="https://docs.gl/gl4/glGetShaderPrecisionFormat">Reference Page</a>*/
    int glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntBuffer range);

    /** Specifies mapping of depth values from normalized device coordinates to window coordinates@param zNear the mapping of the near clipping plane to window coordinates. The initial value is 0.0f.@param zFar the mapping of the far clipping plane to window coordinates. The initial value is 1.0f.@see <a href="https://docs.gl/gl4/glDepthRangef">Reference Page</a>*/
    void glDepthRangef(float zNear, float zFar);

    /** Specifies the clear value for the depth buffer@param depth the depth value used when the depth buffer is cleared. The initial value is 1.0f.@see <a href="https://docs.gl/gl4/glClearDepthf">Reference Page</a>*/
    void glClearDepthf(float depth);

    /** Returns a binary representation of a program object's compiled and linked executable source.@param program the name of a program object whose binary representation to retrieve@param length the address of a variable to receive the number of bytes written into {@code binary}@param binaryFormat a variable to receive a token indicating the format of the binary data returned by the GL@param binary an array into which the GL will return {@code program}'s binary representation@see <a href="https://docs.gl/gl4/glGetProgramBinary">Reference Page</a>*/
    void glGetProgramBinary(int program, IntBuffer length, IntBuffer binaryFormat, ByteBuffer binary);

    /** Loads a program object with a program binary.@param program the name of a program object into which to load a program binary@param binaryFormat the format of the binary data in binary@param binary an array containing the binary to be loaded into {@code program}@see <a href="https://docs.gl/gl4/glProgramBinary">Reference Page</a>*/
    void glProgramBinary(int program, int binaryFormat, ByteBuffer binary);

    /** Specifies the integer value of a program object parameter.@param program the name of a program object whose parameter to modify@param pname the name of the parameter to modify. One of:<br><table><tr><td>{@link GL41C#GL_PROGRAM_BINARY_RETRIEVABLE_HINT PROGRAM_BINARY_RETRIEVABLE_HINT}</td><td>{@link GL41C#GL_PROGRAM_SEPARABLE PROGRAM_SEPARABLE}</td></tr></table>@param value the new value of the parameter specified by {@code pname} for {@code program}@see <a href="https://docs.gl/gl4/glProgramParameteri">Reference Page</a>*/
    void glProgramParameteri(int program, int pname, int value);

    /** Binds stages of a program object to a program pipeline.@param pipeline the program pipeline object to which to bind stages from {@code program}@param stages a set of program stages to bind to the program pipeline object@param program the program object containing the shader executables to use in {@code pipeline}@see <a href="https://docs.gl/gl4/glUseProgramStages">Reference Page</a>*/
    void glUseProgramStages(int pipeline, int stages, int program);

    /** Sets the active program object for a program pipeline object.@param pipeline the program pipeline object to set the active program object for@param program the program object to set as the active program pipeline object {@code pipeline}@see <a href="https://docs.gl/gl4/glActiveShaderProgram">Reference Page</a>*/
    void glActiveShaderProgram(int pipeline, int program);

    /** Creates a stand-alone program from an array of null-terminated source code strings. <p>{@code glCreateShaderProgram} is equivalent (assuming no errors are generated) to:</p> <pre><code> const GLuint shader = glCreateShader(type); if (shader) {     glShaderSource(shader, count, strings, NULL);     glCompileShader(shader);     const GLuint program = glCreateProgram();     if (program) {         GLint compiled = GL_FALSE;         glGetShaderiv(shader, GL_COMPILE_STATUS, &amp;compiled);         glProgramParameteri(program, GL_PROGRAM_SEPARABLE, GL_TRUE);         if (compiled) {             glAttachShader(program, shader);             glLinkProgram(program);             glDetachShader(program, shader);         }         // append-shader-info-log-to-program-info-log     }     glDeleteShader(shader);     return program; } else {     return 0; }</code></pre> <p>The program object created by glCreateShaderProgram has its GL_PROGRAM_SEPARABLE status set to GL_TRUE.</p>@param type the type of shader to create@param strings an array of pointers to source code strings from which to create the program object@see <a href="https://docs.gl/gl4/glCreateShaderProgramv">Reference Page</a>*/
    int glCreateShaderProgramv(int type, PointerBuffer strings);

    /** Creates a stand-alone program from an array of null-terminated source code strings. <p>{@code glCreateShaderProgram} is equivalent (assuming no errors are generated) to:</p> <pre><code> const GLuint shader = glCreateShader(type); if (shader) {     glShaderSource(shader, count, strings, NULL);     glCompileShader(shader);     const GLuint program = glCreateProgram();     if (program) {         GLint compiled = GL_FALSE;         glGetShaderiv(shader, GL_COMPILE_STATUS, &amp;compiled);         glProgramParameteri(program, GL_PROGRAM_SEPARABLE, GL_TRUE);         if (compiled) {             glAttachShader(program, shader);             glLinkProgram(program);             glDetachShader(program, shader);         }         // append-shader-info-log-to-program-info-log     }     glDeleteShader(shader);     return program; } else {     return 0; }</code></pre> <p>The program object created by glCreateShaderProgram has its GL_PROGRAM_SEPARABLE status set to GL_TRUE.</p>@param type the type of shader to create@param strings an array of pointers to source code strings from which to create the program object@see <a href="https://docs.gl/gl4/glCreateShaderProgramv">Reference Page</a>*/
    int glCreateShaderProgramv(int type, CharSequence[] strings);

    /** Creates a stand-alone program from an array of null-terminated source code strings. <p>{@code glCreateShaderProgram} is equivalent (assuming no errors are generated) to:</p> <pre><code> const GLuint shader = glCreateShader(type); if (shader) {     glShaderSource(shader, count, strings, NULL);     glCompileShader(shader);     const GLuint program = glCreateProgram();     if (program) {         GLint compiled = GL_FALSE;         glGetShaderiv(shader, GL_COMPILE_STATUS, &amp;compiled);         glProgramParameteri(program, GL_PROGRAM_SEPARABLE, GL_TRUE);         if (compiled) {             glAttachShader(program, shader);             glLinkProgram(program);             glDetachShader(program, shader);         }         // append-shader-info-log-to-program-info-log     }     glDeleteShader(shader);     return program; } else {     return 0; }</code></pre> <p>The program object created by glCreateShaderProgram has its GL_PROGRAM_SEPARABLE status set to GL_TRUE.</p>@param type the type of shader to create@see <a href="https://docs.gl/gl4/glCreateShaderProgramv">Reference Page</a>*/
    int glCreateShaderProgramv(int type, CharSequence string);

    /** Binds a program pipeline to the current context.@param pipeline the name of the pipeline object to bind to the context@see <a href="https://docs.gl/gl4/glBindProgramPipeline">Reference Page</a>*/
    void glBindProgramPipeline(int pipeline);

    /** Deletes program pipeline objects.@param pipelines an array of names of program pipeline objects to delete@see <a href="https://docs.gl/gl4/glDeleteProgramPipelines">Reference Page</a>*/
    void glDeleteProgramPipelines(IntBuffer pipelines);

    /** Deletes program pipeline objects.@see <a href="https://docs.gl/gl4/glDeleteProgramPipelines">Reference Page</a>*/
    void glDeleteProgramPipelines(int pipeline);

    /** Reserves program pipeline object names.@param pipelines an array of into which the reserved names will be written@see <a href="https://docs.gl/gl4/glGenProgramPipelines">Reference Page</a>*/
    void glGenProgramPipelines(IntBuffer pipelines);

    /** Reserves program pipeline object names.@see <a href="https://docs.gl/gl4/glGenProgramPipelines">Reference Page</a>*/
    int glGenProgramPipelines();

    /** Determines if a name corresponds to a program pipeline object.@param pipeline a value that may be the name of a program pipeline object@see <a href="https://docs.gl/gl4/glIsProgramPipeline">Reference Page</a>*/
    boolean glIsProgramPipeline(int pipeline);

    /** Retrieves properties of a program pipeline object.@param pipeline the name of a program pipeline object whose parameter retrieve@param pname the name of the parameter to retrieve. One of:<br><table><tr><td>{@link GL41C#GL_ACTIVE_PROGRAM ACTIVE_PROGRAM}</td><td>{@link GL20#GL_INFO_LOG_LENGTH INFO_LOG_LENGTH}</td><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>@param params a variable into which will be written the value or values of {@code pname} for {@code pipeline}@see <a href="https://docs.gl/gl4/glGetProgramPipeline">Reference Page</a>*/
    void glGetProgramPipelineiv(int pipeline, int pname, IntBuffer params);

    /** Retrieves properties of a program pipeline object.@param pipeline the name of a program pipeline object whose parameter retrieve@param pname the name of the parameter to retrieve. One of:<br><table><tr><td>{@link GL41C#GL_ACTIVE_PROGRAM ACTIVE_PROGRAM}</td><td>{@link GL20#GL_INFO_LOG_LENGTH INFO_LOG_LENGTH}</td><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetProgramPipeline">Reference Page</a>*/
    int glGetProgramPipelinei(int pipeline, int pname);

    /** Specifies the value of an int uniform variable for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param x the uniform x value@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform1i(int program, int location, int x);

    /** Specifies the value of an ivec2 uniform variable for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param x the uniform x value@param y the uniform y value@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform2i(int program, int location, int x, int y);

    /** Specifies the value of an ivec3 uniform variable for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param x the uniform x value@param y the uniform y value@param z the uniform z value@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform3i(int program, int location, int x, int y, int z);

    /** Specifies the value of an ivec4 uniform variable for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param x the uniform x value@param y the uniform y value@param z the uniform z value@param w the uniform w value@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform4i(int program, int location, int x, int y, int z, int w);

    /** Specifies the value of a uint uniform variable for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param x the uniform x value@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform1ui(int program, int location, int x);

    /** Specifies the value of a uvec2 uniform variable for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param x the uniform x value@param y the uniform y value@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform2ui(int program, int location, int x, int y);

    /** Specifies the value of a uvec3 uniform variable for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param x the uniform x value@param y the uniform y value@param z the uniform z value@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform3ui(int program, int location, int x, int y, int z);

    /** Specifies the value of a uvec4 uniform variable for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param x the uniform x value@param y the uniform y value@param z the uniform z value@param w the uniform w value@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform4ui(int program, int location, int x, int y, int z, int w);

    /** Specifies the value of a float uniform variable for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param x the uniform x value@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform1f(int program, int location, float x);

    /** Specifies the value of a vec2 uniform variable for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param x the uniform x value@param y the uniform y value@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform2f(int program, int location, float x, float y);

    /** Specifies the value of a vec3 uniform variable for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param x the uniform x value@param y the uniform y value@param z the uniform z value@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform3f(int program, int location, float x, float y, float z);

    /** Specifies the value of a vec4 uniform variable for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param x the uniform x value@param y the uniform y value@param z the uniform z value@param w the uniform w value@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform4f(int program, int location, float x, float y, float z, float w);

    /** Specifies the value of a double uniform variable for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param x the uniform x value@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform1d(int program, int location, double x);

    /** Specifies the value of a dvec2 uniform variable for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param x the uniform x value@param y the uniform y value@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform2d(int program, int location, double x, double y);

    /** Specifies the value of a dvec3 uniform variable for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param x the uniform x value@param y the uniform y value@param z the uniform z value@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform3d(int program, int location, double x, double y, double z);

    /** Specifies the value of a dvec4 uniform variable for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param x the uniform x value@param y the uniform y value@param z the uniform z value@param w the uniform w value@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform4d(int program, int location, double x, double y, double z, double w);

    /** Specifies the value of a single float uniform variable or a float uniform variable array for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param value an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform1iv(int program, int location, IntBuffer value);

    /** Specifies the value of a single ivec2 uniform variable or an ivec2 uniform variable array for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param value an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform2iv(int program, int location, IntBuffer value);

    /** Specifies the value of a single ivec3 uniform variable or an ivec3 uniform variable array for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param value an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform3iv(int program, int location, IntBuffer value);

    /** Specifies the value of a single ivec4 uniform variable or an ivec4 uniform variable array for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param value an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform4iv(int program, int location, IntBuffer value);

    /** Specifies the value of a single uint uniform variable or a uint uniform variable array for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param value an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform1uiv(int program, int location, IntBuffer value);

    /** Specifies the value of a single uvec2 uniform variable or a uvec2 uniform variable array for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param value an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform2uiv(int program, int location, IntBuffer value);

    /** Specifies the value of a single uvec3 uniform variable or a uvec3 uniform variable array for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param value an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform3uiv(int program, int location, IntBuffer value);

    /** Specifies the value of a single uvec4 uniform variable or a uvec4 uniform variable array for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param value an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform4uiv(int program, int location, IntBuffer value);

    /** Specifies the value of a single float uniform variable or a float uniform variable array for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param value an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform1fv(int program, int location, FloatBuffer value);

    /** Specifies the value of a single vec2 uniform variable or a vec2 uniform variable array for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param value an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform2fv(int program, int location, FloatBuffer value);

    /** Specifies the value of a single vec3 uniform variable or a vec3 uniform variable array for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param value an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform3fv(int program, int location, FloatBuffer value);

    /** Specifies the value of a single vec4 uniform variable or a vec4 uniform variable array for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param value an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform4fv(int program, int location, FloatBuffer value);

    /** Specifies the value of a single double uniform variable or a double uniform variable array for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param value an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform1dv(int program, int location, DoubleBuffer value);

    /** Specifies the value of a single dvec2 uniform variable or a dvec2 uniform variable array for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param value an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform2dv(int program, int location, DoubleBuffer value);

    /** Specifies the value of a single dvec3 uniform variable or a dvec3 uniform variable array for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param value an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform3dv(int program, int location, DoubleBuffer value);

    /** Specifies the value of a single dvec4 uniform variable or a dvec4 uniform variable array for a specified program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param value an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform4dv(int program, int location, DoubleBuffer value);

    /** Specifies the value of a single mat2 uniform variable or a mat2 uniform variable array for the current program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix2fv(int program, int location, boolean transpose, FloatBuffer value);

    /** Specifies the value of a single mat3 uniform variable or a mat3 uniform variable array for the current program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix3fv(int program, int location, boolean transpose, FloatBuffer value);

    /** Specifies the value of a single mat4 uniform variable or a mat4 uniform variable array for the current program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix4fv(int program, int location, boolean transpose, FloatBuffer value);

    /** Specifies the value of a single dmat2 uniform variable or a dmat2 uniform variable array for the current program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix2dv(int program, int location, boolean transpose, DoubleBuffer value);

    /** Specifies the value of a single dmat3 uniform variable or a dmat3 uniform variable array for the current program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix3dv(int program, int location, boolean transpose, DoubleBuffer value);

    /** Specifies the value of a single dmat4 uniform variable or a dmat4 uniform variable array for the current program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix4dv(int program, int location, boolean transpose, DoubleBuffer value);

    /** Specifies the value of a single mat2x3 uniform variable or a mat2x3 uniform variable array for the current program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix2x3fv(int program, int location, boolean transpose, FloatBuffer value);

    /** Specifies the value of a single mat3x2 uniform variable or a mat3x2 uniform variable array for the current program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix3x2fv(int program, int location, boolean transpose, FloatBuffer value);

    /** Specifies the value of a single mat2x4 uniform variable or a mat2x4 uniform variable array for the current program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix2x4fv(int program, int location, boolean transpose, FloatBuffer value);

    /** Specifies the value of a single mat4x2 uniform variable or a mat4x2 uniform variable array for the current program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix4x2fv(int program, int location, boolean transpose, FloatBuffer value);

    /** Specifies the value of a single mat3x4 uniform variable or a mat3x4 uniform variable array for the current program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix3x4fv(int program, int location, boolean transpose, FloatBuffer value);

    /** Specifies the value of a single mat4x3 uniform variable or a mat4x3 uniform variable array for the current program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix4x3fv(int program, int location, boolean transpose, FloatBuffer value);

    /** Specifies the value of a single dmat2x3 uniform variable or a dmat2x3 uniform variable array for the current program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix2x3dv(int program, int location, boolean transpose, DoubleBuffer value);

    /** Specifies the value of a single dmat3x2 uniform variable or a dmat3x2 uniform variable array for the current program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix3x2dv(int program, int location, boolean transpose, DoubleBuffer value);

    /** Specifies the value of a single dmat2x4 uniform variable or a dmat2x4 uniform variable array for the current program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix2x4dv(int program, int location, boolean transpose, DoubleBuffer value);

    /** Specifies the value of a single dmat4x2 uniform variable or a dmat4x2 uniform variable array for the current program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix4x2dv(int program, int location, boolean transpose, DoubleBuffer value);

    /** Specifies the value of a single dmat3x4 uniform variable or a dmat3x4 uniform variable array for the current program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix3x4dv(int program, int location, boolean transpose, DoubleBuffer value);

    /** Specifies the value of a single dmat4x3 uniform variable or a dmat4x3 uniform variable array for the current program object.@param program the handle of the program containing the uniform variable to be modified@param location the location of the uniform variable to be modified@param transpose whether to transpose the matrix as the values are loaded into the uniform variable@param value an array of {@code count} values that will be used to update the specified uniform matrix variable@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix4x3dv(int program, int location, boolean transpose, DoubleBuffer value);

    /** Validates a program pipeline object against current GL state.@param pipeline the name of a program pipeline object to validate@see <a href="https://docs.gl/gl4/glValidateProgramPipeline">Reference Page</a>*/
    void glValidateProgramPipeline(int pipeline);

    /** Retrieves the info log string from a program pipeline object.@param pipeline the name of a program pipeline object from which to retrieve the info log@param length a variable into which will be written the number of characters written into {@code infoLog}@param infoLog an array of characters into which will be written the info log for {@code pipeline}@see <a href="https://docs.gl/gl4/glGetProgramPipelineInfoLog">Reference Page</a>*/
    void glGetProgramPipelineInfoLog(int pipeline, IntBuffer length, ByteBuffer infoLog);

    /** Retrieves the info log string from a program pipeline object.@param pipeline the name of a program pipeline object from which to retrieve the info log@param bufSize the maximum number of characters, including the null terminator, that may be written into {@code infoLog}@see <a href="https://docs.gl/gl4/glGetProgramPipelineInfoLog">Reference Page</a>*/
    String glGetProgramPipelineInfoLog(int pipeline, int bufSize);

    /** Retrieves the info log string from a program pipeline object.@param pipeline the name of a program pipeline object from which to retrieve the info log@see <a href="https://docs.gl/gl4/glGetProgramPipelineInfoLog">Reference Page</a>*/
    String glGetProgramPipelineInfoLog(int pipeline);

    /** Specifies the value of a generic vertex attribute. The y and z components are implicitly set to 0.0 and w to 1.0.@param index the index of the generic vertex attribute to be modified@param x the vertex attribute x component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribL1d(int index, double x);

    /** Specifies the value of a generic vertex attribute. The y component is implicitly set to 0.0 and w to 1.0.@param index the index of the generic vertex attribute to be modified@param x the vertex attribute x component@param y the vertex attribute y component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribL2d(int index, double x, double y);

    /** Specifies the value of a generic vertex attribute. The w is implicitly set to 1.0.@param index the index of the generic vertex attribute to be modified@param x the vertex attribute x component@param y the vertex attribute y component@param z the vertex attribute z component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribL3d(int index, double x, double y, double z);

    /** Specifies the value of a generic vertex attribute.@param index the index of the generic vertex attribute to be modified@param x the vertex attribute x component@param y the vertex attribute y component@param z the vertex attribute z component@param w the vertex attribute w component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribL4d(int index, double x, double y, double z, double w);

    /** Pointer version of {@link #glVertexAttribL1d VertexAttribL1d}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribL1dv(int index, DoubleBuffer v);

    /** Pointer version of {@link #glVertexAttribL2d VertexAttribL2d}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribL2dv(int index, DoubleBuffer v);

    /** Pointer version of {@link #glVertexAttribL3d VertexAttribL3d}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribL3dv(int index, DoubleBuffer v);

    /** Pointer version of {@link #glVertexAttribL4d VertexAttribL4d}.@param index the index of the generic vertex attribute to be modified@param _2 the vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribL4dv(int index, DoubleBuffer v);

    /** Specifies the location and organization of a 64-bit vertex attribute array.@param index the index of the generic vertex attribute to be modified@param size the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>@param type the data type of each component in the array. Must be:<br><table><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>@param stride the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in                the array. The initial value is 0.@param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.@see <a href="https://docs.gl/gl4/glVertexAttribLPointer">Reference Page</a>*/
    void glVertexAttribLPointer(int index, int size, int type, int stride, ByteBuffer pointer);

    /** Specifies the location and organization of a 64-bit vertex attribute array.@param index the index of the generic vertex attribute to be modified@param size the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>@param type the data type of each component in the array. Must be:<br><table><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>@param stride the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in                the array. The initial value is 0.@param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.@see <a href="https://docs.gl/gl4/glVertexAttribLPointer">Reference Page</a>*/
    void glVertexAttribLPointer(int index, int size, int type, int stride, long pointer);

    /** Specifies the location and organization of a 64-bit vertex attribute array.@param index the index of the generic vertex attribute to be modified@param size the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>@param stride the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in                the array. The initial value is 0.@param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.@see <a href="https://docs.gl/gl4/glVertexAttribLPointer">Reference Page</a>*/
    void glVertexAttribLPointer(int index, int size, int stride, DoubleBuffer pointer);

    /** Double version of {@link GL20C#glGetVertexAttribiv GetVertexAttribiv}.@param index the generic vertex attribute parameter to be queried@param pname the symbolic name of the vertex attribute parameter to be queried@param params the requested data@see <a href="https://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>*/
    void glGetVertexAttribLdv(int index, int pname, DoubleBuffer params);

    /** Sets multiple viewports.@param first the first viewport to set@param _2 an array containing the viewport parameters@see <a href="https://docs.gl/gl4/glViewportArrayv">Reference Page</a>*/
    void glViewportArrayv(int first, FloatBuffer v);

    /** Sets a specified viewport.@param index the viewport to set@param x the left viewport coordinate@param y the bottom viewport coordinate@param w the viewport width@param h the viewport height@see <a href="https://docs.gl/gl4/glViewportIndexedf">Reference Page</a>*/
    void glViewportIndexedf(int index, float x, float y, float w, float h);

    /** Pointer version of {@link #glViewportIndexedf ViewportIndexedf}.@param index the viewport to set@param _2 the viewport parameters@see <a href="https://docs.gl/gl4/glViewportIndexed">Reference Page</a>*/
    void glViewportIndexedfv(int index, FloatBuffer v);

    /** Defines the scissor box for multiple viewports.@param first the index of the first viewport whose scissor box to modify@param _2 an array containing the left, bottom, width and height of each scissor box, in that order@see <a href="https://docs.gl/gl4/glScissorArrayv">Reference Page</a>*/
    void glScissorArrayv(int first, IntBuffer v);

    /** Defines the scissor box for a specific viewport.@param index the index of the viewport whose scissor box to modify@param left the left scissor box coordinate@param bottom the bottom scissor box coordinate@param width the scissor box width@param height the scissor box height@see <a href="https://docs.gl/gl4/glScissorIndexed">Reference Page</a>*/
    void glScissorIndexed(int index, int left, int bottom, int width, int height);

    /** Pointer version of {@link #glScissorIndexed ScissorIndexed}.@param index the index of the viewport whose scissor box to modify@param _2 an array containing the left, bottom, width and height of each scissor box, in that order@see <a href="https://docs.gl/gl4/glScissorIndexed">Reference Page</a>*/
    void glScissorIndexedv(int index, IntBuffer v);

    /** Specifies mapping of depth values from normalized device coordinates to window coordinates for a specified set of viewports.@param first the index of the first viewport whose depth range to update@param _2 n array containing the near and far values for the depth range of each modified viewport@see <a href="https://docs.gl/gl4/glDepthRangeArrayv">Reference Page</a>*/
    void glDepthRangeArrayv(int first, DoubleBuffer v);

    /** Specifies mapping of depth values from normalized device coordinates to window coordinates for a specified viewport.@param index the index of the viewport whose depth range to update@param zNear the mapping of the near clipping plane to window coordinates. The initial value is 0.@param zFar the mapping of the far clipping plane to window coordinates. The initial value is 1.@see <a href="https://docs.gl/gl4/glDepthRangeIndexed">Reference Page</a>*/
    void glDepthRangeIndexed(int index, double zNear, double zFar);

    /** Queries the float value of an indexed state variable.@param target the indexed state to query@param index the index of the element being queried@param data a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl4/glGetFloati_v">Reference Page</a>*/
    void glGetFloati_v(int target, int index, FloatBuffer data);

    /** Queries the float value of an indexed state variable.@param target the indexed state to query@param index the index of the element being queried@see <a href="https://docs.gl/gl4/glGetFloati_v">Reference Page</a>*/
    float glGetFloati(int target, int index);

    /** Queries the double value of an indexed state variable.@param target the indexed state to query@param index the index of the element being queried@param data a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl4/glGetDoublei_v">Reference Page</a>*/
    void glGetDoublei_v(int target, int index, DoubleBuffer data);

    /** Queries the double value of an indexed state variable.@param target the indexed state to query@param index the index of the element being queried@see <a href="https://docs.gl/gl4/glGetDoublei_v">Reference Page</a>*/
    double glGetDoublei(int target, int index);

    /** Array version of: {@link #glShaderBinary ShaderBinary}@see <a href="https://docs.gl/gl4/glShaderBinary">Reference Page</a>*/
    void glShaderBinary(int[] shaders, int binaryformat, ByteBuffer binary);

    /** Array version of: {@link #glGetShaderPrecisionFormat GetShaderPrecisionFormat}@see <a href="https://docs.gl/gl4/glGetShaderPrecisionFormat">Reference Page</a>*/
    void glGetShaderPrecisionFormat(int shadertype, int precisiontype, int[] range, int[] precision);

    /** Array version of: {@link #glGetProgramBinary GetProgramBinary}@see <a href="https://docs.gl/gl4/glGetProgramBinary">Reference Page</a>*/
    void glGetProgramBinary(int program, int[] length, int[] binaryFormat, ByteBuffer binary);

    /** Array version of: {@link #glDeleteProgramPipelines DeleteProgramPipelines}@see <a href="https://docs.gl/gl4/glDeleteProgramPipelines">Reference Page</a>*/
    void glDeleteProgramPipelines(int[] pipelines);

    /** Array version of: {@link #glGenProgramPipelines GenProgramPipelines}@see <a href="https://docs.gl/gl4/glGenProgramPipelines">Reference Page</a>*/
    void glGenProgramPipelines(int[] pipelines);

    /** Array version of: {@link #glGetProgramPipelineiv GetProgramPipelineiv}@see <a href="https://docs.gl/gl4/glGetProgramPipeline">Reference Page</a>*/
    void glGetProgramPipelineiv(int pipeline, int pname, int[] params);

    /** Array version of: {@link #glProgramUniform1iv ProgramUniform1iv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform1iv(int program, int location, int[] value);

    /** Array version of: {@link #glProgramUniform2iv ProgramUniform2iv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform2iv(int program, int location, int[] value);

    /** Array version of: {@link #glProgramUniform3iv ProgramUniform3iv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform3iv(int program, int location, int[] value);

    /** Array version of: {@link #glProgramUniform4iv ProgramUniform4iv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform4iv(int program, int location, int[] value);

    /** Array version of: {@link #glProgramUniform1uiv ProgramUniform1uiv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform1uiv(int program, int location, int[] value);

    /** Array version of: {@link #glProgramUniform2uiv ProgramUniform2uiv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform2uiv(int program, int location, int[] value);

    /** Array version of: {@link #glProgramUniform3uiv ProgramUniform3uiv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform3uiv(int program, int location, int[] value);

    /** Array version of: {@link #glProgramUniform4uiv ProgramUniform4uiv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform4uiv(int program, int location, int[] value);

    /** Array version of: {@link #glProgramUniform1fv ProgramUniform1fv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform1fv(int program, int location, float[] value);

    /** Array version of: {@link #glProgramUniform2fv ProgramUniform2fv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform2fv(int program, int location, float[] value);

    /** Array version of: {@link #glProgramUniform3fv ProgramUniform3fv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform3fv(int program, int location, float[] value);

    /** Array version of: {@link #glProgramUniform4fv ProgramUniform4fv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform4fv(int program, int location, float[] value);

    /** Array version of: {@link #glProgramUniform1dv ProgramUniform1dv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform1dv(int program, int location, double[] value);

    /** Array version of: {@link #glProgramUniform2dv ProgramUniform2dv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform2dv(int program, int location, double[] value);

    /** Array version of: {@link #glProgramUniform3dv ProgramUniform3dv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform3dv(int program, int location, double[] value);

    /** Array version of: {@link #glProgramUniform4dv ProgramUniform4dv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniform4dv(int program, int location, double[] value);

    /** Array version of: {@link #glProgramUniformMatrix2fv ProgramUniformMatrix2fv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix2fv(int program, int location, boolean transpose, float[] value);

    /** Array version of: {@link #glProgramUniformMatrix3fv ProgramUniformMatrix3fv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix3fv(int program, int location, boolean transpose, float[] value);

    /** Array version of: {@link #glProgramUniformMatrix4fv ProgramUniformMatrix4fv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix4fv(int program, int location, boolean transpose, float[] value);

    /** Array version of: {@link #glProgramUniformMatrix2dv ProgramUniformMatrix2dv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix2dv(int program, int location, boolean transpose, double[] value);

    /** Array version of: {@link #glProgramUniformMatrix3dv ProgramUniformMatrix3dv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix3dv(int program, int location, boolean transpose, double[] value);

    /** Array version of: {@link #glProgramUniformMatrix4dv ProgramUniformMatrix4dv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix4dv(int program, int location, boolean transpose, double[] value);

    /** Array version of: {@link #glProgramUniformMatrix2x3fv ProgramUniformMatrix2x3fv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix2x3fv(int program, int location, boolean transpose, float[] value);

    /** Array version of: {@link #glProgramUniformMatrix3x2fv ProgramUniformMatrix3x2fv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix3x2fv(int program, int location, boolean transpose, float[] value);

    /** Array version of: {@link #glProgramUniformMatrix2x4fv ProgramUniformMatrix2x4fv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix2x4fv(int program, int location, boolean transpose, float[] value);

    /** Array version of: {@link #glProgramUniformMatrix4x2fv ProgramUniformMatrix4x2fv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix4x2fv(int program, int location, boolean transpose, float[] value);

    /** Array version of: {@link #glProgramUniformMatrix3x4fv ProgramUniformMatrix3x4fv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix3x4fv(int program, int location, boolean transpose, float[] value);

    /** Array version of: {@link #glProgramUniformMatrix4x3fv ProgramUniformMatrix4x3fv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix4x3fv(int program, int location, boolean transpose, float[] value);

    /** Array version of: {@link #glProgramUniformMatrix2x3dv ProgramUniformMatrix2x3dv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix2x3dv(int program, int location, boolean transpose, double[] value);

    /** Array version of: {@link #glProgramUniformMatrix3x2dv ProgramUniformMatrix3x2dv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix3x2dv(int program, int location, boolean transpose, double[] value);

    /** Array version of: {@link #glProgramUniformMatrix2x4dv ProgramUniformMatrix2x4dv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix2x4dv(int program, int location, boolean transpose, double[] value);

    /** Array version of: {@link #glProgramUniformMatrix4x2dv ProgramUniformMatrix4x2dv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix4x2dv(int program, int location, boolean transpose, double[] value);

    /** Array version of: {@link #glProgramUniformMatrix3x4dv ProgramUniformMatrix3x4dv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix3x4dv(int program, int location, boolean transpose, double[] value);

    /** Array version of: {@link #glProgramUniformMatrix4x3dv ProgramUniformMatrix4x3dv}@see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>*/
    void glProgramUniformMatrix4x3dv(int program, int location, boolean transpose, double[] value);

    /** Array version of: {@link #glGetProgramPipelineInfoLog GetProgramPipelineInfoLog}@see <a href="https://docs.gl/gl4/glGetProgramPipelineInfoLog">Reference Page</a>*/
    void glGetProgramPipelineInfoLog(int pipeline, int[] length, ByteBuffer infoLog);

    /** Array version of: {@link #glVertexAttribL1dv VertexAttribL1dv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribL1dv(int index, double[] v);

    /** Array version of: {@link #glVertexAttribL2dv VertexAttribL2dv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribL2dv(int index, double[] v);

    /** Array version of: {@link #glVertexAttribL3dv VertexAttribL3dv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribL3dv(int index, double[] v);

    /** Array version of: {@link #glVertexAttribL4dv VertexAttribL4dv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribL4dv(int index, double[] v);

    /** Array version of: {@link #glGetVertexAttribLdv GetVertexAttribLdv}@see <a href="https://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>*/
    void glGetVertexAttribLdv(int index, int pname, double[] params);

    /** Array version of: {@link #glViewportArrayv ViewportArrayv}@see <a href="https://docs.gl/gl4/glViewportArrayv">Reference Page</a>*/
    void glViewportArrayv(int first, float[] v);

    /** Array version of: {@link #glViewportIndexedfv ViewportIndexedfv}@see <a href="https://docs.gl/gl4/glViewportIndexed">Reference Page</a>*/
    void glViewportIndexedfv(int index, float[] v);

    /** Array version of: {@link #glScissorArrayv ScissorArrayv}@see <a href="https://docs.gl/gl4/glScissorArrayv">Reference Page</a>*/
    void glScissorArrayv(int first, int[] v);

    /** Array version of: {@link #glScissorIndexedv ScissorIndexedv}@see <a href="https://docs.gl/gl4/glScissorIndexed">Reference Page</a>*/
    void glScissorIndexedv(int index, int[] v);

    /** Array version of: {@link #glDepthRangeArrayv DepthRangeArrayv}@see <a href="https://docs.gl/gl4/glDepthRangeArrayv">Reference Page</a>*/
    void glDepthRangeArrayv(int first, double[] v);

    /** Array version of: {@link #glGetFloati_v GetFloati_v}@see <a href="https://docs.gl/gl4/glGetFloati_v">Reference Page</a>*/
    void glGetFloati_v(int target, int index, float[] data);

    /** Array version of: {@link #glGetDoublei_v GetDoublei_v}@see <a href="https://docs.gl/gl4/glGetDoublei_v">Reference Page</a>*/
    void glGetDoublei_v(int target, int index, double[] data);

}
