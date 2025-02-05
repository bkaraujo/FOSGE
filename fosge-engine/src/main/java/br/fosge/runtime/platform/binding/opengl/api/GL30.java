package br.fosge.runtime.platform.binding.opengl.api;

import org.lwjgl.PointerBuffer;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public interface GL30 {

    /** GetTarget*/
    int GL_MAJOR_VERSION = 33307;

    /** GetTarget*/
    int GL_MINOR_VERSION = 33308;

    /** GetTarget*/
    int GL_NUM_EXTENSIONS = 33309;

    /** GetTarget*/
    int GL_CONTEXT_FLAGS = 33310;

    /** GetTarget*/
    int GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT = 1;

    /** Renamed tokens.*/
    int GL_COMPARE_REF_TO_TEXTURE = GL14.GL_COMPARE_R_TO_TEXTURE;

    /** Renamed tokens.*/
    int GL_CLIP_DISTANCE0 = GL11.GL_CLIP_PLANE0;

    /** Renamed tokens.*/
    int GL_CLIP_DISTANCE1 = GL11.GL_CLIP_PLANE1;

    /** Renamed tokens.*/
    int GL_CLIP_DISTANCE2 = GL11.GL_CLIP_PLANE2;

    /** Renamed tokens.*/
    int GL_CLIP_DISTANCE3 = GL11.GL_CLIP_PLANE3;

    /** Renamed tokens.*/
    int GL_CLIP_DISTANCE4 = GL11.GL_CLIP_PLANE4;

    /** Renamed tokens.*/
    int GL_CLIP_DISTANCE5 = GL11.GL_CLIP_PLANE5;

    /** Renamed tokens.*/
    int GL_CLIP_DISTANCE6 = 12294;

    /** Renamed tokens.*/
    int GL_CLIP_DISTANCE7 = 12295;

    /** Renamed tokens.*/
    int GL_MAX_CLIP_DISTANCES = GL11.GL_MAX_CLIP_PLANES;

    /** Renamed tokens.*/
    int GL_MAX_VARYING_COMPONENTS = GL20.GL_MAX_VARYING_FLOATS;

    /** Accepted by the {@code pname} parameters of GetVertexAttribdv, GetVertexAttribfv, GetVertexAttribiv, GetVertexAttribIuiv and GetVertexAttribIiv.*/
    int GL_VERTEX_ATTRIB_ARRAY_INTEGER = 35069;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_SAMPLER_1D_ARRAY = 36288;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_SAMPLER_2D_ARRAY = 36289;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_SAMPLER_1D_ARRAY_SHADOW = 36291;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_SAMPLER_2D_ARRAY_SHADOW = 36292;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_SAMPLER_CUBE_SHADOW = 36293;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_VEC2 = 36294;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_VEC3 = 36295;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_VEC4 = 36296;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_SAMPLER_1D = 36297;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_SAMPLER_2D = 36298;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_SAMPLER_3D = 36299;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_SAMPLER_CUBE = 36300;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_SAMPLER_1D_ARRAY = 36302;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_INT_SAMPLER_2D_ARRAY = 36303;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_SAMPLER_1D = 36305;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_SAMPLER_2D = 36306;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_SAMPLER_3D = 36307;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_SAMPLER_CUBE = 36308;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_SAMPLER_1D_ARRAY = 36310;

    /** Returned by the {@code type} parameter of GetActiveUniform.*/
    int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY = 36311;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MIN_PROGRAM_TEXEL_OFFSET = 35076;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_PROGRAM_TEXEL_OFFSET = 35077;

    /** Accepted by the {@code mode} parameter of BeginConditionalRender.*/
    int GL_QUERY_WAIT = 36371;

    /** Accepted by the {@code mode} parameter of BeginConditionalRender.*/
    int GL_QUERY_NO_WAIT = 36372;

    /** Accepted by the {@code mode} parameter of BeginConditionalRender.*/
    int GL_QUERY_BY_REGION_WAIT = 36373;

    /** Accepted by the {@code mode} parameter of BeginConditionalRender.*/
    int GL_QUERY_BY_REGION_NO_WAIT = 36374;

    /** Accepted by the {@code access} parameter of MapBufferRange.*/
    int GL_MAP_READ_BIT = 1;

    /** Accepted by the {@code access} parameter of MapBufferRange.*/
    int GL_MAP_WRITE_BIT = 2;

    /** Accepted by the {@code access} parameter of MapBufferRange.*/
    int GL_MAP_INVALIDATE_RANGE_BIT = 4;

    /** Accepted by the {@code access} parameter of MapBufferRange.*/
    int GL_MAP_INVALIDATE_BUFFER_BIT = 8;

    /** Accepted by the {@code access} parameter of MapBufferRange.*/
    int GL_MAP_FLUSH_EXPLICIT_BIT = 16;

    /** Accepted by the {@code access} parameter of MapBufferRange.*/
    int GL_MAP_UNSYNCHRONIZED_BIT = 32;

    /** Accepted by the {@code pname} parameter of GetBufferParameteriv.*/
    int GL_BUFFER_ACCESS_FLAGS = 37151;

    /** Accepted by the {@code pname} parameter of GetBufferParameteriv.*/
    int GL_BUFFER_MAP_LENGTH = 37152;

    /** Accepted by the {@code pname} parameter of GetBufferParameteriv.*/
    int GL_BUFFER_MAP_OFFSET = 37153;

    /** Accepted by the {@code target} parameter of ClampColor and the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_CLAMP_VERTEX_COLOR = 35098;

    /** Accepted by the {@code target} parameter of ClampColor and the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_CLAMP_FRAGMENT_COLOR = 35099;

    /** Accepted by the {@code target} parameter of ClampColor and the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_CLAMP_READ_COLOR = 35100;

    /** Accepted by the {@code clamp} parameter of ClampColor.*/
    int GL_FIXED_ONLY = 35101;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage, and returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.*/
    int GL_DEPTH_COMPONENT32F = 36012;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage, and returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.*/
    int GL_DEPTH32F_STENCIL8 = 36013;

    /** Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and GetTexImage.*/
    int GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 36269;

    /** Accepted by the {@code value} parameter of GetTexLevelParameter.*/
    int GL_TEXTURE_RED_TYPE = 35856;

    /** Accepted by the {@code value} parameter of GetTexLevelParameter.*/
    int GL_TEXTURE_GREEN_TYPE = 35857;

    /** Accepted by the {@code value} parameter of GetTexLevelParameter.*/
    int GL_TEXTURE_BLUE_TYPE = 35858;

    /** Accepted by the {@code value} parameter of GetTexLevelParameter.*/
    int GL_TEXTURE_ALPHA_TYPE = 35859;

    /** Accepted by the {@code value} parameter of GetTexLevelParameter.*/
    int GL_TEXTURE_LUMINANCE_TYPE = 35860;

    /** Accepted by the {@code value} parameter of GetTexLevelParameter.*/
    int GL_TEXTURE_INTENSITY_TYPE = 35861;

    /** Accepted by the {@code value} parameter of GetTexLevelParameter.*/
    int GL_TEXTURE_DEPTH_TYPE = 35862;

    /** Returned by the {@code params} parameter of GetTexLevelParameter.*/
    int GL_UNSIGNED_NORMALIZED = 35863;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_RGBA32F = 34836;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_RGB32F = 34837;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_RGBA16F = 34842;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_RGB16F = 34843;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage.*/
    int GL_R11F_G11F_B10F = 35898;

    /** Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D, GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.*/
    int GL_UNSIGNED_INT_10F_11F_11F_REV = 35899;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage.*/
    int GL_RGB9_E5 = 35901;

    /** Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D, GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.*/
    int GL_UNSIGNED_INT_5_9_9_9_REV = 35902;

    /** Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv.*/
    int GL_TEXTURE_SHARED_SIZE = 35903;

    /** Accepted by the {@code target} parameter of BindFramebuffer, CheckFramebufferStatus, FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_FRAMEBUFFER = 36160;

    /** Accepted by the {@code target} parameter of BindFramebuffer, CheckFramebufferStatus, FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_READ_FRAMEBUFFER = 36008;

    /** Accepted by the {@code target} parameter of BindFramebuffer, CheckFramebufferStatus, FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_DRAW_FRAMEBUFFER = 36009;

    /** Accepted by the {@code target} parameter of BindRenderbuffer, RenderbufferStorage, and GetRenderbufferParameteriv, and returned by GetFramebufferAttachmentParameteriv.*/
    int GL_RENDERBUFFER = 36161;

    /** Accepted by the {@code internalformat} parameter of RenderbufferStorage.*/
    int GL_STENCIL_INDEX1 = 36166;

    /** Accepted by the {@code internalformat} parameter of RenderbufferStorage.*/
    int GL_STENCIL_INDEX4 = 36167;

    /** Accepted by the {@code internalformat} parameter of RenderbufferStorage.*/
    int GL_STENCIL_INDEX8 = 36168;

    /** Accepted by the {@code internalformat} parameter of RenderbufferStorage.*/
    int GL_STENCIL_INDEX16 = 36169;

    /** Accepted by the {@code pname} parameter of GetRenderbufferParameteriv.*/
    int GL_RENDERBUFFER_WIDTH = 36162;

    /** Accepted by the {@code pname} parameter of GetRenderbufferParameteriv.*/
    int GL_RENDERBUFFER_HEIGHT = 36163;

    /** Accepted by the {@code pname} parameter of GetRenderbufferParameteriv.*/
    int GL_RENDERBUFFER_INTERNAL_FORMAT = 36164;

    /** Accepted by the {@code pname} parameter of GetRenderbufferParameteriv.*/
    int GL_RENDERBUFFER_RED_SIZE = 36176;

    /** Accepted by the {@code pname} parameter of GetRenderbufferParameteriv.*/
    int GL_RENDERBUFFER_GREEN_SIZE = 36177;

    /** Accepted by the {@code pname} parameter of GetRenderbufferParameteriv.*/
    int GL_RENDERBUFFER_BLUE_SIZE = 36178;

    /** Accepted by the {@code pname} parameter of GetRenderbufferParameteriv.*/
    int GL_RENDERBUFFER_ALPHA_SIZE = 36179;

    /** Accepted by the {@code pname} parameter of GetRenderbufferParameteriv.*/
    int GL_RENDERBUFFER_DEPTH_SIZE = 36180;

    /** Accepted by the {@code pname} parameter of GetRenderbufferParameteriv.*/
    int GL_RENDERBUFFER_STENCIL_SIZE = 36181;

    /** Accepted by the {@code pname} parameter of GetRenderbufferParameteriv.*/
    int GL_RENDERBUFFER_SAMPLES = 36011;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.*/
    int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 36048;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.*/
    int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 36049;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.*/
    int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 36050;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.*/
    int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 36051;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.*/
    int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 36052;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.*/
    int GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 33296;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.*/
    int GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 33297;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.*/
    int GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE = 33298;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.*/
    int GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 33299;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.*/
    int GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 33300;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.*/
    int GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 33301;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.*/
    int GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 33302;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.*/
    int GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 33303;

    /** Returned in {@code params} by GetFramebufferAttachmentParameteriv.*/
    int GL_FRAMEBUFFER_DEFAULT = 33304;

    /** Returned in {@code params} by GetFramebufferAttachmentParameteriv.*/
    int GL_INDEX = 33314;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT0 = 36064;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT1 = 36065;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT2 = 36066;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT3 = 36067;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT4 = 36068;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT5 = 36069;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT6 = 36070;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT7 = 36071;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT8 = 36072;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT9 = 36073;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT10 = 36074;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT11 = 36075;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT12 = 36076;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT13 = 36077;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT14 = 36078;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT15 = 36079;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT16 = 36080;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT17 = 36081;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT18 = 36082;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT19 = 36083;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT20 = 36084;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT21 = 36085;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT22 = 36086;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT23 = 36087;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT24 = 36088;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT25 = 36089;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT26 = 36090;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT27 = 36091;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT28 = 36092;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT29 = 36093;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT30 = 36094;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_COLOR_ATTACHMENT31 = 36095;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_DEPTH_ATTACHMENT = 36096;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_STENCIL_ATTACHMENT = 36128;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.*/
    int GL_DEPTH_STENCIL_ATTACHMENT = 33306;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MAX_SAMPLES = 36183;

    /** Returned by CheckFramebufferStatus().*/
    int GL_FRAMEBUFFER_COMPLETE = 36053;

    /** Returned by CheckFramebufferStatus().*/
    int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 36054;

    /** Returned by CheckFramebufferStatus().*/
    int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 36055;

    /** Returned by CheckFramebufferStatus().*/
    int GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER = 36059;

    /** Returned by CheckFramebufferStatus().*/
    int GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER = 36060;

    /** Returned by CheckFramebufferStatus().*/
    int GL_FRAMEBUFFER_UNSUPPORTED = 36061;

    /** Returned by CheckFramebufferStatus().*/
    int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 36182;

    /** Returned by CheckFramebufferStatus().*/
    int GL_FRAMEBUFFER_UNDEFINED = 33305;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv,  and GetDoublev.*/
    int GL_FRAMEBUFFER_BINDING = 36006;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv,  and GetDoublev.*/
    int GL_DRAW_FRAMEBUFFER_BINDING = 36006;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv,  and GetDoublev.*/
    int GL_READ_FRAMEBUFFER_BINDING = 36010;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv,  and GetDoublev.*/
    int GL_RENDERBUFFER_BINDING = 36007;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv,  and GetDoublev.*/
    int GL_MAX_COLOR_ATTACHMENTS = 36063;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv,  and GetDoublev.*/
    int GL_MAX_RENDERBUFFER_SIZE = 34024;

    /** Returned by GetError().*/
    int GL_INVALID_FRAMEBUFFER_OPERATION = 1286;

    /** Accepted by the {@code format} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and GetTexImage, by the {@code type} parameter of CopyPixels, by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage, and returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.*/
    int GL_DEPTH_STENCIL = 34041;

    /** Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and GetTexImage.*/
    int GL_UNSIGNED_INT_24_8 = 34042;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage, and returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.*/
    int GL_DEPTH24_STENCIL8 = 35056;

    /** Accepted by the {@code value} parameter of GetTexLevelParameter.*/
    int GL_TEXTURE_STENCIL_SIZE = 35057;

    /** Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, GetTexImage, TexSubImage1D, TexSubImage2D, TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, GetConvolutionFilter, SeparableFilter2D, GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable. <p>Accepted by the {@code type} argument of VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, FogCoordPointer, TexCoordPointer, and VertexAttribPointer.</p>*/
    int GL_HALF_FLOAT = 5131;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_RGBA32UI = 36208;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_RGB32UI = 36209;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_RGBA16UI = 36214;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_RGB16UI = 36215;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_RGBA8UI = 36220;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_RGB8UI = 36221;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_RGBA32I = 36226;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_RGB32I = 36227;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_RGBA16I = 36232;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_RGB16I = 36233;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_RGBA8I = 36238;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.*/
    int GL_RGB8I = 36239;

    /** Accepted by the {@code format} parameter of TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, DrawPixels and ReadPixels.*/
    int GL_RED_INTEGER = 36244;

    /** Accepted by the {@code format} parameter of TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, DrawPixels and ReadPixels.*/
    int GL_GREEN_INTEGER = 36245;

    /** Accepted by the {@code format} parameter of TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, DrawPixels and ReadPixels.*/
    int GL_BLUE_INTEGER = 36246;

    /** Accepted by the {@code format} parameter of TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, DrawPixels and ReadPixels.*/
    int GL_ALPHA_INTEGER = 36247;

    /** Accepted by the {@code format} parameter of TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, DrawPixels and ReadPixels.*/
    int GL_RGB_INTEGER = 36248;

    /** Accepted by the {@code format} parameter of TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, DrawPixels and ReadPixels.*/
    int GL_RGBA_INTEGER = 36249;

    /** Accepted by the {@code format} parameter of TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, DrawPixels and ReadPixels.*/
    int GL_BGR_INTEGER = 36250;

    /** Accepted by the {@code format} parameter of TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, DrawPixels and ReadPixels.*/
    int GL_BGRA_INTEGER = 36251;

    /** Accepted by the {@code target} parameter of TexParameteri, TexParameteriv, TexParameterf, TexParameterfv, GenerateMipmap, and BindTexture.*/
    int GL_TEXTURE_1D_ARRAY = 35864;

    /** Accepted by the {@code target} parameter of TexParameteri, TexParameteriv, TexParameterf, TexParameterfv, GenerateMipmap, and BindTexture.*/
    int GL_TEXTURE_2D_ARRAY = 35866;

    /** Accepted by the {@code target} parameter of TexImage3D, TexSubImage3D, CopyTexSubImage3D, CompressedTexImage3D, and CompressedTexSubImage3D.*/
    int GL_PROXY_TEXTURE_2D_ARRAY = 35867;

    /** Accepted by the {@code target} parameter of TexImage2D, TexSubImage2D, CopyTexImage2D, CopyTexSubImage2D, CompressedTexImage2D, and CompressedTexSubImage2D.*/
    int GL_PROXY_TEXTURE_1D_ARRAY = 35865;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv.*/
    int GL_TEXTURE_BINDING_1D_ARRAY = 35868;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv.*/
    int GL_TEXTURE_BINDING_2D_ARRAY = 35869;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv.*/
    int GL_MAX_ARRAY_TEXTURE_LAYERS = 35071;

    /** Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, and CompressedTexImage2D and the {@code format} parameter of CompressedTexSubImage2D.*/
    int GL_COMPRESSED_RED_RGTC1 = 36283;

    /** Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, and CompressedTexImage2D and the {@code format} parameter of CompressedTexSubImage2D.*/
    int GL_COMPRESSED_SIGNED_RED_RGTC1 = 36284;

    /** Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, and CompressedTexImage2D and the {@code format} parameter of CompressedTexSubImage2D.*/
    int GL_COMPRESSED_RG_RGTC2 = 36285;

    /** Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, and CompressedTexImage2D and the {@code format} parameter of CompressedTexSubImage2D.*/
    int GL_COMPRESSED_SIGNED_RG_RGTC2 = 36286;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_R8 = 33321;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_R16 = 33322;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_RG8 = 33323;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_RG16 = 33324;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_R16F = 33325;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_R32F = 33326;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_RG16F = 33327;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_RG32F = 33328;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_R8I = 33329;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_R8UI = 33330;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_R16I = 33331;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_R16UI = 33332;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_R32I = 33333;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_R32UI = 33334;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_RG8I = 33335;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_RG8UI = 33336;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_RG16I = 33337;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_RG16UI = 33338;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_RG32I = 33339;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_RG32UI = 33340;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_RG = 33319;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_COMPRESSED_RED = 33317;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_COMPRESSED_RG = 33318;

    /** Accepted by the {@code format} parameter of TexImage3D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and ReadPixels.*/
    int GL_RG_INTEGER = 33320;

    /** Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv, BindBufferRange, BindBufferOffset and BindBufferBase.*/
    int GL_TRANSFORM_FEEDBACK_BUFFER = 35982;

    /** Accepted by the {@code param} parameter of GetIntegeri_v and GetBooleani_v.*/
    int GL_TRANSFORM_FEEDBACK_BUFFER_START = 35972;

    /** Accepted by the {@code param} parameter of GetIntegeri_v and GetBooleani_v.*/
    int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE = 35973;

    /** Accepted by the {@code param} parameter of GetIntegeri_v and GetBooleani_v, and by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = 35983;

    /** Accepted by the {@code bufferMode} parameter of TransformFeedbackVaryings.*/
    int GL_INTERLEAVED_ATTRIBS = 35980;

    /** Accepted by the {@code bufferMode} parameter of TransformFeedbackVaryings.*/
    int GL_SEPARATE_ATTRIBS = 35981;

    /** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv.*/
    int GL_PRIMITIVES_GENERATED = 35975;

    /** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv.*/
    int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 35976;

    /** Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_RASTERIZER_DISCARD = 35977;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 35978;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS = 35979;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS = 35968;

    /** Accepted by the {@code pname} parameter of GetProgramiv.*/
    int GL_TRANSFORM_FEEDBACK_VARYINGS = 35971;

    /** Accepted by the {@code pname} parameter of GetProgramiv.*/
    int GL_TRANSFORM_FEEDBACK_BUFFER_MODE = 35967;

    /** Accepted by the {@code pname} parameter of GetProgramiv.*/
    int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 35958;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_VERTEX_ARRAY_BINDING = 34229;

    /** Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_FRAMEBUFFER_SRGB = 36281;

    /** Queries indexed string state.@param name the indexed state to query. One of:<br><table><tr><td>{@link GL11#GL_EXTENSIONS EXTENSIONS}</td><td>{@link GL20#GL_SHADING_LANGUAGE_VERSION SHADING_LANGUAGE_VERSION}</td></tr></table>@param index the index of the particular element being queried@see <a href="https://docs.gl/gl4/glGetStringi">Reference Page</a>*/
    String glGetStringi(int name, int index);

    /** Clears an individual buffer of the currently bound framebuffer object to the {@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER} binding.@param buffer the buffer to clear. One of:<br><table><tr><td>{@link GL11#GL_COLOR COLOR}</td><td>{@link GL11#GL_STENCIL STENCIL}</td></tr></table>@param drawbuffer the draw buffer to clear@param value for color buffers, a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to. For stencil buffers, a pointer to a                   single stencil value to clear the buffer to.@see <a href="https://docs.gl/gl4/glClearBuffer">Reference Page</a>*/
    void glClearBufferiv(int buffer, int drawbuffer, IntBuffer value);

    /** Clears an individual buffer of the currently bound framebuffer object to the {@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER} binding.@param buffer the buffer to clear. Must be:<br><table><tr><td>{@link GL11#GL_COLOR COLOR}</td></tr></table>@param drawbuffer the draw buffer to clear@param value a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to@see <a href="https://docs.gl/gl4/glClearBuffer">Reference Page</a>*/
    void glClearBufferuiv(int buffer, int drawbuffer, IntBuffer value);

    /** Clears an individual buffer of the currently bound framebuffer object to the {@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER} binding.@param buffer the buffer to clear. One of:<br><table><tr><td>{@link GL11#GL_COLOR COLOR}</td><td>{@link GL11#GL_DEPTH DEPTH}</td></tr></table>@param drawbuffer the draw buffer to clear@param value for color buffers, a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to. For depth buffers, a pointer to a                   single depth value to clear the buffer to.@see <a href="https://docs.gl/gl4/glClearBuffer">Reference Page</a>*/
    void glClearBufferfv(int buffer, int drawbuffer, FloatBuffer value);

    /** Clears an individual buffer of the currently bound framebuffer object to the {@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER} binding.@param buffer the buffer to clear. Must be:<br><table><tr><td>{@link GL30C#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param drawbuffer the draw buffer to clear@param depth the depth value to clear the buffer to@param stencil the stencil value to clear the buffer to@see <a href="https://docs.gl/gl4/glClearBufferfi">Reference Page</a>*/
    void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil);

    /** Specifies the value of a pure integer generic vertex attribute. The y and z components are implicitly set to 0 and w to 1.@param index the index of the pure integer generic vertex attribute to be modified@param x the vertex attribute x component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI1i(int index, int x);

    /** Specifies the value of a pure integer generic vertex attribute. The z component is implicitly set to 0 and w to 1.@param index the index of the pure integer generic vertex attribute to be modified@param x the vertex attribute x component@param y the vertex attribute y component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI2i(int index, int x, int y);

    /** Specifies the value of a pure integer generic vertex attribute. The w component is implicitly set to 1.@param index the index of the pure integer generic vertex attribute to be modified@param x the vertex attribute x component@param y the vertex attribute y component@param z the vertex attribute z component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI3i(int index, int x, int y, int z);

    /** Specifies the value of a pure integer generic vertex attribute.@param index the index of the pure integer generic vertex attribute to be modified@param x the vertex attribute x component@param y the vertex attribute y component@param z the vertex attribute z component@param w the vertex attribute w component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI4i(int index, int x, int y, int z, int w);

    /** Specifies the value of an unsigned pure integer generic vertex attribute. The y and z components are implicitly set to 0 and w to 1.@param index the index of the pure integer generic vertex attribute to be modified@param x the vertex attribute x component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI1ui(int index, int x);

    /** Specifies the value of an unsigned pure integer generic vertex attribute. The z component is implicitly set to 0 and w to 1.@param index the index of the pure integer generic vertex attribute to be modified@param x the vertex attribute x component@param y the vertex attribute y component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI2ui(int index, int x, int y);

    /** Specifies the value of an unsigned pure integer generic vertex attribute. The w component is implicitly set to 1.@param index the index of the pure integer generic vertex attribute to be modified@param x the vertex attribute x component@param y the vertex attribute y component@param z the vertex attribute z component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI3ui(int index, int x, int y, int z);

    /** Specifies the value of an unsigned pure integer generic vertex attribute.@param index the index of the pure integer generic vertex attribute to be modified@param x the vertex attribute x component@param y the vertex attribute y component@param z the vertex attribute z component@param w the vertex attribute w component@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI4ui(int index, int x, int y, int z, int w);

    /** Pointer version of {@link #glVertexAttribI1i VertexAttribI1i}.@param index the index of the pure integer generic vertex attribute to be modified@param _2 the pure integer vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI1iv(int index, IntBuffer v);

    /** Pointer version of {@link #glVertexAttribI2i VertexAttribI2i}.@param index the index of the pure integer generic vertex attribute to be modified@param _2 the pure integer vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI2iv(int index, IntBuffer v);

    /** Pointer version of {@link #glVertexAttribI3i VertexAttribI3i}.@param index the index of the pure integer generic vertex attribute to be modified@param _2 the pure integer vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI3iv(int index, IntBuffer v);

    /** Pointer version of {@link #glVertexAttribI4i VertexAttribI4i}.@param index the index of the pure integer generic vertex attribute to be modified@param _2 the pure integer vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI4iv(int index, IntBuffer v);

    /** Pointer version of {@link #glVertexAttribI1ui VertexAttribI1ui}.@param index the index of the pure integer generic vertex attribute to be modified@param _2 the pure integer vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI1uiv(int index, IntBuffer v);

    /** Pointer version of {@link #glVertexAttribI2ui VertexAttribI2ui}.@param index the index of the pure integer generic vertex attribute to be modified@param _2 the pure integer vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI2uiv(int index, IntBuffer v);

    /** Pointer version of {@link #glVertexAttribI3ui VertexAttribI3ui}.@param index the index of the pure integer generic vertex attribute to be modified@param _2 the pure integer vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI3uiv(int index, IntBuffer v);

    /** Pointer version of {@link #glVertexAttribI4ui VertexAttribI4ui}.@param index the index of the pure integer generic vertex attribute to be modified@param _2 the pure integer vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI4uiv(int index, IntBuffer v);

    /** Byte version of {@link #glVertexAttribI4iv VertexAttribI4iv}.@param index the index of the pure integer generic vertex attribute to be modified@param _2 the pure integer vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI4bv(int index, ByteBuffer v);

    /** Short version of {@link #glVertexAttribI4iv VertexAttribI4iv}.@param index the index of the pure integer generic vertex attribute to be modified@param _2 the pure integer vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI4sv(int index, ShortBuffer v);

    /** Byte version of {@link #glVertexAttribI4uiv VertexAttribI4uiv}.@param index the index of the pure integer generic vertex attribute to be modified@param _2 the pure integer vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI4ubv(int index, ByteBuffer v);

    /** Short version of {@link #glVertexAttribI4uiv VertexAttribI4uiv}.@param index the index of the pure integer generic vertex attribute to be modified@param _2 the pure integer vertex attribute buffer@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI4usv(int index, ShortBuffer v);

    /** Specifies the location and organization of a pure integer vertex attribute array.@param index the index of the pure integer generic vertex attribute to be modified@param size the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>@param type the data type of each component in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param stride the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in                the array. The initial value is 0.@param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.@see <a href="https://docs.gl/gl4/glVertexAttribIPointer">Reference Page</a>*/
    void glVertexAttribIPointer(int index, int size, int type, int stride, ByteBuffer pointer);

    /** Specifies the location and organization of a pure integer vertex attribute array.@param index the index of the pure integer generic vertex attribute to be modified@param size the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>@param type the data type of each component in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param stride the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in                the array. The initial value is 0.@param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.@see <a href="https://docs.gl/gl4/glVertexAttribIPointer">Reference Page</a>*/
    void glVertexAttribIPointer(int index, int size, int type, int stride, long pointer);

    /** Specifies the location and organization of a pure integer vertex attribute array.@param index the index of the pure integer generic vertex attribute to be modified@param size the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>@param type the data type of each component in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param stride the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in                the array. The initial value is 0.@param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.@see <a href="https://docs.gl/gl4/glVertexAttribIPointer">Reference Page</a>*/
    void glVertexAttribIPointer(int index, int size, int type, int stride, ShortBuffer pointer);

    /** Specifies the location and organization of a pure integer vertex attribute array.@param index the index of the pure integer generic vertex attribute to be modified@param size the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>@param type the data type of each component in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param stride the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in                the array. The initial value is 0.@param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.@see <a href="https://docs.gl/gl4/glVertexAttribIPointer">Reference Page</a>*/
    void glVertexAttribIPointer(int index, int size, int type, int stride, IntBuffer pointer);

    /** Returns the value of a pure integer generic vertex attribute parameter.@param index the index of the pure integer generic vertex attribute to be modified@param pname the symbolic name of the vertex attribute parameter to be queried. Must be:<br><table><tr><td>{@link GL20#GL_CURRENT_VERTEX_ATTRIB CURRENT_VERTEX_ATTRIB}</td></tr></table>@param params returns the requested data@see <a href="https://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>*/
    void glGetVertexAttribIiv(int index, int pname, IntBuffer params);

    /** Returns the value of a pure integer generic vertex attribute parameter.@param index the index of the pure integer generic vertex attribute to be modified@param pname the symbolic name of the vertex attribute parameter to be queried. Must be:<br><table><tr><td>{@link GL20#GL_CURRENT_VERTEX_ATTRIB CURRENT_VERTEX_ATTRIB}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>*/
    int glGetVertexAttribIi(int index, int pname);

    /** Unsigned version of {@link #glGetVertexAttribIiv GetVertexAttribIiv}.@param index the index of the pure integer generic vertex attribute to be modified@param pname the symbolic name of the vertex attribute parameter to be queried. Must be:<br><table><tr><td>{@link GL20#GL_CURRENT_VERTEX_ATTRIB CURRENT_VERTEX_ATTRIB}</td></tr></table>@param params returns the requested data@see <a href="https://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>*/
    void glGetVertexAttribIuiv(int index, int pname, IntBuffer params);

    /** Unsigned version of {@link #glGetVertexAttribIiv GetVertexAttribIiv}.@param index the index of the pure integer generic vertex attribute to be modified@param pname the symbolic name of the vertex attribute parameter to be queried. Must be:<br><table><tr><td>{@link GL20#GL_CURRENT_VERTEX_ATTRIB CURRENT_VERTEX_ATTRIB}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>*/
    int glGetVertexAttribIui(int index, int pname);

    /** Specifies the value of a uint uniform variable for the current program object.@param location the location of the uniform variable to be modified@param v0 the uniform value@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform1ui(int location, int v0);

    /** Specifies the value of a uvec2 uniform variable for the current program object.@param location the location of the uniform variable to be modified@param v0 the uniform x value@param v1 the uniform y value@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform2ui(int location, int v0, int v1);

    /** Specifies the value of a uvec3 uniform variable for the current program object.@param location the location of the uniform variable to be modified@param v0 the uniform x value@param v1 the uniform y value@param v2 the uniform z value@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform3ui(int location, int v0, int v1, int v2);

    /** Specifies the value of a uvec4 uniform variable for the current program object.@param location the location of the uniform variable to be modified@param v0 the uniform x value@param v1 the uniform y value@param v2 the uniform z value@param v3 the uniform w value@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform4ui(int location, int v0, int v1, int v2, int v3);

    /** Specifies the value of a single uint uniform variable or a uint uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform1uiv(int location, IntBuffer value);

    /** Specifies the value of a single uvec2 uniform variable or a uvec2 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform2uiv(int location, IntBuffer value);

    /** Specifies the value of a single uvec3 uniform variable or a uvec3 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform3uiv(int location, IntBuffer value);

    /** Specifies the value of a single uvec4 uniform variable or a uvec4 uniform variable array for the current program object.@param location the location of the uniform variable to be modified@param value a pointer to an array of {@code count} values that will be used to update the specified uniform variable@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform4uiv(int location, IntBuffer value);

    /** Returns the uint value(s) of a uniform variable.@param program the program object to be queried@param location the location of the uniform variable to be queried@param params the value of the specified uniform variable@see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>*/
    void glGetUniformuiv(int program, int location, IntBuffer params);

    /** Returns the uint value(s) of a uniform variable.@param program the program object to be queried@param location the location of the uniform variable to be queried@see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>*/
    int glGetUniformui(int program, int location);

    /** Binds a user-defined varying out variable to a fragment shader color number.@param program the name of the program containing varying out variable whose binding to modify@param colorNumber the color number to bind the user-defined varying out variable to@param name the name of the user-defined varying out variable whose binding to modify@see <a href="https://docs.gl/gl4/glBindFragDataLocation">Reference Page</a>*/
    void glBindFragDataLocation(int program, int colorNumber, ByteBuffer name);

    /** Binds a user-defined varying out variable to a fragment shader color number.@param program the name of the program containing varying out variable whose binding to modify@param colorNumber the color number to bind the user-defined varying out variable to@param name the name of the user-defined varying out variable whose binding to modify@see <a href="https://docs.gl/gl4/glBindFragDataLocation">Reference Page</a>*/
    void glBindFragDataLocation(int program, int colorNumber, CharSequence name);

    /** Queries the bindings of color numbers to user-defined varying out variables.@param program the name of the program containing varying out variable whose binding to query@param name the name of the user-defined varying out variable whose binding to query@see <a href="https://docs.gl/gl4/glGetFragDataLocation">Reference Page</a>*/
    int glGetFragDataLocation(int program, ByteBuffer name);

    /** Queries the bindings of color numbers to user-defined varying out variables.@param program the name of the program containing varying out variable whose binding to query@param name the name of the user-defined varying out variable whose binding to query@see <a href="https://docs.gl/gl4/glGetFragDataLocation">Reference Page</a>*/
    int glGetFragDataLocation(int program, CharSequence name);

    /** Starts conditional rendering.@param id the name of an occlusion query object whose results are used to determine if the rendering commands are discarded@param mode how {@code glBeginConditionalRender} interprets the results of the occlusion query. One of:<br><table><tr><td>{@link GL30C#GL_QUERY_WAIT QUERY_WAIT}</td><td>{@link GL30C#GL_QUERY_NO_WAIT QUERY_NO_WAIT}</td><td>{@link GL30C#GL_QUERY_BY_REGION_WAIT QUERY_BY_REGION_WAIT}</td></tr><tr><td>{@link GL30C#GL_QUERY_BY_REGION_NO_WAIT QUERY_BY_REGION_NO_WAIT}</td><td>{@link GL45#GL_QUERY_WAIT_INVERTED QUERY_WAIT_INVERTED}</td><td>{@link GL45#GL_QUERY_NO_WAIT_INVERTED QUERY_NO_WAIT_INVERTED}</td></tr><tr><td>{@link GL45#GL_QUERY_BY_REGION_WAIT_INVERTED QUERY_BY_REGION_WAIT_INVERTED}</td><td>{@link GL45#GL_QUERY_BY_REGION_NO_WAIT_INVERTED QUERY_BY_REGION_NO_WAIT_INVERTED}</td></tr></table>@see <a href="https://docs.gl/gl4/glBeginConditionalRender">Reference Page</a>*/
    void glBeginConditionalRender(int id, int mode);

    /** Ends conditional rendering.@see <a href="https://docs.gl/gl4/glEndConditionalRender">Reference Page</a>*/
    void glEndConditionalRender();

    /** Maps a section of a buffer object's data store. <p><b>LWJGL note</b>: This method comes in 2 flavors:</p> <ol> <li>{@link #glMapBufferRange(int, long, long, int)} - Always returns a new ByteBuffer instance.</li> <li>{@link #glMapBufferRange(int, long, long, int, ByteBuffer)} - The {@code old_buffer} parameter is reused if not null.</li> </ol>@param target a binding to which the target buffer is bound. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30C#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param offset the starting offset within the buffer of the range to be mapped@param length the length of the range to be mapped@param access a combination of access flags indicating the desired access to the range. One or more of:<br><table><tr><td>{@link GL30C#GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link GL30C#GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td><td>{@link GL30C#GL_MAP_INVALIDATE_RANGE_BIT MAP_INVALIDATE_RANGE_BIT}</td><td>{@link GL30C#GL_MAP_INVALIDATE_BUFFER_BIT MAP_INVALIDATE_BUFFER_BIT}</td></tr><tr><td>{@link GL30C#GL_MAP_FLUSH_EXPLICIT_BIT MAP_FLUSH_EXPLICIT_BIT}</td><td>{@link GL30C#GL_MAP_UNSYNCHRONIZED_BIT MAP_UNSYNCHRONIZED_BIT}</td></tr></table>@see <a href="https://docs.gl/gl4/glMapBufferRange">Reference Page</a>*/
    ByteBuffer glMapBufferRange(int target, long offset, long length, int access);

    /** Maps a section of a buffer object's data store. <p><b>LWJGL note</b>: This method comes in 2 flavors:</p> <ol> <li>{@link #glMapBufferRange(int, long, long, int)} - Always returns a new ByteBuffer instance.</li> <li>{@link #glMapBufferRange(int, long, long, int, ByteBuffer)} - The {@code old_buffer} parameter is reused if not null.</li> </ol>@param target a binding to which the target buffer is bound. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30C#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param offset the starting offset within the buffer of the range to be mapped@param length the length of the range to be mapped@param access a combination of access flags indicating the desired access to the range. One or more of:<br><table><tr><td>{@link GL30C#GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link GL30C#GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td><td>{@link GL30C#GL_MAP_INVALIDATE_RANGE_BIT MAP_INVALIDATE_RANGE_BIT}</td><td>{@link GL30C#GL_MAP_INVALIDATE_BUFFER_BIT MAP_INVALIDATE_BUFFER_BIT}</td></tr><tr><td>{@link GL30C#GL_MAP_FLUSH_EXPLICIT_BIT MAP_FLUSH_EXPLICIT_BIT}</td><td>{@link GL30C#GL_MAP_UNSYNCHRONIZED_BIT MAP_UNSYNCHRONIZED_BIT}</td></tr></table>@see <a href="https://docs.gl/gl4/glMapBufferRange">Reference Page</a>*/
    ByteBuffer glMapBufferRange(int target, long offset, long length, int access, ByteBuffer old_buffer);

    /** Indicates modifications to a range of a mapped buffer.@param target the target of the flush operation. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30C#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>@param offset the start of the buffer subrange, in basic machine units@param length the length of the buffer subrange, in basic machine units@see <a href="https://docs.gl/gl4/glFlushMappedBufferRange">Reference Page</a>*/
    void glFlushMappedBufferRange(int target, long offset, long length);

    /** Controls color clamping.@param target target for color clamping. Must be:<br><table><tr><td>{@link GL30C#GL_CLAMP_READ_COLOR CLAMP_READ_COLOR}</td></tr></table>@param clamp whether to apply color clamping. One of:<br><table><tr><td>{@link GL11#GL_TRUE TRUE}</td><td>{@link GL11#GL_FALSE FALSE}</td><td>{@link GL30C#GL_FIXED_ONLY FIXED_ONLY}</td></tr></table>@see <a href="https://docs.gl/gl4/glClampColor">Reference Page</a>*/
    void glClampColor(int target, int clamp);

    /** Determines if a name corresponds to a renderbuffer object.@param renderbuffer a value that may be the name of a renderbuffer object@see <a href="https://docs.gl/gl4/glIsRenderbuffer">Reference Page</a>*/
    boolean glIsRenderbuffer(int renderbuffer);

    /** Binds a renderbuffer to a renderbuffer target.@param target the renderbuffer target of the binding operation. Must be:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>@param renderbuffer the name of the renderbuffer object to bind@see <a href="https://docs.gl/gl4/glBindRenderbuffer">Reference Page</a>*/
    void glBindRenderbuffer(int target, int renderbuffer);

    /** Deletes renderbuffer objects.@param renderbuffers an array containing {@code n} renderbuffer objects to be deleted@see <a href="https://docs.gl/gl4/glDeleteRenderbuffers">Reference Page</a>*/
    void glDeleteRenderbuffers(IntBuffer renderbuffers);

    /** Deletes renderbuffer objects.@see <a href="https://docs.gl/gl4/glDeleteRenderbuffers">Reference Page</a>*/
    void glDeleteRenderbuffers(int renderbuffer);

    /** Generates renderbuffer object names.@param renderbuffers a buffer in which the generated renderbuffer object names are stored@see <a href="https://docs.gl/gl4/glGenRenderbuffers">Reference Page</a>*/
    void glGenRenderbuffers(IntBuffer renderbuffers);

    /** Generates renderbuffer object names.@see <a href="https://docs.gl/gl4/glGenRenderbuffers">Reference Page</a>*/
    int glGenRenderbuffers();

    /** Establishes data storage, format and dimensions of a renderbuffer object's image.@param target the target of the allocation. Must be:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>@param internalformat the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format.@param width the width of the renderbuffer, in pixels@param height the height of the renderbuffer, in pixels@see <a href="https://docs.gl/gl4/glRenderbufferStorage">Reference Page</a>*/
    void glRenderbufferStorage(int target, int internalformat, int width, int height);

    /** Establishes data storage, format, dimensions and sample count of a renderbuffer object's image. <p>{@link #glRenderbufferStorage RenderbufferStorage} is equivalent to calling this method with the samples set to zero.</p>@param target the target of the allocation. Must be:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>@param samples the number of samples to be used for the renderbuffer object's storage@param internalformat the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format.@param width the width of the renderbuffer, in pixels@param height the height of the renderbuffer, in pixels@see <a href="https://docs.gl/gl4/glRenderbufferStorageMultisample">Reference Page</a>*/
    void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height);

    /** Retrieves information about a bound renderbuffer object.@param target the target of the query operation. Must be:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>@param pname the parameter whose value to retrieve from the renderbuffer bound to {@code target}. One of:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER_WIDTH RENDERBUFFER_WIDTH}</td><td>{@link GL30C#GL_RENDERBUFFER_HEIGHT RENDERBUFFER_HEIGHT}</td><td>{@link GL30C#GL_RENDERBUFFER_INTERNAL_FORMAT RENDERBUFFER_INTERNAL_FORMAT}</td></tr><tr><td>{@link GL30C#GL_RENDERBUFFER_RED_SIZE RENDERBUFFER_RED_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_GREEN_SIZE RENDERBUFFER_GREEN_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_BLUE_SIZE RENDERBUFFER_BLUE_SIZE}</td></tr><tr><td>{@link GL30C#GL_RENDERBUFFER_ALPHA_SIZE RENDERBUFFER_ALPHA_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_DEPTH_SIZE RENDERBUFFER_DEPTH_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_STENCIL_SIZE RENDERBUFFER_STENCIL_SIZE}</td></tr><tr><td>{@link GL30C#GL_RENDERBUFFER_SAMPLES RENDERBUFFER_SAMPLES}</td></tr></table>@param params an array to receive the value of the queried parameter@see <a href="https://docs.gl/gl4/glGetRenderbufferParameter">Reference Page</a>*/
    void glGetRenderbufferParameteriv(int target, int pname, IntBuffer params);

    /** Retrieves information about a bound renderbuffer object.@param target the target of the query operation. Must be:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>@param pname the parameter whose value to retrieve from the renderbuffer bound to {@code target}. One of:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER_WIDTH RENDERBUFFER_WIDTH}</td><td>{@link GL30C#GL_RENDERBUFFER_HEIGHT RENDERBUFFER_HEIGHT}</td><td>{@link GL30C#GL_RENDERBUFFER_INTERNAL_FORMAT RENDERBUFFER_INTERNAL_FORMAT}</td></tr><tr><td>{@link GL30C#GL_RENDERBUFFER_RED_SIZE RENDERBUFFER_RED_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_GREEN_SIZE RENDERBUFFER_GREEN_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_BLUE_SIZE RENDERBUFFER_BLUE_SIZE}</td></tr><tr><td>{@link GL30C#GL_RENDERBUFFER_ALPHA_SIZE RENDERBUFFER_ALPHA_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_DEPTH_SIZE RENDERBUFFER_DEPTH_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_STENCIL_SIZE RENDERBUFFER_STENCIL_SIZE}</td></tr><tr><td>{@link GL30C#GL_RENDERBUFFER_SAMPLES RENDERBUFFER_SAMPLES}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetRenderbufferParameter">Reference Page</a>*/
    int glGetRenderbufferParameteri(int target, int pname);

    /** Determines if a name corresponds to a framebuffer object.@param framebuffer a value that may be the name of a framebuffer object@see <a href="https://docs.gl/gl4/glIsFramebuffer">Reference Page</a>*/
    boolean glIsFramebuffer(int framebuffer);

    /** Binds a framebuffer to a framebuffer target.@param target the framebuffer target of the binding operation. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>@param framebuffer the name of the framebuffer object to bind@see <a href="https://docs.gl/gl4/glBindFramebuffer">Reference Page</a>*/
    void glBindFramebuffer(int target, int framebuffer);

    /** Deletes framebuffer objects.@param framebuffers an array containing {@code n} framebuffer objects to be deleted@see <a href="https://docs.gl/gl4/glDeleteFramebuffers">Reference Page</a>*/
    void glDeleteFramebuffers(IntBuffer framebuffers);

    /** Deletes framebuffer objects.@see <a href="https://docs.gl/gl4/glDeleteFramebuffers">Reference Page</a>*/
    void glDeleteFramebuffers(int framebuffer);

    /** Generates framebuffer object names.@param framebuffers a buffer in which the generated framebuffer object names are stored@see <a href="https://docs.gl/gl4/glGenFramebuffers">Reference Page</a>*/
    void glGenFramebuffers(IntBuffer framebuffers);

    /** Generates framebuffer object names.@see <a href="https://docs.gl/gl4/glGenFramebuffers">Reference Page</a>*/
    int glGenFramebuffers();

    /** Checks the completeness status of a framebuffer.@param target the target of the framebuffer completeness check. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>@see <a href="https://docs.gl/gl4/glCheckFramebufferStatus">Reference Page</a>*/
    int glCheckFramebufferStatus(int target);

    /** Attaches a level of a 1D texture object as a logical buffer to the currently bound framebuffer object.@param target the framebuffer target. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>@param attachment the attachment point of the framebuffer. One of:<br><table><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30C#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30C#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30C#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>@param textarget the type of texture@param texture the texture object to attach to the framebuffer attachment point named by {@code attachment}@param level the mipmap level of {@code texture} to attach@see <a href="https://docs.gl/gl4/glFramebufferTexture1D">Reference Page</a>*/
    void glFramebufferTexture1D(int target, int attachment, int textarget, int texture, int level);

    /** Attaches a level of a 2D texture object as a logical buffer to the currently bound framebuffer object.@param target the framebuffer target. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>@param attachment the attachment point of the framebuffer. One of:<br><table><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30C#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30C#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30C#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>@param textarget the type of texture@param texture the texture object to attach to the framebuffer attachment point named by {@code attachment}@param level the mipmap level of {@code texture} to attach@see <a href="https://docs.gl/gl4/glFramebufferTexture2D">Reference Page</a>*/
    void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level);

    /** Attaches a layer of a 3D texture object as a logical buffer to the currently bound framebuffer object.@param target the framebuffer target. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>@param attachment the attachment point of the framebuffer. One of:<br><table><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30C#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30C#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30C#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>@param textarget the type of texture@param texture the texture object to attach to the framebuffer attachment point named by {@code attachment}@param level the mipmap level of {@code texture} to attach@param layer the layer of a 2-dimensional image within the 3-dimensional texture.@see <a href="https://docs.gl/gl4/glFramebufferTexture3D">Reference Page</a>*/
    void glFramebufferTexture3D(int target, int attachment, int textarget, int texture, int level, int layer);

    /** Attaches a single layer of a texture to a framebuffer@param target the framebuffer target. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>@param attachment the attachment point of the framebuffer. One of:<br><table><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30C#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30C#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30C#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>@param texture the texture object to attach to the framebuffer attachment point named by {@code attachment}@param level the mipmap level of {@code texture} to attach@param layer the layer of {@code texture} to attach.@see <a href="https://docs.gl/gl4/glFramebufferTextureLayer">Reference Page</a>*/
    void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer);

    /** Attaches a renderbuffer as a logical buffer to the currently bound framebuffer object.@param target the framebuffer target. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>@param attachment the attachment point of the framebuffer. One of:<br><table><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30C#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30C#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30C#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>@param renderbuffertarget the renderbuffer target. Must be:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>@param renderbuffer the name of an existing renderbuffer object of type {@code renderbuffertarget} to attach@see <a href="https://docs.gl/gl4/glFramebufferRenderbuffer">Reference Page</a>*/
    void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer);

    /** Retrievees information about attachments of a bound framebuffer object.@param target the target of the query operation. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>@param attachment the attachment within {@code target}. One of:<br><table><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30C#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30C#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30C#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>@param pname the parameter of {@code attachment} to query. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME FRAMEBUFFER_ATTACHMENT_OBJECT_NAME}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE FRAMEBUFFER_ATTACHMENT_RED_SIZE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE FRAMEBUFFER_ATTACHMENT_GREEN_SIZE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE FRAMEBUFFER_ATTACHMENT_BLUE_SIZE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE}</td></tr></table>@param params an array to receive the value of the queried parameter@see <a href="https://docs.gl/gl4/glGetFramebufferAttachmentParameter">Reference Page</a>*/
    void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, IntBuffer params);

    /** Retrievees information about attachments of a bound framebuffer object.@param target the target of the query operation. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>@param attachment the attachment within {@code target}. One of:<br><table><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30C#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30C#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30C#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>@param pname the parameter of {@code attachment} to query. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME FRAMEBUFFER_ATTACHMENT_OBJECT_NAME}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE FRAMEBUFFER_ATTACHMENT_RED_SIZE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE FRAMEBUFFER_ATTACHMENT_GREEN_SIZE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE FRAMEBUFFER_ATTACHMENT_BLUE_SIZE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetFramebufferAttachmentParameter">Reference Page</a>*/
    int glGetFramebufferAttachmentParameteri(int target, int attachment, int pname);

    /** Copies a block of pixels from the read framebuffer to the draw framebuffer.@param srcX0 the lower-left coordinate of the source rectangle within the read buffer@param srcY0 the upper-left coordinate of the source rectangle within the read buffer@param srcX1 the lower-right coordinate of the source rectangle within the read buffer@param srcY1 the upper-right coordinate of the source rectangle within the read buffer@param dstX0 the lower-left coordinate of the destination rectangle within the write buffer@param dstY0 the upper-left coordinate of the destination rectangle within the write buffer@param dstX1 the lower-right coordinate of the destination rectangle within the write buffer@param dstY1 the upper-right coordinate of the destination rectangle within the write buffer@param mask the bitwise OR of the flags indicating which buffers are to be copied. One of:<br><table><tr><td>{@link GL11#GL_COLOR_BUFFER_BIT COLOR_BUFFER_BIT}</td><td>{@link GL11#GL_DEPTH_BUFFER_BIT DEPTH_BUFFER_BIT}</td><td>{@link GL11#GL_STENCIL_BUFFER_BIT STENCIL_BUFFER_BIT}</td></tr></table>@param filter the interpolation to be applied if the image is stretched. One of:<br><table><tr><td>{@link GL11#GL_NEAREST NEAREST}</td><td>{@link GL11#GL_LINEAR LINEAR}</td></tr></table>@see <a href="https://docs.gl/gl4/glBlitFramebuffer">Reference Page</a>*/
    void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter);

    /** Generate mipmaps for a specified texture target.@param target the target to which the texture whose mimaps to generate is bound. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30C#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL30C#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>@see <a href="https://docs.gl/gl4/glGenerateMipmap">Reference Page</a>*/
    void glGenerateMipmap(int target);

    /** Sets the integer value of a texture parameter.@param target the texture target@param pname the symbolic name of a single-valued texture parameter@param params the value of {@code pname}@see <a href="https://docs.gl/gl4/glTexParameter">Reference Page</a>*/
    void glTexParameterIiv(int target, int pname, IntBuffer params);

    /** Sets the integer value of a texture parameter.@param target the texture target@param pname the symbolic name of a single-valued texture parameter@see <a href="https://docs.gl/gl4/glTexParameter">Reference Page</a>*/
    void glTexParameterIi(int target, int pname, int param);

    /** Sets the unsigned integer value of a texture parameter.@param target the texture target@param pname the symbolic name of a single-valued texture parameter@param params the value of {@code pname}@see <a href="https://docs.gl/gl4/glTexParameter">Reference Page</a>*/
    void glTexParameterIuiv(int target, int pname, IntBuffer params);

    /** Sets the unsigned integer value of a texture parameter.@param target the texture target@param pname the symbolic name of a single-valued texture parameter@see <a href="https://docs.gl/gl4/glTexParameter">Reference Page</a>*/
    void glTexParameterIui(int target, int pname, int param);

    /** Returns the integer value of a texture parameter.@param target the texture target@param pname the symbolic name of a texture parameter@param params returns the texture parameter value@see <a href="https://docs.gl/gl4/glGetTexParameter">Reference Page</a>*/
    void glGetTexParameterIiv(int target, int pname, IntBuffer params);

    /** Returns the integer value of a texture parameter.@param target the texture target@param pname the symbolic name of a texture parameter@see <a href="https://docs.gl/gl4/glGetTexParameter">Reference Page</a>*/
    int glGetTexParameterIi(int target, int pname);

    /** Returns the unsigned integer value of a texture parameter.@param target the texture target@param pname the symbolic name of a texture parameter@param params returns the texture parameter value@see <a href="https://docs.gl/gl4/glGetTexParameter">Reference Page</a>*/
    void glGetTexParameterIuiv(int target, int pname, IntBuffer params);

    /** Returns the unsigned integer value of a texture parameter.@param target the texture target@param pname the symbolic name of a texture parameter@see <a href="https://docs.gl/gl4/glGetTexParameter">Reference Page</a>*/
    int glGetTexParameterIui(int target, int pname);

    /** Enables and disables writing of frame buffer color components.@param buf the index of the draw buffer whose color mask to set@param r whether R values are written or not@param g whether G values are written or not@param b whether B values are written or not@param a whether A values are written or not@see <a href="https://docs.gl/gl4/glColorMaski">Reference Page</a>*/
    void glColorMaski(int buf, boolean r, boolean g, boolean b, boolean a);

    /** Queries the boolean value of an indexed state variable.@param target the indexed state to query@param index the index of the element being queried@param data a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl4/glGetBooleani_v">Reference Page</a>*/
    void glGetBooleani_v(int target, int index, ByteBuffer data);

    /** Queries the boolean value of an indexed state variable.@param target the indexed state to query@param index the index of the element being queried@see <a href="https://docs.gl/gl4/glGetBooleani_v">Reference Page</a>*/
    boolean glGetBooleani(int target, int index);

    /** Queries the integer value of an indexed state variable.@param target the indexed state to query@param index the index of the element being queried@param data a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl4/glGetIntegeri_v">Reference Page</a>*/
    void glGetIntegeri_v(int target, int index, IntBuffer data);

    /** Queries the integer value of an indexed state variable.@param target the indexed state to query@param index the index of the element being queried@see <a href="https://docs.gl/gl4/glGetIntegeri_v">Reference Page</a>*/
    int glGetIntegeri(int target, int index);

    /** Enables an indexed capability.@param cap the indexed capability to enable@param index the index to enable@see <a href="https://docs.gl/gl4/glEnablei">Reference Page</a>*/
    void glEnablei(int cap, int index);

    /** Disables an indexed capability.@param target the indexed capability to disable@param index the index to disable@see <a href="https://docs.gl/gl4/glDisablei">Reference Page</a>*/
    void glDisablei(int target, int index);

    /** Tests whether an indexed capability is enabled.@param target the indexed capability to query@param index the index to query@see <a href="https://docs.gl/gl4/glIsEnabledi">Reference Page</a>*/
    boolean glIsEnabledi(int target, int index);

    /** Binds a range within a buffer object to an indexed buffer target.@param target the target of the bind operation. One of:<br><table><tr><td>{@link GL30C#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td></tr></table>@param index the index of the binding point within the array specified by {@code target}@param buffer a buffer object to bind to the specified binding point@param offset the starting offset in basic machine units into the buffer object {@code buffer}@param size the amount of data in machine units that can be read from the buffer object while used as an indexed target@see <a href="https://docs.gl/gl4/glBindBufferRange">Reference Page</a>*/
    void glBindBufferRange(int target, int index, int buffer, long offset, long size);

    /** Binds a buffer object to an indexed buffer target.@param target the target of the bind operation. One of:<br><table><tr><td>{@link GL30C#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td></tr></table>@param index the index of the binding point within the array specified by {@code target}@param buffer a buffer object to bind to the specified binding point@see <a href="https://docs.gl/gl4/glBindBufferBase">Reference Page</a>*/
    void glBindBufferBase(int target, int index, int buffer);

    /** Starts transform feedback operation.@param primitiveMode the output type of the primitives that will be recorded into the buffer objects that are bound for transform feedback. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr></table>@see <a href="https://docs.gl/gl4/glBeginTransformFeedback">Reference Page</a>*/
    void glBeginTransformFeedback(int primitiveMode);

    /** Ends transform feedback operation.@see <a href="https://docs.gl/gl4/glEndTransformFeedback">Reference Page</a>*/
    void glEndTransformFeedback();

    /** Specifies values to record in transform feedback buffers.@param program the target program object@param varyings an array of {@code count} zero-terminated strings specifying the names of the varying variables to use for transform feedback@param bufferMode the mode used to capture the varying variables when transform feedback is active. One of:<br><table><tr><td>{@link GL30C#GL_INTERLEAVED_ATTRIBS INTERLEAVED_ATTRIBS}</td><td>{@link GL30C#GL_SEPARATE_ATTRIBS SEPARATE_ATTRIBS}</td></tr></table>@see <a href="https://docs.gl/gl4/glTransformFeedbackVaryings">Reference Page</a>*/
    void glTransformFeedbackVaryings(int program, PointerBuffer varyings, int bufferMode);

    /** Specifies values to record in transform feedback buffers.@param program the target program object@param varyings an array of {@code count} zero-terminated strings specifying the names of the varying variables to use for transform feedback@param bufferMode the mode used to capture the varying variables when transform feedback is active. One of:<br><table><tr><td>{@link GL30C#GL_INTERLEAVED_ATTRIBS INTERLEAVED_ATTRIBS}</td><td>{@link GL30C#GL_SEPARATE_ATTRIBS SEPARATE_ATTRIBS}</td></tr></table>@see <a href="https://docs.gl/gl4/glTransformFeedbackVaryings">Reference Page</a>*/
    void glTransformFeedbackVaryings(int program, CharSequence[] varyings, int bufferMode);

    /** Specifies values to record in transform feedback buffers.@param program the target program object@param bufferMode the mode used to capture the varying variables when transform feedback is active. One of:<br><table><tr><td>{@link GL30C#GL_INTERLEAVED_ATTRIBS INTERLEAVED_ATTRIBS}</td><td>{@link GL30C#GL_SEPARATE_ATTRIBS SEPARATE_ATTRIBS}</td></tr></table>@see <a href="https://docs.gl/gl4/glTransformFeedbackVaryings">Reference Page</a>*/
    void glTransformFeedbackVaryings(int program, CharSequence varying, int bufferMode);

    /** Retrieves information about varying variables selected for transform feedback.@param program the target program object@param index the index of the varying variable whose information to retrieve@param length a variable which will receive the number of characters written into {@code name}, excluding the null-terminator. If {@code length} is NULL no length is returned.@param size a variable that will receive the size of the varying@param type a variable that will receive the type of the varying@param name a buffer into which will be written the name of the varying@see <a href="https://docs.gl/gl4/glGetTransformFeedbackVarying">Reference Page</a>*/
    void glGetTransformFeedbackVarying(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name);

    /** Retrieves information about varying variables selected for transform feedback.@param program the target program object@param index the index of the varying variable whose information to retrieve@param bufSize the maximum number of characters, including the null terminator, that may be written into {@code name}@param size a variable that will receive the size of the varying@param type a variable that will receive the type of the varying@see <a href="https://docs.gl/gl4/glGetTransformFeedbackVarying">Reference Page</a>*/
    String glGetTransformFeedbackVarying(int program, int index, int bufSize, IntBuffer size, IntBuffer type);

    /** Retrieves information about varying variables selected for transform feedback.@param program the target program object@param index the index of the varying variable whose information to retrieve@param size a variable that will receive the size of the varying@param type a variable that will receive the type of the varying@see <a href="https://docs.gl/gl4/glGetTransformFeedbackVarying">Reference Page</a>*/
    String glGetTransformFeedbackVarying(int program, int index, IntBuffer size, IntBuffer type);

    /** Binds a vertex array object@param array the name of the vertex array to bind@see <a href="https://docs.gl/gl4/glBindVertexArray">Reference Page</a>*/
    void glBindVertexArray(int array);

    /** Deletes vertex array objects.@param arrays an array containing the n names of the objects to be deleted@see <a href="https://docs.gl/gl4/glDeleteVertexArrays">Reference Page</a>*/
    void glDeleteVertexArrays(IntBuffer arrays);

    /** Deletes vertex array objects.@see <a href="https://docs.gl/gl4/glDeleteVertexArrays">Reference Page</a>*/
    void glDeleteVertexArrays(int array);

    /** Generates vertex array object names.@param arrays a buffer in which the generated vertex array object names are stored@see <a href="https://docs.gl/gl4/glGenVertexArrays">Reference Page</a>*/
    void glGenVertexArrays(IntBuffer arrays);

    /** Generates vertex array object names.@see <a href="https://docs.gl/gl4/glGenVertexArrays">Reference Page</a>*/
    int glGenVertexArrays();

    /** Determines if a name corresponds to a vertex array object.@param array a value that may be the name of a vertex array object@see <a href="https://docs.gl/gl4/glIsVertexArray">Reference Page</a>*/
    boolean glIsVertexArray(int array);

    /** Array version of: {@link #glClearBufferiv ClearBufferiv}@see <a href="https://docs.gl/gl4/glClearBuffer">Reference Page</a>*/
    void glClearBufferiv(int buffer, int drawbuffer, int[] value);

    /** Array version of: {@link #glClearBufferuiv ClearBufferuiv}@see <a href="https://docs.gl/gl4/glClearBuffer">Reference Page</a>*/
    void glClearBufferuiv(int buffer, int drawbuffer, int[] value);

    /** Array version of: {@link #glClearBufferfv ClearBufferfv}@see <a href="https://docs.gl/gl4/glClearBuffer">Reference Page</a>*/
    void glClearBufferfv(int buffer, int drawbuffer, float[] value);

    /** Array version of: {@link #glVertexAttribI1iv VertexAttribI1iv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI1iv(int index, int[] v);

    /** Array version of: {@link #glVertexAttribI2iv VertexAttribI2iv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI2iv(int index, int[] v);

    /** Array version of: {@link #glVertexAttribI3iv VertexAttribI3iv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI3iv(int index, int[] v);

    /** Array version of: {@link #glVertexAttribI4iv VertexAttribI4iv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI4iv(int index, int[] v);

    /** Array version of: {@link #glVertexAttribI1uiv VertexAttribI1uiv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI1uiv(int index, int[] v);

    /** Array version of: {@link #glVertexAttribI2uiv VertexAttribI2uiv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI2uiv(int index, int[] v);

    /** Array version of: {@link #glVertexAttribI3uiv VertexAttribI3uiv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI3uiv(int index, int[] v);

    /** Array version of: {@link #glVertexAttribI4uiv VertexAttribI4uiv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI4uiv(int index, int[] v);

    /** Array version of: {@link #glVertexAttribI4sv VertexAttribI4sv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI4sv(int index, short[] v);

    /** Array version of: {@link #glVertexAttribI4usv VertexAttribI4usv}@see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>*/
    void glVertexAttribI4usv(int index, short[] v);

    /** Array version of: {@link #glGetVertexAttribIiv GetVertexAttribIiv}@see <a href="https://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>*/
    void glGetVertexAttribIiv(int index, int pname, int[] params);

    /** Array version of: {@link #glGetVertexAttribIuiv GetVertexAttribIuiv}@see <a href="https://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>*/
    void glGetVertexAttribIuiv(int index, int pname, int[] params);

    /** Array version of: {@link #glUniform1uiv Uniform1uiv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform1uiv(int location, int[] value);

    /** Array version of: {@link #glUniform2uiv Uniform2uiv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform2uiv(int location, int[] value);

    /** Array version of: {@link #glUniform3uiv Uniform3uiv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform3uiv(int location, int[] value);

    /** Array version of: {@link #glUniform4uiv Uniform4uiv}@see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>*/
    void glUniform4uiv(int location, int[] value);

    /** Array version of: {@link #glGetUniformuiv GetUniformuiv}@see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>*/
    void glGetUniformuiv(int program, int location, int[] params);

    /** Array version of: {@link #glDeleteRenderbuffers DeleteRenderbuffers}@see <a href="https://docs.gl/gl4/glDeleteRenderbuffers">Reference Page</a>*/
    void glDeleteRenderbuffers(int[] renderbuffers);

    /** Array version of: {@link #glGenRenderbuffers GenRenderbuffers}@see <a href="https://docs.gl/gl4/glGenRenderbuffers">Reference Page</a>*/
    void glGenRenderbuffers(int[] renderbuffers);

    /** Array version of: {@link #glGetRenderbufferParameteriv GetRenderbufferParameteriv}@see <a href="https://docs.gl/gl4/glGetRenderbufferParameter">Reference Page</a>*/
    void glGetRenderbufferParameteriv(int target, int pname, int[] params);

    /** Array version of: {@link #glDeleteFramebuffers DeleteFramebuffers}@see <a href="https://docs.gl/gl4/glDeleteFramebuffers">Reference Page</a>*/
    void glDeleteFramebuffers(int[] framebuffers);

    /** Array version of: {@link #glGenFramebuffers GenFramebuffers}@see <a href="https://docs.gl/gl4/glGenFramebuffers">Reference Page</a>*/
    void glGenFramebuffers(int[] framebuffers);

    /** Array version of: {@link #glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv}@see <a href="https://docs.gl/gl4/glGetFramebufferAttachmentParameter">Reference Page</a>*/
    void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, int[] params);

    /** Array version of: {@link #glTexParameterIiv TexParameterIiv}@see <a href="https://docs.gl/gl4/glTexParameter">Reference Page</a>*/
    void glTexParameterIiv(int target, int pname, int[] params);

    /** Array version of: {@link #glTexParameterIuiv TexParameterIuiv}@see <a href="https://docs.gl/gl4/glTexParameter">Reference Page</a>*/
    void glTexParameterIuiv(int target, int pname, int[] params);

    /** Array version of: {@link #glGetTexParameterIiv GetTexParameterIiv}@see <a href="https://docs.gl/gl4/glGetTexParameter">Reference Page</a>*/
    void glGetTexParameterIiv(int target, int pname, int[] params);

    /** Array version of: {@link #glGetTexParameterIuiv GetTexParameterIuiv}@see <a href="https://docs.gl/gl4/glGetTexParameter">Reference Page</a>*/
    void glGetTexParameterIuiv(int target, int pname, int[] params);

    /** Array version of: {@link #glGetIntegeri_v GetIntegeri_v}@see <a href="https://docs.gl/gl4/glGetIntegeri_v">Reference Page</a>*/
    void glGetIntegeri_v(int target, int index, int[] data);

    /** Array version of: {@link #glGetTransformFeedbackVarying GetTransformFeedbackVarying}@see <a href="https://docs.gl/gl4/glGetTransformFeedbackVarying">Reference Page</a>*/
    void glGetTransformFeedbackVarying(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name);

    /** Array version of: {@link #glDeleteVertexArrays DeleteVertexArrays}@see <a href="https://docs.gl/gl4/glDeleteVertexArrays">Reference Page</a>*/
    void glDeleteVertexArrays(int[] arrays);

    /** Array version of: {@link #glGenVertexArrays GenVertexArrays}@see <a href="https://docs.gl/gl4/glGenVertexArrays">Reference Page</a>*/
    void glGenVertexArrays(int[] arrays);

}
