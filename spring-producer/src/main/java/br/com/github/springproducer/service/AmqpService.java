package br.com.github.springproducer.service;

import br.com.github.springproducer.dto.Message;

public interface AmqpService {
    void sentToConsumer(Message message);
}
