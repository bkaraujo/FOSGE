package br.fosge.editor.command;

import java.util.Map;

public interface Command {

    boolean execute(Map<String, ?> param);

}
