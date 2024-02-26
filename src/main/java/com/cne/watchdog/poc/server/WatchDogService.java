package com.cne.watchdog.poc.server;

import java.nio.file.*;
import java.util.logging.Logger;

/**
 * created on: 02 25 2024
 * 4:42 pm
 */

public class WatchDogService {
    private final Path directory;
    private static final Logger LOGGER = Logger.getLogger(WatchDogService.class.getName());
    public WatchDogService(Path directory) {
        this.directory = directory;
    }
    public void watch(){
        try {
            WatchService watchService = FileSystems.getDefault().newWatchService();;
            directory.register(watchService,
                    StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_DELETE,
                    StandardWatchEventKinds.ENTRY_MODIFY);
            LOGGER.info("watching " + directory);
            while(true) {
                WatchKey key = watchService.take();
                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();
                    WatchEvent<Path> ev = (WatchEvent<Path>) event;
                    Path fileName = ev.context();
                    LOGGER.info(kind.name() + ": " + fileName);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("cannot watch directory, failure: ".concat(e.getMessage()));
        }
    }
}
