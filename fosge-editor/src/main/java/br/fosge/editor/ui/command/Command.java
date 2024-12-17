package br.fosge.editor.ui.command;

import java.util.Map;

public interface Command {

    boolean execute(Map<String, ?> param);

}
