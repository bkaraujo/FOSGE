package br.fosge;

public record Triplet <C> (
        String name,
        Class<C> type,
        C value
) {
}
