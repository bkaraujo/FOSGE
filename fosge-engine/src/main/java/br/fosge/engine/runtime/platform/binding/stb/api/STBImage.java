package br.fosge.engine.runtime.platform.binding.stb.api;

import org.lwjgl.PointerBuffer;
import org.lwjgl.stb.STBIIOCallbacks;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public interface STBImage extends STBImageWrite, STBImageResize {

    /** Component count.  <h5>Enum values:</h5>  <ul> <li>{@link #STBI_default default} - Default component count, used as an argument to {@code desired_channels}.</li> <li>{@link #STBI_grey grey}</li> <li>{@link #STBI_grey_alpha grey_alpha}</li> <li>{@link #STBI_rgb rgb}</li> <li>{@link #STBI_rgb_alpha rgb_alpha}</li> </ul>*/
    int STBI_default = 0;

    /** Component count.  <h5>Enum values:</h5>  <ul> <li>{@link #STBI_default default} - Default component count, used as an argument to {@code desired_channels}.</li> <li>{@link #STBI_grey grey}</li> <li>{@link #STBI_grey_alpha grey_alpha}</li> <li>{@link #STBI_rgb rgb}</li> <li>{@link #STBI_rgb_alpha rgb_alpha}</li> </ul>*/
    int STBI_grey = 1;

    /** Component count.  <h5>Enum values:</h5>  <ul> <li>{@link #STBI_default default} - Default component count, used as an argument to {@code desired_channels}.</li> <li>{@link #STBI_grey grey}</li> <li>{@link #STBI_grey_alpha grey_alpha}</li> <li>{@link #STBI_rgb rgb}</li> <li>{@link #STBI_rgb_alpha rgb_alpha}</li> </ul>*/
    int STBI_grey_alpha = 2;

    /** Component count.  <h5>Enum values:</h5>  <ul> <li>{@link #STBI_default default} - Default component count, used as an argument to {@code desired_channels}.</li> <li>{@link #STBI_grey grey}</li> <li>{@link #STBI_grey_alpha grey_alpha}</li> <li>{@link #STBI_rgb rgb}</li> <li>{@link #STBI_rgb_alpha rgb_alpha}</li> </ul>*/
    int STBI_rgb = 3;

    /** Component count.  <h5>Enum values:</h5>  <ul> <li>{@link #STBI_default default} - Default component count, used as an argument to {@code desired_channels}.</li> <li>{@link #STBI_grey grey}</li> <li>{@link #STBI_grey_alpha grey_alpha}</li> <li>{@link #STBI_rgb rgb}</li> <li>{@link #STBI_rgb_alpha rgb_alpha}</li> </ul>*/
    int STBI_rgb_alpha = 4;

    /** Loads an image from the specified file.  <p>The return value from an image loader is an {@code 'unsigned char *'} which points to the pixel data, or {@code NULL} on an allocation failure or if the image is corrupt or invalid. The pixel data consists of {@code *y} scanlines of {@code *x} pixels, with each pixel consisting of N interleaved 8-bit components; the first pixel pointed to is top-left-most in the image. There is no padding between image scanlines or between pixels, regardless of format. The number of components N is {@code 'desired_channels'} if {@code desired_channels} is non-zero, or {@code *channels_in_file} otherwise. If {@code desired_channels} is non-zero, {@code *channels_in_file} has the number of components that <i>would</i> have been output otherwise. E.g. if you set {@code desired_channels} to 4, you will always get RGBA output, but you can check {@code *channels_in_file} to see if it's trivially opaque because e.g. there were only 3 channels in the source image.</p>  <p>An output image with N components has the following components interleaved in this order in each pixel:</p>  <pre><code> N=#channels_in_file     components   1                     grey   2                     grey, alpha   3                     red, green, blue   4                     red, green, blue, alpha</code></pre>  <p>If image loading fails for any reason, the return value will be {@code NULL}, and {@code *x}, {@code *y}, {@code *channels_in_file} will be unchanged. The function {@link #stbi_failure_reason failure_reason} can be queried for an extremely brief, end-user unfriendly explanation of why the load failed.</p>  <p>Paletted PNG, BMP, GIF, and PIC images are automatically depalettized.</p>  <p>To query the width, height and component count of an image without having to decode the full file, you can use the {@code stbi_info} family of functions:</p>  <pre><code> int x,y,n,ok; ok = stbi_info(filename, &amp;x, &amp;y, &amp;n); // returns ok=1 and sets x, y, n if image is a supported format, // 0 otherwise.</code></pre>  <p>Note that stb_image pervasively uses {@code ints} in its public API for sizes, including sizes of memory buffers. This is now part of the API and thus hard to change without causing breakage. As a result, the various image loaders all have certain limits on image size; these differ somewhat by format but generally boil down to either just under 2GB or just under 1GB. When the decoded image would be larger than this, stb_image decoding will fail.</p>  <p>Additionally, stb_image will reject image files that have any of their dimensions set to a larger value than the configurable {@code STBI_MAX_DIMENSIONS}, which defaults to {@code 2**24 = 16777216} pixels. Due to the above memory limit, the only way to have an image with such dimensions load correctly is for it to have a rather extreme aspect ratio. Either way, the assumption here is that such larger images are likely to be malformed or malicious. If you do need to load an image with individual dimensions larger than that, and it still fits in the overall size limit, you can {@code #define STBI_MAX_DIMENSIONS} on your own to be something larger.</p>@param filename the file name@param x outputs the image width in pixels@param y outputs the image height in pixels@param channels_in_file outputs number of components in image@param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>*/
    ByteBuffer stbi_load(ByteBuffer filename, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels);

    /** Loads an image from the specified file.  <p>The return value from an image loader is an {@code 'unsigned char *'} which points to the pixel data, or {@code NULL} on an allocation failure or if the image is corrupt or invalid. The pixel data consists of {@code *y} scanlines of {@code *x} pixels, with each pixel consisting of N interleaved 8-bit components; the first pixel pointed to is top-left-most in the image. There is no padding between image scanlines or between pixels, regardless of format. The number of components N is {@code 'desired_channels'} if {@code desired_channels} is non-zero, or {@code *channels_in_file} otherwise. If {@code desired_channels} is non-zero, {@code *channels_in_file} has the number of components that <i>would</i> have been output otherwise. E.g. if you set {@code desired_channels} to 4, you will always get RGBA output, but you can check {@code *channels_in_file} to see if it's trivially opaque because e.g. there were only 3 channels in the source image.</p>  <p>An output image with N components has the following components interleaved in this order in each pixel:</p>  <pre><code> N=#channels_in_file     components   1                     grey   2                     grey, alpha   3                     red, green, blue   4                     red, green, blue, alpha</code></pre>  <p>If image loading fails for any reason, the return value will be {@code NULL}, and {@code *x}, {@code *y}, {@code *channels_in_file} will be unchanged. The function {@link #stbi_failure_reason failure_reason} can be queried for an extremely brief, end-user unfriendly explanation of why the load failed.</p>  <p>Paletted PNG, BMP, GIF, and PIC images are automatically depalettized.</p>  <p>To query the width, height and component count of an image without having to decode the full file, you can use the {@code stbi_info} family of functions:</p>  <pre><code> int x,y,n,ok; ok = stbi_info(filename, &amp;x, &amp;y, &amp;n); // returns ok=1 and sets x, y, n if image is a supported format, // 0 otherwise.</code></pre>  <p>Note that stb_image pervasively uses {@code ints} in its public API for sizes, including sizes of memory buffers. This is now part of the API and thus hard to change without causing breakage. As a result, the various image loaders all have certain limits on image size; these differ somewhat by format but generally boil down to either just under 2GB or just under 1GB. When the decoded image would be larger than this, stb_image decoding will fail.</p>  <p>Additionally, stb_image will reject image files that have any of their dimensions set to a larger value than the configurable {@code STBI_MAX_DIMENSIONS}, which defaults to {@code 2**24 = 16777216} pixels. Due to the above memory limit, the only way to have an image with such dimensions load correctly is for it to have a rather extreme aspect ratio. Either way, the assumption here is that such larger images are likely to be malformed or malicious. If you do need to load an image with individual dimensions larger than that, and it still fits in the overall size limit, you can {@code #define STBI_MAX_DIMENSIONS} on your own to be something larger.</p>@param filename the file name@param x outputs the image width in pixels@param y outputs the image height in pixels@param channels_in_file outputs number of components in image@param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>*/
    ByteBuffer stbi_load(CharSequence filename, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels);

    /** In-memory version of {@link #stbi_load load}.@param buffer the buffer from which to load the image data@param x outputs the image width in pixels@param y outputs the image height in pixels@param channels_in_file outputs number of components in image@param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>*/
    ByteBuffer stbi_load_from_memory(ByteBuffer buffer, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels);

    /** Callback version of {@link #stbi_load load}.  <p>I/O callbacks allow you to read from arbitrary sources, like packaged files or some other source. Data read from callbacks are processed through a small internal buffer (currently 128 bytes) to try to reduce overhead.</p>  <p>The three functions you must define are "read" (reads some bytes of data), "skip" (skips some bytes of data), "eof" (reports if the stream is at the end).</p>@param clbk an {@link STBIIOCallbacks} struct@param user a pointer to user data@param x outputs the image width in pixels@param y outputs the image height in pixels@param channels_in_file outputs number of components in image@param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>*/
    ByteBuffer stbi_load_from_callbacks(STBIIOCallbacks clbk, long user, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels);

    /** gif version of {@link #stbi_load_from_memory load_from_memory}.@param buffer the buffer from which to load the image data@param delays output the delays of each layer in the image@param x outputs the image width in pixels@param y outputs the image height in pixels@param z outputs the number of layers in the image@param channels_in_file outputs number of components in image@param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>*/
    ByteBuffer stbi_load_gif_from_memory(ByteBuffer buffer, PointerBuffer delays, IntBuffer x, IntBuffer y, IntBuffer z, IntBuffer channels_in_file, int desired_channels);

    /** 16-bits-per-channel version of {@link #stbi_load load}.@param filename the file name@param x outputs the image width in pixels@param y outputs the image height in pixels@param channels_in_file outputs number of components in image@param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>*/
    ShortBuffer stbi_load_16(ByteBuffer filename, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels);

    /** 16-bits-per-channel version of {@link #stbi_load load}.@param filename the file name@param x outputs the image width in pixels@param y outputs the image height in pixels@param channels_in_file outputs number of components in image@param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>*/
    ShortBuffer stbi_load_16(CharSequence filename, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels);

    /** In-memory version of {@link #stbi_load_16 load_16}.@param buffer the buffer from which to load the image data@param x outputs the image width in pixels@param y outputs the image height in pixels@param channels_in_file outputs number of components in image@param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>*/
    ShortBuffer stbi_load_16_from_memory(ByteBuffer buffer, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels);

    /** Callback version of {@link #stbi_load_16 load_16}.@param clbk an {@link STBIIOCallbacks} struct@param user a pointer to user data@param x outputs the image width in pixels@param y outputs the image height in pixels@param channels_in_file outputs number of components in image@param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>*/
    ShortBuffer stbi_load_16_from_callbacks(STBIIOCallbacks clbk, long user, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels);

    /** Floating-point version of {@link #stbi_load load}.@param filename the file name@param x outputs the image width in pixels@param y outputs the image height in pixels@param channels_in_file outputs number of components in image@param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>*/
    FloatBuffer stbi_loadf(ByteBuffer filename, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels);

    /** Floating-point version of {@link #stbi_load load}.@param filename the file name@param x outputs the image width in pixels@param y outputs the image height in pixels@param channels_in_file outputs number of components in image@param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>*/
    FloatBuffer stbi_loadf(CharSequence filename, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels);

    /** Floating-point version of {@link #stbi_load_from_memory load_from_memory}.@param buffer the buffer from which to load the image data@param x outputs the image width in pixels@param y outputs the image height in pixels@param channels_in_file outputs number of components in image@param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>*/
    FloatBuffer stbi_loadf_from_memory(ByteBuffer buffer, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels);

    /** Floating-point version of {@link #stbi_load_from_callbacks load_from_callbacks}.@param clbk an {@link STBIIOCallbacks} struct@param user a pointer to user data@param x outputs the image width in pixels@param y outputs the image height in pixels@param channels_in_file outputs number of components in image@param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>*/
    FloatBuffer stbi_loadf_from_callbacks(STBIIOCallbacks clbk, long user, IntBuffer x, IntBuffer y, IntBuffer channels_in_file, int desired_channels);

    /** Changes the gamma value used when converting HDR images to LDR. The default value is 2.2f@param gamma the gamma value*/
    void stbi_hdr_to_ldr_gamma(float gamma);

    /** Changes the scale factor used when converting HDR images to LDR. The default value is 1.0f@param scale the scale factor*/
    void stbi_hdr_to_ldr_scale(float scale);

    /** Changes the gamma value used when converting LDR images to HDR. The default value is 2.2f@param gamma the gamma value*/
    void stbi_ldr_to_hdr_gamma(float gamma);

    /** Changes the scale value used when converting LDR images to HDR. The default value is 1.0f@param scale the scale factor*/
    void stbi_ldr_to_hdr_scale(float scale);

    /** Checks if the specified file contains an HDR image.@param filename the file name@return 1 if the image is HDR, 0 otherwise*/
    boolean stbi_is_hdr(ByteBuffer filename);

    /** Checks if the specified file contains an HDR image.@param filename the file name@return 1 if the image is HDR, 0 otherwise*/
    boolean stbi_is_hdr(CharSequence filename);

    /** In-memory version of {@link #stbi_is_hdr is_hdr}.@param buffer the buffer from which to load the image data*/
    boolean stbi_is_hdr_from_memory(ByteBuffer buffer);

    /** Callback version of {@link #stbi_is_hdr is_hdr}.@param clbk an {@link STBIIOCallbacks} struct@param user a pointer to user data*/
    boolean stbi_is_hdr_from_callbacks(STBIIOCallbacks clbk, long user);

    /** Returns a brief reason for failure.*/
    String stbi_failure_reason();

    /** Frees a loaded image@param retval_from_stbi_load an stb image*/
    void stbi_image_free(ByteBuffer retval_from_stbi_load);

    /** Frees a loaded image@param retval_from_stbi_load an stb image*/
    void stbi_image_free(ShortBuffer retval_from_stbi_load);

    /** Frees a loaded image@param retval_from_stbi_load an stb image*/
    void stbi_image_free(FloatBuffer retval_from_stbi_load);

    /** Returns image dimensions &amp; components without fully decoding the image.@param filename the file name@param x outputs the image width in pixels@param y outputs the image height in pixels@param comp outputs number of components in image@return 1 on success, 0 on failure*/
    boolean stbi_info(ByteBuffer filename, IntBuffer x, IntBuffer y, IntBuffer comp);

    /** Returns image dimensions &amp; components without fully decoding the image.@param filename the file name@param x outputs the image width in pixels@param y outputs the image height in pixels@param comp outputs number of components in image@return 1 on success, 0 on failure*/
    boolean stbi_info(CharSequence filename, IntBuffer x, IntBuffer y, IntBuffer comp);

    /** In-memory version of {@link #stbi_info info}.@param buffer the buffer from which to load the image data@param x outputs the image width in pixels@param y outputs the image height in pixels@param comp outputs number of components in image*/
    boolean stbi_info_from_memory(ByteBuffer buffer, IntBuffer x, IntBuffer y, IntBuffer comp);

    /** Callback version of {@link #stbi_info info}.@param clbk an {@link STBIIOCallbacks} struct@param user a pointer to user data@param x outputs the image width in pixels@param y outputs the image height in pixels@param comp outputs number of components in image*/
    boolean stbi_info_from_callbacks(STBIIOCallbacks clbk, long user, IntBuffer x, IntBuffer y, IntBuffer comp);

    /** Returns {@code true} if the file contains a 16-bit image.@param filename the file name*/
    boolean stbi_is_16_bit(ByteBuffer filename);

    /** Returns {@code true} if the file contains a 16-bit image.@param filename the file name*/
    boolean stbi_is_16_bit(CharSequence filename);

    /** In-memory version of {@link #stbi_is_16_bit is_16_bit}.@param buffer the buffer from which to load the image data*/
    boolean stbi_is_16_bit_from_memory(ByteBuffer buffer);

    /** Callback version of {@link #stbi_is_16_bit is_16_bit}.@param clbk an {@link STBIIOCallbacks} struct@param user a pointer to user data*/
    boolean stbi_is_16_bit_from_callbacks(STBIIOCallbacks clbk, long user);

    /** For image formats that explicitly notate that they have premultiplied alpha, we just return the colors as stored in the file. Set this flag to force unpremultiplication. Results are undefined if the unpremultiply overflows.@param flag_true_if_should_unpremultiply the unpremultiply flag*/
    void stbi_set_unpremultiply_on_load(boolean flag_true_if_should_unpremultiply);

    /** Indicate whether we should process iPhone images back to canonical format, or just pass them through "as-is".@param flag_true_if_should_convert the convert iPhone PNG to RGB flag*/
    void stbi_convert_iphone_png_to_rgb(boolean flag_true_if_should_convert);

    /** Flips the image vertically, so the first pixel in the output array is the bottom left.@param flag_true_if_should_flip the flip vertically on load flag*/
    void stbi_set_flip_vertically_on_load(boolean flag_true_if_should_flip);

    /** As {@link #stbi_set_unpremultiply_on_load set_unpremultiply_on_load}, but only applies to images loaded on the thread that calls the function.*/
    void stbi_set_unpremultiply_on_load_thread(boolean flag_true_if_should_unpremultiply);

    /** As {@link #stbi_convert_iphone_png_to_rgb convert_iphone_png_to_rgb}, but only applies to images loaded on the thread that calls the function.*/
    void stbi_convert_iphone_png_to_rgb_thread(boolean flag_true_if_should_convert);

    /** As {@link #stbi_set_flip_vertically_on_load set_flip_vertically_on_load}, but only applies to images loaded on the thread that calls the function.@param flag_true_if_should_flip the flip vertically on load flag*/
    void stbi_set_flip_vertically_on_load_thread(int flag_true_if_should_flip);

    /** ZLIB client - used by PNG, available for other purposes*/
    ByteBuffer stbi_zlib_decode_malloc_guesssize(ByteBuffer buffer, int initial_size);

    /** ZLIB client - used by PNG, available for other purposes*/
    ByteBuffer stbi_zlib_decode_malloc_guesssize_headerflag(ByteBuffer buffer, int initial_size, boolean parse_header);

    /** ZLIB client - used by PNG, available for other purposes*/
    ByteBuffer stbi_zlib_decode_malloc(ByteBuffer buffer);

    /** ZLIB client - used by PNG, available for other purposes*/
    int stbi_zlib_decode_buffer(ByteBuffer obuffer, ByteBuffer ibuffer);

    /** ZLIB client - used by PNG, available for other purposes*/
    ByteBuffer stbi_zlib_decode_noheader_malloc(ByteBuffer buffer);

    /** ZLIB client - used by PNG, available for other purposes*/
    int stbi_zlib_decode_noheader_buffer(ByteBuffer obuffer, ByteBuffer ibuffer);

    /** Array version of: {@link #stbi_load load}*/
    ByteBuffer stbi_load(ByteBuffer filename, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_load load}*/
    ByteBuffer stbi_load(CharSequence filename, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_load_from_memory load_from_memory}*/
    ByteBuffer stbi_load_from_memory(ByteBuffer buffer, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_load_from_callbacks load_from_callbacks}*/
    ByteBuffer stbi_load_from_callbacks(STBIIOCallbacks clbk, long user, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_load_gif_from_memory load_gif_from_memory}*/
    ByteBuffer stbi_load_gif_from_memory(ByteBuffer buffer, PointerBuffer delays, int[] x, int[] y, int[] z, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_load_16 load_16}*/
    ShortBuffer stbi_load_16(ByteBuffer filename, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_load_16 load_16}*/
    ShortBuffer stbi_load_16(CharSequence filename, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_load_16_from_memory load_16_from_memory}*/
    ShortBuffer stbi_load_16_from_memory(ByteBuffer buffer, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_load_16_from_callbacks load_16_from_callbacks}*/
    ShortBuffer stbi_load_16_from_callbacks(STBIIOCallbacks clbk, long user, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_loadf loadf}*/
    FloatBuffer stbi_loadf(ByteBuffer filename, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_loadf loadf}*/
    FloatBuffer stbi_loadf(CharSequence filename, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_loadf_from_memory loadf_from_memory}*/
    FloatBuffer stbi_loadf_from_memory(ByteBuffer buffer, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_loadf_from_callbacks loadf_from_callbacks}*/
    FloatBuffer stbi_loadf_from_callbacks(STBIIOCallbacks clbk, long user, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_info info}*/
    boolean stbi_info(ByteBuffer filename, int[] x, int[] y, int[] comp);

    /** Array version of: {@link #stbi_info info}*/
    boolean stbi_info(CharSequence filename, int[] x, int[] y, int[] comp);

    /** Array version of: {@link #stbi_info_from_memory info_from_memory}*/
    boolean stbi_info_from_memory(ByteBuffer buffer, int[] x, int[] y, int[] comp);

    /** Array version of: {@link #stbi_info_from_callbacks info_from_callbacks}*/
    boolean stbi_info_from_callbacks(STBIIOCallbacks clbk, long user, int[] x, int[] y, int[] comp);

}
