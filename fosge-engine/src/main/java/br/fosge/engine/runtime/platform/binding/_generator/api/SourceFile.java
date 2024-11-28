package br.fosge.engine.runtime.platform.binding._generator.api;

import br.fosge.engine.runtime.platform.binding._generator.ast.SourceScanner;
import com.sun.source.util.DocTrees;
import com.sun.source.util.JavacTask;
import com.sun.source.util.TaskEvent;
import com.sun.source.util.TaskListener;

import javax.tools.ToolProvider;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class SourceFile {
    public Path path;
    public String name;
    public SourcePackage packageDeclaration;
    public final List<String> imports = new ArrayList<>();

    public String docstring;
    public String modifiers;
    public String extendsClause;
    public String implementsClause;

    public final List<SourceAttribute> attributes = new ArrayList<>();
    public final List<SourceMethod> methods = new ArrayList<>();

    private SourceFile() {}

    public static SourceFile fromFile(final Path path) {
        final var compiler = ToolProvider.getSystemJavaCompiler();
        try (final var manager = compiler.getStandardFileManager(null, Locale.getDefault(), StandardCharsets.UTF_8)) {
            final var files = manager.getJavaFileObjects(path);
            final var task = (JavacTask) compiler.getTask(null, manager, null, List.of(), null, files);

            final var docs = DocTrees.instance(task);
            final var file = new SourceFile();
            file.path = path;
            file.name = path.toFile().getName();
            file.name = file.name.substring(0, file.name.lastIndexOf('.'));

            final var scanner = new SourceScanner(docs, file);
            task.addTaskListener(new TaskListener() {
                @Override
                public void finished(TaskEvent event) {
                    if (event.getKind() != TaskEvent.Kind.PARSE) return;
                    scanner.scan(event.getCompilationUnit(), null);
                    TaskListener.super.finished(event);
                }
            });

            task.parse();

            return file;
        } catch (Throwable throwable) {
            return null;
        }
    }
}
