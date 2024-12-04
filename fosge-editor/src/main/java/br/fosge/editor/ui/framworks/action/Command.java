package br.fosge.editor.ui.framworks.action;

import java.util.Map;

public interface Command {

    boolean execute(Map<String, Object> params);

}
