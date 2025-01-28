package br.fosge.commons;

public record StackFrame(
        String className,
        int lineNumber
) {
    @Override
    public String toString() {
        return "at " + className + ":" + lineNumber;
    }
}
