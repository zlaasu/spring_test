package org.zlasu.app;

import org.zlasu.beans.MessageService;

public class SmsService implements MessageService {

    @Override
    public void send() {
        System.out.println("Sending SMS");
    }

    @Override
    public void send(String message) {
        System.out.println("SmsService: send(String message): " + message);
    }
}
