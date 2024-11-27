package br.fosge.runtime.scene.component;

import br.fosge.Meta;
import br.fosge.runtime.scene.Component;

public abstract class BehaviourComponent extends Component {

    public static BehaviourComponent create(br.fosge.runtime.configuration.api.Component component) {
        return Meta.instance(BehaviourComponent.class, find("target", component.properties()));
    }

}
