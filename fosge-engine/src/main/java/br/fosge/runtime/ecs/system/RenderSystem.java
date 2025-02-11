package br.fosge.runtime.ecs.system;

import br.fosge.engine.ecs.ECS;
import br.fosge.engine.ecs.System;
import br.fosge.engine.renderer.frontend.MeshComponent;
import br.fosge.runtime.renderer.Renderer;

public final class RenderSystem implements System {

    @Override
    public void onRest() {

        for (final var component : ECS.list(MeshComponent.class)) {
            Renderer.submit(component.owner.transform(), component);
        }
    }
}
