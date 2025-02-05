package br.fosge.engine.renderer;

import br.fosge.commons.serializer.Yaml;
import br.fosge.engine.renderer.frontend.Camera;

import javax.annotation.Nullable;

public interface CameraFactory {

    @Nullable
    Camera create(@Nullable final Yaml yaml);

}
