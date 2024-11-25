package br.fosge.runtime.platform.binding.stb.api;

import org.lwjgl.stb.STBIWriteCallbackI;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

public interface STBImageWrite {

    /** Writes a PNR image file.  <p>PNG creates output files with the same number of components as the input.</p>  <p>PNG supports writing rectangles of data even when the bytes storing rows of data are not consecutive in memory (e.g. sub-rectangles of a larger image), by supplying the stride between the beginning of adjacent rows. The other formats do not. (Thus you cannot write a native-format BMP through the BMP writer, both because it is in BGR order and because it may have padding at the end of the line.)</p>  <p>PNG allows you to set the deflate compression level by setting the global variable {@link #stbi_write_png_compression_level write_png_compression_level} (it defaults to 8).</p>@param filename the image file path@param w the image width, in pixels@param h the image height, in pixels@param comp the number of channels in each pixel@param data the image data@param stride_in_bytes the distance in bytes from the first byte of a row of pixels to the first byte of the next row of pixels@return 1 on success, 0 on failure*/
    boolean stbi_write_png(ByteBuffer filename, int w, int h, int comp, ByteBuffer data, int stride_in_bytes);

    /** Writes a PNR image file.  <p>PNG creates output files with the same number of components as the input.</p>  <p>PNG supports writing rectangles of data even when the bytes storing rows of data are not consecutive in memory (e.g. sub-rectangles of a larger image), by supplying the stride between the beginning of adjacent rows. The other formats do not. (Thus you cannot write a native-format BMP through the BMP writer, both because it is in BGR order and because it may have padding at the end of the line.)</p>  <p>PNG allows you to set the deflate compression level by setting the global variable {@link #stbi_write_png_compression_level write_png_compression_level} (it defaults to 8).</p>@param filename the image file path@param w the image width, in pixels@param h the image height, in pixels@param comp the number of channels in each pixel@param data the image data@param stride_in_bytes the distance in bytes from the first byte of a row of pixels to the first byte of the next row of pixels@return 1 on success, 0 on failure*/
    boolean stbi_write_png(CharSequence filename, int w, int h, int comp, ByteBuffer data, int stride_in_bytes);

    /** Writes a BMP image file.  <p>The BMP format expands Y to RGB in the file format and does not output alpha.</p>@param filename the image file path@param w the image width, in pixels@param h the image height, in pixels@param comp the number of channels in each pixel@param data the image data@return 1 on success, 0 on failure*/
    boolean stbi_write_bmp(ByteBuffer filename, int w, int h, int comp, ByteBuffer data);

    /** Writes a BMP image file.  <p>The BMP format expands Y to RGB in the file format and does not output alpha.</p>@param filename the image file path@param w the image width, in pixels@param h the image height, in pixels@param comp the number of channels in each pixel@param data the image data@return 1 on success, 0 on failure*/
    boolean stbi_write_bmp(CharSequence filename, int w, int h, int comp, ByteBuffer data);

    /** Writes a TGA image file.  <p>TGA supports RLE or non-RLE compressed data. To use non-RLE-compressed data, set the global variable {@code stbi_write_tga_with_rle} to 0. The variable can be accessed with {@link #stbi_write_tga_with_rle write_tga_with_rle}.</p>@param filename the image file path@param w the image width, in pixels@param h the image height, in pixels@param comp the number of channels in each pixel@param data the image data@return 1 on success, 0 on failure*/
    boolean stbi_write_tga(ByteBuffer filename, int w, int h, int comp, ByteBuffer data);

    /** Writes a TGA image file.  <p>TGA supports RLE or non-RLE compressed data. To use non-RLE-compressed data, set the global variable {@code stbi_write_tga_with_rle} to 0. The variable can be accessed with {@link #stbi_write_tga_with_rle write_tga_with_rle}.</p>@param filename the image file path@param w the image width, in pixels@param h the image height, in pixels@param comp the number of channels in each pixel@param data the image data@return 1 on success, 0 on failure*/
    boolean stbi_write_tga(CharSequence filename, int w, int h, int comp, ByteBuffer data);

    /** Writes an HDR image file.  <p>HDR expects linear float data. Since the format is always 32-bit rgb(e) data, alpha (if provided) is discarded, and for monochrome data it is replicated across all three channels.</p>@param filename the image file path@param w the image width, in pixels@param h the image height, in pixels@param comp the number of channels in each pixel@param data the image data@return 1 on success, 0 on failure*/
    boolean stbi_write_hdr(ByteBuffer filename, int w, int h, int comp, FloatBuffer data);

    /** Writes an HDR image file.  <p>HDR expects linear float data. Since the format is always 32-bit rgb(e) data, alpha (if provided) is discarded, and for monochrome data it is replicated across all three channels.</p>@param filename the image file path@param w the image width, in pixels@param h the image height, in pixels@param comp the number of channels in each pixel@param data the image data@return 1 on success, 0 on failure*/
    boolean stbi_write_hdr(CharSequence filename, int w, int h, int comp, FloatBuffer data);

    /** Writes a JPEG image file.  <p>JPEG does ignore alpha channels in input data; quality is between 1 and 100. Higher quality looks better but results in a bigger image. JPEG baseline (no JPEG progressive).</p>@param filename the image file path@param w the image width, in pixels@param h the image height, in pixels@param comp the number of channels in each pixel@param data the image data@param quality the compression quality@return 1 on success, 0 on failure*/
    boolean stbi_write_jpg(ByteBuffer filename, int w, int h, int comp, ByteBuffer data, int quality);

    /** Writes a JPEG image file.  <p>JPEG does ignore alpha channels in input data; quality is between 1 and 100. Higher quality looks better but results in a bigger image. JPEG baseline (no JPEG progressive).</p>@param filename the image file path@param w the image width, in pixels@param h the image height, in pixels@param comp the number of channels in each pixel@param data the image data@param quality the compression quality@return 1 on success, 0 on failure*/
    boolean stbi_write_jpg(CharSequence filename, int w, int h, int comp, ByteBuffer data, int quality);

    /** Callback version of {@link #stbi_write_png write_png}.@param func the callback function@param context a context that will be passed to {@code func}@param w the image width, in pixels@param h the image height, in pixels@param comp the number of channels in each pixel@param data the image data@param stride_in_bytes the distance in bytes from the first byte of a row of pixels to the first byte of the next row of pixels@return 1 on success, 0 on failure*/
    boolean stbi_write_png_to_func(STBIWriteCallbackI func, long context, int w, int h, int comp, ByteBuffer data, int stride_in_bytes);

    /** Callback version of {@link #stbi_write_bmp write_bmp}.@param func the callback function@param context a context that will be passed to {@code func}@param w the image width, in pixels@param h the image height, in pixels@param comp the number of channels in each pixel@param data the image data@return 1 on success, 0 on failure*/
    boolean stbi_write_bmp_to_func(STBIWriteCallbackI func, long context, int w, int h, int comp, ByteBuffer data);

    /** Callback version of {@link #stbi_write_tga write_tga}.@param func the callback function@param context a context that will be passed to {@code func}@param w the image width, in pixels@param h the image height, in pixels@param comp the number of channels in each pixel@param data the image data@return 1 on success, 0 on failure*/
    boolean stbi_write_tga_to_func(STBIWriteCallbackI func, long context, int w, int h, int comp, ByteBuffer data);

    /** Callback version of {@link #stbi_write_hdr write_hdr}.@param func the callback function@param context a context that will be passed to {@code func}@param w the image width, in pixels@param h the image height, in pixels@param comp the number of channels in each pixel@param data the image data@return 1 on success, 0 on failure*/
    boolean stbi_write_hdr_to_func(STBIWriteCallbackI func, long context, int w, int h, int comp, FloatBuffer data);

    /** Callback version of {@link #stbi_write_jpg write_jpg}.@param func the callback function@param context a context that will be passed to {@code func}@param w the image width, in pixels@param h the image height, in pixels@param comp the number of channels in each pixel@param data the image data@param quality the compression quality@return 1 on success, 0 on failure*/
    int stbi_write_jpg_to_func(STBIWriteCallbackI func, long context, int w, int h, int comp, ByteBuffer data, int quality);

    /** Configures if the written image should flipped vertically.@param flip_boolean true to flip data vertically*/
    void stbi_flip_vertically_on_write(boolean flip_boolean);

    /** Array version of: {@link #stbi_write_hdr write_hdr}*/
    boolean stbi_write_hdr(ByteBuffer filename, int w, int h, int comp, float[] data);

    /** Array version of: {@link #stbi_write_hdr write_hdr}*/
    boolean stbi_write_hdr(CharSequence filename, int w, int h, int comp, float[] data);

    /** Array version of: {@link #stbi_write_hdr_to_func write_hdr_to_func}*/
    boolean stbi_write_hdr_to_func(STBIWriteCallbackI func, long context, int w, int h, int comp, float[] data);

}
