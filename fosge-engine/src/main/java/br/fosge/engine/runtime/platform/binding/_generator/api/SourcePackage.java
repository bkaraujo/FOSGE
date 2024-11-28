package br.fosge.engine.runtime.platform.binding._generator.api;

import com.sun.source.doctree.DocCommentTree;
import com.sun.source.tree.PackageTree;

public final class SourcePackage {
    public String docstring;
    public String name;

    private SourcePackage() {}

    public static SourcePackage from(PackageTree srcTree, DocCommentTree docTree) {
        final var instance = new SourcePackage();
        instance.name = srcTree.getPackageName().toString().trim();
        if (docTree != null ) { instance.docstring = docTree.toString().trim(); }

        return instance;
    }
}
