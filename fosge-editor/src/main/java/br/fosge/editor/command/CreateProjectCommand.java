package br.fosge.editor.command;

import br.fosge.Logger;
import br.fosge.Triplet;
import org.eclipse.jgit.api.Git;

import java.nio.file.Path;
import java.util.List;

public final class CreateProjectCommand extends AbstractCommand {

    @Override
    public boolean execute(List<Triplet<?>> parameters) {
        final var name = get("name", String.class, parameters);
        final var path = get("path", String.class, parameters);
        if (name == null || path == null) return false;

        final var absolute = Path.of(path).resolve(name);
        if (absolute.toFile().exists()) { Logger.error("Directory '%s' already exists", absolute); return false; }
        if (!absolute.toFile().mkdirs()) { Logger.error("Directory '%s' could not be created", absolute); }

        final var gitCommand = Git.init();
        try {
            gitCommand.setDirectory(absolute.toFile());
            gitCommand.call();

            if (!absolute.resolve(".gitignore").toFile().createNewFile()) {
                Logger.warn("Failed to create '%s' file", absolute);
            }
        } catch (Throwable throwable) {
            Logger.error("Failed to initialize git: %s", throwable);
        }

        return true;
    }

}
