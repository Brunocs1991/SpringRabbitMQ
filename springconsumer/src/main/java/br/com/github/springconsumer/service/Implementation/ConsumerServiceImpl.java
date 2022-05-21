package br.com.github.springconsumer.service.Implementation;

import br.com.github.springconsumer.dto.Message;
import br.com.github.springconsumer.service.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public void action(Message message) throws Exception{
     throw new Exception("Erro");
//        System.out.println(message.getText());
    }
}
