package br.fosge.runtime.platform.binding.stb.impl;

import org.lwjgl.PointerBuffer;
import org.lwjgl.stb.*;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public class STBImageImpl implements br.fosge.runtime.platform.binding.stb.api.STBImage {

    public final ByteBuffer stbi_load(ByteBuffer filename, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels) {
        return STBImage.stbi_load(filename, x, y, channels_in_file, desired_channels);
    }

    public final ByteBuffer stbi_load(CharSequence filename, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels) {
        return STBImage.stbi_load(filename, x, y, channels_in_file, desired_channels);
    }

    public final ByteBuffer stbi_load_from_memory(ByteBuffer buffer, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels) {
        return STBImage.stbi_load_from_memory(buffer, x, y, channels_in_file, desired_channels);
    }

    public final ByteBuffer stbi_load_from_callbacks(STBIIOCallbacks clbk, long user, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels) {
        return STBImage.stbi_load_from_callbacks(clbk, user, x, y, channels_in_file, desired_channels);
    }

    public final ByteBuffer stbi_load_gif_from_memory(ByteBuffer buffer, PointerBuffer delays, IntBuffer x, IntBuffer y, IntBuffer z, IntBuffer channels_in_file, int desired_channels) {
        return STBImage.stbi_load_gif_from_memory(buffer, delays, x, y, z, channels_in_file, desired_channels);
    }

    public final ShortBuffer stbi_load_16(ByteBuffer filename, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels) {
        return STBImage.stbi_load_16(filename, x, y, channels_in_file, desired_channels);
    }

    public final ShortBuffer stbi_load_16(CharSequence filename, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels) {
        return STBImage.stbi_load_16(filename, x, y, channels_in_file, desired_channels);
    }

    public final ShortBuffer stbi_load_16_from_memory(ByteBuffer buffer, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels) {
        return STBImage.stbi_load_16_from_memory(buffer, x, y, channels_in_file, desired_channels);
    }

    public final ShortBuffer stbi_load_16_from_callbacks(STBIIOCallbacks clbk, long user, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels) {
        return STBImage.stbi_load_16_from_callbacks(clbk, user, x, y, channels_in_file, desired_channels);
    }

    public final FloatBuffer stbi_loadf(ByteBuffer filename, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels) {
        return STBImage.stbi_loadf(filename, x, y, channels_in_file, desired_channels);
    }

    public final FloatBuffer stbi_loadf(CharSequence filename, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels) {
        return STBImage.stbi_loadf(filename, x, y, channels_in_file, desired_channels);
    }

    public final FloatBuffer stbi_loadf_from_memory(ByteBuffer buffer, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels) {
        return STBImage.stbi_loadf_from_memory(buffer, x, y, channels_in_file, desired_channels);
    }

    public final FloatBuffer stbi_loadf_from_callbacks(STBIIOCallbacks clbk, long user, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels) {
        return STBImage.stbi_loadf_from_callbacks(clbk, user, x, y, channels_in_file, desired_channels);
    }

    public final void stbi_hdr_to_ldr_gamma(float gamma) {
        STBImage.stbi_hdr_to_ldr_gamma(gamma);
    }

    public final void stbi_hdr_to_ldr_scale(float scale) {
        STBImage.stbi_hdr_to_ldr_scale(scale);
    }

    public final void stbi_ldr_to_hdr_gamma(float gamma) {
        STBImage.stbi_ldr_to_hdr_gamma(gamma);
    }

    public final void stbi_ldr_to_hdr_scale(float scale) {
        STBImage.stbi_ldr_to_hdr_scale(scale);
    }

    public final boolean stbi_is_hdr(ByteBuffer filename) {
        return STBImage.stbi_is_hdr(filename);
    }

    public final boolean stbi_is_hdr(CharSequence filename) {
        return STBImage.stbi_is_hdr(filename);
    }

    public final boolean stbi_is_hdr_from_memory(ByteBuffer buffer) {
        return STBImage.stbi_is_hdr_from_memory(buffer);
    }

    public final boolean stbi_is_hdr_from_callbacks(STBIIOCallbacks clbk, long user) {
        return STBImage.stbi_is_hdr_from_callbacks(clbk, user);
    }

    public final String stbi_failure_reason() {
        return STBImage.stbi_failure_reason();
    }

    public final void stbi_image_free(ByteBuffer retval_from_stbi_load) {
        STBImage.stbi_image_free(retval_from_stbi_load);
    }

    public final void stbi_image_free(ShortBuffer retval_from_stbi_load) {
        STBImage.stbi_image_free(retval_from_stbi_load);
    }

    public final void stbi_image_free(FloatBuffer retval_from_stbi_load) {
        STBImage.stbi_image_free(retval_from_stbi_load);
    }

    public final boolean stbi_info(ByteBuffer filename, IntBuffer x, IntBuffer y, IntBuffer comp) {
        return STBImage.stbi_info(filename, x, y, comp);
    }

    public final boolean stbi_info(CharSequence filename, IntBuffer x, IntBuffer y, IntBuffer comp) {
        return STBImage.stbi_info(filename, x, y, comp);
    }

    public final boolean stbi_info_from_memory(ByteBuffer buffer, IntBuffer x, IntBuffer y, IntBuffer comp) {
        return STBImage.stbi_info_from_memory(buffer, x, y, comp);
    }

    public final boolean stbi_info_from_callbacks(STBIIOCallbacks clbk, long user, IntBuffer x, IntBuffer y, IntBuffer comp) {
        return STBImage.stbi_info_from_callbacks(clbk, user, x, y, comp);
    }

    public final boolean stbi_is_16_bit(ByteBuffer filename) {
        return STBImage.stbi_is_16_bit(filename);
    }

    public final boolean stbi_is_16_bit(CharSequence filename) {
        return STBImage.stbi_is_16_bit(filename);
    }

    public final boolean stbi_is_16_bit_from_memory(ByteBuffer buffer) {
        return STBImage.stbi_is_16_bit_from_memory(buffer);
    }

    public final boolean stbi_is_16_bit_from_callbacks(STBIIOCallbacks clbk, long user) {
        return STBImage.stbi_is_16_bit_from_callbacks(clbk, user);
    }

    public final void stbi_set_unpremultiply_on_load(boolean flag_true_if_should_unpremultiply) {
        STBImage.stbi_set_unpremultiply_on_load(flag_true_if_should_unpremultiply);
    }

    public final void stbi_convert_iphone_png_to_rgb(boolean flag_true_if_should_convert) {
        STBImage.stbi_convert_iphone_png_to_rgb(flag_true_if_should_convert);
    }

    public final void stbi_set_flip_vertically_on_load(boolean flag_true_if_should_flip) {
        STBImage.stbi_set_flip_vertically_on_load(flag_true_if_should_flip);
    }

    public final void stbi_set_unpremultiply_on_load_thread(boolean flag_true_if_should_unpremultiply) {
        STBImage.stbi_set_unpremultiply_on_load_thread(flag_true_if_should_unpremultiply);
    }

    public final void stbi_convert_iphone_png_to_rgb_thread(boolean flag_true_if_should_convert) {
        STBImage.stbi_convert_iphone_png_to_rgb_thread(flag_true_if_should_convert);
    }

    public final void stbi_set_flip_vertically_on_load_thread(int flag_true_if_should_flip) {
        STBImage.stbi_set_flip_vertically_on_load_thread(flag_true_if_should_flip);
    }

    public final ByteBuffer stbi_zlib_decode_malloc_guesssize(ByteBuffer buffer, int initial_size) {
        return STBImage.stbi_zlib_decode_malloc_guesssize(buffer, initial_size);
    }

    public final ByteBuffer stbi_zlib_decode_malloc_guesssize_headerflag(ByteBuffer buffer, int initial_size, boolean parse_header) {
        return STBImage.stbi_zlib_decode_malloc_guesssize_headerflag(buffer, initial_size, parse_header);
    }

    public final ByteBuffer stbi_zlib_decode_malloc(ByteBuffer buffer) {
        return STBImage.stbi_zlib_decode_malloc(buffer);
    }

    public final int stbi_zlib_decode_buffer(ByteBuffer obuffer, ByteBuffer ibuffer) {
        return STBImage.stbi_zlib_decode_buffer(obuffer, ibuffer);
    }

    public final ByteBuffer stbi_zlib_decode_noheader_malloc(ByteBuffer buffer) {
        return STBImage.stbi_zlib_decode_noheader_malloc(buffer);
    }

    public final int stbi_zlib_decode_noheader_buffer(ByteBuffer obuffer, ByteBuffer ibuffer) {
        return STBImage.stbi_zlib_decode_noheader_buffer(obuffer, ibuffer);
    }

    public final ByteBuffer stbi_load(ByteBuffer filename, int[] x, int[] y, int[] channels_in_file, int desired_channels) {
        return STBImage.stbi_load(filename, x, y, channels_in_file, desired_channels);
    }

    public final ByteBuffer stbi_load(CharSequence filename, int[] x, int[] y, int[] channels_in_file, int desired_channels) {
        return STBImage.stbi_load(filename, x, y, channels_in_file, desired_channels);
    }

    public final ByteBuffer stbi_load_from_memory(ByteBuffer buffer, int[] x, int[] y, int[] channels_in_file, int desired_channels) {
        return STBImage.stbi_load_from_memory(buffer, x, y, channels_in_file, desired_channels);
    }

    public final ByteBuffer stbi_load_from_callbacks(STBIIOCallbacks clbk, long user, int[] x, int[] y, int[] channels_in_file, int desired_channels) {
        return STBImage.stbi_load_from_callbacks(clbk, user, x, y, channels_in_file, desired_channels);
    }

    public final ByteBuffer stbi_load_gif_from_memory(ByteBuffer buffer, PointerBuffer delays, int[] x, int[] y, int[] z, int[] channels_in_file, int desired_channels) {
        return STBImage.stbi_load_gif_from_memory(buffer, delays, x, y, z, channels_in_file, desired_channels);
    }

    public final ShortBuffer stbi_load_16(ByteBuffer filename, int[] x, int[] y, int[] channels_in_file, int desired_channels) {
        return STBImage.stbi_load_16(filename, x, y, channels_in_file, desired_channels);
    }

    public final ShortBuffer stbi_load_16(CharSequence filename, int[] x, int[] y, int[] channels_in_file, int desired_channels) {
        return STBImage.stbi_load_16(filename, x, y, channels_in_file, desired_channels);
    }

    public final ShortBuffer stbi_load_16_from_memory(ByteBuffer buffer, int[] x, int[] y, int[] channels_in_file, int desired_channels) {
        return STBImage.stbi_load_16_from_memory(buffer, x, y, channels_in_file, desired_channels);
    }

    public final ShortBuffer stbi_load_16_from_callbacks(STBIIOCallbacks clbk, long user, int[] x, int[] y, int[] channels_in_file, int desired_channels) {
        return STBImage.stbi_load_16_from_callbacks(clbk, user, x, y, channels_in_file, desired_channels);
    }

    public final FloatBuffer stbi_loadf(ByteBuffer filename, int[] x, int[] y, int[] channels_in_file, int desired_channels) {
        return STBImage.stbi_loadf(filename, x, y, channels_in_file, desired_channels);
    }

    public final FloatBuffer stbi_loadf(CharSequence filename, int[] x, int[] y, int[] channels_in_file, int desired_channels) {
        return STBImage.stbi_loadf(filename, x, y, channels_in_file, desired_channels);
    }

    public final FloatBuffer stbi_loadf_from_memory(ByteBuffer buffer, int[] x, int[] y, int[] channels_in_file, int desired_channels) {
        return STBImage.stbi_loadf_from_memory(buffer, x, y, channels_in_file, desired_channels);
    }

    public final FloatBuffer stbi_loadf_from_callbacks(STBIIOCallbacks clbk, long user, int[] x, int[] y, int[] channels_in_file, int desired_channels) {
        return STBImage.stbi_loadf_from_callbacks(clbk, user, x, y, channels_in_file, desired_channels);
    }

    public final boolean stbi_info(ByteBuffer filename, int[] x, int[] y, int[] comp) {
        return STBImage.stbi_info(filename, x, y, comp);
    }

    public final boolean stbi_info(CharSequence filename, int[] x, int[] y, int[] comp) {
        return STBImage.stbi_info(filename, x, y, comp);
    }

    public final boolean stbi_info_from_memory(ByteBuffer buffer, int[] x, int[] y, int[] comp) {
        return STBImage.stbi_info_from_memory(buffer, x, y, comp);
    }

    public final boolean stbi_info_from_callbacks(STBIIOCallbacks clbk, long user, int[] x, int[] y, int[] comp) {
        return STBImage.stbi_info_from_callbacks(clbk, user, x, y, comp);
    }


    public final ByteBuffer stbir_resize_uint8_srgb(ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_type) {
        return STBImageResize.stbir_resize_uint8_srgb(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_type);
    }

    public final ByteBuffer stbir_resize_uint8_srgb(ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_type, long length) {
        return STBImageResize.stbir_resize_uint8_srgb(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_type, length);
    }

    public final ByteBuffer stbir_resize_uint8_linear(ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_type) {
        return STBImageResize.stbir_resize_uint8_linear(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_type);
    }

    public final ByteBuffer stbir_resize_uint8_linear(ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_type, long length) {
        return STBImageResize.stbir_resize_uint8_linear(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_type, length);
    }

    public final FloatBuffer stbir_resize_float_linear(FloatBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, FloatBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_type) {
        return STBImageResize.stbir_resize_float_linear(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_type);
    }

    public final FloatBuffer stbir_resize_float_linear(FloatBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, FloatBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_type, long length) {
        return STBImageResize.stbir_resize_float_linear(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_type, length);
    }

    public final ByteBuffer stbir_resize(ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_layout, int data_type, int edge, int filter) {
        return STBImageResize.stbir_resize(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_layout, data_type, edge, filter);
    }

    public final ByteBuffer stbir_resize(ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_layout, int data_type, int edge, int filter, long length) {
        return STBImageResize.stbir_resize(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_layout, data_type, edge, filter, length);
    }

    public final void stbir_resize_init(STBIR_RESIZE resize, ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_layout, int data_type) {
        STBImageResize.stbir_resize_init(resize, input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_layout, data_type);
    }

    public final void stbir_set_datatypes(STBIR_RESIZE resize, int input_type, int output_type) {
        STBImageResize.stbir_set_datatypes(resize, input_type, output_type);
    }

    public final void stbir_set_pixel_callbacks(STBIR_RESIZE resize, STBIRInputCallbackI input_cb, STBIROutputCallbackI output_cb) {
        STBImageResize.stbir_set_pixel_callbacks(resize, input_cb, output_cb);
    }

    public final void stbir_set_user_data(STBIR_RESIZE resize, long user_data) {
        STBImageResize.stbir_set_user_data(resize, user_data);
    }

    public final void stbir_set_buffer_ptrs(STBIR_RESIZE resize, ByteBuffer input_pixels, int input_stride_in_bytes, ByteBuffer output_pixels, int output_stride_in_bytes) {
        STBImageResize.stbir_set_buffer_ptrs(resize, input_pixels, input_stride_in_bytes, output_pixels, output_stride_in_bytes);
    }

    public final int stbir_set_pixel_layouts(STBIR_RESIZE resize, int input_pixel_layout, int output_pixel_layout) {
        return STBImageResize.stbir_set_pixel_layouts(resize, input_pixel_layout, output_pixel_layout);
    }

    public final int stbir_set_edgemodes(STBIR_RESIZE resize, int horizontal_edge, int vertical_edge) {
        return STBImageResize.stbir_set_edgemodes(resize, horizontal_edge, vertical_edge);
    }

    public final int stbir_set_filters(STBIR_RESIZE resize, int horizontal_filter, int vertical_filter) {
        return STBImageResize.stbir_set_filters(resize, horizontal_filter, vertical_filter);
    }

    public final int stbir_set_filter_callbacks(STBIR_RESIZE resize, STBIRKernelCallbackI horizontal_filter, STBIRSupportCallbackI horizontal_support, STBIRKernelCallbackI vertical_filter, STBIRSupportCallbackI vertical_support) {
        return STBImageResize.stbir_set_filter_callbacks(resize, horizontal_filter, horizontal_support, vertical_filter, vertical_support);
    }

    public final int stbir_set_pixel_subrect(STBIR_RESIZE resize, int subx, int suby, int subw, int subh) {
        return STBImageResize.stbir_set_pixel_subrect(resize, subx, suby, subw, subh);
    }

    public final int stbir_set_input_subrect(STBIR_RESIZE resize, double s0, double t0, double s1, double t1) {
        return STBImageResize.stbir_set_input_subrect(resize, s0, t0, s1, t1);
    }

    public final int stbir_set_output_pixel_subrect(STBIR_RESIZE resize, int subx, int suby, int subw, int subh) {
        return STBImageResize.stbir_set_output_pixel_subrect(resize, subx, suby, subw, subh);
    }

    public final int stbir_set_non_pm_alpha_speed_over_quality(STBIR_RESIZE resize, boolean non_pma_alpha_speed_over_quality) {
        return STBImageResize.stbir_set_non_pm_alpha_speed_over_quality(resize, non_pma_alpha_speed_over_quality);
    }

    public final int stbir_build_samplers(STBIR_RESIZE resize) {
        return STBImageResize.stbir_build_samplers(resize);
    }

    public final void stbir_free_samplers(STBIR_RESIZE resize) {
        STBImageResize.stbir_free_samplers(resize);
    }

    public final int stbir_resize_extended(STBIR_RESIZE resize) {
        return STBImageResize.stbir_resize_extended(resize);
    }

    public final int stbir_build_samplers_with_splits(STBIR_RESIZE resize, int try_splits) {
        return STBImageResize.stbir_build_samplers_with_splits(resize, try_splits);
    }

    public final int stbir_resize_extended_split(STBIR_RESIZE resize, int split_start, int split_count) {
        return STBImageResize.stbir_resize_extended_split(resize, split_start, split_count);
    }


    public final boolean stbi_write_png(ByteBuffer filename, int w, int h, int comp, ByteBuffer data, int stride_in_bytes) {
        return STBImageWrite.stbi_write_png(filename, w, h, comp, data, stride_in_bytes);
    }

    public final boolean stbi_write_png(CharSequence filename, int w, int h, int comp, ByteBuffer data, int stride_in_bytes) {
        return STBImageWrite.stbi_write_png(filename, w, h, comp, data, stride_in_bytes);
    }

    public final boolean stbi_write_bmp(ByteBuffer filename, int w, int h, int comp, ByteBuffer data) {
        return STBImageWrite.stbi_write_bmp(filename, w, h, comp, data);
    }

    public final boolean stbi_write_bmp(CharSequence filename, int w, int h, int comp, ByteBuffer data) {
        return STBImageWrite.stbi_write_bmp(filename, w, h, comp, data);
    }

    public final boolean stbi_write_tga(ByteBuffer filename, int w, int h, int comp, ByteBuffer data) {
        return STBImageWrite.stbi_write_tga(filename, w, h, comp, data);
    }

    public final boolean stbi_write_tga(CharSequence filename, int w, int h, int comp, ByteBuffer data) {
        return STBImageWrite.stbi_write_tga(filename, w, h, comp, data);
    }

    public final boolean stbi_write_hdr(ByteBuffer filename, int w, int h, int comp, FloatBuffer data) {
        return STBImageWrite.stbi_write_hdr(filename, w, h, comp, data);
    }

    public final boolean stbi_write_hdr(CharSequence filename, int w, int h, int comp, FloatBuffer data) {
        return STBImageWrite.stbi_write_hdr(filename, w, h, comp, data);
    }

    public final boolean stbi_write_jpg(ByteBuffer filename, int w, int h, int comp, ByteBuffer data, int quality) {
        return STBImageWrite.stbi_write_jpg(filename, w, h, comp, data, quality);
    }

    public final boolean stbi_write_jpg(CharSequence filename, int w, int h, int comp, ByteBuffer data, int quality) {
        return STBImageWrite.stbi_write_jpg(filename, w, h, comp, data, quality);
    }

    public final boolean stbi_write_png_to_func(STBIWriteCallbackI func, long context, int w, int h, int comp, ByteBuffer data, int stride_in_bytes) {
        return STBImageWrite.stbi_write_png_to_func(func, context, w, h, comp, data, stride_in_bytes);
    }

    public final boolean stbi_write_bmp_to_func(STBIWriteCallbackI func, long context, int w, int h, int comp, ByteBuffer data) {
        return STBImageWrite.stbi_write_bmp_to_func(func, context, w, h, comp, data);
    }

    public final boolean stbi_write_tga_to_func(STBIWriteCallbackI func, long context, int w, int h, int comp, ByteBuffer data) {
        return STBImageWrite.stbi_write_tga_to_func(func, context, w, h, comp, data);
    }

    public final boolean stbi_write_hdr_to_func(STBIWriteCallbackI func, long context, int w, int h, int comp, FloatBuffer data) {
        return STBImageWrite.stbi_write_hdr_to_func(func, context, w, h, comp, data);
    }

    public final int stbi_write_jpg_to_func(STBIWriteCallbackI func, long context, int w, int h, int comp, ByteBuffer data, int quality) {
        return STBImageWrite.stbi_write_jpg_to_func(func, context, w, h, comp, data, quality);
    }

    public final void stbi_flip_vertically_on_write(boolean flip_boolean) {
        STBImageWrite.stbi_flip_vertically_on_write(flip_boolean);
    }

    public final boolean stbi_write_hdr(ByteBuffer filename, int w, int h, int comp, float[] data) {
        return STBImageWrite.stbi_write_hdr(filename, w, h, comp, data);
    }

    public final boolean stbi_write_hdr(CharSequence filename, int w, int h, int comp, float[] data) {
        return STBImageWrite.stbi_write_hdr(filename, w, h, comp, data);
    }

    public final boolean stbi_write_hdr_to_func(STBIWriteCallbackI func, long context, int w, int h, int comp, float[] data) {
        return STBImageWrite.stbi_write_hdr_to_func(func, context, w, h, comp, data);
    }

}
