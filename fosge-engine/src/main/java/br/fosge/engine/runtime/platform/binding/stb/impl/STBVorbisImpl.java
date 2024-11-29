package br.fosge.engine.runtime.platform.binding.stb.impl;

import br.fosge.engine.runtime.platform.binding.stb.api.STBVorbis;
import org.lwjgl.PointerBuffer;
import org.lwjgl.stb.STBVorbisAlloc;
import org.lwjgl.stb.STBVorbisComment;
import org.lwjgl.stb.STBVorbisInfo;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public class STBVorbisImpl implements STBVorbis {

    public final STBVorbisInfo stb_vorbis_get_info(long f, STBVorbisInfo __result) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_get_info(f, __result);
    }

    public final STBVorbisComment stb_vorbis_get_comment(long f, STBVorbisComment __result) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_get_comment(f, __result);
    }

    public final int stb_vorbis_get_error(long f) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_get_error(f);
    }

    public final void stb_vorbis_close(long f) {
        org.lwjgl.stb.STBVorbis.stb_vorbis_close(f);
    }

    public final int stb_vorbis_get_sample_offset(long f) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_get_sample_offset(f);
    }

    public final int stb_vorbis_get_file_offset(long f) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_get_file_offset(f);
    }

    public final long stb_vorbis_open_pushdata(ByteBuffer datablock, IntBuffer datablock_memory_consumed_in_bytes, IntBuffer error, STBVorbisAlloc alloc_buffer) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_open_pushdata(datablock, datablock_memory_consumed_in_bytes, error, alloc_buffer);
    }

    public final int stb_vorbis_decode_frame_pushdata(long f, ByteBuffer datablock, IntBuffer channels, PointerBuffer output, IntBuffer samples) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_decode_frame_pushdata(f, datablock, channels, output, samples);
    }

    public final void stb_vorbis_flush_pushdata(long f) {
        org.lwjgl.stb.STBVorbis.stb_vorbis_flush_pushdata(f);
    }

    public final int stb_vorbis_decode_filename(ByteBuffer filename, IntBuffer channels, IntBuffer sample_rate, PointerBuffer output) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_decode_filename(filename, channels, sample_rate, output);
    }

    public final int stb_vorbis_decode_filename(CharSequence filename, IntBuffer channels, IntBuffer sample_rate, PointerBuffer output) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_decode_filename(filename, channels, sample_rate, output);
    }

    public final ShortBuffer stb_vorbis_decode_filename(CharSequence filename, IntBuffer channels, IntBuffer sample_rate) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_decode_filename(filename, channels, sample_rate);
    }

    public final int stb_vorbis_decode_memory(ByteBuffer mem, IntBuffer channels, IntBuffer sample_rate, PointerBuffer output) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_decode_memory(mem, channels, sample_rate, output);
    }

    public final ShortBuffer stb_vorbis_decode_memory(ByteBuffer mem, IntBuffer channels, IntBuffer sample_rate) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_decode_memory(mem, channels, sample_rate);
    }

    public final long stb_vorbis_open_memory(ByteBuffer mem, IntBuffer error, STBVorbisAlloc alloc_buffer) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_open_memory(mem, error, alloc_buffer);
    }

    public final long stb_vorbis_open_filename(ByteBuffer filename, IntBuffer error, STBVorbisAlloc alloc_buffer) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_open_filename(filename, error, alloc_buffer);
    }

    public final long stb_vorbis_open_filename(CharSequence filename, IntBuffer error, STBVorbisAlloc alloc_buffer) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_open_filename(filename, error, alloc_buffer);
    }

    public final boolean stb_vorbis_seek_frame(long f, int sample_number) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_seek_frame(f, sample_number);
    }

    public final boolean stb_vorbis_seek(long f, int sample_number) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_seek(f, sample_number);
    }

    public final boolean stb_vorbis_seek_start(long f) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_seek_start(f);
    }

    public final int stb_vorbis_stream_length_in_samples(long f) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_stream_length_in_samples(f);
    }

    public final float stb_vorbis_stream_length_in_seconds(long f) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_stream_length_in_seconds(f);
    }

    public final int stb_vorbis_get_frame_float(long f, IntBuffer channels, PointerBuffer output) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_get_frame_float(f, channels, output);
    }

    public final int stb_vorbis_get_frame_short(long f, PointerBuffer buffer, int num_samples) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_get_frame_short(f, buffer, num_samples);
    }

    public final int stb_vorbis_get_frame_short_interleaved(long f, int num_c, ShortBuffer buffer) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_get_frame_short_interleaved(f, num_c, buffer);
    }

    public final int stb_vorbis_get_samples_float(long f, PointerBuffer buffer, int num_samples) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_get_samples_float(f, buffer, num_samples);
    }

    public final int stb_vorbis_get_samples_float_interleaved(long f, int channels, FloatBuffer buffer) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_get_samples_float_interleaved(f, channels, buffer);
    }

    public final int stb_vorbis_get_samples_short(long f, PointerBuffer buffer, int num_samples) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_get_samples_short(f, buffer, num_samples);
    }

    public final int stb_vorbis_get_samples_short_interleaved(long f, int channels, ShortBuffer buffer) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_get_samples_short_interleaved(f, channels, buffer);
    }

    public final long stb_vorbis_open_pushdata(ByteBuffer datablock, int[] datablock_memory_consumed_in_bytes, int[] error, STBVorbisAlloc alloc_buffer) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_open_pushdata(datablock, datablock_memory_consumed_in_bytes, error, alloc_buffer);
    }

    public final int stb_vorbis_decode_frame_pushdata(long f, ByteBuffer datablock, int[] channels, PointerBuffer output, int[] samples) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_decode_frame_pushdata(f, datablock, channels, output, samples);
    }

    public final int stb_vorbis_decode_filename(ByteBuffer filename, int[] channels, int[] sample_rate, PointerBuffer output) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_decode_filename(filename, channels, sample_rate, output);
    }

    public final int stb_vorbis_decode_filename(CharSequence filename, int[] channels, int[] sample_rate, PointerBuffer output) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_decode_filename(filename, channels, sample_rate, output);
    }

    public final int stb_vorbis_decode_memory(ByteBuffer mem, int[] channels, int[] sample_rate, PointerBuffer output) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_decode_memory(mem, channels, sample_rate, output);
    }

    public final long stb_vorbis_open_memory(ByteBuffer mem, int[] error, STBVorbisAlloc alloc_buffer) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_open_memory(mem, error, alloc_buffer);
    }

    public final long stb_vorbis_open_filename(ByteBuffer filename, int[] error, STBVorbisAlloc alloc_buffer) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_open_filename(filename, error, alloc_buffer);
    }

    public final long stb_vorbis_open_filename(CharSequence filename, int[] error, STBVorbisAlloc alloc_buffer) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_open_filename(filename, error, alloc_buffer);
    }

    public final int stb_vorbis_get_frame_float(long f, int[] channels, PointerBuffer output) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_get_frame_float(f, channels, output);
    }

    public final int stb_vorbis_get_frame_short_interleaved(long f, int num_c, short[] buffer) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_get_frame_short_interleaved(f, num_c, buffer);
    }

    public final int stb_vorbis_get_samples_float_interleaved(long f, int channels, float[] buffer) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_get_samples_float_interleaved(f, channels, buffer);
    }

    public final int stb_vorbis_get_samples_short_interleaved(long f, int channels, short[] buffer) {
        return org.lwjgl.stb.STBVorbis.stb_vorbis_get_samples_short_interleaved(f, channels, buffer);
    }

}
