package br.fosge.commons.filesystem;

import br.fosge.commons.Logger;
import br.fosge.commons.Meta;
import br.fosge.commons.event.ApplicationStoppedEvent;
import br.fosge.commons.message.MessageListener;
import br.fosge.commons.message.MessagePipeline;

import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

import static java.nio.file.StandardWatchEventKinds.*;

public final class Watcher implements Runnable {
    private boolean running = true;

    private static WatchService service;
    private static final Map<WatchKey, Path> ofPath = new ConcurrentHashMap<>();
    private static final Map<Path, WatchKey> ofWatchers = new ConcurrentHashMap<>();
    private static final Map<Path, WatchAction> ofActions = new ConcurrentHashMap<>();

    static {
        try {
            service = FileSystems.getDefault().newWatchService();
        } catch (Throwable throwable) {
            service = null;
            Logger.error("Failed to start FSWatcher: %s", throwable);
        }
    }

    @MessageListener
    public MessagePipeline handle(ApplicationStoppedEvent event) {
        running = false;
        return MessagePipeline.AVAILABLE;
    }

    @Override
    public void run() {
        if (service == null) return;

        try {
            while (running) {
                final var watcher = service.poll(100, TimeUnit.MILLISECONDS);
                if (watcher == null) continue;

                if (!ofPath.containsKey(watcher)) {
                    Logger.warn("Watcher not recognized: %s", watcher);
                    continue;
                }

                final var path = ofPath.get(watcher);
                for (final var event : watcher.pollEvents()) {
                    if (event.kind() == OVERFLOW || event.count() > 1) continue;
                    final var target = Meta.cast(event.context(), Path.class);
                    final var absolute = path.resolve(target);

                    if (event.kind() == ENTRY_CREATE) {
                        Logger.trace("ENTRY_CREATE: %s", absolute);
                        ofActions.get(path).onCreate(absolute);
                        continue;
                    }

                    if (event.kind() == ENTRY_MODIFY) {
                        Logger.trace("ENTRY_MODIFY: %s", absolute);
                        ofActions.get(path).onModify(absolute);
                        continue;
                    }

                    Logger.trace("ENTRY_DELETE: %s", absolute);
                    ofActions.get(path).onDelete(absolute);
                }

                if (watcher.isValid() && !watcher.reset()) {
                    Logger.debug("Removing watcher %s", path);
                    watcher.cancel();
                    ofPath.remove(watcher);
                    ofWatchers.remove(path);
                    ofActions.remove(path);
                }
            }
        } catch (Throwable throwable) {
            Logger.error("What?? %s", throwable);

        } finally {
            Logger.debug("Releasing resources");
            ofPath.clear();
            ofActions.clear();
            ofWatchers.values().forEach(WatchKey::cancel);
            ofWatchers.clear();
        }

        Logger.debug("Done");
    }

    public static void watchTree(final Path path, final WatchAction action) {
        try {
            java.nio.file.Files.walkFileTree(path, new SimpleFileVisitor<>() {
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

    public static void watchSingle(final Path path, final WatchAction action) {
        try {
            final var watcher = path.register(Watcher.service, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);

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
            java.nio.file.Files.walkFileTree(path, new SimpleFileVisitor<>() {
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
