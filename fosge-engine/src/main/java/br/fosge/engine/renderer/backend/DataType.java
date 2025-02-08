package br.fosge.engine.renderer.backend;

public enum DataType {
    UBYTE(true, Byte.BYTES),
    USHORT(true, Short.BYTES),
    UINT(true, Integer.BYTES),

    BYTE(false, Byte.BYTES),
    SHORT(false, Short.BYTES),
    INT(false, Integer.BYTES),

    FLOAT(false, Float.BYTES),
    DOUBLE(false, Double.BYTES);

    public final int size;
    public final boolean unsigned;

    DataType(boolean unsigned, int size) {
        this.unsigned = unsigned;
        this.size = size;
    }
}
