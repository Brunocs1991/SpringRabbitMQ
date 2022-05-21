package br.com.github.springconsumer.amqp;

public interface AmqpConsumer<T> {
    public void consumer(T t);
}
