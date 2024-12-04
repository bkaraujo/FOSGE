package br.fosge.graphics;

public record Rectangle(
        int left,
        int right,
        int top,
        int bottom
) {
    public Rectangle (int top, int left) {
        this(left, left, top, top);
    }
}
