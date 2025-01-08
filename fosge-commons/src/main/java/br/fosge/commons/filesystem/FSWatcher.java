package br.fosge.commons.filesystem;

import br.fosge.commons.Logger;
import br.fosge.commons.RT;
import br.fosge.commons.tools.Meta;

import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

import static java.nio.file.StandardWatchEventKinds.*;

public final class FSWatcher implements Runnable {
    private static WatchService service;
    private static final Map<WatchKey, Path> ofPath = new ConcurrentHashMap<>();
    private static final Map<Path, WatchKey> ofWatchers = new ConcurrentHashMap<>();
    private static final Map<Path, WatchDogAction> ofActions = new ConcurrentHashMap<>();

    static {
        try {
            service = FileSystems.getDefault().newWatchService();
        } catch (Throwable throwable) {
            service = null;
            Logger.error("Failed to start FSWatcher: %s", throwable);
        }
    }

    @Override
    public void run() {
        if (service == null) return;
        final var thread = Thread.currentThread();
        thread.setName("FOSGE::FSWatcher");

        while (RT.running) {
            final WatchKey watcher;

            try {
                watcher = service.poll(100, TimeUnit.MILLISECONDS);
                if (watcher == null) continue;
                if (!ofPath.containsKey(watcher)) {
                    Logger.warn("Watcher not recognized: %s", watcher);
                    continue;
                }

                final var path = ofPath.get(watcher);
                for (final var event : watcher.pollEvents()) {
                    final var target = Meta.cast(event.context(), Path.class);
                    final var absolute = path.resolve(target);
                    ofActions.get(path).run(event, absolute);

                    if (event.kind() == ENTRY_DELETE) {
                        watcher.cancel();
                        ofPath.remove(watcher);
                        ofWatchers.remove(path);
                        ofActions.remove(path);
                    }
                }

                if (watcher.isValid() && !watcher.reset()) {
                    Logger.warn("Watcher %s reset failed", path);
                    watcher.cancel();
                    ofPath.remove(watcher);
                    ofWatchers.remove(path);
                    ofActions.remove(path);
                }

            } catch (InterruptedException _) {}
        }

        ofPath.clear();
        ofActions.clear();
        ofWatchers.values().forEach(WatchKey::cancel);
        ofWatchers.clear();
    }

    public static void watchTree(final Path path, final WatchDogAction action) {
        try {
            Files.walkFileTree(path, new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes attrs) {
                    watchSingle(path, action);
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (Throwable throwable) {
            Logger.error("Failed to watch path: %s", throwable);
        }
    }

    public static void watchSingle(final Path path, final WatchDogAction action) {
        try {
            final var watcher = path.register(FSWatcher.service, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);

            if (ofWatchers.containsKey(path)) {
                Logger.debug("update: %s", path);
            } else {
                Logger.debug("register: %s", path);
            }

            ofWatchers.put(path, watcher);
            ofPath.put(watcher, path);
            ofActions.put(path, action);
        } catch (Throwable throwable) {
            Logger.error("Failed to watch path: %s", throwable);
        }
    }

    public static void unwatchTree(final Path path) {
        try {
            Files.walkFileTree(path, new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                    unwatchSingle(dir);
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (Throwable throwable) {
            Logger.error("Failed to watch path: %s", throwable);
        }
    }

    public static void unwatchSingle(final Path path) {
        final var watcher = ofWatchers.getOrDefault(path, null);
        if (watcher == null) return;

        Logger.debug("Cancelling: %s", path);
        watcher.cancel();
        ofPath.remove(watcher);
        ofActions.remove(path);
        ofWatchers.remove(path);
    }
}
