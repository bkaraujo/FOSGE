package br.fosge.editor.ui.component;

import br.fosge.MessageBus;
import br.fosge.editor.ui.event.UIBeepEvent;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public final class JLimitedDocument extends PlainDocument {
    private final int limit;

    public JLimitedDocument(int desired) {
        limit = desired;
    }

    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null || (getLength() + str.length()) > limit) {
            MessageBus.submit(new UIBeepEvent());
            return;
        }

        super.insertString(offset, str, attr);
    }
}
