package br.fosge.commons;

import javax.annotation.Nullable;
import java.text.DecimalFormatSymbols;

public abstract class Strings {

    @Nullable
    public static String toTitleCase(@Nullable final String text) {
        if (text == null || text.isEmpty()) { return text; }

        boolean next = true;
        final var result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isSpaceChar(ch)) { next = true; }
            else if (next) { ch = Character.toTitleCase(ch); next = false; }
            else { ch = Character.toLowerCase(ch); }

            result.append(ch);
        }

        return result.toString();
    }

    public static boolean isNumeric(@Nullable String input) {
        if(input == null || input.trim().isBlank()) return false;

        final var isNegative = input.charAt(0) == DecimalFormatSymbols.getInstance().getMinusSign();
        if (isNegative && input.length() == 1) return false;

        var isDecimalSeparatorFound = false;
        final var separator = DecimalFormatSymbols.getInstance().getDecimalSeparator();

        for (var i = isNegative ? 1 : 0; i < input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) {
                if(!isDecimalSeparatorFound && input.charAt(i) == separator) {
                    isDecimalSeparatorFound = true;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    @Nullable
    public static byte[] bytes(@Nullable String name) {
        if (name == null || name.isEmpty()) { return null; }
        final var tokens = name.split(",");

        final var values = new byte[tokens.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = Byte.parseByte(tokens[i].trim());
        }

        return values;
    }

    @Nullable
    public static short[] shorts(@Nullable String name) {
        if (name == null || name.isEmpty()) { return null; }
        final var tokens = name.split(",");

        final var values = new short[tokens.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = Short.parseShort(tokens[i].trim());
        }

        return values;
    }

    @Nullable
    public static int[] ints(@Nullable String name) {
        if (name == null || name.isEmpty()) { return null; }
        final var tokens = name.split(",");

        final var values = new int[tokens.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(tokens[i].trim());
        }

        return values;
    }

    @Nullable
    public static long[] longs(@Nullable String name) {
        if (name == null || name.isEmpty()) { return null; }
        final var tokens = name.split(",");

        final var values = new long[tokens.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = Long.parseLong(tokens[i].trim());
        }

        return values;
    }

    @Nullable
    public static float[] floats(@Nullable String name) {
        if (name == null || name.isEmpty()) { return null; }
        final var tokens = name.split(",");

        final var values = new float[tokens.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = Float.parseFloat(tokens[i].trim());
        }

        return values;
    }

    @Nullable
    public static double[] doubles(@Nullable String name) {
        if (name == null || name.isEmpty()) { return null; }
        final var tokens = name.split(",");

        final var values = new double[tokens.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = Double.parseDouble(tokens[i].trim());
        }

        return values;
    }
}
