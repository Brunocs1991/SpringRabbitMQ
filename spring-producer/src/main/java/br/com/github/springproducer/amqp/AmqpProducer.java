package br.com.github.springproducer.amqp;

public interface AmqpProducer<T>{
    void producer(T t);
}
