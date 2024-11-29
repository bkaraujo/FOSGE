package br.fosge.engine.runtime.platform.binding.generator;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public final class BindingGenerator {
    private static final Path rootfs = Path.of(System.getProperty("user.dir"));

    public static void main(String ... args) throws Throwable {
//        generate("openal", new String[]{"ALC_", "AL_"}, new String[]{"al"});
//        generate("opengl", new String[]{"GL_"}, new String[]{"gl"});
        generate("stb", new String[]{"STBI_", "STBIR_", "STBIW_", "VORBIS_"}, new String[]{"stb"});
    }

    private static void generate(String folder, String[] attrPrefixSkip, String[] methodPrefixSkip) throws Exception {
        final var files = Files.list(rootfs.resolve("api", folder.toLowerCase()));
        final var bindfs = rootfs.resolve("fosge-engine/src/main/java/br/fosge/runtime/platform/binding/", folder.toLowerCase());

        try {
            for (final var path : files.toList()) {
                final var file = SourceFile.fromFile(path);
                if (file == null) continue;

                for (final var fileName : new String[] {file.name, file.name + "Impl"}) {
                    final var writer = Files.newBufferedWriter(
                            bindfs.resolve(fileName + ".java"),
                            StandardCharsets.UTF_8,
                            StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING
                    );

                    try {
                        final var source = generate(
                                file,
                                fileName.endsWith("Impl"),
                                folder,
                                methodPrefixSkip,
                                attrPrefixSkip
                        );

                        writer.write(source);
                    } finally {
                        writer.close();
                    }
                }
            }
        } finally {
            files.close();
        }
    }

    private static String generate(SourceFile file, boolean withImpl, String folder, String[] methPrefixSkip, String[] attrPrefixSkip) {
        final var builder = new StringBuilder();

        builder.append("package br.fosge.runtime.platform.binding.").append(folder.toLowerCase()).append(";\n\n");

        builder
                .append("import java.nio.*;\n")
                .append("import org.lwjgl.*;\n")
                .append("import org.lwjgl.system.*;\n")
                .append("import org.lwjgl.glfw.*;\n")
                .append("import org.lwjgl.*;\n\n")
                .append("import org.lwjgl.stb.*;\n\n")
                .append("import org.lwjgl.openal.*;\n\n");

        if (withImpl) {
            builder.append("public class ").append(file.name).append("Impl")
                    .append(" implements ").append(file.name)
                    .append(" {\n\n");
        } else {
            builder.append("public interface ").append(file.name).append(" {\n\n");

            file
                    .attributes
                    .forEach(attribute -> {
                        final var string = generateAttribute(attribute, attrPrefixSkip);
                        if (string != null) { builder.append(string); }
                    });
        }

        for (final var method : file.methods) {
            if (method.name.equals(file.name)) continue;
            final var string = generateMethod(file.name, method, withImpl, methPrefixSkip);
            if (string != null) { builder.append(string); }
        }

        builder.append("}\n");



        return builder.toString();
    }

    private static String generateAttribute(SourceAttribute attribute, String[] attrPrefixSkip) {
        boolean found = false;
        for (final var attrName : attrPrefixSkip) {
            if (attribute.name.startsWith(attrName)) {
                found = true;
                break;
            }
        }

        if (!found) return null;

        final var builder = new StringBuilder();
        if (attribute.docstring != null) {
            builder
                    .append("    ").append("/** ")
                    .append(attribute.docstring.replace("\n", ""))
                    .append("*/\n");
        }

        builder
                .append("    ")
                .append(attribute.type)
                .append(" ")
                .append(attribute.name);

        if (attribute.defaultValue != null) {
            builder
                    .append(" = ")
                    .append(attribute.defaultValue);
        }

        builder.append(";\n\n");
        return builder.toString();
    }

    private static String generateMethod(String fileName, SourceMethod method, boolean impl, String[] methPrefixSkip) {
        boolean found = false;
        for (final var attrName : methPrefixSkip) {
            if (method.name.startsWith(attrName)) {
                found = true;
                break;
            }
        }

        if (!found) return null;

        final var builder = new StringBuilder();

        if (!impl) {
            if (method.docstring != null) {
                builder.append("    ");
                builder.append("/** ");
                builder.append(method.docstring.replace("\n", ""));
                builder.append("*/\n");
            }
        }

        if (impl) {
            builder.append("    public final ");
        } else {
            builder.append("    ");
        }

        if (method.returnType != null) {
            builder.append(method.returnType);
            builder.append(" ");
        }

        builder.append(method.name);
        builder.append("(");
        builder.append(getArgs(method, true));
        builder.append(")");

        if (impl) {
            builder.append(" {\n");
            builder.append("        ");

            if (!method.returnType.equals("void")) {
                builder.append("return ");
            }

            builder.append("org.lwjgl.");
            if (method.name.startsWith("al")) { builder.append("openal."); }
            if (method.name.startsWith("gl")) { builder.append("opengl."); }
            if (method.name.startsWith("stb")) { builder.append("stb."); }
            builder.append(fileName);
            builder.append(".");
            builder.append(method.name);
            builder.append("(");
            builder.append(getArgs(method, false));
            builder.append(");");

            builder.append("\n    }\n\n");
        } else {
            builder.append(";\n\n");
        }

        return builder.toString();
    }

    private static String getArgs(SourceMethod method, boolean withType) {
        final var builder = new StringBuilder();
        if (!method.parameters.isEmpty()) {
            if (method.parameters.size() > 1) {
                for (int i = 0; i < method.parameters.size() - 1; i++) {
                    final var parameter = method.parameters.get(i);
                    if (withType) { builder.append(parameter.type); builder.append(" "); }
                    builder.append(parameter.name);
                    builder.append(", ");
                }

                final var parameter = method.parameters.getLast();
                if (withType) { builder.append(parameter.type); builder.append(" "); }
                builder.append(parameter.name);
            } else {
                final var parameter = method.parameters.getFirst();
                if (withType) { builder.append(parameter.type); builder.append(" "); }
                builder.append(parameter.name);
            }
        }

        return builder.toString();
    }

}
