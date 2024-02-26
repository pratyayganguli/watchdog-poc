package com.cne.watchdog.poc;

import com.cne.watchdog.poc.server.WatchDogServer;
import com.cne.watchdog.poc.ws.client.WSClient;
import com.cne.watchdog.poc.ws.server.WSServer;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.websocket.server.WebSocketHandler;
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory;

/**
 * created on: 02 24 2024
 * 11:17 am
 */

public class Main {
    public static void main(String[] args) {
        try {
            WatchDogServer watchDogServer = new WatchDogServer();
            watchDogServer.start();
            Server server = new Server(8080);
            WebSocketHandler webSocketHandler = new WebSocketHandler() {
                @Override
                public void configure(WebSocketServletFactory factory) {
                    factory.register(WSServer.class);
                }
            };

            server.setHandler(webSocketHandler);
            server.start();
            server.join();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
