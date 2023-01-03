package com.example.springbootrabbitmq.service;

import com.example.springbootrabbitmq.dto.request.OrderRequest;
import com.example.springbootrabbitmq.rabbitMqConfig.RabbitConfig;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final RabbitTemplate rabbitTemplate;

    public void publishMessage(OrderRequest orderRequest){
        rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE_NAME,RabbitConfig.BINDING_KEY,orderRequest);
    }


}
