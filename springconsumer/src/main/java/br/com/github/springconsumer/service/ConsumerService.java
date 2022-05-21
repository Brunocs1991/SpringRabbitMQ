package br.com.github.springconsumer.service;

import br.com.github.springconsumer.dto.Message;

public interface ConsumerService {
    public void action(Message message) throws Exception;
}
