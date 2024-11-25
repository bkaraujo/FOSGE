package br.fosge.runtime.platform;

public abstract class Platform {
    public static final PlatformWindow window = new PlatformWindow();
    public static final PlatformGraphics graphics = new PlatformGraphics();
    public static final PlatformAudio audio = new PlatformAudio();
    public static final PlatformNetwork network = new PlatformNetwork();
    public static final PlatformFilesystem filesystem = new PlatformFilesystem();

    private Platform() { /* Private constructor */ }

}
