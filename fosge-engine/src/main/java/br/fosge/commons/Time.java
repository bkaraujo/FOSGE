package br.fosge.commons;

public abstract class Time {

    public static long millis() {
        return System.currentTimeMillis();
    }

    public static long nanos() {
        return System.nanoTime();
    }

    public static double seconds() {
        return System.currentTimeMillis() * 1e-3d;
    }

}
