package br.com.github.springproducer.service.Implementation;

import br.com.github.springproducer.amqp.AmqpProducer;
import br.com.github.springproducer.dto.Message;
import br.com.github.springproducer.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService implements AmqpService {

    @Autowired
    private AmqpProducer<Message> amqp;

    @Override
    public void sentToConsumer(Message message) {
        amqp.producer(message);
    }
}
