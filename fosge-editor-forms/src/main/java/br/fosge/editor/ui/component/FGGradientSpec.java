package br.fosge.editor.ui.component;

import br.fosge.annotation.Specification;

import java.awt.*;

public record FGGradientSpec(
        Color start,
        float solid,
        float transition,
        Color end
) implements Specification {
}
