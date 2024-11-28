package br.fosge.engine.runtime.platform.binding.ast;

import br.fosge.engine.runtime.platform.binding.api.SourceAttribute;
import br.fosge.engine.runtime.platform.binding.api.SourceFile;
import br.fosge.engine.runtime.platform.binding.api.SourceMethod;
import br.fosge.engine.runtime.platform.binding.api.SourcePackage;
import com.sun.source.doctree.DocCommentTree;
import com.sun.source.tree.*;
import com.sun.source.util.DocTrees;
import com.sun.source.util.TreePathScanner;

public final class SourceScanner extends TreePathScanner<Void,Void> {
    private final DocTrees docTrees;
    private final SourceFile file;

    public SourceScanner(final DocTrees docTrees, SourceFile file) {
        this.docTrees = docTrees;
        this.file = file;
    }

    @Override
    public Void visitPackage(PackageTree node, Void unused) {
        file.packageDeclaration = SourcePackage.from(node, doctree());
        return super.visitPackage(node, unused);
    }

    @Override
    public Void visitImport(ImportTree node, Void unused) {
        file.imports.add(node.getQualifiedIdentifier().toString().trim());
        return super.visitImport(node, unused);
    }

    @Override
    public Void visitClass(ClassTree tree, Void p) {
        final var modifiers = tree.getModifiers();
        if (modifiers != null) { file.modifiers = modifiers.toString().replace("\r\n", " ").trim(); }

        final var extendsClause = tree.getExtendsClause();
        if (extendsClause != null) { file.extendsClause = extendsClause.toString().replace("\r\n", " ").trim(); }

        final var implementsClause = tree.getImplementsClause();
        if (implementsClause != null) { file.implementsClause = implementsClause.toString().replace("\r\n", " ").trim(); }

        final var docs = doctree();
        if (docs != null) { file.docstring = docs.toString().trim(); }

        return super.visitClass(tree, p);
    }

    @Override
    public Void visitVariable(VariableTree node, Void unused) {
        file.attributes.add(SourceAttribute.from(node, doctree()));
        return super.visitVariable(node, unused);
    }

    @Override
    public Void visitMethod(MethodTree node, Void unused) {
        final var method = SourceMethod.from(node, doctree());
        if (method.name.equals("<init>")) { method.name = file.name; }

        file.methods.add(method);
        return super.visitMethod(node, unused);
    }

    private DocCommentTree doctree() {
        return docTrees.getDocCommentTree(getCurrentPath());
    }
}
