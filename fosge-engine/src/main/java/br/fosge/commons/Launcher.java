package br.fosge.commons;

import br.fosge.commons.annotation.Lifecycle;

public abstract class Launcher implements Lifecycle {

    public abstract boolean run();

}
