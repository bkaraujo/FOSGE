package br.fosge.editor.ui.framworks.action;

import br.fosge.Triplet;

import java.util.List;

public interface Command {

    boolean execute(List<Triplet<?>> parameters);

}
