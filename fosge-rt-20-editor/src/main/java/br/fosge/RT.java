package br.fosge;

import br.fosge.commons.annotation.State;
import br.fosge.commons.serializer.Yaml;

public abstract class RT implements State {

    private RT() {}

    /** Main settings of the running application */
    public static Yaml yaml;
}
