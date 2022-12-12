package ru.max.service;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public interface AnsverConsumer {
    void consume(SendMessage sendMessage);
}
