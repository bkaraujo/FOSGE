package br.fosge.runtime.platform.binding._generator.api;

import com.sun.source.doctree.DocCommentTree;
import com.sun.source.tree.VariableTree;

public final class SourceAttribute {

    public String docstring;
    public String modifiers;
    public String type;
    public String name;
    public String defaultValue;

    private SourceAttribute() {}

    public static SourceAttribute from(VariableTree tree, DocCommentTree docTree) {
        final var attribute = new SourceAttribute();
        attribute.name = tree.getName().toString();
        attribute.type = tree.getType().toString();

        final var modifiers = tree.getModifiers();
        if (modifiers != null) { attribute.modifiers = modifiers.toString().replace("\r\n", " ").trim(); }

        if (docTree != null) { attribute.docstring = docTree.toString(); }

        final var initializer = tree.getInitializer();
        if (initializer != null) {
            attribute.defaultValue = initializer.toString();
        }

        return attribute;
    }

}
