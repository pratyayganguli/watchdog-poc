package com.cne.watchdog.poc.server;


import java.nio.file.Path;

/**
 * created on: 02 25 2024
 * 3:20 pm
 */

public class WatchDogThread extends Thread{
    private static final String DEFAULT_PATH = "/home/pratyay/Desktop/workspace/java-workspace/watchdog-poc/src/main/resources/local";
    @Override
    public void run(){
        WatchDogService watchDogService = new WatchDogService(Path.of(DEFAULT_PATH));
        watchDogService.watch();
    }
}
