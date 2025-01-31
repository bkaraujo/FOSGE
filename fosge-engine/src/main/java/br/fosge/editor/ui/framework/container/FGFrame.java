package br.fosge.editor.ui.framework.container;

import br.fosge.commons.annotation.Lifecycle;

import javax.swing.*;

public abstract class FGFrame extends JFrame implements Lifecycle {

    protected FGFrame() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
