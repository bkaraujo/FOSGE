package br.fosge.commons;

public record Version(
        int major,
        int minor,
        int revision
) {

    public int grouped() {
        return major * 1000 + minor * 100 + revision;
    }

    public String toString() {
        return major + "." + minor + "." + revision;
    }

}
