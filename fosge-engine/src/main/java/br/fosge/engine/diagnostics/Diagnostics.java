package br.fosge.engine.diagnostics;

public abstract class Diagnostics {

    private Diagnostics() {/* Private constructor */}

    public static long offHeap;

    public static int graphicsVertexArray;
    public static int graphicsBuffer;
    public static int graphicsTexture;
    public static int graphicsShader;
    public static int graphicsShaderStage;

    public static int audioBuffer;
    public static short audioMonoSource;
    public static byte audioStereoSource;

}
