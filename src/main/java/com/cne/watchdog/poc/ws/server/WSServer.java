package com.cne.watchdog.poc.ws.server;

import org.eclipse.jetty.server.session.Session;
import org.eclipse.jetty.websocket.api.annotations.*;


import java.util.logging.Logger;

/**
 * created on: 02 25 2024
 * 6:49 pm
 */


@WebSocket
public class WSServer {
    private static final Logger LOGGER = Logger.getLogger(WSServer.class.getName());

    @OnWebSocketConnect
    public void onOpen(Session session){
        LOGGER.info("connected to the server");
    }

    @OnWebSocketMessage
    public void onMessage(String message, Session session){
        try {
            LOGGER.info(message);
        }
        catch (Exception e){
            throw new RuntimeException("could not send message");
        }
    }

    @OnWebSocketClose
    public void onClose(Session session){
        LOGGER.warning("disconnected from  the server");
    }

    @OnWebSocketFrame
    public void onError(Session session, Throwable throwable){
        LOGGER.warning("error from ws server, failure: ".concat(throwable.getMessage()));
    }
}
