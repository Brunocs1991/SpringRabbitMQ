package br.com.github.springconsumer.amqp.implementation;

import br.com.github.springconsumer.amqp.AmqpConsumer;
import br.com.github.springconsumer.dto.Message;
import br.com.github.springconsumer.service.ConsumerService;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqConsumer implements AmqpConsumer<Message> {

    @Autowired
    ConsumerService consumerService;
    @Override
    @RabbitListener(queues = "${spring.rabbitmq.request.routing-key.producer}")
    public void consumer(Message message) {
        try {
            consumerService.action(message);
        }catch (Exception ex){
            throw  new AmqpRejectAndDontRequeueException(ex);
        }

    }
}
