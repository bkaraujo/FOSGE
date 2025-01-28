package br.fosge.engine.runtime.platform.binding.opengl.api;

import org.lwjgl.PointerBuffer;

import java.nio.*;

public interface GL11 {

    /** AccumOp*/
    int GL_ACCUM = 256;

    /** AccumOp*/
    int GL_LOAD = 257;

    /** AccumOp*/
    int GL_RETURN = 258;

    /** AccumOp*/
    int GL_MULT = 259;

    /** AccumOp*/
    int GL_ADD = 260;

    /** AlphaFunction*/
    int GL_NEVER = 512;

    /** AlphaFunction*/
    int GL_LESS = 513;

    /** AlphaFunction*/
    int GL_EQUAL = 514;

    /** AlphaFunction*/
    int GL_LEQUAL = 515;

    /** AlphaFunction*/
    int GL_GREATER = 516;

    /** AlphaFunction*/
    int GL_NOTEQUAL = 517;

    /** AlphaFunction*/
    int GL_GEQUAL = 518;

    /** AlphaFunction*/
    int GL_ALWAYS = 519;

    /** AttribMask*/
    int GL_CURRENT_BIT = 1;

    /** AttribMask*/
    int GL_POINT_BIT = 2;

    /** AttribMask*/
    int GL_LINE_BIT = 4;

    /** AttribMask*/
    int GL_POLYGON_BIT = 8;

    /** AttribMask*/
    int GL_POLYGON_STIPPLE_BIT = 16;

    /** AttribMask*/
    int GL_PIXEL_MODE_BIT = 32;

    /** AttribMask*/
    int GL_LIGHTING_BIT = 64;

    /** AttribMask*/
    int GL_FOG_BIT = 128;

    /** AttribMask*/
    int GL_DEPTH_BUFFER_BIT = 256;

    /** AttribMask*/
    int GL_ACCUM_BUFFER_BIT = 512;

    /** AttribMask*/
    int GL_STENCIL_BUFFER_BIT = 1024;

    /** AttribMask*/
    int GL_VIEWPORT_BIT = 2048;

    /** AttribMask*/
    int GL_TRANSFORM_BIT = 4096;

    /** AttribMask*/
    int GL_ENABLE_BIT = 8192;

    /** AttribMask*/
    int GL_COLOR_BUFFER_BIT = 16384;

    /** AttribMask*/
    int GL_HINT_BIT = 32768;

    /** AttribMask*/
    int GL_EVAL_BIT = 65536;

    /** AttribMask*/
    int GL_LIST_BIT = 131072;

    /** AttribMask*/
    int GL_TEXTURE_BIT = 262144;

    /** AttribMask*/
    int GL_SCISSOR_BIT = 524288;

    /** AttribMask*/
    int GL_ALL_ATTRIB_BITS = 1048575;

    /** BeginMode*/
    int GL_POINTS = 0;

    /** BeginMode*/
    int GL_LINES = 1;

    /** BeginMode*/
    int GL_LINE_LOOP = 2;

    /** BeginMode*/
    int GL_LINE_STRIP = 3;

    /** BeginMode*/
    int GL_TRIANGLES = 4;

    /** BeginMode*/
    int GL_TRIANGLE_STRIP = 5;

    /** BeginMode*/
    int GL_TRIANGLE_FAN = 6;

    /** BeginMode*/
    int GL_QUADS = 7;

    /** BeginMode*/
    int GL_QUAD_STRIP = 8;

    /** BeginMode*/
    int GL_POLYGON = 9;

    /** BlendingFactorDest*/
    int GL_ZERO = 0;

    /** BlendingFactorDest*/
    int GL_ONE = 1;

    /** BlendingFactorDest*/
    int GL_SRC_COLOR = 768;

    /** BlendingFactorDest*/
    int GL_ONE_MINUS_SRC_COLOR = 769;

    /** BlendingFactorDest*/
    int GL_SRC_ALPHA = 770;

    /** BlendingFactorDest*/
    int GL_ONE_MINUS_SRC_ALPHA = 771;

    /** BlendingFactorDest*/
    int GL_DST_ALPHA = 772;

    /** BlendingFactorDest*/
    int GL_ONE_MINUS_DST_ALPHA = 773;

    /** BlendingFactorSrc*/
    int GL_DST_COLOR = 774;

    /** BlendingFactorSrc*/
    int GL_ONE_MINUS_DST_COLOR = 775;

    /** BlendingFactorSrc*/
    int GL_SRC_ALPHA_SATURATE = 776;

    /** Boolean*/
    int GL_TRUE = 1;

    /** Boolean*/
    int GL_FALSE = 0;

    /** ClipPlaneName*/
    int GL_CLIP_PLANE0 = 12288;

    /** ClipPlaneName*/
    int GL_CLIP_PLANE1 = 12289;

    /** ClipPlaneName*/
    int GL_CLIP_PLANE2 = 12290;

    /** ClipPlaneName*/
    int GL_CLIP_PLANE3 = 12291;

    /** ClipPlaneName*/
    int GL_CLIP_PLANE4 = 12292;

    /** ClipPlaneName*/
    int GL_CLIP_PLANE5 = 12293;

    /** DataType*/
    int GL_BYTE = 5120;

    /** DataType*/
    int GL_UNSIGNED_BYTE = 5121;

    /** DataType*/
    int GL_SHORT = 5122;

    /** DataType*/
    int GL_UNSIGNED_SHORT = 5123;

    /** DataType*/
    int GL_INT = 5124;

    /** DataType*/
    int GL_UNSIGNED_INT = 5125;

    /** DataType*/
    int GL_FLOAT = 5126;

    /** DataType*/
    int GL_2_BYTES = 5127;

    /** DataType*/
    int GL_3_BYTES = 5128;

    /** DataType*/
    int GL_4_BYTES = 5129;

    /** DataType*/
    int GL_DOUBLE = 5130;

    /** DrawBufferMode*/
    int GL_NONE = 0;

    /** DrawBufferMode*/
    int GL_FRONT_LEFT = 1024;

    /** DrawBufferMode*/
    int GL_FRONT_RIGHT = 1025;

    /** DrawBufferMode*/
    int GL_BACK_LEFT = 1026;

    /** DrawBufferMode*/
    int GL_BACK_RIGHT = 1027;

    /** DrawBufferMode*/
    int GL_FRONT = 1028;

    /** DrawBufferMode*/
    int GL_BACK = 1029;

    /** DrawBufferMode*/
    int GL_LEFT = 1030;

    /** DrawBufferMode*/
    int GL_RIGHT = 1031;

    /** DrawBufferMode*/
    int GL_FRONT_AND_BACK = 1032;

    /** DrawBufferMode*/
    int GL_AUX0 = 1033;

    /** DrawBufferMode*/
    int GL_AUX1 = 1034;

    /** DrawBufferMode*/
    int GL_AUX2 = 1035;

    /** DrawBufferMode*/
    int GL_AUX3 = 1036;

    /** ErrorCode*/
    int GL_NO_ERROR = 0;

    /** ErrorCode*/
    int GL_INVALID_ENUM = 1280;

    /** ErrorCode*/
    int GL_INVALID_VALUE = 1281;

    /** ErrorCode*/
    int GL_INVALID_OPERATION = 1282;

    /** ErrorCode*/
    int GL_STACK_OVERFLOW = 1283;

    /** ErrorCode*/
    int GL_STACK_UNDERFLOW = 1284;

    /** ErrorCode*/
    int GL_OUT_OF_MEMORY = 1285;

    /** FeedBackMode*/
    int GL_2D = 1536;

    /** FeedBackMode*/
    int GL_3D = 1537;

    /** FeedBackMode*/
    int GL_3D_COLOR = 1538;

    /** FeedBackMode*/
    int GL_3D_COLOR_TEXTURE = 1539;

    /** FeedBackMode*/
    int GL_4D_COLOR_TEXTURE = 1540;

    /** FeedBackToken*/
    int GL_PASS_THROUGH_TOKEN = 1792;

    /** FeedBackToken*/
    int GL_POINT_TOKEN = 1793;

    /** FeedBackToken*/
    int GL_LINE_TOKEN = 1794;

    /** FeedBackToken*/
    int GL_POLYGON_TOKEN = 1795;

    /** FeedBackToken*/
    int GL_BITMAP_TOKEN = 1796;

    /** FeedBackToken*/
    int GL_DRAW_PIXEL_TOKEN = 1797;

    /** FeedBackToken*/
    int GL_COPY_PIXEL_TOKEN = 1798;

    /** FeedBackToken*/
    int GL_LINE_RESET_TOKEN = 1799;

    /** FogMode*/
    int GL_EXP = 2048;

    /** FogMode*/
    int GL_EXP2 = 2049;

    /** FrontFaceDirection*/
    int GL_CW = 2304;

    /** FrontFaceDirection*/
    int GL_CCW = 2305;

    /** GetMapTarget*/
    int GL_COEFF = 2560;

    /** GetMapTarget*/
    int GL_ORDER = 2561;

    /** GetMapTarget*/
    int GL_DOMAIN = 2562;

    /** GetTarget*/
    int GL_CURRENT_COLOR = 2816;

    /** GetTarget*/
    int GL_CURRENT_INDEX = 2817;

    /** GetTarget*/
    int GL_CURRENT_NORMAL = 2818;

    /** GetTarget*/
    int GL_CURRENT_TEXTURE_COORDS = 2819;

    /** GetTarget*/
    int GL_CURRENT_RASTER_COLOR = 2820;

    /** GetTarget*/
    int GL_CURRENT_RASTER_INDEX = 2821;

    /** GetTarget*/
    int GL_CURRENT_RASTER_TEXTURE_COORDS = 2822;

    /** GetTarget*/
    int GL_CURRENT_RASTER_POSITION = 2823;

    /** GetTarget*/
    int GL_CURRENT_RASTER_POSITION_VALID = 2824;

    /** GetTarget*/
    int GL_CURRENT_RASTER_DISTANCE = 2825;

    /** GetTarget*/
    int GL_POINT_SMOOTH = 2832;

    /** GetTarget*/
    int GL_POINT_SIZE = 2833;

    /** GetTarget*/
    int GL_POINT_SIZE_RANGE = 2834;

    /** GetTarget*/
    int GL_POINT_SIZE_GRANULARITY = 2835;

    /** GetTarget*/
    int GL_LINE_SMOOTH = 2848;

    /** GetTarget*/
    int GL_LINE_WIDTH = 2849;

    /** GetTarget*/
    int GL_LINE_WIDTH_RANGE = 2850;

    /** GetTarget*/
    int GL_LINE_WIDTH_GRANULARITY = 2851;

    /** GetTarget*/
    int GL_LINE_STIPPLE = 2852;

    /** GetTarget*/
    int GL_LINE_STIPPLE_PATTERN = 2853;

    /** GetTarget*/
    int GL_LINE_STIPPLE_REPEAT = 2854;

    /** GetTarget*/
    int GL_LIST_MODE = 2864;

    /** GetTarget*/
    int GL_MAX_LIST_NESTING = 2865;

    /** GetTarget*/
    int GL_LIST_BASE = 2866;

    /** GetTarget*/
    int GL_LIST_INDEX = 2867;

    /** GetTarget*/
    int GL_POLYGON_MODE = 2880;

    /** GetTarget*/
    int GL_POLYGON_SMOOTH = 2881;

    /** GetTarget*/
    int GL_POLYGON_STIPPLE = 2882;

    /** GetTarget*/
    int GL_EDGE_FLAG = 2883;

    /** GetTarget*/
    int GL_CULL_FACE = 2884;

    /** GetTarget*/
    int GL_CULL_FACE_MODE = 2885;

    /** GetTarget*/
    int GL_FRONT_FACE = 2886;

    /** GetTarget*/
    int GL_LIGHTING = 2896;

    /** GetTarget*/
    int GL_LIGHT_MODEL_LOCAL_VIEWER = 2897;

    /** GetTarget*/
    int GL_LIGHT_MODEL_TWO_SIDE = 2898;

    /** GetTarget*/
    int GL_LIGHT_MODEL_AMBIENT = 2899;

    /** GetTarget*/
    int GL_SHADE_MODEL = 2900;

    /** GetTarget*/
    int GL_COLOR_MATERIAL_FACE = 2901;

    /** GetTarget*/
    int GL_COLOR_MATERIAL_PARAMETER = 2902;

    /** GetTarget*/
    int GL_COLOR_MATERIAL = 2903;

    /** GetTarget*/
    int GL_FOG = 2912;

    /** GetTarget*/
    int GL_FOG_INDEX = 2913;

    /** GetTarget*/
    int GL_FOG_DENSITY = 2914;

    /** GetTarget*/
    int GL_FOG_START = 2915;

    /** GetTarget*/
    int GL_FOG_END = 2916;

    /** GetTarget*/
    int GL_FOG_MODE = 2917;

    /** GetTarget*/
    int GL_FOG_COLOR = 2918;

    /** GetTarget*/
    int GL_DEPTH_RANGE = 2928;

    /** GetTarget*/
    int GL_DEPTH_TEST = 2929;

    /** GetTarget*/
    int GL_DEPTH_WRITEMASK = 2930;

    /** GetTarget*/
    int GL_DEPTH_CLEAR_VALUE = 2931;

    /** GetTarget*/
    int GL_DEPTH_FUNC = 2932;

    /** GetTarget*/
    int GL_ACCUM_CLEAR_VALUE = 2944;

    /** GetTarget*/
    int GL_STENCIL_TEST = 2960;

    /** GetTarget*/
    int GL_STENCIL_CLEAR_VALUE = 2961;

    /** GetTarget*/
    int GL_STENCIL_FUNC = 2962;

    /** GetTarget*/
    int GL_STENCIL_VALUE_MASK = 2963;

    /** GetTarget*/
    int GL_STENCIL_FAIL = 2964;

    /** GetTarget*/
    int GL_STENCIL_PASS_DEPTH_FAIL = 2965;

    /** GetTarget*/
    int GL_STENCIL_PASS_DEPTH_PASS = 2966;

    /** GetTarget*/
    int GL_STENCIL_REF = 2967;

    /** GetTarget*/
    int GL_STENCIL_WRITEMASK = 2968;

    /** GetTarget*/
    int GL_MATRIX_MODE = 2976;

    /** GetTarget*/
    int GL_NORMALIZE = 2977;

    /** GetTarget*/
    int GL_VIEWPORT = 2978;

    /** GetTarget*/
    int GL_MODELVIEW_STACK_DEPTH = 2979;

    /** GetTarget*/
    int GL_PROJECTION_STACK_DEPTH = 2980;

    /** GetTarget*/
    int GL_TEXTURE_STACK_DEPTH = 2981;

    /** GetTarget*/
    int GL_MODELVIEW_MATRIX = 2982;

    /** GetTarget*/
    int GL_PROJECTION_MATRIX = 2983;

    /** GetTarget*/
    int GL_TEXTURE_MATRIX = 2984;

    /** GetTarget*/
    int GL_ATTRIB_STACK_DEPTH = 2992;

    /** GetTarget*/
    int GL_CLIENT_ATTRIB_STACK_DEPTH = 2993;

    /** GetTarget*/
    int GL_ALPHA_TEST = 3008;

    /** GetTarget*/
    int GL_ALPHA_TEST_FUNC = 3009;

    /** GetTarget*/
    int GL_ALPHA_TEST_REF = 3010;

    /** GetTarget*/
    int GL_DITHER = 3024;

    /** GetTarget*/
    int GL_BLEND_DST = 3040;

    /** GetTarget*/
    int GL_BLEND_SRC = 3041;

    /** GetTarget*/
    int GL_BLEND = 3042;

    /** GetTarget*/
    int GL_LOGIC_OP_MODE = 3056;

    /** GetTarget*/
    int GL_INDEX_LOGIC_OP = 3057;

    /** GetTarget*/
    int GL_LOGIC_OP = 3057;

    /** GetTarget*/
    int GL_COLOR_LOGIC_OP = 3058;

    /** GetTarget*/
    int GL_AUX_BUFFERS = 3072;

    /** GetTarget*/
    int GL_DRAW_BUFFER = 3073;

    /** GetTarget*/
    int GL_READ_BUFFER = 3074;

    /** GetTarget*/
    int GL_SCISSOR_BOX = 3088;

    /** GetTarget*/
    int GL_SCISSOR_TEST = 3089;

    /** GetTarget*/
    int GL_INDEX_CLEAR_VALUE = 3104;

    /** GetTarget*/
    int GL_INDEX_WRITEMASK = 3105;

    /** GetTarget*/
    int GL_COLOR_CLEAR_VALUE = 3106;

    /** GetTarget*/
    int GL_COLOR_WRITEMASK = 3107;

    /** GetTarget*/
    int GL_INDEX_MODE = 3120;

    /** GetTarget*/
    int GL_RGBA_MODE = 3121;

    /** GetTarget*/
    int GL_DOUBLEBUFFER = 3122;

    /** GetTarget*/
    int GL_STEREO = 3123;

    /** GetTarget*/
    int GL_RENDER_MODE = 3136;

    /** GetTarget*/
    int GL_PERSPECTIVE_CORRECTION_HINT = 3152;

    /** GetTarget*/
    int GL_POINT_SMOOTH_HINT = 3153;

    /** GetTarget*/
    int GL_LINE_SMOOTH_HINT = 3154;

    /** GetTarget*/
    int GL_POLYGON_SMOOTH_HINT = 3155;

    /** GetTarget*/
    int GL_FOG_HINT = 3156;

    /** GetTarget*/
    int GL_TEXTURE_GEN_S = 3168;

    /** GetTarget*/
    int GL_TEXTURE_GEN_T = 3169;

    /** GetTarget*/
    int GL_TEXTURE_GEN_R = 3170;

    /** GetTarget*/
    int GL_TEXTURE_GEN_Q = 3171;

    /** GetTarget*/
    int GL_PIXEL_MAP_I_TO_I = 3184;

    /** GetTarget*/
    int GL_PIXEL_MAP_S_TO_S = 3185;

    /** GetTarget*/
    int GL_PIXEL_MAP_I_TO_R = 3186;

    /** GetTarget*/
    int GL_PIXEL_MAP_I_TO_G = 3187;

    /** GetTarget*/
    int GL_PIXEL_MAP_I_TO_B = 3188;

    /** GetTarget*/
    int GL_PIXEL_MAP_I_TO_A = 3189;

    /** GetTarget*/
    int GL_PIXEL_MAP_R_TO_R = 3190;

    /** GetTarget*/
    int GL_PIXEL_MAP_G_TO_G = 3191;

    /** GetTarget*/
    int GL_PIXEL_MAP_B_TO_B = 3192;

    /** GetTarget*/
    int GL_PIXEL_MAP_A_TO_A = 3193;

    /** GetTarget*/
    int GL_PIXEL_MAP_I_TO_I_SIZE = 3248;

    /** GetTarget*/
    int GL_PIXEL_MAP_S_TO_S_SIZE = 3249;

    /** GetTarget*/
    int GL_PIXEL_MAP_I_TO_R_SIZE = 3250;

    /** GetTarget*/
    int GL_PIXEL_MAP_I_TO_G_SIZE = 3251;

    /** GetTarget*/
    int GL_PIXEL_MAP_I_TO_B_SIZE = 3252;

    /** GetTarget*/
    int GL_PIXEL_MAP_I_TO_A_SIZE = 3253;

    /** GetTarget*/
    int GL_PIXEL_MAP_R_TO_R_SIZE = 3254;

    /** GetTarget*/
    int GL_PIXEL_MAP_G_TO_G_SIZE = 3255;

    /** GetTarget*/
    int GL_PIXEL_MAP_B_TO_B_SIZE = 3256;

    /** GetTarget*/
    int GL_PIXEL_MAP_A_TO_A_SIZE = 3257;

    /** GetTarget*/
    int GL_UNPACK_SWAP_BYTES = 3312;

    /** GetTarget*/
    int GL_UNPACK_LSB_FIRST = 3313;

    /** GetTarget*/
    int GL_UNPACK_ROW_LENGTH = 3314;

    /** GetTarget*/
    int GL_UNPACK_SKIP_ROWS = 3315;

    /** GetTarget*/
    int GL_UNPACK_SKIP_PIXELS = 3316;

    /** GetTarget*/
    int GL_UNPACK_ALIGNMENT = 3317;

    /** GetTarget*/
    int GL_PACK_SWAP_BYTES = 3328;

    /** GetTarget*/
    int GL_PACK_LSB_FIRST = 3329;

    /** GetTarget*/
    int GL_PACK_ROW_LENGTH = 3330;

    /** GetTarget*/
    int GL_PACK_SKIP_ROWS = 3331;

    /** GetTarget*/
    int GL_PACK_SKIP_PIXELS = 3332;

    /** GetTarget*/
    int GL_PACK_ALIGNMENT = 3333;

    /** GetTarget*/
    int GL_MAP_COLOR = 3344;

    /** GetTarget*/
    int GL_MAP_STENCIL = 3345;

    /** GetTarget*/
    int GL_INDEX_SHIFT = 3346;

    /** GetTarget*/
    int GL_INDEX_OFFSET = 3347;

    /** GetTarget*/
    int GL_RED_SCALE = 3348;

    /** GetTarget*/
    int GL_RED_BIAS = 3349;

    /** GetTarget*/
    int GL_ZOOM_X = 3350;

    /** GetTarget*/
    int GL_ZOOM_Y = 3351;

    /** GetTarget*/
    int GL_GREEN_SCALE = 3352;

    /** GetTarget*/
    int GL_GREEN_BIAS = 3353;

    /** GetTarget*/
    int GL_BLUE_SCALE = 3354;

    /** GetTarget*/
    int GL_BLUE_BIAS = 3355;

    /** GetTarget*/
    int GL_ALPHA_SCALE = 3356;

    /** GetTarget*/
    int GL_ALPHA_BIAS = 3357;

    /** GetTarget*/
    int GL_DEPTH_SCALE = 3358;

    /** GetTarget*/
    int GL_DEPTH_BIAS = 3359;

    /** GetTarget*/
    int GL_MAX_EVAL_ORDER = 3376;

    /** GetTarget*/
    int GL_MAX_LIGHTS = 3377;

    /** GetTarget*/
    int GL_MAX_CLIP_PLANES = 3378;

    /** GetTarget*/
    int GL_MAX_TEXTURE_SIZE = 3379;

    /** GetTarget*/
    int GL_MAX_PIXEL_MAP_TABLE = 3380;

    /** GetTarget*/
    int GL_MAX_ATTRIB_STACK_DEPTH = 3381;

    /** GetTarget*/
    int GL_MAX_MODELVIEW_STACK_DEPTH = 3382;

    /** GetTarget*/
    int GL_MAX_NAME_STACK_DEPTH = 3383;

    /** GetTarget*/
    int GL_MAX_PROJECTION_STACK_DEPTH = 3384;

    /** GetTarget*/
    int GL_MAX_TEXTURE_STACK_DEPTH = 3385;

    /** GetTarget*/
    int GL_MAX_VIEWPORT_DIMS = 3386;

    /** GetTarget*/
    int GL_MAX_CLIENT_ATTRIB_STACK_DEPTH = 3387;

    /** GetTarget*/
    int GL_SUBPIXEL_BITS = 3408;

    /** GetTarget*/
    int GL_INDEX_BITS = 3409;

    /** GetTarget*/
    int GL_RED_BITS = 3410;

    /** GetTarget*/
    int GL_GREEN_BITS = 3411;

    /** GetTarget*/
    int GL_BLUE_BITS = 3412;

    /** GetTarget*/
    int GL_ALPHA_BITS = 3413;

    /** GetTarget*/
    int GL_DEPTH_BITS = 3414;

    /** GetTarget*/
    int GL_STENCIL_BITS = 3415;

    /** GetTarget*/
    int GL_ACCUM_RED_BITS = 3416;

    /** GetTarget*/
    int GL_ACCUM_GREEN_BITS = 3417;

    /** GetTarget*/
    int GL_ACCUM_BLUE_BITS = 3418;

    /** GetTarget*/
    int GL_ACCUM_ALPHA_BITS = 3419;

    /** GetTarget*/
    int GL_NAME_STACK_DEPTH = 3440;

    /** GetTarget*/
    int GL_AUTO_NORMAL = 3456;

    /** GetTarget*/
    int GL_MAP1_COLOR_4 = 3472;

    /** GetTarget*/
    int GL_MAP1_INDEX = 3473;

    /** GetTarget*/
    int GL_MAP1_NORMAL = 3474;

    /** GetTarget*/
    int GL_MAP1_TEXTURE_COORD_1 = 3475;

    /** GetTarget*/
    int GL_MAP1_TEXTURE_COORD_2 = 3476;

    /** GetTarget*/
    int GL_MAP1_TEXTURE_COORD_3 = 3477;

    /** GetTarget*/
    int GL_MAP1_TEXTURE_COORD_4 = 3478;

    /** GetTarget*/
    int GL_MAP1_VERTEX_3 = 3479;

    /** GetTarget*/
    int GL_MAP1_VERTEX_4 = 3480;

    /** GetTarget*/
    int GL_MAP2_COLOR_4 = 3504;

    /** GetTarget*/
    int GL_MAP2_INDEX = 3505;

    /** GetTarget*/
    int GL_MAP2_NORMAL = 3506;

    /** GetTarget*/
    int GL_MAP2_TEXTURE_COORD_1 = 3507;

    /** GetTarget*/
    int GL_MAP2_TEXTURE_COORD_2 = 3508;

    /** GetTarget*/
    int GL_MAP2_TEXTURE_COORD_3 = 3509;

    /** GetTarget*/
    int GL_MAP2_TEXTURE_COORD_4 = 3510;

    /** GetTarget*/
    int GL_MAP2_VERTEX_3 = 3511;

    /** GetTarget*/
    int GL_MAP2_VERTEX_4 = 3512;

    /** GetTarget*/
    int GL_MAP1_GRID_DOMAIN = 3536;

    /** GetTarget*/
    int GL_MAP1_GRID_SEGMENTS = 3537;

    /** GetTarget*/
    int GL_MAP2_GRID_DOMAIN = 3538;

    /** GetTarget*/
    int GL_MAP2_GRID_SEGMENTS = 3539;

    /** GetTarget*/
    int GL_TEXTURE_1D = 3552;

    /** GetTarget*/
    int GL_TEXTURE_2D = 3553;

    /** GetTarget*/
    int GL_FEEDBACK_BUFFER_POINTER = 3568;

    /** GetTarget*/
    int GL_FEEDBACK_BUFFER_SIZE = 3569;

    /** GetTarget*/
    int GL_FEEDBACK_BUFFER_TYPE = 3570;

    /** GetTarget*/
    int GL_SELECTION_BUFFER_POINTER = 3571;

    /** GetTarget*/
    int GL_SELECTION_BUFFER_SIZE = 3572;

    /** GetTextureParameter*/
    int GL_TEXTURE_WIDTH = 4096;

    /** GetTextureParameter*/
    int GL_TEXTURE_HEIGHT = 4097;

    /** GetTextureParameter*/
    int GL_TEXTURE_INTERNAL_FORMAT = 4099;

    /** GetTextureParameter*/
    int GL_TEXTURE_COMPONENTS = 4099;

    /** GetTextureParameter*/
    int GL_TEXTURE_BORDER_COLOR = 4100;

    /** GetTextureParameter*/
    int GL_TEXTURE_BORDER = 4101;

    /** HintMode*/
    int GL_DONT_CARE = 4352;

    /** HintMode*/
    int GL_FASTEST = 4353;

    /** HintMode*/
    int GL_NICEST = 4354;

    /** LightName*/
    int GL_LIGHT0 = 16384;

    /** LightName*/
    int GL_LIGHT1 = 16385;

    /** LightName*/
    int GL_LIGHT2 = 16386;

    /** LightName*/
    int GL_LIGHT3 = 16387;

    /** LightName*/
    int GL_LIGHT4 = 16388;

    /** LightName*/
    int GL_LIGHT5 = 16389;

    /** LightName*/
    int GL_LIGHT6 = 16390;

    /** LightName*/
    int GL_LIGHT7 = 16391;

    /** LightParameter*/
    int GL_AMBIENT = 4608;

    /** LightParameter*/
    int GL_DIFFUSE = 4609;

    /** LightParameter*/
    int GL_SPECULAR = 4610;

    /** LightParameter*/
    int GL_POSITION = 4611;

    /** LightParameter*/
    int GL_SPOT_DIRECTION = 4612;

    /** LightParameter*/
    int GL_SPOT_EXPONENT = 4613;

    /** LightParameter*/
    int GL_SPOT_CUTOFF = 4614;

    /** LightParameter*/
    int GL_CONSTANT_ATTENUATION = 4615;

    /** LightParameter*/
    int GL_LINEAR_ATTENUATION = 4616;

    /** LightParameter*/
    int GL_QUADRATIC_ATTENUATION = 4617;

    /** ListMode*/
    int GL_COMPILE = 4864;

    /** ListMode*/
    int GL_COMPILE_AND_EXECUTE = 4865;

    /** LogicOp*/
    int GL_CLEAR = 5376;

    /** LogicOp*/
    int GL_AND = 5377;

    /** LogicOp*/
    int GL_AND_REVERSE = 5378;

    /** LogicOp*/
    int GL_COPY = 5379;

    /** LogicOp*/
    int GL_AND_INVERTED = 5380;

    /** LogicOp*/
    int GL_NOOP = 5381;

    /** LogicOp*/
    int GL_XOR = 5382;

    /** LogicOp*/
    int GL_OR = 5383;

    /** LogicOp*/
    int GL_NOR = 5384;

    /** LogicOp*/
    int GL_EQUIV = 5385;

    /** LogicOp*/
    int GL_INVERT = 5386;

    /** LogicOp*/
    int GL_OR_REVERSE = 5387;

    /** LogicOp*/
    int GL_COPY_INVERTED = 5388;

    /** LogicOp*/
    int GL_OR_INVERTED = 5389;

    /** LogicOp*/
    int GL_NAND = 5390;

    /** LogicOp*/
    int GL_SET = 5391;

    /** MaterialParameter*/
    int GL_EMISSION = 5632;

    /** MaterialParameter*/
    int GL_SHININESS = 5633;

    /** MaterialParameter*/
    int GL_AMBIENT_AND_DIFFUSE = 5634;

    /** MaterialParameter*/
    int GL_COLOR_INDEXES = 5635;

    /** MatrixMode*/
    int GL_MODELVIEW = 5888;

    /** MatrixMode*/
    int GL_PROJECTION = 5889;

    /** MatrixMode*/
    int GL_TEXTURE = 5890;

    /** PixelCopyType*/
    int GL_COLOR = 6144;

    /** PixelCopyType*/
    int GL_DEPTH = 6145;

    /** PixelCopyType*/
    int GL_STENCIL = 6146;

    /** PixelFormat*/
    int GL_COLOR_INDEX = 6400;

    /** PixelFormat*/
    int GL_STENCIL_INDEX = 6401;

    /** PixelFormat*/
    int GL_DEPTH_COMPONENT = 6402;

    /** PixelFormat*/
    int GL_RED = 6403;

    /** PixelFormat*/
    int GL_GREEN = 6404;

    /** PixelFormat*/
    int GL_BLUE = 6405;

    /** PixelFormat*/
    int GL_ALPHA = 6406;

    /** PixelFormat*/
    int GL_RGB = 6407;

    /** PixelFormat*/
    int GL_RGBA = 6408;

    /** PixelFormat*/
    int GL_LUMINANCE = 6409;

    /** PixelFormat*/
    int GL_LUMINANCE_ALPHA = 6410;

    /** PixelType*/
    int GL_BITMAP = 6656;

    /** PolygonMode*/
    int GL_POINT = 6912;

    /** PolygonMode*/
    int GL_LINE = 6913;

    /** PolygonMode*/
    int GL_FILL = 6914;

    /** RenderingMode*/
    int GL_RENDER = 7168;

    /** RenderingMode*/
    int GL_FEEDBACK = 7169;

    /** RenderingMode*/
    int GL_SELECT = 7170;

    /** ShadingModel*/
    int GL_FLAT = 7424;

    /** ShadingModel*/
    int GL_SMOOTH = 7425;

    /** StencilOp*/
    int GL_KEEP = 7680;

    /** StencilOp*/
    int GL_REPLACE = 7681;

    /** StencilOp*/
    int GL_INCR = 7682;

    /** StencilOp*/
    int GL_DECR = 7683;

    /** StringName*/
    int GL_VENDOR = 7936;

    /** StringName*/
    int GL_RENDERER = 7937;

    /** StringName*/
    int GL_VERSION = 7938;

    /** StringName*/
    int GL_EXTENSIONS = 7939;

    /** TextureCoordName*/
    int GL_S = 8192;

    /** TextureCoordName*/
    int GL_T = 8193;

    /** TextureCoordName*/
    int GL_R = 8194;

    /** TextureCoordName*/
    int GL_Q = 8195;

    /** TextureEnvMode*/
    int GL_MODULATE = 8448;

    /** TextureEnvMode*/
    int GL_DECAL = 8449;

    /** TextureEnvParameter*/
    int GL_TEXTURE_ENV_MODE = 8704;

    /** TextureEnvParameter*/
    int GL_TEXTURE_ENV_COLOR = 8705;

    /** TextureEnvTarget*/
    int GL_TEXTURE_ENV = 8960;

    /** TextureGenMode*/
    int GL_EYE_LINEAR = 9216;

    /** TextureGenMode*/
    int GL_OBJECT_LINEAR = 9217;

    /** TextureGenMode*/
    int GL_SPHERE_MAP = 9218;

    /** TextureGenParameter*/
    int GL_TEXTURE_GEN_MODE = 9472;

    /** TextureGenParameter*/
    int GL_OBJECT_PLANE = 9473;

    /** TextureGenParameter*/
    int GL_EYE_PLANE = 9474;

    /** TextureMagFilter*/
    int GL_NEAREST = 9728;

    /** TextureMagFilter*/
    int GL_LINEAR = 9729;

    /** TextureMinFilter*/
    int GL_NEAREST_MIPMAP_NEAREST = 9984;

    /** TextureMinFilter*/
    int GL_LINEAR_MIPMAP_NEAREST = 9985;

    /** TextureMinFilter*/
    int GL_NEAREST_MIPMAP_LINEAR = 9986;

    /** TextureMinFilter*/
    int GL_LINEAR_MIPMAP_LINEAR = 9987;

    /** TextureParameterName*/
    int GL_TEXTURE_MAG_FILTER = 10240;

    /** TextureParameterName*/
    int GL_TEXTURE_MIN_FILTER = 10241;

    /** TextureParameterName*/
    int GL_TEXTURE_WRAP_S = 10242;

    /** TextureParameterName*/
    int GL_TEXTURE_WRAP_T = 10243;

    /** TextureWrapMode*/
    int GL_CLAMP = 10496;

    /** TextureWrapMode*/
    int GL_REPEAT = 10497;

    /** ClientAttribMask*/
    int GL_CLIENT_PIXEL_STORE_BIT = 1;

    /** ClientAttribMask*/
    int GL_CLIENT_VERTEX_ARRAY_BIT = 2;

    /** ClientAttribMask*/
    int GL_CLIENT_ALL_ATTRIB_BITS = -1;

    /** polygon_offset*/
    int GL_POLYGON_OFFSET_FACTOR = 32824;

    /** polygon_offset*/
    int GL_POLYGON_OFFSET_UNITS = 10752;

    /** polygon_offset*/
    int GL_POLYGON_OFFSET_POINT = 10753;

    /** polygon_offset*/
    int GL_POLYGON_OFFSET_LINE = 10754;

    /** polygon_offset*/
    int GL_POLYGON_OFFSET_FILL = 32823;

    /** texture*/
    int GL_ALPHA4 = 32827;

    /** texture*/
    int GL_ALPHA8 = 32828;

    /** texture*/
    int GL_ALPHA12 = 32829;

    /** texture*/
    int GL_ALPHA16 = 32830;

    /** texture*/
    int GL_LUMINANCE4 = 32831;

    /** texture*/
    int GL_LUMINANCE8 = 32832;

    /** texture*/
    int GL_LUMINANCE12 = 32833;

    /** texture*/
    int GL_LUMINANCE16 = 32834;

    /** texture*/
    int GL_LUMINANCE4_ALPHA4 = 32835;

    /** texture*/
    int GL_LUMINANCE6_ALPHA2 = 32836;

    /** texture*/
    int GL_LUMINANCE8_ALPHA8 = 32837;

    /** texture*/
    int GL_LUMINANCE12_ALPHA4 = 32838;

    /** texture*/
    int GL_LUMINANCE12_ALPHA12 = 32839;

    /** texture*/
    int GL_LUMINANCE16_ALPHA16 = 32840;

    /** texture*/
    int GL_INTENSITY = 32841;

    /** texture*/
    int GL_INTENSITY4 = 32842;

    /** texture*/
    int GL_INTENSITY8 = 32843;

    /** texture*/
    int GL_INTENSITY12 = 32844;

    /** texture*/
    int GL_INTENSITY16 = 32845;

    /** texture*/
    int GL_R3_G3_B2 = 10768;

    /** texture*/
    int GL_RGB4 = 32847;

    /** texture*/
    int GL_RGB5 = 32848;

    /** texture*/
    int GL_RGB8 = 32849;

    /** texture*/
    int GL_RGB10 = 32850;

    /** texture*/
    int GL_RGB12 = 32851;

    /** texture*/
    int GL_RGB16 = 32852;

    /** texture*/
    int GL_RGBA2 = 32853;

    /** texture*/
    int GL_RGBA4 = 32854;

    /** texture*/
    int GL_RGB5_A1 = 32855;

    /** texture*/
    int GL_RGBA8 = 32856;

    /** texture*/
    int GL_RGB10_A2 = 32857;

    /** texture*/
    int GL_RGBA12 = 32858;

    /** texture*/
    int GL_RGBA16 = 32859;

    /** texture*/
    int GL_TEXTURE_RED_SIZE = 32860;

    /** texture*/
    int GL_TEXTURE_GREEN_SIZE = 32861;

    /** texture*/
    int GL_TEXTURE_BLUE_SIZE = 32862;

    /** texture*/
    int GL_TEXTURE_ALPHA_SIZE = 32863;

    /** texture*/
    int GL_TEXTURE_LUMINANCE_SIZE = 32864;

    /** texture*/
    int GL_TEXTURE_INTENSITY_SIZE = 32865;

    /** texture*/
    int GL_PROXY_TEXTURE_1D = 32867;

    /** texture*/
    int GL_PROXY_TEXTURE_2D = 32868;

    /** texture_object*/
    int GL_TEXTURE_PRIORITY = 32870;

    /** texture_object*/
    int GL_TEXTURE_RESIDENT = 32871;

    /** texture_object*/
    int GL_TEXTURE_BINDING_1D = 32872;

    /** texture_object*/
    int GL_TEXTURE_BINDING_2D = 32873;

    /** vertex_array*/
    int GL_VERTEX_ARRAY = 32884;

    /** vertex_array*/
    int GL_NORMAL_ARRAY = 32885;

    /** vertex_array*/
    int GL_COLOR_ARRAY = 32886;

    /** vertex_array*/
    int GL_INDEX_ARRAY = 32887;

    /** vertex_array*/
    int GL_TEXTURE_COORD_ARRAY = 32888;

    /** vertex_array*/
    int GL_EDGE_FLAG_ARRAY = 32889;

    /** vertex_array*/
    int GL_VERTEX_ARRAY_SIZE = 32890;

    /** vertex_array*/
    int GL_VERTEX_ARRAY_TYPE = 32891;

    /** vertex_array*/
    int GL_VERTEX_ARRAY_STRIDE = 32892;

    /** vertex_array*/
    int GL_NORMAL_ARRAY_TYPE = 32894;

    /** vertex_array*/
    int GL_NORMAL_ARRAY_STRIDE = 32895;

    /** vertex_array*/
    int GL_COLOR_ARRAY_SIZE = 32897;

    /** vertex_array*/
    int GL_COLOR_ARRAY_TYPE = 32898;

    /** vertex_array*/
    int GL_COLOR_ARRAY_STRIDE = 32899;

    /** vertex_array*/
    int GL_INDEX_ARRAY_TYPE = 32901;

    /** vertex_array*/
    int GL_INDEX_ARRAY_STRIDE = 32902;

    /** vertex_array*/
    int GL_TEXTURE_COORD_ARRAY_SIZE = 32904;

    /** vertex_array*/
    int GL_TEXTURE_COORD_ARRAY_TYPE = 32905;

    /** vertex_array*/
    int GL_TEXTURE_COORD_ARRAY_STRIDE = 32906;

    /** vertex_array*/
    int GL_EDGE_FLAG_ARRAY_STRIDE = 32908;

    /** vertex_array*/
    int GL_VERTEX_ARRAY_POINTER = 32910;

    /** vertex_array*/
    int GL_NORMAL_ARRAY_POINTER = 32911;

    /** vertex_array*/
    int GL_COLOR_ARRAY_POINTER = 32912;

    /** vertex_array*/
    int GL_INDEX_ARRAY_POINTER = 32913;

    /** vertex_array*/
    int GL_TEXTURE_COORD_ARRAY_POINTER = 32914;

    /** vertex_array*/
    int GL_EDGE_FLAG_ARRAY_POINTER = 32915;

    /** vertex_array*/
    int GL_V2F = 10784;

    /** vertex_array*/
    int GL_V3F = 10785;

    /** vertex_array*/
    int GL_C4UB_V2F = 10786;

    /** vertex_array*/
    int GL_C4UB_V3F = 10787;

    /** vertex_array*/
    int GL_C3F_V3F = 10788;

    /** vertex_array*/
    int GL_N3F_V3F = 10789;

    /** vertex_array*/
    int GL_C4F_N3F_V3F = 10790;

    /** vertex_array*/
    int GL_T2F_V3F = 10791;

    /** vertex_array*/
    int GL_T4F_V4F = 10792;

    /** vertex_array*/
    int GL_T2F_C4UB_V3F = 10793;

    /** vertex_array*/
    int GL_T2F_C3F_V3F = 10794;

    /** vertex_array*/
    int GL_T2F_N3F_V3F = 10795;

    /** vertex_array*/
    int GL_T2F_C4F_N3F_V3F = 10796;

    /** vertex_array*/
    int GL_T4F_C4F_N3F_V4F = 10797;

    /** Enables the specified OpenGL state.@param target the OpenGL state to enable@see <a href="https://docs.gl/gl4/glEnable">Reference Page</a>*/
    void glEnable(int target);

    /** Disables the specified OpenGL state.@param target the OpenGL state to disable@see <a href="https://docs.gl/gl4/glDisable">Reference Page</a>*/
    void glDisable(int target);

    /** Each portion of a pixel in the accumulation buffer consists of four values: one for each of R, G, B, and A. The accumulation buffer is controlled exclusively through the use of this method (except for clearing it).@param op a symbolic constant indicating an accumulation buffer operation@param value a floating-point value to be used in that operation. One of:<br><table><tr><td>{@link #GL_ACCUM ACCUM}</td><td>{@link #GL_LOAD LOAD}</td><td>{@link #GL_RETURN RETURN}</td><td>{@link #GL_MULT MULT}</td><td>{@link #GL_ADD ADD}</td></tr></table>@see <a href="https://docs.gl/gl3/glAccum">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glAccum(int op, float value);

    /** The alpha test discards a fragment conditionally based on the outcome of a comparison between the incoming fragment\u2019s alpha value and a constant value. The comparison is enabled or disabled with the generic {@link #glEnable Enable} and {@link #glDisable Disable} commands using the symbolic constant {@link #GL_ALPHA_TEST ALPHA_TEST}. When disabled, it is as if the comparison always passes. The test is controlled with this method.@param func a symbolic constant indicating the alpha test function. One of:<br><table><tr><td>{@link #GL_NEVER NEVER}</td><td>{@link #GL_ALWAYS ALWAYS}</td><td>{@link #GL_LESS LESS}</td><td>{@link #GL_LEQUAL LEQUAL}</td><td>{@link #GL_EQUAL EQUAL}</td><td>{@link #GL_GEQUAL GEQUAL}</td><td>{@link #GL_GREATER GREATER}</td><td>{@link #GL_NOTEQUAL NOTEQUAL}</td></tr></table>@param ref a reference value clamped to the range [0, 1]. When performing the alpha test, the GL will convert the reference value to the same representation as the fragment's alpha value (floating-point or fixed-point).@see <a href="https://docs.gl/gl3/glAlphaFunc">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glAlphaFunc(int func, float ref);

    /** Returns {@link #GL_TRUE TRUE} if all of the texture objects named in textures are resident, or if the implementation does not distinguish a working set. If at least one of the texture objects named in textures is not resident, then {@link #GL_FALSE FALSE} is returned, and the residence of each texture object is returned in residences. Otherwise the contents of residences are not changed.@param textures an array of texture objects@param residences returns the residences of each texture object@see <a href="https://docs.gl/gl3/glAreTexturesResident">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    boolean glAreTexturesResident(IntBuffer textures, ByteBuffer residences);

    /** Returns {@link #GL_TRUE TRUE} if all of the texture objects named in textures are resident, or if the implementation does not distinguish a working set. If at least one of the texture objects named in textures is not resident, then {@link #GL_FALSE FALSE} is returned, and the residence of each texture object is returned in residences. Otherwise the contents of residences are not changed.@param residences returns the residences of each texture object@see <a href="https://docs.gl/gl3/glAreTexturesResident">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    boolean glAreTexturesResident(int texture, ByteBuffer residences);

    /** Transfers the ith element of every enabled, non-instanced array, and the first element of every enabled, instanced array to the GL.@param i the element to transfer@see <a href="https://docs.gl/gl3/glArrayElement">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glArrayElement(int i);

    /** Begins the definition of vertex attributes of a sequence of primitives to be transferred to the GL.@param mode the primitive type being defined. One of:<br><table><tr><td>{@link #GL_POINTS POINTS}</td><td>{@link #GL_LINE_STRIP LINE_STRIP}</td><td>{@link #GL_LINE_LOOP LINE_LOOP}</td><td>{@link #GL_LINES LINES}</td><td>{@link #GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link #GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link #GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link #GL_POLYGON POLYGON}</td><td>{@link #GL_QUADS QUADS}</td></tr><tr><td>{@link #GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>@see <a href="https://docs.gl/gl3/glBegin">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glBegin(int mode);

    /** Binds the a texture to a texture target. <p>While a texture object is bound, GL operations on the target to which it is bound affect the bound object, and queries of the target to which it is bound return state from the bound object. If texture mapping of the dimensionality of the target to which a texture object is bound is enabled, the state of the bound texture object directs the texturing operation.</p>@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>@param texture the texture object to bind@see <a href="https://docs.gl/gl4/glBindTexture">Reference Page</a>*/
    void glBindTexture(int target, int texture);

    /** Sents a bitmap to the GL. Bitmaps are rectangles of zeros and ones specifying a particular pattern of fragments to be produced. Each of these fragments has the same associated data. These data are those associated with the current raster position.@param w the bitmap width@param h the bitmap width@param xOrig the bitmap origin x coordinate@param yOrig the bitmap origin y coordinate@param xInc the x increment added to the raster position@param yInc the y increment added to the raster position@param data the buffer containing the bitmap data.@see <a href="https://docs.gl/gl3/glBitmap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, ByteBuffer data);

    /** Sents a bitmap to the GL. Bitmaps are rectangles of zeros and ones specifying a particular pattern of fragments to be produced. Each of these fragments has the same associated data. These data are those associated with the current raster position.@param w the bitmap width@param h the bitmap width@param xOrig the bitmap origin x coordinate@param yOrig the bitmap origin y coordinate@param xInc the x increment added to the raster position@param yInc the y increment added to the raster position@param data the buffer containing the bitmap data.@see <a href="https://docs.gl/gl3/glBitmap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, long data);

    /** Specifies the weighting factors used by the blend equation, for both RGB and alpha functions and for all draw buffers.@param sfactor the source weighting factor. One of:<br><table><tr><td>{@link GL11C#GL_ZERO ZERO}</td><td>{@link GL11C#GL_ONE ONE}</td><td>{@link GL11C#GL_SRC_COLOR SRC_COLOR}</td><td>{@link GL11C#GL_ONE_MINUS_SRC_COLOR ONE_MINUS_SRC_COLOR}</td><td>{@link GL11C#GL_DST_COLOR DST_COLOR}</td></tr><tr><td>{@link GL11C#GL_ONE_MINUS_DST_COLOR ONE_MINUS_DST_COLOR}</td><td>{@link GL11C#GL_SRC_ALPHA SRC_ALPHA}</td><td>{@link GL11C#GL_ONE_MINUS_SRC_ALPHA ONE_MINUS_SRC_ALPHA}</td><td>{@link GL11C#GL_DST_ALPHA DST_ALPHA}</td><td>{@link GL11C#GL_ONE_MINUS_DST_ALPHA ONE_MINUS_DST_ALPHA}</td></tr><tr><td>{@link GL14#GL_CONSTANT_COLOR CONSTANT_COLOR}</td><td>{@link GL14#GL_ONE_MINUS_CONSTANT_COLOR ONE_MINUS_CONSTANT_COLOR}</td><td>{@link GL14#GL_CONSTANT_ALPHA CONSTANT_ALPHA}</td><td>{@link GL14#GL_ONE_MINUS_CONSTANT_ALPHA ONE_MINUS_CONSTANT_ALPHA}</td><td>{@link GL11C#GL_SRC_ALPHA_SATURATE SRC_ALPHA_SATURATE}</td></tr><tr><td>{@link GL33#GL_SRC1_COLOR SRC1_COLOR}</td><td>{@link GL33#GL_ONE_MINUS_SRC1_COLOR ONE_MINUS_SRC1_COLOR}</td><td>{@link GL15#GL_SRC1_ALPHA SRC1_ALPHA}</td><td>{@link GL33#GL_ONE_MINUS_SRC1_ALPHA ONE_MINUS_SRC1_ALPHA}</td></tr></table>@param dfactor the destination weighting factor@see <a href="https://docs.gl/gl4/glBlendFunc">Reference Page</a>*/
    void glBlendFunc(int sfactor, int dfactor);

    /** Executes a display list. Causes the commands saved in the display list to be executed, in order, just as if they were issued without using a display list.@param list the index of the display list to be called@see <a href="https://docs.gl/gl3/glCallList">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glCallList(int list);

    /** Provides an efficient means for executing a number of display lists.@param type the data type of each element in {@code lists}. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_2_BYTES 2_BYTES}</td><td>{@link #GL_3_BYTES 3_BYTES}</td><td>{@link #GL_4_BYTES 4_BYTES}</td></tr></table>@param lists an array of offsets. Each offset is added to the display list base to obtain the display list number.@see <a href="https://docs.gl/gl3/glCallLists">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glCallLists(int type, ByteBuffer lists);

    /** Provides an efficient means for executing a number of display lists.@param lists an array of offsets. Each offset is added to the display list base to obtain the display list number.@see <a href="https://docs.gl/gl3/glCallLists">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glCallLists(ByteBuffer lists);

    /** Provides an efficient means for executing a number of display lists.@param lists an array of offsets. Each offset is added to the display list base to obtain the display list number.@see <a href="https://docs.gl/gl3/glCallLists">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glCallLists(ShortBuffer lists);

    /** Provides an efficient means for executing a number of display lists.@param lists an array of offsets. Each offset is added to the display list base to obtain the display list number.@see <a href="https://docs.gl/gl3/glCallLists">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glCallLists(IntBuffer lists);

    /** Sets portions of every pixel in a particular buffer to the same value. The value to which each buffer is cleared depends on the setting of the clear value for that buffer.@param mask Zero or the bitwise OR of one or more values indicating which buffers are to be cleared. One or more of:<br><table><tr><td>{@link GL11C#GL_COLOR_BUFFER_BIT COLOR_BUFFER_BIT}</td><td>{@link GL11C#GL_DEPTH_BUFFER_BIT DEPTH_BUFFER_BIT}</td><td>{@link GL11C#GL_STENCIL_BUFFER_BIT STENCIL_BUFFER_BIT}</td></tr></table>@see <a href="https://docs.gl/gl4/glClear">Reference Page</a>*/
    void glClear(int mask);

    /** Sets the clear values for the accumulation buffer. These values are clamped to the range [-1,1] when they are specified.@param red the value to which to clear the R values of the accumulation buffer@param green the value to which to clear the G values of the accumulation buffer@param blue the value to which to clear the B values of the accumulation buffer@param alpha the value to which to clear the A values of the accumulation buffer@see <a href="https://docs.gl/gl3/glClearAccum">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glClearAccum(float red, float green, float blue, float alpha);

    /** Sets the clear value for fixed-point and floating-point color buffers in RGBA mode. The specified components are stored as floating-point values.@param red the value to which to clear the R channel of the color buffer@param green the value to which to clear the G channel of the color buffer@param blue the value to which to clear the B channel of the color buffer@param alpha the value to which to clear the A channel of the color buffer@see <a href="https://docs.gl/gl4/glClearColor">Reference Page</a>*/
    void glClearColor(float red, float green, float blue, float alpha);

    /** Sets the depth value used when clearing the depth buffer. When clearing a fixedpoint depth buffer, {@code depth} is clamped to the range [0,1] and converted to fixed-point. No conversion is applied when clearing a floating-point depth buffer.@param depth the value to which to clear the depth buffer@see <a href="https://docs.gl/gl4/glClearDepth">Reference Page</a>*/
    void glClearDepth(double depth);

    /** sets the clear color index. index is converted to a fixed-point value with unspecified precision to the left of the binary point; the integer part of this value is then masked with <code>2<sup>m</sup> &ndash; 1</code>, where {@code m} is the number of bits in a color index value stored in the framebuffer.@param index the value to which to clear the color buffer in color index mode@see <a href="https://docs.gl/gl3/glClearIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glClearIndex(float index);

    /** Sets the value to which to clear the stencil buffer. {@code s} is masked to the number of bitplanes in the stencil buffer.@param s the value to which to clear the stencil buffer@see <a href="https://docs.gl/gl4/glClearStencil">Reference Page</a>*/
    void glClearStencil(int s);

    /** Specifies a client-defined clip plane. <p>The value of the first argument, {@code plane}, is a symbolic constant, CLIP_PLANEi, where i is an integer between 0 and n &ndash; 1, indicating one of n client-defined clip planes. {@code equation} is an array of four double-precision floating-point values. These are the coefficients of a plane equation in object coordinates: p1, p2, p3, and p4 (in that order).</p>@param plane the clip plane to define@param equation the clip plane coefficients@see <a href="https://docs.gl/gl3/glClipPlane">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glClipPlane(int plane, DoubleBuffer equation);

    /** Sets the R, G, and B components of the current color. The alpha component is set to 1.0.@param red the red component of the current color@param green the green component of the current color@param blue the blue component of the current color@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor3b(byte red, byte green, byte blue);

    /** Short version of {@link #glColor3b Color3b}@param red the red component of the current color@param green the green component of the current color@param blue the blue component of the current color@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor3s(short red, short green, short blue);

    /** Integer version of {@link #glColor3b Color3b}@param red the red component of the current color@param green the green component of the current color@param blue the blue component of the current color@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor3i(int red, int green, int blue);

    /** Float version of {@link #glColor3b Color3b}@param red the red component of the current color@param green the green component of the current color@param blue the blue component of the current color@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor3f(float red, float green, float blue);

    /** Double version of {@link #glColor3b Color3b}@param red the red component of the current color@param green the green component of the current color@param blue the blue component of the current color@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor3d(double red, double green, double blue);

    /** Unsigned version of {@link #glColor3b Color3b}@param red the red component of the current color@param green the green component of the current color@param blue the blue component of the current color@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor3ub(byte red, byte green, byte blue);

    /** Unsigned short version of {@link #glColor3b Color3b}@param red the red component of the current color@param green the green component of the current color@param blue the blue component of the current color@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor3us(short red, short green, short blue);

    /** Unsigned int version of {@link #glColor3b Color3b}@param red the red component of the current color@param green the green component of the current color@param blue the blue component of the current color@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor3ui(int red, int green, int blue);

    /** Byte pointer version of {@link #glColor3b Color3b}.@param _2 the color buffer@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor3bv(ByteBuffer v);

    /** Pointer version of {@link #glColor3s Color3s}.@param _2 the color buffer@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor3sv(ShortBuffer v);

    /** Pointer version of {@link #glColor3i Color3i}.@param _2 the color buffer@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor3iv(IntBuffer v);

    /** Pointer version of {@link #glColor3f Color3f}.@param _2 the color buffer@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor3fv(FloatBuffer v);

    /** Pointer version of {@link #glColor3d Color3d}.@param _2 the color buffer@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor3dv(DoubleBuffer v);

    /** Pointer version of {@link #glColor3ub Color3ub}.@param _2 the color buffer@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor3ubv(ByteBuffer v);

    /** Pointer version of {@link #glColor3us Color3us}.@param _2 the color buffer@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor3usv(ShortBuffer v);

    /** Pointer version of {@link #glColor3ui Color3ui}.@param _2 the color buffer@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor3uiv(IntBuffer v);

    /** Sets the current color.@param red the red component of the current color@param green the green component of the current color@param blue the blue component of the current color@param alpha the alpha component of the current color@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor4b(byte red, byte green, byte blue, byte alpha);

    /** Short version of {@link #glColor4b Color4b}@param red the red component of the current color@param green the green component of the current color@param blue the blue component of the current color@param alpha the alpha component of the current color@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor4s(short red, short green, short blue, short alpha);

    /** Integer version of {@link #glColor4b Color4b}@param red the red component of the current color@param green the green component of the current color@param blue the blue component of the current color@param alpha the alpha component of the current color@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor4i(int red, int green, int blue, int alpha);

    /** Float version of {@link #glColor4b Color4b}@param red the red component of the current color@param green the green component of the current color@param blue the blue component of the current color@param alpha the alpha component of the current color@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor4f(float red, float green, float blue, float alpha);

    /** Double version of {@link #glColor4b Color4b}@param red the red component of the current color@param green the green component of the current color@param blue the blue component of the current color@param alpha the alpha component of the current color@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor4d(double red, double green, double blue, double alpha);

    /** Unsigned version of {@link #glColor4b Color4b}@param red the red component of the current color@param green the green component of the current color@param blue the blue component of the current color@param alpha the alpha component of the current color@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor4ub(byte red, byte green, byte blue, byte alpha);

    /** Unsigned short version of {@link #glColor4b Color4b}@param red the red component of the current color@param green the green component of the current color@param blue the blue component of the current color@param alpha the alpha component of the current color@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor4us(short red, short green, short blue, short alpha);

    /** Unsigned int version of {@link #glColor4b Color4b}@param red the red component of the current color@param green the green component of the current color@param blue the blue component of the current color@param alpha the alpha component of the current color@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor4ui(int red, int green, int blue, int alpha);

    /** Pointer version of {@link #glColor4b Color4b}.@param _2 the color buffer@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor4bv(ByteBuffer v);

    /** Pointer version of {@link #glColor4s Color4s}.@param _2 the color buffer@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor4sv(ShortBuffer v);

    /** Pointer version of {@link #glColor4i Color4i}.@param _2 the color buffer@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor4iv(IntBuffer v);

    /** Pointer version of {@link #glColor4f Color4f}.@param _2 the color buffer@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor4fv(FloatBuffer v);

    /** Pointer version of {@link #glColor4d Color4d}.@param _2 the color buffer@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor4dv(DoubleBuffer v);

    /** Pointer version of {@link #glColor4ub Color4ub}.@param _2 the color buffer@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor4ubv(ByteBuffer v);

    /** Pointer version of {@link #glColor4us Color4us}.@param _2 the color buffer@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor4usv(ShortBuffer v);

    /** Pointer version of {@link #glColor4ui Color4ui}.@param _2 the color buffer@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor4uiv(IntBuffer v);

    /** Masks the writing of R, G, B and A values to all draw buffers. In the initial state, all color values are enabled for writing for all draw buffers.@param red whether R values are written or not@param green whether G values are written or not@param blue whether B values are written or not@param alpha whether A values are written or not@see <a href="https://docs.gl/gl4/glColorMask">Reference Page</a>*/
    void glColorMask(boolean red, boolean green, boolean blue, boolean alpha);

    /** It is possible to attach one or more material properties to the current color, so that they continuously track its component values. This behavior is enabled and disabled by calling {@link #glEnable Enable} or {@link #glDisable Disable} with the symbolic value {@link #GL_COLOR_MATERIAL COLOR_MATERIAL}. This function controls which of these modes is selected.@param face specifies which material face is affected by the current color. One of:<br><table><tr><td>{@link #GL_FRONT FRONT}</td><td>{@link #GL_BACK BACK}</td><td>{@link #GL_FRONT_AND_BACK FRONT_AND_BACK}</td></tr></table>@param mode specifies which material property or properties track the current color. One of:<br><table><tr><td>{@link #GL_EMISSION EMISSION}</td><td>{@link #GL_AMBIENT AMBIENT}</td><td>{@link #GL_DIFFUSE DIFFUSE}</td><td>{@link #GL_SPECULAR SPECULAR}</td><td>{@link #GL_AMBIENT_AND_DIFFUSE AMBIENT_AND_DIFFUSE}</td></tr></table>@see <a href="https://docs.gl/gl3/glColorMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColorMaterial(int face, int mode);

    /** Specifies the location and organization of a color array.@param size the number of values per vertex that are stored in the array, as well as their component ordering. One of:<br><table><tr><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the color array data@see <a href="https://docs.gl/gl3/glColorPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColorPointer(int size, int type, int stride, ByteBuffer pointer);

    /** Specifies the location and organization of a color array.@param size the number of values per vertex that are stored in the array, as well as their component ordering. One of:<br><table><tr><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the color array data@see <a href="https://docs.gl/gl3/glColorPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColorPointer(int size, int type, int stride, long pointer);

    /** Specifies the location and organization of a color array.@param size the number of values per vertex that are stored in the array, as well as their component ordering. One of:<br><table><tr><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the color array data@see <a href="https://docs.gl/gl3/glColorPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColorPointer(int size, int type, int stride, ShortBuffer pointer);

    /** Specifies the location and organization of a color array.@param size the number of values per vertex that are stored in the array, as well as their component ordering. One of:<br><table><tr><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the color array data@see <a href="https://docs.gl/gl3/glColorPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColorPointer(int size, int type, int stride, IntBuffer pointer);

    /** Specifies the location and organization of a color array.@param size the number of values per vertex that are stored in the array, as well as their component ordering. One of:<br><table><tr><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the color array data@see <a href="https://docs.gl/gl3/glColorPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColorPointer(int size, int type, int stride, FloatBuffer pointer);

    /** Transfers a rectangle of pixel values from one region of the read framebuffer to another in the draw framebuffer@param x the left framebuffer pixel coordinate@param y the lower framebuffer pixel coordinate@param width the rectangle width@param height the rectangle height@param type Indicates the type of values to be transfered. One of:<br><table><tr><td>{@link #GL_COLOR COLOR}</td><td>{@link #GL_STENCIL STENCIL}</td><td>{@link #GL_DEPTH DEPTH}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@see <a href="https://docs.gl/gl3/glCopyPixels">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glCopyPixels(int x, int y, int width, int height, int type);

    /** Specifies which polygon faces are culled if {@link GL11C#GL_CULL_FACE CULL_FACE} is enabled. Front-facing polygons are rasterized if either culling is disabled or the CullFace mode is {@link GL11C#GL_BACK BACK} while back-facing polygons are rasterized only if either culling is disabled or the CullFace mode is {@link GL11C#GL_FRONT FRONT}. The initial setting of the CullFace mode is {@link GL11C#GL_BACK BACK}. Initially, culling is disabled.@param mode the CullFace mode. One of:<br><table><tr><td>{@link GL11C#GL_FRONT FRONT}</td><td>{@link GL11C#GL_BACK BACK}</td><td>{@link GL11C#GL_FRONT_AND_BACK FRONT_AND_BACK}</td></tr></table>@see <a href="https://docs.gl/gl4/glCullFace">Reference Page</a>*/
    void glCullFace(int mode);

    /** Deletes a contiguous group of display lists. All information about the display lists is lost, and the indices become unused. Indices to which no display list corresponds are ignored. If {@code range} is zero, nothing happens.@param list the index of the first display list to be deleted@param range the number of display lists to be deleted@see <a href="https://docs.gl/gl3/glDeleteLists">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glDeleteLists(int list, int range);

    /** Specifies the comparison that takes place during the depth buffer test (when {@link GL11C#GL_DEPTH_TEST DEPTH_TEST} is enabled).@param func the depth test comparison. One of:<br><table><tr><td>{@link GL11C#GL_NEVER NEVER}</td><td>{@link GL11C#GL_ALWAYS ALWAYS}</td><td>{@link GL11C#GL_LESS LESS}</td><td>{@link GL11C#GL_LEQUAL LEQUAL}</td><td>{@link GL11C#GL_EQUAL EQUAL}</td><td>{@link GL11C#GL_GREATER GREATER}</td><td>{@link GL11C#GL_GEQUAL GEQUAL}</td><td>{@link GL11C#GL_NOTEQUAL NOTEQUAL}</td></tr></table>@see <a href="https://docs.gl/gl4/glDepthFunc">Reference Page</a>*/
    void glDepthFunc(int func);

    /** Masks the writing of depth values to the depth buffer. In the initial state, the depth buffer is enabled for writing.@param flag whether depth values are written or not.@see <a href="https://docs.gl/gl4/glDepthMask">Reference Page</a>*/
    void glDepthMask(boolean flag);

    /** Sets the depth range for all viewports to the same values.@param zNear the near depth range@param zFar the far depth range@see <a href="https://docs.gl/gl4/glDepthRange">Reference Page</a>*/
    void glDepthRange(double zNear, double zFar);

    /** Disables a client-side capability. <p>If the {@link NVVertexBufferUnifiedMemory} extension is supported, this function is available even in a core profile context.</p>@param cap the capability to disable. One of:<br><table><tr><td>{@link #GL_COLOR_ARRAY COLOR_ARRAY}</td><td>{@link #GL_EDGE_FLAG_ARRAY EDGE_FLAG_ARRAY}</td><td>{@link GL15#GL_FOG_COORD_ARRAY FOG_COORD_ARRAY}</td><td>{@link #GL_INDEX_ARRAY INDEX_ARRAY}</td></tr><tr><td>{@link #GL_NORMAL_ARRAY NORMAL_ARRAY}</td><td>{@link GL14#GL_SECONDARY_COLOR_ARRAY SECONDARY_COLOR_ARRAY}</td><td>{@link #GL_TEXTURE_COORD_ARRAY TEXTURE_COORD_ARRAY}</td><td>{@link #GL_VERTEX_ARRAY VERTEX_ARRAY}</td></tr><tr><td>{@link NVVertexBufferUnifiedMemory#GL_VERTEX_ATTRIB_ARRAY_UNIFIED_NV VERTEX_ATTRIB_ARRAY_UNIFIED_NV}</td><td>{@link NVVertexBufferUnifiedMemory#GL_ELEMENT_ARRAY_UNIFIED_NV ELEMENT_ARRAY_UNIFIED_NV}</td></tr></table>@see <a href="https://docs.gl/gl3/glDisableClientState">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glDisableClientState(int cap);

    /** Constructs a sequence of geometric primitives by successively transferring elements for {@code count} vertices. Elements {@code first} through <code>first + count &ndash; 1</code> of each enabled non-instanced array are transferred to the GL. <p>If an array corresponding to an attribute required by a vertex shader is not enabled, then the corresponding element is taken from the current attribute state. If an array is enabled, the corresponding current vertex attribute value is unaffected by the execution of this function.</p>@param mode the kind of primitives being constructed@param first the first vertex to transfer to the GL@param count the number of vertices after {@code first} to transfer to the GL@see <a href="https://docs.gl/gl4/glDrawArrays">Reference Page</a>*/
    void glDrawArrays(int mode, int first, int count);

    /** Defines the color buffer to which fragment color zero is written. <p>Acceptable values for {@code buf} depend on whether the GL is using the default framebuffer (i.e., {@link GL30#GL_DRAW_FRAMEBUFFER_BINDING DRAW_FRAMEBUFFER_BINDING} is zero), or a framebuffer object (i.e., {@link GL30#GL_DRAW_FRAMEBUFFER_BINDING DRAW_FRAMEBUFFER_BINDING} is non-zero). In the initial state, the GL is bound to the default framebuffer.</p>@param buf the color buffer to draw to. One of:<br><table><tr><td>{@link GL11C#GL_NONE NONE}</td><td>{@link GL11C#GL_FRONT_LEFT FRONT_LEFT}</td><td>{@link GL11C#GL_FRONT_RIGHT FRONT_RIGHT}</td><td>{@link GL11C#GL_BACK_LEFT BACK_LEFT}</td><td>{@link GL11C#GL_BACK_RIGHT BACK_RIGHT}</td><td>{@link GL11C#GL_FRONT FRONT}</td><td>{@link GL11C#GL_BACK BACK}</td><td>{@link GL11C#GL_LEFT LEFT}</td></tr><tr><td>{@link GL11C#GL_RIGHT RIGHT}</td><td>{@link GL11C#GL_FRONT_AND_BACK FRONT_AND_BACK}</td><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>GL30.GL_COLOR_ATTACHMENT[1-15]</td></tr></table>@see <a href="https://docs.gl/gl4/glDrawBuffer">Reference Page</a>*/
    void glDrawBuffer(int buf);

    /** Constructs a sequence of geometric primitives by successively transferring elements for {@code count} vertices to the GL. The i<sup>th</sup> element transferred by {@code DrawElements} will be taken from element {@code indices[i]} (if no element array buffer is bound), or from the element whose index is stored in the currently bound element array buffer at offset {@code indices + i}.@param mode the kind of primitives being constructed. One of:<br><table><tr><td>{@link GL11C#GL_POINTS POINTS}</td><td>{@link GL11C#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11C#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11C#GL_LINES LINES}</td><td>{@link GL11C#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11C#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11C#GL_TRIANGLES TRIANGLES}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>@param count the number of vertices to transfer to the GL@param type indicates the type of index values in {@code indices}. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param indices the index values@see <a href="https://docs.gl/gl4/glDrawElements">Reference Page</a>*/
    void glDrawElements(int mode, int count, int type, long indices);

    /** Constructs a sequence of geometric primitives by successively transferring elements for {@code count} vertices to the GL. The i<sup>th</sup> element transferred by {@code DrawElements} will be taken from element {@code indices[i]} (if no element array buffer is bound), or from the element whose index is stored in the currently bound element array buffer at offset {@code indices + i}.@param mode the kind of primitives being constructed. One of:<br><table><tr><td>{@link GL11C#GL_POINTS POINTS}</td><td>{@link GL11C#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11C#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11C#GL_LINES LINES}</td><td>{@link GL11C#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11C#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11C#GL_TRIANGLES TRIANGLES}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>@param type indicates the type of index values in {@code indices}. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>@param indices the index values@see <a href="https://docs.gl/gl4/glDrawElements">Reference Page</a>*/
    void glDrawElements(int mode, int type, ByteBuffer indices);

    /** Constructs a sequence of geometric primitives by successively transferring elements for {@code count} vertices to the GL. The i<sup>th</sup> element transferred by {@code DrawElements} will be taken from element {@code indices[i]} (if no element array buffer is bound), or from the element whose index is stored in the currently bound element array buffer at offset {@code indices + i}.@param mode the kind of primitives being constructed. One of:<br><table><tr><td>{@link GL11C#GL_POINTS POINTS}</td><td>{@link GL11C#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11C#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11C#GL_LINES LINES}</td><td>{@link GL11C#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11C#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11C#GL_TRIANGLES TRIANGLES}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>@param indices the index values@see <a href="https://docs.gl/gl4/glDrawElements">Reference Page</a>*/
    void glDrawElements(int mode, ByteBuffer indices);

    /** Constructs a sequence of geometric primitives by successively transferring elements for {@code count} vertices to the GL. The i<sup>th</sup> element transferred by {@code DrawElements} will be taken from element {@code indices[i]} (if no element array buffer is bound), or from the element whose index is stored in the currently bound element array buffer at offset {@code indices + i}.@param mode the kind of primitives being constructed. One of:<br><table><tr><td>{@link GL11C#GL_POINTS POINTS}</td><td>{@link GL11C#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11C#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11C#GL_LINES LINES}</td><td>{@link GL11C#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11C#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11C#GL_TRIANGLES TRIANGLES}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>@param indices the index values@see <a href="https://docs.gl/gl4/glDrawElements">Reference Page</a>*/
    void glDrawElements(int mode, ShortBuffer indices);

    /** Constructs a sequence of geometric primitives by successively transferring elements for {@code count} vertices to the GL. The i<sup>th</sup> element transferred by {@code DrawElements} will be taken from element {@code indices[i]} (if no element array buffer is bound), or from the element whose index is stored in the currently bound element array buffer at offset {@code indices + i}.@param mode the kind of primitives being constructed. One of:<br><table><tr><td>{@link GL11C#GL_POINTS POINTS}</td><td>{@link GL11C#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11C#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11C#GL_LINES LINES}</td><td>{@link GL11C#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11C#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11C#GL_TRIANGLES TRIANGLES}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>@param indices the index values@see <a href="https://docs.gl/gl4/glDrawElements">Reference Page</a>*/
    void glDrawElements(int mode, IntBuffer indices);

    /** Draws a pixel rectangle to the active draw buffers.@param width the pixel rectangle width@param height the pixel rectangle height@param format the pixel data format. One of:<br><table><tr><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link #GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>@param type the pixel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>@param pixels the pixel data@see <a href="https://docs.gl/gl3/glDrawPixels">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glDrawPixels(int width, int height, int format, int type, ByteBuffer pixels);

    /** Draws a pixel rectangle to the active draw buffers.@param width the pixel rectangle width@param height the pixel rectangle height@param format the pixel data format. One of:<br><table><tr><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link #GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>@param type the pixel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>@param pixels the pixel data@see <a href="https://docs.gl/gl3/glDrawPixels">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glDrawPixels(int width, int height, int format, int type, long pixels);

    /** Draws a pixel rectangle to the active draw buffers.@param width the pixel rectangle width@param height the pixel rectangle height@param format the pixel data format. One of:<br><table><tr><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link #GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>@param type the pixel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>@param pixels the pixel data@see <a href="https://docs.gl/gl3/glDrawPixels">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glDrawPixels(int width, int height, int format, int type, ShortBuffer pixels);

    /** Draws a pixel rectangle to the active draw buffers.@param width the pixel rectangle width@param height the pixel rectangle height@param format the pixel data format. One of:<br><table><tr><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link #GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>@param type the pixel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>@param pixels the pixel data@see <a href="https://docs.gl/gl3/glDrawPixels">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glDrawPixels(int width, int height, int format, int type, IntBuffer pixels);

    /** Draws a pixel rectangle to the active draw buffers.@param width the pixel rectangle width@param height the pixel rectangle height@param format the pixel data format. One of:<br><table><tr><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link #GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>@param type the pixel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>@param pixels the pixel data@see <a href="https://docs.gl/gl3/glDrawPixels">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glDrawPixels(int width, int height, int format, int type, FloatBuffer pixels);

    /** Each edge of each polygon primitive generated is flagged as either boundary or non-boundary. These classifications are used during polygon rasterization; some modes affect the interpretation of polygon boundary edges. By default, all edges are boundary edges, but the flagging of polygons, separate triangles, or separate quadrilaterals may be altered by calling this function. <p>When a primitive of type {@link #GL_POLYGON POLYGON}, {@link #GL_TRIANGLES TRIANGLES}, or {@link #GL_QUADS QUADS} is drawn, each vertex transferred begins an edge. If the edge flag bit is TRUE, then each specified vertex begins an edge that is flagged as boundary. If the bit is FALSE, then induced edges are flagged as non-boundary.</p>@param flag the edge flag bit@see <a href="https://docs.gl/gl3/glEdgeFlag">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEdgeFlag(boolean flag);

    /** Pointer version of {@link #glEdgeFlag EdgeFlag}.@param flag the edge flag buffer@see <a href="https://docs.gl/gl3/glEdgeFlagv">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEdgeFlagv(ByteBuffer flag);

    /** Specifies the location and organization of an edge flag array.@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the edge flag array data@see <a href="https://docs.gl/gl3/glEdgeFlagPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEdgeFlagPointer(int stride, ByteBuffer pointer);

    /** Specifies the location and organization of an edge flag array.@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the edge flag array data@see <a href="https://docs.gl/gl3/glEdgeFlagPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEdgeFlagPointer(int stride, long pointer);

    /** Enables a client-side capability. <p>If the {@link NVVertexBufferUnifiedMemory} extension is supported, this function is available even in a core profile context.</p>@param cap the capability to enable. One of:<br><table><tr><td>{@link #GL_COLOR_ARRAY COLOR_ARRAY}</td><td>{@link #GL_EDGE_FLAG_ARRAY EDGE_FLAG_ARRAY}</td><td>{@link GL15#GL_FOG_COORD_ARRAY FOG_COORD_ARRAY}</td><td>{@link #GL_INDEX_ARRAY INDEX_ARRAY}</td></tr><tr><td>{@link #GL_NORMAL_ARRAY NORMAL_ARRAY}</td><td>{@link GL14#GL_SECONDARY_COLOR_ARRAY SECONDARY_COLOR_ARRAY}</td><td>{@link #GL_TEXTURE_COORD_ARRAY TEXTURE_COORD_ARRAY}</td><td>{@link #GL_VERTEX_ARRAY VERTEX_ARRAY}</td></tr><tr><td>{@link NVVertexBufferUnifiedMemory#GL_VERTEX_ATTRIB_ARRAY_UNIFIED_NV VERTEX_ATTRIB_ARRAY_UNIFIED_NV}</td><td>{@link NVVertexBufferUnifiedMemory#GL_ELEMENT_ARRAY_UNIFIED_NV ELEMENT_ARRAY_UNIFIED_NV}</td></tr></table>@see <a href="https://docs.gl/gl3/glEnableClientState">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEnableClientState(int cap);

    /** Ends the definition of vertex attributes of a sequence of primitives to be transferred to the GL.@see <a href="https://docs.gl/gl3/glEnd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEnd();

    /** Causes evaluation of the enabled one-dimensional evaluator maps.@param u the domain coordinate u@see <a href="https://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEvalCoord1f(float u);

    /** Pointer version of {@link #glEvalCoord1f EvalCoord1f}.@param u the domain coordinate buffer@see <a href="https://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEvalCoord1fv(FloatBuffer u);

    /** Double version of {@link #glEvalCoord1f EvalCoord1f}.@param u the domain coordinate u@see <a href="https://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEvalCoord1d(double u);

    /** Pointer version of {@link #glEvalCoord1d EvalCoord1d}.@param u the domain coordinate buffer@see <a href="https://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEvalCoord1dv(DoubleBuffer u);

    /** Causes evaluation of the enabled two-dimensional evaluator maps.@param u the domain coordinate u@param _2 the domain coordinate _2@see <a href="https://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEvalCoord2f(float u, float v);

    /** Pointer version of {@link #glEvalCoord2f EvalCoord2f}.@param u the domain coordinate buffer@see <a href="https://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEvalCoord2fv(FloatBuffer u);

    /** Double version of {@link #glEvalCoord2f EvalCoord2f}.@param u the domain coordinate u@param _2 the domain coordinate _2@see <a href="https://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEvalCoord2d(double u, double v);

    /** Pointer version of {@link #glEvalCoord2d EvalCoord2d}.@param u the domain coordinate buffer@see <a href="https://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEvalCoord2dv(DoubleBuffer u);

    /** Carries out an evaluation on a subset of the one-dimensional map grid.@param mode the mesh type. One of:<br><table><tr><td>{@link #GL_POINT POINT}</td><td>{@link #GL_LINE LINE}</td></tr></table>@param i1 the start index@param i2 the end index@see <a href="https://docs.gl/gl3/glEvalMesh1">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEvalMesh1(int mode, int i1, int i2);

    /** Carries out an evaluation on a rectangular subset of the two-dimensional map grid.@param mode the mesh type. One of:<br><table><tr><td>{@link #GL_FILL FILL}</td><td>{@link #GL_LINE LINE}</td><td>{@link #GL_POINT POINT}</td></tr></table>@param i1 the u-dimension start index@param i2 the u-dimension end index@param j1 the _2-dimension start index@param j2 the _2-dimension end index@see <a href="https://docs.gl/gl3/glEvalMesh2">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEvalMesh2(int mode, int i1, int i2, int j1, int j2);

    /** Carries out an evalutation of a single point on the one-dimensional map grid.@param i the grid index@see <a href="https://docs.gl/gl3/glEvalPoint1">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEvalPoint1(int i);

    /** Carries out an evalutation of a single point on the two-dimensional map grid.@param i the u-dimension grid index@param j the _2-dimension grid index@see <a href="https://docs.gl/gl3/glEvalPoint2">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEvalPoint2(int i, int j);

    /** Returns information about primitives when the GL is in feedback mode.@param type the type of information to feed back for each vertex. One of:<br><table><tr><td>{@link #GL_2D 2D}</td><td>{@link #GL_3D 3D}</td><td>{@link #GL_3D_COLOR 3D_COLOR}</td><td>{@link #GL_3D_COLOR_TEXTURE 3D_COLOR_TEXTURE}</td><td>{@link #GL_4D_COLOR_TEXTURE 4D_COLOR_TEXTURE}</td></tr></table>@param buffer an array of floating-point values into which feedback information will be placed@see <a href="https://docs.gl/gl3/glFeedbackBuffer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glFeedbackBuffer(int type, FloatBuffer buffer);

    /** Forces all previously issued GL commands to complete. {@code Finish} does not return until all effects from such commands on GL client and server state and the framebuffer are fully realized.@see <a href="https://docs.gl/gl4/glFinish">Reference Page</a>*/
    void glFinish();

    /** Causes all previously issued GL commands to complete in finite time (although such commands may still be executing when {@code Flush} returns).@see <a href="https://docs.gl/gl4/glFlush">Reference Page</a>*/
    void glFlush();

    /** Sets the integer value of a fog parameter.@param pname the fog parameter. One of:<br><table><tr><td>{@link #GL_FOG_MODE FOG_MODE}</td><td>{@link GL15#GL_FOG_COORD_SRC FOG_COORD_SRC}</td></tr></table>@param param the fog parameter value. One of:<br><table><tr><td>{@link #GL_EXP EXP}</td><td>{@link #GL_EXP2 EXP2}</td><td>{@link #GL_LINEAR LINEAR}</td><td>{@link GL14#GL_FRAGMENT_DEPTH FRAGMENT_DEPTH}</td><td>{@link GL15#GL_FOG_COORD FOG_COORD}</td></tr></table>@see <a href="https://docs.gl/gl3/glFogi">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glFogi(int pname, int param);

    /** Pointer version of {@link #glFogi Fogi}.@param pname the fog parameter. One of:<br><table><tr><td>{@link #GL_FOG_MODE FOG_MODE}</td><td>{@link GL15#GL_FOG_COORD_SRC FOG_COORD_SRC}</td></tr></table>@param params the fog parameter buffer@see <a href="https://docs.gl/gl3/glFog">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glFogiv(int pname, IntBuffer params);

    /** Sets the float value of a fog parameter.@param pname the fog parameter. One of:<br><table><tr><td>{@link #GL_FOG_DENSITY FOG_DENSITY}</td><td>{@link #GL_FOG_START FOG_START}</td><td>{@link #GL_FOG_END FOG_END}</td></tr></table>@param param the fog parameter value@see <a href="https://docs.gl/gl3/glFogf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glFogf(int pname, float param);

    /** Pointer version of {@link #glFogf Fogf}.@param pname the fog parameter. One of:<br><table><tr><td>{@link #GL_FOG_DENSITY FOG_DENSITY}</td><td>{@link #GL_FOG_START FOG_START}</td><td>{@link #GL_FOG_END FOG_END}</td></tr></table>@param params the fog parameter buffer@see <a href="https://docs.gl/gl3/glFog">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glFogfv(int pname, FloatBuffer params);

    /** The first step of polygon rasterization is to determine if the polygon is back-facing or front-facing. This determination is made based on the sign of the (clipped or unclipped) polygon's area computed in window coordinates. The interpretation of the sign of this value is controlled with this function. In the initial state, the front face direction is set to {@link GL11C#GL_CCW CCW}.@param dir the front face direction. One of:<br><table><tr><td>{@link GL11C#GL_CCW CCW}</td><td>{@link GL11C#GL_CW CW}</td></tr></table>@see <a href="https://docs.gl/gl4/glFrontFace">Reference Page</a>*/
    void glFrontFace(int dir);

    /** Returns an integer n such that the indices {@code n,..., n + s - 1} are previously unused (i.e. there are {@code s} previously unused display list indices starting at n). {@code GenLists} also has the effect of creating an empty display list for each of the indices {@code n,..., n + s - 1}, so that these indices all become used. {@code GenLists} returns zero if there is no group of {@code s} contiguous previously unused display list indices, or if {@code s = 0}.@param s the number of display lists to create@see <a href="https://docs.gl/gl3/glGenLists">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    int glGenLists(int s);

    /** Returns n previously unused texture names in textures. These names are marked as used, for the purposes of GenTextures only, but they acquire texture state and a dimensionality only when they are first bound, just as if they were unused.@param textures a scalar or buffer in which to place the returned texture names@see <a href="https://docs.gl/gl4/glGenTextures">Reference Page</a>*/
    void glGenTextures(IntBuffer textures);

    /** Returns n previously unused texture names in textures. These names are marked as used, for the purposes of GenTextures only, but they acquire texture state and a dimensionality only when they are first bound, just as if they were unused.@see <a href="https://docs.gl/gl4/glGenTextures">Reference Page</a>*/
    int glGenTextures();

    /** Deletes texture objects. After a texture object is deleted, it has no contents or dimensionality, and its name is again unused. If a texture that is currently bound to any of the target bindings of {@link #glBindTexture BindTexture} is deleted, it is as though {@link #glBindTexture BindTexture} had been executed with the same target and texture zero. Additionally, special care must be taken when deleting a texture if any of the images of the texture are attached to a framebuffer object. <p>Unused names in textures that have been marked as used for the purposes of {@link #glGenTextures GenTextures} are marked as unused again. Unused names in textures are silently ignored, as is the name zero.</p>@param textures contains {@code n} names of texture objects to be deleted@see <a href="https://docs.gl/gl4/glDeleteTextures">Reference Page</a>*/
    void glDeleteTextures(IntBuffer textures);

    /** Deletes texture objects. After a texture object is deleted, it has no contents or dimensionality, and its name is again unused. If a texture that is currently bound to any of the target bindings of {@link #glBindTexture BindTexture} is deleted, it is as though {@link #glBindTexture BindTexture} had been executed with the same target and texture zero. Additionally, special care must be taken when deleting a texture if any of the images of the texture are attached to a framebuffer object. <p>Unused names in textures that have been marked as used for the purposes of {@link #glGenTextures GenTextures} are marked as unused again. Unused names in textures are silently ignored, as is the name zero.</p>@see <a href="https://docs.gl/gl4/glDeleteTextures">Reference Page</a>*/
    void glDeleteTextures(int texture);

    /** Returns four double-precision values in {@code equation}; these are the coefficients of the plane equation of plane in eye coordinates (these coordinates are those that were computed when the plane was specified).@param plane the clip plane@param equation a buffer in which to place the returned values@see <a href="https://docs.gl/gl3/glGetClipPlane">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetClipPlane(int plane, DoubleBuffer equation);

    /** Returns the current boolean value of the specified state variable. <p><b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values, LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.</p>@param pname the state variable@param params a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl4/glGetBooleanv">Reference Page</a>*/
    void glGetBooleanv(int pname, ByteBuffer params);

    /** Returns the current boolean value of the specified state variable. <p><b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values, LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.</p>@param pname the state variable@see <a href="https://docs.gl/gl4/glGetBooleanv">Reference Page</a>*/
    boolean glGetBoolean(int pname);

    /** Returns the current float value of the specified state variable. <p><b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values, LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.</p>@param pname the state variable@param params a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl4/glGetFloatv">Reference Page</a>*/
    void glGetFloatv(int pname, FloatBuffer params);

    /** Returns the current float value of the specified state variable. <p><b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values, LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.</p>@param pname the state variable@see <a href="https://docs.gl/gl4/glGetFloatv">Reference Page</a>*/
    float glGetFloat(int pname);

    /** Returns the current integer value of the specified state variable. <p><b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values, LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.</p>@param pname the state variable@param params a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl4/glGetIntegerv">Reference Page</a>*/
    void glGetIntegerv(int pname, IntBuffer params);

    /** Returns the current integer value of the specified state variable. <p><b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values, LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.</p>@param pname the state variable@see <a href="https://docs.gl/gl4/glGetIntegerv">Reference Page</a>*/
    int glGetInteger(int pname);

    /** Returns the current double value of the specified state variable. <p><b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values, LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.</p>@param pname the state variable@param params a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl4/glGetDoublev">Reference Page</a>*/
    void glGetDoublev(int pname, DoubleBuffer params);

    /** Returns the current double value of the specified state variable. <p><b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values, LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.</p>@param pname the state variable@see <a href="https://docs.gl/gl4/glGetDoublev">Reference Page</a>*/
    double glGetDouble(int pname);

    /** Returns error information. <p>Each detectable error is assigned a numeric code. When an error is detected, a flag is set and the code is recorded. Further errors, if they occur, do not affect this recorded code. When {@code GetError} is called, the code is returned and the flag is cleared, so that a further error will again record its code. If a call to {@code GetError} returns {@link GL11C#GL_NO_ERROR NO_ERROR}, then there has been no detectable error since the last call to {@code GetError} (or since the GL was initialized).</p>@see <a href="https://docs.gl/gl4/glGetError">Reference Page</a>*/
    int glGetError();

    /** Returns integer information about light parameter {@code pname} for {@code light} in {@code data}.@param light the light for which to return information. One of:<br><table><tr><td>{@link #GL_LIGHT0 LIGHT0}</td><td>GL_LIGHT[1-7]</td></tr></table>@param pname the light parameter to query. One of:<br><table><tr><td>{@link #GL_AMBIENT AMBIENT}</td><td>{@link #GL_DIFFUSE DIFFUSE}</td><td>{@link #GL_SPECULAR SPECULAR}</td><td>{@link #GL_POSITION POSITION}</td><td>{@link #GL_CONSTANT_ATTENUATION CONSTANT_ATTENUATION}</td><td>{@link #GL_LINEAR_ATTENUATION LINEAR_ATTENUATION}</td></tr><tr><td>{@link #GL_QUADRATIC_ATTENUATION QUADRATIC_ATTENUATION}</td><td>{@link #GL_SPOT_DIRECTION SPOT_DIRECTION}</td><td>{@link #GL_SPOT_EXPONENT SPOT_EXPONENT}</td><td>{@link #GL_SPOT_CUTOFF SPOT_CUTOFF}</td></tr></table>@param data a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl3/glGetLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetLightiv(int light, int pname, IntBuffer data);

    /** Returns integer information about light parameter {@code pname} for {@code light} in {@code data}.@param light the light for which to return information. One of:<br><table><tr><td>{@link #GL_LIGHT0 LIGHT0}</td><td>GL_LIGHT[1-7]</td></tr></table>@param pname the light parameter to query. One of:<br><table><tr><td>{@link #GL_AMBIENT AMBIENT}</td><td>{@link #GL_DIFFUSE DIFFUSE}</td><td>{@link #GL_SPECULAR SPECULAR}</td><td>{@link #GL_POSITION POSITION}</td><td>{@link #GL_CONSTANT_ATTENUATION CONSTANT_ATTENUATION}</td><td>{@link #GL_LINEAR_ATTENUATION LINEAR_ATTENUATION}</td></tr><tr><td>{@link #GL_QUADRATIC_ATTENUATION QUADRATIC_ATTENUATION}</td><td>{@link #GL_SPOT_DIRECTION SPOT_DIRECTION}</td><td>{@link #GL_SPOT_EXPONENT SPOT_EXPONENT}</td><td>{@link #GL_SPOT_CUTOFF SPOT_CUTOFF}</td></tr></table>@see <a href="https://docs.gl/gl3/glGetLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    int glGetLighti(int light, int pname);

    /** Float version of {@link #glGetLightiv GetLightiv}.@param light the light for which to return information@param pname the light parameter to query@param data a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl3/glGetLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetLightfv(int light, int pname, FloatBuffer data);

    /** Float version of {@link #glGetLightiv GetLightiv}.@param light the light for which to return information@param pname the light parameter to query@see <a href="https://docs.gl/gl3/glGetLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    float glGetLightf(int light, int pname);

    /** Returns integer information about {@code query} for evaluator map {@code target} in {@code data}.@param target the evaluator target. One of:<br><table><tr><td>{@link #GL_MAP1_VERTEX_3 MAP1_VERTEX_3}</td><td>{@link #GL_MAP1_VERTEX_4 MAP1_VERTEX_4}</td><td>{@link #GL_MAP1_COLOR_4 MAP1_COLOR_4}</td><td>{@link #GL_MAP1_NORMAL MAP1_NORMAL}</td><td>{@link #GL_MAP1_TEXTURE_COORD_1 MAP1_TEXTURE_COORD_1}</td></tr><tr><td>{@link #GL_MAP1_TEXTURE_COORD_2 MAP1_TEXTURE_COORD_2}</td><td>{@link #GL_MAP1_TEXTURE_COORD_3 MAP1_TEXTURE_COORD_3}</td><td>{@link #GL_MAP1_TEXTURE_COORD_4 MAP1_TEXTURE_COORD_4}</td><td>{@link #GL_MAP2_VERTEX_3 MAP2_VERTEX_3}</td><td>{@link #GL_MAP2_VERTEX_4 MAP2_VERTEX_4}</td></tr><tr><td>{@link #GL_MAP2_COLOR_4 MAP2_COLOR_4}</td><td>{@link #GL_MAP2_NORMAL MAP2_NORMAL}</td><td>{@link #GL_MAP2_TEXTURE_COORD_1 MAP2_TEXTURE_COORD_1}</td><td>{@link #GL_MAP2_TEXTURE_COORD_2 MAP2_TEXTURE_COORD_2}</td><td>{@link #GL_MAP2_TEXTURE_COORD_3 MAP2_TEXTURE_COORD_3}</td></tr><tr><td>{@link #GL_MAP2_TEXTURE_COORD_4 MAP2_TEXTURE_COORD_4}</td></tr></table>@param query the information to query. One of:<br><table><tr><td>{@link #GL_ORDER ORDER}</td><td>{@link #GL_COEFF COEFF}</td><td>{@link #GL_DOMAIN DOMAIN}</td></tr></table>@param data a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl3/glGetMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetMapiv(int target, int query, IntBuffer data);

    /** Returns integer information about {@code query} for evaluator map {@code target} in {@code data}.@param target the evaluator target. One of:<br><table><tr><td>{@link #GL_MAP1_VERTEX_3 MAP1_VERTEX_3}</td><td>{@link #GL_MAP1_VERTEX_4 MAP1_VERTEX_4}</td><td>{@link #GL_MAP1_COLOR_4 MAP1_COLOR_4}</td><td>{@link #GL_MAP1_NORMAL MAP1_NORMAL}</td><td>{@link #GL_MAP1_TEXTURE_COORD_1 MAP1_TEXTURE_COORD_1}</td></tr><tr><td>{@link #GL_MAP1_TEXTURE_COORD_2 MAP1_TEXTURE_COORD_2}</td><td>{@link #GL_MAP1_TEXTURE_COORD_3 MAP1_TEXTURE_COORD_3}</td><td>{@link #GL_MAP1_TEXTURE_COORD_4 MAP1_TEXTURE_COORD_4}</td><td>{@link #GL_MAP2_VERTEX_3 MAP2_VERTEX_3}</td><td>{@link #GL_MAP2_VERTEX_4 MAP2_VERTEX_4}</td></tr><tr><td>{@link #GL_MAP2_COLOR_4 MAP2_COLOR_4}</td><td>{@link #GL_MAP2_NORMAL MAP2_NORMAL}</td><td>{@link #GL_MAP2_TEXTURE_COORD_1 MAP2_TEXTURE_COORD_1}</td><td>{@link #GL_MAP2_TEXTURE_COORD_2 MAP2_TEXTURE_COORD_2}</td><td>{@link #GL_MAP2_TEXTURE_COORD_3 MAP2_TEXTURE_COORD_3}</td></tr><tr><td>{@link #GL_MAP2_TEXTURE_COORD_4 MAP2_TEXTURE_COORD_4}</td></tr></table>@param query the information to query. One of:<br><table><tr><td>{@link #GL_ORDER ORDER}</td><td>{@link #GL_COEFF COEFF}</td><td>{@link #GL_DOMAIN DOMAIN}</td></tr></table>@see <a href="https://docs.gl/gl3/glGetMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    int glGetMapi(int target, int query);

    /** Float version of {@link #glGetMapiv GetMapiv}.@param target the evaluator map@param query the information to query@param data a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl3/glGetMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetMapfv(int target, int query, FloatBuffer data);

    /** Float version of {@link #glGetMapiv GetMapiv}.@param target the evaluator map@param query the information to query@see <a href="https://docs.gl/gl3/glGetMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    float glGetMapf(int target, int query);

    /** Double version of {@link #glGetMapiv GetMapiv}.@param target the evaluator map@param query the information to query@param data a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl3/glGetMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetMapdv(int target, int query, DoubleBuffer data);

    /** Double version of {@link #glGetMapiv GetMapiv}.@param target the evaluator map@param query the information to query@see <a href="https://docs.gl/gl3/glGetMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    double glGetMapd(int target, int query);

    /** Returns integer information about material property {@code pname} for {@code face} in {@code data}.@param face the material face for which to return information. One of:<br><table><tr><td>{@link #GL_FRONT FRONT}</td><td>{@link #GL_BACK BACK}</td></tr></table>@param pname the information to query. One of:<br><table><tr><td>{@link #GL_AMBIENT AMBIENT}</td><td>{@link #GL_DIFFUSE DIFFUSE}</td><td>{@link #GL_SPECULAR SPECULAR}</td><td>{@link #GL_EMISSION EMISSION}</td><td>{@link #GL_SHININESS SHININESS}</td></tr></table>@param data a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl3/glGetMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetMaterialiv(int face, int pname, IntBuffer data);

    /** Float version of {@link #glGetMaterialiv GetMaterialiv}.@param face the material face for which to return information@param pname the information to query@param data a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl3/glGetMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetMaterialfv(int face, int pname, FloatBuffer data);

    /** Returns all float values in the pixel map {@code map} in {@code data}.@param map the pixel map parameter to query. One of:<br><table><tr><td>{@link #GL_PIXEL_MAP_I_TO_I PIXEL_MAP_I_TO_I}</td><td>{@link #GL_PIXEL_MAP_S_TO_S PIXEL_MAP_S_TO_S}</td><td>{@link #GL_PIXEL_MAP_I_TO_R PIXEL_MAP_I_TO_R}</td><td>{@link #GL_PIXEL_MAP_I_TO_G PIXEL_MAP_I_TO_G}</td><td>{@link #GL_PIXEL_MAP_I_TO_B PIXEL_MAP_I_TO_B}</td></tr><tr><td>{@link #GL_PIXEL_MAP_I_TO_A PIXEL_MAP_I_TO_A}</td><td>{@link #GL_PIXEL_MAP_R_TO_R PIXEL_MAP_R_TO_R}</td><td>{@link #GL_PIXEL_MAP_G_TO_G PIXEL_MAP_G_TO_G}</td><td>{@link #GL_PIXEL_MAP_B_TO_B PIXEL_MAP_B_TO_B}</td><td>{@link #GL_PIXEL_MAP_A_TO_A PIXEL_MAP_A_TO_A}</td></tr></table>@param data a buffer in which to place the returned data@see <a href="https://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetPixelMapfv(int map, FloatBuffer data);

    /** Returns all float values in the pixel map {@code map} in {@code data}.@param map the pixel map parameter to query. One of:<br><table><tr><td>{@link #GL_PIXEL_MAP_I_TO_I PIXEL_MAP_I_TO_I}</td><td>{@link #GL_PIXEL_MAP_S_TO_S PIXEL_MAP_S_TO_S}</td><td>{@link #GL_PIXEL_MAP_I_TO_R PIXEL_MAP_I_TO_R}</td><td>{@link #GL_PIXEL_MAP_I_TO_G PIXEL_MAP_I_TO_G}</td><td>{@link #GL_PIXEL_MAP_I_TO_B PIXEL_MAP_I_TO_B}</td></tr><tr><td>{@link #GL_PIXEL_MAP_I_TO_A PIXEL_MAP_I_TO_A}</td><td>{@link #GL_PIXEL_MAP_R_TO_R PIXEL_MAP_R_TO_R}</td><td>{@link #GL_PIXEL_MAP_G_TO_G PIXEL_MAP_G_TO_G}</td><td>{@link #GL_PIXEL_MAP_B_TO_B PIXEL_MAP_B_TO_B}</td><td>{@link #GL_PIXEL_MAP_A_TO_A PIXEL_MAP_A_TO_A}</td></tr></table>@param data a buffer in which to place the returned data@see <a href="https://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetPixelMapfv(int map, long data);

    /** Unsigned short version of {@link #glGetPixelMapfv GetPixelMapfv}.@param map the pixel map parameter to query@param data a buffer in which to place the returned data@see <a href="https://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetPixelMapusv(int map, ShortBuffer data);

    /** Unsigned short version of {@link #glGetPixelMapfv GetPixelMapfv}.@param map the pixel map parameter to query@param data a buffer in which to place the returned data@see <a href="https://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetPixelMapusv(int map, long data);

    /** Unsigned integer version of {@link #glGetPixelMapfv GetPixelMapfv}.@param map the pixel map parameter to query@param data a buffer in which to place the returned data@see <a href="https://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetPixelMapuiv(int map, IntBuffer data);

    /** Unsigned integer version of {@link #glGetPixelMapfv GetPixelMapfv}.@param map the pixel map parameter to query@param data a buffer in which to place the returned data@see <a href="https://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetPixelMapuiv(int map, long data);

    /** Returns a pointer in the current GL context.@param pname the pointer to return. One of:<br><table><tr><td>{@link GL43#GL_DEBUG_CALLBACK_FUNCTION DEBUG_CALLBACK_FUNCTION}</td><td>{@link GL43#GL_DEBUG_CALLBACK_USER_PARAM DEBUG_CALLBACK_USER_PARAM}</td></tr></table>@param params a buffer in which to place the returned pointer@see <a href="https://docs.gl/gl4/glGetPointerv">Reference Page</a>*/
    void glGetPointerv(int pname, PointerBuffer params);

    /** Returns a pointer in the current GL context.@param pname the pointer to return. One of:<br><table><tr><td>{@link GL43#GL_DEBUG_CALLBACK_FUNCTION DEBUG_CALLBACK_FUNCTION}</td><td>{@link GL43#GL_DEBUG_CALLBACK_USER_PARAM DEBUG_CALLBACK_USER_PARAM}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetPointerv">Reference Page</a>*/
    long glGetPointer(int pname);

    /** Obtains the polygon stipple.@param pattern a buffer in which to place the returned data@see <a href="https://docs.gl/gl3/glGetPolygonStipple">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetPolygonStipple(ByteBuffer pattern);

    /** Obtains the polygon stipple.@param pattern a buffer in which to place the returned data@see <a href="https://docs.gl/gl3/glGetPolygonStipple">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetPolygonStipple(long pattern);

    /** Return strings describing properties of the current GL context.@param name the property to query. One of:<br><table><tr><td>{@link GL11C#GL_RENDERER RENDERER}</td><td>{@link GL11C#GL_VENDOR VENDOR}</td><td>{@link GL11C#GL_EXTENSIONS EXTENSIONS}</td><td>{@link GL11C#GL_VERSION VERSION}</td><td>{@link GL20#GL_SHADING_LANGUAGE_VERSION SHADING_LANGUAGE_VERSION}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetString">Reference Page</a>*/
    String glGetString(int name);

    /** Returns integer information about {@code pname} for {@code env} in {@code data}.@param env the texture environment to query. One of:<br><table><tr><td>{@link GL20#GL_POINT_SPRITE POINT_SPRITE}</td><td>{@link #GL_TEXTURE_ENV TEXTURE_ENV}</td><td>{@link GL14#GL_TEXTURE_FILTER_CONTROL TEXTURE_FILTER_CONTROL}</td></tr></table>@param pname the parameter to query. One of:<br><table><tr><td>{@link GL20#GL_COORD_REPLACE COORD_REPLACE}</td><td>{@link #GL_TEXTURE_ENV_MODE TEXTURE_ENV_MODE}</td><td>{@link #GL_TEXTURE_ENV_COLOR TEXTURE_ENV_COLOR}</td><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL13#GL_COMBINE_RGB COMBINE_RGB}</td><td>{@link GL13#GL_COMBINE_ALPHA COMBINE_ALPHA}</td></tr><tr><td>{@link GL15#GL_SRC0_RGB SRC0_RGB}</td><td>{@link GL15#GL_SRC1_RGB SRC1_RGB}</td><td>{@link GL15#GL_SRC2_RGB SRC2_RGB}</td><td>{@link GL15#GL_SRC0_ALPHA SRC0_ALPHA}</td><td>{@link GL15#GL_SRC1_ALPHA SRC1_ALPHA}</td><td>{@link GL15#GL_SRC2_ALPHA SRC2_ALPHA}</td></tr><tr><td>{@link GL13#GL_OPERAND0_RGB OPERAND0_RGB}</td><td>{@link GL13#GL_OPERAND1_RGB OPERAND1_RGB}</td><td>{@link GL13#GL_OPERAND2_RGB OPERAND2_RGB}</td><td>{@link GL13#GL_OPERAND0_ALPHA OPERAND0_ALPHA}</td><td>{@link GL13#GL_OPERAND1_ALPHA OPERAND1_ALPHA}</td><td>{@link GL13#GL_OPERAND2_ALPHA OPERAND2_ALPHA}</td></tr><tr><td>{@link GL13#GL_RGB_SCALE RGB_SCALE}</td><td>{@link #GL_ALPHA_SCALE ALPHA_SCALE}</td></tr></table>@param data a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl3/glGetTexEnv">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetTexEnviv(int env, int pname, IntBuffer data);

    /** Returns integer information about {@code pname} for {@code env} in {@code data}.@param env the texture environment to query. One of:<br><table><tr><td>{@link GL20#GL_POINT_SPRITE POINT_SPRITE}</td><td>{@link #GL_TEXTURE_ENV TEXTURE_ENV}</td><td>{@link GL14#GL_TEXTURE_FILTER_CONTROL TEXTURE_FILTER_CONTROL}</td></tr></table>@param pname the parameter to query. One of:<br><table><tr><td>{@link GL20#GL_COORD_REPLACE COORD_REPLACE}</td><td>{@link #GL_TEXTURE_ENV_MODE TEXTURE_ENV_MODE}</td><td>{@link #GL_TEXTURE_ENV_COLOR TEXTURE_ENV_COLOR}</td><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL13#GL_COMBINE_RGB COMBINE_RGB}</td><td>{@link GL13#GL_COMBINE_ALPHA COMBINE_ALPHA}</td></tr><tr><td>{@link GL15#GL_SRC0_RGB SRC0_RGB}</td><td>{@link GL15#GL_SRC1_RGB SRC1_RGB}</td><td>{@link GL15#GL_SRC2_RGB SRC2_RGB}</td><td>{@link GL15#GL_SRC0_ALPHA SRC0_ALPHA}</td><td>{@link GL15#GL_SRC1_ALPHA SRC1_ALPHA}</td><td>{@link GL15#GL_SRC2_ALPHA SRC2_ALPHA}</td></tr><tr><td>{@link GL13#GL_OPERAND0_RGB OPERAND0_RGB}</td><td>{@link GL13#GL_OPERAND1_RGB OPERAND1_RGB}</td><td>{@link GL13#GL_OPERAND2_RGB OPERAND2_RGB}</td><td>{@link GL13#GL_OPERAND0_ALPHA OPERAND0_ALPHA}</td><td>{@link GL13#GL_OPERAND1_ALPHA OPERAND1_ALPHA}</td><td>{@link GL13#GL_OPERAND2_ALPHA OPERAND2_ALPHA}</td></tr><tr><td>{@link GL13#GL_RGB_SCALE RGB_SCALE}</td><td>{@link #GL_ALPHA_SCALE ALPHA_SCALE}</td></tr></table>@see <a href="https://docs.gl/gl3/glGetTexEnv">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    int glGetTexEnvi(int env, int pname);

    /** Float version of {@link #glGetTexEnviv GetTexEnviv}.@param env the texture environment to query@param pname the parameter to query@param data a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl3/glGetTexEnv">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetTexEnvfv(int env, int pname, FloatBuffer data);

    /** Float version of {@link #glGetTexEnviv GetTexEnviv}.@param env the texture environment to query@param pname the parameter to query@see <a href="https://docs.gl/gl3/glGetTexEnv">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    float glGetTexEnvf(int env, int pname);

    /** Returns integer information about {@code pname} for {@code coord} in {@code data}.@param coord the coord to query. One of:<br><table><tr><td>{@link #GL_S S}</td><td>{@link #GL_T T}</td><td>{@link #GL_R R}</td><td>{@link #GL_Q Q}</td></tr></table>@param pname the parameter to query. One of:<br><table><tr><td>{@link #GL_EYE_PLANE EYE_PLANE}</td><td>{@link #GL_OBJECT_PLANE OBJECT_PLANE}</td><td>{@link #GL_TEXTURE_GEN_MODE TEXTURE_GEN_MODE}</td></tr></table>@param data a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl3/glGetTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetTexGeniv(int coord, int pname, IntBuffer data);

    /** Returns integer information about {@code pname} for {@code coord} in {@code data}.@param coord the coord to query. One of:<br><table><tr><td>{@link #GL_S S}</td><td>{@link #GL_T T}</td><td>{@link #GL_R R}</td><td>{@link #GL_Q Q}</td></tr></table>@param pname the parameter to query. One of:<br><table><tr><td>{@link #GL_EYE_PLANE EYE_PLANE}</td><td>{@link #GL_OBJECT_PLANE OBJECT_PLANE}</td><td>{@link #GL_TEXTURE_GEN_MODE TEXTURE_GEN_MODE}</td></tr></table>@see <a href="https://docs.gl/gl3/glGetTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    int glGetTexGeni(int coord, int pname);

    /** Float version of {@link #glGetTexGeniv GetTexGeniv}.@param coord the coord to query@param pname the parameter to query@param data a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl3/glGetTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetTexGenfv(int coord, int pname, FloatBuffer data);

    /** Float version of {@link #glGetTexGeniv GetTexGeniv}.@param coord the coord to query@param pname the parameter to query@see <a href="https://docs.gl/gl3/glGetTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    float glGetTexGenf(int coord, int pname);

    /** Double version of {@link #glGetTexGeniv GetTexGeniv}.@param coord the coord to query@param pname the parameter to query@param data a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl3/glGetTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetTexGendv(int coord, int pname, DoubleBuffer data);

    /** Double version of {@link #glGetTexGeniv GetTexGeniv}.@param coord the coord to query@param pname the parameter to query@see <a href="https://docs.gl/gl3/glGetTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    double glGetTexGend(int coord, int pname);

    /** Obtains texture images.@param tex the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>@param level the level-of-detail number@param format the pixel format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the buffer in which to place the returned data@see <a href="https://docs.gl/gl4/glGetTexImage">Reference Page</a>*/
    void glGetTexImage(int tex, int level, int format, int type, ByteBuffer pixels);

    /** Obtains texture images.@param tex the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>@param level the level-of-detail number@param format the pixel format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the buffer in which to place the returned data@see <a href="https://docs.gl/gl4/glGetTexImage">Reference Page</a>*/
    void glGetTexImage(int tex, int level, int format, int type, long pixels);

    /** Obtains texture images.@param tex the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>@param level the level-of-detail number@param format the pixel format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the buffer in which to place the returned data@see <a href="https://docs.gl/gl4/glGetTexImage">Reference Page</a>*/
    void glGetTexImage(int tex, int level, int format, int type, ShortBuffer pixels);

    /** Obtains texture images.@param tex the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>@param level the level-of-detail number@param format the pixel format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the buffer in which to place the returned data@see <a href="https://docs.gl/gl4/glGetTexImage">Reference Page</a>*/
    void glGetTexImage(int tex, int level, int format, int type, IntBuffer pixels);

    /** Obtains texture images.@param tex the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>@param level the level-of-detail number@param format the pixel format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the buffer in which to place the returned data@see <a href="https://docs.gl/gl4/glGetTexImage">Reference Page</a>*/
    void glGetTexImage(int tex, int level, int format, int type, FloatBuffer pixels);

    /** Obtains texture images.@param tex the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>@param level the level-of-detail number@param format the pixel format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the buffer in which to place the returned data@see <a href="https://docs.gl/gl4/glGetTexImage">Reference Page</a>*/
    void glGetTexImage(int tex, int level, int format, int type, DoubleBuffer pixels);

    /** Places integer information about texture image parameter {@code pname} for level-of-detail {@code level} of the specified {@code target} into {@code params}.@param target the texture image target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL11C#GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td><td>{@link GL11C#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td><td>{@link GL12#GL_PROXY_TEXTURE_3D PROXY_TEXTURE_3D}</td></tr><tr><td>{@link GL30#GL_PROXY_TEXTURE_2D_ARRAY PROXY_TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_PROXY_TEXTURE_CUBE_MAP_ARRAY PROXY_TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL32#GL_PROXY_TEXTURE_2D_MULTISAMPLE PROXY_TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>@param level the level-of-detail number@param pname the parameter to query. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_WIDTH TEXTURE_WIDTH}</td><td>{@link GL11C#GL_TEXTURE_HEIGHT TEXTURE_HEIGHT}</td><td>{@link GL12#GL_TEXTURE_DEPTH TEXTURE_DEPTH}</td><td>{@link GL32#GL_TEXTURE_SAMPLES TEXTURE_SAMPLES}</td></tr><tr><td>{@link GL32#GL_TEXTURE_FIXED_SAMPLE_LOCATIONS TEXTURE_FIXED_SAMPLE_LOCATIONS}</td><td>{@link GL11C#GL_TEXTURE_INTERNAL_FORMAT TEXTURE_INTERNAL_FORMAT}</td><td>{@link GL11C#GL_TEXTURE_RED_SIZE TEXTURE_RED_SIZE}</td><td>{@link GL11C#GL_TEXTURE_GREEN_SIZE TEXTURE_GREEN_SIZE}</td></tr><tr><td>{@link GL11C#GL_TEXTURE_BLUE_SIZE TEXTURE_BLUE_SIZE}</td><td>{@link GL11C#GL_TEXTURE_ALPHA_SIZE TEXTURE_ALPHA_SIZE}</td><td>{@link GL14#GL_TEXTURE_DEPTH_SIZE TEXTURE_DEPTH_SIZE}</td><td>{@link GL30#GL_TEXTURE_STENCIL_SIZE TEXTURE_STENCIL_SIZE}</td></tr><tr><td>{@link GL30#GL_TEXTURE_SHARED_SIZE TEXTURE_SHARED_SIZE}</td><td>{@link GL30#GL_TEXTURE_ALPHA_TYPE TEXTURE_ALPHA_TYPE}</td><td>{@link GL30#GL_TEXTURE_DEPTH_TYPE TEXTURE_DEPTH_TYPE}</td><td>{@link GL13#GL_TEXTURE_COMPRESSED TEXTURE_COMPRESSED}</td></tr><tr><td>{@link GL13#GL_TEXTURE_COMPRESSED_IMAGE_SIZE TEXTURE_COMPRESSED_IMAGE_SIZE}</td><td>{@link GL31#GL_TEXTURE_BUFFER_DATA_STORE_BINDING TEXTURE_BUFFER_DATA_STORE_BINDING}</td><td>{@link GL43#GL_TEXTURE_BUFFER_OFFSET TEXTURE_BUFFER_OFFSET}</td><td>{@link GL43#GL_TEXTURE_BUFFER_SIZE TEXTURE_BUFFER_SIZE}</td></tr></table>@param params a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl4/glGetTexLevelParameter">Reference Page</a>*/
    void glGetTexLevelParameteriv(int target, int level, int pname, IntBuffer params);

    /** Places integer information about texture image parameter {@code pname} for level-of-detail {@code level} of the specified {@code target} into {@code params}.@param target the texture image target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL11C#GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td><td>{@link GL11C#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td><td>{@link GL12#GL_PROXY_TEXTURE_3D PROXY_TEXTURE_3D}</td></tr><tr><td>{@link GL30#GL_PROXY_TEXTURE_2D_ARRAY PROXY_TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_PROXY_TEXTURE_CUBE_MAP_ARRAY PROXY_TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL32#GL_PROXY_TEXTURE_2D_MULTISAMPLE PROXY_TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>@param level the level-of-detail number@param pname the parameter to query. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_WIDTH TEXTURE_WIDTH}</td><td>{@link GL11C#GL_TEXTURE_HEIGHT TEXTURE_HEIGHT}</td><td>{@link GL12#GL_TEXTURE_DEPTH TEXTURE_DEPTH}</td><td>{@link GL32#GL_TEXTURE_SAMPLES TEXTURE_SAMPLES}</td></tr><tr><td>{@link GL32#GL_TEXTURE_FIXED_SAMPLE_LOCATIONS TEXTURE_FIXED_SAMPLE_LOCATIONS}</td><td>{@link GL11C#GL_TEXTURE_INTERNAL_FORMAT TEXTURE_INTERNAL_FORMAT}</td><td>{@link GL11C#GL_TEXTURE_RED_SIZE TEXTURE_RED_SIZE}</td><td>{@link GL11C#GL_TEXTURE_GREEN_SIZE TEXTURE_GREEN_SIZE}</td></tr><tr><td>{@link GL11C#GL_TEXTURE_BLUE_SIZE TEXTURE_BLUE_SIZE}</td><td>{@link GL11C#GL_TEXTURE_ALPHA_SIZE TEXTURE_ALPHA_SIZE}</td><td>{@link GL14#GL_TEXTURE_DEPTH_SIZE TEXTURE_DEPTH_SIZE}</td><td>{@link GL30#GL_TEXTURE_STENCIL_SIZE TEXTURE_STENCIL_SIZE}</td></tr><tr><td>{@link GL30#GL_TEXTURE_SHARED_SIZE TEXTURE_SHARED_SIZE}</td><td>{@link GL30#GL_TEXTURE_ALPHA_TYPE TEXTURE_ALPHA_TYPE}</td><td>{@link GL30#GL_TEXTURE_DEPTH_TYPE TEXTURE_DEPTH_TYPE}</td><td>{@link GL13#GL_TEXTURE_COMPRESSED TEXTURE_COMPRESSED}</td></tr><tr><td>{@link GL13#GL_TEXTURE_COMPRESSED_IMAGE_SIZE TEXTURE_COMPRESSED_IMAGE_SIZE}</td><td>{@link GL31#GL_TEXTURE_BUFFER_DATA_STORE_BINDING TEXTURE_BUFFER_DATA_STORE_BINDING}</td><td>{@link GL43#GL_TEXTURE_BUFFER_OFFSET TEXTURE_BUFFER_OFFSET}</td><td>{@link GL43#GL_TEXTURE_BUFFER_SIZE TEXTURE_BUFFER_SIZE}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetTexLevelParameter">Reference Page</a>*/
    int glGetTexLevelParameteri(int target, int level, int pname);

    /** Float version of {@link #glGetTexLevelParameteriv GetTexLevelParameteriv}.@param target the texture image target@param level the level-of-detail number@param pname the parameter to query@param params a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl4/glGetTexLevelParameter">Reference Page</a>*/
    void glGetTexLevelParameterfv(int target, int level, int pname, FloatBuffer params);

    /** Float version of {@link #glGetTexLevelParameteriv GetTexLevelParameteriv}.@param target the texture image target@param level the level-of-detail number@param pname the parameter to query@see <a href="https://docs.gl/gl4/glGetTexLevelParameter">Reference Page</a>*/
    float glGetTexLevelParameterf(int target, int level, int pname);

    /** Place integer information about texture parameter {@code pname} for the specified {@code target} into {@code params}.@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>@param pname the parameter to query. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL}</td><td>{@link GL11C#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL11C#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td><td>{@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td></tr><tr><td>{@link GL11C#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_R TEXTURE_SWIZZLE_R}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_G TEXTURE_SWIZZLE_G}</td></tr><tr><td>{@link GL33#GL_TEXTURE_SWIZZLE_B TEXTURE_SWIZZLE_B}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_A TEXTURE_SWIZZLE_A}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_RGBA TEXTURE_SWIZZLE_RGBA}</td><td>{@link GL11C#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td></tr><tr><td>{@link GL11C#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL14#GL_DEPTH_TEXTURE_MODE DEPTH_TEXTURE_MODE}</td><td>{@link GL14#GL_GENERATE_MIPMAP GENERATE_MIPMAP}</td></tr><tr><td>{@link GL42#GL_IMAGE_FORMAT_COMPATIBILITY_TYPE IMAGE_FORMAT_COMPATIBILITY_TYPE}</td><td>{@link GL42#GL_TEXTURE_IMMUTABLE_FORMAT TEXTURE_IMMUTABLE_FORMAT}</td><td>{@link GL43#GL_TEXTURE_IMMUTABLE_LEVELS TEXTURE_IMMUTABLE_LEVELS}</td><td>{@link GL43#GL_TEXTURE_VIEW_MIN_LEVEL TEXTURE_VIEW_MIN_LEVEL}</td></tr><tr><td>{@link GL43#GL_TEXTURE_VIEW_NUM_LEVELS TEXTURE_VIEW_NUM_LEVELS}</td><td>{@link GL43#GL_TEXTURE_VIEW_MIN_LAYER TEXTURE_VIEW_MIN_LAYER}</td><td>{@link GL43#GL_TEXTURE_VIEW_NUM_LAYERS TEXTURE_VIEW_NUM_LAYERS}</td></tr></table>@param params a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl4/glGetTexParameter">Reference Page</a>*/
    void glGetTexParameteriv(int target, int pname, IntBuffer params);

    /** Place integer information about texture parameter {@code pname} for the specified {@code target} into {@code params}.@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>@param pname the parameter to query. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL}</td><td>{@link GL11C#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL11C#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td><td>{@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td></tr><tr><td>{@link GL11C#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_R TEXTURE_SWIZZLE_R}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_G TEXTURE_SWIZZLE_G}</td></tr><tr><td>{@link GL33#GL_TEXTURE_SWIZZLE_B TEXTURE_SWIZZLE_B}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_A TEXTURE_SWIZZLE_A}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_RGBA TEXTURE_SWIZZLE_RGBA}</td><td>{@link GL11C#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td></tr><tr><td>{@link GL11C#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL14#GL_DEPTH_TEXTURE_MODE DEPTH_TEXTURE_MODE}</td><td>{@link GL14#GL_GENERATE_MIPMAP GENERATE_MIPMAP}</td></tr><tr><td>{@link GL42#GL_IMAGE_FORMAT_COMPATIBILITY_TYPE IMAGE_FORMAT_COMPATIBILITY_TYPE}</td><td>{@link GL42#GL_TEXTURE_IMMUTABLE_FORMAT TEXTURE_IMMUTABLE_FORMAT}</td><td>{@link GL43#GL_TEXTURE_IMMUTABLE_LEVELS TEXTURE_IMMUTABLE_LEVELS}</td><td>{@link GL43#GL_TEXTURE_VIEW_MIN_LEVEL TEXTURE_VIEW_MIN_LEVEL}</td></tr><tr><td>{@link GL43#GL_TEXTURE_VIEW_NUM_LEVELS TEXTURE_VIEW_NUM_LEVELS}</td><td>{@link GL43#GL_TEXTURE_VIEW_MIN_LAYER TEXTURE_VIEW_MIN_LAYER}</td><td>{@link GL43#GL_TEXTURE_VIEW_NUM_LAYERS TEXTURE_VIEW_NUM_LAYERS}</td></tr></table>@see <a href="https://docs.gl/gl4/glGetTexParameter">Reference Page</a>*/
    int glGetTexParameteri(int target, int pname);

    /** Float version of {@link #glGetTexParameteriv GetTexParameteriv}.@param target the texture target@param pname the parameter to query@param params a scalar or buffer in which to place the returned data@see <a href="https://docs.gl/gl4/glGetTexParameter">Reference Page</a>*/
    void glGetTexParameterfv(int target, int pname, FloatBuffer params);

    /** Float version of {@link #glGetTexParameteriv GetTexParameteriv}.@param target the texture target@param pname the parameter to query@see <a href="https://docs.gl/gl4/glGetTexParameter">Reference Page</a>*/
    float glGetTexParameterf(int target, int pname);

    /** Certain aspects of GL behavior, when there is room for variation, may be controlled with this function. The initial value for all hints is {@link GL11C#GL_DONT_CARE DONT_CARE}.@param target the behavior to control. One of:<br><table><tr><td>{@link GL11C#GL_LINE_SMOOTH_HINT LINE_SMOOTH_HINT}</td><td>{@link GL11C#GL_POLYGON_SMOOTH_HINT POLYGON_SMOOTH_HINT}</td><td>{@link GL13#GL_TEXTURE_COMPRESSION_HINT TEXTURE_COMPRESSION_HINT}</td></tr><tr><td>{@link GL20#GL_FRAGMENT_SHADER_DERIVATIVE_HINT FRAGMENT_SHADER_DERIVATIVE_HINT}</td></tr></table>@param hint the behavior hint. One of:<br><table><tr><td>{@link GL11C#GL_FASTEST FASTEST}</td><td>{@link GL11C#GL_NICEST NICEST}</td><td>{@link GL11C#GL_DONT_CARE DONT_CARE}</td></tr></table>@see <a href="https://docs.gl/gl4/glHint">Reference Page</a>*/
    void glHint(int target, int hint);

    /** Updates the current (single-valued) color index.@param index the value to which the current color index should be set@see <a href="https://docs.gl/gl3/glIndexi">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glIndexi(int index);

    /** Unsigned byte version of {@link #glIndexi Indexi}.@param index the value to which the current color index should be set@see <a href="https://docs.gl/gl3/glIndexub">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glIndexub(byte index);

    /** Short version of {@link #glIndexi Indexi}.@param index the value to which the current color index should be set@see <a href="https://docs.gl/gl3/glIndexs">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glIndexs(short index);

    /** Float version of {@link #glIndexi Indexi}.@param index the value to which the current color index should be set@see <a href="https://docs.gl/gl3/glIndexf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glIndexf(float index);

    /** Double version of {@link #glIndexi Indexi}.@param index the value to which the current color index should be set@see <a href="https://docs.gl/gl3/glIndexd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glIndexd(double index);

    /** Pointer version of {@link #glIndexi Indexi}@param index the value to which the current color index should be set@see <a href="https://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glIndexiv(IntBuffer index);

    /** Pointer version of {@link #glIndexub Indexub}.@param index the value to which the current color index should be set@see <a href="https://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glIndexubv(ByteBuffer index);

    /** Pointer version of {@link #glIndexs Indexs}.@param index the value to which the current color index should be set@see <a href="https://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glIndexsv(ShortBuffer index);

    /** Pointer version of {@link #glIndexf Indexf}.@param index the value to which the current color index should be set@see <a href="https://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glIndexfv(FloatBuffer index);

    /** Pointer version of {@link #glIndexd Indexd}.@param index the value to which the current color index should be set@see <a href="https://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glIndexdv(DoubleBuffer index);

    /** The least significant n bits of mask, where n is the number of bits in a color index buffer, specify a mask. Where a 1 appears in this mask, the corresponding bit in the color index buffer (or buffers) is written; where a 0 appears, the bit is not written. This mask applies only in color index mode.@param mask the color index mask value@see <a href="https://docs.gl/gl3/glIndexMask">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glIndexMask(int mask);

    /** Specifies the location and organization of a color index array.@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the color index array data@see <a href="https://docs.gl/gl3/glIndexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glIndexPointer(int type, int stride, ByteBuffer pointer);

    /** Specifies the location and organization of a color index array.@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the color index array data@see <a href="https://docs.gl/gl3/glIndexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glIndexPointer(int type, int stride, long pointer);

    /** Specifies the location and organization of a color index array.@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the color index array data@see <a href="https://docs.gl/gl3/glIndexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glIndexPointer(int stride, ByteBuffer pointer);

    /** Specifies the location and organization of a color index array.@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the color index array data@see <a href="https://docs.gl/gl3/glIndexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glIndexPointer(int stride, ShortBuffer pointer);

    /** Specifies the location and organization of a color index array.@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the color index array data@see <a href="https://docs.gl/gl3/glIndexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glIndexPointer(int stride, IntBuffer pointer);

    /** Clears the selection name stack.@see <a href="https://docs.gl/gl3/glInitNames">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glInitNames();

    /** Efficiently initializes the six vertex arrays and their enables to one of 14 configurations.@param format the interleaved array format. One of:<br><table><tr><td>{@link #GL_V2F V2F}</td><td>{@link #GL_V3F V3F}</td><td>{@link #GL_C4UB_V2F C4UB_V2F}</td><td>{@link #GL_C4UB_V3F C4UB_V3F}</td><td>{@link #GL_C3F_V3F C3F_V3F}</td><td>{@link #GL_N3F_V3F N3F_V3F}</td><td>{@link #GL_C4F_N3F_V3F C4F_N3F_V3F}</td><td>{@link #GL_T2F_V3F T2F_V3F}</td></tr><tr><td>{@link #GL_T4F_V4F T4F_V4F}</td><td>{@link #GL_T2F_C4UB_V3F T2F_C4UB_V3F}</td><td>{@link #GL_T2F_C3F_V3F T2F_C3F_V3F}</td><td>{@link #GL_T2F_N3F_V3F T2F_N3F_V3F}</td><td>{@link #GL_T2F_C4F_N3F_V3F T2F_C4F_N3F_V3F}</td><td>{@link #GL_T4F_C4F_N3F_V4F T4F_C4F_N3F_V4F}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the vertex array data@see <a href="https://docs.gl/gl3/glInterleavedArrays">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glInterleavedArrays(int format, int stride, ByteBuffer pointer);

    /** Efficiently initializes the six vertex arrays and their enables to one of 14 configurations.@param format the interleaved array format. One of:<br><table><tr><td>{@link #GL_V2F V2F}</td><td>{@link #GL_V3F V3F}</td><td>{@link #GL_C4UB_V2F C4UB_V2F}</td><td>{@link #GL_C4UB_V3F C4UB_V3F}</td><td>{@link #GL_C3F_V3F C3F_V3F}</td><td>{@link #GL_N3F_V3F N3F_V3F}</td><td>{@link #GL_C4F_N3F_V3F C4F_N3F_V3F}</td><td>{@link #GL_T2F_V3F T2F_V3F}</td></tr><tr><td>{@link #GL_T4F_V4F T4F_V4F}</td><td>{@link #GL_T2F_C4UB_V3F T2F_C4UB_V3F}</td><td>{@link #GL_T2F_C3F_V3F T2F_C3F_V3F}</td><td>{@link #GL_T2F_N3F_V3F T2F_N3F_V3F}</td><td>{@link #GL_T2F_C4F_N3F_V3F T2F_C4F_N3F_V3F}</td><td>{@link #GL_T4F_C4F_N3F_V4F T4F_C4F_N3F_V4F}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the vertex array data@see <a href="https://docs.gl/gl3/glInterleavedArrays">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glInterleavedArrays(int format, int stride, long pointer);

    /** Efficiently initializes the six vertex arrays and their enables to one of 14 configurations.@param format the interleaved array format. One of:<br><table><tr><td>{@link #GL_V2F V2F}</td><td>{@link #GL_V3F V3F}</td><td>{@link #GL_C4UB_V2F C4UB_V2F}</td><td>{@link #GL_C4UB_V3F C4UB_V3F}</td><td>{@link #GL_C3F_V3F C3F_V3F}</td><td>{@link #GL_N3F_V3F N3F_V3F}</td><td>{@link #GL_C4F_N3F_V3F C4F_N3F_V3F}</td><td>{@link #GL_T2F_V3F T2F_V3F}</td></tr><tr><td>{@link #GL_T4F_V4F T4F_V4F}</td><td>{@link #GL_T2F_C4UB_V3F T2F_C4UB_V3F}</td><td>{@link #GL_T2F_C3F_V3F T2F_C3F_V3F}</td><td>{@link #GL_T2F_N3F_V3F T2F_N3F_V3F}</td><td>{@link #GL_T2F_C4F_N3F_V3F T2F_C4F_N3F_V3F}</td><td>{@link #GL_T4F_C4F_N3F_V4F T4F_C4F_N3F_V4F}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the vertex array data@see <a href="https://docs.gl/gl3/glInterleavedArrays">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glInterleavedArrays(int format, int stride, ShortBuffer pointer);

    /** Efficiently initializes the six vertex arrays and their enables to one of 14 configurations.@param format the interleaved array format. One of:<br><table><tr><td>{@link #GL_V2F V2F}</td><td>{@link #GL_V3F V3F}</td><td>{@link #GL_C4UB_V2F C4UB_V2F}</td><td>{@link #GL_C4UB_V3F C4UB_V3F}</td><td>{@link #GL_C3F_V3F C3F_V3F}</td><td>{@link #GL_N3F_V3F N3F_V3F}</td><td>{@link #GL_C4F_N3F_V3F C4F_N3F_V3F}</td><td>{@link #GL_T2F_V3F T2F_V3F}</td></tr><tr><td>{@link #GL_T4F_V4F T4F_V4F}</td><td>{@link #GL_T2F_C4UB_V3F T2F_C4UB_V3F}</td><td>{@link #GL_T2F_C3F_V3F T2F_C3F_V3F}</td><td>{@link #GL_T2F_N3F_V3F T2F_N3F_V3F}</td><td>{@link #GL_T2F_C4F_N3F_V3F T2F_C4F_N3F_V3F}</td><td>{@link #GL_T4F_C4F_N3F_V4F T4F_C4F_N3F_V4F}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the vertex array data@see <a href="https://docs.gl/gl3/glInterleavedArrays">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glInterleavedArrays(int format, int stride, IntBuffer pointer);

    /** Efficiently initializes the six vertex arrays and their enables to one of 14 configurations.@param format the interleaved array format. One of:<br><table><tr><td>{@link #GL_V2F V2F}</td><td>{@link #GL_V3F V3F}</td><td>{@link #GL_C4UB_V2F C4UB_V2F}</td><td>{@link #GL_C4UB_V3F C4UB_V3F}</td><td>{@link #GL_C3F_V3F C3F_V3F}</td><td>{@link #GL_N3F_V3F N3F_V3F}</td><td>{@link #GL_C4F_N3F_V3F C4F_N3F_V3F}</td><td>{@link #GL_T2F_V3F T2F_V3F}</td></tr><tr><td>{@link #GL_T4F_V4F T4F_V4F}</td><td>{@link #GL_T2F_C4UB_V3F T2F_C4UB_V3F}</td><td>{@link #GL_T2F_C3F_V3F T2F_C3F_V3F}</td><td>{@link #GL_T2F_N3F_V3F T2F_N3F_V3F}</td><td>{@link #GL_T2F_C4F_N3F_V3F T2F_C4F_N3F_V3F}</td><td>{@link #GL_T4F_C4F_N3F_V4F T4F_C4F_N3F_V4F}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the vertex array data@see <a href="https://docs.gl/gl3/glInterleavedArrays">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glInterleavedArrays(int format, int stride, FloatBuffer pointer);

    /** Efficiently initializes the six vertex arrays and their enables to one of 14 configurations.@param format the interleaved array format. One of:<br><table><tr><td>{@link #GL_V2F V2F}</td><td>{@link #GL_V3F V3F}</td><td>{@link #GL_C4UB_V2F C4UB_V2F}</td><td>{@link #GL_C4UB_V3F C4UB_V3F}</td><td>{@link #GL_C3F_V3F C3F_V3F}</td><td>{@link #GL_N3F_V3F N3F_V3F}</td><td>{@link #GL_C4F_N3F_V3F C4F_N3F_V3F}</td><td>{@link #GL_T2F_V3F T2F_V3F}</td></tr><tr><td>{@link #GL_T4F_V4F T4F_V4F}</td><td>{@link #GL_T2F_C4UB_V3F T2F_C4UB_V3F}</td><td>{@link #GL_T2F_C3F_V3F T2F_C3F_V3F}</td><td>{@link #GL_T2F_N3F_V3F T2F_N3F_V3F}</td><td>{@link #GL_T2F_C4F_N3F_V3F T2F_C4F_N3F_V3F}</td><td>{@link #GL_T4F_C4F_N3F_V4F T4F_C4F_N3F_V4F}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the vertex array data@see <a href="https://docs.gl/gl3/glInterleavedArrays">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glInterleavedArrays(int format, int stride, DoubleBuffer pointer);

    /** Determines if {@code cap} is currently enabled (as with {@link #glEnable Enable}) or disabled.@param cap the enable state to query@see <a href="https://docs.gl/gl4/glIsEnabled">Reference Page</a>*/
    boolean glIsEnabled(int cap);

    /** Returns true if the {@code list} is the index of some display list.@param list the list index to query@see <a href="https://docs.gl/gl3/glIsList">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    boolean glIsList(int list);

    /** Returns true if {@code texture} is the name of a texture object.@param texture the texture name to query@see <a href="https://docs.gl/gl4/glIsTexture">Reference Page</a>*/
    boolean glIsTexture(int texture);

    /** Set the integer value of a lighting model parameter.@param pname the lighting model parameter to set. One of:<br><table><tr><td>{@link #GL_LIGHT_MODEL_AMBIENT LIGHT_MODEL_AMBIENT}</td><td>{@link #GL_LIGHT_MODEL_LOCAL_VIEWER LIGHT_MODEL_LOCAL_VIEWER}</td><td>{@link #GL_LIGHT_MODEL_TWO_SIDE LIGHT_MODEL_TWO_SIDE}</td></tr><tr><td>{@link GL12#GL_LIGHT_MODEL_COLOR_CONTROL LIGHT_MODEL_COLOR_CONTROL}</td></tr></table>@param param the parameter value@see <a href="https://docs.gl/gl3/glLightModeli">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLightModeli(int pname, int param);

    /** Float version of {@link #glLightModeli LightModeli}.@param pname the lighting model parameter to set@param param the parameter value@see <a href="https://docs.gl/gl3/glLightModelf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLightModelf(int pname, float param);

    /** Pointer version of {@link #glLightModeli LightModeli}.@param pname the lighting model parameter to set@param params the parameter value@see <a href="https://docs.gl/gl3/glLightModel">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLightModeliv(int pname, IntBuffer params);

    /** Pointer version of {@link #glLightModelf LightModelf}.@param pname the lighting model parameter to set@param params the parameter value@see <a href="https://docs.gl/gl3/glLightModel">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLightModelfv(int pname, FloatBuffer params);

    /** Sets the integer value of a light parameter.@param light the light for which to set the parameter. One of:<br><table><tr><td>{@link #GL_LIGHT0 LIGHT0}</td><td>GL_LIGHT[1-7]</td></tr></table>@param pname the parameter to set. One of:<br><table><tr><td>{@link #GL_AMBIENT AMBIENT}</td><td>{@link #GL_DIFFUSE DIFFUSE}</td><td>{@link #GL_SPECULAR SPECULAR}</td><td>{@link #GL_POSITION POSITION}</td><td>{@link #GL_CONSTANT_ATTENUATION CONSTANT_ATTENUATION}</td><td>{@link #GL_LINEAR_ATTENUATION LINEAR_ATTENUATION}</td></tr><tr><td>{@link #GL_QUADRATIC_ATTENUATION QUADRATIC_ATTENUATION}</td><td>{@link #GL_SPOT_DIRECTION SPOT_DIRECTION}</td><td>{@link #GL_SPOT_EXPONENT SPOT_EXPONENT}</td><td>{@link #GL_SPOT_CUTOFF SPOT_CUTOFF}</td></tr></table>@param param the parameter value@see <a href="https://docs.gl/gl3/glLighti">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLighti(int light, int pname, int param);

    /** Float version of {@link #glLighti Lighti}.@param light the light for which to set the parameter@param pname the parameter to set@param param the parameter value@see <a href="https://docs.gl/gl3/glLightf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLightf(int light, int pname, float param);

    /** Pointer version of {@link #glLighti Lighti}.@param light the light for which to set the parameter@param pname the parameter to set@param params the parameter value@see <a href="https://docs.gl/gl3/glLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLightiv(int light, int pname, IntBuffer params);

    /** Pointer version of {@link #glLightf Lightf}.@param light the light for which to set the parameter@param pname the parameter to set@param params the parameter value@see <a href="https://docs.gl/gl3/glLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLightfv(int light, int pname, FloatBuffer params);

    /** Defines a line stipple. It determines those fragments that are to be drawn when the line is rasterized. Line stippling may be enabled or disabled using {@link #glEnable Enable} or {@link #glDisable Disable} with the constant {@link #GL_LINE_STIPPLE LINE_STIPPLE}. When disabled, it is as if the line stipple has its default value.@param factor a count that is used to modify the effective line stipple by causing each bit in pattern to be used {@code factor} times. {@code factor} is clamped                to the range [1, 256].@param pattern an unsigned short integer whose 16 bits define the stipple pattern@see <a href="https://docs.gl/gl3/glLineStipple">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLineStipple(int factor, short pattern);

    /** Sets the width of rasterized line segments. The default width is 1.0.@param width the line width@see <a href="https://docs.gl/gl4/glLineWidth">Reference Page</a>*/
    void glLineWidth(float width);

    /** Sets the display list base.@param base the display list base offset@see <a href="https://docs.gl/gl3/glListBase">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glListBase(int base);

    /** Sets the current matrix to a 4 &times; 4 matrix in column-major order. <p>The matrix is stored as 16 consecutive values, i.e. as:</p> <table class=striped> <tr><td>a1</td><td>a5</td><td>a9</td><td>a13</td></tr> <tr><td>a2</td><td>a6</td><td>a10</td><td>a14</td></tr> <tr><td>a3</td><td>a7</td><td>a11</td><td>a15</td></tr> <tr><td>a4</td><td>a8</td><td>a12</td><td>a16</td></tr> </table> <p>This differs from the standard row-major ordering for matrix elements. If the standard ordering is used, all of the subsequent transformation equations are transposed, and the columns representing vectors become rows.</p>@param m the matrix data@see <a href="https://docs.gl/gl3/glLoadMatrixf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLoadMatrixf(FloatBuffer m);

    /** Double version of {@link #glLoadMatrixf LoadMatrixf}.@param m the matrix data@see <a href="https://docs.gl/gl3/glLoadMatrixd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLoadMatrixd(DoubleBuffer m);

    /** Sets the current matrix to the identity matrix. <p>Calling this function is equivalent to calling {@link #glLoadMatrixf LoadMatrixf} with the following matrix:</p> <table class=striped> <tr><td>1</td><td>0</td><td>0</td><td>0</td></tr> <tr><td>0</td><td>1</td><td>0</td><td>0</td></tr> <tr><td>0</td><td>0</td><td>1</td><td>0</td></tr> <tr><td>0</td><td>0</td><td>0</td><td>1</td></tr> </table>@see <a href="https://docs.gl/gl3/glLoadIdentity">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLoadIdentity();

    /** Replaces the value on the top of the selection stack with {@code name}.@param name the name to load@see <a href="https://docs.gl/gl3/glLoadName">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLoadName(int name);

    /** Sets the logical framebuffer operation.@param op the operation to set. One of:<br><table><tr><td>{@link GL11C#GL_CLEAR CLEAR}</td><td>{@link GL11C#GL_AND AND}</td><td>{@link GL11C#GL_AND_REVERSE AND_REVERSE}</td><td>{@link GL11C#GL_COPY COPY}</td><td>{@link GL11C#GL_AND_INVERTED AND_INVERTED}</td><td>{@link GL11C#GL_NOOP NOOP}</td><td>{@link GL11C#GL_XOR XOR}</td><td>{@link GL11C#GL_OR OR}</td><td>{@link GL11C#GL_NOR NOR}</td><td>{@link GL11C#GL_EQUIV EQUIV}</td><td>{@link GL11C#GL_INVERT INVERT}</td><td>{@link GL11C#GL_OR_REVERSE OR_REVERSE}</td><td>{@link GL11C#GL_COPY_INVERTED COPY_INVERTED}</td></tr><tr><td>{@link GL11C#GL_OR_INVERTED OR_INVERTED}</td><td>{@link GL11C#GL_NAND NAND}</td><td>{@link GL11C#GL_SET SET}</td></tr></table>@see <a href="https://docs.gl/gl4/glLogicOp">Reference Page</a>*/
    void glLogicOp(int op);

    /** Defines a polynomial or rational polynomial mapping to produce vertex, normal, texture coordinates and colors. The values so produced are sent on to further stages of the GL as if they had been provided directly by the client.@param target the evaluator target. One of:<br><table><tr><td>{@link #GL_MAP1_VERTEX_3 MAP1_VERTEX_3}</td><td>{@link #GL_MAP1_VERTEX_4 MAP1_VERTEX_4}</td><td>{@link #GL_MAP1_COLOR_4 MAP1_COLOR_4}</td><td>{@link #GL_MAP1_NORMAL MAP1_NORMAL}</td><td>{@link #GL_MAP1_TEXTURE_COORD_1 MAP1_TEXTURE_COORD_1}</td></tr><tr><td>{@link #GL_MAP1_TEXTURE_COORD_2 MAP1_TEXTURE_COORD_2}</td><td>{@link #GL_MAP1_TEXTURE_COORD_3 MAP1_TEXTURE_COORD_3}</td><td>{@link #GL_MAP1_TEXTURE_COORD_4 MAP1_TEXTURE_COORD_4}</td></tr></table>@param u1 the first endpoint of the pre-image of the map@param u2 the second endpoint of the pre-image of the map@param stride the number of values in each block of storage@param order the polynomial order@param points a set of {@code order} blocks of storage containing control points@see <a href="https://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMap1f(int target, float u1, float u2, int stride, int order, FloatBuffer points);

    /** Double version of {@link #glMap1f Map1f}.@param target the evaluator target@param u1 the first endpoint of the pre-image of the map@param u2 the second endpoint of the pre-image of the map@param stride the number of values in each block of storage@param order the polynomial order@param points a set of {@code order} blocks of storage containing control points@see <a href="https://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMap1d(int target, double u1, double u2, int stride, int order, DoubleBuffer points);

    /** Bivariate version of {@link #glMap1f Map1f}.@param target the evaluator target@param u1 the first u-dimension endpoint of the pre-image rectangle of the map@param u2 the second u-dimension endpoint of the pre-image rectangle of the map@param ustride the number of values in the u-dimension in each block of storage@param uorder the polynomial order in the u-dimension@param v1 the first _2-dimension endpoint of the pre-image rectangle of the map@param v2 the second _2-dimension endpoint of the pre-image rectangle of the map@param vstride the number of values in the _2-dimension in each block of storage@param vorder the polynomial order in the _2-dimension@param points a set of <code>uorder &times; vorder</code> blocks of storage containing control points@see <a href="https://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, FloatBuffer points);

    /** Double version of {@link #glMap2f Map2f}.@param target the evaluator target@param u1 the first u-dimension endpoint of the pre-image rectangle of the map@param u2 the second u-dimension endpoint of the pre-image rectangle of the map@param ustride the number of values in the u-dimension in each block of storage@param uorder the polynomial order in the u-dimension@param v1 the first _2-dimension endpoint of the pre-image rectangle of the map@param v2 the second _2-dimension endpoint of the pre-image rectangle of the map@param vstride the number of values in the _2-dimension in each block of storage@param vorder the polynomial order in the _2-dimension@param points a set of <code>uorder &times; vorder</code> blocks of storage containing control points@see <a href="https://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, DoubleBuffer points);

    /** Defines a one-dimensional grid in the map evaluator domain.@param n the number of partitions of the interval@param u1 the first interval endpoint@param u2 the second interval endpoint@see <a href="https://docs.gl/gl3/glMapGrid">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMapGrid1f(int n, float u1, float u2);

    /** Double version of {@link #glMapGrid1f MapGrid1f}.@param n the number of partitions of the interval@param u1 the first interval endpoint@param u2 the second interval endpoint@see <a href="https://docs.gl/gl3/glMapGrid">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMapGrid1d(int n, double u1, double u2);

    /** Defines a two-dimensional grid in the map evaluator domain.@param un the number of partitions of the interval in the u-dimension@param u1 the first u-dimension interval endpoint@param u2 the second u-dimension interval endpoint@param vn the number of partitions of the interval in the _2-dimension@param v1 the first _2-dimension interval endpoint@param v2 the second _2-dimension interval endpoint@see <a href="https://docs.gl/gl3/glMapGrid">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMapGrid2f(int un, float u1, float u2, int vn, float v1, float v2);

    /** Double version of {@link #glMapGrid2f MapGrid2f}.@param un the number of partitions of the interval in the u-dimension@param u1 the first u-dimension interval endpoint@param u2 the second u-dimension interval endpoint@param vn the number of partitions of the interval in the _2-dimension@param v1 the first _2-dimension interval endpoint@param v2 the second _2-dimension interval endpoint@see <a href="https://docs.gl/gl3/glMapGrid">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMapGrid2d(int un, double u1, double u2, int vn, double v1, double v2);

    /** Sets the integer value of a material parameter.@param face the material face for which to set the parameter. One of:<br><table><tr><td>{@link #GL_FRONT FRONT}</td><td>{@link #GL_BACK BACK}</td><td>{@link #GL_FRONT_AND_BACK FRONT_AND_BACK}</td></tr></table>@param pname the parameter to set. Must be:<br><table><tr><td>{@link #GL_SHININESS SHININESS}</td></tr></table>@param param the parameter value@see <a href="https://docs.gl/gl3/glMateriali">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMateriali(int face, int pname, int param);

    /** Float version of {@link #glMateriali Materiali}.@param face the material face for which to set the parameter@param pname the parameter to set@param param the parameter value@see <a href="https://docs.gl/gl3/glMaterialf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMaterialf(int face, int pname, float param);

    /** Pointer version of {@link #glMateriali Materiali}.@param face the material face for which to set the parameter@param pname the parameter to set. One of:<br><table><tr><td>{@link #GL_AMBIENT AMBIENT}</td><td>{@link #GL_DIFFUSE DIFFUSE}</td><td>{@link #GL_AMBIENT_AND_DIFFUSE AMBIENT_AND_DIFFUSE}</td><td>{@link #GL_SPECULAR SPECULAR}</td><td>{@link #GL_EMISSION EMISSION}</td></tr></table>@param params the parameter value@see <a href="https://docs.gl/gl3/glMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMaterialiv(int face, int pname, IntBuffer params);

    /** Pointer version of {@link #glMaterialf Materialf}.@param face the material face for which to set the parameter@param pname the parameter to set@param params the parameter value@see <a href="https://docs.gl/gl3/glMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMaterialfv(int face, int pname, FloatBuffer params);

    /** Set the current matrix mode.@param mode the matrix mode. One of:<br><table><tr><td>{@link #GL_MODELVIEW MODELVIEW}</td><td>{@link #GL_PROJECTION PROJECTION}</td><td>{@link #GL_TEXTURE TEXTURE}</td><td>{@link #GL_COLOR COLOR}</td></tr></table>@see <a href="https://docs.gl/gl3/glMatrixMode">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMatrixMode(int mode);

    /** Multiplies the current matrix with a 4 &times; 4 matrix in column-major order. See {@link #glLoadMatrixf LoadMatrixf} for details.@param m the matrix data@see <a href="https://docs.gl/gl3/glMultMatrixf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultMatrixf(FloatBuffer m);

    /** Double version of {@link #glMultMatrixf MultMatrixf}.@param m the matrix data@see <a href="https://docs.gl/gl3/glMultMatrixd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultMatrixd(DoubleBuffer m);

    /** Manipulates the current matrix with a matrix that produces perspective projection, in such a way that the coordinates <code>(lb &ndash; n)<sup>T</sup></code> and <code>(rt &ndash; n)<sup>T</sup></code> specify the points on the near clipping plane that are mapped to the lower left and upper right corners of the window, respectively (assuming that the eye is located at <code>(0 0 0)<sup>T</sup></code>). {@code f} gives the distance from the eye to the far clipping plane. <p>Calling this function is equivalent to calling {@link #glMultMatrixf MultMatrixf} with the following matrix:</p> <table class=striped> <tr><td>2n / (r - l)</td><td>0</td><td>(r + l) / (r - l)</td><td>0</td></tr> <tr><td>0</td><td>2n / (t - b)</td><td>(t + b) / (t - b)</td><td>0</td></tr> <tr><td>0</td><td>0</td><td>- (f + n) / (f - n)</td><td>- (2fn) / (f - n)</td></tr> <tr><td>0</td><td>0</td><td>-1</td><td>0</td></tr> </table>@param l the left frustum plane@param r the right frustum plane@param b the bottom frustum plane@param t the top frustum plane@param n the near frustum plane@param f the far frustum plane@see <a href="https://docs.gl/gl3/glFrustum">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glFrustum(double l, double r, double b, double t, double n, double f);

    /** Begins the definition of a display list.@param n a positive integer to which the display list that follows is assigned@param mode a symbolic constant that controls the behavior of the GL during display list creation. One of:<br><table><tr><td>{@link #GL_COMPILE COMPILE}</td><td>{@link #GL_COMPILE_AND_EXECUTE COMPILE_AND_EXECUTE}</td></tr></table>@see <a href="https://docs.gl/gl3/glNewList">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNewList(int n, int mode);

    /** Ends the definition of GL commands to be placed in a display list. It is only when {@code EndList} occurs that the specified display list is actually associated with the index indicated with {@link #glNewList NewList}.@see <a href="https://docs.gl/gl3/glEndList">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEndList();

    /** Sets the current normal.@param nx the x coordinate of the current normal@param ny the y coordinate of the current normal@param nz the z coordinate of the current normal@see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNormal3f(float nx, float ny, float nz);

    /** Byte version of {@link #glNormal3f Normal3f}.@param nx the x coordinate of the current normal@param ny the y coordinate of the current normal@param nz the z coordinate of the current normal@see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNormal3b(byte nx, byte ny, byte nz);

    /** Short version of {@link #glNormal3f Normal3f}.@param nx the x coordinate of the current normal@param ny the y coordinate of the current normal@param nz the z coordinate of the current normal@see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNormal3s(short nx, short ny, short nz);

    /** Integer version of {@link #glNormal3f Normal3f}.@param nx the x coordinate of the current normal@param ny the y coordinate of the current normal@param nz the z coordinate of the current normal@see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNormal3i(int nx, int ny, int nz);

    /** Double version of {@link #glNormal3f Normal3f}.@param nx the x coordinate of the current normal@param ny the y coordinate of the current normal@param nz the z coordinate of the current normal@see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNormal3d(double nx, double ny, double nz);

    /** Pointer version of {@link #glNormal3f Normal3f}.@param _2 the normal buffer@see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNormal3fv(FloatBuffer v);

    /** Pointer version of {@link #glNormal3b Normal3b}.@param _2 the normal buffer@see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNormal3bv(ByteBuffer v);

    /** Pointer version of {@link #glNormal3s Normal3s}.@param _2 the normal buffer@see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNormal3sv(ShortBuffer v);

    /** Pointer version of {@link #glNormal3i Normal3i}.@param _2 the normal buffer@see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNormal3iv(IntBuffer v);

    /** Pointer version of {@link #glNormal3d Normal3d}.@param _2 the normal buffer@see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNormal3dv(DoubleBuffer v);

    /** Specifies the location and organization of a normal array.@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the normal array data@see <a href="https://docs.gl/gl3/glNormalPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNormalPointer(int type, int stride, ByteBuffer pointer);

    /** Specifies the location and organization of a normal array.@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the normal array data@see <a href="https://docs.gl/gl3/glNormalPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNormalPointer(int type, int stride, long pointer);

    /** Specifies the location and organization of a normal array.@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the normal array data@see <a href="https://docs.gl/gl3/glNormalPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNormalPointer(int type, int stride, ShortBuffer pointer);

    /** Specifies the location and organization of a normal array.@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the normal array data@see <a href="https://docs.gl/gl3/glNormalPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNormalPointer(int type, int stride, IntBuffer pointer);

    /** Specifies the location and organization of a normal array.@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the normal array data@see <a href="https://docs.gl/gl3/glNormalPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNormalPointer(int type, int stride, FloatBuffer pointer);

    /** Manipulates the current matrix with a matrix that produces parallel projection, in such a way that the coordinates <code>(lb &ndash; n)<sup>T</sup></code> and <code>(rt &ndash; n)<sup>T</sup></code> specify the points on the near clipping plane that are mapped to the lower left and upper right corners of the window, respectively (assuming that the eye is located at <code>(0 0 0)<sup>T</sup></code>). {@code f} gives the distance from the eye to the far clipping plane. <p>Calling this function is equivalent to calling {@link #glMultMatrixf MultMatrixf} with the following matrix:</p> <table class=striped> <tr><td>2 / (r - l)</td><td>0</td><td>0</td><td>- (r + l) / (r - l)</td></tr> <tr><td>0</td><td>2 / (t - b)</td><td>0</td><td>- (t + b) / (t - b)</td></tr> <tr><td>0</td><td>0</td><td>- 2 / (f - n)</td><td>- (f + n) / (f - n)</td></tr> <tr><td>0</td><td>0</td><td>0</td><td>1</td></tr> </table>@param l the left frustum plane@param r the right frustum plane@param b the bottom frustum plane@param t the top frustum plane@param n the near frustum plane@param f the far frustum plane@see <a href="https://docs.gl/gl3/glOrtho">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glOrtho(double l, double r, double b, double t, double n, double f);

    /** Inserts a marker when the GL is in feeback mode. {@code token} is returned as if it were a primitive; it is indicated with its own unique identifying value. The ordering of any {@code PassThrough} commands with respect to primitive specification is maintained by feedback. {@code PassThrough} may not occur between {@link #glBegin Begin} and {@link #glEnd End}.@param token the marker value to insert@see <a href="https://docs.gl/gl3/glPassThrough">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPassThrough(float token);

    /** Sets a pixel map lookup table.@param map the map to set. One of:<br><table><tr><td>{@link #GL_PIXEL_MAP_I_TO_I PIXEL_MAP_I_TO_I}</td><td>{@link #GL_PIXEL_MAP_S_TO_S PIXEL_MAP_S_TO_S}</td><td>{@link #GL_PIXEL_MAP_I_TO_R PIXEL_MAP_I_TO_R}</td><td>{@link #GL_PIXEL_MAP_I_TO_G PIXEL_MAP_I_TO_G}</td><td>{@link #GL_PIXEL_MAP_I_TO_B PIXEL_MAP_I_TO_B}</td></tr><tr><td>{@link #GL_PIXEL_MAP_I_TO_A PIXEL_MAP_I_TO_A}</td><td>{@link #GL_PIXEL_MAP_R_TO_R PIXEL_MAP_R_TO_R}</td><td>{@link #GL_PIXEL_MAP_G_TO_G PIXEL_MAP_G_TO_G}</td><td>{@link #GL_PIXEL_MAP_B_TO_B PIXEL_MAP_B_TO_B}</td><td>{@link #GL_PIXEL_MAP_A_TO_A PIXEL_MAP_A_TO_A}</td></tr></table>@param size the map size@param values the map values@see <a href="https://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPixelMapfv(int map, int size, long values);

    /** Sets a pixel map lookup table.@param map the map to set. One of:<br><table><tr><td>{@link #GL_PIXEL_MAP_I_TO_I PIXEL_MAP_I_TO_I}</td><td>{@link #GL_PIXEL_MAP_S_TO_S PIXEL_MAP_S_TO_S}</td><td>{@link #GL_PIXEL_MAP_I_TO_R PIXEL_MAP_I_TO_R}</td><td>{@link #GL_PIXEL_MAP_I_TO_G PIXEL_MAP_I_TO_G}</td><td>{@link #GL_PIXEL_MAP_I_TO_B PIXEL_MAP_I_TO_B}</td></tr><tr><td>{@link #GL_PIXEL_MAP_I_TO_A PIXEL_MAP_I_TO_A}</td><td>{@link #GL_PIXEL_MAP_R_TO_R PIXEL_MAP_R_TO_R}</td><td>{@link #GL_PIXEL_MAP_G_TO_G PIXEL_MAP_G_TO_G}</td><td>{@link #GL_PIXEL_MAP_B_TO_B PIXEL_MAP_B_TO_B}</td><td>{@link #GL_PIXEL_MAP_A_TO_A PIXEL_MAP_A_TO_A}</td></tr></table>@param values the map values@see <a href="https://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPixelMapfv(int map, FloatBuffer values);

    /** Unsigned short version of {@link #glPixelMapfv PixelMapfv}.@param map the map to set@param size the map size@param values the map values@see <a href="https://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPixelMapusv(int map, int size, long values);

    /** Unsigned short version of {@link #glPixelMapfv PixelMapfv}.@param map the map to set@param values the map values@see <a href="https://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPixelMapusv(int map, ShortBuffer values);

    /** Unsigned integer version of {@link #glPixelMapfv PixelMapfv}.@param map the map to set@param size the map size@param values the map values@see <a href="https://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPixelMapuiv(int map, int size, long values);

    /** Unsigned integer version of {@link #glPixelMapfv PixelMapfv}.@param map the map to set@param values the map values@see <a href="https://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPixelMapuiv(int map, IntBuffer values);

    /** Sets the integer value of a pixel store parameter.@param pname the pixel store parameter to set. One of:<br><table><tr><td>{@link GL11C#GL_UNPACK_SWAP_BYTES UNPACK_SWAP_BYTES}</td><td>{@link GL11C#GL_UNPACK_LSB_FIRST UNPACK_LSB_FIRST}</td><td>{@link GL11C#GL_UNPACK_ROW_LENGTH UNPACK_ROW_LENGTH}</td></tr><tr><td>{@link GL11C#GL_UNPACK_SKIP_ROWS UNPACK_SKIP_ROWS}</td><td>{@link GL11C#GL_UNPACK_SKIP_PIXELS UNPACK_SKIP_PIXELS}</td><td>{@link GL11C#GL_UNPACK_ALIGNMENT UNPACK_ALIGNMENT}</td></tr><tr><td>{@link GL12#GL_UNPACK_IMAGE_HEIGHT UNPACK_IMAGE_HEIGHT}</td><td>{@link GL12#GL_UNPACK_SKIP_IMAGES UNPACK_SKIP_IMAGES}</td><td>{@link GL42#GL_UNPACK_COMPRESSED_BLOCK_WIDTH UNPACK_COMPRESSED_BLOCK_WIDTH}</td></tr><tr><td>{@link GL42#GL_UNPACK_COMPRESSED_BLOCK_HEIGHT UNPACK_COMPRESSED_BLOCK_HEIGHT}</td><td>{@link GL42#GL_UNPACK_COMPRESSED_BLOCK_DEPTH UNPACK_COMPRESSED_BLOCK_DEPTH}</td><td>{@link GL42#GL_UNPACK_COMPRESSED_BLOCK_SIZE UNPACK_COMPRESSED_BLOCK_SIZE}</td></tr></table>@param param the parameter value@see <a href="https://docs.gl/gl4/glPixelStorei">Reference Page</a>*/
    void glPixelStorei(int pname, int param);

    /** Float version of {@link #glPixelStorei PixelStorei}.@param pname the pixel store parameter to set@param param the parameter value@see <a href="https://docs.gl/gl4/glPixelStoref">Reference Page</a>*/
    void glPixelStoref(int pname, float param);

    /** Sets the integer value of a pixel transfer parameter.@param pname the pixel transfer parameter to set. One of:<br><table><tr><td>{@link #GL_MAP_COLOR MAP_COLOR}</td><td>{@link #GL_MAP_STENCIL MAP_STENCIL}</td><td>{@link #GL_INDEX_SHIFT INDEX_SHIFT}</td><td>{@link #GL_INDEX_OFFSET INDEX_OFFSET}</td></tr><tr><td>{@link #GL_RED_SCALE RED_SCALE}</td><td>{@link #GL_GREEN_SCALE GREEN_SCALE}</td><td>{@link #GL_BLUE_SCALE BLUE_SCALE}</td><td>{@link #GL_ALPHA_SCALE ALPHA_SCALE}</td></tr><tr><td>{@link #GL_DEPTH_SCALE DEPTH_SCALE}</td><td>{@link #GL_RED_BIAS RED_BIAS}</td><td>{@link #GL_GREEN_BIAS GREEN_BIAS}</td><td>{@link #GL_BLUE_BIAS BLUE_BIAS}</td></tr><tr><td>{@link #GL_ALPHA_BIAS ALPHA_BIAS}</td><td>{@link #GL_DEPTH_BIAS DEPTH_BIAS}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_RED_SCALE POST_CONVOLUTION_RED_SCALE}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_RED_BIAS POST_CONVOLUTION_RED_BIAS}</td></tr><tr><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_RED_SCALE POST_COLOR_MATRIX_RED_SCALE}</td><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_RED_BIAS POST_COLOR_MATRIX_RED_BIAS}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_GREEN_SCALE POST_CONVOLUTION_GREEN_SCALE}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_GREEN_BIAS POST_CONVOLUTION_GREEN_BIAS}</td></tr><tr><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_GREEN_SCALE POST_COLOR_MATRIX_GREEN_SCALE}</td><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_GREEN_BIAS POST_COLOR_MATRIX_GREEN_BIAS}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_BLUE_SCALE POST_CONVOLUTION_BLUE_SCALE}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_BLUE_BIAS POST_CONVOLUTION_BLUE_BIAS}</td></tr><tr><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_BLUE_SCALE POST_COLOR_MATRIX_BLUE_SCALE}</td><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_BLUE_BIAS POST_COLOR_MATRIX_BLUE_BIAS}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_ALPHA_SCALE POST_CONVOLUTION_ALPHA_SCALE}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_ALPHA_BIAS POST_CONVOLUTION_ALPHA_BIAS}</td></tr><tr><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_ALPHA_SCALE POST_COLOR_MATRIX_ALPHA_SCALE}</td><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_ALPHA_BIAS POST_COLOR_MATRIX_ALPHA_BIAS}</td></tr></table>@param param the parameter value@see <a href="https://docs.gl/gl3/glPixelTransferi">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPixelTransferi(int pname, int param);

    /** Float version of {@link #glPixelTransferi PixelTransferi}.@param pname the pixel transfer parameter to set@param param the parameter value@see <a href="https://docs.gl/gl3/glPixelTransferf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPixelTransferf(int pname, float param);

    /** Controls the conversion of a group of fragments. <p>Let (x<sub>rp</sub>, y<sub>rp</sub>) be the current raster position. If a particular group is the n<sup>th</sup> in a row and belongs to the m<sup>th</sup> row, consider the region in window coordinates bounded by the rectangle with corners</p> <p>(x<sub>rp</sub> + z<sub>x</sub>n, y<sub>rp</sub> + z<sub>y</sub>m) and (x<sub>rp</sub> + z<sub>x</sub>(n + 1), y<sub>rp</sub> + z<sub>y</sub>(m + 1))</p> <p>(either z<sub>x</sub> or z<sub>y</sub> may be negative). A fragment representing group {@code (n, m)} is produced for each framebuffer pixel inside, or on the bottom or left boundary, of this rectangle.</p>@param xfactor the z<sub>x</sub> factor@param yfactor the z<sub>y</sub> factor@see <a href="https://docs.gl/gl3/glPixelZoom">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPixelZoom(float xfactor, float yfactor);

    /** Controls the rasterization of points if no vertex, tessellation control, tessellation evaluation, or geometry shader is active. The default point size is 1.0.@param size the request size of a point@see <a href="https://docs.gl/gl4/glPointSize">Reference Page</a>*/
    void glPointSize(float size);

    /** Controls the interpretation of polygons for rasterization. <p>{@link GL11C#GL_FILL FILL} is the default mode of polygon rasterization. Note that these modes affect only the final rasterization of polygons: in particular, a polygon's vertices are lit, and the polygon is clipped and possibly culled before these modes are applied. Polygon antialiasing applies only to the {@link GL11C#GL_FILL FILL} state of PolygonMode. For {@link GL11C#GL_POINT POINT} or {@link GL11C#GL_LINE LINE}, point antialiasing or line segment antialiasing, respectively, apply.</p>@param face the face for which to set the rasterizing method. One of:<br><table><tr><td>{@link GL11C#GL_FRONT FRONT}</td><td>{@link GL11C#GL_BACK BACK}</td><td>{@link GL11C#GL_FRONT_AND_BACK FRONT_AND_BACK}</td></tr></table>@param mode the rasterization mode. One of:<br><table><tr><td>{@link GL11C#GL_POINT POINT}</td><td>{@link GL11C#GL_LINE LINE}</td><td>{@link GL11C#GL_FILL FILL}</td></tr></table>@see <a href="https://docs.gl/gl4/glPolygonMode">Reference Page</a>*/
    void glPolygonMode(int face, int mode);

    /** The depth values of all fragments generated by the rasterization of a polygon may be offset by a single value that is computed for that polygon. This function determines that value. <p>{@code factor} scales the maximum depth slope of the polygon, and {@code units} scales an implementation-dependent constant that relates to the usable resolution of the depth buffer. The resulting values are summed to produce the polygon offset value.</p>@param factor the maximum depth slope factor@param units the constant scale@see <a href="https://docs.gl/gl4/glPolygonOffset">Reference Page</a>*/
    void glPolygonOffset(float factor, float units);

    /** Defines a polygon stipple. It works much the same way as {@link #glLineStipple LineStipple}, masking out certain fragments produced by rasterization so that they are not sent to the next stage of the GL. This is the case regardless of the state of polygon antialiasing. <p>If x<sub>w</sub> and y<sub>w</sub> are the window coordinates of a rasterized polygon fragment, then that fragment is sent to the next stage of the GL if and only if the bit of the pattern (x<sub>w</sub> mod 32, y<sub>w</sub> mod 32) is 1.</p> <p>Polygon stippling may be enabled or disabled with {@link #glEnable Enable} or {@link #glDisable Disable} using the constant {@link #GL_POLYGON_STIPPLE POLYGON_STIPPLE}. When disabled, it is as if the stipple pattern were all ones.</p>@param pattern a pointer to memory into which a 32 &times; 32 pattern is packed@see <a href="https://docs.gl/gl3/glPolygonStipple">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPolygonStipple(ByteBuffer pattern);

    /** Defines a polygon stipple. It works much the same way as {@link #glLineStipple LineStipple}, masking out certain fragments produced by rasterization so that they are not sent to the next stage of the GL. This is the case regardless of the state of polygon antialiasing. <p>If x<sub>w</sub> and y<sub>w</sub> are the window coordinates of a rasterized polygon fragment, then that fragment is sent to the next stage of the GL if and only if the bit of the pattern (x<sub>w</sub> mod 32, y<sub>w</sub> mod 32) is 1.</p> <p>Polygon stippling may be enabled or disabled with {@link #glEnable Enable} or {@link #glDisable Disable} using the constant {@link #GL_POLYGON_STIPPLE POLYGON_STIPPLE}. When disabled, it is as if the stipple pattern were all ones.</p>@param pattern a pointer to memory into which a 32 &times; 32 pattern is packed@see <a href="https://docs.gl/gl3/glPolygonStipple">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPolygonStipple(long pattern);

    /** Takes a bitwise OR of symbolic constants indicating which groups of state variables to push onto the server attribute stack. Each constant refers to a group of state variables. <p>Bits set in mask that do not correspond to an attribute group are ignored. The special mask value {@link #GL_ALL_ATTRIB_BITS ALL_ATTRIB_BITS} may be used to push all stackable server state.</p> <p>A {@link #GL_STACK_OVERFLOW STACK_OVERFLOW} error is generated if {@code PushAttrib} is called and the attribute stack depth is equal to the value of {@link #GL_MAX_ATTRIB_STACK_DEPTH MAX_ATTRIB_STACK_DEPTH}.</p>@param mask the state variables to push. One or more of:<br><table><tr><td>{@link #GL_ACCUM_BUFFER_BIT ACCUM_BUFFER_BIT}</td><td>{@link #GL_COLOR_BUFFER_BIT COLOR_BUFFER_BIT}</td><td>{@link #GL_CURRENT_BIT CURRENT_BIT}</td><td>{@link #GL_DEPTH_BUFFER_BIT DEPTH_BUFFER_BIT}</td><td>{@link #GL_ENABLE_BIT ENABLE_BIT}</td><td>{@link #GL_EVAL_BIT EVAL_BIT}</td></tr><tr><td>{@link #GL_FOG_BIT FOG_BIT}</td><td>{@link #GL_HINT_BIT HINT_BIT}</td><td>{@link #GL_LIGHTING_BIT LIGHTING_BIT}</td><td>{@link #GL_LINE_BIT LINE_BIT}</td><td>{@link #GL_LIST_BIT LIST_BIT}</td><td>{@link GL13#GL_MULTISAMPLE_BIT MULTISAMPLE_BIT}</td></tr><tr><td>{@link #GL_PIXEL_MODE_BIT PIXEL_MODE_BIT}</td><td>{@link #GL_POINT_BIT POINT_BIT}</td><td>{@link #GL_POLYGON_BIT POLYGON_BIT}</td><td>{@link #GL_POLYGON_STIPPLE_BIT POLYGON_STIPPLE_BIT}</td><td>{@link #GL_SCISSOR_BIT SCISSOR_BIT}</td><td>{@link #GL_STENCIL_BUFFER_BIT STENCIL_BUFFER_BIT}</td></tr><tr><td>{@link #GL_TEXTURE_BIT TEXTURE_BIT}</td><td>{@link #GL_TRANSFORM_BIT TRANSFORM_BIT}</td><td>{@link #GL_VIEWPORT_BIT VIEWPORT_BIT}</td><td>{@link #GL_ALL_ATTRIB_BITS ALL_ATTRIB_BITS}</td></tr></table>@see <a href="https://docs.gl/gl3/glPushAttrib">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPushAttrib(int mask);

    /** Takes a bitwise OR of symbolic constants indicating which groups of state variables to push onto the client attribute stack. Each constant refers to a group of state variables. <p>Bits set in mask that do not correspond to an attribute group are ignored. The special mask value {@link #GL_CLIENT_ALL_ATTRIB_BITS CLIENT_ALL_ATTRIB_BITS} may be used to push all stackable client state.</p> <p>A {@link #GL_STACK_OVERFLOW STACK_OVERFLOW} error is generated if {@code PushAttrib} is called and the client attribute stack depth is equal to the value of {@link #GL_MAX_CLIENT_ATTRIB_STACK_DEPTH MAX_CLIENT_ATTRIB_STACK_DEPTH}.</p>@param mask the state variables to push. One or more of:<br><table><tr><td>{@link #GL_CLIENT_VERTEX_ARRAY_BIT CLIENT_VERTEX_ARRAY_BIT}</td><td>{@link #GL_CLIENT_PIXEL_STORE_BIT CLIENT_PIXEL_STORE_BIT}</td><td>{@link #GL_CLIENT_ALL_ATTRIB_BITS CLIENT_ALL_ATTRIB_BITS}</td></tr></table>@see <a href="https://docs.gl/gl3/glPushClientAttrib">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPushClientAttrib(int mask);

    /** Resets the values of those state variables that were saved with the last {@link #glPushAttrib PushAttrib}. Those not saved remain unchanged.@see <a href="https://docs.gl/gl3/glPopAttrib">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPopAttrib();

    /** Resets the values of those state variables that were saved with the last {@link #glPushClientAttrib PushClientAttrib}. Those not saved remain unchanged.@see <a href="https://docs.gl/gl3/glPopClientAttrib">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPopClientAttrib();

    /** Pops the top entry off the current matrix stack, replacing the current matrix with the matrix that was the second entry in the stack.@see <a href="https://docs.gl/gl3/glPopMatrix">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPopMatrix();

    /** Pops one name off the top of the selection name stack.@see <a href="https://docs.gl/gl3/glPopName">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPopName();

    /** Sets the priority of texture objects. Each priority value is clamped to the range [0, 1] before it is assigned. Zero indicates the lowest priority, with the least likelihood of being resident. One indicates the highest priority, with the greatest likelihood of being resident.@param textures an array of texture object names@param priorities an array of texture object priorities@see <a href="https://docs.gl/gl3/glPrioritizeTextures">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPrioritizeTextures(IntBuffer textures, FloatBuffer priorities);

    /** Pushes the current matrix stack down by one, duplicating the current matrix in both the top of the stack and the entry below it.@see <a href="https://docs.gl/gl3/glPushMatrix">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPushMatrix();

    /** Causes {@code name} to be pushed onto the selection name stack.@param name the name to push@see <a href="https://docs.gl/gl3/glPushName">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPushName(int name);

    /** Sets the two-dimensional current raster position. {@code z} is implicitly set to 0 and {@code w} implicitly set to 1. <p>The coordinates are treated as if they were specified in a Vertex command. If a vertex shader is active, this vertex shader is executed using the x, y, z, and w coordinates as the object coordinates of the vertex. Otherwise, the x, y, z, and w coordinates are transformed by the current model-view and projection matrices. These coordinates, along with current values, are used to generate primary and secondary colors and texture coordinates just as is done for a vertex. The colors and texture coordinates so produced replace the colors and texture coordinates stored in the current raster position's associated data.</p>@param x the {@code x} raster coordinate@param y the {@code y} raster coordinate@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos2i(int x, int y);

    /** Short version of {@link #glRasterPos2i RasterPos2i}.@param x the {@code x} raster coordinate@param y the {@code y} raster coordinate@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos2s(short x, short y);

    /** Float version of {@link #glRasterPos2i RasterPos2i}.@param x the {@code x} raster coordinate@param y the {@code y} raster coordinate@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos2f(float x, float y);

    /** Double version of {@link #glRasterPos2i RasterPos2i}.@param x the {@code x} raster coordinate@param y the {@code y} raster coordinate@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos2d(double x, double y);

    /** Pointer version of {@link #glRasterPos2i RasterPos2i}.@param coords the raster position buffer@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos2iv(IntBuffer coords);

    /** Pointer version of {@link #glRasterPos2s RasterPos2s}.@param coords the raster position buffer@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos2sv(ShortBuffer coords);

    /** Pointer version of {@link #glRasterPos2f RasterPos2f}.@param coords the raster position buffer@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos2fv(FloatBuffer coords);

    /** Pointer version of {@link #glRasterPos2d RasterPos2d}.@param coords the raster position buffer@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos2dv(DoubleBuffer coords);

    /** Sets the three-dimensional current raster position. {@code w} is implicitly set to 1. See {@link #glRasterPos2i RasterPos2i} for more details.@param x the {@code x} raster coordinate@param y the {@code y} raster coordinate@param z the {@code z} raster coordinate@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos3i(int x, int y, int z);

    /** Short version of {@link #glRasterPos3i RasterPos3i}.@param x the {@code x} raster coordinate@param y the {@code y} raster coordinate@param z the {@code z} raster coordinate@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos3s(short x, short y, short z);

    /** Float version of {@link #glRasterPos3i RasterPos3i}.@param x the {@code x} raster coordinate@param y the {@code y} raster coordinate@param z the {@code z} raster coordinate@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos3f(float x, float y, float z);

    /** Double version of {@link #glRasterPos3i RasterPos3i}.@param x the {@code x} raster coordinate@param y the {@code y} raster coordinate@param z the {@code z} raster coordinate@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos3d(double x, double y, double z);

    /** Pointer version of {@link #glRasterPos3i RasterPos3i}.@param coords the raster position buffer@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos3iv(IntBuffer coords);

    /** Pointer version of {@link #glRasterPos3s RasterPos3s}.@param coords the raster position buffer@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos3sv(ShortBuffer coords);

    /** Pointer version of {@link #glRasterPos3f RasterPos3f}.@param coords the raster position buffer@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos3fv(FloatBuffer coords);

    /** Pointer version of {@link #glRasterPos3d RasterPos3d}.@param coords the raster position buffer@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos3dv(DoubleBuffer coords);

    /** Sets the four-dimensional current raster position. See {@link #glRasterPos2i RasterPos2i} for more details.@param x the {@code x} raster coordinate@param y the {@code y} raster coordinate@param z the {@code z} raster coordinate@param w the {@code w} raster coordinate@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos4i(int x, int y, int z, int w);

    /** Short version of {@link #glRasterPos4i RasterPos4i}.@param x the {@code x} raster coordinate@param y the {@code y} raster coordinate@param z the {@code z} raster coordinate@param w the {@code w} raster coordinate@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos4s(short x, short y, short z, short w);

    /** Float version of RasterPos4i.@param x the {@code x} raster coordinate@param y the {@code y} raster coordinate@param z the {@code z} raster coordinate@param w the {@code w} raster coordinate@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos4f(float x, float y, float z, float w);

    /** Double version of {@link #glRasterPos4i RasterPos4i}.@param x the {@code x} raster coordinate@param y the {@code y} raster coordinate@param z the {@code z} raster coordinate@param w the {@code w} raster coordinate@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos4d(double x, double y, double z, double w);

    /** Pointer version of {@link #glRasterPos4i RasterPos4i}.@param coords the raster position buffer@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos4iv(IntBuffer coords);

    /** Pointer version of {@link #glRasterPos4s RasterPos4s}.@param coords the raster position buffer@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos4sv(ShortBuffer coords);

    /** Pointer version of {@link #glRasterPos4f RasterPos4f}.@param coords the raster position buffer@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos4fv(FloatBuffer coords);

    /** Pointer version of {@link #glRasterPos4d RasterPos4d}.@param coords the raster position buffer@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos4dv(DoubleBuffer coords);

    /** Defines the color buffer from which values are obtained. <p>Acceptable values for {@code src} depend on whether the GL is using the default framebuffer (i.e., {@link GL30#GL_DRAW_FRAMEBUFFER_BINDING DRAW_FRAMEBUFFER_BINDING} is zero), or a framebuffer object (i.e., {@link GL30#GL_DRAW_FRAMEBUFFER_BINDING DRAW_FRAMEBUFFER_BINDING} is non-zero). In the initial state, the GL is bound to the default framebuffer.</p>@param src the color buffer to read from. One of:<br><table><tr><td>{@link GL11C#GL_NONE NONE}</td><td>{@link GL11C#GL_FRONT_LEFT FRONT_LEFT}</td><td>{@link GL11C#GL_FRONT_RIGHT FRONT_RIGHT}</td><td>{@link GL11C#GL_BACK_LEFT BACK_LEFT}</td><td>{@link GL11C#GL_BACK_RIGHT BACK_RIGHT}</td><td>{@link GL11C#GL_FRONT FRONT}</td><td>{@link GL11C#GL_BACK BACK}</td><td>{@link GL11C#GL_LEFT LEFT}</td></tr><tr><td>{@link GL11C#GL_RIGHT RIGHT}</td><td>{@link GL11C#GL_FRONT_AND_BACK FRONT_AND_BACK}</td><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>GL30.GL_COLOR_ATTACHMENT[1-15]</td></tr></table>@see <a href="https://docs.gl/gl4/glReadBuffer">Reference Page</a>*/
    void glReadBuffer(int src);

    /** ReadPixels obtains values from the selected read buffer from each pixel with lower left hand corner at {@code (x + i, y + j)} for {@code 0 <= i < width} and {@code 0 <= j < height}; this pixel is said to be the i<sup>th</sup> pixel in the j<sup>th</sup> row. If any of these pixels lies outside of the window allocated to the current GL context, or outside of the image attached to the currently bound read framebuffer object, then the values obtained for those pixels are undefined. When {@link GL30#GL_READ_FRAMEBUFFER_BINDING READ_FRAMEBUFFER_BINDING} is zero, values are also undefined for individual pixels that are not owned by the current context. Otherwise, {@code ReadPixels} obtains values from the selected buffer, regardless of how those values were placed there.@param x the left pixel coordinate@param y the lower pixel coordinate@param width the number of pixels to read in the x-dimension@param height the number of pixels to read in the y-dimension@param format the pixel format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels a buffer in which to place the returned pixel data@see <a href="https://docs.gl/gl4/glReadPixels">Reference Page</a>*/
    void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels);

    /** ReadPixels obtains values from the selected read buffer from each pixel with lower left hand corner at {@code (x + i, y + j)} for {@code 0 <= i < width} and {@code 0 <= j < height}; this pixel is said to be the i<sup>th</sup> pixel in the j<sup>th</sup> row. If any of these pixels lies outside of the window allocated to the current GL context, or outside of the image attached to the currently bound read framebuffer object, then the values obtained for those pixels are undefined. When {@link GL30#GL_READ_FRAMEBUFFER_BINDING READ_FRAMEBUFFER_BINDING} is zero, values are also undefined for individual pixels that are not owned by the current context. Otherwise, {@code ReadPixels} obtains values from the selected buffer, regardless of how those values were placed there.@param x the left pixel coordinate@param y the lower pixel coordinate@param width the number of pixels to read in the x-dimension@param height the number of pixels to read in the y-dimension@param format the pixel format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels a buffer in which to place the returned pixel data@see <a href="https://docs.gl/gl4/glReadPixels">Reference Page</a>*/
    void glReadPixels(int x, int y, int width, int height, int format, int type, long pixels);

    /** ReadPixels obtains values from the selected read buffer from each pixel with lower left hand corner at {@code (x + i, y + j)} for {@code 0 <= i < width} and {@code 0 <= j < height}; this pixel is said to be the i<sup>th</sup> pixel in the j<sup>th</sup> row. If any of these pixels lies outside of the window allocated to the current GL context, or outside of the image attached to the currently bound read framebuffer object, then the values obtained for those pixels are undefined. When {@link GL30#GL_READ_FRAMEBUFFER_BINDING READ_FRAMEBUFFER_BINDING} is zero, values are also undefined for individual pixels that are not owned by the current context. Otherwise, {@code ReadPixels} obtains values from the selected buffer, regardless of how those values were placed there.@param x the left pixel coordinate@param y the lower pixel coordinate@param width the number of pixels to read in the x-dimension@param height the number of pixels to read in the y-dimension@param format the pixel format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels a buffer in which to place the returned pixel data@see <a href="https://docs.gl/gl4/glReadPixels">Reference Page</a>*/
    void glReadPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels);

    /** ReadPixels obtains values from the selected read buffer from each pixel with lower left hand corner at {@code (x + i, y + j)} for {@code 0 <= i < width} and {@code 0 <= j < height}; this pixel is said to be the i<sup>th</sup> pixel in the j<sup>th</sup> row. If any of these pixels lies outside of the window allocated to the current GL context, or outside of the image attached to the currently bound read framebuffer object, then the values obtained for those pixels are undefined. When {@link GL30#GL_READ_FRAMEBUFFER_BINDING READ_FRAMEBUFFER_BINDING} is zero, values are also undefined for individual pixels that are not owned by the current context. Otherwise, {@code ReadPixels} obtains values from the selected buffer, regardless of how those values were placed there.@param x the left pixel coordinate@param y the lower pixel coordinate@param width the number of pixels to read in the x-dimension@param height the number of pixels to read in the y-dimension@param format the pixel format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels a buffer in which to place the returned pixel data@see <a href="https://docs.gl/gl4/glReadPixels">Reference Page</a>*/
    void glReadPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels);

    /** ReadPixels obtains values from the selected read buffer from each pixel with lower left hand corner at {@code (x + i, y + j)} for {@code 0 <= i < width} and {@code 0 <= j < height}; this pixel is said to be the i<sup>th</sup> pixel in the j<sup>th</sup> row. If any of these pixels lies outside of the window allocated to the current GL context, or outside of the image attached to the currently bound read framebuffer object, then the values obtained for those pixels are undefined. When {@link GL30#GL_READ_FRAMEBUFFER_BINDING READ_FRAMEBUFFER_BINDING} is zero, values are also undefined for individual pixels that are not owned by the current context. Otherwise, {@code ReadPixels} obtains values from the selected buffer, regardless of how those values were placed there.@param x the left pixel coordinate@param y the lower pixel coordinate@param width the number of pixels to read in the x-dimension@param height the number of pixels to read in the y-dimension@param format the pixel format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels a buffer in which to place the returned pixel data@see <a href="https://docs.gl/gl4/glReadPixels">Reference Page</a>*/
    void glReadPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels);

    /** Specifies a rectangle as two corner vertices. The effect of the Rect command <p>{@code Rect(x1, y1, x2, y2);}</p> <p>is exactly the same as the following sequence of commands: {@code Begin(POLYGON); Vertex2(x1, y1); Vertex2(x2, y1); Vertex2(x2, y2); Vertex2(x1, y2); End();}</p> <p>The appropriate Vertex2 command would be invoked depending on which of the Rect commands is issued.</p>@param x1 the x coordinate of the first corner vertex@param y1 the y coordinate of the first corner vertex@param x2 the x coordinate of the second corner vertex@param y2 the y coordinate of the second corner vertex@see <a href="https://docs.gl/gl3/glRecti">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRecti(int x1, int y1, int x2, int y2);

    /** Short version of {@link #glRecti Recti}.@param x1 the x coordinate of the first corner vertex@param y1 the y coordinate of the first corner vertex@param x2 the x coordinate of the second corner vertex@param y2 the y coordinate of the second corner vertex@see <a href="https://docs.gl/gl3/glRects">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRects(short x1, short y1, short x2, short y2);

    /** Float version of {@link #glRecti Recti}.@param x1 the x coordinate of the first corner vertex@param y1 the y coordinate of the first corner vertex@param x2 the x coordinate of the second corner vertex@param y2 the y coordinate of the second corner vertex@see <a href="https://docs.gl/gl3/glRectf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRectf(float x1, float y1, float x2, float y2);

    /** Double version of {@link #glRecti Recti}.@param x1 the x coordinate of the first corner vertex@param y1 the y coordinate of the first corner vertex@param x2 the x coordinate of the second corner vertex@param y2 the y coordinate of the second corner vertex@see <a href="https://docs.gl/gl3/glRectd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRectd(double x1, double y1, double x2, double y2);

    /** Pointer version of {@link #glRecti Recti}.@param v1 the first vertex buffer@param v2 the second vertex buffer@see <a href="https://docs.gl/gl3/glRect">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRectiv(IntBuffer v1, IntBuffer v2);

    /** Pointer version of {@link #glRects Rects}.@param v1 the first vertex buffer@param v2 the second vertex buffer@see <a href="https://docs.gl/gl3/glRect">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRectsv(ShortBuffer v1, ShortBuffer v2);

    /** Pointer version of {@link #glRectf Rectf}.@param v1 the first vertex buffer@param v2 the second vertex buffer@see <a href="https://docs.gl/gl3/glRect">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRectfv(FloatBuffer v1, FloatBuffer v2);

    /** Pointer version of {@link #glRectd Rectd}.@param v1 the first vertex buffer@param v2 the second vertex buffer@see <a href="https://docs.gl/gl3/glRect">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRectdv(DoubleBuffer v1, DoubleBuffer v2);

    /** Sets the current render mode. The default is {@link #GL_RENDER RENDER}.@param mode the render mode. One of:<br><table><tr><td>{@link #GL_RENDER RENDER}</td><td>{@link #GL_SELECT SELECT}</td><td>{@link #GL_FEEDBACK FEEDBACK}</td></tr></table>@see <a href="https://docs.gl/gl3/glRenderMode">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    int glRenderMode(int mode);

    /** Manipulates the current matrix with a rotation matrix. <p>{@code angle} gives an angle of rotation in degrees; the coordinates of a vector _2 are given by <code>_2 = (x y z)<sup>T</sup></code>. The computed matrix is a counter-clockwise rotation about the line through the origin with the specified axis when that axis is pointing up (i.e. the right-hand rule determines the sense of the rotation angle). The matrix is thus</p> <table class=striped> <tr><td colspan=3 rowspan=3><b>R</b></td><td>0</td></tr> <tr><td>0</td></tr> <tr><td>0</td></tr> <tr><td>0</td><td>0</td><td>0</td><td>1</td></tr> </table> <p>Let <code>u = _2 / ||_2|| = (x' y' z')<sup>T</sup></code>. If <b>S</b> =</p> <table class=striped> <tr><td>0</td><td>-z'</td><td>y'</td></tr> <tr><td>z'</td><td>0</td><td>-x'</td></tr> <tr><td>-y'</td><td>x'</td><td>0</td></tr> </table> <p>then <code><b>R</b> = uu<sup>T</sup> + cos(angle)(I - uu<sup>T</sup>) + sin(angle)<b>S</b></code></p>@param angle the angle of rotation in degrees@param x the x coordinate of the rotation vector@param y the y coordinate of the rotation vector@param z the z coordinate of the rotation vector@see <a href="https://docs.gl/gl3/glRotatef">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRotatef(float angle, float x, float y, float z);

    /** Double version of {@link #glRotatef Rotatef}.@param angle the angle of rotation in degrees@param x the x coordinate of the rotation vector@param y the y coordinate of the rotation vector@param z the z coordinate of the rotation vector@see <a href="https://docs.gl/gl3/glRotated">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRotated(double angle, double x, double y, double z);

    /** Manipulates the current matrix with a general scaling matrix along the x-, y- and z- axes. <p>Calling this function is equivalent to calling {@link #glMultMatrixf MultMatrixf} with the following matrix:</p> <table class=striped> <tr><td>x</td><td>0</td><td>0</td><td>0</td></tr> <tr><td>0</td><td>y</td><td>0</td><td>0</td></tr> <tr><td>0</td><td>0</td><td>z</td><td>0</td></tr> <tr><td>0</td><td>0</td><td>0</td><td>1</td></tr> </table>@param x the x-axis scaling factor@param y the y-axis scaling factor@param z the z-axis scaling factor@see <a href="https://docs.gl/gl3/glScalef">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glScalef(float x, float y, float z);

    /** Double version of {@link #glScalef Scalef}.@param x the x-axis scaling factor@param y the y-axis scaling factor@param z the z-axis scaling factor@see <a href="https://docs.gl/gl3/glScaled">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glScaled(double x, double y, double z);

    /** Defines the scissor rectangle for all viewports. The scissor test is enabled or disabled for all viewports using {@link #glEnable Enable} or {@link #glDisable Disable} with the symbolic constant {@link GL11C#GL_SCISSOR_TEST SCISSOR_TEST}. When disabled, it is as if the scissor test always passes. When enabled, if <code>left &le; x<sub>w</sub> &lt; left + width</code> and <code>bottom &le; y<sub>w</sub> &lt; bottom + height</code> for the scissor rectangle, then the scissor test passes. Otherwise, the test fails and the fragment is discarded.@param x the left scissor rectangle coordinate@param y the bottom scissor rectangle coordinate@param width the scissor rectangle width@param height the scissor rectangle height@see <a href="https://docs.gl/gl4/glScissor">Reference Page</a>*/
    void glScissor(int x, int y, int width, int height);

    /** Sets the selection array.@param buffer an array of unsigned integers to be potentially filled names@see <a href="https://docs.gl/gl3/glSelectBuffer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSelectBuffer(IntBuffer buffer);

    /** Sets the current shade mode. The initial value of the shade mode is {@link #GL_SMOOTH SMOOTH}. <p>If mode is {@link #GL_SMOOTH SMOOTH}, vertex colors are treated individually. If mode is {@link #GL_FLAT FLAT}, flatshading is enabled and colors are taken from the provoking vertex of the primitive. The colors selected are those derived from current values, generated by lighting, or generated by vertex shading, if lighting is disabled, enabled, or a vertex shader is in use, respectively.</p>@param mode the shade mode. One of:<br><table><tr><td>{@link #GL_SMOOTH SMOOTH}</td><td>{@link #GL_FLAT FLAT}</td></tr></table>@see <a href="https://docs.gl/gl3/glShadeModel">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glShadeModel(int mode);

    /** Controls the stencil test. <p>{@code ref} is an integer reference value that is used in the unsigned stencil comparison. Stencil comparison operations and queries of {@code ref} clamp its value to the range [0, 2<sup>s</sup> &ndash; 1], where s is the number of bits in the stencil buffer attached to the draw framebuffer. The s least significant bits of {@code mask} are bitwise ANDed with both the reference and the stored stencil value, and the resulting masked values are those that participate in the comparison controlled by {@code func}.</p>@param func the stencil comparison function. One of:<br><table><tr><td>{@link GL11C#GL_NEVER NEVER}</td><td>{@link GL11C#GL_ALWAYS ALWAYS}</td><td>{@link GL11C#GL_LESS LESS}</td><td>{@link GL11C#GL_LEQUAL LEQUAL}</td><td>{@link GL11C#GL_EQUAL EQUAL}</td><td>{@link GL11C#GL_GEQUAL GEQUAL}</td><td>{@link GL11C#GL_GREATER GREATER}</td><td>{@link GL11C#GL_NOTEQUAL NOTEQUAL}</td></tr></table>@param ref the reference value@param mask the stencil comparison mask@see <a href="https://docs.gl/gl4/glStencilFunc">Reference Page</a>*/
    void glStencilFunc(int func, int ref, int mask);

    /** Masks the writing of particular bits into the stencil plans. <p>The least significant s bits of {@code mask}, where s is the number of bits in the stencil buffer, specify an integer mask. Where a 1 appears in this mask, the corresponding bit in the stencil buffer is written; where a 0 appears, the bit is not written.</p>@param mask the stencil mask@see <a href="https://docs.gl/gl4/glStencilMask">Reference Page</a>*/
    void glStencilMask(int mask);

    /** Indicates what happens to the stored stencil value if this or certain subsequent tests fail or pass. <p>The supported actions are {@link GL11C#GL_KEEP KEEP}, {@link GL11C#GL_ZERO ZERO}, {@link GL11C#GL_REPLACE REPLACE}, {@link GL11C#GL_INCR INCR}, {@link GL11C#GL_DECR DECR}, {@link GL11C#GL_INVERT INVERT}, {@link GL14#GL_INCR_WRAP INCR_WRAP} and {@link GL14#GL_DECR_WRAP DECR_WRAP}. These correspond to keeping the current value, setting to zero, replacing with the reference value, incrementing with saturation, decrementing with saturation, bitwise inverting it, incrementing without saturation, and decrementing without saturation.</p> <p>For purposes of increment and decrement, the stencil bits are considered as an unsigned integer. Incrementing or decrementing with saturation clamps the stencil value at 0 and the maximum representable value. Incrementing or decrementing without saturation will wrap such that incrementing the maximum representable value results in 0, and decrementing 0 results in the maximum representable value.</p>@param sfail the action to take if the stencil test fails@param dpfail the action to take if the depth buffer test fails@param dppass the action to take if the depth buffer test passes@see <a href="https://docs.gl/gl4/glStencilOp">Reference Page</a>*/
    void glStencilOp(int sfail, int dpfail, int dppass);

    /** Sets the current one-dimensional texture coordinate. {@code t} and {@code r} are implicitly set to 0 and {@code q} to 1.@param s the s component of the current texture coordinates@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord1f(float s);

    /** Short version of {@link #glTexCoord1f TexCoord1f}.@param s the s component of the current texture coordinates@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord1s(short s);

    /** Integer version of {@link #glTexCoord1f TexCoord1f}.@param s the s component of the current texture coordinates@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord1i(int s);

    /** Double version of {@link #glTexCoord1f TexCoord1f}.@param s the s component of the current texture coordinates@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord1d(double s);

    /** Pointer version of {@link #glTexCoord1f TexCoord1f}.@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord1fv(FloatBuffer v);

    /** Pointer version of {@link #glTexCoord1s TexCoord1s}.@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord1sv(ShortBuffer v);

    /** Pointer version of {@link #glTexCoord1i TexCoord1i}.@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord1iv(IntBuffer v);

    /** Pointer version of {@link #glTexCoord1d TexCoord1d}.@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord1dv(DoubleBuffer v);

    /** Sets the current two-dimensional texture coordinate. {@code r} is implicitly set to 0 and {@code q} to 1.@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord2f(float s, float t);

    /** Short version of {@link #glTexCoord2f TexCoord2f}.@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord2s(short s, short t);

    /** Integer version of {@link #glTexCoord2f TexCoord2f}.@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord2i(int s, int t);

    /** Double version of {@link #glTexCoord2f TexCoord2f}.@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord2d(double s, double t);

    /** Pointer version of {@link #glTexCoord2f TexCoord2f}.@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord2fv(FloatBuffer v);

    /** Pointer version of {@link #glTexCoord2s TexCoord2s}.@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord2sv(ShortBuffer v);

    /** Pointer version of {@link #glTexCoord2i TexCoord2i}.@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord2iv(IntBuffer v);

    /** Pointer version of {@link #glTexCoord2d TexCoord2d}.@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord2dv(DoubleBuffer v);

    /** Sets the current three-dimensional texture coordinate. {@code q} is implicitly set to 1.@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@param r the r component of the current texture coordinates@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord3f(float s, float t, float r);

    /** Short version of {@link #glTexCoord3f TexCoord3f}.@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@param r the r component of the current texture coordinates@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord3s(short s, short t, short r);

    /** Integer version of {@link #glTexCoord3f TexCoord3f}.@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@param r the r component of the current texture coordinates@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord3i(int s, int t, int r);

    /** Double version of {@link #glTexCoord3f TexCoord3f}.@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@param r the r component of the current texture coordinates@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord3d(double s, double t, double r);

    /** Pointer version of {@link #glTexCoord3f TexCoord3f}.@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord3fv(FloatBuffer v);

    /** Pointer version of {@link #glTexCoord3s TexCoord3s}.@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord3sv(ShortBuffer v);

    /** Pointer version of {@link #glTexCoord3i TexCoord3i}.@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord3iv(IntBuffer v);

    /** Pointer version of {@link #glTexCoord3d TexCoord3d}.@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord3dv(DoubleBuffer v);

    /** Sets the current four-dimensional texture coordinate.@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@param r the r component of the current texture coordinates@param q the q component of the current texture coordinates@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord4f(float s, float t, float r, float q);

    /** Short version of {@link #glTexCoord4f TexCoord4f}.@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@param r the r component of the current texture coordinates@param q the q component of the current texture coordinates@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord4s(short s, short t, short r, short q);

    /** Integer version of {@link #glTexCoord4f TexCoord4f}.@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@param r the r component of the current texture coordinates@param q the q component of the current texture coordinates@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord4i(int s, int t, int r, int q);

    /** Double version of {@link #glTexCoord4f TexCoord4f}.@param s the s component of the current texture coordinates@param t the t component of the current texture coordinates@param r the r component of the current texture coordinates@param q the q component of the current texture coordinates@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord4d(double s, double t, double r, double q);

    /** Pointer version of {@link #glTexCoord4f TexCoord4f}.@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord4fv(FloatBuffer v);

    /** Pointer version of {@link #glTexCoord4s TexCoord4s}.@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord4sv(ShortBuffer v);

    /** Pointer version of {@link #glTexCoord4i TexCoord4i}.@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord4iv(IntBuffer v);

    /** Pointer version of {@link #glTexCoord4d TexCoord4d}.@param _2 the texture coordinate buffer@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord4dv(DoubleBuffer v);

    /** Specifies the location and organization of a texture coordinate array.@param size the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the texture coordinate array data@see <a href="https://docs.gl/gl3/glTexCoordPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoordPointer(int size, int type, int stride, ByteBuffer pointer);

    /** Specifies the location and organization of a texture coordinate array.@param size the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the texture coordinate array data@see <a href="https://docs.gl/gl3/glTexCoordPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoordPointer(int size, int type, int stride, long pointer);

    /** Specifies the location and organization of a texture coordinate array.@param size the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the texture coordinate array data@see <a href="https://docs.gl/gl3/glTexCoordPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoordPointer(int size, int type, int stride, ShortBuffer pointer);

    /** Specifies the location and organization of a texture coordinate array.@param size the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the texture coordinate array data@see <a href="https://docs.gl/gl3/glTexCoordPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoordPointer(int size, int type, int stride, IntBuffer pointer);

    /** Specifies the location and organization of a texture coordinate array.@param size the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the texture coordinate array data@see <a href="https://docs.gl/gl3/glTexCoordPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoordPointer(int size, int type, int stride, FloatBuffer pointer);

    /** Sets parameters of the texture environment that specifies how texture values are interpreted when texturing a fragment, or sets per-texture-unit filtering parameters.@param target the texture environment target. One of:<br><table><tr><td>{@link #GL_TEXTURE_ENV TEXTURE_ENV}</td><td>{@link GL14#GL_TEXTURE_FILTER_CONTROL TEXTURE_FILTER_CONTROL}</td><td>{@link GL20#GL_POINT_SPRITE POINT_SPRITE}</td></tr></table>@param pname the parameter to set. One of:<br><table><tr><td>{@link GL20#GL_COORD_REPLACE COORD_REPLACE}</td><td>{@link #GL_TEXTURE_ENV_MODE TEXTURE_ENV_MODE}</td><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL13#GL_COMBINE_RGB COMBINE_RGB}</td><td>{@link GL13#GL_COMBINE_ALPHA COMBINE_ALPHA}</td><td>{@link GL15#GL_SRC0_RGB SRC0_RGB}</td></tr><tr><td>{@link GL15#GL_SRC1_RGB SRC1_RGB}</td><td>{@link GL15#GL_SRC2_RGB SRC2_RGB}</td><td>{@link GL15#GL_SRC0_ALPHA SRC0_ALPHA}</td><td>{@link GL15#GL_SRC1_ALPHA SRC1_ALPHA}</td><td>{@link GL15#GL_SRC2_ALPHA SRC2_ALPHA}</td><td>{@link GL13#GL_OPERAND0_RGB OPERAND0_RGB}</td></tr><tr><td>{@link GL13#GL_OPERAND1_RGB OPERAND1_RGB}</td><td>{@link GL13#GL_OPERAND2_RGB OPERAND2_RGB}</td><td>{@link GL13#GL_OPERAND0_ALPHA OPERAND0_ALPHA}</td><td>{@link GL13#GL_OPERAND1_ALPHA OPERAND1_ALPHA}</td><td>{@link GL13#GL_OPERAND2_ALPHA OPERAND2_ALPHA}</td><td>{@link GL13#GL_RGB_SCALE RGB_SCALE}</td></tr><tr><td>{@link #GL_ALPHA_SCALE ALPHA_SCALE}</td></tr></table>@param param the parameter value. Scalar value or one of:<br><table><tr><td>{@link #GL_REPLACE REPLACE}</td><td>{@link #GL_MODULATE MODULATE}</td><td>{@link #GL_DECAL DECAL}</td><td>{@link #GL_BLEND BLEND}</td><td>{@link #GL_ADD ADD}</td><td>{@link GL13#GL_COMBINE COMBINE}</td><td>{@link GL13#GL_ADD_SIGNED ADD_SIGNED}</td><td>{@link GL13#GL_INTERPOLATE INTERPOLATE}</td></tr><tr><td>{@link GL13#GL_SUBTRACT SUBTRACT}</td><td>{@link GL13#GL_DOT3_RGB DOT3_RGB}</td><td>{@link GL13#GL_DOT3_RGBA DOT3_RGBA}</td><td>{@link #GL_TEXTURE TEXTURE}</td><td>{@link GL13#GL_TEXTURE0 TEXTURE0}</td><td>GL13.GL_TEXTURE[1-31]</td><td>{@link GL13#GL_CONSTANT CONSTANT}</td><td>{@link GL13#GL_PRIMARY_COLOR PRIMARY_COLOR}</td></tr><tr><td>{@link GL13#GL_PREVIOUS PREVIOUS}</td></tr></table>@see <a href="https://docs.gl/gl3/glTexEnvi">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexEnvi(int target, int pname, int param);

    /** Pointer version of {@link #glTexEnvi TexEnvi}.@param target the texture environment target. Must be:<br><table><tr><td>{@link #GL_TEXTURE_ENV TEXTURE_ENV}</td></tr></table>@param pname the parameter to set. Must be:<br><table><tr><td>{@link #GL_TEXTURE_ENV_COLOR TEXTURE_ENV_COLOR}</td></tr></table>@param params the parameter value@see <a href="https://docs.gl/gl3/glTexEnv">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexEnviv(int target, int pname, IntBuffer params);

    /** Float version of {@link #glTexEnvi TexEnvi}.@param target the texture environment target@param pname the parameter to set@param param the parameter value@see <a href="https://docs.gl/gl3/glTexEnvf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexEnvf(int target, int pname, float param);

    /** Pointer version of {@link #glTexEnvf TexEnvf}.@param target the texture environment target. Must be:<br><table><tr><td>{@link #GL_TEXTURE_ENV TEXTURE_ENV}</td></tr></table>@param pname the parameter to set. Must be:<br><table><tr><td>{@link #GL_TEXTURE_ENV_COLOR TEXTURE_ENV_COLOR}</td></tr></table>@param params the parameter value@see <a href="https://docs.gl/gl3/glTexEnv">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexEnvfv(int target, int pname, FloatBuffer params);

    /** Sets an integer texture coordinate generation parameter. <p>A texture coordinate generation function is enabled or disabled using {@link #glEnable Enable} and {@link #glDisable Disable} with an argument of {@link #GL_TEXTURE_GEN_S TEXTURE_GEN_S}, {@link #GL_TEXTURE_GEN_T TEXTURE_GEN_T}, {@link #GL_TEXTURE_GEN_R TEXTURE_GEN_R}, or {@link #GL_TEXTURE_GEN_Q TEXTURE_GEN_Q} (each indicates the corresponding texture coordinate). When enabled, the specified texture coordinate is computed according to the current {@link #GL_EYE_LINEAR EYE_LINEAR}, {@link #GL_OBJECT_LINEAR OBJECT_LINEAR} or {@link #GL_SPHERE_MAP SPHERE_MAP} specification, depending on the current setting of {@link #GL_TEXTURE_GEN_MODE TEXTURE_GEN_MODE} for that coordinate. When disabled, subsequent vertices will take the indicated texture coordinate from the current texture coordinates.</p> <p>The initial state has the texture generation function disabled for all texture coordinates. Initially all texture generation modes are EYE_LINEAR.</p>@param coord the coordinate for which to set the parameter. One of:<br><table><tr><td>{@link #GL_S S}</td><td>{@link #GL_T T}</td><td>{@link #GL_R R}</td><td>{@link #GL_Q Q}</td></tr></table>@param pname the parameter to set. Must be:<br><table><tr><td>{@link #GL_TEXTURE_GEN_MODE TEXTURE_GEN_MODE}</td></tr></table>@param param the parameter value. One of:<br><table><tr><td>{@link #GL_OBJECT_LINEAR OBJECT_LINEAR}</td><td>{@link #GL_EYE_LINEAR EYE_LINEAR}</td><td>{@link #GL_SPHERE_MAP SPHERE_MAP}</td><td>{@link GL13#GL_REFLECTION_MAP REFLECTION_MAP}</td><td>{@link GL13#GL_NORMAL_MAP NORMAL_MAP}</td></tr></table>@see <a href="https://docs.gl/gl3/glTexGeni">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexGeni(int coord, int pname, int param);

    /** Pointer version of {@link #glTexGeni TexGeni}.@param coord the coordinate for which to set the parameter@param pname the parameter to set. One of:<br><table><tr><td>{@link #GL_OBJECT_PLANE OBJECT_PLANE}</td><td>{@link #GL_EYE_PLANE EYE_PLANE}</td></tr></table>@param params the parameter value@see <a href="https://docs.gl/gl3/glTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexGeniv(int coord, int pname, IntBuffer params);

    /** Float version of {@link #glTexGeni TexGeni}.@param coord the coordinate for which to set the parameter@param pname the parameter to set@param param the parameter value@see <a href="https://docs.gl/gl3/glTexGenf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexGenf(int coord, int pname, float param);

    /** Pointer version of {@link #glTexGenf TexGenf}.@param coord the coordinate for which to set the parameter@param pname the parameter to set. One of:<br><table><tr><td>{@link #GL_OBJECT_PLANE OBJECT_PLANE}</td><td>{@link #GL_EYE_PLANE EYE_PLANE}</td></tr></table>@param params the parameter value@see <a href="https://docs.gl/gl3/glTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexGenfv(int coord, int pname, FloatBuffer params);

    /** Double version of {@link #glTexGeni TexGeni}.@param coord the coordinate for which to set the parameter@param pname the parameter to set@param param the parameter value@see <a href="https://docs.gl/gl3/glTexGend">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexGend(int coord, int pname, double param);

    /** Pointer version of {@link #glTexGend TexGend}.@param coord the coordinate for which to set the parameter@param pname the parameter to set@param params the parameter value@see <a href="https://docs.gl/gl3/glTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexGendv(int coord, int pname, DoubleBuffer params);

    /** One-dimensional version of {@link #glTexImage2D TexImage2D}}.@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11C#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>@param level the level-of-detail number@param internalformat the texture internal format@param width the texture width@param border the texture border width@param format the texel data format@param type the texel data type@param pixels the texel data@see <a href="https://docs.gl/gl4/glTexImage1D">Reference Page</a>*/
    void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, ByteBuffer pixels);

    /** One-dimensional version of {@link #glTexImage2D TexImage2D}}.@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11C#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>@param level the level-of-detail number@param internalformat the texture internal format@param width the texture width@param border the texture border width@param format the texel data format@param type the texel data type@param pixels the texel data@see <a href="https://docs.gl/gl4/glTexImage1D">Reference Page</a>*/
    void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels);

    /** One-dimensional version of {@link #glTexImage2D TexImage2D}}.@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11C#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>@param level the level-of-detail number@param internalformat the texture internal format@param width the texture width@param border the texture border width@param format the texel data format@param type the texel data type@param pixels the texel data@see <a href="https://docs.gl/gl4/glTexImage1D">Reference Page</a>*/
    void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, ShortBuffer pixels);

    /** One-dimensional version of {@link #glTexImage2D TexImage2D}}.@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11C#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>@param level the level-of-detail number@param internalformat the texture internal format@param width the texture width@param border the texture border width@param format the texel data format@param type the texel data type@param pixels the texel data@see <a href="https://docs.gl/gl4/glTexImage1D">Reference Page</a>*/
    void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, IntBuffer pixels);

    /** One-dimensional version of {@link #glTexImage2D TexImage2D}}.@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11C#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>@param level the level-of-detail number@param internalformat the texture internal format@param width the texture width@param border the texture border width@param format the texel data format@param type the texel data type@param pixels the texel data@see <a href="https://docs.gl/gl4/glTexImage1D">Reference Page</a>*/
    void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, FloatBuffer pixels);

    /** One-dimensional version of {@link #glTexImage2D TexImage2D}}.@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11C#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>@param level the level-of-detail number@param internalformat the texture internal format@param width the texture width@param border the texture border width@param format the texel data format@param type the texel data type@param pixels the texel data@see <a href="https://docs.gl/gl4/glTexImage1D">Reference Page</a>*/
    void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, DoubleBuffer pixels);

    /** Specifies a two-dimensional texture image.@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL11C#GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr></table>@param level the level-of-detail number@param internalformat the texture internal format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr><tr><td>{@link GL30#GL_R8 R8}</td><td>{@link GL31#GL_R8_SNORM R8_SNORM}</td><td>{@link GL30#GL_R16 R16}</td><td>{@link GL31#GL_R16_SNORM R16_SNORM}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td></tr><tr><td>{@link GL30#GL_RG16 RG16}</td><td>{@link GL31#GL_RG16_SNORM RG16_SNORM}</td><td>{@link GL11C#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11C#GL_RGB4 RGB4}</td><td>{@link GL11C#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11C#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11C#GL_RGB10 RGB10}</td><td>{@link GL11C#GL_RGB12 RGB12}</td><td>{@link GL11C#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td></tr><tr><td>{@link GL11C#GL_RGBA2 RGBA2}</td><td>{@link GL11C#GL_RGBA4 RGBA4}</td><td>{@link GL11C#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11C#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11C#GL_RGB10_A2 RGB10_A2}</td></tr><tr><td>{@link GL33#GL_RGB10_A2UI RGB10_A2UI}</td><td>{@link GL11C#GL_RGBA12 RGBA12}</td><td>{@link GL11C#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td></tr><tr><td>{@link GL30#GL_R16F R16F}</td><td>{@link GL30#GL_RG16F RG16F}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_R32F R32F}</td><td>{@link GL30#GL_RG32F RG32F}</td></tr><tr><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL30#GL_RGB9_E5 RGB9_E5}</td><td>{@link GL30#GL_R8I R8I}</td><td>{@link GL30#GL_R8UI R8UI}</td></tr><tr><td>{@link GL30#GL_R16I R16I}</td><td>{@link GL30#GL_R16UI R16UI}</td><td>{@link GL30#GL_R32I R32I}</td><td>{@link GL30#GL_R32UI R32UI}</td><td>{@link GL30#GL_RG8I RG8I}</td><td>{@link GL30#GL_RG8UI RG8UI}</td></tr><tr><td>{@link GL30#GL_RG16I RG16I}</td><td>{@link GL30#GL_RG16UI RG16UI}</td><td>{@link GL30#GL_RG32I RG32I}</td><td>{@link GL30#GL_RG32UI RG32UI}</td><td>{@link GL30#GL_RGB8I RGB8I}</td><td>{@link GL30#GL_RGB8UI RGB8UI}</td></tr><tr><td>{@link GL30#GL_RGB16I RGB16I}</td><td>{@link GL30#GL_RGB16UI RGB16UI}</td><td>{@link GL30#GL_RGB32I RGB32I}</td><td>{@link GL30#GL_RGB32UI RGB32UI}</td><td>{@link GL30#GL_RGBA8I RGBA8I}</td><td>{@link GL30#GL_RGBA8UI RGBA8UI}</td></tr><tr><td>{@link GL30#GL_RGBA16I RGBA16I}</td><td>{@link GL30#GL_RGBA16UI RGBA16UI}</td><td>{@link GL30#GL_RGBA32I RGBA32I}</td><td>{@link GL30#GL_RGBA32UI RGBA32UI}</td><td>{@link GL14#GL_DEPTH_COMPONENT16 DEPTH_COMPONENT16}</td><td>{@link GL14#GL_DEPTH_COMPONENT24 DEPTH_COMPONENT24}</td></tr><tr><td>{@link GL14#GL_DEPTH_COMPONENT32 DEPTH_COMPONENT32}</td><td>{@link GL30#GL_DEPTH24_STENCIL8 DEPTH24_STENCIL8}</td><td>{@link GL30#GL_DEPTH_COMPONENT32F DEPTH_COMPONENT32F}</td><td>{@link GL30#GL_DEPTH32F_STENCIL8 DEPTH32F_STENCIL8}</td><td>{@link GL30#GL_COMPRESSED_RED COMPRESSED_RED}</td><td>{@link GL30#GL_COMPRESSED_RG COMPRESSED_RG}</td></tr><tr><td>{@link GL13#GL_COMPRESSED_RGB COMPRESSED_RGB}</td><td>{@link GL13#GL_COMPRESSED_RGBA COMPRESSED_RGBA}</td><td>{@link GL21#GL_COMPRESSED_SRGB COMPRESSED_SRGB}</td><td>{@link GL21#GL_COMPRESSED_SRGB_ALPHA COMPRESSED_SRGB_ALPHA}</td><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td></tr></table>@param width the texture width@param height the texture height@param border the texture border width@param format the texel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the texel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the texel data@see <a href="https://docs.gl/gl4/glTexImage2D">Reference Page</a>*/
    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels);

    /** Specifies a two-dimensional texture image.@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL11C#GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr></table>@param level the level-of-detail number@param internalformat the texture internal format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr><tr><td>{@link GL30#GL_R8 R8}</td><td>{@link GL31#GL_R8_SNORM R8_SNORM}</td><td>{@link GL30#GL_R16 R16}</td><td>{@link GL31#GL_R16_SNORM R16_SNORM}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td></tr><tr><td>{@link GL30#GL_RG16 RG16}</td><td>{@link GL31#GL_RG16_SNORM RG16_SNORM}</td><td>{@link GL11C#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11C#GL_RGB4 RGB4}</td><td>{@link GL11C#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11C#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11C#GL_RGB10 RGB10}</td><td>{@link GL11C#GL_RGB12 RGB12}</td><td>{@link GL11C#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td></tr><tr><td>{@link GL11C#GL_RGBA2 RGBA2}</td><td>{@link GL11C#GL_RGBA4 RGBA4}</td><td>{@link GL11C#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11C#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11C#GL_RGB10_A2 RGB10_A2}</td></tr><tr><td>{@link GL33#GL_RGB10_A2UI RGB10_A2UI}</td><td>{@link GL11C#GL_RGBA12 RGBA12}</td><td>{@link GL11C#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td></tr><tr><td>{@link GL30#GL_R16F R16F}</td><td>{@link GL30#GL_RG16F RG16F}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_R32F R32F}</td><td>{@link GL30#GL_RG32F RG32F}</td></tr><tr><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL30#GL_RGB9_E5 RGB9_E5}</td><td>{@link GL30#GL_R8I R8I}</td><td>{@link GL30#GL_R8UI R8UI}</td></tr><tr><td>{@link GL30#GL_R16I R16I}</td><td>{@link GL30#GL_R16UI R16UI}</td><td>{@link GL30#GL_R32I R32I}</td><td>{@link GL30#GL_R32UI R32UI}</td><td>{@link GL30#GL_RG8I RG8I}</td><td>{@link GL30#GL_RG8UI RG8UI}</td></tr><tr><td>{@link GL30#GL_RG16I RG16I}</td><td>{@link GL30#GL_RG16UI RG16UI}</td><td>{@link GL30#GL_RG32I RG32I}</td><td>{@link GL30#GL_RG32UI RG32UI}</td><td>{@link GL30#GL_RGB8I RGB8I}</td><td>{@link GL30#GL_RGB8UI RGB8UI}</td></tr><tr><td>{@link GL30#GL_RGB16I RGB16I}</td><td>{@link GL30#GL_RGB16UI RGB16UI}</td><td>{@link GL30#GL_RGB32I RGB32I}</td><td>{@link GL30#GL_RGB32UI RGB32UI}</td><td>{@link GL30#GL_RGBA8I RGBA8I}</td><td>{@link GL30#GL_RGBA8UI RGBA8UI}</td></tr><tr><td>{@link GL30#GL_RGBA16I RGBA16I}</td><td>{@link GL30#GL_RGBA16UI RGBA16UI}</td><td>{@link GL30#GL_RGBA32I RGBA32I}</td><td>{@link GL30#GL_RGBA32UI RGBA32UI}</td><td>{@link GL14#GL_DEPTH_COMPONENT16 DEPTH_COMPONENT16}</td><td>{@link GL14#GL_DEPTH_COMPONENT24 DEPTH_COMPONENT24}</td></tr><tr><td>{@link GL14#GL_DEPTH_COMPONENT32 DEPTH_COMPONENT32}</td><td>{@link GL30#GL_DEPTH24_STENCIL8 DEPTH24_STENCIL8}</td><td>{@link GL30#GL_DEPTH_COMPONENT32F DEPTH_COMPONENT32F}</td><td>{@link GL30#GL_DEPTH32F_STENCIL8 DEPTH32F_STENCIL8}</td><td>{@link GL30#GL_COMPRESSED_RED COMPRESSED_RED}</td><td>{@link GL30#GL_COMPRESSED_RG COMPRESSED_RG}</td></tr><tr><td>{@link GL13#GL_COMPRESSED_RGB COMPRESSED_RGB}</td><td>{@link GL13#GL_COMPRESSED_RGBA COMPRESSED_RGBA}</td><td>{@link GL21#GL_COMPRESSED_SRGB COMPRESSED_SRGB}</td><td>{@link GL21#GL_COMPRESSED_SRGB_ALPHA COMPRESSED_SRGB_ALPHA}</td><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td></tr></table>@param width the texture width@param height the texture height@param border the texture border width@param format the texel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the texel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the texel data@see <a href="https://docs.gl/gl4/glTexImage2D">Reference Page</a>*/
    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels);

    /** Specifies a two-dimensional texture image.@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL11C#GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr></table>@param level the level-of-detail number@param internalformat the texture internal format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr><tr><td>{@link GL30#GL_R8 R8}</td><td>{@link GL31#GL_R8_SNORM R8_SNORM}</td><td>{@link GL30#GL_R16 R16}</td><td>{@link GL31#GL_R16_SNORM R16_SNORM}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td></tr><tr><td>{@link GL30#GL_RG16 RG16}</td><td>{@link GL31#GL_RG16_SNORM RG16_SNORM}</td><td>{@link GL11C#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11C#GL_RGB4 RGB4}</td><td>{@link GL11C#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11C#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11C#GL_RGB10 RGB10}</td><td>{@link GL11C#GL_RGB12 RGB12}</td><td>{@link GL11C#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td></tr><tr><td>{@link GL11C#GL_RGBA2 RGBA2}</td><td>{@link GL11C#GL_RGBA4 RGBA4}</td><td>{@link GL11C#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11C#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11C#GL_RGB10_A2 RGB10_A2}</td></tr><tr><td>{@link GL33#GL_RGB10_A2UI RGB10_A2UI}</td><td>{@link GL11C#GL_RGBA12 RGBA12}</td><td>{@link GL11C#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td></tr><tr><td>{@link GL30#GL_R16F R16F}</td><td>{@link GL30#GL_RG16F RG16F}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_R32F R32F}</td><td>{@link GL30#GL_RG32F RG32F}</td></tr><tr><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL30#GL_RGB9_E5 RGB9_E5}</td><td>{@link GL30#GL_R8I R8I}</td><td>{@link GL30#GL_R8UI R8UI}</td></tr><tr><td>{@link GL30#GL_R16I R16I}</td><td>{@link GL30#GL_R16UI R16UI}</td><td>{@link GL30#GL_R32I R32I}</td><td>{@link GL30#GL_R32UI R32UI}</td><td>{@link GL30#GL_RG8I RG8I}</td><td>{@link GL30#GL_RG8UI RG8UI}</td></tr><tr><td>{@link GL30#GL_RG16I RG16I}</td><td>{@link GL30#GL_RG16UI RG16UI}</td><td>{@link GL30#GL_RG32I RG32I}</td><td>{@link GL30#GL_RG32UI RG32UI}</td><td>{@link GL30#GL_RGB8I RGB8I}</td><td>{@link GL30#GL_RGB8UI RGB8UI}</td></tr><tr><td>{@link GL30#GL_RGB16I RGB16I}</td><td>{@link GL30#GL_RGB16UI RGB16UI}</td><td>{@link GL30#GL_RGB32I RGB32I}</td><td>{@link GL30#GL_RGB32UI RGB32UI}</td><td>{@link GL30#GL_RGBA8I RGBA8I}</td><td>{@link GL30#GL_RGBA8UI RGBA8UI}</td></tr><tr><td>{@link GL30#GL_RGBA16I RGBA16I}</td><td>{@link GL30#GL_RGBA16UI RGBA16UI}</td><td>{@link GL30#GL_RGBA32I RGBA32I}</td><td>{@link GL30#GL_RGBA32UI RGBA32UI}</td><td>{@link GL14#GL_DEPTH_COMPONENT16 DEPTH_COMPONENT16}</td><td>{@link GL14#GL_DEPTH_COMPONENT24 DEPTH_COMPONENT24}</td></tr><tr><td>{@link GL14#GL_DEPTH_COMPONENT32 DEPTH_COMPONENT32}</td><td>{@link GL30#GL_DEPTH24_STENCIL8 DEPTH24_STENCIL8}</td><td>{@link GL30#GL_DEPTH_COMPONENT32F DEPTH_COMPONENT32F}</td><td>{@link GL30#GL_DEPTH32F_STENCIL8 DEPTH32F_STENCIL8}</td><td>{@link GL30#GL_COMPRESSED_RED COMPRESSED_RED}</td><td>{@link GL30#GL_COMPRESSED_RG COMPRESSED_RG}</td></tr><tr><td>{@link GL13#GL_COMPRESSED_RGB COMPRESSED_RGB}</td><td>{@link GL13#GL_COMPRESSED_RGBA COMPRESSED_RGBA}</td><td>{@link GL21#GL_COMPRESSED_SRGB COMPRESSED_SRGB}</td><td>{@link GL21#GL_COMPRESSED_SRGB_ALPHA COMPRESSED_SRGB_ALPHA}</td><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td></tr></table>@param width the texture width@param height the texture height@param border the texture border width@param format the texel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the texel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the texel data@see <a href="https://docs.gl/gl4/glTexImage2D">Reference Page</a>*/
    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels);

    /** Specifies a two-dimensional texture image.@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL11C#GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr></table>@param level the level-of-detail number@param internalformat the texture internal format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr><tr><td>{@link GL30#GL_R8 R8}</td><td>{@link GL31#GL_R8_SNORM R8_SNORM}</td><td>{@link GL30#GL_R16 R16}</td><td>{@link GL31#GL_R16_SNORM R16_SNORM}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td></tr><tr><td>{@link GL30#GL_RG16 RG16}</td><td>{@link GL31#GL_RG16_SNORM RG16_SNORM}</td><td>{@link GL11C#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11C#GL_RGB4 RGB4}</td><td>{@link GL11C#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11C#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11C#GL_RGB10 RGB10}</td><td>{@link GL11C#GL_RGB12 RGB12}</td><td>{@link GL11C#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td></tr><tr><td>{@link GL11C#GL_RGBA2 RGBA2}</td><td>{@link GL11C#GL_RGBA4 RGBA4}</td><td>{@link GL11C#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11C#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11C#GL_RGB10_A2 RGB10_A2}</td></tr><tr><td>{@link GL33#GL_RGB10_A2UI RGB10_A2UI}</td><td>{@link GL11C#GL_RGBA12 RGBA12}</td><td>{@link GL11C#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td></tr><tr><td>{@link GL30#GL_R16F R16F}</td><td>{@link GL30#GL_RG16F RG16F}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_R32F R32F}</td><td>{@link GL30#GL_RG32F RG32F}</td></tr><tr><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL30#GL_RGB9_E5 RGB9_E5}</td><td>{@link GL30#GL_R8I R8I}</td><td>{@link GL30#GL_R8UI R8UI}</td></tr><tr><td>{@link GL30#GL_R16I R16I}</td><td>{@link GL30#GL_R16UI R16UI}</td><td>{@link GL30#GL_R32I R32I}</td><td>{@link GL30#GL_R32UI R32UI}</td><td>{@link GL30#GL_RG8I RG8I}</td><td>{@link GL30#GL_RG8UI RG8UI}</td></tr><tr><td>{@link GL30#GL_RG16I RG16I}</td><td>{@link GL30#GL_RG16UI RG16UI}</td><td>{@link GL30#GL_RG32I RG32I}</td><td>{@link GL30#GL_RG32UI RG32UI}</td><td>{@link GL30#GL_RGB8I RGB8I}</td><td>{@link GL30#GL_RGB8UI RGB8UI}</td></tr><tr><td>{@link GL30#GL_RGB16I RGB16I}</td><td>{@link GL30#GL_RGB16UI RGB16UI}</td><td>{@link GL30#GL_RGB32I RGB32I}</td><td>{@link GL30#GL_RGB32UI RGB32UI}</td><td>{@link GL30#GL_RGBA8I RGBA8I}</td><td>{@link GL30#GL_RGBA8UI RGBA8UI}</td></tr><tr><td>{@link GL30#GL_RGBA16I RGBA16I}</td><td>{@link GL30#GL_RGBA16UI RGBA16UI}</td><td>{@link GL30#GL_RGBA32I RGBA32I}</td><td>{@link GL30#GL_RGBA32UI RGBA32UI}</td><td>{@link GL14#GL_DEPTH_COMPONENT16 DEPTH_COMPONENT16}</td><td>{@link GL14#GL_DEPTH_COMPONENT24 DEPTH_COMPONENT24}</td></tr><tr><td>{@link GL14#GL_DEPTH_COMPONENT32 DEPTH_COMPONENT32}</td><td>{@link GL30#GL_DEPTH24_STENCIL8 DEPTH24_STENCIL8}</td><td>{@link GL30#GL_DEPTH_COMPONENT32F DEPTH_COMPONENT32F}</td><td>{@link GL30#GL_DEPTH32F_STENCIL8 DEPTH32F_STENCIL8}</td><td>{@link GL30#GL_COMPRESSED_RED COMPRESSED_RED}</td><td>{@link GL30#GL_COMPRESSED_RG COMPRESSED_RG}</td></tr><tr><td>{@link GL13#GL_COMPRESSED_RGB COMPRESSED_RGB}</td><td>{@link GL13#GL_COMPRESSED_RGBA COMPRESSED_RGBA}</td><td>{@link GL21#GL_COMPRESSED_SRGB COMPRESSED_SRGB}</td><td>{@link GL21#GL_COMPRESSED_SRGB_ALPHA COMPRESSED_SRGB_ALPHA}</td><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td></tr></table>@param width the texture width@param height the texture height@param border the texture border width@param format the texel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the texel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the texel data@see <a href="https://docs.gl/gl4/glTexImage2D">Reference Page</a>*/
    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels);

    /** Specifies a two-dimensional texture image.@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL11C#GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr></table>@param level the level-of-detail number@param internalformat the texture internal format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr><tr><td>{@link GL30#GL_R8 R8}</td><td>{@link GL31#GL_R8_SNORM R8_SNORM}</td><td>{@link GL30#GL_R16 R16}</td><td>{@link GL31#GL_R16_SNORM R16_SNORM}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td></tr><tr><td>{@link GL30#GL_RG16 RG16}</td><td>{@link GL31#GL_RG16_SNORM RG16_SNORM}</td><td>{@link GL11C#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11C#GL_RGB4 RGB4}</td><td>{@link GL11C#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11C#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11C#GL_RGB10 RGB10}</td><td>{@link GL11C#GL_RGB12 RGB12}</td><td>{@link GL11C#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td></tr><tr><td>{@link GL11C#GL_RGBA2 RGBA2}</td><td>{@link GL11C#GL_RGBA4 RGBA4}</td><td>{@link GL11C#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11C#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11C#GL_RGB10_A2 RGB10_A2}</td></tr><tr><td>{@link GL33#GL_RGB10_A2UI RGB10_A2UI}</td><td>{@link GL11C#GL_RGBA12 RGBA12}</td><td>{@link GL11C#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td></tr><tr><td>{@link GL30#GL_R16F R16F}</td><td>{@link GL30#GL_RG16F RG16F}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_R32F R32F}</td><td>{@link GL30#GL_RG32F RG32F}</td></tr><tr><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL30#GL_RGB9_E5 RGB9_E5}</td><td>{@link GL30#GL_R8I R8I}</td><td>{@link GL30#GL_R8UI R8UI}</td></tr><tr><td>{@link GL30#GL_R16I R16I}</td><td>{@link GL30#GL_R16UI R16UI}</td><td>{@link GL30#GL_R32I R32I}</td><td>{@link GL30#GL_R32UI R32UI}</td><td>{@link GL30#GL_RG8I RG8I}</td><td>{@link GL30#GL_RG8UI RG8UI}</td></tr><tr><td>{@link GL30#GL_RG16I RG16I}</td><td>{@link GL30#GL_RG16UI RG16UI}</td><td>{@link GL30#GL_RG32I RG32I}</td><td>{@link GL30#GL_RG32UI RG32UI}</td><td>{@link GL30#GL_RGB8I RGB8I}</td><td>{@link GL30#GL_RGB8UI RGB8UI}</td></tr><tr><td>{@link GL30#GL_RGB16I RGB16I}</td><td>{@link GL30#GL_RGB16UI RGB16UI}</td><td>{@link GL30#GL_RGB32I RGB32I}</td><td>{@link GL30#GL_RGB32UI RGB32UI}</td><td>{@link GL30#GL_RGBA8I RGBA8I}</td><td>{@link GL30#GL_RGBA8UI RGBA8UI}</td></tr><tr><td>{@link GL30#GL_RGBA16I RGBA16I}</td><td>{@link GL30#GL_RGBA16UI RGBA16UI}</td><td>{@link GL30#GL_RGBA32I RGBA32I}</td><td>{@link GL30#GL_RGBA32UI RGBA32UI}</td><td>{@link GL14#GL_DEPTH_COMPONENT16 DEPTH_COMPONENT16}</td><td>{@link GL14#GL_DEPTH_COMPONENT24 DEPTH_COMPONENT24}</td></tr><tr><td>{@link GL14#GL_DEPTH_COMPONENT32 DEPTH_COMPONENT32}</td><td>{@link GL30#GL_DEPTH24_STENCIL8 DEPTH24_STENCIL8}</td><td>{@link GL30#GL_DEPTH_COMPONENT32F DEPTH_COMPONENT32F}</td><td>{@link GL30#GL_DEPTH32F_STENCIL8 DEPTH32F_STENCIL8}</td><td>{@link GL30#GL_COMPRESSED_RED COMPRESSED_RED}</td><td>{@link GL30#GL_COMPRESSED_RG COMPRESSED_RG}</td></tr><tr><td>{@link GL13#GL_COMPRESSED_RGB COMPRESSED_RGB}</td><td>{@link GL13#GL_COMPRESSED_RGBA COMPRESSED_RGBA}</td><td>{@link GL21#GL_COMPRESSED_SRGB COMPRESSED_SRGB}</td><td>{@link GL21#GL_COMPRESSED_SRGB_ALPHA COMPRESSED_SRGB_ALPHA}</td><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td></tr></table>@param width the texture width@param height the texture height@param border the texture border width@param format the texel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the texel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the texel data@see <a href="https://docs.gl/gl4/glTexImage2D">Reference Page</a>*/
    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels);

    /** Specifies a two-dimensional texture image.@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL11C#GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr></table>@param level the level-of-detail number@param internalformat the texture internal format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr><tr><td>{@link GL30#GL_R8 R8}</td><td>{@link GL31#GL_R8_SNORM R8_SNORM}</td><td>{@link GL30#GL_R16 R16}</td><td>{@link GL31#GL_R16_SNORM R16_SNORM}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td></tr><tr><td>{@link GL30#GL_RG16 RG16}</td><td>{@link GL31#GL_RG16_SNORM RG16_SNORM}</td><td>{@link GL11C#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11C#GL_RGB4 RGB4}</td><td>{@link GL11C#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11C#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11C#GL_RGB10 RGB10}</td><td>{@link GL11C#GL_RGB12 RGB12}</td><td>{@link GL11C#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td></tr><tr><td>{@link GL11C#GL_RGBA2 RGBA2}</td><td>{@link GL11C#GL_RGBA4 RGBA4}</td><td>{@link GL11C#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11C#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11C#GL_RGB10_A2 RGB10_A2}</td></tr><tr><td>{@link GL33#GL_RGB10_A2UI RGB10_A2UI}</td><td>{@link GL11C#GL_RGBA12 RGBA12}</td><td>{@link GL11C#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td></tr><tr><td>{@link GL30#GL_R16F R16F}</td><td>{@link GL30#GL_RG16F RG16F}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_R32F R32F}</td><td>{@link GL30#GL_RG32F RG32F}</td></tr><tr><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL30#GL_RGB9_E5 RGB9_E5}</td><td>{@link GL30#GL_R8I R8I}</td><td>{@link GL30#GL_R8UI R8UI}</td></tr><tr><td>{@link GL30#GL_R16I R16I}</td><td>{@link GL30#GL_R16UI R16UI}</td><td>{@link GL30#GL_R32I R32I}</td><td>{@link GL30#GL_R32UI R32UI}</td><td>{@link GL30#GL_RG8I RG8I}</td><td>{@link GL30#GL_RG8UI RG8UI}</td></tr><tr><td>{@link GL30#GL_RG16I RG16I}</td><td>{@link GL30#GL_RG16UI RG16UI}</td><td>{@link GL30#GL_RG32I RG32I}</td><td>{@link GL30#GL_RG32UI RG32UI}</td><td>{@link GL30#GL_RGB8I RGB8I}</td><td>{@link GL30#GL_RGB8UI RGB8UI}</td></tr><tr><td>{@link GL30#GL_RGB16I RGB16I}</td><td>{@link GL30#GL_RGB16UI RGB16UI}</td><td>{@link GL30#GL_RGB32I RGB32I}</td><td>{@link GL30#GL_RGB32UI RGB32UI}</td><td>{@link GL30#GL_RGBA8I RGBA8I}</td><td>{@link GL30#GL_RGBA8UI RGBA8UI}</td></tr><tr><td>{@link GL30#GL_RGBA16I RGBA16I}</td><td>{@link GL30#GL_RGBA16UI RGBA16UI}</td><td>{@link GL30#GL_RGBA32I RGBA32I}</td><td>{@link GL30#GL_RGBA32UI RGBA32UI}</td><td>{@link GL14#GL_DEPTH_COMPONENT16 DEPTH_COMPONENT16}</td><td>{@link GL14#GL_DEPTH_COMPONENT24 DEPTH_COMPONENT24}</td></tr><tr><td>{@link GL14#GL_DEPTH_COMPONENT32 DEPTH_COMPONENT32}</td><td>{@link GL30#GL_DEPTH24_STENCIL8 DEPTH24_STENCIL8}</td><td>{@link GL30#GL_DEPTH_COMPONENT32F DEPTH_COMPONENT32F}</td><td>{@link GL30#GL_DEPTH32F_STENCIL8 DEPTH32F_STENCIL8}</td><td>{@link GL30#GL_COMPRESSED_RED COMPRESSED_RED}</td><td>{@link GL30#GL_COMPRESSED_RG COMPRESSED_RG}</td></tr><tr><td>{@link GL13#GL_COMPRESSED_RGB COMPRESSED_RGB}</td><td>{@link GL13#GL_COMPRESSED_RGBA COMPRESSED_RGBA}</td><td>{@link GL21#GL_COMPRESSED_SRGB COMPRESSED_SRGB}</td><td>{@link GL21#GL_COMPRESSED_SRGB_ALPHA COMPRESSED_SRGB_ALPHA}</td><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td></tr></table>@param width the texture width@param height the texture height@param border the texture border width@param format the texel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the texel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the texel data@see <a href="https://docs.gl/gl4/glTexImage2D">Reference Page</a>*/
    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, DoubleBuffer pixels);

    /** Defines a one-dimensional texel array in exactly the manner of {@link #glTexImage1D TexImage1D}, except that the image data are taken from the framebuffer rather than from client memory. For the purposes of decoding the texture image, {@code CopyTexImage1D} is equivalent to calling {@link #glCopyTexImage2D CopyTexImage2D} with corresponding arguments and height of 1, except that the height of the image is always 1, regardless of the value of border. level, internalformat, and border are specified using the same values, with the same meanings, as the corresponding arguments of {@link #glTexImage1D TexImage1D}. The constraints on width and border are exactly those of the corresponding arguments of {@link #glTexImage1D TexImage1D}.@param target the texture target. Must be:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>@param level the level-of-detail number@param internalFormat the texture internal format. See {@link #glTexImage2D TexImage2D} for a list of supported formats.@param x the left framebuffer pixel coordinate@param y the lower framebuffer pixel coordinate@param width the texture width@param border the texture border width@see <a href="https://docs.gl/gl4/glCopyTexImage1D">Reference Page</a>*/
    void glCopyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border);

    /** Defines a two-dimensional texel array in exactly the manner of {@link #glTexImage2D TexImage2D}, except that the image data are taken from the framebuffer rather than from client memory. <p>{@code x}, {@code y}, {@code width}, and {@code height} correspond precisely to the corresponding arguments to {@link #glReadPixels ReadPixels}; they specify the image's width and height, and the lower left (x, y) coordinates of the framebuffer region to be copied.</p> <p>The image is taken from the framebuffer exactly as if these arguments were passed to {@link GL11#glCopyPixels CopyPixels} with argument type set to {@link GL11C#GL_COLOR COLOR}, {@link GL11C#GL_DEPTH DEPTH}, or {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, depending on {@code internalformat}. RGBA data is taken from the current color buffer, while depth component and stencil index data are taken from the depth and stencil buffers, respectively.</p> <p>Subsequent processing is identical to that described for {@link #glTexImage2D TexImage2D}, beginning with clamping of the R, G, B, A, or depth values, and masking of the stencil index values from the resulting pixel groups. Parameters {@code level}, {@code internalformat}, and {@code border} are specified using the same values, with the same meanings, as the corresponding arguments of {@link #glTexImage2D TexImage2D}.</p> <p>The constraints on width, height, and border are exactly those for the corresponding arguments of {@link #glTexImage2D TexImage2D}.</p>@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>@param level the level-of-detail number@param internalFormat the texture internal format. See {@link #glTexImage2D TexImage2D} for a list of supported formats.@param x the left framebuffer pixel coordinate@param y the lower framebuffer pixel coordinate@param width the texture width@param height the texture height@param border the texture border width@see <a href="https://docs.gl/gl4/glCopyTexImage2D">Reference Page</a>*/
    void glCopyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border);

    /** Respecifies a rectangular subregion of an existing texel array. No change is made to the {@code internalformat}, {@code width} or {@code border} parameters of the specified texel array, nor is any change made to texel values outside the specified subregion. See {@link #glCopyTexImage1D CopyTexImage1D} for more details.@param target the texture target. Must be:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>@param level the level-of-detail number@param xoffset the left texel coordinate of the texture subregion to update@param x the left framebuffer pixel coordinate@param y the lower framebuffer pixel coordinate@param width the texture subregion width@see <a href="https://docs.gl/gl4/glCopyTexSubImage1D">Reference Page</a>*/
    void glCopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width);

    /** Respecifies a rectangular subregion of an existing texel array. No change is made to the {@code internalformat}, {@code width}, {@code height}, or {@code border} parameters of the specified texel array, nor is any change made to texel values outside the specified subregion. See {@link #glCopyTexImage2D CopyTexImage2D} for more details.@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>@param level the level-of-detail number@param xoffset the left texel coordinate of the texture subregion to update@param yoffset the lower texel coordinate of the texture subregion to update@param x the left framebuffer pixel coordinate@param y the lower framebuffer pixel coordinate@param width the texture subregion width@param height the texture subregion height@see <a href="https://docs.gl/gl4/glCopyTexSubImage2D">Reference Page</a>*/
    void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height);

    /** Sets the integer value of a texture parameter, which controls how the texel array is treated when specified or changed, and when applied to a fragment.@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>@param pname the parameter to set. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL}</td><td>{@link GL11C#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL11C#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td><td>{@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td></tr><tr><td>{@link GL11C#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_R TEXTURE_SWIZZLE_R}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_G TEXTURE_SWIZZLE_G}</td></tr><tr><td>{@link GL33#GL_TEXTURE_SWIZZLE_B TEXTURE_SWIZZLE_B}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_A TEXTURE_SWIZZLE_A}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_RGBA TEXTURE_SWIZZLE_RGBA}</td><td>{@link GL11C#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td></tr><tr><td>{@link GL11C#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL14#GL_DEPTH_TEXTURE_MODE DEPTH_TEXTURE_MODE}</td><td>{@link GL14#GL_GENERATE_MIPMAP GENERATE_MIPMAP}</td></tr></table>@param param the parameter value@see <a href="https://docs.gl/gl4/glTexParameteri">Reference Page</a>*/
    void glTexParameteri(int target, int pname, int param);

    /** Pointer version of {@link #glTexParameteri TexParameteri}.@param target the texture target@param pname the parameter to set@param params the parameter value@see <a href="https://docs.gl/gl4/glTexParameter">Reference Page</a>*/
    void glTexParameteriv(int target, int pname, IntBuffer params);

    /** Float version of {@link #glTexParameteri TexParameteri}.@param target the texture target@param pname the parameter to set@param param the parameter value@see <a href="https://docs.gl/gl4/glTexParameterf">Reference Page</a>*/
    void glTexParameterf(int target, int pname, float param);

    /** Pointer version of {@link #glTexParameterf TexParameterf}.@param target the texture target@param pname the parameter to set@param params the parameter value@see <a href="https://docs.gl/gl4/glTexParameter">Reference Page</a>*/
    void glTexParameterfv(int target, int pname, FloatBuffer params);

    /** One-dimensional version of {@link #glTexSubImage2D TexSubImage2D}.@param target the texture target. Must be:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>@param level the level-of-detail-number@param xoffset the left coordinate of the texel subregion@param width the subregion width@param format the pixel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the pixel data@see <a href="https://docs.gl/gl4/glTexSubImage1D">Reference Page</a>*/
    void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ByteBuffer pixels);

    /** One-dimensional version of {@link #glTexSubImage2D TexSubImage2D}.@param target the texture target. Must be:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>@param level the level-of-detail-number@param xoffset the left coordinate of the texel subregion@param width the subregion width@param format the pixel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the pixel data@see <a href="https://docs.gl/gl4/glTexSubImage1D">Reference Page</a>*/
    void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels);

    /** One-dimensional version of {@link #glTexSubImage2D TexSubImage2D}.@param target the texture target. Must be:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>@param level the level-of-detail-number@param xoffset the left coordinate of the texel subregion@param width the subregion width@param format the pixel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the pixel data@see <a href="https://docs.gl/gl4/glTexSubImage1D">Reference Page</a>*/
    void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ShortBuffer pixels);

    /** One-dimensional version of {@link #glTexSubImage2D TexSubImage2D}.@param target the texture target. Must be:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>@param level the level-of-detail-number@param xoffset the left coordinate of the texel subregion@param width the subregion width@param format the pixel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the pixel data@see <a href="https://docs.gl/gl4/glTexSubImage1D">Reference Page</a>*/
    void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, IntBuffer pixels);

    /** One-dimensional version of {@link #glTexSubImage2D TexSubImage2D}.@param target the texture target. Must be:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>@param level the level-of-detail-number@param xoffset the left coordinate of the texel subregion@param width the subregion width@param format the pixel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the pixel data@see <a href="https://docs.gl/gl4/glTexSubImage1D">Reference Page</a>*/
    void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, FloatBuffer pixels);

    /** One-dimensional version of {@link #glTexSubImage2D TexSubImage2D}.@param target the texture target. Must be:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>@param level the level-of-detail-number@param xoffset the left coordinate of the texel subregion@param width the subregion width@param format the pixel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the pixel data@see <a href="https://docs.gl/gl4/glTexSubImage1D">Reference Page</a>*/
    void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels);

    /** Respecifies a rectangular subregion of an existing texel array. No change is made to the internalformat, width, height, depth, or border parameters of the specified texel array, nor is any change made to texel values outside the specified subregion.@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>@param level the level-of-detail-number@param xoffset the left coordinate of the texel subregion@param yoffset the bottom coordinate of the texel subregion@param width the subregion width@param height the subregion height@param format the pixel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the pixel data@see <a href="https://docs.gl/gl4/glTexSubImage2D">Reference Page</a>*/
    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels);

    /** Respecifies a rectangular subregion of an existing texel array. No change is made to the internalformat, width, height, depth, or border parameters of the specified texel array, nor is any change made to texel values outside the specified subregion.@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>@param level the level-of-detail-number@param xoffset the left coordinate of the texel subregion@param yoffset the bottom coordinate of the texel subregion@param width the subregion width@param height the subregion height@param format the pixel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the pixel data@see <a href="https://docs.gl/gl4/glTexSubImage2D">Reference Page</a>*/
    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels);

    /** Respecifies a rectangular subregion of an existing texel array. No change is made to the internalformat, width, height, depth, or border parameters of the specified texel array, nor is any change made to texel values outside the specified subregion.@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>@param level the level-of-detail-number@param xoffset the left coordinate of the texel subregion@param yoffset the bottom coordinate of the texel subregion@param width the subregion width@param height the subregion height@param format the pixel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the pixel data@see <a href="https://docs.gl/gl4/glTexSubImage2D">Reference Page</a>*/
    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels);

    /** Respecifies a rectangular subregion of an existing texel array. No change is made to the internalformat, width, height, depth, or border parameters of the specified texel array, nor is any change made to texel values outside the specified subregion.@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>@param level the level-of-detail-number@param xoffset the left coordinate of the texel subregion@param yoffset the bottom coordinate of the texel subregion@param width the subregion width@param height the subregion height@param format the pixel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the pixel data@see <a href="https://docs.gl/gl4/glTexSubImage2D">Reference Page</a>*/
    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels);

    /** Respecifies a rectangular subregion of an existing texel array. No change is made to the internalformat, width, height, depth, or border parameters of the specified texel array, nor is any change made to texel values outside the specified subregion.@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>@param level the level-of-detail-number@param xoffset the left coordinate of the texel subregion@param yoffset the bottom coordinate of the texel subregion@param width the subregion width@param height the subregion height@param format the pixel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the pixel data@see <a href="https://docs.gl/gl4/glTexSubImage2D">Reference Page</a>*/
    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels);

    /** Respecifies a rectangular subregion of an existing texel array. No change is made to the internalformat, width, height, depth, or border parameters of the specified texel array, nor is any change made to texel values outside the specified subregion.@param target the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>@param level the level-of-detail-number@param xoffset the left coordinate of the texel subregion@param yoffset the bottom coordinate of the texel subregion@param width the subregion width@param height the subregion height@param format the pixel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>@param type the pixel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>@param pixels the pixel data@see <a href="https://docs.gl/gl4/glTexSubImage2D">Reference Page</a>*/
    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels);

    /** Manipulates the current matrix with a translation matrix along the x-, y- and z- axes. <p>Calling this function is equivalent to calling {@link #glMultMatrixf MultMatrixf} with the following matrix:</p> <table class=striped> <tr><td>1</td><td>0</td><td>0</td><td>x</td></tr> <tr><td>0</td><td>1</td><td>0</td><td>y</td></tr> <tr><td>0</td><td>0</td><td>1</td><td>z</td></tr> <tr><td>0</td><td>0</td><td>0</td><td>1</td></tr> </table>@param x the x-axis translation@param y the y-axis translation@param z the z-axis translation@see <a href="https://docs.gl/gl3/glTranslatef">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTranslatef(float x, float y, float z);

    /** Double version of {@link #glTranslatef Translatef}.@param x the x-axis translation@param y the y-axis translation@param z the z-axis translation@see <a href="https://docs.gl/gl3/glTranslated">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTranslated(double x, double y, double z);

    /** Specifies a single vertex between {@link #glBegin Begin} and {@link #glEnd End} by giving its coordinates in two dimensions. The z coordinate is implicitly set to zero and the w coordinate to one.@param x the vertex x coordinate@param y the vertex y coordinate@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex2f(float x, float y);

    /** Short version of {@link #glVertex2f Vertex2f}.@param x the vertex x coordinate@param y the vertex y coordinate@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex2s(short x, short y);

    /** Integer version of {@link #glVertex2f Vertex2f}.@param x the vertex x coordinate@param y the vertex y coordinate@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex2i(int x, int y);

    /** Double version of {@link #glVertex2f Vertex2f}.@param x the vertex x coordinate@param y the vertex y coordinate@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex2d(double x, double y);

    /** Pointer version of {@link #glVertex2f Vertex2f}.@param coords the vertex buffer@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex2fv(FloatBuffer coords);

    /** Pointer version of {@link #glVertex2s Vertex2s}.@param coords the vertex buffer@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex2sv(ShortBuffer coords);

    /** Pointer version of {@link #glVertex2i Vertex2i}.@param coords the vertex buffer@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex2iv(IntBuffer coords);

    /** Pointer version of {@link #glVertex2d Vertex2d}.@param coords the vertex buffer@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex2dv(DoubleBuffer coords);

    /** Specifies a single vertex between {@link #glBegin Begin} and {@link #glEnd End} by giving its coordinates in three dimensions. The w coordinate is implicitly set to one.@param x the vertex x coordinate@param y the vertex y coordinate@param z the vertex z coordinate@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex3f(float x, float y, float z);

    /** Short version of {@link #glVertex3f Vertex3f}.@param x the vertex x coordinate@param y the vertex y coordinate@param z the vertex z coordinate@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex3s(short x, short y, short z);

    /** Integer version of {@link #glVertex3f Vertex3f}.@param x the vertex x coordinate@param y the vertex y coordinate@param z the vertex z coordinate@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex3i(int x, int y, int z);

    /** Double version of {@link #glVertex3f Vertex3f}.@param x the vertex x coordinate@param y the vertex y coordinate@param z the vertex z coordinate@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex3d(double x, double y, double z);

    /** Pointer version of {@link #glVertex3f Vertex3f}.@param coords the vertex buffer@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex3fv(FloatBuffer coords);

    /** Pointer version of {@link #glVertex3s Vertex3s}.@param coords the vertex buffer@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex3sv(ShortBuffer coords);

    /** Pointer version of {@link #glVertex3i Vertex3i}.@param coords the vertex buffer@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex3iv(IntBuffer coords);

    /** Pointer version of {@link #glVertex3d Vertex3d}.@param coords the vertex buffer@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex3dv(DoubleBuffer coords);

    /** Specifies a single vertex between {@link #glBegin Begin} and {@link #glEnd End} by giving its coordinates in four dimensions.@param x the vertex x coordinate@param y the vertex y coordinate@param z the vertex z coordinate@param w the vertex w coordinate@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex4f(float x, float y, float z, float w);

    /** Short version of {@link #glVertex4f Vertex4f}.@param x the vertex x coordinate@param y the vertex y coordinate@param z the vertex z coordinate@param w the vertex w coordinate@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex4s(short x, short y, short z, short w);

    /** Integer version of {@link #glVertex4f Vertex4f}.@param x the vertex x coordinate@param y the vertex y coordinate@param z the vertex z coordinate@param w the vertex w coordinate@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex4i(int x, int y, int z, int w);

    /** Double version of {@link #glVertex4f Vertex4f}.@param x the vertex x coordinate@param y the vertex y coordinate@param z the vertex z coordinate@param w the vertex w coordinate@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex4d(double x, double y, double z, double w);

    /** Pointer version of {@link #glVertex4f Vertex4f}.@param coords the vertex buffer@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex4fv(FloatBuffer coords);

    /** Pointer version of {@link #glVertex4s Vertex4s}.@param coords the vertex buffer@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex4sv(ShortBuffer coords);

    /** Pointer version of {@link #glVertex4i Vertex4i}.@param coords the vertex buffer@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex4iv(IntBuffer coords);

    /** Pointer version of {@link #glVertex4d Vertex4d}.@param coords the vertex buffer@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex4dv(DoubleBuffer coords);

    /** Specifies the location and organization of a vertex array.@param size the number of values per vertex that are stored in the array. One of:<br><table><tr><td>2</td><td>3</td><td>4</td></tr></table>@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the vertex array data@see <a href="https://docs.gl/gl3/glVertexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertexPointer(int size, int type, int stride, ByteBuffer pointer);

    /** Specifies the location and organization of a vertex array.@param size the number of values per vertex that are stored in the array. One of:<br><table><tr><td>2</td><td>3</td><td>4</td></tr></table>@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the vertex array data@see <a href="https://docs.gl/gl3/glVertexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertexPointer(int size, int type, int stride, long pointer);

    /** Specifies the location and organization of a vertex array.@param size the number of values per vertex that are stored in the array. One of:<br><table><tr><td>2</td><td>3</td><td>4</td></tr></table>@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the vertex array data@see <a href="https://docs.gl/gl3/glVertexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertexPointer(int size, int type, int stride, ShortBuffer pointer);

    /** Specifies the location and organization of a vertex array.@param size the number of values per vertex that are stored in the array. One of:<br><table><tr><td>2</td><td>3</td><td>4</td></tr></table>@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the vertex array data@see <a href="https://docs.gl/gl3/glVertexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertexPointer(int size, int type, int stride, IntBuffer pointer);

    /** Specifies the location and organization of a vertex array.@param size the number of values per vertex that are stored in the array. One of:<br><table><tr><td>2</td><td>3</td><td>4</td></tr></table>@param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>@param stride the vertex stride in bytes. If specified as zero, then array elements are stored sequentially@param pointer the vertex array data@see <a href="https://docs.gl/gl3/glVertexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertexPointer(int size, int type, int stride, FloatBuffer pointer);

    /** Specifies the viewport transformation parameters for all viewports. <p>The location of the viewport's bottom-left corner, given by {@code (x, y)}, are clamped to be within the implementation-dependent viewport bounds range. The viewport bounds range {@code [min, max]} tuple may be determined by calling {@link #glGetFloatv GetFloatv} with the symbolic constant {@link GL41#GL_VIEWPORT_BOUNDS_RANGE VIEWPORT_BOUNDS_RANGE}. Viewport width and height are clamped to implementation-dependent maximums when specified. The maximum width and height may be found by calling {@link #glGetFloatv GetFloatv} with the symbolic constant {@link GL11C#GL_MAX_VIEWPORT_DIMS MAX_VIEWPORT_DIMS}. The maximum viewport dimensions must be greater than or equal to the larger of the visible dimensions of the display being rendered to (if a display exists), and the largest renderbuffer image which can be successfully created and attached to a framebuffer object.</p> <p>In the initial state, {@code w} and {@code h} for each viewport are set to the width and height, respectively, of the window into which the GL is to do its rendering. If the default framebuffer is bound but no default framebuffer is associated with the GL context, then {@code w} and {@code h} are initially set to zero.</p>@param x the left viewport coordinate@param y the bottom viewport coordinate@param w the viewport width@param h the viewport height@see <a href="https://docs.gl/gl4/glViewport">Reference Page</a>*/
    void glViewport(int x, int y, int w, int h);

    /** Array version of: {@link #glAreTexturesResident AreTexturesResident}@see <a href="https://docs.gl/gl3/glAreTexturesResident">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    boolean glAreTexturesResident(int[] textures, ByteBuffer residences);

    /** Array version of: {@link #glClipPlane ClipPlane}@see <a href="https://docs.gl/gl3/glClipPlane">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glClipPlane(int plane, double[] equation);

    /** Array version of: {@link #glColor3sv Color3sv}@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor3sv(short[] v);

    /** Array version of: {@link #glColor3iv Color3iv}@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor3iv(int[] v);

    /** Array version of: {@link #glColor3fv Color3fv}@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor3fv(float[] v);

    /** Array version of: {@link #glColor3dv Color3dv}@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor3dv(double[] v);

    /** Array version of: {@link #glColor3usv Color3usv}@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor3usv(short[] v);

    /** Array version of: {@link #glColor3uiv Color3uiv}@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor3uiv(int[] v);

    /** Array version of: {@link #glColor4sv Color4sv}@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor4sv(short[] v);

    /** Array version of: {@link #glColor4iv Color4iv}@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor4iv(int[] v);

    /** Array version of: {@link #glColor4fv Color4fv}@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor4fv(float[] v);

    /** Array version of: {@link #glColor4dv Color4dv}@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor4dv(double[] v);

    /** Array version of: {@link #glColor4usv Color4usv}@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor4usv(short[] v);

    /** Array version of: {@link #glColor4uiv Color4uiv}@see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glColor4uiv(int[] v);

    /** Array version of: {@link #glDrawPixels DrawPixels}@see <a href="https://docs.gl/gl3/glDrawPixels">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glDrawPixels(int width, int height, int format, int type, short[] pixels);

    /** Array version of: {@link #glDrawPixels DrawPixels}@see <a href="https://docs.gl/gl3/glDrawPixels">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glDrawPixels(int width, int height, int format, int type, int[] pixels);

    /** Array version of: {@link #glDrawPixels DrawPixels}@see <a href="https://docs.gl/gl3/glDrawPixels">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glDrawPixels(int width, int height, int format, int type, float[] pixels);

    /** Array version of: {@link #glEvalCoord1fv EvalCoord1fv}@see <a href="https://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEvalCoord1fv(float[] u);

    /** Array version of: {@link #glEvalCoord1dv EvalCoord1dv}@see <a href="https://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEvalCoord1dv(double[] u);

    /** Array version of: {@link #glEvalCoord2fv EvalCoord2fv}@see <a href="https://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEvalCoord2fv(float[] u);

    /** Array version of: {@link #glEvalCoord2dv EvalCoord2dv}@see <a href="https://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glEvalCoord2dv(double[] u);

    /** Array version of: {@link #glFeedbackBuffer FeedbackBuffer}@see <a href="https://docs.gl/gl3/glFeedbackBuffer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glFeedbackBuffer(int type, float[] buffer);

    /** Array version of: {@link #glFogiv Fogiv}@see <a href="https://docs.gl/gl3/glFog">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glFogiv(int pname, int[] params);

    /** Array version of: {@link #glFogfv Fogfv}@see <a href="https://docs.gl/gl3/glFog">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glFogfv(int pname, float[] params);

    /** Array version of: {@link #glGenTextures GenTextures}@see <a href="https://docs.gl/gl4/glGenTextures">Reference Page</a>*/
    void glGenTextures(int[] textures);

    /** Array version of: {@link #glDeleteTextures DeleteTextures}@see <a href="https://docs.gl/gl4/glDeleteTextures">Reference Page</a>*/
    void glDeleteTextures(int[] textures);

    /** Array version of: {@link #glGetClipPlane GetClipPlane}@see <a href="https://docs.gl/gl3/glGetClipPlane">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetClipPlane(int plane, double[] equation);

    /** Array version of: {@link #glGetFloatv GetFloatv}@see <a href="https://docs.gl/gl4/glGetFloatv">Reference Page</a>*/
    void glGetFloatv(int pname, float[] params);

    /** Array version of: {@link #glGetIntegerv GetIntegerv}@see <a href="https://docs.gl/gl4/glGetIntegerv">Reference Page</a>*/
    void glGetIntegerv(int pname, int[] params);

    /** Array version of: {@link #glGetDoublev GetDoublev}@see <a href="https://docs.gl/gl4/glGetDoublev">Reference Page</a>*/
    void glGetDoublev(int pname, double[] params);

    /** Array version of: {@link #glGetLightiv GetLightiv}@see <a href="https://docs.gl/gl3/glGetLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetLightiv(int light, int pname, int[] data);

    /** Array version of: {@link #glGetLightfv GetLightfv}@see <a href="https://docs.gl/gl3/glGetLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetLightfv(int light, int pname, float[] data);

    /** Array version of: {@link #glGetMapiv GetMapiv}@see <a href="https://docs.gl/gl3/glGetMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetMapiv(int target, int query, int[] data);

    /** Array version of: {@link #glGetMapfv GetMapfv}@see <a href="https://docs.gl/gl3/glGetMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetMapfv(int target, int query, float[] data);

    /** Array version of: {@link #glGetMapdv GetMapdv}@see <a href="https://docs.gl/gl3/glGetMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetMapdv(int target, int query, double[] data);

    /** Array version of: {@link #glGetMaterialiv GetMaterialiv}@see <a href="https://docs.gl/gl3/glGetMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetMaterialiv(int face, int pname, int[] data);

    /** Array version of: {@link #glGetMaterialfv GetMaterialfv}@see <a href="https://docs.gl/gl3/glGetMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetMaterialfv(int face, int pname, float[] data);

    /** Array version of: {@link #glGetPixelMapfv GetPixelMapfv}@see <a href="https://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetPixelMapfv(int map, float[] data);

    /** Array version of: {@link #glGetPixelMapusv GetPixelMapusv}@see <a href="https://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetPixelMapusv(int map, short[] data);

    /** Array version of: {@link #glGetPixelMapuiv GetPixelMapuiv}@see <a href="https://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetPixelMapuiv(int map, int[] data);

    /** Array version of: {@link #glGetTexEnviv GetTexEnviv}@see <a href="https://docs.gl/gl3/glGetTexEnv">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetTexEnviv(int env, int pname, int[] data);

    /** Array version of: {@link #glGetTexEnvfv GetTexEnvfv}@see <a href="https://docs.gl/gl3/glGetTexEnv">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetTexEnvfv(int env, int pname, float[] data);

    /** Array version of: {@link #glGetTexGeniv GetTexGeniv}@see <a href="https://docs.gl/gl3/glGetTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetTexGeniv(int coord, int pname, int[] data);

    /** Array version of: {@link #glGetTexGenfv GetTexGenfv}@see <a href="https://docs.gl/gl3/glGetTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetTexGenfv(int coord, int pname, float[] data);

    /** Array version of: {@link #glGetTexGendv GetTexGendv}@see <a href="https://docs.gl/gl3/glGetTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glGetTexGendv(int coord, int pname, double[] data);

    /** Array version of: {@link #glGetTexImage GetTexImage}@see <a href="https://docs.gl/gl4/glGetTexImage">Reference Page</a>*/
    void glGetTexImage(int tex, int level, int format, int type, short[] pixels);

    /** Array version of: {@link #glGetTexImage GetTexImage}@see <a href="https://docs.gl/gl4/glGetTexImage">Reference Page</a>*/
    void glGetTexImage(int tex, int level, int format, int type, int[] pixels);

    /** Array version of: {@link #glGetTexImage GetTexImage}@see <a href="https://docs.gl/gl4/glGetTexImage">Reference Page</a>*/
    void glGetTexImage(int tex, int level, int format, int type, float[] pixels);

    /** Array version of: {@link #glGetTexImage GetTexImage}@see <a href="https://docs.gl/gl4/glGetTexImage">Reference Page</a>*/
    void glGetTexImage(int tex, int level, int format, int type, double[] pixels);

    /** Array version of: {@link #glGetTexLevelParameteriv GetTexLevelParameteriv}@see <a href="https://docs.gl/gl4/glGetTexLevelParameter">Reference Page</a>*/
    void glGetTexLevelParameteriv(int target, int level, int pname, int[] params);

    /** Array version of: {@link #glGetTexLevelParameterfv GetTexLevelParameterfv}@see <a href="https://docs.gl/gl4/glGetTexLevelParameter">Reference Page</a>*/
    void glGetTexLevelParameterfv(int target, int level, int pname, float[] params);

    /** Array version of: {@link #glGetTexParameteriv GetTexParameteriv}@see <a href="https://docs.gl/gl4/glGetTexParameter">Reference Page</a>*/
    void glGetTexParameteriv(int target, int pname, int[] params);

    /** Array version of: {@link #glGetTexParameterfv GetTexParameterfv}@see <a href="https://docs.gl/gl4/glGetTexParameter">Reference Page</a>*/
    void glGetTexParameterfv(int target, int pname, float[] params);

    /** Array version of: {@link #glIndexiv Indexiv}@see <a href="https://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glIndexiv(int[] index);

    /** Array version of: {@link #glIndexsv Indexsv}@see <a href="https://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glIndexsv(short[] index);

    /** Array version of: {@link #glIndexfv Indexfv}@see <a href="https://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glIndexfv(float[] index);

    /** Array version of: {@link #glIndexdv Indexdv}@see <a href="https://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glIndexdv(double[] index);

    /** Array version of: {@link #glInterleavedArrays InterleavedArrays}@see <a href="https://docs.gl/gl3/glInterleavedArrays">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glInterleavedArrays(int format, int stride, short[] pointer);

    /** Array version of: {@link #glInterleavedArrays InterleavedArrays}@see <a href="https://docs.gl/gl3/glInterleavedArrays">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glInterleavedArrays(int format, int stride, int[] pointer);

    /** Array version of: {@link #glInterleavedArrays InterleavedArrays}@see <a href="https://docs.gl/gl3/glInterleavedArrays">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glInterleavedArrays(int format, int stride, float[] pointer);

    /** Array version of: {@link #glInterleavedArrays InterleavedArrays}@see <a href="https://docs.gl/gl3/glInterleavedArrays">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glInterleavedArrays(int format, int stride, double[] pointer);

    /** Array version of: {@link #glLightModeliv LightModeliv}@see <a href="https://docs.gl/gl3/glLightModel">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLightModeliv(int pname, int[] params);

    /** Array version of: {@link #glLightModelfv LightModelfv}@see <a href="https://docs.gl/gl3/glLightModel">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLightModelfv(int pname, float[] params);

    /** Array version of: {@link #glLightiv Lightiv}@see <a href="https://docs.gl/gl3/glLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLightiv(int light, int pname, int[] params);

    /** Array version of: {@link #glLightfv Lightfv}@see <a href="https://docs.gl/gl3/glLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLightfv(int light, int pname, float[] params);

    /** Array version of: {@link #glLoadMatrixf LoadMatrixf}@see <a href="https://docs.gl/gl3/glLoadMatrixf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLoadMatrixf(float[] m);

    /** Array version of: {@link #glLoadMatrixd LoadMatrixd}@see <a href="https://docs.gl/gl3/glLoadMatrixd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glLoadMatrixd(double[] m);

    /** Array version of: {@link #glMap1f Map1f}@see <a href="https://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMap1f(int target, float u1, float u2, int stride, int order, float[] points);

    /** Array version of: {@link #glMap1d Map1d}@see <a href="https://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMap1d(int target, double u1, double u2, int stride, int order, double[] points);

    /** Array version of: {@link #glMap2f Map2f}@see <a href="https://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, float[] points);

    /** Array version of: {@link #glMap2d Map2d}@see <a href="https://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, double[] points);

    /** Array version of: {@link #glMaterialiv Materialiv}@see <a href="https://docs.gl/gl3/glMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMaterialiv(int face, int pname, int[] params);

    /** Array version of: {@link #glMaterialfv Materialfv}@see <a href="https://docs.gl/gl3/glMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMaterialfv(int face, int pname, float[] params);

    /** Array version of: {@link #glMultMatrixf MultMatrixf}@see <a href="https://docs.gl/gl3/glMultMatrixf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultMatrixf(float[] m);

    /** Array version of: {@link #glMultMatrixd MultMatrixd}@see <a href="https://docs.gl/gl3/glMultMatrixd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glMultMatrixd(double[] m);

    /** Array version of: {@link #glNormal3fv Normal3fv}@see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNormal3fv(float[] v);

    /** Array version of: {@link #glNormal3sv Normal3sv}@see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNormal3sv(short[] v);

    /** Array version of: {@link #glNormal3iv Normal3iv}@see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNormal3iv(int[] v);

    /** Array version of: {@link #glNormal3dv Normal3dv}@see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glNormal3dv(double[] v);

    /** Array version of: {@link #glPixelMapfv PixelMapfv}@see <a href="https://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPixelMapfv(int map, float[] values);

    /** Array version of: {@link #glPixelMapusv PixelMapusv}@see <a href="https://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPixelMapusv(int map, short[] values);

    /** Array version of: {@link #glPixelMapuiv PixelMapuiv}@see <a href="https://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPixelMapuiv(int map, int[] values);

    /** Array version of: {@link #glPrioritizeTextures PrioritizeTextures}@see <a href="https://docs.gl/gl3/glPrioritizeTextures">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glPrioritizeTextures(int[] textures, float[] priorities);

    /** Array version of: {@link #glRasterPos2iv RasterPos2iv}@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos2iv(int[] coords);

    /** Array version of: {@link #glRasterPos2sv RasterPos2sv}@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos2sv(short[] coords);

    /** Array version of: {@link #glRasterPos2fv RasterPos2fv}@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos2fv(float[] coords);

    /** Array version of: {@link #glRasterPos2dv RasterPos2dv}@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos2dv(double[] coords);

    /** Array version of: {@link #glRasterPos3iv RasterPos3iv}@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos3iv(int[] coords);

    /** Array version of: {@link #glRasterPos3sv RasterPos3sv}@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos3sv(short[] coords);

    /** Array version of: {@link #glRasterPos3fv RasterPos3fv}@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos3fv(float[] coords);

    /** Array version of: {@link #glRasterPos3dv RasterPos3dv}@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos3dv(double[] coords);

    /** Array version of: {@link #glRasterPos4iv RasterPos4iv}@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos4iv(int[] coords);

    /** Array version of: {@link #glRasterPos4sv RasterPos4sv}@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos4sv(short[] coords);

    /** Array version of: {@link #glRasterPos4fv RasterPos4fv}@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos4fv(float[] coords);

    /** Array version of: {@link #glRasterPos4dv RasterPos4dv}@see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRasterPos4dv(double[] coords);

    /** Array version of: {@link #glReadPixels ReadPixels}@see <a href="https://docs.gl/gl4/glReadPixels">Reference Page</a>*/
    void glReadPixels(int x, int y, int width, int height, int format, int type, short[] pixels);

    /** Array version of: {@link #glReadPixels ReadPixels}@see <a href="https://docs.gl/gl4/glReadPixels">Reference Page</a>*/
    void glReadPixels(int x, int y, int width, int height, int format, int type, int[] pixels);

    /** Array version of: {@link #glReadPixels ReadPixels}@see <a href="https://docs.gl/gl4/glReadPixels">Reference Page</a>*/
    void glReadPixels(int x, int y, int width, int height, int format, int type, float[] pixels);

    /** Array version of: {@link #glRectiv Rectiv}@see <a href="https://docs.gl/gl3/glRect">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRectiv(int[] v1, int[] v2);

    /** Array version of: {@link #glRectsv Rectsv}@see <a href="https://docs.gl/gl3/glRect">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRectsv(short[] v1, short[] v2);

    /** Array version of: {@link #glRectfv Rectfv}@see <a href="https://docs.gl/gl3/glRect">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRectfv(float[] v1, float[] v2);

    /** Array version of: {@link #glRectdv Rectdv}@see <a href="https://docs.gl/gl3/glRect">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glRectdv(double[] v1, double[] v2);

    /** Array version of: {@link #glSelectBuffer SelectBuffer}@see <a href="https://docs.gl/gl3/glSelectBuffer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glSelectBuffer(int[] buffer);

    /** Array version of: {@link #glTexCoord1fv TexCoord1fv}@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord1fv(float[] v);

    /** Array version of: {@link #glTexCoord1sv TexCoord1sv}@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord1sv(short[] v);

    /** Array version of: {@link #glTexCoord1iv TexCoord1iv}@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord1iv(int[] v);

    /** Array version of: {@link #glTexCoord1dv TexCoord1dv}@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord1dv(double[] v);

    /** Array version of: {@link #glTexCoord2fv TexCoord2fv}@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord2fv(float[] v);

    /** Array version of: {@link #glTexCoord2sv TexCoord2sv}@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord2sv(short[] v);

    /** Array version of: {@link #glTexCoord2iv TexCoord2iv}@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord2iv(int[] v);

    /** Array version of: {@link #glTexCoord2dv TexCoord2dv}@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord2dv(double[] v);

    /** Array version of: {@link #glTexCoord3fv TexCoord3fv}@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord3fv(float[] v);

    /** Array version of: {@link #glTexCoord3sv TexCoord3sv}@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord3sv(short[] v);

    /** Array version of: {@link #glTexCoord3iv TexCoord3iv}@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord3iv(int[] v);

    /** Array version of: {@link #glTexCoord3dv TexCoord3dv}@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord3dv(double[] v);

    /** Array version of: {@link #glTexCoord4fv TexCoord4fv}@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord4fv(float[] v);

    /** Array version of: {@link #glTexCoord4sv TexCoord4sv}@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord4sv(short[] v);

    /** Array version of: {@link #glTexCoord4iv TexCoord4iv}@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord4iv(int[] v);

    /** Array version of: {@link #glTexCoord4dv TexCoord4dv}@see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexCoord4dv(double[] v);

    /** Array version of: {@link #glTexEnviv TexEnviv}@see <a href="https://docs.gl/gl3/glTexEnv">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexEnviv(int target, int pname, int[] params);

    /** Array version of: {@link #glTexEnvfv TexEnvfv}@see <a href="https://docs.gl/gl3/glTexEnv">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexEnvfv(int target, int pname, float[] params);

    /** Array version of: {@link #glTexGeniv TexGeniv}@see <a href="https://docs.gl/gl3/glTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexGeniv(int coord, int pname, int[] params);

    /** Array version of: {@link #glTexGenfv TexGenfv}@see <a href="https://docs.gl/gl3/glTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexGenfv(int coord, int pname, float[] params);

    /** Array version of: {@link #glTexGendv TexGendv}@see <a href="https://docs.gl/gl3/glTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glTexGendv(int coord, int pname, double[] params);

    /** Array version of: {@link #glTexImage1D TexImage1D}@see <a href="https://docs.gl/gl4/glTexImage1D">Reference Page</a>*/
    void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, short[] pixels);

    /** Array version of: {@link #glTexImage1D TexImage1D}@see <a href="https://docs.gl/gl4/glTexImage1D">Reference Page</a>*/
    void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, int[] pixels);

    /** Array version of: {@link #glTexImage1D TexImage1D}@see <a href="https://docs.gl/gl4/glTexImage1D">Reference Page</a>*/
    void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, float[] pixels);

    /** Array version of: {@link #glTexImage1D TexImage1D}@see <a href="https://docs.gl/gl4/glTexImage1D">Reference Page</a>*/
    void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, double[] pixels);

    /** Array version of: {@link #glTexImage2D TexImage2D}@see <a href="https://docs.gl/gl4/glTexImage2D">Reference Page</a>*/
    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, short[] pixels);

    /** Array version of: {@link #glTexImage2D TexImage2D}@see <a href="https://docs.gl/gl4/glTexImage2D">Reference Page</a>*/
    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, int[] pixels);

    /** Array version of: {@link #glTexImage2D TexImage2D}@see <a href="https://docs.gl/gl4/glTexImage2D">Reference Page</a>*/
    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, float[] pixels);

    /** Array version of: {@link #glTexImage2D TexImage2D}@see <a href="https://docs.gl/gl4/glTexImage2D">Reference Page</a>*/
    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, double[] pixels);

    /** Array version of: {@link #glTexParameteriv TexParameteriv}@see <a href="https://docs.gl/gl4/glTexParameter">Reference Page</a>*/
    void glTexParameteriv(int target, int pname, int[] params);

    /** Array version of: {@link #glTexParameterfv TexParameterfv}@see <a href="https://docs.gl/gl4/glTexParameter">Reference Page</a>*/
    void glTexParameterfv(int target, int pname, float[] params);

    /** Array version of: {@link #glTexSubImage1D TexSubImage1D}@see <a href="https://docs.gl/gl4/glTexSubImage1D">Reference Page</a>*/
    void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, short[] pixels);

    /** Array version of: {@link #glTexSubImage1D TexSubImage1D}@see <a href="https://docs.gl/gl4/glTexSubImage1D">Reference Page</a>*/
    void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, int[] pixels);

    /** Array version of: {@link #glTexSubImage1D TexSubImage1D}@see <a href="https://docs.gl/gl4/glTexSubImage1D">Reference Page</a>*/
    void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, float[] pixels);

    /** Array version of: {@link #glTexSubImage1D TexSubImage1D}@see <a href="https://docs.gl/gl4/glTexSubImage1D">Reference Page</a>*/
    void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, double[] pixels);

    /** Array version of: {@link #glTexSubImage2D TexSubImage2D}@see <a href="https://docs.gl/gl4/glTexSubImage2D">Reference Page</a>*/
    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels);

    /** Array version of: {@link #glTexSubImage2D TexSubImage2D}@see <a href="https://docs.gl/gl4/glTexSubImage2D">Reference Page</a>*/
    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels);

    /** Array version of: {@link #glTexSubImage2D TexSubImage2D}@see <a href="https://docs.gl/gl4/glTexSubImage2D">Reference Page</a>*/
    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels);

    /** Array version of: {@link #glTexSubImage2D TexSubImage2D}@see <a href="https://docs.gl/gl4/glTexSubImage2D">Reference Page</a>*/
    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, double[] pixels);

    /** Array version of: {@link #glVertex2fv Vertex2fv}@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex2fv(float[] coords);

    /** Array version of: {@link #glVertex2sv Vertex2sv}@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex2sv(short[] coords);

    /** Array version of: {@link #glVertex2iv Vertex2iv}@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex2iv(int[] coords);

    /** Array version of: {@link #glVertex2dv Vertex2dv}@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex2dv(double[] coords);

    /** Array version of: {@link #glVertex3fv Vertex3fv}@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex3fv(float[] coords);

    /** Array version of: {@link #glVertex3sv Vertex3sv}@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex3sv(short[] coords);

    /** Array version of: {@link #glVertex3iv Vertex3iv}@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex3iv(int[] coords);

    /** Array version of: {@link #glVertex3dv Vertex3dv}@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex3dv(double[] coords);

    /** Array version of: {@link #glVertex4fv Vertex4fv}@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex4fv(float[] coords);

    /** Array version of: {@link #glVertex4sv Vertex4sv}@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex4sv(short[] coords);

    /** Array version of: {@link #glVertex4iv Vertex4iv}@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex4iv(int[] coords);

    /** Array version of: {@link #glVertex4dv Vertex4dv}@see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>*/
    void glVertex4dv(double[] coords);

}
