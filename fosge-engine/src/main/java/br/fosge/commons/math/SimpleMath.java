package br.fosge.commons.math;

public abstract class SimpleMath {
    private SimpleMath() {/* Private constructor */}

    public static float percentageOf(float percentage, float value) {

        return value * (percentage / 100.0f);
    }

}
