package br.fosge.engine.runtime.platform.binding.opengl.api;

import java.nio.*;

public interface GL13 {

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_COMPRESSED_ALPHA = 34025;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_COMPRESSED_LUMINANCE = 34026;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_COMPRESSED_LUMINANCE_ALPHA = 34027;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_COMPRESSED_INTENSITY = 34028;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_COMPRESSED_RGB = 34029;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.*/
    int GL_COMPRESSED_RGBA = 34030;

    /** Accepted by the {@code target} parameter of Hint and the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev.*/
    int GL_TEXTURE_COMPRESSION_HINT = 34031;

    /** Accepted by the {@code value} parameter of GetTexLevelParameter.*/
    int GL_TEXTURE_COMPRESSED_IMAGE_SIZE = 34464;

    /** Accepted by the {@code value} parameter of GetTexLevelParameter.*/
    int GL_TEXTURE_COMPRESSED = 34465;

    /** Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev.*/
    int GL_NUM_COMPRESSED_TEXTURE_FORMATS = 34466;

    /** Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev.*/
    int GL_COMPRESSED_TEXTURE_FORMATS = 34467;

    /** Accepted by the {@code param} parameters of TexGend, TexGenf, and TexGeni when {@code pname} parameter is TEXTURE_GEN_MODE.*/
    int GL_NORMAL_MAP = 34065;

    /** Accepted by the {@code param} parameters of TexGend, TexGenf, and TexGeni when {@code pname} parameter is TEXTURE_GEN_MODE.*/
    int GL_REFLECTION_MAP = 34066;

    /** When the {@code pname} parameter of TexGendv, TexGenfv, and TexGeniv is TEXTURE_GEN_MODE, then the array {@code params} may also contain NORMAL_MAP or REFLECTION_MAP. Accepted by the {@code cap} parameter of Enable, Disable, IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev, and by the {@code target} parameter of BindTexture, GetTexParameterfv, GetTexParameteriv, TexParameterf, TexParameteri, TexParameterfv, and TexParameteriv.*/
    int GL_TEXTURE_CUBE_MAP = 34067;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_TEXTURE_BINDING_CUBE_MAP = 34068;

    /** Accepted by the {@code target} parameter of GetTexImage, GetTexLevelParameteriv, GetTexLevelParameterfv, TexImage2D, CopyTexImage2D, TexSubImage2D, and CopySubTexImage2D.*/
    int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 34069;

    /** Accepted by the {@code target} parameter of GetTexImage, GetTexLevelParameteriv, GetTexLevelParameterfv, TexImage2D, CopyTexImage2D, TexSubImage2D, and CopySubTexImage2D.*/
    int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 34070;

    /** Accepted by the {@code target} parameter of GetTexImage, GetTexLevelParameteriv, GetTexLevelParameterfv, TexImage2D, CopyTexImage2D, TexSubImage2D, and CopySubTexImage2D.*/
    int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 34071;

    /** Accepted by the {@code target} parameter of GetTexImage, GetTexLevelParameteriv, GetTexLevelParameterfv, TexImage2D, CopyTexImage2D, TexSubImage2D, and CopySubTexImage2D.*/
    int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 34072;

    /** Accepted by the {@code target} parameter of GetTexImage, GetTexLevelParameteriv, GetTexLevelParameterfv, TexImage2D, CopyTexImage2D, TexSubImage2D, and CopySubTexImage2D.*/
    int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 34073;

    /** Accepted by the {@code target} parameter of GetTexImage, GetTexLevelParameteriv, GetTexLevelParameterfv, TexImage2D, CopyTexImage2D, TexSubImage2D, and CopySubTexImage2D.*/
    int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 34074;

    /** Accepted by the {@code target} parameter of GetTexLevelParameteriv, GetTexLevelParameterfv, GetTexParameteriv, and TexImage2D.*/
    int GL_PROXY_TEXTURE_CUBE_MAP = 34075;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_MAX_CUBE_MAP_TEXTURE_SIZE = 34076;

    /** Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_MULTISAMPLE = 32925;

    /** Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_SAMPLE_ALPHA_TO_COVERAGE = 32926;

    /** Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_SAMPLE_ALPHA_TO_ONE = 32927;

    /** Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_SAMPLE_COVERAGE = 32928;

    /** Accepted by the {@code mask} parameter of PushAttrib.*/
    int GL_MULTISAMPLE_BIT = 536870912;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_SAMPLE_BUFFERS = 32936;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_SAMPLES = 32937;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_SAMPLE_COVERAGE_VALUE = 32938;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_SAMPLE_COVERAGE_INVERT = 32939;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE0 = 33984;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE1 = 33985;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE2 = 33986;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE3 = 33987;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE4 = 33988;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE5 = 33989;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE6 = 33990;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE7 = 33991;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE8 = 33992;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE9 = 33993;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE10 = 33994;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE11 = 33995;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE12 = 33996;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE13 = 33997;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE14 = 33998;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE15 = 33999;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE16 = 34000;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE17 = 34001;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE18 = 34002;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE19 = 34003;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE20 = 34004;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE21 = 34005;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE22 = 34006;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE23 = 34007;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE24 = 34008;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE25 = 34009;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE26 = 34010;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE27 = 34011;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE28 = 34012;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE29 = 34013;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE30 = 34014;

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.*/
    int GL_TEXTURE31 = 34015;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_ACTIVE_TEXTURE = 34016;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_CLIENT_ACTIVE_TEXTURE = 34017;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.*/
    int GL_MAX_TEXTURE_UNITS = 34018;

    /** Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is TEXTURE_ENV_MODE.*/
    int GL_COMBINE = 34160;

    /** Accepted by the {@code pname} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code target} parameter value is TEXTURE_ENV.*/
    int GL_COMBINE_RGB = 34161;

    /** Accepted by the {@code pname} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code target} parameter value is TEXTURE_ENV.*/
    int GL_COMBINE_ALPHA = 34162;

    /** Accepted by the {@code pname} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code target} parameter value is TEXTURE_ENV.*/
    int GL_SOURCE0_RGB = 34176;

    /** Accepted by the {@code pname} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code target} parameter value is TEXTURE_ENV.*/
    int GL_SOURCE1_RGB = 34177;

    /** Accepted by the {@code pname} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code target} parameter value is TEXTURE_ENV.*/
    int GL_SOURCE2_RGB = 34178;

    /** Accepted by the {@code pname} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code target} parameter value is TEXTURE_ENV.*/
    int GL_SOURCE0_ALPHA = 34184;

    /** Accepted by the {@code pname} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code target} parameter value is TEXTURE_ENV.*/
    int GL_SOURCE1_ALPHA = 34185;

    /** Accepted by the {@code pname} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code target} parameter value is TEXTURE_ENV.*/
    int GL_SOURCE2_ALPHA = 34186;

    /** Accepted by the {@code pname} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code target} parameter value is TEXTURE_ENV.*/
    int GL_OPERAND0_RGB = 34192;

    /** Accepted by the {@code pname} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code target} parameter value is TEXTURE_ENV.*/
    int GL_OPERAND1_RGB = 34193;

    /** Accepted by the {@code pname} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code target} parameter value is TEXTURE_ENV.*/
    int GL_OPERAND2_RGB = 34194;

    /** Accepted by the {@code pname} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code target} parameter value is TEXTURE_ENV.*/
    int GL_OPERAND0_ALPHA = 34200;

    /** Accepted by the {@code pname} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code target} parameter value is TEXTURE_ENV.*/
    int GL_OPERAND1_ALPHA = 34201;

    /** Accepted by the {@code pname} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code target} parameter value is TEXTURE_ENV.*/
    int GL_OPERAND2_ALPHA = 34202;

    /** Accepted by the {@code pname} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code target} parameter value is TEXTURE_ENV.*/
    int GL_RGB_SCALE = 34163;

    /** Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is COMBINE_RGB or COMBINE_ALPHA.*/
    int GL_ADD_SIGNED = 34164;

    /** Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is COMBINE_RGB or COMBINE_ALPHA.*/
    int GL_INTERPOLATE = 34165;

    /** Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is COMBINE_RGB or COMBINE_ALPHA.*/
    int GL_SUBTRACT = 34023;

    /** Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is SOURCE0_RGB, SOURCE1_RGB, SOURCE2_RGB, SOURCE0_ALPHA, SOURCE1_ALPHA, or SOURCE2_ALPHA.*/
    int GL_CONSTANT = 34166;

    /** Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is SOURCE0_RGB, SOURCE1_RGB, SOURCE2_RGB, SOURCE0_ALPHA, SOURCE1_ALPHA, or SOURCE2_ALPHA.*/
    int GL_PRIMARY_COLOR = 34167;

    /** Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is SOURCE0_RGB, SOURCE1_RGB, SOURCE2_RGB, SOURCE0_ALPHA, SOURCE1_ALPHA, or SOURCE2_ALPHA.*/
    int GL_PREVIOUS = 34168;

    /** Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is COMBINE_RGB_ARB.*/
    int GL_DOT3_RGB = 34478;

    /** Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is COMBINE_RGB_ARB.*/
    int GL_DOT3_RGBA = 34479;

    /** Accepted by the {@code param} parameter of TexParameteri and TexParameterf, and by the {@code params} parameter of TexParameteriv and TexParameterfv, when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T, or TEXTURE_WRAP_R.*/
    int GL_CLAMP_TO_BORDER = 33069;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_TRANSPOSE_MODELVIEW_MATRIX = 34019;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_TRANSPOSE_PROJECTION_MATRIX = 34020;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_TRANSPOSE_TEXTURE_MATRIX = 34021;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.*/
    int GL_TRANSPOSE_COLOR_MATRIX = 34022;

    /** Specifies a three-dimensional texture image in a compressed format.@param target the target texture. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL12#GL_PROXY_TEXTURE_3D PROXY_TEXTURE_3D}</td></tr><tr><td>{@link GL30#GL_PROXY_TEXTURE_2D_ARRAY PROXY_TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_PROXY_TEXTURE_CUBE_MAP_ARRAY PROXY_TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>@param level the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.@param internalformat the format of the compressed image data. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>@param width the width of the texture image@param height the height of the texture image@param depth the depth of the texture image@param border must be 0@param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}@param data a pointer to the compressed image data@see <a href="https://docs.gl/gl4/glCompressedTexImage3D">Reference Page</a>*/
    void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data);

    /** Specifies a three-dimensional texture image in a compressed format.@param target the target texture. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL12#GL_PROXY_TEXTURE_3D PROXY_TEXTURE_3D}</td></tr><tr><td>{@link GL30#GL_PROXY_TEXTURE_2D_ARRAY PROXY_TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_PROXY_TEXTURE_CUBE_MAP_ARRAY PROXY_TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>@param level the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.@param internalformat the format of the compressed image data. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>@param width the width of the texture image@param height the height of the texture image@param depth the depth of the texture image@param border must be 0@param data a pointer to the compressed image data@see <a href="https://docs.gl/gl4/glCompressedTexImage3D">Reference Page</a>*/
    void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer data);

    /** Specifies a two-dimensional texture image in a compressed format.@param target the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13C#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL11#GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link GL13C#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr></table>@param level the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.@param internalformat the format of the compressed image data. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>@param width the width of the texture image@param height the height of the texture image@param border must be 0@param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}@param data a pointer to the compressed image data@see <a href="https://docs.gl/gl4/glCompressedTexImage2D">Reference Page</a>*/
    void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data);

    /** Specifies a two-dimensional texture image in a compressed format.@param target the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13C#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL11#GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link GL13C#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr></table>@param level the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.@param internalformat the format of the compressed image data. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>@param width the width of the texture image@param height the height of the texture image@param border must be 0@param data a pointer to the compressed image data@see <a href="https://docs.gl/gl4/glCompressedTexImage2D">Reference Page</a>*/
    void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, ByteBuffer data);

    /** Specifies a one-dimensional texture image in a compressed format.@param target the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>@param level the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.@param internalformat the format of the compressed image data. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>@param width the width of the texture image@param border must be 0@param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}@param data a pointer to the compressed image data@see <a href="https://docs.gl/gl4/glCompressedTexImage1D">Reference Page</a>*/
    void glCompressedTexImage1D(int target, int level, int internalformat, int width, int border, int imageSize, long data);

    /** Specifies a one-dimensional texture image in a compressed format.@param target the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>@param level the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.@param internalformat the format of the compressed image data. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>@param width the width of the texture image@param border must be 0@param data a pointer to the compressed image data@see <a href="https://docs.gl/gl4/glCompressedTexImage1D">Reference Page</a>*/
    void glCompressedTexImage1D(int target, int level, int internalformat, int width, int border, ByteBuffer data);

    /** Respecifies only a cubic subregion of an existing 3D texel array, with incoming data stored in a specific compressed image format.@param target the target texture. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>@param level the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.@param xoffset a texel offset in the x direction within the texture array@param yoffset a texel offset in the y direction within the texture array@param zoffset a texel offset in the z direction within the texture array@param width the width of the texture subimage@param height the height of the texture subimage@param depth the depth of the texture subimage@param format the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>@param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}@param data a pointer to the compressed image data@see <a href="https://docs.gl/gl4/glCompressedTexSubImage3D">Reference Page</a>*/
    void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data);

    /** Respecifies only a cubic subregion of an existing 3D texel array, with incoming data stored in a specific compressed image format.@param target the target texture. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>@param level the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.@param xoffset a texel offset in the x direction within the texture array@param yoffset a texel offset in the y direction within the texture array@param zoffset a texel offset in the z direction within the texture array@param width the width of the texture subimage@param height the height of the texture subimage@param depth the depth of the texture subimage@param format the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>@param data a pointer to the compressed image data@see <a href="https://docs.gl/gl4/glCompressedTexSubImage3D">Reference Page</a>*/
    void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data);

    /** Respecifies only a rectangular subregion of an existing 2D texel array, with incoming data stored in a specific compressed image format.@param target the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13C#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>@param level the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.@param xoffset a texel offset in the x direction within the texture array@param yoffset a texel offset in the y direction within the texture array@param width the width of the texture subimage@param height the height of the texture subimage@param format the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>@param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}@param data a pointer to the compressed image data@see <a href="https://docs.gl/gl4/glCompressedTexSubImage2D">Reference Page</a>*/
    void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data);

    /** Respecifies only a rectangular subregion of an existing 2D texel array, with incoming data stored in a specific compressed image format.@param target the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13C#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>@param level the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.@param xoffset a texel offset in the x direction within the texture array@param yoffset a texel offset in the y direction within the texture array@param width the width of the texture subimage@param height the height of the texture subimage@param format the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>@param data a pointer to the compressed image data@see <a href="https://docs.gl/gl4/glCompressedTexSubImage2D">Reference Page</a>*/
    void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data);

    /** Respecifies only a subregion of an existing 1D texel array, with incoming data stored in a specific compressed image format.@param target the target texture. Must be:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>@param level the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.@param xoffset a texel offset in the x direction within the texture array@param width the width of the texture subimage@param format the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>@param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}@param data a pointer to the compressed image data@see <a href="https://docs.gl/gl4/glCompressedTexSubImage1D">Reference Page</a>*/
    void glCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int imageSize, long data);

    /** Respecifies only a subregion of an existing 1D texel array, with incoming data stored in a specific compressed image format.@param target the target texture. Must be:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>@param level the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.@param xoffset a texel offset in the x direction within the texture array@param width the width of the texture subimage@param format the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>@param data a pointer to the compressed image data@see <a href="https://docs.gl/gl4/glCompressedTexSubImage1D">Reference Page</a>*/
    void glCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, ByteBuffer data);

    /** Returns a compressed texture image.@param target the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL13C#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13C#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td><td>{@link GL13C#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td></tr><tr><td>{@link GL13C#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13C#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13C#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>@param level the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.@param pixels a buffer in which to return the compressed texture image@see <a href="https://docs.gl/gl4/glGetCompressedTexImage">Reference Page</a>*/
    void glGetCompressedTexImage(int target, int level, ByteBuffer pixels);

    /** Returns a compressed texture image.@param target the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL13C#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13C#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td><td>{@link GL13C#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td></tr><tr><td>{@link GL13C#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13C#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13C#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>@param level the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.@param pixels a buffer in which to return the compressed texture image@see <a href="https://docs.gl/gl4/glGetCompressedTexImage">Reference Page</a>*/
    void glGetCompressedTexImage(int target, int level, long pixels);

    /** Specifies multisample coverage parameters. <p>Multisampling samples a pixel multiple times at various implementation-dependent subpixel locations to generate antialiasing effects. Multisampling transparently antialiases points, lines, polygons, and images if it is enabled.</p> <p>{@code value} is used in constructing a temporary mask used in determining which samples will be used in resolving the final fragment color. This mask is bitwise-ANDed with the coverage mask generated from the multisampling computation. If the {@code invert} flag is set, the temporary mask is inverted (all bits flipped) and then the bitwise-AND is computed.</p> <p>If an implementation does not have any multisample buffers available, or multisampling is disabled, rasterization occurs with only a single sample computing a pixel's final RGB color.</p> <p>Provided an implementation supports multisample buffers, and multisampling is enabled, then a pixel's final color is generated by combining several samples per pixel. Each sample contains color, depth, and stencil information, allowing those operations to be performed on each sample.</p>@param value a sample coverage value. The value is clamped to the range [0, 1]. The initial value is 1.0.@param invert if the coverage masks should be inverted. The initial value is false.@see <a href="https://docs.gl/gl4/glSampleCoverage">Reference Page</a>*/
    void glSampleCoverage(float value, boolean invert);

    /** Selects which texture unit subsequent texture state calls will affect. The number of texture units an implementation supports is implementation dependent.@param texture which texture unit to make active. One of:<br><table><tr><td>{@link GL13C#GL_TEXTURE0 TEXTURE0}</td><td>GL_TEXTURE[1-31]</td></tr></table>@see <a href="https://docs.gl/gl4/glActiveTexture">Reference Page</a>*/
    void glActiveTexture(int texture);

    /** Selects the vertex array client state parameters to be modified by the TexCoordPointer command and the array affected by EnableClientState and DisableClientState with parameter TEXTURE_COORD_ARRAY.@param texture which texture coordinate array to make active. One of:<br><table><tr><td>{@link #GL_TEXTURE0 TEXTURE0}</td><td>GL_TEXTURE[1-31]</td></tr></table>@see <a href="https://docs.gl/gl3/glClientActiveTexture">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glClientActiveTexture(int texture);

    /** Sets the current one-dimensional texture coordinate for the specified texture coordinate set. {@code t} and {@code r} are implicitly set to 0 and {@code q} to 1.@param texture the coordinate set to be modified@param s the s component of the current texture coordinates@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord1f(int texture, float s);

    /** Short version of {@link #glMultiTexCoord1f MultiTexCoord1f}.@param texture the coordinate set to be modified@param s the s component of the current texture coordinates@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord1s(int texture, short s);

    /** Integer version of {@link #glMultiTexCoord1f MultiTexCoord1f}.@param texture the coordinate set to be modified@param s the s component of the current texture coordinates@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord1i(int texture, int s);

    /** Double version of {@link #glMultiTexCoord1f MultiTexCoord1f}.@param texture the coordinate set to be modified@param s the s component of the current texture coordinates@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord1d(int texture, double s);

    /** Pointer version of {@link #glMultiTexCoord1f MultiTexCoord1f}.@param texture the coordinate set to be modified@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord1fv(int texture, FloatBuffer v);

    /** Pointer version of {@link #glMultiTexCoord1s MultiTexCoord1s}.@param texture the coordinate set to be modified@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord1sv(int texture, ShortBuffer v);

    /** Pointer version of {@link #glMultiTexCoord1i MultiTexCoord1i}.@param texture the coordinate set to be modified@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord1iv(int texture, IntBuffer v);

    /** Pointer version of {@link #glMultiTexCoord1d MultiTexCoord1d}.@param texture the coordinate set to be modified@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord1dv(int texture, DoubleBuffer v);

    /** Sets the current two-dimensional texture coordinate for the specified texture coordinate set. {@code r} is implicitly set to 0 and {@code q} to 1.@param texture the coordinate set to be modified@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord2f(int texture, float s, float t);

    /** Short version of {@link #glMultiTexCoord2f MultiTexCoord2f}.@param texture the coordinate set to be modified@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord2s(int texture, short s, short t);

    /** Integer version of {@link #glMultiTexCoord2f MultiTexCoord2f}.@param texture the coordinate set to be modified@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord2i(int texture, int s, int t);

    /** Double version of {@link #glMultiTexCoord2f MultiTexCoord2f}.@param texture the coordinate set to be modified@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord2d(int texture, double s, double t);

    /** Pointer version of {@link #glMultiTexCoord2f MultiTexCoord2f}.@param texture the coordinate set to be modified@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord2fv(int texture, FloatBuffer v);

    /** Pointer version of {@link #glMultiTexCoord2s MultiTexCoord2s}.@param texture the coordinate set to be modified@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord2sv(int texture, ShortBuffer v);

    /** Pointer version of {@link #glMultiTexCoord2i MultiTexCoord2i}.@param texture the coordinate set to be modified@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord2iv(int texture, IntBuffer v);

    /** Pointer version of {@link #glMultiTexCoord2d MultiTexCoord2d}.@param texture the coordinate set to be modified@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord2dv(int texture, DoubleBuffer v);

    /** Sets the current three-dimensional texture coordinate for the specified texture coordinate set. {@code q} is implicitly set to 1.@param texture the coordinate set to be modified@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@param r the r component of the current texture coordinates@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord3f(int texture, float s, float t, float r);

    /** Short version of {@link #glMultiTexCoord3f MultiTexCoord3f}.@param texture the coordinate set to be modified@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@param r the r component of the current texture coordinates@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord3s(int texture, short s, short t, short r);

    /** Integer version of {@link #glMultiTexCoord3f MultiTexCoord3f}.@param texture the coordinate set to be modified@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@param r the r component of the current texture coordinates@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord3i(int texture, int s, int t, int r);

    /** Double version of {@link #glMultiTexCoord3f MultiTexCoord3f}.@param texture the coordinate set to be modified@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@param r the r component of the current texture coordinates@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord3d(int texture, double s, double t, double r);

    /** Pointer version of {@link #glMultiTexCoord3f MultiTexCoord3f}.@param texture the coordinate set to be modified@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord3fv(int texture, FloatBuffer v);

    /** Pointer version of {@link #glMultiTexCoord3s MultiTexCoord3s}.@param texture the coordinate set to be modified@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord3sv(int texture, ShortBuffer v);

    /** Pointer version of {@link #glMultiTexCoord3i MultiTexCoord3i}.@param texture the coordinate set to be modified@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord3iv(int texture, IntBuffer v);

    /** Pointer version of {@link #glMultiTexCoord3d MultiTexCoord3d}.@param texture the coordinate set to be modified@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord3dv(int texture, DoubleBuffer v);

    /** Sets the current four-dimensional texture coordinate for the specified texture coordinate set.@param texture the coordinate set to be modified@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@param r the r component of the current texture coordinates@param q the q component of the current texture coordinates@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord4f(int texture, float s, float t, float r, float q);

    /** Short version of {@link #glMultiTexCoord4f MultiTexCoord4f}.@param texture the coordinate set to be modified@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@param r the r component of the current texture coordinates@param q the q component of the current texture coordinates@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord4s(int texture, short s, short t, short r, short q);

    /** Integer version of {@link #glMultiTexCoord4f MultiTexCoord4f}.@param texture the coordinate set to be modified@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@param r the r component of the current texture coordinates@param q the q component of the current texture coordinates@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord4i(int texture, int s, int t, int r, int q);

    /** Double version of {@link #glMultiTexCoord4f MultiTexCoord4f}.@param texture the coordinate set to be modified@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@param r the r component of the current texture coordinates@param q the q component of the current texture coordinates@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord4d(int texture, double s, double t, double r, double q);

    /** Pointer version of {@link #glMultiTexCoord4f MultiTexCoord4f}.@param texture the coordinate set to be modified@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord4fv(int texture, FloatBuffer v);

    /** Pointer version of {@link #glMultiTexCoord4s MultiTexCoord4s}.@param texture the coordinate set to be modified@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord4sv(int texture, ShortBuffer v);

    /** Pointer version of {@link #glMultiTexCoord4i MultiTexCoord4i}.@param texture the coordinate set to be modified@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord4iv(int texture, IntBuffer v);

    /** Pointer version of {@link #glMultiTexCoord4d MultiTexCoord4d}.@param texture the coordinate set to be modified@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord4dv(int texture, DoubleBuffer v);

    /** Sets the current matrix to a 4 &times; 4 matrix in row-major order. <p>The matrix is stored as 16 consecutive values, i.e. as:</p> <table class=striped> <tr><td>a1</td><td>a2</td><td>a3</td><td>a4</td></tr> <tr><td>a5</td><td>a6</td><td>a7</td><td>a8</td></tr> <tr><td>a9</td><td>a10</td><td>a11</td><td>a12</td></tr> <tr><td>a13</td><td>a14</td><td>a15</td><td>a16</td></tr> </table>@param m the matrix data@see <a href="https://docs.gl/gl3/glLoadTransposeMatrixf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLoadTransposeMatrixf(FloatBuffer m);

    /** Double version of {@link #glLoadTransposeMatrixf LoadTransposeMatrixf}.@param m the matrix data@see <a href="https://docs.gl/gl3/glLoadTransposeMatrixd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLoadTransposeMatrixd(DoubleBuffer m);

    /** Multiplies the current matrix with a 4 &times; 4 matrix in row-major order. See {@link #glLoadTransposeMatrixf LoadTransposeMatrixf} for details.@param m the matrix data@see <a href="https://docs.gl/gl3/glMultTransposeMatrixf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultTransposeMatrixf(FloatBuffer m);

    /** Double version of {@link #glMultTransposeMatrixf MultTransposeMatrixf}.@param m the matrix data@see <a href="https://docs.gl/gl3/glMultTransposeMatrixd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultTransposeMatrixd(DoubleBuffer m);

    /** Array version of: {@link #glMultiTexCoord1fv MultiTexCoord1fv}@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord1fv(int texture, float[] v);

    /** Array version of: {@link #glMultiTexCoord1sv MultiTexCoord1sv}@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord1sv(int texture, short[] v);

    /** Array version of: {@link #glMultiTexCoord1iv MultiTexCoord1iv}@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord1iv(int texture, int[] v);

    /** Array version of: {@link #glMultiTexCoord1dv MultiTexCoord1dv}@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord1dv(int texture, double[] v);

    /** Array version of: {@link #glMultiTexCoord2fv MultiTexCoord2fv}@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord2fv(int texture, float[] v);

    /** Array version of: {@link #glMultiTexCoord2sv MultiTexCoord2sv}@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord2sv(int texture, short[] v);

    /** Array version of: {@link #glMultiTexCoord2iv MultiTexCoord2iv}@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord2iv(int texture, int[] v);

    /** Array version of: {@link #glMultiTexCoord2dv MultiTexCoord2dv}@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord2dv(int texture, double[] v);

    /** Array version of: {@link #glMultiTexCoord3fv MultiTexCoord3fv}@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord3fv(int texture, float[] v);

    /** Array version of: {@link #glMultiTexCoord3sv MultiTexCoord3sv}@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord3sv(int texture, short[] v);

    /** Array version of: {@link #glMultiTexCoord3iv MultiTexCoord3iv}@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord3iv(int texture, int[] v);

    /** Array version of: {@link #glMultiTexCoord3dv MultiTexCoord3dv}@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord3dv(int texture, double[] v);

    /** Array version of: {@link #glMultiTexCoord4fv MultiTexCoord4fv}@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord4fv(int texture, float[] v);

    /** Array version of: {@link #glMultiTexCoord4sv MultiTexCoord4sv}@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord4sv(int texture, short[] v);

    /** Array version of: {@link #glMultiTexCoord4iv MultiTexCoord4iv}@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord4iv(int texture, int[] v);

    /** Array version of: {@link #glMultiTexCoord4dv MultiTexCoord4dv}@see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultiTexCoord4dv(int texture, double[] v);

    /** Array version of: {@link #glLoadTransposeMatrixf LoadTransposeMatrixf}@see <a href="https://docs.gl/gl3/glLoadTransposeMatrixf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLoadTransposeMatrixf(float[] m);

    /** Array version of: {@link #glLoadTransposeMatrixd LoadTransposeMatrixd}@see <a href="https://docs.gl/gl3/glLoadTransposeMatrixd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLoadTransposeMatrixd(double[] m);

    /** Array version of: {@link #glMultTransposeMatrixf MultTransposeMatrixf}@see <a href="https://docs.gl/gl3/glMultTransposeMatrixf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultTransposeMatrixf(float[] m);

    /** Array version of: {@link #glMultTransposeMatrixd MultTransposeMatrixd}@see <a href="https://docs.gl/gl3/glMultTransposeMatrixd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultTransposeMatrixd(double[] m);

}
