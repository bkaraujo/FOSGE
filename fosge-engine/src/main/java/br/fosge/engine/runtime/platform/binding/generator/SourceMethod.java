package br.fosge.engine.runtime.platform.binding.generator;

import com.sun.source.doctree.DocCommentTree;
import com.sun.source.tree.MethodTree;

import java.util.ArrayList;
import java.util.List;

public final class SourceMethod {

    public String docstring;
    public String modifiers;
    public String returnType;
    public String name;
    public final List<SourceAttribute> parameters = new ArrayList<>();

    private SourceMethod() {}

    public static SourceMethod from(MethodTree tree, DocCommentTree docTree) {
        final var method = new SourceMethod();
        method.name = tree.getName().toString().trim();

        final var returnType = tree.getReturnType();
        if (returnType != null) { method.returnType = returnType.toString().trim(); }

        final var methodModifiers = tree.getModifiers();
        if (methodModifiers != null) { method.modifiers = methodModifiers.toString().replace("\r\n", " ").trim(); }

        method.parameters.addAll(
                tree
                        .getParameters()
                        .stream()
                        .map(variable -> SourceAttribute.from(variable, null))
                        .toList()
        );

        if (docTree != null) { method.docstring = docTree.toString().trim(); }

        return method;
    }

}
