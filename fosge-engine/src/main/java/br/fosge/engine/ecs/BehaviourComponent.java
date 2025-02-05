package br.fosge.engine.ecs;

import br.fosge.RT;
import br.fosge.engine.renderer.OnFrame;
import br.fosge.engine.renderer.TransformComponent;

public abstract class BehaviourComponent extends Component implements OnFrame {
    protected final TransformComponent transform = RT.Factory.component.transform();

}
