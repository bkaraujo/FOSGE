package br.fosge.runtime.platform;

import br.fosge.annotation.Specification;
import br.fosge.graphics.Resolution;
import br.fosge.runtime.platform.graphics.GraphicsSpec;
import br.fosge.runtime.platform.window.WindowSpec;

public record PlatformSpec (
        String windowTitle,
        Resolution windowResolution,
        boolean vsync
) implements Specification {

    public WindowSpec window() {
        return new WindowSpec(windowTitle, windowResolution);
    }

    public GraphicsSpec graphics() {
        return new GraphicsSpec(vsync);
    }
}
