package com.cne.watchdog.poc.ws.client;


import javax.websocket.*;
import java.net.URI;
import java.util.logging.Logger;

/**
 * created on: 02 25 2024
 * 6:49 pm
 */

@ClientEndpoint
public class WSClient {
    private static final Logger LOGGER = Logger.getLogger(WSClient.class.getName());
    @OnOpen
    public void onOpen(Session session) {
        LOGGER.info("connected to server");
    }

    @OnMessage
    public void onMessage(String message, Session session) {
        LOGGER.info(message);
    }

    @OnClose
    public void onClose(Session session, CloseReason closeReason) {
        LOGGER.info("connection closed: " + closeReason.getReasonPhrase());
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        LOGGER.warning("error on ws client: " + throwable.getMessage());
    }

    public static void main(String[] args) throws Exception {
        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        Session session = container.connectToServer(WSClient.class, new URI("ws://localhost:8080/watchdog"));
        session.getBasicRemote().sendText("client listening");
    }
}

