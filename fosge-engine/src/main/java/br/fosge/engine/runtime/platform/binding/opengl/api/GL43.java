package br.fosge.engine.runtime.platform.binding.opengl.api;

import org.lwjgl.opengl.GLDebugMessageCallbackI;

import java.nio.*;

public interface GL43 {

    /** No. of supported Shading Language Versions. Accepted by the {@code pname} parameter of GetIntegerv.*/
    int GL_NUM_SHADING_LANGUAGE_VERSIONS = 33513;

    /** Vertex attrib array has unconverted doubles. Accepted by the {@code pname} parameter of GetVertexAttribiv.*/
    int GL_VERTEX_ATTRIB_ARRAY_LONG = 34638;

    /** Accepted by the {@code internalformat} parameter of CompressedTexImage2D.*/
    int GL_COMPRESSED_RGB8_ETC2 = 37492;

    /** Accepted by the {@code internalformat} parameter of CompressedTexImage2D.*/
    int GL_COMPRESSED_SRGB8_ETC2 = 37493;

    /** Accepted by the {@code internalformat} parameter of CompressedTexImage2D.*/
    int GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 37494;

    /** Accepted by the {@code internalformat} parameter of CompressedTexImage2D.*/
    int GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 37495;

    /** Accepted by the {@code internalformat} parameter of CompressedTexImage2D.*/
    int GL_COMPRESSED_RGBA8_ETC2_EAC = 37496;

    /** Accepted by the {@code internalformat} parameter of CompressedTexImage2D.*/
    int GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC = 37497;

    /** Accepted by the {@code internalformat} parameter of CompressedTexImage2D.*/
    int GL_COMPRESSED_R11_EAC = 37488;

    /** Accepted by the {@code internalformat} parameter of CompressedTexImage2D.*/
    int GL_COMPRESSED_SIGNED_R11_EAC = 37489;

    /** Accepted by the {@code internalformat} parameter of CompressedTexImage2D.*/
    int GL_COMPRESSED_RG11_EAC = 37490;

    /** Accepted by the {@code internalformat} parameter of CompressedTexImage2D.*/
    int GL_COMPRESSED_SIGNED_RG11_EAC = 37491;

    /** Accepted by the {@code target} parameter of Enable and Disable.*/
    int GL_PRIMITIVE_RESTART_FIXED_INDEX = 36201;

    /** Accepted by the {@code target} parameter of BeginQuery, EndQuery, GetQueryIndexediv and GetQueryiv.*/
    int GL_ANY_SAMPLES_PASSED_CONSERVATIVE = 36202;

    /** Accepted by the {@code value} parameter of the GetInteger* functions.*/
    int GL_MAX_ELEMENT_INDEX = 36203;

    /** Accepted by the {@code pname} parameters of GetTexParameterfv and  GetTexParameteriv.*/
    int GL_TEXTURE_IMMUTABLE_LEVELS = 33503;

    /** Accepted by the {@code type} parameter of CreateShader and returned in the {@code params} parameter by GetShaderiv.*/
    int GL_COMPUTE_SHADER = 37305;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetFloatv, GetDoublev and GetInteger64v.*/
    int GL_MAX_COMPUTE_UNIFORM_BLOCKS = 37307;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetFloatv, GetDoublev and GetInteger64v.*/
    int GL_MAX_COMPUTE_TEXTURE_IMAGE_UNITS = 37308;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetFloatv, GetDoublev and GetInteger64v.*/
    int GL_MAX_COMPUTE_IMAGE_UNIFORMS = 37309;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetFloatv, GetDoublev and GetInteger64v.*/
    int GL_MAX_COMPUTE_SHARED_MEMORY_SIZE = 33378;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetFloatv, GetDoublev and GetInteger64v.*/
    int GL_MAX_COMPUTE_UNIFORM_COMPONENTS = 33379;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetFloatv, GetDoublev and GetInteger64v.*/
    int GL_MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS = 33380;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetFloatv, GetDoublev and GetInteger64v.*/
    int GL_MAX_COMPUTE_ATOMIC_COUNTERS = 33381;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetFloatv, GetDoublev and GetInteger64v.*/
    int GL_MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS = 33382;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetFloatv, GetDoublev and GetInteger64v.*/
    int GL_MAX_COMPUTE_WORK_GROUP_INVOCATIONS = 37099;

    /** Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleani_v, GetFloati_v, GetDoublei_v and GetInteger64i_v.*/
    int GL_MAX_COMPUTE_WORK_GROUP_COUNT = 37310;

    /** Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleani_v, GetFloati_v, GetDoublei_v and GetInteger64i_v.*/
    int GL_MAX_COMPUTE_WORK_GROUP_SIZE = 37311;

    /** Accepted by the {@code pname} parameter of GetProgramiv.*/
    int GL_COMPUTE_WORK_GROUP_SIZE = 33383;

    /** Accepted by the {@code pname} parameter of GetActiveUniformBlockiv.*/
    int GL_UNIFORM_BLOCK_REFERENCED_BY_COMPUTE_SHADER = 37100;

    /** Accepted by the {@code pname} parameter of GetActiveAtomicCounterBufferiv.*/
    int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_COMPUTE_SHADER = 37101;

    /** Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv.*/
    int GL_DISPATCH_INDIRECT_BUFFER = 37102;

    /** Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_DISPATCH_INDIRECT_BUFFER_BINDING = 37103;

    /** Accepted by the {@code stages} parameter of UseProgramStages.*/
    int GL_COMPUTE_SHADER_BIT = 32;

    /** Tokens accepted by the {@code target} parameters of Enable, Disable, and  IsEnabled.*/
    int GL_DEBUG_OUTPUT = 37600;

    /** Tokens accepted by the {@code target} parameters of Enable, Disable, and  IsEnabled.*/
    int GL_DEBUG_OUTPUT_SYNCHRONOUS = 33346;

    /** Returned by GetIntegerv when {@code pname} is CONTEXT_FLAGS.*/
    int GL_CONTEXT_FLAG_DEBUG_BIT = 2;

    /** Tokens accepted by the {@code value} parameters of GetBooleanv, GetIntegerv,  GetFloatv, GetDoublev and GetInteger64v.*/
    int GL_MAX_DEBUG_MESSAGE_LENGTH = 37187;

    /** Tokens accepted by the {@code value} parameters of GetBooleanv, GetIntegerv,  GetFloatv, GetDoublev and GetInteger64v.*/
    int GL_MAX_DEBUG_LOGGED_MESSAGES = 37188;

    /** Tokens accepted by the {@code value} parameters of GetBooleanv, GetIntegerv,  GetFloatv, GetDoublev and GetInteger64v.*/
    int GL_DEBUG_LOGGED_MESSAGES = 37189;

    /** Tokens accepted by the {@code value} parameters of GetBooleanv, GetIntegerv,  GetFloatv, GetDoublev and GetInteger64v.*/
    int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH = 33347;

    /** Tokens accepted by the {@code value} parameters of GetBooleanv, GetIntegerv,  GetFloatv, GetDoublev and GetInteger64v.*/
    int GL_MAX_DEBUG_GROUP_STACK_DEPTH = 33388;

    /** Tokens accepted by the {@code value} parameters of GetBooleanv, GetIntegerv,  GetFloatv, GetDoublev and GetInteger64v.*/
    int GL_DEBUG_GROUP_STACK_DEPTH = 33389;

    /** Tokens accepted by the {@code value} parameters of GetBooleanv, GetIntegerv,  GetFloatv, GetDoublev and GetInteger64v.*/
    int GL_MAX_LABEL_LENGTH = 33512;

    /** Tokens accepted by the {@code pname} parameter of GetPointerv.*/
    int GL_DEBUG_CALLBACK_FUNCTION = 33348;

    /** Tokens accepted by the {@code pname} parameter of GetPointerv.*/
    int GL_DEBUG_CALLBACK_USER_PARAM = 33349;

    /** Tokens accepted or provided by the {@code source} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code sources} parameter of GetDebugMessageLog.*/
    int GL_DEBUG_SOURCE_API = 33350;

    /** Tokens accepted or provided by the {@code source} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code sources} parameter of GetDebugMessageLog.*/
    int GL_DEBUG_SOURCE_WINDOW_SYSTEM = 33351;

    /** Tokens accepted or provided by the {@code source} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code sources} parameter of GetDebugMessageLog.*/
    int GL_DEBUG_SOURCE_SHADER_COMPILER = 33352;

    /** Tokens accepted or provided by the {@code source} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code sources} parameter of GetDebugMessageLog.*/
    int GL_DEBUG_SOURCE_THIRD_PARTY = 33353;

    /** Tokens accepted or provided by the {@code source} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code sources} parameter of GetDebugMessageLog.*/
    int GL_DEBUG_SOURCE_APPLICATION = 33354;

    /** Tokens accepted or provided by the {@code source} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code sources} parameter of GetDebugMessageLog.*/
    int GL_DEBUG_SOURCE_OTHER = 33355;

    /** Tokens accepted or provided by the {@code type} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code types} parameter of GetDebugMessageLog.*/
    int GL_DEBUG_TYPE_ERROR = 33356;

    /** Tokens accepted or provided by the {@code type} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code types} parameter of GetDebugMessageLog.*/
    int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR = 33357;

    /** Tokens accepted or provided by the {@code type} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code types} parameter of GetDebugMessageLog.*/
    int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR = 33358;

    /** Tokens accepted or provided by the {@code type} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code types} parameter of GetDebugMessageLog.*/
    int GL_DEBUG_TYPE_PORTABILITY = 33359;

    /** Tokens accepted or provided by the {@code type} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code types} parameter of GetDebugMessageLog.*/
    int GL_DEBUG_TYPE_PERFORMANCE = 33360;

    /** Tokens accepted or provided by the {@code type} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code types} parameter of GetDebugMessageLog.*/
    int GL_DEBUG_TYPE_OTHER = 33361;

    /** Tokens accepted or provided by the {@code type} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code types} parameter of GetDebugMessageLog.*/
    int GL_DEBUG_TYPE_MARKER = 33384;

    /** Tokens accepted or provided by the {@code type} parameters of DebugMessageControl and DEBUGPROC, and the {@code types} parameter of GetDebugMessageLog.*/
    int GL_DEBUG_TYPE_PUSH_GROUP = 33385;

    /** Tokens accepted or provided by the {@code type} parameters of DebugMessageControl and DEBUGPROC, and the {@code types} parameter of GetDebugMessageLog.*/
    int GL_DEBUG_TYPE_POP_GROUP = 33386;

    /** Tokens accepted or provided by the {@code severity} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC callback functions, and the {@code severities} parameter of GetDebugMessageLog.*/
    int GL_DEBUG_SEVERITY_HIGH = 37190;

    /** Tokens accepted or provided by the {@code severity} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC callback functions, and the {@code severities} parameter of GetDebugMessageLog.*/
    int GL_DEBUG_SEVERITY_MEDIUM = 37191;

    /** Tokens accepted or provided by the {@code severity} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC callback functions, and the {@code severities} parameter of GetDebugMessageLog.*/
    int GL_DEBUG_SEVERITY_LOW = 37192;

    /** Tokens accepted or provided by the {@code severity} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC callback functions, and the {@code severities} parameter of GetDebugMessageLog.*/
    int GL_DEBUG_SEVERITY_NOTIFICATION = 33387;

    /** Tokens accepted or provided by the {@code identifier} parameters of ObjectLabel and GetObjectLabel.*/
    int GL_BUFFER = 33504;

    /** Tokens accepted or provided by the {@code identifier} parameters of ObjectLabel and GetObjectLabel.*/
    int GL_SHADER = 33505;

    /** Tokens accepted or provided by the {@code identifier} parameters of ObjectLabel and GetObjectLabel.*/
    int GL_PROGRAM = 33506;

    /** Tokens accepted or provided by the {@code identifier} parameters of ObjectLabel and GetObjectLabel.*/
    int GL_QUERY = 33507;

    /** Tokens accepted or provided by the {@code identifier} parameters of ObjectLabel and GetObjectLabel.*/
    int GL_PROGRAM_PIPELINE = 33508;

    /** Tokens accepted or provided by the {@code identifier} parameters of ObjectLabel and GetObjectLabel.*/
    int GL_SAMPLER = 33510;

    /** Tokens accepted or provided by the {@code identifier} parameters of ObjectLabel and GetObjectLabel.*/
    int GL_DISPLAY_LIST = 33511;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.*/
    int GL_MAX_UNIFORM_LOCATIONS = 33390;

    /** Accepted by the {@code pname} parameter of FramebufferParameteri, GetFramebufferParameteriv, NamedFramebufferParameteriEXT, and GetNamedFramebufferParameterivEXT.*/
    int GL_FRAMEBUFFER_DEFAULT_WIDTH = 37648;

    /** Accepted by the {@code pname} parameter of FramebufferParameteri, GetFramebufferParameteriv, NamedFramebufferParameteriEXT, and GetNamedFramebufferParameterivEXT.*/
    int GL_FRAMEBUFFER_DEFAULT_HEIGHT = 37649;

    /** Accepted by the {@code pname} parameter of FramebufferParameteri, GetFramebufferParameteriv, NamedFramebufferParameteriEXT, and GetNamedFramebufferParameterivEXT.*/
    int GL_FRAMEBUFFER_DEFAULT_LAYERS = 37650;

    /** Accepted by the {@code pname} parameter of FramebufferParameteri, GetFramebufferParameteriv, NamedFramebufferParameteriEXT, and GetNamedFramebufferParameterivEXT.*/
    int GL_FRAMEBUFFER_DEFAULT_SAMPLES = 37651;

    /** Accepted by the {@code pname} parameter of FramebufferParameteri, GetFramebufferParameteriv, NamedFramebufferParameteriEXT, and GetNamedFramebufferParameterivEXT.*/
    int GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS = 37652;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_FRAMEBUFFER_WIDTH = 37653;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_FRAMEBUFFER_HEIGHT = 37654;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_FRAMEBUFFER_LAYERS = 37655;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_FRAMEBUFFER_SAMPLES = 37656;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_INTERNALFORMAT_SUPPORTED = 33391;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_INTERNALFORMAT_PREFERRED = 33392;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_INTERNALFORMAT_RED_SIZE = 33393;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_INTERNALFORMAT_GREEN_SIZE = 33394;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_INTERNALFORMAT_BLUE_SIZE = 33395;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_INTERNALFORMAT_ALPHA_SIZE = 33396;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_INTERNALFORMAT_DEPTH_SIZE = 33397;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_INTERNALFORMAT_STENCIL_SIZE = 33398;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_INTERNALFORMAT_SHARED_SIZE = 33399;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_INTERNALFORMAT_RED_TYPE = 33400;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_INTERNALFORMAT_GREEN_TYPE = 33401;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_INTERNALFORMAT_BLUE_TYPE = 33402;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_INTERNALFORMAT_ALPHA_TYPE = 33403;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_INTERNALFORMAT_DEPTH_TYPE = 33404;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_INTERNALFORMAT_STENCIL_TYPE = 33405;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_MAX_WIDTH = 33406;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_MAX_HEIGHT = 33407;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_MAX_DEPTH = 33408;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_MAX_LAYERS = 33409;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_MAX_COMBINED_DIMENSIONS = 33410;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_COLOR_COMPONENTS = 33411;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_DEPTH_COMPONENTS = 33412;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_STENCIL_COMPONENTS = 33413;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_COLOR_RENDERABLE = 33414;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_DEPTH_RENDERABLE = 33415;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_STENCIL_RENDERABLE = 33416;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_FRAMEBUFFER_RENDERABLE = 33417;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_FRAMEBUFFER_RENDERABLE_LAYERED = 33418;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_FRAMEBUFFER_BLEND = 33419;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_READ_PIXELS = 33420;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_READ_PIXELS_FORMAT = 33421;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_READ_PIXELS_TYPE = 33422;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_TEXTURE_IMAGE_FORMAT = 33423;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_TEXTURE_IMAGE_TYPE = 33424;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_GET_TEXTURE_IMAGE_FORMAT = 33425;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_GET_TEXTURE_IMAGE_TYPE = 33426;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_MIPMAP = 33427;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_MANUAL_GENERATE_MIPMAP = 33428;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_AUTO_GENERATE_MIPMAP = 33429;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_COLOR_ENCODING = 33430;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_SRGB_READ = 33431;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_SRGB_WRITE = 33432;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_FILTER = 33434;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_VERTEX_TEXTURE = 33435;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_TESS_CONTROL_TEXTURE = 33436;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_TESS_EVALUATION_TEXTURE = 33437;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_GEOMETRY_TEXTURE = 33438;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_FRAGMENT_TEXTURE = 33439;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_COMPUTE_TEXTURE = 33440;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_TEXTURE_SHADOW = 33441;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_TEXTURE_GATHER = 33442;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_TEXTURE_GATHER_SHADOW = 33443;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_SHADER_IMAGE_LOAD = 33444;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_SHADER_IMAGE_STORE = 33445;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_SHADER_IMAGE_ATOMIC = 33446;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_IMAGE_TEXEL_SIZE = 33447;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_IMAGE_COMPATIBILITY_CLASS = 33448;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_IMAGE_PIXEL_FORMAT = 33449;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_IMAGE_PIXEL_TYPE = 33450;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_TEST = 33452;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_TEST = 33453;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_WRITE = 33454;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_WRITE = 33455;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_TEXTURE_COMPRESSED_BLOCK_WIDTH = 33457;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_TEXTURE_COMPRESSED_BLOCK_HEIGHT = 33458;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_TEXTURE_COMPRESSED_BLOCK_SIZE = 33459;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_CLEAR_BUFFER = 33460;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_TEXTURE_VIEW = 33461;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.*/
    int GL_VIEW_COMPATIBILITY_CLASS = 33462;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_FULL_SUPPORT = 33463;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_CAVEAT_SUPPORT = 33464;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_IMAGE_CLASS_4_X_32 = 33465;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_IMAGE_CLASS_2_X_32 = 33466;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_IMAGE_CLASS_1_X_32 = 33467;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_IMAGE_CLASS_4_X_16 = 33468;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_IMAGE_CLASS_2_X_16 = 33469;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_IMAGE_CLASS_1_X_16 = 33470;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_IMAGE_CLASS_4_X_8 = 33471;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_IMAGE_CLASS_2_X_8 = 33472;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_IMAGE_CLASS_1_X_8 = 33473;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_IMAGE_CLASS_11_11_10 = 33474;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_IMAGE_CLASS_10_10_10_2 = 33475;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_VIEW_CLASS_128_BITS = 33476;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_VIEW_CLASS_96_BITS = 33477;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_VIEW_CLASS_64_BITS = 33478;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_VIEW_CLASS_48_BITS = 33479;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_VIEW_CLASS_32_BITS = 33480;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_VIEW_CLASS_24_BITS = 33481;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_VIEW_CLASS_16_BITS = 33482;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_VIEW_CLASS_8_BITS = 33483;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_VIEW_CLASS_S3TC_DXT1_RGB = 33484;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_VIEW_CLASS_S3TC_DXT1_RGBA = 33485;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_VIEW_CLASS_S3TC_DXT3_RGBA = 33486;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_VIEW_CLASS_S3TC_DXT5_RGBA = 33487;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_VIEW_CLASS_RGTC1_RED = 33488;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_VIEW_CLASS_RGTC2_RG = 33489;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_VIEW_CLASS_BPTC_UNORM = 33490;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.*/
    int GL_VIEW_CLASS_BPTC_FLOAT = 33491;

    /** Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv, GetProgramResourceLocation, and GetProgramResourceLocationIndex.*/
    int GL_UNIFORM = 37601;

    /** Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv, GetProgramResourceLocation, and GetProgramResourceLocationIndex.*/
    int GL_UNIFORM_BLOCK = 37602;

    /** Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv, GetProgramResourceLocation, and GetProgramResourceLocationIndex.*/
    int GL_PROGRAM_INPUT = 37603;

    /** Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv, GetProgramResourceLocation, and GetProgramResourceLocationIndex.*/
    int GL_PROGRAM_OUTPUT = 37604;

    /** Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv, GetProgramResourceLocation, and GetProgramResourceLocationIndex.*/
    int GL_BUFFER_VARIABLE = 37605;

    /** Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv, GetProgramResourceLocation, and GetProgramResourceLocationIndex.*/
    int GL_SHADER_STORAGE_BLOCK = 37606;

    /** Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv, GetProgramResourceLocation, and GetProgramResourceLocationIndex.*/
    int GL_VERTEX_SUBROUTINE = 37608;

    /** Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv, GetProgramResourceLocation, and GetProgramResourceLocationIndex.*/
    int GL_TESS_CONTROL_SUBROUTINE = 37609;

    /** Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv, GetProgramResourceLocation, and GetProgramResourceLocationIndex.*/
    int GL_TESS_EVALUATION_SUBROUTINE = 37610;

    /** Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv, GetProgramResourceLocation, and GetProgramResourceLocationIndex.*/
    int GL_GEOMETRY_SUBROUTINE = 37611;

    /** Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv, GetProgramResourceLocation, and GetProgramResourceLocationIndex.*/
    int GL_FRAGMENT_SUBROUTINE = 37612;

    /** Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv, GetProgramResourceLocation, and GetProgramResourceLocationIndex.*/
    int GL_COMPUTE_SUBROUTINE = 37613;

    /** Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv, GetProgramResourceLocation, and GetProgramResourceLocationIndex.*/
    int GL_VERTEX_SUBROUTINE_UNIFORM = 37614;

    /** Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv, GetProgramResourceLocation, and GetProgramResourceLocationIndex.*/
    int GL_TESS_CONTROL_SUBROUTINE_UNIFORM = 37615;

    /** Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv, GetProgramResourceLocation, and GetProgramResourceLocationIndex.*/
    int GL_TESS_EVALUATION_SUBROUTINE_UNIFORM = 37616;

    /** Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv, GetProgramResourceLocation, and GetProgramResourceLocationIndex.*/
    int GL_GEOMETRY_SUBROUTINE_UNIFORM = 37617;

    /** Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv, GetProgramResourceLocation, and GetProgramResourceLocationIndex.*/
    int GL_FRAGMENT_SUBROUTINE_UNIFORM = 37618;

    /** Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv, GetProgramResourceLocation, and GetProgramResourceLocationIndex.*/
    int GL_COMPUTE_SUBROUTINE_UNIFORM = 37619;

    /** Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv, GetProgramResourceLocation, and GetProgramResourceLocationIndex.*/
    int GL_TRANSFORM_FEEDBACK_VARYING = 37620;

    /** Accepted by the {@code pname} parameter of GetProgramInterfaceiv.*/
    int GL_ACTIVE_RESOURCES = 37621;

    /** Accepted by the {@code pname} parameter of GetProgramInterfaceiv.*/
    int GL_MAX_NAME_LENGTH = 37622;

    /** Accepted by the {@code pname} parameter of GetProgramInterfaceiv.*/
    int GL_MAX_NUM_ACTIVE_VARIABLES = 37623;

    /** Accepted by the {@code pname} parameter of GetProgramInterfaceiv.*/
    int GL_MAX_NUM_COMPATIBLE_SUBROUTINES = 37624;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_NAME_LENGTH = 37625;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_TYPE = 37626;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_ARRAY_SIZE = 37627;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_OFFSET = 37628;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_BLOCK_INDEX = 37629;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_ARRAY_STRIDE = 37630;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_MATRIX_STRIDE = 37631;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_IS_ROW_MAJOR = 37632;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_ATOMIC_COUNTER_BUFFER_INDEX = 37633;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_BUFFER_BINDING = 37634;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_BUFFER_DATA_SIZE = 37635;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_NUM_ACTIVE_VARIABLES = 37636;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_ACTIVE_VARIABLES = 37637;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_REFERENCED_BY_VERTEX_SHADER = 37638;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_REFERENCED_BY_TESS_CONTROL_SHADER = 37639;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_REFERENCED_BY_TESS_EVALUATION_SHADER = 37640;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_REFERENCED_BY_GEOMETRY_SHADER = 37641;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_REFERENCED_BY_FRAGMENT_SHADER = 37642;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_REFERENCED_BY_COMPUTE_SHADER = 37643;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_TOP_LEVEL_ARRAY_SIZE = 37644;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_TOP_LEVEL_ARRAY_STRIDE = 37645;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_LOCATION = 37646;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_LOCATION_INDEX = 37647;

    /** Accepted in the {@code props} array of GetProgramResourceiv.*/
    int GL_IS_PER_PATCH = 37607;

    /** Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv.*/
    int GL_SHADER_STORAGE_BUFFER = 37074;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetIntegeri_v, GetBooleanv, GetInteger64v, GetFloatv, GetDoublev, GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, and GetInteger64i_v.*/
    int GL_SHADER_STORAGE_BUFFER_BINDING = 37075;

    /** Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, and GetInteger64i_v.*/
    int GL_SHADER_STORAGE_BUFFER_START = 37076;

    /** Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, and GetInteger64i_v.*/
    int GL_SHADER_STORAGE_BUFFER_SIZE = 37077;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_VERTEX_SHADER_STORAGE_BLOCKS = 37078;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS = 37079;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS = 37080;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS = 37081;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_FRAGMENT_SHADER_STORAGE_BLOCKS = 37082;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_COMPUTE_SHADER_STORAGE_BLOCKS = 37083;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_COMBINED_SHADER_STORAGE_BLOCKS = 37084;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS = 37085;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_MAX_SHADER_STORAGE_BLOCK_SIZE = 37086;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.*/
    int GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT = 37087;

    /** Accepted in the {@code barriers} bitfield in glMemoryBarrier.*/
    int GL_SHADER_STORAGE_BARRIER_BIT = 8192;

    /** Alias for the existing token MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS.*/
    int GL_MAX_COMBINED_SHADER_OUTPUT_RESOURCES = 36665;

    /** Accepted by the {@code pname} parameter of TexParameter* and GetTexParameter*.*/
    int GL_DEPTH_STENCIL_TEXTURE_MODE = 37098;

    /** Accepted by the {@code pname} parameter of GetTexLevelParameter.*/
    int GL_TEXTURE_BUFFER_OFFSET = 37277;

    /** Accepted by the {@code pname} parameter of GetTexLevelParameter.*/
    int GL_TEXTURE_BUFFER_SIZE = 37278;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT = 37279;

    /** Accepted by the {@code pname} parameters of GetTexParameterfv and  GetTexParameteriv.*/
    int GL_TEXTURE_VIEW_MIN_LEVEL = 33499;

    /** Accepted by the {@code pname} parameters of GetTexParameterfv and  GetTexParameteriv.*/
    int GL_TEXTURE_VIEW_NUM_LEVELS = 33500;

    /** Accepted by the {@code pname} parameters of GetTexParameterfv and  GetTexParameteriv.*/
    int GL_TEXTURE_VIEW_MIN_LAYER = 33501;

    /** Accepted by the {@code pname} parameters of GetTexParameterfv and  GetTexParameteriv.*/
    int GL_TEXTURE_VIEW_NUM_LAYERS = 33502;

    /** Accepted by the {@code pname} parameter of GetVertexAttrib*_2.*/
    int GL_VERTEX_ATTRIB_BINDING = 33492;

    /** Accepted by the {@code pname} parameter of GetVertexAttrib*_2.*/
    int GL_VERTEX_ATTRIB_RELATIVE_OFFSET = 33493;

    /** Accepted by the {@code target} parameter of GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, and GetInteger64i_v.*/
    int GL_VERTEX_BINDING_DIVISOR = 33494;

    /** Accepted by the {@code target} parameter of GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, and GetInteger64i_v.*/
    int GL_VERTEX_BINDING_OFFSET = 33495;

    /** Accepted by the {@code target} parameter of GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, and GetInteger64i_v.*/
    int GL_VERTEX_BINDING_STRIDE = 33496;

    /** Accepted by the {@code target} parameter of GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, and GetInteger64i_v.*/
    int GL_VERTEX_BINDING_BUFFER = 36687;

    /** Accepted by the {@code pname} parameter of GetIntegerv, ....*/
    int GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET = 33497;

    /** Accepted by the {@code pname} parameter of GetIntegerv, ....*/
    int GL_MAX_VERTEX_ATTRIB_BINDINGS = 33498;

    /** Fills a buffer object's data store with a fixed value.@param target the target of the operation. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43C#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43C#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param internalformat the internal format with which the data will be stored in the buffer object@param format the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>@param type the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>@param data the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the                       sub-range of the buffer is filled with zeros.@see <a href="https://docs.gl/gl4/glClearBufferData">Reference Page</a>*/
    void glClearBufferData(int target, int internalformat, int format, int type, ByteBuffer data);

    /** Fills a buffer object's data store with a fixed value.@param target the target of the operation. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43C#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43C#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param internalformat the internal format with which the data will be stored in the buffer object@param format the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>@param type the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>@param data the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the                       sub-range of the buffer is filled with zeros.@see <a href="https://docs.gl/gl4/glClearBufferData">Reference Page</a>*/
    void glClearBufferData(int target, int internalformat, int format, int type, ShortBuffer data);

    /** Fills a buffer object's data store with a fixed value.@param target the target of the operation. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43C#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43C#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param internalformat the internal format with which the data will be stored in the buffer object@param format the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>@param type the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>@param data the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the                       sub-range of the buffer is filled with zeros.@see <a href="https://docs.gl/gl4/glClearBufferData">Reference Page</a>*/
    void glClearBufferData(int target, int internalformat, int format, int type, IntBuffer data);

    /** Fills a buffer object's data store with a fixed value.@param target the target of the operation. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43C#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43C#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param internalformat the internal format with which the data will be stored in the buffer object@param format the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>@param type the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>@param data the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the                       sub-range of the buffer is filled with zeros.@see <a href="https://docs.gl/gl4/glClearBufferData">Reference Page</a>*/
    void glClearBufferData(int target, int internalformat, int format, int type, FloatBuffer data);

    /** Fills all or part of buffer object's data store with a fixed value.@param target the target of the operation. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43C#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43C#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param internalformat the internal format with which the data will be stored in the buffer object@param offset the offset, in basic machine units into the buffer object's data store at which to start filling@param size the size, in basic machine units of the range of the data store to fill@param format the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>@param type the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>@param data the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the                       sub-range of the buffer is filled with zeros.@see <a href="https://docs.gl/gl4/glClearBufferSubData">Reference Page</a>*/
    void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, ByteBuffer data);

    /** Fills all or part of buffer object's data store with a fixed value.@param target the target of the operation. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43C#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43C#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param internalformat the internal format with which the data will be stored in the buffer object@param offset the offset, in basic machine units into the buffer object's data store at which to start filling@param size the size, in basic machine units of the range of the data store to fill@param format the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>@param type the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>@param data the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the                       sub-range of the buffer is filled with zeros.@see <a href="https://docs.gl/gl4/glClearBufferSubData">Reference Page</a>*/
    void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, ShortBuffer data);

    /** Fills all or part of buffer object's data store with a fixed value.@param target the target of the operation. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43C#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43C#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param internalformat the internal format with which the data will be stored in the buffer object@param offset the offset, in basic machine units into the buffer object's data store at which to start filling@param size the size, in basic machine units of the range of the data store to fill@param format the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>@param type the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>@param data the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the                       sub-range of the buffer is filled with zeros.@see <a href="https://docs.gl/gl4/glClearBufferSubData">Reference Page</a>*/
    void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, IntBuffer data);

    /** Fills all or part of buffer object's data store with a fixed value.@param target the target of the operation. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43C#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43C#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param internalformat the internal format with which the data will be stored in the buffer object@param offset the offset, in basic machine units into the buffer object's data store at which to start filling@param size the size, in basic machine units of the range of the data store to fill@param format the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>@param type the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>@param data the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the                       sub-range of the buffer is filled with zeros.@see <a href="https://docs.gl/gl4/glClearBufferSubData">Reference Page</a>*/
    void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, FloatBuffer data);

    /** Launches one or more compute work groups.@param num_groups_x the number of work groups to be launched in the X dimension@param num_groups_y the number of work groups to be launched in the Y dimension@param num_groups_z the number of work groups to be launched in the Z dimension@see <a href="https://docs.gl/gl4/glDispatchCompute">Reference Page</a>*/
    void glDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z);

    /** Launches one or more compute work groups using parameters stored in a buffer. <p>The parameters addressed by indirect are packed a structure, which takes the form (in C):</p> <pre><code> typedef struct {     uint num_groups_x;     uint num_groups_y;     uint num_groups_z; } DispatchIndirectCommand;</code></pre> <p>A call to {@code glDispatchComputeIndirect} is equivalent, assuming no errors are generated, to:</p> <pre><code> cmd = (const DispatchIndirectCommand *)indirect; glDispatchCompute(cmd-&gt;num_groups_x, cmd-&gt;num_groups_y, cmd-&gt;num_groups_z);</code></pre>@param indirect the offset into the buffer object currently bound to the {@link GL43C#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER} buffer target at which the dispatch parameters are                 stored.@see <a href="https://docs.gl/gl4/glDispatchComputeIndirect">Reference Page</a>*/
    void glDispatchComputeIndirect(long indirect);

    /** Performs a raw data copy between two images.@param srcName the name of a texture or renderbuffer object from which to copy@param srcTarget the target representing the namespace of the source name {@code srcName}@param srcLevel the mipmap level to read from the source@param srcX the X coordinate of the left edge of the souce region to copy@param srcY the Y coordinate of the top edge of the souce region to copy@param srcZ the Z coordinate of the near edge of the souce region to copy@param dstName the name of a texture or renderbuffer object to which to copy@param dstTarget the target representing the namespace of the destination name {@code dstName}@param dstLevel the mipmap level to write to the source@param dstX the X coordinate of the left edge of the destination region@param dstY the Y coordinate of the top edge of the destination region@param dstZ the Z coordinate of the near edge of the destination region@param srcWidth the width of the region to be copied@param srcHeight the height of the region to be copied@param srcDepth the depth of the region to be copied@see <a href="https://docs.gl/gl4/glCopyImageSubData">Reference Page</a>*/
    void glCopyImageSubData(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth);

    /** Controls the volume of debug output in the active debug group, by disabling specific or groups of messages. <p>If {@code enabled} is {@link GL11#GL_TRUE TRUE}, the referenced subset of messages will be enabled. If {@link GL11#GL_FALSE FALSE}, then those messages will be disabled.</p> <p>This command can reference different subsets of messages by first considering the set of all messages, and filtering out messages based on the following ways:</p> <ul> <li>If {@code source}, {@code type}, or {@code severity} is {@link GL11#GL_DONT_CARE DONT_CARE}, the messages from all sources, of all types, or of all severities are referenced respectively.</li> <li>When values other than {@link GL11#GL_DONT_CARE DONT_CARE} are specified, all messages whose source, type, or severity match the specified {@code source}, {@code type}, or {@code severity} respectively will be referenced.</li> <li>If {@code count} is greater than zero, then {@code ids} is an array of {@code count} message IDs for the specified combination of {@code source} and {@code type}. In this case, if {@code source} or {@code type} is {@link GL11#GL_DONT_CARE DONT_CARE}, or {@code severity} is not {@link GL11#GL_DONT_CARE DONT_CARE}, the error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated.</li> </ul> <p>Unrecognized message IDs in {@code ids} are ignored. If {@code count} is zero, the value if {@code ids} is ignored.</p> <p>Although messages are grouped into an implicit hierarchy by their sources and types, there is no explicit per-source, per-type or per-severity enabled state. Instead, the enabled state is stored individually for each message. There is no difference between disabling all messages from one source in a single call, and individually disabling all messages from that source using their types and IDs.</p> <p>If the {@link GL43C#GL_DEBUG_OUTPUT DEBUG_OUTPUT} state is disabled the GL operates the same as if messages of every {@code source}, {@code type} or {@code severity} are disabled.</p>@param source the source of debug messages to enable or disable. One of:<br><table><tr><td>{@link GL43C#GL_DEBUG_SOURCE_API DEBUG_SOURCE_API}</td><td>{@link GL43C#GL_DEBUG_SOURCE_WINDOW_SYSTEM DEBUG_SOURCE_WINDOW_SYSTEM}</td><td>{@link GL43C#GL_DEBUG_SOURCE_SHADER_COMPILER DEBUG_SOURCE_SHADER_COMPILER}</td></tr><tr><td>{@link GL43C#GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}</td><td>{@link GL43C#GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}</td><td>{@link GL43C#GL_DEBUG_SOURCE_OTHER DEBUG_SOURCE_OTHER}</td></tr></table>@param type the type of debug messages to enable or disable. One of:<br><table><tr><td>{@link GL43C#GL_DEBUG_TYPE_ERROR DEBUG_TYPE_ERROR}</td><td>{@link GL43C#GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR DEBUG_TYPE_DEPRECATED_BEHAVIOR}</td><td>{@link GL43C#GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR DEBUG_TYPE_UNDEFINED_BEHAVIOR}</td></tr><tr><td>{@link GL43C#GL_DEBUG_TYPE_PORTABILITY DEBUG_TYPE_PORTABILITY}</td><td>{@link GL43C#GL_DEBUG_TYPE_PERFORMANCE DEBUG_TYPE_PERFORMANCE}</td><td>{@link GL43C#GL_DEBUG_TYPE_OTHER DEBUG_TYPE_OTHER}</td></tr><tr><td>{@link GL43C#GL_DEBUG_TYPE_MARKER DEBUG_TYPE_MARKER}</td></tr></table>@param severity the severity of debug messages to enable or disable. One of:<br><table><tr><td>{@link GL43C#GL_DEBUG_SEVERITY_HIGH DEBUG_SEVERITY_HIGH}</td><td>{@link GL43C#GL_DEBUG_SEVERITY_MEDIUM DEBUG_SEVERITY_MEDIUM}</td><td>{@link GL43C#GL_DEBUG_SEVERITY_LOW DEBUG_SEVERITY_LOW}</td></tr><tr><td>{@link GL43C#GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}</td></tr></table>@param ids an array of unsigned integers containing the ids of the messages to enable or disable@param enabled whether the selected messages should be enabled or disabled@see <a href="https://docs.gl/gl4/glDebugMessageControl">Reference Page</a>*/
    void glDebugMessageControl(int source, int type, int severity, IntBuffer ids, boolean enabled);

    /** Controls the volume of debug output in the active debug group, by disabling specific or groups of messages. <p>If {@code enabled} is {@link GL11#GL_TRUE TRUE}, the referenced subset of messages will be enabled. If {@link GL11#GL_FALSE FALSE}, then those messages will be disabled.</p> <p>This command can reference different subsets of messages by first considering the set of all messages, and filtering out messages based on the following ways:</p> <ul> <li>If {@code source}, {@code type}, or {@code severity} is {@link GL11#GL_DONT_CARE DONT_CARE}, the messages from all sources, of all types, or of all severities are referenced respectively.</li> <li>When values other than {@link GL11#GL_DONT_CARE DONT_CARE} are specified, all messages whose source, type, or severity match the specified {@code source}, {@code type}, or {@code severity} respectively will be referenced.</li> <li>If {@code count} is greater than zero, then {@code ids} is an array of {@code count} message IDs for the specified combination of {@code source} and {@code type}. In this case, if {@code source} or {@code type} is {@link GL11#GL_DONT_CARE DONT_CARE}, or {@code severity} is not {@link GL11#GL_DONT_CARE DONT_CARE}, the error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated.</li> </ul> <p>Unrecognized message IDs in {@code ids} are ignored. If {@code count} is zero, the value if {@code ids} is ignored.</p> <p>Although messages are grouped into an implicit hierarchy by their sources and types, there is no explicit per-source, per-type or per-severity enabled state. Instead, the enabled state is stored individually for each message. There is no difference between disabling all messages from one source in a single call, and individually disabling all messages from that source using their types and IDs.</p> <p>If the {@link GL43C#GL_DEBUG_OUTPUT DEBUG_OUTPUT} state is disabled the GL operates the same as if messages of every {@code source}, {@code type} or {@code severity} are disabled.</p>@param source the source of debug messages to enable or disable. One of:<br><table><tr><td>{@link GL43C#GL_DEBUG_SOURCE_API DEBUG_SOURCE_API}</td><td>{@link GL43C#GL_DEBUG_SOURCE_WINDOW_SYSTEM DEBUG_SOURCE_WINDOW_SYSTEM}</td><td>{@link GL43C#GL_DEBUG_SOURCE_SHADER_COMPILER DEBUG_SOURCE_SHADER_COMPILER}</td></tr><tr><td>{@link GL43C#GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}</td><td>{@link GL43C#GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}</td><td>{@link GL43C#GL_DEBUG_SOURCE_OTHER DEBUG_SOURCE_OTHER}</td></tr></table>@param type the type of debug messages to enable or disable. One of:<br><table><tr><td>{@link GL43C#GL_DEBUG_TYPE_ERROR DEBUG_TYPE_ERROR}</td><td>{@link GL43C#GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR DEBUG_TYPE_DEPRECATED_BEHAVIOR}</td><td>{@link GL43C#GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR DEBUG_TYPE_UNDEFINED_BEHAVIOR}</td></tr><tr><td>{@link GL43C#GL_DEBUG_TYPE_PORTABILITY DEBUG_TYPE_PORTABILITY}</td><td>{@link GL43C#GL_DEBUG_TYPE_PERFORMANCE DEBUG_TYPE_PERFORMANCE}</td><td>{@link GL43C#GL_DEBUG_TYPE_OTHER DEBUG_TYPE_OTHER}</td></tr><tr><td>{@link GL43C#GL_DEBUG_TYPE_MARKER DEBUG_TYPE_MARKER}</td></tr></table>@param severity the severity of debug messages to enable or disable. One of:<br><table><tr><td>{@link GL43C#GL_DEBUG_SEVERITY_HIGH DEBUG_SEVERITY_HIGH}</td><td>{@link GL43C#GL_DEBUG_SEVERITY_MEDIUM DEBUG_SEVERITY_MEDIUM}</td><td>{@link GL43C#GL_DEBUG_SEVERITY_LOW DEBUG_SEVERITY_LOW}</td></tr><tr><td>{@link GL43C#GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}</td></tr></table>@param enabled whether the selected messages should be enabled or disabled@see <a href="https://docs.gl/gl4/glDebugMessageControl">Reference Page</a>*/
    void glDebugMessageControl(int source, int type, int severity, int id, boolean enabled);

    /** This function can be called by applications and third-party libraries to generate their own messages, such as ones containing timestamp information or signals about specific render system events. <p>The value of {@code id} specifies the ID for the message and {@code severity} indicates its severity level as defined by the caller. The string {@code buf} contains the string representation of the message. The parameter {@code length} contains the number of characters in {@code buf}. If {@code length} is negative, it is implied that {@code buf} contains a null terminated string. The error {@link GL11#GL_INVALID_VALUE INVALID_VALUE} will be generated if the number of characters in {@code buf}, excluding the null terminator when {@code length} is negative, is not less than the value of {@link GL43C#GL_MAX_DEBUG_MESSAGE_LENGTH MAX_DEBUG_MESSAGE_LENGTH}.</p> <p>If the {@link GL43C#GL_DEBUG_OUTPUT DEBUG_OUTPUT} state is disabled calls to DebugMessageInsert are discarded and do not generate an error.</p>@param source the source of the debug message to insert. One of:<br><table><tr><td>{@link GL43C#GL_DEBUG_SOURCE_API DEBUG_SOURCE_API}</td><td>{@link GL43C#GL_DEBUG_SOURCE_WINDOW_SYSTEM DEBUG_SOURCE_WINDOW_SYSTEM}</td><td>{@link GL43C#GL_DEBUG_SOURCE_SHADER_COMPILER DEBUG_SOURCE_SHADER_COMPILER}</td></tr><tr><td>{@link GL43C#GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}</td><td>{@link GL43C#GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}</td><td>{@link GL43C#GL_DEBUG_SOURCE_OTHER DEBUG_SOURCE_OTHER}</td></tr></table>@param type the type of the debug message insert. One of:<br><table><tr><td>{@link GL43C#GL_DEBUG_TYPE_ERROR DEBUG_TYPE_ERROR}</td><td>{@link GL43C#GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR DEBUG_TYPE_DEPRECATED_BEHAVIOR}</td><td>{@link GL43C#GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR DEBUG_TYPE_UNDEFINED_BEHAVIOR}</td></tr><tr><td>{@link GL43C#GL_DEBUG_TYPE_PORTABILITY DEBUG_TYPE_PORTABILITY}</td><td>{@link GL43C#GL_DEBUG_TYPE_PERFORMANCE DEBUG_TYPE_PERFORMANCE}</td><td>{@link GL43C#GL_DEBUG_TYPE_OTHER DEBUG_TYPE_OTHER}</td></tr><tr><td>{@link GL43C#GL_DEBUG_TYPE_MARKER DEBUG_TYPE_MARKER}</td></tr></table>@param id the user-supplied identifier of the message to insert. One of:<br><table><tr><td>{@link GL43C#GL_DEBUG_SEVERITY_HIGH DEBUG_SEVERITY_HIGH}</td><td>{@link GL43C#GL_DEBUG_SEVERITY_MEDIUM DEBUG_SEVERITY_MEDIUM}</td><td>{@link GL43C#GL_DEBUG_SEVERITY_LOW DEBUG_SEVERITY_LOW}</td></tr><tr><td>{@link GL43C#GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}</td></tr></table>@param severity the severity of the debug messages to insert@param message a character array containing the message to insert@see <a href="https://docs.gl/gl4/glDebugMessageInsert">Reference Page</a>*/
    void glDebugMessageInsert(int source, int type, int id, int severity, ByteBuffer message);

    /** This function can be called by applications and third-party libraries to generate their own messages, such as ones containing timestamp information or signals about specific render system events. <p>The value of {@code id} specifies the ID for the message and {@code severity} indicates its severity level as defined by the caller. The string {@code buf} contains the string representation of the message. The parameter {@code length} contains the number of characters in {@code buf}. If {@code length} is negative, it is implied that {@code buf} contains a null terminated string. The error {@link GL11#GL_INVALID_VALUE INVALID_VALUE} will be generated if the number of characters in {@code buf}, excluding the null terminator when {@code length} is negative, is not less than the value of {@link GL43C#GL_MAX_DEBUG_MESSAGE_LENGTH MAX_DEBUG_MESSAGE_LENGTH}.</p> <p>If the {@link GL43C#GL_DEBUG_OUTPUT DEBUG_OUTPUT} state is disabled calls to DebugMessageInsert are discarded and do not generate an error.</p>@param source the source of the debug message to insert. One of:<br><table><tr><td>{@link GL43C#GL_DEBUG_SOURCE_API DEBUG_SOURCE_API}</td><td>{@link GL43C#GL_DEBUG_SOURCE_WINDOW_SYSTEM DEBUG_SOURCE_WINDOW_SYSTEM}</td><td>{@link GL43C#GL_DEBUG_SOURCE_SHADER_COMPILER DEBUG_SOURCE_SHADER_COMPILER}</td></tr><tr><td>{@link GL43C#GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}</td><td>{@link GL43C#GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}</td><td>{@link GL43C#GL_DEBUG_SOURCE_OTHER DEBUG_SOURCE_OTHER}</td></tr></table>@param type the type of the debug message insert. One of:<br><table><tr><td>{@link GL43C#GL_DEBUG_TYPE_ERROR DEBUG_TYPE_ERROR}</td><td>{@link GL43C#GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR DEBUG_TYPE_DEPRECATED_BEHAVIOR}</td><td>{@link GL43C#GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR DEBUG_TYPE_UNDEFINED_BEHAVIOR}</td></tr><tr><td>{@link GL43C#GL_DEBUG_TYPE_PORTABILITY DEBUG_TYPE_PORTABILITY}</td><td>{@link GL43C#GL_DEBUG_TYPE_PERFORMANCE DEBUG_TYPE_PERFORMANCE}</td><td>{@link GL43C#GL_DEBUG_TYPE_OTHER DEBUG_TYPE_OTHER}</td></tr><tr><td>{@link GL43C#GL_DEBUG_TYPE_MARKER DEBUG_TYPE_MARKER}</td></tr></table>@param id the user-supplied identifier of the message to insert. One of:<br><table><tr><td>{@link GL43C#GL_DEBUG_SEVERITY_HIGH DEBUG_SEVERITY_HIGH}</td><td>{@link GL43C#GL_DEBUG_SEVERITY_MEDIUM DEBUG_SEVERITY_MEDIUM}</td><td>{@link GL43C#GL_DEBUG_SEVERITY_LOW DEBUG_SEVERITY_LOW}</td></tr><tr><td>{@link GL43C#GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}</td></tr></table>@param severity the severity of the debug messages to insert@param message a character array containing the message to insert@see <a href="https://docs.gl/gl4/glDebugMessageInsert">Reference Page</a>*/
    void glDebugMessageInsert(int source, int type, int id, int severity, CharSequence message);

    /** Specifies a callback to receive debugging messages from the GL. <p>The function's prototype must follow the type definition of DEBUGPROC including its platform-dependent calling convention. Anything else will result in undefined behavior. Only one debug callback can be specified for the current context, and further calls overwrite the previous callback. Specifying {@code NULL} as the value of {@code callback} clears the current callback and disables message output through callbacks. Applications can provide user-specified data through the pointer {@code userParam}. The context will store this pointer and will include it as one of the parameters in each call to the callback function.</p> <p>If the application has specified a callback function for receiving debug output, the implementation will call that function whenever any enabled message is generated.  The source, type, ID, and severity of the message are specified by the DEBUGPROC parameters {@code source}, {@code type}, {@code id}, and {@code severity}, respectively. The string representation of the message is stored in {@code message} and its length (excluding the null-terminator) is stored in {@code length}. The parameter {@code userParam} is the user-specified parameter that was given when calling DebugMessageCallback.</p> <p>Applications can query the current callback function and the current user-specified parameter by obtaining the values of {@link GL43C#GL_DEBUG_CALLBACK_FUNCTION DEBUG_CALLBACK_FUNCTION} and {@link GL43C#GL_DEBUG_CALLBACK_USER_PARAM DEBUG_CALLBACK_USER_PARAM}, respectively.</p> <p>Applications that specify a callback function must be aware of certain special conditions when executing code inside a callback when it is called by the GL, regardless of the debug source.</p> <p>The memory for {@code message} is owned and managed by the GL, and should only be considered valid for the duration of the function call.</p> <p>The behavior of calling any GL or window system function from within the callback function is undefined and may lead to program termination.</p> <p>Care must also be taken in securing debug callbacks for use with asynchronous debug output by multi-threaded GL implementations.</p> <p>If the {@link GL43C#GL_DEBUG_OUTPUT DEBUG_OUTPUT} state is disabled then the GL will not call the callback function.</p>@param callback a callback function that will be called when a debug message is generated@param userParam a user supplied pointer that will be passed on each invocation of {@code callback}@see <a href="https://docs.gl/gl4/glDebugMessageCallback">Reference Page</a>*/
    void glDebugMessageCallback(GLDebugMessageCallbackI callback, long userParam);

    /** Retrieves messages from the debug message log. <p>This function fetches a maximum of {@code count} messages from the message log, and will return the number of messages successfully fetched.</p> <p>Messages will be fetched from the log in order of oldest to newest. Those messages that were fetched will be removed from the log.</p> <p>The sources, types, severities, IDs, and string lengths of fetched messages will be stored in the application-provided arrays {@code sources}, {@code types}, {@code severities}, {@code ids}, and {@code lengths}, respectively. The application is responsible for allocating enough space for each array to hold up to {@code count} elements. The string representations of all fetched messages are stored in the {@code messageLog} array. If multiple messages are fetched, their strings are concatenated into the same {@code messageLog} array and will be separated by single null terminators. The last string in the array will also be null-terminated. The maximum size of {@code messageLog}, including the space used by all null terminators, is given by {@code bufSize}. If {@code bufSize} is less than zero and {@code messageLog} is not {@code NULL}, an {@link GL11#GL_INVALID_VALUE INVALID_VALUE} error will be generated. If a message's string, including its null terminator, can not fully fit within the {@code messageLog} array's remaining space, then that message and any subsequent messages will not be fetched and will remain in the log. The string lengths stored in the array {@code lengths} include the space for the null terminator of each string.</p> <p>Any or all of the arrays {@code sources}, {@code types}, {@code ids}, {@code severities}, {@code lengths} and {@code messageLog} can also be null pointers, which causes the attributes for such arrays to be discarded when messages are fetched, however those messages will still be removed from the log. Thus to simply delete up to {@code count} messages from the message log while ignoring their attributes, the application can call the function with null pointers for all attribute arrays.</p> <p>If the context was created without the {@link GL43C#GL_CONTEXT_FLAG_DEBUG_BIT CONTEXT_FLAG_DEBUG_BIT} in the {@link GL30#GL_CONTEXT_FLAGS CONTEXT_FLAGS} state, then the GL can opt to never add messages to the message log so GetDebugMessageLog will always return zero.</p>@param count the number of debug messages to retrieve from the log@param sources an array of variables to receive the sources of the retrieved messages@param types an array of variables to receive the types of the retrieved messages@param ids an array of unsigned integers to receive the ids of the retrieved messages@param severities an array of variables to receive the severites of the retrieved messages@param lengths an array of variables to receive the lengths of the received messages@param messageLog an array of characters that will receive the messages@see <a href="https://docs.gl/gl4/glGetDebugMessageLog">Reference Page</a>*/
    int glGetDebugMessageLog(int count, IntBuffer sources, IntBuffer types, IntBuffer ids, IntBuffer severities, IntBuffer lengths, ByteBuffer messageLog);

    /** Pushes a debug group described by the string {@code message} into the command stream. The value of {@code id} specifies the ID of messages generated. The parameter {@code length} contains the number of characters in {@code message}. If {@code length} is negative, it is implied that {@code message} contains a null terminated string. The message has the specified {@code source} and {@code id}, {@code type} {@link GL43C#GL_DEBUG_TYPE_PUSH_GROUP DEBUG_TYPE_PUSH_GROUP}, and {@code severity} {@link GL43C#GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}. The GL will put a new debug group on top of the debug group stack which inherits the control of the volume of debug output of the debug group previously residing on the top of the debug group stack. Because debug groups are strictly hierarchical, any additional control of the debug output volume will only apply within the active debug group and the debug groups pushed on top of the active debug group. <p>An {@link GL11#GL_INVALID_ENUM INVALID_ENUM} error is generated if the value of {@code source} is neither {@link GL43C#GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION} nor {@link GL43C#GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}. An {@link GL11#GL_INVALID_VALUE INVALID_VALUE} error is generated if {@code length} is negative and the number of characters in {@code message}, excluding the null-terminator, is not less than the value of {@link GL43C#GL_MAX_DEBUG_MESSAGE_LENGTH MAX_DEBUG_MESSAGE_LENGTH}.</p>@param source the source of the debug message. One of:<br><table><tr><td>{@link GL43C#GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}</td><td>{@link GL43C#GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}</td></tr></table>@param id the identifier of the message@param message a string containing the message to be sent to the debug output stream@see <a href="https://docs.gl/gl4/glPushDebugGroup">Reference Page</a>*/
    void glPushDebugGroup(int source, int id, ByteBuffer message);

    /** Pushes a debug group described by the string {@code message} into the command stream. The value of {@code id} specifies the ID of messages generated. The parameter {@code length} contains the number of characters in {@code message}. If {@code length} is negative, it is implied that {@code message} contains a null terminated string. The message has the specified {@code source} and {@code id}, {@code type} {@link GL43C#GL_DEBUG_TYPE_PUSH_GROUP DEBUG_TYPE_PUSH_GROUP}, and {@code severity} {@link GL43C#GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}. The GL will put a new debug group on top of the debug group stack which inherits the control of the volume of debug output of the debug group previously residing on the top of the debug group stack. Because debug groups are strictly hierarchical, any additional control of the debug output volume will only apply within the active debug group and the debug groups pushed on top of the active debug group. <p>An {@link GL11#GL_INVALID_ENUM INVALID_ENUM} error is generated if the value of {@code source} is neither {@link GL43C#GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION} nor {@link GL43C#GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}. An {@link GL11#GL_INVALID_VALUE INVALID_VALUE} error is generated if {@code length} is negative and the number of characters in {@code message}, excluding the null-terminator, is not less than the value of {@link GL43C#GL_MAX_DEBUG_MESSAGE_LENGTH MAX_DEBUG_MESSAGE_LENGTH}.</p>@param source the source of the debug message. One of:<br><table><tr><td>{@link GL43C#GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}</td><td>{@link GL43C#GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}</td></tr></table>@param id the identifier of the message@param message a string containing the message to be sent to the debug output stream@see <a href="https://docs.gl/gl4/glPushDebugGroup">Reference Page</a>*/
    void glPushDebugGroup(int source, int id, CharSequence message);

    /** Pops the active debug group. When a debug group is popped, the GL will also generate a debug output message describing its cause based on the {@code message} string, the source {@code source}, and an ID {@code id} submitted to the associated {@link #glPushDebugGroup PushDebugGroup} command. {@link GL43C#GL_DEBUG_TYPE_PUSH_GROUP DEBUG_TYPE_PUSH_GROUP} and {@link GL43C#GL_DEBUG_TYPE_POP_GROUP DEBUG_TYPE_POP_GROUP} share a single namespace for message {@code id}. {@code severity} has the value {@link GL43C#GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}. The {@code type} has the value {@link GL43C#GL_DEBUG_TYPE_POP_GROUP DEBUG_TYPE_POP_GROUP}. Popping a debug group restores the debug output volume control of the parent debug group. <p>Attempting to pop the default debug group off the stack generates a {@link GL11#GL_STACK_UNDERFLOW STACK_UNDERFLOW} error; pushing a debug group onto a stack containing {@link GL43C#GL_MAX_DEBUG_GROUP_STACK_DEPTH MAX_DEBUG_GROUP_STACK_DEPTH} minus one elements will generate a {@link GL11#GL_STACK_OVERFLOW STACK_OVERFLOW} error.</p>@see <a href="https://docs.gl/gl4/glPopDebugGroup">Reference Page</a>*/
    void glPopDebugGroup();

    /** Labels a named object identified within a namespace.@param identifier the namespace from which the name of the object is allocated. One of:<br><table><tr><td>{@link GL43C#GL_BUFFER BUFFER}</td><td>{@link GL43C#GL_SHADER SHADER}</td><td>{@link GL43C#GL_PROGRAM PROGRAM}</td><td>{@link GL43C#GL_QUERY QUERY}</td><td>{@link GL43C#GL_PROGRAM_PIPELINE PROGRAM_PIPELINE}</td><td>{@link GL43C#GL_SAMPLER SAMPLER}</td><td>{@link GL11#GL_VERTEX_ARRAY VERTEX_ARRAY}</td><td>{@link GL11#GL_TEXTURE TEXTURE}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER RENDERBUFFER}</td><td>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL40#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}</td></tr></table>@param name the name of the object to label@param label a string containing the label to assign to the object@see <a href="https://docs.gl/gl4/glObjectLabel">Reference Page</a>*/
    void glObjectLabel(int identifier, int name, ByteBuffer label);

    /** Labels a named object identified within a namespace.@param identifier the namespace from which the name of the object is allocated. One of:<br><table><tr><td>{@link GL43C#GL_BUFFER BUFFER}</td><td>{@link GL43C#GL_SHADER SHADER}</td><td>{@link GL43C#GL_PROGRAM PROGRAM}</td><td>{@link GL43C#GL_QUERY QUERY}</td><td>{@link GL43C#GL_PROGRAM_PIPELINE PROGRAM_PIPELINE}</td><td>{@link GL43C#GL_SAMPLER SAMPLER}</td><td>{@link GL11#GL_VERTEX_ARRAY VERTEX_ARRAY}</td><td>{@link GL11#GL_TEXTURE TEXTURE}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER RENDERBUFFER}</td><td>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL40#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}</td></tr></table>@param name the name of the object to label@param label a string containing the label to assign to the object@see <a href="https://docs.gl/gl4/glObjectLabel">Reference Page</a>*/
    void glObjectLabel(int identifier, int name, CharSequence label);

    /** Retrieves the label of a named object identified within a namespace.@param identifier the namespace from which the name of the object is allocated. One of:<br><table><tr><td>{@link GL43C#GL_BUFFER BUFFER}</td><td>{@link GL43C#GL_SHADER SHADER}</td><td>{@link GL43C#GL_PROGRAM PROGRAM}</td><td>{@link GL43C#GL_QUERY QUERY}</td><td>{@link GL43C#GL_PROGRAM_PIPELINE PROGRAM_PIPELINE}</td><td>{@link GL43C#GL_SAMPLER SAMPLER}</td><td>{@link GL11#GL_VERTEX_ARRAY VERTEX_ARRAY}</td><td>{@link GL11#GL_TEXTURE TEXTURE}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER RENDERBUFFER}</td><td>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL40#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}</td></tr></table>@param name the name of the object whose label to retrieve@param length the address of a variable to receive the length of the object label@param label a string that will receive the object label@see <a href="https://docs.gl/gl4/glGetObjectLabel">Reference Page</a>*/
    void glGetObjectLabel(int identifier, int name, IntBuffer length, ByteBuffer label);

    /** Retrieves the label of a named object identified within a namespace.@param identifier the namespace from which the name of the object is allocated. One of:<br><table><tr><td>{@link GL43C#GL_BUFFER BUFFER}</td><td>{@link GL43C#GL_SHADER SHADER}</td><td>{@link GL43C#GL_PROGRAM PROGRAM}</td><td>{@link GL43C#GL_QUERY QUERY}</td><td>{@link GL43C#GL_PROGRAM_PIPELINE PROGRAM_PIPELINE}</td><td>{@link GL43C#GL_SAMPLER SAMPLER}</td><td>{@link GL11#GL_VERTEX_ARRAY VERTEX_ARRAY}</td><td>{@link GL11#GL_TEXTURE TEXTURE}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER RENDERBUFFER}</td><td>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL40#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}</td></tr></table>@param name the name of the object whose label to retrieve@param bufSize the length of the buffer whose address is in {@code label}@see <a href="https://docs.gl/gl4/glGetObjectLabel">Reference Page</a>*/
    String glGetObjectLabel(int identifier, int name, int bufSize);

    /** Retrieves the label of a named object identified within a namespace.@param identifier the namespace from which the name of the object is allocated. One of:<br><table><tr><td>{@link GL43C#GL_BUFFER BUFFER}</td><td>{@link GL43C#GL_SHADER SHADER}</td><td>{@link GL43C#GL_PROGRAM PROGRAM}</td><td>{@link GL43C#GL_QUERY QUERY}</td><td>{@link GL43C#GL_PROGRAM_PIPELINE PROGRAM_PIPELINE}</td><td>{@link GL43C#GL_SAMPLER SAMPLER}</td><td>{@link GL11#GL_VERTEX_ARRAY VERTEX_ARRAY}</td><td>{@link GL11#GL_TEXTURE TEXTURE}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER RENDERBUFFER}</td><td>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL40#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}</td></tr></table>@param name the name of the object whose label to retrieve@see <a href="https://docs.gl/gl4/glGetObjectLabel">Reference Page</a>*/
    String glGetObjectLabel(int identifier, int name);

    /** Labels a sync object identified by a pointer.@param ptr a pointer identifying a sync object@param label a string containing the label to assign to the object@see <a href="https://docs.gl/gl4/glObjectPtrLabel">Reference Page</a>*/
    void glObjectPtrLabel(long ptr, ByteBuffer label);

    /** Labels a sync object identified by a pointer.@param ptr a pointer identifying a sync object@param label a string containing the label to assign to the object@see <a href="https://docs.gl/gl4/glObjectPtrLabel">Reference Page</a>*/
    void glObjectPtrLabel(long ptr, CharSequence label);

    /** Retrieves the label of a sync object identified by a pointer.@param ptr the name of the sync object whose label to retrieve@param length a variable to receive the length of the object label@param label a string that will receive the object label@see <a href="https://docs.gl/gl4/glGetObjectPtrLabel">Reference Page</a>*/
    void glGetObjectPtrLabel(long ptr, IntBuffer length, ByteBuffer label);

    /** Retrieves the label of a sync object identified by a pointer.@param ptr the name of the sync object whose label to retrieve@param bufSize the length of the buffer whose address is in {@code label}@see <a href="https://docs.gl/gl4/glGetObjectPtrLabel">Reference Page</a>*/
    String glGetObjectPtrLabel(long ptr, int bufSize);

    /** Retrieves the label of a sync object identified by a pointer.@param ptr the name of the sync object whose label to retrieve@see <a href="https://docs.gl/gl4/glGetObjectPtrLabel">Reference Page</a>*/
    String glGetObjectPtrLabel(long ptr);

    /** Sets a named parameter of a framebuffer.@param target target of the operation. One of:<br><table><tr><td>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td><td>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}</td></tr></table>@param pname a token indicating the parameter to be modified. One of:<br><table><tr><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}</td><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}</td></tr><tr><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}</td><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}</td></tr><tr><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}</td></tr></table>@param param the new value for the parameter named {@code pname}@see <a href="https://docs.gl/gl4/glFramebufferParameteri">Reference Page</a>*/
    void glFramebufferParameteri(int target, int pname, int param);

    /** Retrieves a named parameter from a framebuffer.@param target target of the operation. One of:<br><table><tr><td>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td><td>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}</td></tr></table>@param pname a token indicating the parameter to be retrieved. One of:<br><table><tr><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}</td><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}</td></tr><tr><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}</td><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}</td></tr><tr><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}</td></tr></table>@param params a variable to receive the value of the parameter named {@code pname}@see <a href="https://docs.gl/gl4/glGetFramebufferParameter">Reference Page</a>*/
    void glGetFramebufferParameteriv(int target, int pname, IntBuffer params);

    /** Retrieves a named parameter from a framebuffer.@param target target of the operation. One of:<br><table><tr><td>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td><td>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}</td></tr></table>@param pname a token indicating the parameter to be retrieved. One of:<br><table><tr><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}</td><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}</td></tr><tr><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}</td><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}</td></tr><tr><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetFramebufferParameter">Reference Page</a>*/
    int glGetFramebufferParameteri(int target, int pname);

    /** Retrieves information about implementation-dependent support for internal formats.@param target the usage of the internal format. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL30#GL_RENDERBUFFER RENDERBUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>@param internalformat the internal format about which to retrieve information@param pname the type of information to query@param params a variable into which to write the retrieved information@see <a href="https://docs.gl/gl4/glGetInternalformat">Reference Page</a>*/
    void glGetInternalformati64v(int target, int internalformat, int pname, LongBuffer params);

    /** Retrieves information about implementation-dependent support for internal formats.@param target the usage of the internal format. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL30#GL_RENDERBUFFER RENDERBUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>@param internalformat the internal format about which to retrieve information@param pname the type of information to query@see <a href="https://docs.gl/gl4/glGetInternalformat">Reference Page</a>*/
    long glGetInternalformati64(int target, int internalformat, int pname);

    /** Invalidates a region of a texture image.@param texture the name of a texture object a subregion of which to invalidate@param level the level of detail of the texture object within which the region resides@param xoffset the X offset of the region to be invalidated@param yoffset the Y offset of the region to be invalidated@param zoffset the Z offset of the region to be invalidated@param width the width of the region to be invalidated@param height the height of the region to be invalidated@param depth the depth of the region to be invalidated@see <a href="https://docs.gl/gl4/glInvalidateTexSubImage">Reference Page</a>*/
    void glInvalidateTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth);

    /** Invalidates the entirety of a texture image.@param texture the name of a texture object to invalidate@param level the level of detail of the texture object to invalidate@see <a href="https://docs.gl/gl4/glInvalidateTexImage">Reference Page</a>*/
    void glInvalidateTexImage(int texture, int level);

    /** Invalidates a region of a buffer object's data store.@param buffer the name of a buffer object, a subrange of whose data store to invalidate@param offset the offset within the buffer's data store of the start of the range to be invalidated@param length the length of the range within the buffer's data store to be invalidated@see <a href="https://docs.gl/gl4/glInvalidateBufferSubData">Reference Page</a>*/
    void glInvalidateBufferSubData(int buffer, long offset, long length);

    /** Invalidates the content of a buffer object's data store.@param buffer the name of a buffer object whose data store to invalidate@see <a href="https://docs.gl/gl4/glInvalidateBufferData">Reference Page</a>*/
    void glInvalidateBufferData(int buffer);

    /** Invalidate the content some or all of a framebuffer object's attachments.@param target the target to which the framebuffer is attached. One of:<br><table><tr><td>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td><td>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td></tr></table>@param attachments the address of an array identifying the attachments to be invalidated@see <a href="https://docs.gl/gl4/glInvalidateFramebuffer">Reference Page</a>*/
    void glInvalidateFramebuffer(int target, IntBuffer attachments);

    /** Invalidate the content some or all of a framebuffer object's attachments.@param target the target to which the framebuffer is attached. One of:<br><table><tr><td>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td><td>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td></tr></table>@see <a href="https://docs.gl/gl4/glInvalidateFramebuffer">Reference Page</a>*/
    void glInvalidateFramebuffer(int target, int attachment);

    /** Invalidates the content of a region of some or all of a framebuffer object's attachments.@param target the target to which the framebuffer is attached. One of:<br><table><tr><td>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td><td>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td></tr></table>@param attachments an array identifying the attachments to be invalidated@param x the X offset of the region to be invalidated@param y the Y offset of the region to be invalidated@param width the width of the region to be invalidated@param height the height of the region to be invalidated@see <a href="https://docs.gl/gl4/glInvalidateSubFramebuffer">Reference Page</a>*/
    void glInvalidateSubFramebuffer(int target, IntBuffer attachments, int x, int y, int width, int height);

    /** Invalidates the content of a region of some or all of a framebuffer object's attachments.@param target the target to which the framebuffer is attached. One of:<br><table><tr><td>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td><td>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td></tr></table>@param x the X offset of the region to be invalidated@param y the Y offset of the region to be invalidated@param width the width of the region to be invalidated@param height the height of the region to be invalidated@see <a href="https://docs.gl/gl4/glInvalidateSubFramebuffer">Reference Page</a>*/
    void glInvalidateSubFramebuffer(int target, int attachment, int x, int y, int width, int height);

    /** Renders multiple sets of primitives from array data, taking parameters from memory. <p>The parameters addressed by {@code indirect} are packed into an array of structures, each element of which takes the form (in C):</p> <pre><code> typedef struct {     uint count;     uint primCount;     uint first;     uint baseInstance; } DrawArraysIndirectCommand;</code></pre> <p>A single call to {@code glMultiDrawArraysIndirect} is equivalent, assuming no errors are generated to:</p> <pre><code> const ubyte *ptr = (const ubyte *)indirect; for ( i = 0; i &lt; drawcount; i++ ) {     DrawArraysIndirect(mode, (DrawArraysIndirectCommand*)ptr);     if ( stride == 0 )         ptr += sizeof(DrawArraysIndirectCommand);     else         ptr += stride; }</code></pre>@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param indirect an array of structures containing the draw parameters@param drawcount the number of elements in the array of draw parameter structures@param stride the distance in basic machine units between elements of the draw parameter array@see <a href="https://docs.gl/gl4/glMultiDrawArraysIndirect">Reference Page</a>*/
    void glMultiDrawArraysIndirect(int mode, ByteBuffer indirect, int drawcount, int stride);

    /** Renders multiple sets of primitives from array data, taking parameters from memory. <p>The parameters addressed by {@code indirect} are packed into an array of structures, each element of which takes the form (in C):</p> <pre><code> typedef struct {     uint count;     uint primCount;     uint first;     uint baseInstance; } DrawArraysIndirectCommand;</code></pre> <p>A single call to {@code glMultiDrawArraysIndirect} is equivalent, assuming no errors are generated to:</p> <pre><code> const ubyte *ptr = (const ubyte *)indirect; for ( i = 0; i &lt; drawcount; i++ ) {     DrawArraysIndirect(mode, (DrawArraysIndirectCommand*)ptr);     if ( stride == 0 )         ptr += sizeof(DrawArraysIndirectCommand);     else         ptr += stride; }</code></pre>@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param indirect an array of structures containing the draw parameters@param drawcount the number of elements in the array of draw parameter structures@param stride the distance in basic machine units between elements of the draw parameter array@see <a href="https://docs.gl/gl4/glMultiDrawArraysIndirect">Reference Page</a>*/
    void glMultiDrawArraysIndirect(int mode, long indirect, int drawcount, int stride);

    /** Renders multiple sets of primitives from array data, taking parameters from memory. <p>The parameters addressed by {@code indirect} are packed into an array of structures, each element of which takes the form (in C):</p> <pre><code> typedef struct {     uint count;     uint primCount;     uint first;     uint baseInstance; } DrawArraysIndirectCommand;</code></pre> <p>A single call to {@code glMultiDrawArraysIndirect} is equivalent, assuming no errors are generated to:</p> <pre><code> const ubyte *ptr = (const ubyte *)indirect; for ( i = 0; i &lt; drawcount; i++ ) {     DrawArraysIndirect(mode, (DrawArraysIndirectCommand*)ptr);     if ( stride == 0 )         ptr += sizeof(DrawArraysIndirectCommand);     else         ptr += stride; }</code></pre>@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param indirect an array of structures containing the draw parameters@param drawcount the number of elements in the array of draw parameter structures@param stride the distance in basic machine units between elements of the draw parameter array@see <a href="https://docs.gl/gl4/glMultiDrawArraysIndirect">Reference Page</a>*/
    void glMultiDrawArraysIndirect(int mode, IntBuffer indirect, int drawcount, int stride);

    /** Renders multiple indexed primitives from array data, taking parameters from memory. <p>The parameters addressed by indirect are packed into a structure that takes the form (in C):</p> <pre><code> typedef struct {     uint count;     uint primCount;     uint firstIndex;     uint baseVertex;     uint baseInstance; } DrawElementsIndirectCommand;</code></pre> <p>A single call to {@code glMultiDrawElementsIndirect} is equivalent, assuming no errors are generated to:</p> <pre><code> const ubyte *ptr = (const ubyte *)indirect; for ( i = 0; i &lt; drawcount; i++ ) {     DrawElementsIndirect(mode, type, (DrawElementsIndirectCommand *)ptr);     if ( stride == 0 )         ptr += sizeof(DrawElementsIndirectCommand);     else         ptr += stride; }</code></pre>@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param type the type of data in the buffer bound to the GL_ELEMENT_ARRAY_BUFFER binding. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param indirect a structure containing an array of draw parameters@param drawcount the number of elements in the array addressed by {@code indirect}@param stride the distance in basic machine units between elements of the draw parameter array@see <a href="https://docs.gl/gl4/glMultiDrawElementsIndirect">Reference Page</a>*/
    void glMultiDrawElementsIndirect(int mode, int type, ByteBuffer indirect, int drawcount, int stride);

    /** Renders multiple indexed primitives from array data, taking parameters from memory. <p>The parameters addressed by indirect are packed into a structure that takes the form (in C):</p> <pre><code> typedef struct {     uint count;     uint primCount;     uint firstIndex;     uint baseVertex;     uint baseInstance; } DrawElementsIndirectCommand;</code></pre> <p>A single call to {@code glMultiDrawElementsIndirect} is equivalent, assuming no errors are generated to:</p> <pre><code> const ubyte *ptr = (const ubyte *)indirect; for ( i = 0; i &lt; drawcount; i++ ) {     DrawElementsIndirect(mode, type, (DrawElementsIndirectCommand *)ptr);     if ( stride == 0 )         ptr += sizeof(DrawElementsIndirectCommand);     else         ptr += stride; }</code></pre>@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param type the type of data in the buffer bound to the GL_ELEMENT_ARRAY_BUFFER binding. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param indirect a structure containing an array of draw parameters@param drawcount the number of elements in the array addressed by {@code indirect}@param stride the distance in basic machine units between elements of the draw parameter array@see <a href="https://docs.gl/gl4/glMultiDrawElementsIndirect">Reference Page</a>*/
    void glMultiDrawElementsIndirect(int mode, int type, long indirect, int drawcount, int stride);

    /** Renders multiple indexed primitives from array data, taking parameters from memory. <p>The parameters addressed by indirect are packed into a structure that takes the form (in C):</p> <pre><code> typedef struct {     uint count;     uint primCount;     uint firstIndex;     uint baseVertex;     uint baseInstance; } DrawElementsIndirectCommand;</code></pre> <p>A single call to {@code glMultiDrawElementsIndirect} is equivalent, assuming no errors are generated to:</p> <pre><code> const ubyte *ptr = (const ubyte *)indirect; for ( i = 0; i &lt; drawcount; i++ ) {     DrawElementsIndirect(mode, type, (DrawElementsIndirectCommand *)ptr);     if ( stride == 0 )         ptr += sizeof(DrawElementsIndirectCommand);     else         ptr += stride; }</code></pre>@param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@param type the type of data in the buffer bound to the GL_ELEMENT_ARRAY_BUFFER binding. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param indirect a structure containing an array of draw parameters@param drawcount the number of elements in the array addressed by {@code indirect}@param stride the distance in basic machine units between elements of the draw parameter array@see <a href="https://docs.gl/gl4/glMultiDrawElementsIndirect">Reference Page</a>*/
    void glMultiDrawElementsIndirect(int mode, int type, IntBuffer indirect, int drawcount, int stride);

    /** Queries a property of an interface in a program.@param program the name of a program object whose interface to query@param programInterface a token identifying the interface within {@code program} to query. One of:<br><table><tr><td>{@link GL43C#GL_UNIFORM UNIFORM}</td><td>{@link GL43C#GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link GL43C#GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link GL43C#GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link GL43C#GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link GL43C#GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>@param pname the name of the parameter within {@code programInterface} to query. One of:<br><table><tr><td>{@link GL43C#GL_ACTIVE_RESOURCES ACTIVE_RESOURCES}</td><td>{@link GL43C#GL_MAX_NAME_LENGTH MAX_NAME_LENGTH}</td><td>{@link GL43C#GL_MAX_NUM_ACTIVE_VARIABLES MAX_NUM_ACTIVE_VARIABLES}</td></tr><tr><td>{@link GL43C#GL_MAX_NUM_COMPATIBLE_SUBROUTINES MAX_NUM_COMPATIBLE_SUBROUTINES}</td></tr></table>@param params a variable to retrieve the value of {@code pname} for the program interface@see <a href="https://docs.gl/gl4/glGetProgramInterface">Reference Page</a>*/
    void glGetProgramInterfaceiv(int program, int programInterface, int pname, IntBuffer params);

    /** Queries a property of an interface in a program.@param program the name of a program object whose interface to query@param programInterface a token identifying the interface within {@code program} to query. One of:<br><table><tr><td>{@link GL43C#GL_UNIFORM UNIFORM}</td><td>{@link GL43C#GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link GL43C#GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link GL43C#GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link GL43C#GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link GL43C#GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>@param pname the name of the parameter within {@code programInterface} to query. One of:<br><table><tr><td>{@link GL43C#GL_ACTIVE_RESOURCES ACTIVE_RESOURCES}</td><td>{@link GL43C#GL_MAX_NAME_LENGTH MAX_NAME_LENGTH}</td><td>{@link GL43C#GL_MAX_NUM_ACTIVE_VARIABLES MAX_NUM_ACTIVE_VARIABLES}</td></tr><tr><td>{@link GL43C#GL_MAX_NUM_COMPATIBLE_SUBROUTINES MAX_NUM_COMPATIBLE_SUBROUTINES}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetProgramInterface">Reference Page</a>*/
    int glGetProgramInterfacei(int program, int programInterface, int pname);

    /** Queries the index of a named resource within a program.@param program the name of a program object whose resources to query@param programInterface a token identifying the interface within {@code program} containing the resource named {Wcode name}. One of:<br><table><tr><td>{@link GL43C#GL_UNIFORM UNIFORM}</td><td>{@link GL43C#GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link GL43C#GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link GL43C#GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link GL43C#GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link GL43C#GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>@param name the name of the resource to query the index of@see <a href="https://docs.gl/gl4/glGetProgramResourceIndex">Reference Page</a>*/
    int glGetProgramResourceIndex(int program, int programInterface, ByteBuffer name);

    /** Queries the index of a named resource within a program.@param program the name of a program object whose resources to query@param programInterface a token identifying the interface within {@code program} containing the resource named {Wcode name}. One of:<br><table><tr><td>{@link GL43C#GL_UNIFORM UNIFORM}</td><td>{@link GL43C#GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link GL43C#GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link GL43C#GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link GL43C#GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link GL43C#GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>@param name the name of the resource to query the index of@see <a href="https://docs.gl/gl4/glGetProgramResourceIndex">Reference Page</a>*/
    int glGetProgramResourceIndex(int program, int programInterface, CharSequence name);

    /** Queries the name of an indexed resource within a program.@param program the name of a program object whose resources to query@param programInterface a token identifying the interface within {@code program} containing the indexed resource. One of:<br><table><tr><td>{@link GL43C#GL_UNIFORM UNIFORM}</td><td>{@link GL43C#GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link GL43C#GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link GL43C#GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link GL43C#GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link GL43C#GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>@param index the index of the resource within {@code programInterface} of {@code program}@param length a variable which will receive the length of the resource name@param name a character array into which will be written the name of the resource@see <a href="https://docs.gl/gl4/glGetProgramResourceName">Reference Page</a>*/
    void glGetProgramResourceName(int program, int programInterface, int index, IntBuffer length, ByteBuffer name);

    /** Queries the name of an indexed resource within a program.@param program the name of a program object whose resources to query@param programInterface a token identifying the interface within {@code program} containing the indexed resource. One of:<br><table><tr><td>{@link GL43C#GL_UNIFORM UNIFORM}</td><td>{@link GL43C#GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link GL43C#GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link GL43C#GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link GL43C#GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link GL43C#GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>@param index the index of the resource within {@code programInterface} of {@code program}@param bufSize the size of the character array whose address is given by {@code name}@see <a href="https://docs.gl/gl4/glGetProgramResourceName">Reference Page</a>*/
    String glGetProgramResourceName(int program, int programInterface, int index, int bufSize);

    /** Queries the name of an indexed resource within a program.@param program the name of a program object whose resources to query@param programInterface a token identifying the interface within {@code program} containing the indexed resource. One of:<br><table><tr><td>{@link GL43C#GL_UNIFORM UNIFORM}</td><td>{@link GL43C#GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link GL43C#GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link GL43C#GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link GL43C#GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link GL43C#GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>@param index the index of the resource within {@code programInterface} of {@code program}@see <a href="https://docs.gl/gl4/glGetProgramResourceName">Reference Page</a>*/
    String glGetProgramResourceName(int program, int programInterface, int index);

    /** Retrieves values for multiple properties of a single active resource within a program object.@param program the name of a program object whose resources to query@param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}. One of:<br><table><tr><td>{@link GL43C#GL_UNIFORM UNIFORM}</td><td>{@link GL43C#GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link GL43C#GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link GL43C#GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link GL43C#GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link GL43C#GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>@param index the active resource index@param props an array that will receive the active resource properties@param length a variable which will receive the number of values returned@param params an array that will receive the property values@see <a href="https://docs.gl/gl4/glGetProgramResource">Reference Page</a>*/
    void glGetProgramResourceiv(int program, int programInterface, int index, IntBuffer props, IntBuffer length, IntBuffer params);

    /** Queries the location of a named resource within a program.@param program the name of a program object whose resources to query@param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}@param name the name of the resource to query the location of@see <a href="https://docs.gl/gl4/glGetProgramResourceLocation">Reference Page</a>*/
    int glGetProgramResourceLocation(int program, int programInterface, ByteBuffer name);

    /** Queries the location of a named resource within a program.@param program the name of a program object whose resources to query@param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}@param name the name of the resource to query the location of@see <a href="https://docs.gl/gl4/glGetProgramResourceLocation">Reference Page</a>*/
    int glGetProgramResourceLocation(int program, int programInterface, CharSequence name);

    /** Queries the fragment color index of a named variable within a program.@param program the name of a program object whose resources to query@param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}. Must be:<br><table><tr><td>{@link GL43C#GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td></tr></table>@param name the name of the resource to query the location of@see <a href="https://docs.gl/gl4/glGetProgramResourceLocationIndex">Reference Page</a>*/
    int glGetProgramResourceLocationIndex(int program, int programInterface, ByteBuffer name);

    /** Queries the fragment color index of a named variable within a program.@param program the name of a program object whose resources to query@param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}. Must be:<br><table><tr><td>{@link GL43C#GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td></tr></table>@param name the name of the resource to query the location of@see <a href="https://docs.gl/gl4/glGetProgramResourceLocationIndex">Reference Page</a>*/
    int glGetProgramResourceLocationIndex(int program, int programInterface, CharSequence name);

    /** Changes an active shader storage block binding.@param program the name of the program containing the block whose binding to change@param storageBlockIndex the index storage block within the program@param storageBlockBinding the index storage block binding to associate with the specified storage block@see <a href="https://docs.gl/gl4/glShaderStorageBlockBinding">Reference Page</a>*/
    void glShaderStorageBlockBinding(int program, int storageBlockIndex, int storageBlockBinding);

    /** Binds a range of a buffer's data store to a buffer texture.@param target the target of the operation. Must be:<br><table><tr><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td></tr></table>@param internalformat the internal format of the data in the store belonging to {@code buffer}@param buffer the name of the buffer object whose storage to attach to the active buffer texture@param offset the offset of the start of the range of the buffer's data store to attach@param size the size of the range of the buffer's data store to attach@see <a href="https://docs.gl/gl4/glTexBufferRange">Reference Page</a>*/
    void glTexBufferRange(int target, int internalformat, int buffer, long offset, long size);

    /** Specifies storage for a two-dimensional multisample texture.@param target the target of the operation. One of:<br><table><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_PROXY_TEXTURE_2D_MULTISAMPLE PROXY_TEXTURE_2D_MULTISAMPLE}</td></tr></table>@param samples the number of samples in the texture@param internalformat the sized internal format to be used to store texture image data@param width the width of the texture, in texels@param height the height of the texture, in texels@param fixedsamplelocations whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not                             depend on the internal format or size of the image@see <a href="https://docs.gl/gl4/glTexStorage2DMultisample">Reference Page</a>*/
    void glTexStorage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations);

    /** Specifies storage for a two-dimensional multisample array texture.@param target the target of the operation. One of:<br><table><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td><td>{@link GL32#GL_PROXY_TEXTURE_2D_MULTISAMPLE PROXY_TEXTURE_2D_MULTISAMPLE}</td></tr></table>@param samples the number of samples in the texture@param internalformat the sized internal format to be used to store texture image data@param width the width of the texture, in texels@param height the height of the texture, in texels@param depth the depth of the texture, in texels@param fixedsamplelocations whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not                             depend on the internal format or size of the image@see <a href="https://docs.gl/gl4/glTexStorage3DMultisample">Reference Page</a>*/
    void glTexStorage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations);

    /** Initializes a texture as a data alias of another texture's data store.@param texture the texture object to be initialized as a view@param target the target to be used for the newly initialized texture@param origtexture the name of a texture object of which to make a view@param internalformat the internal format for the newly created view@param minlevel the  lowest level of detail of the view@param numlevels the number of levels of detail to include in the view@param minlayer the index of the first layer to include in the view@param numlayers the number of layers to include in the view@see <a href="https://docs.gl/gl4/glTextureView">Reference Page</a>*/
    void glTextureView(int texture, int target, int origtexture, int internalformat, int minlevel, int numlevels, int minlayer, int numlayers);

    /** Binds a buffer to a vertex buffer bind point.@param bindingindex the index of the vertex buffer binding point to which to bind the buffer@param buffer the name of an existing buffer to bind to the vertex buffer binding point@param offset the offset of the first element of the buffer@param stride the distance between elements within the buffer@see <a href="https://docs.gl/gl4/glBindVertexBuffer">Reference Page</a>*/
    void glBindVertexBuffer(int bindingindex, int buffer, long offset, int stride);

    /** Specifies the organization of data in vertex arrays.@param attribindex the generic vertex attribute array being described@param size the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>@param type the type of the data stored in the array@param normalized if true then integer data is normalized to the range [-1, 1] or [0, 1] if it is signed or unsigned, respectively. If false then integer data is                       directly converted to floating point.@param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from@see <a href="https://docs.gl/gl4/glVertexAttribFormat">Reference Page</a>*/
    void glVertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset);

    /** Specifies the organization of pure integer data in vertex arrays.@param attribindex the generic vertex attribute array being described@param size the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>@param type the type of the data stored in the array@param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from@see <a href="https://docs.gl/gl4/glVertexAttribIFormat">Reference Page</a>*/
    void glVertexAttribIFormat(int attribindex, int size, int type, int relativeoffset);

    /** Specifies the organization of 64-bit double data in vertex arrays.@param attribindex the generic vertex attribute array being described@param size the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>@param type the type of the data stored in the array@param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from@see <a href="https://docs.gl/gl4/glVertexAttribLFormat">Reference Page</a>*/
    void glVertexAttribLFormat(int attribindex, int size, int type, int relativeoffset);

    /** Associate a vertex attribute and a vertex buffer binding.@param attribindex the index of the attribute to associate with a vertex buffer binding@param bindingindex the index of the vertex buffer binding with which to associate the generic vertex attribute@see <a href="https://docs.gl/gl4/glVertexAttribBinding">Reference Page</a>*/
    void glVertexAttribBinding(int attribindex, int bindingindex);

    /** Modifies the rate at which generic vertex attributes advance during instanced rendering.@param bindingindex the index of the generic vertex attribute@param divisor the number of instances that will pass between updates of the generic attribute at slot {@code index}@see <a href="https://docs.gl/gl4/glVertexBindingDivisor">Reference Page</a>*/
    void glVertexBindingDivisor(int bindingindex, int divisor);

    /** Array version of: {@link #glClearBufferData ClearBufferData}@see <a href="https://docs.gl/gl4/glClearBufferData">Reference Page</a>*/
    void glClearBufferData(int target, int internalformat, int format, int type, short[] data);

    /** Array version of: {@link #glClearBufferData ClearBufferData}@see <a href="https://docs.gl/gl4/glClearBufferData">Reference Page</a>*/
    void glClearBufferData(int target, int internalformat, int format, int type, int[] data);

    /** Array version of: {@link #glClearBufferData ClearBufferData}@see <a href="https://docs.gl/gl4/glClearBufferData">Reference Page</a>*/
    void glClearBufferData(int target, int internalformat, int format, int type, float[] data);

    /** Array version of: {@link #glClearBufferSubData ClearBufferSubData}@see <a href="https://docs.gl/gl4/glClearBufferSubData">Reference Page</a>*/
    void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, short[] data);

    /** Array version of: {@link #glClearBufferSubData ClearBufferSubData}@see <a href="https://docs.gl/gl4/glClearBufferSubData">Reference Page</a>*/
    void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, int[] data);

    /** Array version of: {@link #glClearBufferSubData ClearBufferSubData}@see <a href="https://docs.gl/gl4/glClearBufferSubData">Reference Page</a>*/
    void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, float[] data);

    /** Array version of: {@link #glDebugMessageControl DebugMessageControl}@see <a href="https://docs.gl/gl4/glDebugMessageControl">Reference Page</a>*/
    void glDebugMessageControl(int source, int type, int severity, int[] ids, boolean enabled);

    /** Array version of: {@link #glGetDebugMessageLog GetDebugMessageLog}@see <a href="https://docs.gl/gl4/glGetDebugMessageLog">Reference Page</a>*/
    int glGetDebugMessageLog(int count, int[] sources, int[] types, int[] ids, int[] severities, int[] lengths, ByteBuffer messageLog);

    /** Array version of: {@link #glGetObjectLabel GetObjectLabel}@see <a href="https://docs.gl/gl4/glGetObjectLabel">Reference Page</a>*/
    void glGetObjectLabel(int identifier, int name, int[] length, ByteBuffer label);

    /** Array version of: {@link #glGetObjectPtrLabel GetObjectPtrLabel}@see <a href="https://docs.gl/gl4/glGetObjectPtrLabel">Reference Page</a>*/
    void glGetObjectPtrLabel(long ptr, int[] length, ByteBuffer label);

    /** Array version of: {@link #glGetFramebufferParameteriv GetFramebufferParameteriv}@see <a href="https://docs.gl/gl4/glGetFramebufferParameter">Reference Page</a>*/
    void glGetFramebufferParameteriv(int target, int pname, int[] params);

    /** Array version of: {@link #glGetInternalformati64v GetInternalformati64v}@see <a href="https://docs.gl/gl4/glGetInternalformat">Reference Page</a>*/
    void glGetInternalformati64v(int target, int internalformat, int pname, long[] params);

    /** Array version of: {@link #glInvalidateFramebuffer InvalidateFramebuffer}@see <a href="https://docs.gl/gl4/glInvalidateFramebuffer">Reference Page</a>*/
    void glInvalidateFramebuffer(int target, int[] attachments);

    /** Array version of: {@link #glInvalidateSubFramebuffer InvalidateSubFramebuffer}@see <a href="https://docs.gl/gl4/glInvalidateSubFramebuffer">Reference Page</a>*/
    void glInvalidateSubFramebuffer(int target, int[] attachments, int x, int y, int width, int height);

    /** Array version of: {@link #glMultiDrawArraysIndirect MultiDrawArraysIndirect}@see <a href="https://docs.gl/gl4/glMultiDrawArraysIndirect">Reference Page</a>*/
    void glMultiDrawArraysIndirect(int mode, int[] indirect, int drawcount, int stride);

    /** Array version of: {@link #glMultiDrawElementsIndirect MultiDrawElementsIndirect}@see <a href="https://docs.gl/gl4/glMultiDrawElementsIndirect">Reference Page</a>*/
    void glMultiDrawElementsIndirect(int mode, int type, int[] indirect, int drawcount, int stride);

    /** Array version of: {@link #glGetProgramInterfaceiv GetProgramInterfaceiv}@see <a href="https://docs.gl/gl4/glGetProgramInterface">Reference Page</a>*/
    void glGetProgramInterfaceiv(int program, int programInterface, int pname, int[] params);

    /** Array version of: {@link #glGetProgramResourceName GetProgramResourceName}@see <a href="https://docs.gl/gl4/glGetProgramResourceName">Reference Page</a>*/
    void glGetProgramResourceName(int program, int programInterface, int index, int[] length, ByteBuffer name);

    /** Array version of: {@link #glGetProgramResourceiv GetProgramResourceiv}@see <a href="https://docs.gl/gl4/glGetProgramResource">Reference Page</a>*/
    void glGetProgramResourceiv(int program, int programInterface, int index, int[] props, int[] length, int[] params);

}
