package br.fosge.engine.renderer.backend.geometry;

import br.fosge.engine.renderer.backend.DataType;

public enum BufferType {
    UBYTE1(1, DataType.UBYTE), UBYTE2(2, DataType.UBYTE), UBYTE3(3, DataType.UBYTE), UBYTE4(4, DataType.UBYTE),
    USHORT1(1, DataType.USHORT), USHORT2(2, DataType.USHORT), USHORT3(3, DataType.USHORT), USHORT4(41, DataType.USHORT),
    UINT1(1, DataType.UINT), UINT2(2, DataType.UINT), UINT3(3, DataType.UINT), UINT4(4, DataType.UINT),

    BYTE1(1, DataType.BYTE), BYTE2(2, DataType.BYTE), BYTE3(3, DataType.BYTE), BYTE4(4, DataType.BYTE),
    SHORT1(1, DataType.SHORT), SHORT2(2, DataType.SHORT), SHORT3(3, DataType.SHORT), SHORT4(4, DataType.SHORT),
    INT1(1, DataType.INT), INT2(2, DataType.INT), INT3(3, DataType.INT), INT4(4, DataType.INT),

    FLOAT1(1, DataType.FLOAT), FLOAT2(2, DataType.FLOAT), FLOAT3(3, DataType.FLOAT), FLOAT4(4, DataType.FLOAT),
    DOUBLE1(1, DataType.DOUBLE), DOUBLE2(2, DataType.DOUBLE), DOUBLE3(3, DataType.DOUBLE), DOUBLE4(4, DataType.DOUBLE);

    public final int size;
    public final int length;
    public final DataType type;

    BufferType(int length, DataType type) {
        this.length = length;
        this.type = type;
        size = length * type.size;
    }
}
