package br.fosge.commons.math;

public abstract class SimpleMath {
    private SimpleMath() {}

    public static float percentageOf(float percentage, float value) {
        return value * (percentage / 100.0f);
    }

}
