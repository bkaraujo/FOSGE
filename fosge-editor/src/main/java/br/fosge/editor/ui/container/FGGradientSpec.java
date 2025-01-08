package br.fosge.editor.ui.container;

import br.fosge.commons.annotation.Specification;

import java.awt.*;

public record FGGradientSpec(
        Color start,
        float solid,
        float transition,
        Color end
) implements Specification {
}
