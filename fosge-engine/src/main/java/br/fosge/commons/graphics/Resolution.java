package br.fosge.commons.graphics;

public enum Resolution {
    nHD(640,360),
    qHD(960, 540),
    HD(1280, 720),
    HDp(1600, 900),
    FHD(1920, 1080),
    QHD(2560, 1440),
    UHD(3840, 2160);

    public final int width;
    public final int height;

    Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
