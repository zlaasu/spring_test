package org.zlasu.app;

import org.zlasu.beans.MessageService;

public class EmailService implements MessageService {

    @Override
    public void send() {
        System.out.println("Sending EMAIL");
    }

    @Override
    public void send(String message) {
        System.out.println("EmailService: send(String message): " + message);
    }
}
