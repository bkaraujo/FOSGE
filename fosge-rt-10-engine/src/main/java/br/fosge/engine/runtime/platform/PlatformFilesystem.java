package br.fosge.engine.runtime.platform;

import br.fosge.commons.filesystem.Directories;

import java.nio.file.Path;

public final class PlatformFilesystem {
    public final Path assets = Directories.rootfs().resolve("assets");
}
