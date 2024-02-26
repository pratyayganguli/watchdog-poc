package com.cne.watchdog.poc.server;

import java.util.logging.Logger;

/**
 * created on: 02 25 2024
 * 3:18 pm
 */

public class WatchDogServer {
    private static final Logger LOGGER = Logger.getLogger(WatchDogServer.class.getName());
    public void start() {
        try {
            WatchDogThread watchDogThread = new WatchDogThread();
            watchDogThread.start();
            LOGGER.info("watch dog server started");
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
